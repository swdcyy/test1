package com.yxcorp.login.initModule.c;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.login.initModule.LoginInitModule;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import b3d.o0;

public final class c implements Runnable	// class@001adf
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void run(){
       o0.a(RequestTiming.LOGOUT);
    }
}
