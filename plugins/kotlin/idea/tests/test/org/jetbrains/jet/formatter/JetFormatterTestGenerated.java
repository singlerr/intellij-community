/*
 * Copyright 2010-2014 JetBrains s.r.o.
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

package org.jetbrains.jet.formatter;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.formatter.AbstractJetFormatterTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@InnerTestClasses({JetFormatterTestGenerated.Formatter.class, JetFormatterTestGenerated.FormatterInverted.class})
public class JetFormatterTestGenerated extends AbstractJetFormatterTest {
    @TestMetadata("idea/testData/formatter")
    @InnerTestClasses({Formatter.ModifierList.class})
    public static class Formatter extends AbstractJetFormatterTest {
        public void testAllFilesPresentInFormatter() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/formatter"), Pattern.compile("^([^\\.]+)\\.after\\.kt.*$"), true);
        }
        
        @TestMetadata("ArrayAccess.after.kt")
        public void testArrayAccess() throws Exception {
            doTest("idea/testData/formatter/ArrayAccess.after.kt");
        }
        
        @TestMetadata("BinaryExpressions.after.kt")
        public void testBinaryExpressions() throws Exception {
            doTest("idea/testData/formatter/BinaryExpressions.after.kt");
        }
        
        @TestMetadata("BinaryExpressionsBoolean.after.kt")
        public void testBinaryExpressionsBoolean() throws Exception {
            doTest("idea/testData/formatter/BinaryExpressionsBoolean.after.kt");
        }
        
        @TestMetadata("BlockFor.after.kt")
        public void testBlockFor() throws Exception {
            doTest("idea/testData/formatter/BlockFor.after.kt");
        }
        
        @TestMetadata("CatchFinallyOnNewLine.after.kt")
        public void testCatchFinallyOnNewLine() throws Exception {
            doTest("idea/testData/formatter/CatchFinallyOnNewLine.after.kt");
        }
        
        @TestMetadata("Class.after.kt")
        public void testClass() throws Exception {
            doTest("idea/testData/formatter/Class.after.kt");
        }
        
        @TestMetadata("ClassLineBreak.after.kt")
        public void testClassLineBreak() throws Exception {
            doTest("idea/testData/formatter/ClassLineBreak.after.kt");
        }
        
        @TestMetadata("ColonSpaces.after.kt")
        public void testColonSpaces() throws Exception {
            doTest("idea/testData/formatter/ColonSpaces.after.kt");
        }
        
        @TestMetadata("CommentInFunctionLiteral.after.kt")
        public void testCommentInFunctionLiteral() throws Exception {
            doTest("idea/testData/formatter/CommentInFunctionLiteral.after.kt");
        }
        
        @TestMetadata("ConsecutiveCalls.after.kt")
        public void testConsecutiveCalls() throws Exception {
            doTest("idea/testData/formatter/ConsecutiveCalls.after.kt");
        }
        
        @TestMetadata("ConsecutiveSafeCallsIndent.after.kt")
        public void testConsecutiveSafeCallsIndent() throws Exception {
            doTest("idea/testData/formatter/ConsecutiveSafeCallsIndent.after.kt");
        }
        
        @TestMetadata("DelegationList.after.kt")
        public void testDelegationList() throws Exception {
            doTest("idea/testData/formatter/DelegationList.after.kt");
        }
        
        @TestMetadata("DoWhileLineBreak.after.kt")
        public void testDoWhileLineBreak() throws Exception {
            doTest("idea/testData/formatter/DoWhileLineBreak.after.kt");
        }
        
        @TestMetadata("DoWhileSpacing.after.kt")
        public void testDoWhileSpacing() throws Exception {
            doTest("idea/testData/formatter/DoWhileSpacing.after.kt");
        }
        
        @TestMetadata("ElseOnNewLine.after.kt")
        public void testElseOnNewLine() throws Exception {
            doTest("idea/testData/formatter/ElseOnNewLine.after.kt");
        }
        
        @TestMetadata("Elvis.after.kt")
        public void testElvis() throws Exception {
            doTest("idea/testData/formatter/Elvis.after.kt");
        }
        
        @TestMetadata("EmptyLineAfterPackage.after.kt")
        public void testEmptyLineAfterPackage() throws Exception {
            doTest("idea/testData/formatter/EmptyLineAfterPackage.after.kt");
        }
        
        @TestMetadata("ForLineBreak.after.kt")
        public void testForLineBreak() throws Exception {
            doTest("idea/testData/formatter/ForLineBreak.after.kt");
        }
        
        @TestMetadata("ForNoBraces.after.kt")
        public void testForNoBraces() throws Exception {
            doTest("idea/testData/formatter/ForNoBraces.after.kt");
        }
        
        @TestMetadata("ForSpacing.after.kt")
        public void testForSpacing() throws Exception {
            doTest("idea/testData/formatter/ForSpacing.after.kt");
        }
        
        @TestMetadata("FunctionCallParametersAlign.after.kt")
        public void testFunctionCallParametersAlign() throws Exception {
            doTest("idea/testData/formatter/FunctionCallParametersAlign.after.kt");
        }
        
        @TestMetadata("FunctionDefParametersAlign.after.kt")
        public void testFunctionDefParametersAlign() throws Exception {
            doTest("idea/testData/formatter/FunctionDefParametersAlign.after.kt");
        }
        
        @TestMetadata("FunctionLineBreak.after.kt")
        public void testFunctionLineBreak() throws Exception {
            doTest("idea/testData/formatter/FunctionLineBreak.after.kt");
        }
        
        @TestMetadata("FunctionLiteralsInChainCalls.after.kt")
        public void testFunctionLiteralsInChainCalls() throws Exception {
            doTest("idea/testData/formatter/FunctionLiteralsInChainCalls.after.kt");
        }
        
        @TestMetadata("FunctionWithInference.after.kt")
        public void testFunctionWithInference() throws Exception {
            doTest("idea/testData/formatter/FunctionWithInference.after.kt");
        }
        
        @TestMetadata("FunctionalType.after.kt")
        public void testFunctionalType() throws Exception {
            doTest("idea/testData/formatter/FunctionalType.after.kt");
        }
        
        @TestMetadata("GetterAndSetter.after.kt")
        public void testGetterAndSetter() throws Exception {
            doTest("idea/testData/formatter/GetterAndSetter.after.kt");
        }
        
        @TestMetadata("If.after.kt")
        public void testIf() throws Exception {
            doTest("idea/testData/formatter/If.after.kt");
        }
        
        @TestMetadata("IfElseRemoveLineBreak.after.kt")
        public void testIfElseRemoveLineBreak() throws Exception {
            doTest("idea/testData/formatter/IfElseRemoveLineBreak.after.kt");
        }
        
        @TestMetadata("IfElseWithLineBreak.after.kt")
        public void testIfElseWithLineBreak() throws Exception {
            doTest("idea/testData/formatter/IfElseWithLineBreak.after.kt");
        }
        
        @TestMetadata("IfElseWithTrickyComments.after.kt")
        public void testIfElseWithTrickyComments() throws Exception {
            doTest("idea/testData/formatter/IfElseWithTrickyComments.after.kt");
        }
        
        @TestMetadata("IfSpacing.after.kt")
        public void testIfSpacing() throws Exception {
            doTest("idea/testData/formatter/IfSpacing.after.kt");
        }
        
        @TestMetadata("KDoc.after.kt")
        public void testKDoc() throws Exception {
            doTest("idea/testData/formatter/KDoc.after.kt");
        }
        
        @TestMetadata("LambdaArrow.after.kt")
        public void testLambdaArrow() throws Exception {
            doTest("idea/testData/formatter/LambdaArrow.after.kt");
        }
        
        @TestMetadata("LoopParameterWithExplicitType.after.kt")
        public void testLoopParameterWithExplicitType() throws Exception {
            doTest("idea/testData/formatter/LoopParameterWithExplicitType.after.kt");
        }
        
        @TestMetadata("Multideclaration.after.kt")
        public void testMultideclaration() throws Exception {
            doTest("idea/testData/formatter/Multideclaration.after.kt");
        }
        
        @TestMetadata("MultilineFunctionLiteral.after.kt")
        public void testMultilineFunctionLiteral() throws Exception {
            doTest("idea/testData/formatter/MultilineFunctionLiteral.after.kt");
        }
        
        @TestMetadata("MultilineFunctionLiteralWithParams.after.kt")
        public void testMultilineFunctionLiteralWithParams() throws Exception {
            doTest("idea/testData/formatter/MultilineFunctionLiteralWithParams.after.kt");
        }
        
        @TestMetadata("Parameters.after.kt")
        public void testParameters() throws Exception {
            doTest("idea/testData/formatter/Parameters.after.kt");
        }
        
        @TestMetadata("PropertyWithInference.after.kt")
        public void testPropertyWithInference() throws Exception {
            doTest("idea/testData/formatter/PropertyWithInference.after.kt");
        }
        
        @TestMetadata("ReferenceExpressionFunctionLiteral.after.kt")
        public void testReferenceExpressionFunctionLiteral() throws Exception {
            doTest("idea/testData/formatter/ReferenceExpressionFunctionLiteral.after.kt");
        }
        
        @TestMetadata("RemoveSpacesAroundOperations.after.kt")
        public void testRemoveSpacesAroundOperations() throws Exception {
            doTest("idea/testData/formatter/RemoveSpacesAroundOperations.after.kt");
        }
        
        @TestMetadata("ReturnExpression.after.kt")
        public void testReturnExpression() throws Exception {
            doTest("idea/testData/formatter/ReturnExpression.after.kt");
        }
        
        @TestMetadata("RightBracketOnNewLine.after.kt")
        public void testRightBracketOnNewLine() throws Exception {
            doTest("idea/testData/formatter/RightBracketOnNewLine.after.kt");
        }
        
        @TestMetadata("SaveSpacesInDocComments.after.kt")
        public void testSaveSpacesInDocComments() throws Exception {
            doTest("idea/testData/formatter/SaveSpacesInDocComments.after.kt");
        }
        
        @TestMetadata("Script.after.kts")
        public void testScript() throws Exception {
            doTest("idea/testData/formatter/Script.after.kts");
        }
        
        @TestMetadata("SingleLineFunctionLiteral.after.kt")
        public void testSingleLineFunctionLiteral() throws Exception {
            doTest("idea/testData/formatter/SingleLineFunctionLiteral.after.kt");
        }
        
        @TestMetadata("SpaceAroundExtendColon.after.kt")
        public void testSpaceAroundExtendColon() throws Exception {
            doTest("idea/testData/formatter/SpaceAroundExtendColon.after.kt");
        }
        
        @TestMetadata("SpaceAroundExtendColonInEnums.after.kt")
        public void testSpaceAroundExtendColonInEnums() throws Exception {
            doTest("idea/testData/formatter/SpaceAroundExtendColonInEnums.after.kt");
        }
        
        @TestMetadata("SpaceAroundExtendColonInObjects.after.kt")
        public void testSpaceAroundExtendColonInObjects() throws Exception {
            doTest("idea/testData/formatter/SpaceAroundExtendColonInObjects.after.kt");
        }
        
        @TestMetadata("SpaceBeforeFunctionLiteral.after.kt")
        public void testSpaceBeforeFunctionLiteral() throws Exception {
            doTest("idea/testData/formatter/SpaceBeforeFunctionLiteral.after.kt");
        }
        
        @TestMetadata("SpacesAroundOperations.after.kt")
        public void testSpacesAroundOperations() throws Exception {
            doTest("idea/testData/formatter/SpacesAroundOperations.after.kt");
        }
        
        @TestMetadata("SpacesAroundUnaryOperations.after.kt")
        public void testSpacesAroundUnaryOperations() throws Exception {
            doTest("idea/testData/formatter/SpacesAroundUnaryOperations.after.kt");
        }
        
        @TestMetadata("SpacesInDeclarations.after.kt")
        public void testSpacesInDeclarations() throws Exception {
            doTest("idea/testData/formatter/SpacesInDeclarations.after.kt");
        }
        
        @TestMetadata("SpacesInQualifiedExpressions.after.kt")
        public void testSpacesInQualifiedExpressions() throws Exception {
            doTest("idea/testData/formatter/SpacesInQualifiedExpressions.after.kt");
        }
        
        @TestMetadata("TryCatchLineBreak.after.kt")
        public void testTryCatchLineBreak() throws Exception {
            doTest("idea/testData/formatter/TryCatchLineBreak.after.kt");
        }
        
        @TestMetadata("UnnecessarySpacesInParametersLists.after.kt")
        public void testUnnecessarySpacesInParametersLists() throws Exception {
            doTest("idea/testData/formatter/UnnecessarySpacesInParametersLists.after.kt");
        }
        
        @TestMetadata("When.after.kt")
        public void testWhen() throws Exception {
            doTest("idea/testData/formatter/When.after.kt");
        }
        
        @TestMetadata("WhenArrow.after.kt")
        public void testWhenArrow() throws Exception {
            doTest("idea/testData/formatter/WhenArrow.after.kt");
        }
        
        @TestMetadata("WhenEntryExpr.after.kt")
        public void testWhenEntryExpr() throws Exception {
            doTest("idea/testData/formatter/WhenEntryExpr.after.kt");
        }
        
        @TestMetadata("WhenLineBreak.after.kt")
        public void testWhenLineBreak() throws Exception {
            doTest("idea/testData/formatter/WhenLineBreak.after.kt");
        }
        
        @TestMetadata("WhenLinesBeforeLbrace.after.kt")
        public void testWhenLinesBeforeLbrace() throws Exception {
            doTest("idea/testData/formatter/WhenLinesBeforeLbrace.after.kt");
        }
        
        @TestMetadata("WhileLineBreak.after.kt")
        public void testWhileLineBreak() throws Exception {
            doTest("idea/testData/formatter/WhileLineBreak.after.kt");
        }
        
        @TestMetadata("WhileOnNewLine.after.kt")
        public void testWhileOnNewLine() throws Exception {
            doTest("idea/testData/formatter/WhileOnNewLine.after.kt");
        }
        
        @TestMetadata("WhileSpacing.after.kt")
        public void testWhileSpacing() throws Exception {
            doTest("idea/testData/formatter/WhileSpacing.after.kt");
        }
        
        @TestMetadata("idea/testData/formatter/modifierList")
        public static class ModifierList extends AbstractJetFormatterTest {
            public void testAllFilesPresentInModifierList() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/formatter/modifierList"), Pattern.compile("^([^\\.]+)\\.after\\.kt.*$"), true);
            }
            
            @TestMetadata("funAnnotationBeforeAnnotation.after.kt")
            public void testFunAnnotationBeforeAnnotation() throws Exception {
                doTest("idea/testData/formatter/modifierList/funAnnotationBeforeAnnotation.after.kt");
            }
            
            @TestMetadata("funAnnotationBeforeAnnotationEntry.after.kt")
            public void testFunAnnotationBeforeAnnotationEntry() throws Exception {
                doTest("idea/testData/formatter/modifierList/funAnnotationBeforeAnnotationEntry.after.kt");
            }
            
            @TestMetadata("funAnnotationBeforeModifiers.after.kt")
            public void testFunAnnotationBeforeModifiers() throws Exception {
                doTest("idea/testData/formatter/modifierList/funAnnotationBeforeModifiers.after.kt");
            }
            
            @TestMetadata("funAnnotationEntryBeforeAnnotation.after.kt")
            public void testFunAnnotationEntryBeforeAnnotation() throws Exception {
                doTest("idea/testData/formatter/modifierList/funAnnotationEntryBeforeAnnotation.after.kt");
            }
            
            @TestMetadata("funAnnotationEntryBeforeAnnotationEntry.after.kt")
            public void testFunAnnotationEntryBeforeAnnotationEntry() throws Exception {
                doTest("idea/testData/formatter/modifierList/funAnnotationEntryBeforeAnnotationEntry.after.kt");
            }
            
            @TestMetadata("funAnnotationEntryBeforeModifiers.after.kt")
            public void testFunAnnotationEntryBeforeModifiers() throws Exception {
                doTest("idea/testData/formatter/modifierList/funAnnotationEntryBeforeModifiers.after.kt");
            }
            
            @TestMetadata("funModifierBeforeAnnotation.after.kt")
            public void testFunModifierBeforeAnnotation() throws Exception {
                doTest("idea/testData/formatter/modifierList/funModifierBeforeAnnotation.after.kt");
            }
            
            @TestMetadata("funModifierBeforeAnnotationEntry.after.kt")
            public void testFunModifierBeforeAnnotationEntry() throws Exception {
                doTest("idea/testData/formatter/modifierList/funModifierBeforeAnnotationEntry.after.kt");
            }
            
            @TestMetadata("funModifierBeforeModifiers.after.kt")
            public void testFunModifierBeforeModifiers() throws Exception {
                doTest("idea/testData/formatter/modifierList/funModifierBeforeModifiers.after.kt");
            }
            
            @TestMetadata("funTheOnlyModifier.after.kt")
            public void testFunTheOnlyModifier() throws Exception {
                doTest("idea/testData/formatter/modifierList/funTheOnlyModifier.after.kt");
            }
            
            @TestMetadata("memberFunTheOnlyModifier.after.kt")
            public void testMemberFunTheOnlyModifier() throws Exception {
                doTest("idea/testData/formatter/modifierList/memberFunTheOnlyModifier.after.kt");
            }
            
            @TestMetadata("memberValTheOnlyModifier.after.kt")
            public void testMemberValTheOnlyModifier() throws Exception {
                doTest("idea/testData/formatter/modifierList/memberValTheOnlyModifier.after.kt");
            }
            
            @TestMetadata("memberVarTheOnlyModifier.after.kt")
            public void testMemberVarTheOnlyModifier() throws Exception {
                doTest("idea/testData/formatter/modifierList/memberVarTheOnlyModifier.after.kt");
            }
            
            @TestMetadata("secondMemberFunTheOnlyModifier.after.kt")
            public void testSecondMemberFunTheOnlyModifier() throws Exception {
                doTest("idea/testData/formatter/modifierList/secondMemberFunTheOnlyModifier.after.kt");
            }
            
            @TestMetadata("secondMemberValTheOnlyModifier.after.kt")
            public void testSecondMemberValTheOnlyModifier() throws Exception {
                doTest("idea/testData/formatter/modifierList/secondMemberValTheOnlyModifier.after.kt");
            }
            
            @TestMetadata("secondMemberVarTheOnlyModifier.after.kt")
            public void testSecondMemberVarTheOnlyModifier() throws Exception {
                doTest("idea/testData/formatter/modifierList/secondMemberVarTheOnlyModifier.after.kt");
            }
            
        }
        
        public static Test innerSuite() {
            TestSuite suite = new TestSuite("Formatter");
            suite.addTestSuite(Formatter.class);
            suite.addTestSuite(ModifierList.class);
            return suite;
        }
    }
    
    @TestMetadata("idea/testData/formatter")
    @InnerTestClasses({})
    public static class FormatterInverted extends AbstractJetFormatterTest {
        public void testAllFilesPresentInFormatterInverted() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage",
                                                         new File("idea/testData/formatter"),
                                                         Pattern.compile("^([^\\.]+)\\.after\\.inv\\.kt.*$"), true);
        }
        
        @TestMetadata("BinaryExpressions.after.inv.kt")
        public void testBinaryExpressions() throws Exception {
            doTestInverted("idea/testData/formatter/BinaryExpressions.after.inv.kt");
        }
        
        @TestMetadata("BinaryExpressionsBoolean.after.inv.kt")
        public void testBinaryExpressionsBoolean() throws Exception {
            doTestInverted("idea/testData/formatter/BinaryExpressionsBoolean.after.inv.kt");
        }
        
        @TestMetadata("CatchFinallyOnNewLine.after.inv.kt")
        public void testCatchFinallyOnNewLine() throws Exception {
            doTestInverted("idea/testData/formatter/CatchFinallyOnNewLine.after.inv.kt");
        }
        
        @TestMetadata("ClassLineBreak.after.inv.kt")
        public void testClassLineBreak() throws Exception {
            doTestInverted("idea/testData/formatter/ClassLineBreak.after.inv.kt");
        }
        
        @TestMetadata("ColonSpaces.after.inv.kt")
        public void testColonSpaces() throws Exception {
            doTestInverted("idea/testData/formatter/ColonSpaces.after.inv.kt");
        }
        
        @TestMetadata("DelegationList.after.inv.kt")
        public void testDelegationList() throws Exception {
            doTestInverted("idea/testData/formatter/DelegationList.after.inv.kt");
        }
        
        @TestMetadata("DoWhileLineBreak.after.inv.kt")
        public void testDoWhileLineBreak() throws Exception {
            doTestInverted("idea/testData/formatter/DoWhileLineBreak.after.inv.kt");
        }
        
        @TestMetadata("ElseOnNewLine.after.inv.kt")
        public void testElseOnNewLine() throws Exception {
            doTestInverted("idea/testData/formatter/ElseOnNewLine.after.inv.kt");
        }
        
        @TestMetadata("EmptyBlocks.after.inv.kt")
        public void testEmptyBlocks() throws Exception {
            doTestInverted("idea/testData/formatter/EmptyBlocks.after.inv.kt");
        }
        
        @TestMetadata("ForLineBreak.after.inv.kt")
        public void testForLineBreak() throws Exception {
            doTestInverted("idea/testData/formatter/ForLineBreak.after.inv.kt");
        }
        
        @TestMetadata("FunctionLineBreak.after.inv.kt")
        public void testFunctionLineBreak() throws Exception {
            doTestInverted("idea/testData/formatter/FunctionLineBreak.after.inv.kt");
        }
        
        @TestMetadata("FunctionalType.after.inv.kt")
        public void testFunctionalType() throws Exception {
            doTestInverted("idea/testData/formatter/FunctionalType.after.inv.kt");
        }
        
        @TestMetadata("IfElseWithTrickyComments.after.inv.kt")
        public void testIfElseWithTrickyComments() throws Exception {
            doTestInverted("idea/testData/formatter/IfElseWithTrickyComments.after.inv.kt");
        }
        
        @TestMetadata("LambdaArrow.after.inv.kt")
        public void testLambdaArrow() throws Exception {
            doTestInverted("idea/testData/formatter/LambdaArrow.after.inv.kt");
        }
        
        @TestMetadata("MultilineFunctionLiteralWithParams.after.inv.kt")
        public void testMultilineFunctionLiteralWithParams() throws Exception {
            doTestInverted("idea/testData/formatter/MultilineFunctionLiteralWithParams.after.inv.kt");
        }
        
        @TestMetadata("Parameters.after.inv.kt")
        public void testParameters() throws Exception {
            doTestInverted("idea/testData/formatter/Parameters.after.inv.kt");
        }
        
        @TestMetadata("RightBracketOnNewLine.after.inv.kt")
        public void testRightBracketOnNewLine() throws Exception {
            doTestInverted("idea/testData/formatter/RightBracketOnNewLine.after.inv.kt");
        }
        
        @TestMetadata("SingleLineFunctionLiteral.after.inv.kt")
        public void testSingleLineFunctionLiteral() throws Exception {
            doTestInverted("idea/testData/formatter/SingleLineFunctionLiteral.after.inv.kt");
        }
        
        @TestMetadata("SpaceAroundExtendColon.after.inv.kt")
        public void testSpaceAroundExtendColon() throws Exception {
            doTestInverted("idea/testData/formatter/SpaceAroundExtendColon.after.inv.kt");
        }
        
        @TestMetadata("SpaceAroundExtendColonInEnums.after.inv.kt")
        public void testSpaceAroundExtendColonInEnums() throws Exception {
            doTestInverted("idea/testData/formatter/SpaceAroundExtendColonInEnums.after.inv.kt");
        }
        
        @TestMetadata("SpaceAroundExtendColonInObjects.after.inv.kt")
        public void testSpaceAroundExtendColonInObjects() throws Exception {
            doTestInverted("idea/testData/formatter/SpaceAroundExtendColonInObjects.after.inv.kt");
        }
        
        @TestMetadata("SpacesAroundOperations.after.inv.kt")
        public void testSpacesAroundOperations() throws Exception {
            doTestInverted("idea/testData/formatter/SpacesAroundOperations.after.inv.kt");
        }
        
        @TestMetadata("SpacesAroundUnaryOperations.after.inv.kt")
        public void testSpacesAroundUnaryOperations() throws Exception {
            doTestInverted("idea/testData/formatter/SpacesAroundUnaryOperations.after.inv.kt");
        }
        
        @TestMetadata("TryCatchLineBreak.after.inv.kt")
        public void testTryCatchLineBreak() throws Exception {
            doTestInverted("idea/testData/formatter/TryCatchLineBreak.after.inv.kt");
        }
        
        @TestMetadata("When.after.inv.kt")
        public void testWhen() throws Exception {
            doTestInverted("idea/testData/formatter/When.after.inv.kt");
        }
        
        @TestMetadata("WhenArrow.after.inv.kt")
        public void testWhenArrow() throws Exception {
            doTestInverted("idea/testData/formatter/WhenArrow.after.inv.kt");
        }
        
        @TestMetadata("WhenLineBreak.after.inv.kt")
        public void testWhenLineBreak() throws Exception {
            doTestInverted("idea/testData/formatter/WhenLineBreak.after.inv.kt");
        }
        
        @TestMetadata("WhileLineBreak.after.inv.kt")
        public void testWhileLineBreak() throws Exception {
            doTestInverted("idea/testData/formatter/WhileLineBreak.after.inv.kt");
        }
        
        @TestMetadata("WhileOnNewLine.after.inv.kt")
        public void testWhileOnNewLine() throws Exception {
            doTestInverted("idea/testData/formatter/WhileOnNewLine.after.inv.kt");
        }
        
        public static Test innerSuite() {
            TestSuite suite = new TestSuite("FormatterInverted");
            suite.addTestSuite(FormatterInverted.class);
            return suite;
        }
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("JetFormatterTestGenerated");
        suite.addTest(Formatter.innerSuite());
        suite.addTest(FormatterInverted.innerSuite());
        return suite;
    }
}
