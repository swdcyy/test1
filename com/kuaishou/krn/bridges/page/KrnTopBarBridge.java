package com.kuaishou.krn.bridges.page.KrnTopBarBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import ik0.m;
import com.kuaishou.krn.title.ButtonParams;
import kk0.c;
import com.kuaishou.krn.title.TopBarParams;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import com.google.gson.Gson;
import java.lang.Integer;
import lj0.d;
import cj0.e;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;
import cj0.f;
import cj0.g;

public class KrnTopBarBridge extends KrnBridge	// class@00082f
{

    public void KrnTopBarBridge(ReactApplicationContext p0){
       super(p0);
    }
    public static void lambda$setTitle$0(m p0,ButtonParams p1){
       c uoc = p0.m1();
       if (uoc != null) {
          uoc.b(p1);
       }
       return;
    }
    public static void lambda$setTopBarButton$2(m p0,ButtonParams p1){
       c uoc = p0.m1();
       if (uoc != null) {
          uoc.d(p1);
       }
       return;
    }
    public static void lambda$setTopBarStyle$1(m p0,TopBarParams p1){
       c uoc = p0.m1();
       if (uoc != null) {
          uoc.a(p1);
       }
       return;
    }
    public final ButtonParams getButtonParams(ReadableMap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnTopBarBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       ButtonParams uButtonParam = this.convertJsonToBean(this.mGson.q(p0.toHashMap()), ButtonParams.class);
       if (uButtonParam == null) {
          return null;
       }
       return uButtonParam;
    }
    public String getName(){
       return "KRNTopBar";
    }
    public final TopBarParams getTopBarParams(ReadableMap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnTopBarBridge.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       TopBarParams topBarParams = this.convertJsonToBean(this.mGson.q(p0.toHashMap()), TopBarParams.class);
       if (topBarParams == null) {
          return null;
       }
       return topBarParams;
    }
    public void setTitle(int p0,ReadableMap p1){
       KrnTopBarBridge krnTopBarBri = KrnTopBarBridge.class;
       if (PatchProxy.isSupport(krnTopBarBri) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, krnTopBarBri, "3")) {
          return;
       }
       m om = d.c(p0);
       if (om == null) {
          return;
       }
       ButtonParams buttonParams = this.getButtonParams(p1);
       if (buttonParams == null) {
          return;
       }
       UiThreadUtil.runOnUiThread(new e(om, buttonParams));
       return;
    }
    public void setTopBarButton(int p0,ReadableMap p1){
       KrnTopBarBridge krnTopBarBri = KrnTopBarBridge.class;
       if (PatchProxy.isSupport(krnTopBarBri) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, krnTopBarBri, "5")) {
          return;
       }
       m om = d.c(p0);
       if (om == null) {
          return;
       }
       ButtonParams buttonParams = this.getButtonParams(p1);
       if (buttonParams == null) {
          return;
       }
       UiThreadUtil.runOnUiThread(new f(om, buttonParams));
       return;
    }
    public void setTopBarStyle(int p0,ReadableMap p1){
       KrnTopBarBridge krnTopBarBri = KrnTopBarBridge.class;
       if (PatchProxy.isSupport(krnTopBarBri) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, krnTopBarBri, "4")) {
          return;
       }
       m om = d.c(p0);
       if (om == null) {
          return;
       }
       TopBarParams topBarParams = this.getTopBarParams(p1);
       if (topBarParams == null) {
          return;
       }
       UiThreadUtil.runOnUiThread(new g(om, topBarParams));
       return;
    }
}
