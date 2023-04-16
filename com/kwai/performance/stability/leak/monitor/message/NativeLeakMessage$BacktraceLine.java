package com.kwai.performance.stability.leak.monitor.message.NativeLeakMessage$BacktraceLine;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class NativeLeakMessage$BacktraceLine	// class@00123b
{
    public String buildId;
    public String offset;
    public String soName;

    public void NativeLeakMessage$BacktraceLine(){
       super();
    }
    public String toString(){
       return "0x"+this.offset+"  "+this.soName+' '+this.buildId;
    }
}
