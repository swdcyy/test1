package com.kuaishou.commercial.splash.presenter.d;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.u;

public final class d implements Runnable	// class@0015e4
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void run(){
       RxBus.f.b(new u());
    }
}
