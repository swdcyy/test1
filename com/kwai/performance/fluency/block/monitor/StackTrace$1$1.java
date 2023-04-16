package com.kwai.performance.fluency.block.monitor.StackTrace$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.StackTraceElement;
import java.lang.String;
import java.lang.StringBuilder;

public final class StackTrace$1$1 extends Lambda implements l	// class@001060
{
    public static final StackTrace$1$1 INSTANCE;

    static {
       StackTrace$1$1.INSTANCE = new StackTrace$1$1();
    }
    public void StackTrace$1$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(StackTraceElement p0){
       return "\tat "+p0;
    }
}
