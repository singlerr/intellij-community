// Copyright 2000-2021 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.ide.projectWizard.generators

import com.intellij.icons.AllIcons
import com.intellij.ide.JavaUiBundle
import com.intellij.ide.projectWizard.NewProjectWizardCollector.BuildSystem.logBuildSystemChanged
import com.intellij.ide.projectWizard.NewProjectWizardCollector.BuildSystem.logBuildSystemFinished
import com.intellij.ide.projectWizard.NewProjectWizardConstants.Language.JAVA
import com.intellij.ide.wizard.*
import com.intellij.ide.wizard.LanguageNewProjectWizardData.Companion.languageData
import com.intellij.ide.wizard.language.LanguageGeneratorNewProjectWizard
import com.intellij.openapi.project.Project
import com.intellij.ui.dsl.builder.Row
import com.intellij.ui.dsl.builder.SegmentedButton

class JavaNewProjectWizard : LanguageGeneratorNewProjectWizard {

  override val name = JAVA

  override val icon = AllIcons.FileTypes.Java

  override val ordinal = 0

  override fun createStep(parent: NewProjectWizardStep) = Step(parent)

  class Step(parent: NewProjectWizardStep) :
    AbstractNewProjectWizardMultiStep<Step, BuildSystemJavaNewProjectWizard>(parent, BuildSystemJavaNewProjectWizard.EP_NAME),
    LanguageNewProjectWizardData by parent.languageData!!,
    BuildSystemJavaNewProjectWizardData {

    override val self = this

    override val label = JavaUiBundle.message("label.project.wizard.new.project.build.system")

    override val buildSystemProperty by ::stepProperty
    override var buildSystem by ::step

    override fun createAndSetupSwitcher(builder: Row): SegmentedButton<String> {
      return super.createAndSetupSwitcher(builder)
        .whenItemSelectedFromUi { logBuildSystemChanged() }
    }

    override fun setupProject(project: Project) {
      super.setupProject(project)

      logBuildSystemFinished()
    }

    init {
      data.putUserData(BuildSystemJavaNewProjectWizardData.KEY, this)
    }
  }
}
