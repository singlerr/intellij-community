/*
 * Copyright 2000-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.codeInsight.daemon.impl.analysis;

import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiReference;
import com.intellij.psi.xml.XmlFile;
import com.intellij.xml.util.AnchorReference;
import com.intellij.xml.util.HtmlUtil;
import org.jetbrains.annotations.NotNull;

public class HtmlUnknownTargetInspection extends XmlPathReferenceInspection {
  @NotNull
  @Override
  public String getShortName() {
    return "HtmlUnknownTarget";
  }

  @Override
  protected boolean isForHtml() {
    return true;
  }

  @Override
  protected boolean needToCheckRef(PsiReference reference) {
    return super.needToCheckRef(reference) && !(reference instanceof AnchorReference) && notRemoteBase(reference);
  }

  static boolean notRemoteBase(PsiReference reference) {
    final PsiFile file = reference.getElement().getContainingFile();
    final String basePath = file instanceof XmlFile ? HtmlUtil.getHrefBase((XmlFile)file) : null;
    return basePath == null || !HtmlUtil.hasHtmlPrefix(basePath);
  }
}
