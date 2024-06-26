// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.jetbrains.python.refactoring.classes.membersManager.vp;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.command.CommandProcessor;
import com.intellij.openapi.util.NlsContexts.Command;
import com.intellij.refactoring.classMembers.MemberInfoModel;
import com.jetbrains.python.psi.PyClass;
import com.jetbrains.python.psi.PyElement;
import com.jetbrains.python.refactoring.classes.PyMemberInfoStorage;
import com.jetbrains.python.refactoring.classes.membersManager.PyMemberInfo;
import org.jetbrains.annotations.NotNull;

/**
 * Presenter that has not preview. Children should implement {@link #refactorNoPreview()}.
 * To "preview" button would be displayed
 *
 * @param <T> view for this presenter
 * @param <M> Type of model
 * @author Ilya.Kazakevich
 */

public abstract class MembersBasedPresenterNoPreviewImpl<T extends MembersBasedView<?>,
  M extends MemberInfoModel<PyElement, PyMemberInfo<PyElement>>> extends MembersBasedPresenterImpl<T, M> {
  /**
   * @param view                  view for this presenter
   * @param classUnderRefactoring class to refactor
   * @param infoStorage           info storage
   * @param model                 Member model (to be used for dependencies checking)
   */
  protected MembersBasedPresenterNoPreviewImpl(final @NotNull T view,
                                               final @NotNull PyClass classUnderRefactoring,
                                               final @NotNull PyMemberInfoStorage infoStorage,
                                               final @NotNull M model) {
    super(view, classUnderRefactoring, infoStorage, model);
  }

  @Override
  public boolean showPreview() {
    return false;
  }

  @Override
  void doRefactor() {
    CommandProcessor.getInstance().executeCommand(myClassUnderRefactoring.getProject(),
                                                  () -> ApplicationManager.getApplication().runWriteAction(new MyRunnableRefactoring()), getCommandName(), null);
    myView.close();
  }

  /**
   * @return Command name for this preview
   */
  protected abstract @NotNull @Command String getCommandName();

  /**
   * Do refactor with out of preview. Implement this method to do refactoring.
   */
  protected abstract void refactorNoPreview();

  private class MyRunnableRefactoring implements Runnable {
    @Override
    public void run() {
      refactorNoPreview();
    }
  }
}
