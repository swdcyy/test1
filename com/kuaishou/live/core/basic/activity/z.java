package com.kuaishou.live.core.basic.activity.z;
import msd.a;
import com.kuaishou.live.core.basic.activity.LivePlayLoader;
import java.lang.Runnable;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.live.core.basic.activity.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$b;
import com.kuaishou.live.core.basic.bulletin.CommentAreaOptABContext;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Boolean;
import xp5.a;
import u53.b;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import d61.g;
import r12.e;
import com.kuaishou.live.core.basic.preload.LiveViewPreLoader;
import com.kuaishou.live.core.basic.utils.e;
import w51.a;
import java.lang.Number;
import xf6.l;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import android.content.Context;
import m02.d;
import com.kuaishou.live.core.basic.preload.a;
import java.lang.Integer;
import com.kuaishou.live.core.basic.preload.a$b;
import com.kuaishou.live.core.basic.preload.a$a;
import r12.f$a;
import m02.c;
import r12.e$a;
import qrd.l1;

public final class z implements a	// class@00185a
{
    public final LivePlayLoader b;
    public final Runnable c;
    public final Runnable d;

    public void z(LivePlayLoader p0,Runnable p1,Runnable p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object invoke(){
       boolean b;
       z oz = this;
       z c = oz.c;
       z d = oz.d;
       LivePlayLoader d1 = oz.b.d;
       Objects.requireNonNull(d1);
       c uoc = c.class;
       if (PatchProxy.applyVoidTwoRefs(c, d, d1, uoc, "1")) {
       }else {
          b.Z(d1.t, "load");
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          if (!PatchProxy.applyVoidTwoRefs(c, d, d1, uoc, "2")) {
             if (d1.u != null) {
                b.Z(d1.t, "initBizLayout return because InitBizLayoutEntered is ture");
             }else {
                b = true;
                d1.u = b;
                long l = SystemClock.elapsedRealtime();
                Object[] objArray = null;
                boolean b1 = false;
                if (!PatchProxy.applyVoid(objArray, d1, uoc, "8")) {
                   CommentAreaOptABContext uCommentArea = CommentAreaOptABContext.a(d1.a.b());
                   boolean b3 = (d1.a.l() || d1.d.isGamePatternType())? true: false;
                   uCommentArea.g(b3);
                }
                d1.i = b1;
                Object obj = PatchProxy.apply(objArray, d1, uoc, "7");
                int b2 = (obj != patchProxyRe)? obj.booleanValue(): b.a(d1.a.b()).f();
                if (b2) {
                   b.Z(d1.t, "isMultiTabStyle inflate live_gzone_play");
                   a.k(d1.f, R.layout.arg_RES_7f0d0bd8, b);
                }else if(g.j(d1.b.mPhoto)){
                   a.k(d1.f, R.layout.arg_RES_7f0d0d45, b);
                   d1.f();
                }else {
                   e uoe = LiveViewPreLoader.g();
                   obj = PatchProxy.apply(objArray, objArray, e.class, "34");
                   if (obj != patchProxyRe) {
                      b2 = obj.booleanValue();
                   }else {
                      obj = PatchProxy.apply(objArray, objArray, a.class, "112");
                      String str = "enableLiveViewLoadingStrategyOnSlide";
                      b2 = (obj != patchProxyRe)? obj.intValue(): l.e(str, b1);
                      if (!b2) {
                         b2 = a.t().u("SOURCE_LIVE").d(str, b1);
                      }else if(b2 == b){
                         b2 = true;
                      }else {
                         b2 = false;
                      }
                   }
                   b2 = (b2 && e.q())? true: false;
                   b.c0(d1.t, "initBizLayout", "enableOnSlide", Boolean.valueOf(b2));
                   if (uoe == null) {
                      Context context = d1.a.u1().getContext();
                      b2 = 0x7f0d0d1d;
                      c f = d1.f;
                      d uod = new d(d1);
                      a uoa = a.class;
                      if (PatchProxy.isSupport(uoa)) {
                         objArray = new Object[]{context,Integer.valueOf(b2),f,Boolean.TRUE,Integer.valueOf(0x7f0d0d08),uod,null};
                         if (PatchProxy.apply(objArray, null, uoa, "6") != patchProxyRe) {
                         label_0176 :
                            d1.b();
                         }
                      }
                      a.c(context, R.layout.live_play_preload, f, 1, true, true, true, R.layout.arg_RES_7f0d0d08, uod, null);
                      goto label_0176 ;
                   }else if(d1.a.U1() && !b2){
                      uoe.d(d1.e(), b, d1.f, b);
                      d1.b();
                   }else {
                      d1.i = b;
                      uoc = new c(d1, l, d, c);
                      uoe.b(d1.e(), v14, true, d1.f, true);
                   }
                }
                if (d1.i == null) {
                   d1.a(l, d);
                   c.run();
                }
             }
          }
       }
       return l1.a;
    }
}
