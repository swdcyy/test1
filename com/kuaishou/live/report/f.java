package com.kuaishou.live.report.f;
import java.lang.Object;
import android.app.Activity;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import lnc.l1;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import brd.x;
import ap3.k;
import erd.a;
import crd.b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class f	// class@000f5e
{

    public void f(){
       super();
    }
    public static void a(Activity p0,Runnable p1,long p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), null, f.class, "1")) {
          return;
       }
       if (p0 == null || (!p0.isFinishing() && !p0.isDestroyed())) {
          if (l1.a()) {
             p0.setRequestedOrientation(1);
             if (p0 instanceof RxFragmentActivity) {
                t.timer(p2, TimeUnit.MILLISECONDS).observeOn(d.a).compose(p0.E2(ActivityEvent.DESTROY)).doOnComplete(new k(p1)).subscribe();
             }else {
                b.B(LiveLogTag.LIVE_REPORT, "can\'t delay because host isn\'t a RxFragmentActivity, run directly");
                p1.run();
             }
          }else {
             p1.run();
          }
       }
       return;
    }
}
