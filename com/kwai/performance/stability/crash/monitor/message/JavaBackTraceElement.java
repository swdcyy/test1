package com.kwai.performance.stability.crash.monitor.message.JavaBackTraceElement;
import com.kwai.performance.stability.crash.monitor.message.BackTraceElement;
import java.lang.String;

public final class JavaBackTraceElement extends BackTraceElement	// class@0011fe
{
    public String mDeclaringClass;
    public boolean mIsCausedBy;
    public boolean mIsNative;
    public boolean mIsTitle;
    public static final long serialVersionUID = 0x2029e5c7d9a6a736;

    public void JavaBackTraceElement(String p0,int p1){
       super(p0, p1);
       this.mDeclaringClass = "";
       this.mIsTitle = false;
       this.mIsCausedBy = false;
       this.mIsNative = false;
    }
}
