package com.kwai.performance.stability.hack.ArtHeapHacker;
import java.lang.Object;

public final class ArtHeapHacker	// class@001219
{
    public static boolean a;
    public static final ArtHeapHacker b;

    static {
       ArtHeapHacker.b = new ArtHeapHacker();
    }
    public void ArtHeapHacker(){
       super();
    }
    public static native final void setHeapSize(int p0);
}
