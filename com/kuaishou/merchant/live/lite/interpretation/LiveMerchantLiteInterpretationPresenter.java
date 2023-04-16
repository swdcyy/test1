package com.kuaishou.merchant.live.lite.interpretation.LiveMerchantLiteInterpretationPresenter;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k64.c;
import su.o;
import kotlin.jvm.internal.a;
import o63.a;
import vu.c;
import c93.b;
import or5.d;
import xp5.i;
import d93.a;
import f93.c;
import ks3.b;
import i64.b;
import f93.b;
import com.kuaishou.render.engine.tk.b;
import com.google.gson.JsonObject;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonElement;
import xp5.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import java.lang.Boolean;
import ot3.u0;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import i64.a;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.Lifecycle$State;

public final class LiveMerchantLiteInterpretationPresenter extends d	// class@001a2f
{
    public i A;
    public b B;
    public View C;
    public c D;
    public b v;
    public a w;
    public c x;
    public d y;
    public b z;

    public void LiveMerchantLiteInterpretationPresenter(){
       super();
    }
    public void E8(){
       LiveMerchantLiteInterpretationPresenter liveMerchant = LiveMerchantLiteInterpretationPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveMerchant, "3")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, liveMerchant, "4")) {
          this.D = new c(this);
          o oo = o.c();
          LiveMerchantLiteInterpretationPresenter tw = this.w;
          if (tw == null) {
             a.S("jsBridgeService");
          }
          oo.a("LIVE_WATCH_LITE", tw.getLiveId(), "lite_explain_pendant", this.D);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantLiteInterpretationPresenter.class, "15")) {
          return;
       }
       super.J8();
       this.c9();
       o oo = o.c();
       LiveMerchantLiteInterpretationPresenter tw = this.w;
       if (tw == null) {
          a.S("jsBridgeService");
       }
       oo.m("LIVE_WATCH_LITE", tw.getLiveId(), this.D);
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantLiteInterpretationPresenter.class, "1")) {
          return;
       }
       this.y = p0.a(d.class);
       this.A = p0.a(i.class);
       this.w = p0.a(a.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantLiteInterpretationPresenter.class, "2")) {
          return;
       }
       this.x = p0.a(c.class);
       this.z = p0.a(b.class);
       return;
    }
    public final void c9(){
       b b;
       if (PatchProxy.applyVoid(null, this, LiveMerchantLiteInterpretationPresenter.class, "14")) {
          return;
       }
       LiveMerchantLiteInterpretationPresenter tB = this.B;
       if (tB != null && !PatchProxy.applyVoid(null, tB, b.class, "2")) {
          b = tB.b;
          if (b != null) {
             b.dismiss();
          }
       }
       this.B = null;
       tB = this.v;
       if (tB != null) {
          tB.i();
       }
       this.v = null;
       return;
    }
    public final Map d9(JsonObject p0){
       LiveMerchantLiteInterpretationPresenter tz;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveMerchantLiteInterpretationPresenter liveMerchant = LiveMerchantLiteInterpretationPresenter.class;
       JsonObject obj = PatchProxy.applyOneRefs(p0, this, liveMerchant, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new JsonObject();
       obj.G("cardData", p0);
       Object[] objArray = null;
       JsonObject jsonObject = PatchProxy.apply(objArray, this, liveMerchant, "12");
       if (jsonObject != patchProxyRe) {
       }else {
          jsonObject = new JsonObject();
          LiveMerchantLiteInterpretationPresenter tw = this.w;
          String str = "jsBridgeService";
          if (tw == null) {
             a.S(str);
          }
          jsonObject.c0("liveId", tw.getLiveId());
          tw = this.w;
          if (tw == null) {
             a.S(str);
          }
          jsonObject.c0("pageId", tw.I4());
          JsonObject jsonObject1 = new JsonObject();
          LiveMerchantLiteInterpretationPresenter ty = this.y;
          if (ty == null) {
             a.S("infoService");
          }
          str = ty.getLiveStreamId();
          String str1 = "";
          if (str == null) {
             str = str1;
          }
          jsonObject1.c0("live_stream_id", str);
          ty = this.y;
          if (ty == null) {
             a.S("infoService");
          }
          str = ty.d();
          if (str != null) {
             str1 = str;
          }
          jsonObject1.c0("anchor_user_id", str1);
          String str2 = PatchProxy.apply(objArray, this, liveMerchant, "13");
          if (str2 != patchProxyRe) {
          }else {
             tz = this.A;
             if (tz == null) {
                a.S("logPackageProvider");
             }
             ClientContent$LiveStreamPackage liveStreamPa = tz.a();
             i3 oi3 = i3.f();
             oi3.d("anchorUserId", liveStreamPa.anchorUserId);
             oi3.c("audienceNumber", Long.valueOf(liveStreamPa.audienceNumber));
             oi3.d("liveStreamId", liveStreamPa.liveStreamId);
             oi3.d("sourceURL", liveStreamPa.sourceUrl);
             oi3.d("sessionId", liveStreamPa.sessionId);
             oi3.a("myFollow", Boolean.valueOf(liveStreamPa.myFollow));
             oi3.d("audienceNumberString", liveStreamPa.audienceNumberString);
             oi3.d("server_exp_tag", liveStreamPa.serverExpTag);
             str2 = oi3.e();
          }
          jsonObject1.c0("liveStreamPackage", str2);
          jsonObject.G("liveParams", jsonObject1);
          tz = this.z;
          if (tz == null) {
             a.S("liteMerchantService");
          }
          jsonObject.c0("routerToken", tz.a());
          jsonObject.a0("resetDataTime", Long.valueOf(u0.b()));
       }
       obj.G("localProps", jsonObject);
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = obj.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          linkedHashMa.put(key, uEntry.getValue());
       }
       return linkedHashMa;
    }
    public final boolean e9(){
       Object[] objArray = null;
       LiveMerchantLiteInterpretationPresenter obj = PatchProxy.apply(objArray, this, LiveMerchantLiteInterpretationPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.B;
       if (obj != null) {
          a uoa = obj.b();
          if (uoa != null) {
             Lifecycle lifecycle = uoa.getLifecycle();
             if (lifecycle != null) {
                objArray = lifecycle.getCurrentState();
             }
          }
       }
       boolean b = (objArray == Lifecycle$State.DESTROYED)? true: false;
       return b;
    }
}
