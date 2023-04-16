package com.facebook.react.bridge.MemoryStatsProvider;
import com.facebook.react.bridge.MemoryStatsCallback;

public interface abstract MemoryStatsProvider	// class@001204
{

    void getMemoryStats(MemoryStatsCallback p0);
    void getUIMemoryStats(MemoryStatsCallback p0);
}
