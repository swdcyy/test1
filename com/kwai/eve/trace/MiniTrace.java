package com.kwai.eve.trace.MiniTrace;
import nl5.b;
import java.lang.Object;
import java.lang.String;

public final class MiniTrace	// class@000dd3
{
    public static final MiniTrace a;

    static {
       MiniTrace.a = new MiniTrace();
       b.a();
    }
    public void MiniTrace(){
       super();
    }
    public static native final void begin(String p0,String p1);
    public static native final void end(String p0,String p1);
    public static native final void flush();
    public static native final void init(String p0);
    public static native final void shutdown();
    public static native final void start();
    public static native final void stop();
}
