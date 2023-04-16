package com.kwai.performance.overhead.io.monitor.IoMonitor$LoadState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class IoMonitor$LoadState extends Enum	// class@001151
{
    public static final IoMonitor$LoadState[] $VALUES;
    public static final IoMonitor$LoadState LoadFail;
    public static final IoMonitor$LoadState LoadSuc;
    public static final IoMonitor$LoadState UnLoad;

    static {
       IoMonitor$LoadState loadState;
       IoMonitor$LoadState[] loadStateArr = new IoMonitor$LoadState[]{loadState,loadState,loadState};
       loadState = new IoMonitor$LoadState("UnLoad", 0);
       IoMonitor$LoadState.UnLoad = loadState;
       loadState = new IoMonitor$LoadState("LoadSuc", 1);
       IoMonitor$LoadState.LoadSuc = loadState;
       loadState = new IoMonitor$LoadState("LoadFail", 2);
       IoMonitor$LoadState.LoadFail = loadState;
       IoMonitor$LoadState.$VALUES = loadStateArr;
    }
    public void IoMonitor$LoadState(String p0,int p1){
       super(p0, p1);
    }
    public static IoMonitor$LoadState valueOf(String p0){
       return Enum.valueOf(IoMonitor$LoadState.class, p0);
    }
    public static IoMonitor$LoadState[] values(){
       return IoMonitor$LoadState.$VALUES.clone();
    }
}
