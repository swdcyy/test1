package com.yxcorp.gifshow.relation.krn.SocialRelationBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.yxcorp.gifshow.relation.krn.SocialRelationBridge$c;
import nsd.u;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import java.lang.Class;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.relation.krn.SocialRelationBridge$h;
import com.facebook.react.bridge.ReactContext;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.relation.krn.SocialRelationBridge$f;
import wca.q;
import com.yxcorp.gifshow.relation.krn.SocialRelationBridge$b;
import mac.l;
import com.yxcorp.gifshow.relation.krn.SocialRelationBridge$e;
import cda.j;
import com.yxcorp.gifshow.relation.krn.SocialRelationBridge$g;
import wkd.b;
import mu7.e;
import mu7.e$a;
import com.yxcorp.gifshow.relation.krn.SocialRelationBridge$a;
import java.lang.Runnable;
import ekd.k1;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.Promise;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import java.util.HashMap;
import com.facebook.react.bridge.WritableMap;
import lu7.f;
import java.lang.Exception;
import java.lang.Throwable;
import org.json.JSONArray;
import org.json.JSONObject;
import fg6.a;
import com.kwai.framework.model.user.RichTextMeta;
import com.google.gson.Gson;
import com.kwai.user.base.RichTextMetaExt;
import com.facebook.react.bridge.BaseJavaModule;
import lj0.c;
import lj0.d;
import bi5.a;

public final class SocialRelationBridge extends KrnBridge	// class@001932
{
    public SocialRelationBridge$f aliasListener;
    public b blockEventDisposable;
    public b favoriteDisposable;
    public b notifyDisposable;
    public b shakeDisposable;
    public b slidePlayReportDisposable;
    public static final SocialRelationBridge$c Companion;

    static {
       SocialRelationBridge.Companion = new SocialRelationBridge$c(null);
    }
    public void SocialRelationBridge(ReactApplicationContext p0){
       a.p(p0, "context");
       super(p0);
       RxBus f = RxBus.f;
       z c = d.c;
       b uob = f.f(n.class).observeOn(c).subscribe(new SocialRelationBridge$h(p0));
       a.o(uob, "RxBus.INSTANCE.toObserva¡­yFollowConsumer\(context\)\)");
       this.shakeDisposable = uob;
       this.aliasListener = new SocialRelationBridge$f(p0);
       this.blockEventDisposable = f.f(q.class).observeOn(c).subscribe(new SocialRelationBridge$b(p0));
       this.favoriteDisposable = f.f(l.class).observeOn(c).subscribe(new SocialRelationBridge$e(p0));
       this.slidePlayReportDisposable = f.f(j.class).observeOn(c).subscribe(new SocialRelationBridge$g(p0));
       b.a(-1878684066).e(this.aliasListener);
       k1.o(new SocialRelationBridge$a(this, p0));
    }
    public final void getLocalName(ReadableArray p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SocialRelationBridge.class, "3")) {
          return;
       }
       a.p(p0, "readableArray");
       a.p(p1, "promise");
       String name = this.getName();
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       String str = "getLocalName";
       try{
          this.reportAndCheck(name, str, reactApplica);
          WritableArray writableArra = Arguments.createArray();
          int i1 = p0.size();
          for (int i = 0; i < i1; i = i + 1) {
             ReadableMap map = p0.getMap(i);
             a.m(map);
             HashMap hashMap = map.toHashMap();
             a.o(hashMap, "readableArray.getMap\(i\)!!.toHashMap\(\)");
             Object obj = hashMap.get("contact");
             String str1 = hashMap.get("userId");
             WritableMap writableMap = Arguments.createMap();
             if (obj != null) {
                writableMap.putString("contactName", "");
             }
             writableMap.putString("userId", str1);
             writableMap.putString("remarkName", f.b(str1, null));
             writableArra.pushMap(writableMap);
          }
          p1.resolve(writableArra);
       }catch(java.lang.Exception e9){
          e9.printStackTrace();
          p1.reject(e9);
       }
       return;
    }
    public String getName(){
       return "KRNSocialRelation";
    }
    public final void getRecoText(String p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SocialRelationBridge.class, "2")) {
          return;
       }
       a.p(p0, "jsonString");
       a.p(p1, "promise");
       String name = this.getName();
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       String str = "getRecoText";
       try{
          this.reportAndCheck(name, str, reactApplica);
          WritableArray writableArra = Arguments.createArray();
          JSONArray jSONArray = new JSONArray(p0);
          int i = 0;
          int i1 = jSONArray.length();
          while (i < i1) {
             JSONObject jSONObject = jSONArray.getJSONObject(i);
             double d = jSONObject.optDouble("userId");
             jSONObject = jSONObject.optJSONObject("recoTextInfo");
             if (jSONObject != null) {
                WritableMap writableMap = Arguments.createMap();
                writableMap.putDouble("userId", d);
                writableMap.putString("recoText", RichTextMetaExt.f(a.a.h(jSONObject.toString(), RichTextMeta.class), 9));
                writableArra.pushMap(writableMap);
             }
             i++;
          }
          p1.resolve(writableArra);
       }catch(java.lang.Exception e10){
          e10.printStackTrace();
          p1.reject(e10);
       }
       return;
    }
    public void onCatalystInstanceDestroy(){
       if (PatchProxy.applyVoid(null, this, SocialRelationBridge.class, "1")) {
          return;
       }
       super.onCatalystInstanceDestroy();
       b.a(-1878684066).g(this.aliasListener);
       this.shakeDisposable.dispose();
       this.blockEventDisposable.dispose();
       this.favoriteDisposable.dispose();
       this.slidePlayReportDisposable.dispose();
       this.slidePlayReportDisposable.dispose();
       SocialRelationBridge tnotifyDispo = this.notifyDisposable;
       if (tnotifyDispo != null) {
          tnotifyDispo.dispose();
       }
       return;
    }
    public final void reportAndCheck(String p0,String p1,ReactApplicationContext p2){
       String str1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, SocialRelationBridge.class, "4")) {
          return;
       }
       c uoc = d.a(p2);
       String str = "";
       if (uoc != null) {
          str = uoc.b();
          str1 = uoc.f();
       }else {
          str1 = str;
       }
       a.a(p0, p1, str, str1);
       return;
    }
}
