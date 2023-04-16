package com.kuaishou.commercial.splash.presenter.l;
import erd.g;
import com.kuaishou.commercial.splash.presenter.n;
import java.lang.Object;
import bz.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import gz.b2;
import java.lang.Runnable;
import ekd.k1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import gz.z1;
import crd.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopPlayInfo;
import mxb.c;
import gz.a2;

public final class l implements g	// class@0015f8
{
    public final n b;

    public void l(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       n on = n.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, on, "5")) {
       }else {
          tb.R8("ad display finish event.reson:"+p0.a);
          a a = p0.a;
          boolean b = true;
          if (a == b) {
             tb.S8(b);
          }else {
             long l = 2000;
             if (a == 2 && p0.b == null) {
                if (!PatchProxy.applyVoid(null, tb, on, "7")) {
                   tb.t = false;
                   k1.r(new b2(tb), l);
                   tb.X7(tb.getActivity().m().subscribe(new z1(tb)));
                }
             }else if(a == 2){
                if (!PatchProxy.applyVoid(null, tb, on, "6")) {
                   p0 = c.E(tb.u);
                   if (p0 != null) {
                      l = l + (long)p0.mDisplayDurMs;
                   }
                   k1.r(new a2(tb), l);
                }
             }else {
                tb.S8(false);
             }
          }
       }
       return;
    }
}
