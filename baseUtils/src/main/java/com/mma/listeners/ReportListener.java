package com.mma.listeners;

import org.testng.*;
import org.testng.asserts.IAssert;
import org.testng.asserts.IAssertLifecycle;
import org.testng.internal.IResultListener;

public class ReportListener implements ITestListener, IExecutionListener, IResultListener, IConfigurationListener
        , IAssertLifecycle {

    @Override
    public void executeAssert(IAssert<?> iAssert) {

    }

    @Override
    public void onAssertSuccess(IAssert<?> iAssert) {

    }

    @Override
    public void onAssertFailure(IAssert<?> iAssert, AssertionError assertionError) {

    }

    @Override
    public void onBeforeAssert(IAssert<?> iAssert) {

    }

    @Override
    public void onAfterAssert(IAssert<?> iAssert) {

    }

    @Override
    public void onConfigurationSuccess(ITestResult tr) {
        IConfigurationListener.super.onConfigurationSuccess(tr);
    }

    @Override
    public void onConfigurationSuccess(ITestResult tr, ITestNGMethod tm) {
        IConfigurationListener.super.onConfigurationSuccess(tr, tm);
    }

    @Override
    public void onConfigurationFailure(ITestResult tr) {
        IConfigurationListener.super.onConfigurationFailure(tr);
    }

    @Override
    public void onConfigurationFailure(ITestResult tr, ITestNGMethod tm) {
        IConfigurationListener.super.onConfigurationFailure(tr, tm);
    }

    @Override
    public void onConfigurationSkip(ITestResult tr) {
        IConfigurationListener.super.onConfigurationSkip(tr);
    }

    @Override
    public void onConfigurationSkip(ITestResult tr, ITestNGMethod tm) {
        IConfigurationListener.super.onConfigurationSkip(tr, tm);
    }

    @Override
    public void beforeConfiguration(ITestResult tr) {
        IConfigurationListener.super.beforeConfiguration(tr);
    }

    @Override
    public void beforeConfiguration(ITestResult tr, ITestNGMethod tm) {
        IConfigurationListener.super.beforeConfiguration(tr, tm);
    }

    @Override
    public void onExecutionStart() {
        IExecutionListener.super.onExecutionStart();
    }

    @Override
    public void onExecutionFinish() {
        IExecutionListener.super.onExecutionFinish();
    }

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }
}
