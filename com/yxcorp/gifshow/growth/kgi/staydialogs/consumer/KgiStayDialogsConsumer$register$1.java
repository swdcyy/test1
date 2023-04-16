package com.yxcorp.gifshow.growth.kgi.staydialogs.consumer.KgiStayDialogsConsumer$register$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import roa.a;
import qrd.l1;
import qoa.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import p76.g;
import java.lang.Number;
import java.lang.StringBuilder;
import y76.b;
import cra.w;
import q87.c;
import yb6.d;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import s76.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import q2b.h$b;
import k2b.u1;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import com.yxcorp.gifshow.util.rx.RxBus;
import fda.b;
import java.util.Map;
import qe6.b;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager$a;
import qoa.d;
import qoa.b;
import com.yxcorp.gifshow.growth.halfscreenfollow.l;

public final class KgiStayDialogsConsumer$register$1 extends Lambda implements l	// class@0013fb
{
    public static final KgiStayDialogsConsumer$register$1 INSTANCE;

    static {
       KgiStayDialogsConsumer$register$1.INSTANCE = new KgiStayDialogsConsumer$register$1();
    }
    public void KgiStayDialogsConsumer$register$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       c d;
       long l;
       b uob;
       Object obj = p0;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(obj, this, KgiStayDialogsConsumer$register$1.class, "1")) {
          return;
       }
       a.p(obj, "event");
       int i = obj.c.intValue();
       boolean b = false;
       b.e("Consumer#showKgiStayDialogs: dialogValue = "+i, b, 2, null);
       Object[] objArray = new Object[b];
       w.C().t("KgiStayDialogsConsumer", "receive dialog value = "+i, objArray);
       if (i > 0) {
          d = c.d;
          d.c(obj, "trigger");
          l = d.a();
          Objects.requireNonNull(d);
          if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Long.valueOf(l), d, uoc, "11")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "INTELLIGENCE_BUSINESS_INFO";
             i3 oi3 = i3.f();
             oi3.c("business", Integer.valueOf(2));
             a e = a.e;
             oi3.c("duration", Long.valueOf((l - e.a())));
             Long[] longArray = new Long[]{Long.valueOf(e.a()),Long.valueOf(l)};
             oi3.d("progress_time", CollectionsKt__CollectionsKt.L(longArray).toString());
             oi3.c("dialog_value", Integer.valueOf(i));
             uElementPack.params = oi3.e();
             h$b uob1 = h$b.d(b, b);
             uob1.k(uElementPack);
             u1.r0(uob1);
             b.f("TASK", uElementPack);
          }
       }
       if (VisitorModeManager.f()) {
          c.d.c(obj, "trigger_fail");
          return;
       }else if(i != 2){
          long l1 = 0;
          if (i != 16) {
             if (i != 17) {
                switch (i){
                    case 10:
                      d = c.d;
                      d.a();
                      Objects.requireNonNull(d);
                      if (!PatchProxy.applyVoidOneRefs(obj, d, uoc, "4")) {
                         if (!b.a()) {
                            d.c(obj, "trigger_fail");
                         }else if(!NasaFeatureGuideManager.e.a().n()){
                            d.c(obj, "trigger_suc");
                         }
                         uob = new b();
                         uob.c("up_slide");
                         uob.b(l1);
                         RxBus.f.b(uob);
                         c.c.put("up_slide", obj);
                      }
                      break;
                    case 11:
                      d = c.d;
                      d.a();
                      Objects.requireNonNull(d);
                      if (!PatchProxy.applyVoidOneRefs(obj, d, uoc, "5")) {
                         uob = new b();
                         uob.c("left_slide");
                         uob.b(l1);
                         RxBus.f.b(uob);
                         c.c.put("left_slide", obj);
                      }
                      break;
                    case 12:
                      d = c.d;
                      d.a();
                      Objects.requireNonNull(d);
                      if (!PatchProxy.applyVoidOneRefs(obj, d, uoc, "6")) {
                         uob = new b();
                         uob.c("like_guide");
                         uob.b(l1);
                         RxBus.f.b(uob);
                         c.c.put("like_guide", obj);
                      }
                      break;
                    default:
                }
             }else {
                d = c.d;
                d.a();
                Objects.requireNonNull(d);
                if (!PatchProxy.applyVoidOneRefs(obj, d, uoc, "8")) {
                   uob = new b();
                   uob.c("flow_follow");
                   uob.b(l1);
                   RxBus.f.b(uob);
                   c.c.put("flow_follow", obj);
                }
             }
          }else {
             d = c.d;
             d.a();
             Objects.requireNonNull(d);
             if (!PatchProxy.applyVoidOneRefs(obj, d, uoc, "7")) {
                uob = new b();
                uob.c("flow_commont");
                uob.b(l1);
                RxBus.f.b(uob);
                c.c.put("flow_commont", obj);
             }
          }
       }else {
          d = c.d;
          Objects.requireNonNull(d);
          if (!PatchProxy.applyVoidOneRefs(obj, d, uoc, "9")) {
             if (c.a) {
                d.c(obj, "trigger_fail");
             }else {
                c.a = true;
                l.a(b, null, 7, true, new d(obj));
             }
          }
       }
       return;
    }
}
