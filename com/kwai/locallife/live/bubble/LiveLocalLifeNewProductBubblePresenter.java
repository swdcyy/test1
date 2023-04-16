package com.kwai.locallife.live.bubble.LiveLocalLifeNewProductBubblePresenter;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.locallife.live.bubble.LiveLocalLifeNewProductBubblePresenter$mBubbleShowListenerList$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.locallife.live.bubble.LiveLocalLifeNewProductBubblePresenter$b;
import com.kwai.locallife.live.bubble.LiveLocalLifeNewProductBubblePresenter$a;
import com.kwai.locallife.live.bubble.LiveLocalLifeNewProductBubblePresenter$d;
import com.kwai.locallife.live.bubble.LiveLocalLifeNewProductBubblePresenter$c;
import bq5.h;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hf3.a;
import fq5.b;
import com.kuaishou.livestream.message.nano.LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal;
import lf3.g;
import j87.b;
import java.util.Objects;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.a1;
import java.util.Map;
import java.lang.Throwable;
import com.kuaishou.locallife.log.biz.LocalLifeLiveLogBiz;
import mr3.b;
import lr3.d;
import java.lang.Boolean;
import ekd.j;
import fg6.a;
import com.google.gson.Gson;
import com.google.common.collect.ImmutableMap;
import com.kuaishou.livestream.message.nano.LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo;
import com.kuaishou.livestream.message.nano.LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo;
import js6.a;
import android.content.Context;
import j87.h;
import java.util.HashMap;
import lp3.e;
import lp3.c;
import a87.a;

public final class LiveLocalLifeNewProductBubblePresenter extends PresenterV2 implements g	// class@000eb0
{
    public final c A;
    public h p;
    public e q;
    public b r;
    public a s;
    public d t;
    public f u;
    public String v;
    public final p w;
    public final g x;
    public final b$b y;
    public final e z;

    public void LiveLocalLifeNewProductBubblePresenter(){
       super();
       this.v = "";
       this.w = s.c(LiveLocalLifeNewProductBubblePresenter$mBubbleShowListenerList$2.INSTANCE);
       this.x = new LiveLocalLifeNewProductBubblePresenter$b(this);
       this.y = new LiveLocalLifeNewProductBubblePresenter$a(this);
       this.z = new LiveLocalLifeNewProductBubblePresenter$d(this);
       this.A = new LiveLocalLifeNewProductBubblePresenter$c(this);
    }
    public static final h P8(LiveLocalLifeNewProductBubblePresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mLiveBottomBubbleService");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiveLocalLifeNewProductBubblePresenter.class, "3")) {
          return;
       }
       LiveLocalLifeNewProductBubblePresenter tr = this.r;
       if (tr == null) {
          a.S("mLiveBasicContext");
       }
       tr.u().u0(1085, LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal.class, this.x);
       b uob = b.a();
       LiveLocalLifeNewProductBubblePresenter ty = this.y;
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoidOneRefs(ty, uob, b.class, "1")) {
          uob.a.add(ty);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveLocalLifeNewProductBubblePresenter.class, "4")) {
          return;
       }
       LiveLocalLifeNewProductBubblePresenter tr = this.r;
       if (tr == null) {
          a.S("mLiveBasicContext");
       }
       tr.u().o(1085, this.x);
       b uob = b.a();
       LiveLocalLifeNewProductBubblePresenter ty = this.y;
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoidOneRefs(ty, uob, b.class, "2")) {
          uob.a.remove(ty);
       }
       this.S8().clear();
       return;
    }
    public final int R8(){
       Activity obj = PatchProxy.apply(null, this, LiveLocalLifeNewProductBubblePresenter.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.getActivity();
       a.m(obj);
       return ((n.k(obj) - a1.d(0x7f070261)) - 10);
    }
    public final List S8(){
       Object obj = PatchProxy.apply(null, this, LiveLocalLifeNewProductBubblePresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.w.getValue();
    }
    public final void V8(String p0,Map p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, null, this, LiveLocalLifeNewProductBubblePresenter.class, "15")) {
          return;
       }
       d.a("LOCAL_LIFE_LOG_STAT_EVENT", LocalLifeLiveLogBiz.LIVE_ROOM, "LiveLocalLifeNewProductBubblePresenter", p0, p1, null, false, 2);
       return;
    }
    public final boolean W8(LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal p0){
       ImmutableMap immutableMap;
       LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo obj = PatchProxy.applyOneRefs(p0, this, LiveLocalLifeNewProductBubblePresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (j.h(p0.widget)) {
          immutableMap = ImmutableMap.of("data", a.a.q(p0), "isValide", Boolean.FALSE, "invalideReason", "msg.widget is empty");
          a.o(immutableMap, "ImmutableMap.of\(\n       ¡­idget is empty\"\n        \)");
          this.V8("NewProductBubbleConfigVerify", immutableMap, null);
          return false;
       }else {
          obj = p0.widget[0].materialMap;
          if (obj == null) {
             immutableMap = ImmutableMap.of("data", a.a.q(p0), "isValide", Boolean.FALSE, "invalideReason", "msg.materialMap is null");
             a.o(immutableMap, "ImmutableMap.of\(\n       ¡­ialMap is null\"\n        \)");
             this.V8("NewProductBubbleConfigVerify", immutableMap, null);
             return false;
          }else if(obj.configData == null){
             immutableMap = ImmutableMap.of("data", a.a.q(p0), "isValide", Boolean.FALSE, "invalideReason", "widget.materialMap.configData is null");
             a.o(immutableMap, "ImmutableMap.of\(\n       ¡­igData is null\"\n        \)");
             this.V8("NewProductBubbleConfigVerify", immutableMap, null);
             return false;
          }else {
             return true;
          }
       }
    }
    public final void X8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLocalLifeNewProductBubblePresenter.class, "6")) {
          return;
       }
       a.b.pt(this.getActivity(), "LocalLifeNewProductBubbleUpdate", p0);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLocalLifeNewProductBubblePresenter.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveLocalLifeNewProductBubblePresenter.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveLocalLifeNewProductBubblePresenter.class, new h());
       }else {
          obj.put(LiveLocalLifeNewProductBubblePresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveLocalLifeNewProductBubblePresenter.class, "1")) {
          return;
       }
       c obj = this.r8("LIVE_SERVICE_MANAGER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_SERVICE_MANAGER\)");
       this.q = obj;
       obj = obj.a(h.class);
       a.o(obj, "mLiveServiceManager.getS¡­Service::class.java\n    \)");
       this.p = obj;
       Object obj1 = this.r8("LIVE_BASIC_CONTEXT");
       a.o(obj1, "inject\(LiveAccessIds.LIVE_BASIC_CONTEXT\)");
       this.r = obj1;
       obj1 = this.q8(a.class);
       a.o(obj1, "inject\(LiveAudienceLocal¡­omBarService::class.java\)");
       this.s = obj1;
       return;
    }
}
