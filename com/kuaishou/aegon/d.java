package com.kuaishou.aegon.d;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.aegon.Aegon;

public final class d implements Runnable	// class@0005e0
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void run(){
       Aegon.nativeOnBackground();
    }
}
