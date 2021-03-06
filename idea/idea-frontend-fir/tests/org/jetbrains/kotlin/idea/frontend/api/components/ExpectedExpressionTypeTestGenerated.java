/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.frontend.api.components;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/idea-frontend-fir/testData/components/expectedExpressionType")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ExpectedExpressionTypeTestGenerated extends AbstractExpectedExpressionTypeTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInExpectedExpressionType() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/idea-frontend-fir/testData/components/expectedExpressionType"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @TestMetadata("functionLambdaParam.kt")
    public void testFunctionLambdaParam() throws Exception {
        runTest("idea/idea-frontend-fir/testData/components/expectedExpressionType/functionLambdaParam.kt");
    }

    @TestMetadata("functionNamedlParam.kt")
    public void testFunctionNamedlParam() throws Exception {
        runTest("idea/idea-frontend-fir/testData/components/expectedExpressionType/functionNamedlParam.kt");
    }

    @TestMetadata("functionParamWithTypeParam.kt")
    public void testFunctionParamWithTypeParam() throws Exception {
        runTest("idea/idea-frontend-fir/testData/components/expectedExpressionType/functionParamWithTypeParam.kt");
    }

    @TestMetadata("functionPositionalParam.kt")
    public void testFunctionPositionalParam() throws Exception {
        runTest("idea/idea-frontend-fir/testData/components/expectedExpressionType/functionPositionalParam.kt");
    }

    @TestMetadata("ifCondition.kt")
    public void testIfCondition() throws Exception {
        runTest("idea/idea-frontend-fir/testData/components/expectedExpressionType/ifCondition.kt");
    }

    @TestMetadata("ifConditionQualified.kt")
    public void testIfConditionQualified() throws Exception {
        runTest("idea/idea-frontend-fir/testData/components/expectedExpressionType/ifConditionQualified.kt");
    }

    @TestMetadata("returnFromFunction.kt")
    public void testReturnFromFunction() throws Exception {
        runTest("idea/idea-frontend-fir/testData/components/expectedExpressionType/returnFromFunction.kt");
    }

    @TestMetadata("returnFromFunctionQualifiedReceiver.kt")
    public void testReturnFromFunctionQualifiedReceiver() throws Exception {
        runTest("idea/idea-frontend-fir/testData/components/expectedExpressionType/returnFromFunctionQualifiedReceiver.kt");
    }

    @TestMetadata("returnFromFunctionQualifiedSelector.kt")
    public void testReturnFromFunctionQualifiedSelector() throws Exception {
        runTest("idea/idea-frontend-fir/testData/components/expectedExpressionType/returnFromFunctionQualifiedSelector.kt");
    }

    @TestMetadata("returnFromLambda.kt")
    public void testReturnFromLambda() throws Exception {
        runTest("idea/idea-frontend-fir/testData/components/expectedExpressionType/returnFromLambda.kt");
    }

    @TestMetadata("whileCondition.kt")
    public void testWhileCondition() throws Exception {
        runTest("idea/idea-frontend-fir/testData/components/expectedExpressionType/whileCondition.kt");
    }

    @TestMetadata("whileConditionQualified.kt")
    public void testWhileConditionQualified() throws Exception {
        runTest("idea/idea-frontend-fir/testData/components/expectedExpressionType/whileConditionQualified.kt");
    }
}
