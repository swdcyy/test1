package com.kuaishou.commercial.splash.a0;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.commercial.splash.d0;
import com.yxcorp.gifshow.util.rx.RxBus;
import bz.d;

public final class a0 implements Runnable	// class@0015a0
{
    public static final a0 b;

    static {
       a0.b = new a0();
    }
    public void a0(){
       super();
    }
    public final void run(){
       RxBus.f.b(new d(1));
    }
}
