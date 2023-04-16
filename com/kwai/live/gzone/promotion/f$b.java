package com.kwai.live.gzone.promotion.f$b;
import s67.a;
import com.kwai.live.gzone.promotion.f;
import java.lang.Object;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGameListResponse$GzonePromotionGameNotice;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import com.kwai.live.gzone.common.keyswitch.LiveGzoneKeys;
import oq5.c;
import oq5.a;
import java.util.Objects;
import java.lang.Integer;
import crd.b;
import lnc.b9;
import crd.a;
import java.lang.Boolean;
import s67.d0;
import java.lang.reflect.Type;
import el.a;
import java.util.List;
import f37.a;
import java.util.Collection;
import ekd.q;
import fq5.b;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.kwai.live.gzone.promotion.i;
import erd.g;
import com.kwai.live.gzone.promotion.g;
import com.kwai.live.gzone.promotion.h;
import hz1.a;
import lp3.c;
import lp3.i;
import c77.p;
import s67.e0;
import com.kwai.live.gzone.promotion.e;

public class f$b implements a	// class@000dc1
{
    public final f a;

    public void f$b(f p0){
       this.a = p0;
       super();
    }
    public void a(){
       this.a.B = true;
    }
    public void b(LiveGzonePromotionGameListResponse$GzonePromotionGameNotice p0){
       f uof1;
       boolean b1;
       Object obj = this;
       Object obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, f$b.class, "1")) {
          return;
       }
       if (obj1 == null) {
          return;
       }
       Object[] objArray = null;
       Object obj2 = PatchProxy.apply(objArray, objArray, uof, "23");
       boolean b = false;
       int i = (obj2 != patchProxyRe)? obj2.intValue(): a.t().a(LiveGzoneKeys.KEY_SWITCH_JOYPAD_NOTICE_STYLE.key(), b);
       if (!i) {
          return;
       }else {
          f$b a = obj.a;
          if (a.u != null) {
             a.u = b;
             uof1 = 1;
          }else {
             uof1 = null;
          }
          if (!uof1) {
             return;
          }else {
             a.s.Q0(a.t);
             a = obj.a;
             a.s.W0(a.t, b);
             a = obj.a;
             Objects.requireNonNull(a);
             if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), obj1, a, uof, "8")) {
                b9.a(a.w);
                a.w = new a();
                if (i >= 1) {
                   List obj3 = PatchProxy.apply(objArray, a, uof, "12");
                   if (obj3 != patchProxyRe) {
                      b1 = obj3.booleanValue();
                   }else if(a.S8()){
                      obj3 = a.f(new d0(a).getType());
                      a.q = obj3;
                      if (q.f(obj3) || !a.q.contains(a.J.getLiveStreamId())) {
                         b1 = true;
                      }
                   }
                   b1 = false;
                   if (b1 && !PatchProxy.applyVoidOneRefs(obj1, a, uof, "11")) {
                      a.w.c(t.just(Boolean.TRUE).delaySubscription((long)obj1.mShowBubbleSecondInterval, TimeUnit.SECONDS, d.a).subscribe(new i(a)));
                   }
                }
             label_00e5 :
                if (i >= 2 && !PatchProxy.applyVoidOneRefs(obj1, a, uof, "10")) {
                   Boolean tRUE = Boolean.TRUE;
                   TimeUnit sECONDS = TimeUnit.SECONDS;
                   z a1 = d.a;
                   a.w.c(t.just(tRUE).delaySubscription((long)obj1.mShowFirstFeedSecondInterval, sECONDS, a1).subscribe(new g(a)));
                   a.w.c(t.just(tRUE).delaySubscription((long)(obj1.mShowFirstFeedSecondInterval + obj1.mShowSecondFeedSecondInterval), sECONDS, a1).subscribe(new h(a)));
                }
                if (i >= 3) {
                   Object obj4 = PatchProxy.apply(objArray, a, uof, "13");
                   if (obj4 != patchProxyRe) {
                      b = obj4.booleanValue();
                   }else if(a.K.a(a.class).l()){
                      f l = a.L;
                      if (l != null && !l.Q6()) {
                      label_017d :
                         b = false;
                      }
                   }
                   List list = a.e(new e0(a).getType());
                   a.r = list;
                   if (q.f(list) || !a.r.contains(a.J.getLiveStreamId())) {
                      b = true;
                   }else {
                      goto label_017d ;
                   }
                   if (b && !PatchProxy.applyVoidOneRefs(obj1, a, uof, "9")) {
                      a.w.c(t.just(Boolean.TRUE).delaySubscription((long)((obj1.mShowFirstFeedSecondInterval + obj1.mShowSecondFeedSecondInterval) * 2), TimeUnit.SECONDS, d.a).subscribe(new e(a, obj1)));
                   }
                }
             }
          label_01af :
             return;
          }
       }
    }
    public void onClose(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "2")) {
          return;
       }
       b9.a(this.a.w);
       return;
    }
}
