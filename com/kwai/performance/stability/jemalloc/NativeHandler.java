package com.kwai.performance.stability.jemalloc.NativeHandler;
import java.lang.Object;
import java.lang.String;
import java.lang.System;
import com.kwai.performance.stability.jemalloc.JeMallocStat;

public class NativeHandler	// class@00122c
{
    public static final NativeHandler ourInstance;

    static {
       NativeHandler.ourInstance = new NativeHandler();
    }
    public void NativeHandler(){
       super();
       System.loadLibrary("koom-jemalloc");
    }
    public static NativeHandler getInstance(){
       return NativeHandler.ourInstance;
    }
    public native boolean disableKMallocRetain();
    public native void enableSigSegvProtection(boolean p0);
    public native void forceDisableGetDssPrec();
    public native void forceIgnoreDss();
    public native boolean forceJeMallocPurge();
    public native int getChunkDssPrec();
    public native int getErrorNo();
    public native boolean getFragmentationStatus(int p0,int p1,JeMallocStat p2);
    public native boolean hackJeMallocChunkDalloc();
    public native boolean isAllChunksHooked();
    public native boolean isAllChunksNotHooked();
    public native boolean isChunkDssDisabled();
    public native boolean resetDecayTime();
}
