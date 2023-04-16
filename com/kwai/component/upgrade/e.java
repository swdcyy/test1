package com.kwai.component.upgrade.e;
import java.lang.Runnable;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import ai5.f;
import ekd.k1;

public final class e implements Runnable	// class@000c00
{
    public final RequestTiming b;

    public void e(RequestTiming p0){
       this.b = p0;
    }
    public final void run(){
       k1.o(new f(this.b));
    }
}
