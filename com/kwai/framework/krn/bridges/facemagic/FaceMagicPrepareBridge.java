package com.kwai.framework.krn.bridges.facemagic.FaceMagicPrepareBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import android.content.Context;
import com.plugin.facemagic.ProxyFaceMagic;
import zzc.a;
import java.lang.Class;
import lnc.pa;
import lnc.qa;
import java.lang.String;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.kds.facemagic.FMEffectRenderViewManager;
import gs6.e;
import com.kwai.framework.krn.bridges.facemagic.b;
import lk8.b;
import com.kwai.framework.krn.bridges.facemagic.FaceMagicPrepareBridge$a;
import com.kwai.framework.krn.bridges.facemagic.a;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a;
import lnc.t;
import g86.b;
import com.kwai.framework.krn.bridges.facemagic.a$a;
import g86.c;
import erd.a;
import erd.g;
import crd.b;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;

public class FaceMagicPrepareBridge extends KrnBridge	// class@0015ab
{

    public void FaceMagicPrepareBridge(ReactApplicationContext p0){
       super(p0);
    }
    public static ProxyFaceMagic lambda$preLoad$0(Context p0){
       return qa.r(a.class).h3(p0);
    }
    public String getName(){
       return "ReadyFaceMagic";
    }
    public void preLoad(Promise p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicPrepareBridge.class, str)) {
          return;
       }
       if (FMEffectRenderViewManager.isSoLoaded) {
          e.a().b(b.a);
          this.resolvePromise(p0);
          return;
       }else {
          FaceMagicPrepareBridge$a uoa = new FaceMagicPrepareBridge$a(this, p0);
          a uoa1 = a.class;
          if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidTwoRefs(Boolean.FALSE, uoa, null, uoa1, str)) {
             qa.e.h(LoadPolicy.SILENT).u(new b(uoa), new c(uoa));
          }
          return;
       }
    }
    public void resolvePromise(Promise p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicPrepareBridge.class, "2")) {
          return;
       }
       WritableMap writableMap = Arguments.createMap();
       writableMap.putBoolean("loadResult", true);
       p0.resolve(writableMap);
       return;
    }
}
