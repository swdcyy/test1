package com.kwai.component.realtime.tab.RealtimeTabRequester$e;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import gb5.a;
import com.kwai.component.realtime.tab.RealtimeTabRequester;
import og5.a;
import com.kwai.component.realtime.tab.RealtimeTabRequester$b;

public final class RealtimeTabRequester$e implements Runnable	// class@000b17
{
    public static final RealtimeTabRequester$e b;

    static {
       RealtimeTabRequester$e.b = new RealtimeTabRequester$e();
    }
    public void RealtimeTabRequester$e(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, RealtimeTabRequester$e.class, "1")) {
          return;
       }
       b.a(0x8708467).q(RealtimeTabRequester.r.c().c(), "fail");
       return;
    }
}
