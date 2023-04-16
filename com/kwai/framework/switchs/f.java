package com.kwai.framework.switchs.f;
import ob6.p$b;
import java.lang.Object;
import ob6.h;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import java.util.concurrent.ExecutorService;
import t45.c;
import uf6.h;
import java.lang.Runnable;
import java.lang.Throwable;
import ob6.q;

public final class f implements p$b	// class@000ce0
{
    public static final f a;

    static {
       f.a = new f();
    }
    public void f(){
       super();
    }
    public final void a(h p0){
       c.c().execute(new h(p0));
    }
    public void onError(Throwable p0){
       q.a(this, p0);
    }
}
