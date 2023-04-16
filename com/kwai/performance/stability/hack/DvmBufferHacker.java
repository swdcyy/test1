package com.kwai.performance.stability.hack.DvmBufferHacker;
import java.lang.Object;

public final class DvmBufferHacker	// class@00121a
{
    public static boolean a;
    public static final DvmBufferHacker b;

    static {
       DvmBufferHacker.b = new DvmBufferHacker();
    }
    public void DvmBufferHacker(){
       super();
    }
    public static native final boolean resizeLinearAllocBuffer(long p0,long p1);
}
