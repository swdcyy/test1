package com.kuaishou.aegon.j;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.aegon.Aegon;

public final class j implements Runnable	// class@0007af
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final void run(){
       Aegon.nativeSetKProxyConfig("", 0, 0);
    }
}
