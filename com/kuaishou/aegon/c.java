package com.kuaishou.aegon.c;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.aegon.Aegon;

public final class c implements Runnable	// class@0005df
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void run(){
       Aegon.nativeClearHttpCache();
    }
}
