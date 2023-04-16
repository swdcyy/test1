package com.kuaishou.aegon.h;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.aegon.Aegon;

public final class h implements Runnable	// class@0007a9
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final void run(){
       Aegon.nativeSetInitialized(true);
    }
}
