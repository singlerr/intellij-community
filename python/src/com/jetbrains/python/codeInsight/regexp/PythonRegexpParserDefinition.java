// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.jetbrains.python.codeInsight.regexp;

import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import org.intellij.lang.regexp.RegExpCapability;
import org.intellij.lang.regexp.RegExpLexer;
import org.intellij.lang.regexp.RegExpParser;
import org.intellij.lang.regexp.RegExpParserDefinition;
import org.jetbrains.annotations.NotNull;

import java.util.EnumSet;

import static org.intellij.lang.regexp.RegExpCapability.*;


public class PythonRegexpParserDefinition extends RegExpParserDefinition {
  public static final IFileElementType PYTHON_REGEXP_FILE = new IFileElementType("PYTHON_REGEXP_FILE", PythonRegexpLanguage.INSTANCE);
  protected final EnumSet<RegExpCapability> CAPABILITIES = EnumSet.of(DANGLING_METACHARACTERS,
                                                                      OCTAL_NO_LEADING_ZERO,
                                                                      OMIT_NUMBERS_IN_QUANTIFIERS,
                                                                      OMIT_BOTH_NUMBERS_IN_QUANTIFIERS,
                                                                      MIN_OCTAL_3_DIGITS);
  @Override
  public @NotNull Lexer createLexer(Project project) {
    return new RegExpLexer(CAPABILITIES);
  }

  @Override
  public @NotNull PsiParser createParser(Project project) {
    return new RegExpParser(CAPABILITIES);
  }

  @Override
  public @NotNull IFileElementType getFileNodeType() {
    return PYTHON_REGEXP_FILE;
  }

  @Override
  public @NotNull PsiFile createFile(@NotNull FileViewProvider viewProvider) {
    return new DjangoRegexpFile(viewProvider);
  }
}
