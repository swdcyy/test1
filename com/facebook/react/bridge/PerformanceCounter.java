package com.facebook.react.bridge.PerformanceCounter;
import java.util.Map;

public interface abstract PerformanceCounter	// class@001214
{

    Map getPerformanceCounters();
    void profileNextBatch();
}
