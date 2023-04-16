package com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$richCardDetailKrnInfoListener$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$richCardDetailKrnInfoListener$1;
import java.util.Map;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import uw1.m;
import com.kuaishou.live.core.show.redpacket.richcard.handler.RichCardEffectHandler;
import crd.b;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import bi2.g;
import com.kuaishou.live.core.show.redpacket.richcard.http.RichCardInfo;
import com.kuaishou.live.core.show.redpacket.richcard.http.UsingCardInfo;
import java.lang.Long;
import java.lang.Integer;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$handleKrnMessage$3;
import kotlin.jvm.internal.a;
import brd.t;
import ci2.b;
import ci2.b$a;
import cjd.e;
import erd.o;
import ai2.h;
import erd.g;
import ai2.i;
import yh2.a;
import ai2.j;
import ai2.k;
import yh2.b;

public final class LiveRichCardCoreManager$richCardDetailKrnInfoListener$1$1 extends Lambda implements a	// class@000f52
{
    public final Map $value;
    public final LiveRichCardCoreManager$richCardDetailKrnInfoListener$1 this$0;

    public void LiveRichCardCoreManager$richCardDetailKrnInfoListener$1$1(LiveRichCardCoreManager$richCardDetailKrnInfoListener$1 p0,Map p1){
       this.this$0 = p0;
       this.$value = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       LiveRichCardCoreManager$richCardDetailKrnInfoListener$1 b;
       LiveRichCardCoreManager z;
       LiveRichCardCoreManager s;
       t ot;
       LiveRichCardCoreManager$richCardDetailKrnInfoListener$1 obj = this;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, obj, LiveRichCardCoreManager$richCardDetailKrnInfoListener$1$1.class, str)) {
          return;
       }
       LiveRichCardCoreManager$richCardDetailKrnInfoListener$1$1 $value = obj.$value;
       if ($value != null) {
          String str1 = "status";
          if ($value.get(str1) != null) {
             String str2 = obj.$value.get(str1);
             Object obj1 = obj.$value.get("source");
             LiveRichCardCoreManager obj2 = obj.$value.get("activityBiz");
             LiveRichCardStateManager h = LiveRichCardStateManager.h;
             b.T(h.f().appendTag(obj.this$0.b.m()), "[observeKrnMessage], value error", "status", str2, "activityBiz", obj2);
             if (str2 != null) {
                b = obj.this$0.b;
                Objects.requireNonNull(b);
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                if (!PatchProxy.applyVoidThreeRefs(str2, obj1, obj2, b, LiveRichCardCoreManager.class, "33")) {
                   b.N.D0();
                   String str3 = "";
                   int i = 1;
                   switch (str2.hashCode()){
                       case '1':
                         LiveRichCardCoreManager$richCardDetailKrnInfoListener$1 orichCardDet = b;
                         if (str2.equals(str)) {
                            if (a.g("h5", obj1)) {
                               z = orichCardDet.z;
                               if (z != null) {
                                  z.dispose();
                               }
                               str2 = (obj2 != null)? obj2: str3;
                               s = orichCardDet.S;
                               LiveRichCardCoreManager u = orichCardDet.U;
                               Objects.requireNonNull(h);
                               LiveRichCardCoreManager liveRichCard = u;
                               LiveRichCardCoreManager liveRichCard1 = u;
                               obj = orichCardDet;
                               ot = PatchProxy.applyThreeRefs(str2, s, liveRichCard, h, LiveRichCardStateManager.class, "4");
                               if (ot != patchProxyRe) {
                               }else {
                                  a.p(str2, "activityBiz");
                                  a.p(s, "visitorId");
                                  a.p(liveRichCard1, "liveStreamId");
                                  ot = b.a.a().c(str2, liveRichCard1).map(new e()).doOnNext(h.b).doOnError(i.b);
                                  a.o(ot, "LiveRichCardApiService.g¡­ShowFailToast\(it\)\n      }");
                               }
                               obj.z = ot.subscribe(new a(obj, obj2));
                            }else {
                               obj = orichCardDet;
                               z = obj.y;
                               if (z != null) {
                                  z.dispose();
                               }
                               str2 = LiveRichCardCoreManager.g(obj, objArray, i, objArray);
                               if (str2 == null) {
                                  str2 = str3;
                               }
                               s = obj.S;
                               obj2 = obj.U;
                               Objects.requireNonNull(h);
                               ot = PatchProxy.applyThreeRefs(str2, s, obj2, h, LiveRichCardStateManager.class, "3");
                               if (ot != patchProxyRe) {
                               }else {
                                  a.p(str2, "activityBiz");
                                  a.p(s, "visitorId");
                                  a.p(obj2, "liveStreamId");
                                  ot = b.a.a().d(str2, obj2).map(new e()).doOnNext(j.b).doOnError(k.b);
                                  a.o(ot, "LiveRichCardApiService.g¡­ShowFailToast\(it\)\n      }");
                               }
                               obj.y = ot.subscribe(new b(obj));
                            }
                         }
                         break;
                       case '2':
                         if (str2.equals("2")) {
                            z = b.A;
                            if (z != null) {
                               z.dispose();
                            }
                            str2 = LiveRichCardCoreManager.g(b, objArray, i, objArray);
                            String str4 = (str2 != null)? str2: str3;
                            z = b.S;
                            LiveRichCardCoreManager u1 = b.U;
                            g og = b.o.a();
                            if (og != null) {
                               RichCardInfo richCardInfo = og.b();
                               if (richCardInfo != null) {
                                  UsingCardInfo usingCardInf = richCardInfo.getUsingCardInfo();
                                  if (usingCardInf != null) {
                                     objArray = Long.valueOf(usingCardInf.getCardId());
                                  }
                               }
                            }
                            b.A = h.c(str4, z, u1, objArray, Integer.valueOf(i), new LiveRichCardCoreManager$handleKrnMessage$3(b));
                         }
                         break;
                       case '3':
                         if (str2.equals("3")) {
                            b.k.b = false;
                            if (b.g == null) {
                               b.f(objArray);
                            }
                            b.B();
                         }
                         break;
                       case '4':
                         if (str2.equals("4")) {
                            b.k.c();
                            b.B();
                         }
                         break;
                       default:
                   }
                }
             }
             return;
          }
       }
       b.P(LiveRichCardStateManager.h.f().appendTag(this.this$0.b.m()), "[observeKrnMessage], value error");
       return;
    }
}
