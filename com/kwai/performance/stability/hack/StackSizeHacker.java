package com.kwai.performance.stability.hack.StackSizeHacker;
import java.lang.Object;

public final class StackSizeHacker	// class@001220
{
    public static boolean a;
    public static final StackSizeHacker b;

    static {
       StackSizeHacker.b = new StackSizeHacker();
    }
    public void StackSizeHacker(){
       super();
    }
    public static native final void setStackSize(int p0,boolean p1);
}
