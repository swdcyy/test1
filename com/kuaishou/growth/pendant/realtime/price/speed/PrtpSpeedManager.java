package com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedSwitchConfig;
import com.kwai.sdk.switchconfig.a;
import io7.f;
import ye0.a$a;
import ye0.b;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedInferResult;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedInferResult$a;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedManager$b;
import android.os.Handler;
import tb7.b;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedManager$a;
import kotlin.Pair;
import java.lang.Float;
import java.lang.System;
import kotlin.Triple;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import com.yxcorp.utility.SystemUtil;
import android.os.Build$VERSION;
import java.lang.Runnable;
import java.lang.CharSequence;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Iterable;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import yb6.d;
import java.lang.Math;
import we0.m;
import ze0.a;
import java.util.Map;
import java.lang.Long;
import zsd.t;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import ue0.a;
import android.content.SharedPreferences;
import java.util.Objects;
import we0.q;
import com.yxcorp.gifshow.entity.QPhoto;
import ye0.d;
import org.json.JSONObject;
import java.util.ArrayList;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import com.kwai.sdk.eve.proto.CustomEvent$Builder;
import com.kwai.sdk.eve.proto.CustomEvent;
import qrd.l1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.growth.pendant.realtime.price.init.PrtpInitModule;
import com.kuaishou.growth.pendant.realtime.price.init.PrtpInitModule$a;
import bf0.f;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedManager$report$1;
import ze0.l;
import msd.a;
import ze0.f;
import ze0.e;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedEveWrapper$activate$2;
import com.kwai.edge.reco.afk.model.AFKData;

public final class PrtpSpeedManager	// class@0006cb
{
    public static PrtpSpeedSwitchConfig a;
    public static PrtpSpeedInferResult b;
    public static float c;
    public static AFKData d;
    public static float e;
    public static float f;
    public static long g;
    public static float h;
    public static Float i;
    public static final a j;
    public static final Handler k;
    public static final Runnable l;
    public static float m;
    public static Pair n;
    public static Pair o;
    public static long p;
    public static Pair q;
    public static long r;
    public static final PrtpSpeedManager s;

