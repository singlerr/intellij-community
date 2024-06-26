// Copyright 2000-2021 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.codeInspection.ex;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public interface InspectListener {
  default void inspectionFinished(long duration, long threadId, int problemsCount, InspectionToolWrapper<?, ?> tool, InspectionKind kind,
                                  @Nullable PsiFile file, Project project) {}

  default void activityFinished(long duration, long threadId, String activityKind, Project project) {}

  default void fileAnalyzed(PsiFile file, Project project) {}

  default void inspectionFailed(String toolId, Throwable throwable, @Nullable PsiFile file, Project project) { }

  enum InspectionKind {
    LOCAL,
    LOCAL_PRIORITY,
    GLOBAL_SIMPLE,
    GLOBAL
  }

}
