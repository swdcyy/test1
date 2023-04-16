package com.facebook.react.bridge.ReactCallback;
import java.lang.String;
import java.nio.ByteBuffer;

public interface abstract ReactCallback	// class@00121b
{

    boolean canShareRuntime();
    void decrementPendingJSCalls();
    boolean didNotFindModule(String p0);
    long getSharedIsolateHandler();
    ByteBuffer getValidatedCodeCache(int p0,String p1);
    void incrementPendingJSCalls();
    void onBatchComplete();
    void registerSharedIsolateHandler(long p0);
    int unregisterSharedIsolateHandler(long p0);
    void updateCodeCache(int p0,ByteBuffer p1,int p2,int p3,String p4);
    boolean useCodeCache(String p0);
}