    static {
       PrtpSpeedManager prtpSpeedMan = new PrtpSpeedManager();
       PrtpSpeedManager.s = prtpSpeedMan;
       PrtpSpeedSwitchConfig prtpSpeedSwi = PatchProxy.apply(null, prtpSpeedMan, PrtpSpeedManager.class, "3");
       if (prtpSpeedSwi != PatchProxyResult.class) {
       }else {
          PrtpSpeedSwitchConfig prtpSpeedSwi1 = prtpSpeedMan.f(a.t().f("GrowthPendantSpeedConfig"));
          prtpSpeedSwi = prtpSpeedSwi1;
       }
       PrtpSpeedManager.a = prtpSpeedSwi;
       PrtpSpeedManager.b = PrtpSpeedInferResult.Companion.b();
       PrtpSpeedManager.c = 0x3f800000;
       PrtpSpeedManager.f = 0x3f800000;
       PrtpSpeedManager.j = PrtpSpeedManager$b.b;
       PrtpSpeedManager.k = b.d();
       PrtpSpeedManager.l = PrtpSpeedManager$a.b;
       PrtpSpeedManager.n = new Pair(Float.valueOf(0), Float.valueOf(0));
       PrtpSpeedManager.o = new Pair(Float.valueOf(0), Float.valueOf(0));
       PrtpSpeedManager.p = -1;
       PrtpSpeedManager.q = new Pair(Float.valueOf(0), Float.valueOf(0));
       PrtpSpeedManager.r = System.currentTimeMillis();
    }
    public void PrtpSpeedManager(){
       super();
    }
    public final Pair a(Pair p0,Triple p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PrtpSpeedManager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Pair(Float.valueOf((p0.getFirst().floatValue() + p1.getFirst().floatValue())), Float.valueOf((p0.getSecond().floatValue() + p1.getSecond().floatValue())));
    }
    public final void b(Triple p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrtpSpeedManager.class, "14")) {
          return;
       }
       a.p(p0, "another");
       float f = p0.getThird().floatValue();
       PrtpSpeedManager.m = f;
       if (f - (float)0 < 0) {
          PrtpSpeedManager.m = 0;
       }
       if (PrtpSpeedManager.m - (float)1 > 0) {
          PrtpSpeedManager.m = 0x3f800000;
       }
       PrtpSpeedManager.n = this.a(PrtpSpeedManager.n, p0);
       PrtpSpeedManager.q = this.a(PrtpSpeedManager.q, p0);
       long l = System.currentTimeMillis();
       if ((l - PrtpSpeedManager.r) - (long)2000 > 0) {
          PrtpSpeedManager.r = l;
          a$a.g(b.a(), "PrtpSpeedTime#addProgress : "+"\n = speedRatio = "+PrtpSpeedManager.b.inferResultRatio+", "+"\n = timeFromLaunch = "+this.j(PrtpSpeedManager.n.getFirst().floatValue())+", "+"\n = deltaTimeFromLaunch = "+this.j(PrtpSpeedManager.n.getSecond().floatValue())+", "+"\n = timeFromReport = "+this.j(PrtpSpeedManager.q.getFirst().floatValue())+", "+"\n = deltaTimeFromReport = "+this.j(PrtpSpeedManager.q.getSecond().floatValue()), false, true, 2, null);
       }
       return;
    }
    public final PrtpSpeedSwitchConfig c(){
       return PrtpSpeedManager.a;
    }
    public final Boolean d(){
       Object obj = PatchProxy.apply(null, this, PrtpSpeedManager.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = (SystemUtil.I() && Build$VERSION.SDK_INT >= 29)? PrtpSpeedManager.k.hasCallbacks(PrtpSpeedManager.l): false;
       return Boolean.valueOf(b);
    }
    public final void e(String p0,PrtpSpeedInferResult p1){
       long l;
       PrtpSpeedInferResult prtpSpeedInf;
       Handler obj = p0;
       Runnable obj1 = p1;
       PrtpSpeedManager prtpSpeedMan = PrtpSpeedManager.class;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, this, prtpSpeedMan, "8")) {
          return;
       }
       a.p(obj, "uid");
       a.p(obj1, "inferResult");
       int i = 1;
       char[] uocharArray = new char[i];
       uocharArray[0] = ',';
       a$a.i(b.a(), "PrtpSpeedInfer#PrtpSpeedManager#notifyInferSuccess : "+"\nuid = "+obj+", "+"\ninferResult ===>"+10+CollectionsKt___CollectionsKt.V2(StringsKt__StringsKt.G4(p1.toString(), uocharArray, false, 0, 6, null), "\n", null, null, 0, null, null, 62, null), 0, 2, null);
       QCurrentUser qCurrentUser = QCurrentUser.me();
       String id = (qCurrentUser != null)? qCurrentUser.getId(): null;
       if (a.g(obj, id)) {
          PrtpSpeedManager.b = obj1;
          obj = PatchProxy.apply(null, null, prtpSpeedMan, "1");
          float f = 0x3f800000;
          if (obj != PatchProxyResult.class) {
             f = obj.floatValue();
          }else if(SystemUtil.K() && a.d()){
             Float i1 = PrtpSpeedManager.i;
             if (i1 != null && i1.floatValue() - (float)0 > 0) {
                f = i1.floatValue();
             }
          }
          PrtpSpeedManager s = PrtpSpeedManager.s;
          PrtpSpeedSwitchConfig prtpSpeedSwi = s.c();
          if (prtpSpeedSwi != null) {
             PrtpSpeedInferResult inferResultR = PrtpSpeedManager.b.inferResultRatio;
             float f1 = (d.a() - PrtpSpeedManager.g < 0)? PrtpSpeedManager.f: 0x3f800000;
             if (prtpSpeedSwi.enable != null) {
                prtpSpeedInf = inferResultR;
             }else if(prtpSpeedSwi.afkEnable != null){
                prtpSpeedInf = f1;
             }else if(prtpSpeedSwi.minEnable != null){
                prtpSpeedInf = Math.min(inferResultR, f1);
             }else {
                prtpSpeedInf = 0x3f800000;
             }
             Float uFloat = Float.valueOf(prtpSpeedInf);
             StringBuilder str1 = (uFloat.floatValue() - (float)0 > 0)? 1: null;
             if (!str1) {
                uFloat = null;
             }
             if (uFloat != null) {
                f = uFloat.floatValue();
             }
             if (f - PrtpSpeedManager.h) {
                a$a.i(b.a(), "PrtpSpeedManager#speedRatio : change ==>"+"\n inferRatio = "+inferResultR+"\n afkRatio = "+f1+"\n finalRatio = "+f+"\n switch = "+m.c(s.c(), null, 2, null), 0, 2, null);
             }
             PrtpSpeedManager.h = f;
          }
          PrtpSpeedManager.c = f;
          a$a.f(b.a(), "PrtpSpeedInfer#postDelayed : before rm = "+this.d(), 0, 2, null);
          obj = PrtpSpeedManager.k;
          obj1 = PrtpSpeedManager.l;
          obj.removeCallbacks(obj1);
          a$a.f(b.a(), "PrtpSpeedInfer#postDelayed : after rm = "+this.d(), 0, 2, null);
          if (a.d(this.c())) {
             PrtpSpeedInferResult inferResultM = PrtpSpeedManager.b.inferResultMap;
             if (inferResultM != null) {
                String str = inferResultM.get("invalid_duration_ms");
                if (str != null) {
                   Long longx = t.Z0(str);
                   if (longx != null) {
                      if (longx.longValue() - (long)1000 < 0) {
                         i = 0;
                      }
                      if (!i) {
                         longx = null;
                      }
                      if (longx != null) {
                         l = longx.longValue();
                      label_01ca :
                         a$a.i(b.a(), "PrtpSpeedInfer#postDelayed : timeout = "+l+' ', 0, 2, null);
                         if (l - null > 0) {
                            a$a.f(b.a(), "PrtpSpeedInfer#postDelayed : before add = "+this.d(), 0, 2, null);
                            obj.postDelayed(obj1, l);
                            a$a.f(b.a(), "PrtpSpeedInfer#postDelayed : after add = "+this.d(), 0, 2, null);
                            a$a.f(b.a(), "PrtpSpeedInfer#postDelayed : timeout \( "+l+" \) ===> inferFromTimeout ", 0, 2, null);
                         }
                      }
                   }
                }
             }
             l = -1;
             goto label_01ca ;
          }
       }
    label_0245 :
       return;
    }
    public final PrtpSpeedSwitchConfig f(f p0){
       PrtpSpeedSwitchConfig obj = PatchProxy.applyOneRefs(p0, this, PrtpSpeedManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       JsonElement jsonElement = (p0 != null)? p0.c(): obj;
       String str = String.valueOf(jsonElement);
       a$a.f(b.a(), "PrtpSpeedManager#obtainSpeedSwitchConfig : onlineConfigStr = "+str, false, 2, obj);
       PrtpSpeedSwitchConfig prtpSpeedSwi = m.a(str, PrtpSpeedSwitchConfig.class, obj, 4, obj);
       a$a.f(b.a(), "PrtpSpeedManager#obtainSpeedSwitchConfig : onlineConfig = "+prtpSpeedSwi, false, 2, obj);
       if (SystemUtil.K()) {
          SharedPreferences a = a.a;
          if (a.getBoolean("prtpSpeedConfigTest", false)) {
             Objects.requireNonNull(PrtpSpeedSwitchConfig.Companion);
             prtpSpeedSwi = PrtpSpeedSwitchConfig.TEST;
          }else if(a.getBoolean("prtpSpeedAfkConfigTest", false)){
             Objects.requireNonNull(PrtpSpeedSwitchConfig.Companion);
             prtpSpeedSwi = PrtpSpeedSwitchConfig.TEST_AFK;
          }
       }
       a$a.i(b.a(), "PrtpSpeedManager#obtainSpeedSwitchConfig : finalConfig = "+prtpSpeedSwi, false, 2, obj);
       obj = prtpSpeedSwi;
       return obj;
    }
    public final void g(String p0){
       q b;
       String photoId;
       if (PatchProxy.applyVoidOneRefs(p0, this, PrtpSpeedManager.class, "7")) {
          return;
       }
       String str = "inferFrom";
       a.p(p0, str);
       if (!a.f(this.c())) {
          return;
       }
       a$a uoa = b.a();
       StringBuilder str1 = "PrtpSpeedInfer#postInferEvent : ========>  inferFrom = "+p0+"\n ========> photoId = ";
       b = q.b;
       QPhoto qPhoto = b.a();
       photoId = (qPhoto != null)? qPhoto.getPhotoId(): null;
       str1 = str1+photoId+"\n ========> title = ";
       QPhoto qPhoto1 = b.a();
       String caption = (qPhoto1 != null)? qPhoto1.getCaption(): null;
       a$a.i(uoa, str1+caption, false, 2, null);
       PrtpSpeedManager.b = PrtpSpeedInferResult.Companion.b();
       d d = d.d;
       Objects.requireNonNull(d);
       if (!PatchProxy.applyVoidOneRefs(p0, d, d.class, "21")) {
          a.p(p0, "from");
          JSONObject jSONObject = new JSONObject();
          d.g(jSONObject);
          jSONObject.put(str, p0);
          d.c(a.c(), a.b(PrtpSpeedManager.s.c()), "prtp_speed_post_infer_event", jSONObject, d.c);
       }
       CustomEvent$Builder uBuilder = CustomEvent.newBuilder();
       uBuilder.setCustomKey("GrowthPendantSpeedInfer");
       uBuilder.setCustomValue(p0);
       GeneratedMessageLite generatedMes = uBuilder.build();
       a.o(generatedMes, "CustomEvent.newBuilder\(\)бн= inferFrom\n    }.build\(\)");
       EveManagerWrapper.e.n(generatedMes);
       return;
    }
    public final void h(){
       float f4;
       float f5;
       long l4;
       float f6;
       long l5;
       long l6;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, PrtpSpeedManager.class, "20")) {
          return;
       }
       int i = 2;
       boolean b = false;
       if (!a.e(this.c())) {
          a$a.f(b.a(), "PrtpSpeedManager#realReport : NOT ENABLE !!! ", b, i, objArray);
          return;
       }else {
          a$a.f(b.a(), "PrtpSpeedManager#realReport : >>> >>>", b, i, objArray);
          Pair n = PrtpSpeedManager.n;
          float f = n.component1().floatValue();
          float f1 = n.component2().floatValue();
          n = PrtpSpeedManager.q;
          float f2 = n.component1().floatValue();
          float f3 = n.component2().floatValue();
          PrtpSpeedManager.q = new Pair(Float.valueOf(0), Float.valueOf(0));
          d d = d.d;
          long l = obj.j(f2);
          long l1 = obj.j(f3);
          long l2 = obj.j(f);
          long l3 = obj.j(f1);
          Objects.requireNonNull(d);
          if (PatchProxy.isSupport(d.class)) {
             f4 = f2;
             f5 = f;
             l4 = l2;
             f6 = f1;
             l5 = l3;
             l6 = l1;
             if (PatchProxy.applyVoidFourRefs(Long.valueOf(l), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), d, d.class, "25")) {
             label_0133 :
                PrtpSpeedManager prtpSpeedMan = this;
                a$a.g(b.a(), "PrtpSpeedTime#reportProgress : "+"\n = speedRatio = "+PrtpSpeedManager.b.inferResultRatio+", "+"\n = timeFromLaunch = "+prtpSpeedMan.j(f5)+", "+"\n = deltaTimeFromLaunch = "+prtpSpeedMan.j(f6)+", "+"\n = timeFromReport = "+prtpSpeedMan.j(f4)+", "+"\n = deltaTimeFromReport = "+prtpSpeedMan.j(f3), false, true, 2, null);
                return;
             }
          }else {
             f5 = f;
             f6 = f1;
             f4 = f2;
             l5 = l3;
             l4 = l2;
             l6 = l1;
          }
          JSONObject jSONObject = new JSONObject();
          d.g(jSONObject);
          jSONObject.put("current_time", d.a());
          String str = "is_foreground";
          PrtpInitModule$a y = PrtpInitModule.y;
          int i1 = (y.g())? 1: 0;
          jSONObject.put(str, i1);
          jSONObject.put("cold_launch_time", y.a());
          jSONObject.put("open_app_time", y.f());
          jSONObject.put("on_foreground_time", y.e());
          jSONObject.put("on_background_time", y.d());
          jSONObject.put("total_time", l);
          jSONObject.put("delta_time", l6);
          jSONObject.put("total_time_from_launch", l4);
          jSONObject.put("delta_time_from_launch", l5);
          d.a("prtp_speed_report_time", jSONObject, d.c);
          goto label_0133 ;
       }
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, PrtpSpeedManager.class, "19")) {
          return;
       }
       if (!a.e(this.c())) {
          return;
       }
       this.h();
       Handler handler = f.d.c();
       if (handler != null) {
          handler.postDelayed(new l(new PrtpSpeedManager$report$1(this)), a.a(this.c()));
       }
       return;
    }
    public final long j(float p0){
       return (long)(p0 / (float)1000);
    }
    public final void k(){
       d d;
       JSONObject jSONObject;
       d uod = d.class;
       f uof = f.class;
       String str = "5";
       if (PatchProxy.applyVoid(null, this, PrtpSpeedManager.class, str)) {
          return;
       }
       PrtpSpeedSwitchConfig prtpSpeedSwi = this.c();
       if (prtpSpeedSwi != null) {
          if (a.f(prtpSpeedSwi)) {
             if (!PatchProxy.applyVoid(null, null, uof, str)) {
                a$a.i(b.a(), "PrtpSpeedEveWrapper#activate : ", false, 2, null);
                if (f.b) {
                   a$a.i(b.a(), "PrtpSpeedEveWrapper#activate : has activated nothing to do ===> ", false, 2, null);
                }else {
                   f.b = true;
                   EveManagerWrapper.e.b("GrowthPendantSpeed", new e(), PrtpSpeedEveWrapper$activate$2.INSTANCE);
                   d = d.d;
                   Objects.requireNonNull(d);
                   if (!PatchProxy.applyVoid(null, d, uod, "19")) {
                      jSONObject = new JSONObject();
                      d.g(jSONObject);
                      d.a("prtp_speed_activate_eve", jSONObject, d.c);
                   }
                }
             }
          }else if(PatchProxy.applyVoid(null, null, uof, "6")){
             a$a.i(b.a(), "PrtpSpeedEveWrapper#deactivate : ", false, 2, null);
             if (!f.b) {
                a$a.i(b.a(), "PrtpSpeedEveWrapper#deactivate : not activated nothing to do ===> ", false, 2, null);
             }else {
                f.b = false;
                EveManagerWrapper.e.f("GrowthPendantSpeed");
                d = d.d;
                Objects.requireNonNull(d);
                if (!PatchProxy.applyVoid(null, d, uod, "20")) {
                   jSONObject = new JSONObject();
                   d.g(jSONObject);
                   d.a("prtp_speed_deactivate_eve", jSONObject, d.c);
                }
             }
          }
       }
       return;
    }
    public final void onAfkEvent(AFKData p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, PrtpSpeedManager.class, "21")) {
          return;
       }
       a$a.b(b.a(), "PrtpSpeedManager#onAfkEvent : afkData = "+m.c(p0, null, 2, null), false, 2, null);
       if (p0 != null) {
          int i = 1;
          if ((a.g(PrtpSpeedManager.d, p0) ^ i) && a.d(this.c())) {
             this.g("afk");
          }
          PrtpSpeedManager.d = p0;
          PrtpSpeedSwitchConfig prtpSpeedSwi = 0x3f800000;
          if (p0.a()) {
             PrtpSpeedSwitchConfig prtpSpeedSwi1 = this.c();
             if (prtpSpeedSwi1 != null) {
                prtpSpeedSwi = prtpSpeedSwi1.afkRatio;
             }
          }
          PrtpSpeedManager.f = prtpSpeedSwi;
          Long longx = Long.valueOf(p0.c);
          if (longx.longValue() <= 0) {
             i = 0;
          }
          if (!i) {
             str = null;
          }
          long l = (longx != null)? longx.longValue(): 0x4e20;
          PrtpSpeedManager.g = d.a() + l;
          str = "PrtpSpeedManager#onAfkEvent : "+"\n = mAfkRatio = "+PrtpSpeedManager.e+" -> "+PrtpSpeedManager.f+"\n = intervalMs = "+l+"\n = mAfkTimeout = "+PrtpSpeedManager.g;
          if (PrtpSpeedManager.f - PrtpSpeedManager.e) {
             a$a.i(b.a(), str, false, 2, null);
          }else {
             a$a.b(b.a(), str, false, 2, null);
          }
          PrtpSpeedManager.e = PrtpSpeedManager.f;
       }
       return;
    }
}
