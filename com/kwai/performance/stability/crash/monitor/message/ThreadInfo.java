package com.kwai.performance.stability.crash.monitor.message.ThreadInfo;
import java.io.Serializable;
import java.lang.Object;

public final class ThreadInfo implements Serializable	// class@001204
{
    public int mIndex;
    public String mJavaBacktrace;
    public String mName;
    public String mNativeBacktrace;
    public int mTid;
    public static final long serialVersionUID = 0xe7cca0ff175c2be6;

    public void ThreadInfo(){
       super();
    }
}
