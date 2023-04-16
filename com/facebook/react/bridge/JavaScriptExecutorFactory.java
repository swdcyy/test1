package com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.JavaScriptExecutor;
import java.lang.String;

public interface abstract JavaScriptExecutorFactory	// class@0011fa
{

    JavaScriptExecutor create();
    void startSamplingProfiler();
    void stopSamplingProfiler(String p0);
}
