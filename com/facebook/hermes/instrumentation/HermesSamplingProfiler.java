package com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import java.lang.String;
import com.facebook.soloader.SoLoader;
import java.lang.Object;

public class HermesSamplingProfiler	// class@0010e0
{

    static {
       SoLoader.b("jsijniprofiler");
    }
    public void HermesSamplingProfiler(){
       super();
    }
    public static native void disable();
    public static native void dumpSampledTraceToFile(String p0);
    public static native void enable();
}
