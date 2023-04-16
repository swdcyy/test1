package com.kwai.performance.stability.crash.monitor.message.BackTraceElement;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public abstract class BackTraceElement implements Serializable	// class@0011f5
{
    public String mFileName;
    public int mIndex;
    public String mLine;
    public long mLineNumber;
    public String mMethodName;
    public boolean mNeedClustering;
    public static final long serialVersionUID = 0x8c1ef192b8732e3;

    public void BackTraceElement(String p0,int p1){
       super();
       this.mLine = "";
       this.mMethodName = "";
       this.mFileName = "";
       this.mLineNumber = 0;
       this.mNeedClustering = true;
       this.mLine = p0;
       this.mIndex = p1;
    }
}
