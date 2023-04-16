package com.kwai.performance.stability.crash.monitor.message.NativeBackTraceElement;
import com.kwai.performance.stability.crash.monitor.message.BackTraceElement;
import java.lang.String;

public final class NativeBackTraceElement extends BackTraceElement	// class@001201
{
    public String mBuildId;
    public String mPc;
    public static final long serialVersionUID = 0x77ff9521f962845a;

    public void NativeBackTraceElement(String p0,int p1){
       super(p0, p1);
       this.mBuildId = "";
       this.mPc = "";
    }
}
