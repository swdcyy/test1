package com.kuaishou.webkit.internal.loader.DexOptimizer$OptimizeCallback;
import java.lang.String;
import java.lang.Exception;

public interface abstract DexOptimizer$OptimizeCallback	// class@001333
{

    void onFailed(String p0,Exception p1);
    void onOdexGen(String p0,String p1);
    void onSkipped(String p0,String p1);
    void onStarted(String p0);
    void onSucceeded(String p0,String p1);
    void onVdexGen(String p0,String p1);
}
