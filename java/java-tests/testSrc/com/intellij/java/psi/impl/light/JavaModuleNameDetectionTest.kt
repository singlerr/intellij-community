// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.java.psi.impl.light

import com.intellij.psi.impl.light.LightJavaModule
import org.junit.Test
import kotlin.test.assertEquals

class JavaModuleNameDetectionTest {
  @Test fun plain() = doTest("foo", "foo")
  @Test fun versioned() = doTest("foo-1.2.3-SNAPSHOT", "foo")
  @Test fun trailing() = doTest("foo2bar3", "foo2bar3")
  @Test fun replacing() = doTest("foo_bar", "foo.bar")
  @Test fun collapsing() = doTest("foo...bar", "foo.bar")
  @Test fun trimming() = doTest("...foo.bar...", "foo.bar")
  @Test fun invalid() = doTest("lib_invalid_1_2", "lib.invalid.1.2")
  @Test fun withKeywords() = doTest("lib.for.ide", "lib.for.ide")

  private fun doTest(original: String, expected: String) = assertEquals(expected, LightJavaModule.moduleName(original))
}