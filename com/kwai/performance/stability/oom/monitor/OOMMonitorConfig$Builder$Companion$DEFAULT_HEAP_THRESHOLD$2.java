package com.kwai.performance.stability.oom.monitor.OOMMonitorConfig$Builder$Companion$DEFAULT_HEAP_THRESHOLD$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import nh7.a$a;
import java.lang.Runtime;
import java.lang.Object;
import java.lang.Float;

public final class OOMMonitorConfig$Builder$Companion$DEFAULT_HEAP_THRESHOLD$2 extends Lambda implements a	// class@00124f
{
    public static final OOMMonitorConfig$Builder$Companion$DEFAULT_HEAP_THRESHOLD$2 INSTANCE;

    static {
       OOMMonitorConfig$Builder$Companion$DEFAULT_HEAP_THRESHOLD$2.INSTANCE = new OOMMonitorConfig$Builder$Companion$DEFAULT_HEAP_THRESHOLD$2();
    }
    public void OOMMonitorConfig$Builder$Companion$DEFAULT_HEAP_THRESHOLD$2(){
       super(0);
    }
    public final float invoke(){
       float f = a$a.a.f(Runtime.getRuntime().maxMemory());
       if (f - (float)502 >= 0) {
          f = 0x3f4ccccd;
       }else if(f - (float)246 >= 0){
          f = 0x3f59999a;
       }else {
          f = 0x3f666666;
       }
       return f;
    }
    public Object invoke(){
       return Float.valueOf(this.invoke());
    }
}
