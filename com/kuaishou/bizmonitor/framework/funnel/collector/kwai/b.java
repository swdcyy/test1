package com.kuaishou.bizmonitor.framework.funnel.collector.kwai.b;
import java.lang.Runnable;
import java.lang.Object;
import mn.b;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.a;
import ou.f;

public final class b implements Runnable	// class@001157
{
    public final Object b;
    public final b c;

    public void b(Object p0,b p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       a.c().h(new f(this.b, this.c));
    }
}
