package com.kwai.framework.krn.bridges.facemagic.FaceMagicPrepareBridge$a;
import com.kwai.framework.krn.bridges.facemagic.a$a;
import com.kwai.framework.krn.bridges.facemagic.FaceMagicPrepareBridge;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.krn.bridges.facemagic.a;
import com.kwai.kds.facemagic.FMEffectRenderViewManager;
import gs6.e;
import com.kwai.framework.krn.bridges.facemagic.c;
import lk8.b;

public class FaceMagicPrepareBridge$a implements a$a	// class@0015aa
{
    public final Promise a;
    public final FaceMagicPrepareBridge b;

    public void FaceMagicPrepareBridge$a(FaceMagicPrepareBridge p0,Promise p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, FaceMagicPrepareBridge$a.class, "1")) {
          return;
       }
       if (a.a()) {
          FMEffectRenderViewManager.isSoLoaded = true;
          e.a().b(c.a);
          this.b.resolvePromise(this.a);
       }else {
          this.a.reject("1", "failed due to load so");
       }
       return;
    }
    public void onFailed(){
       if (PatchProxy.applyVoid(null, this, FaceMagicPrepareBridge$a.class, "2")) {
          return;
       }
       this.a.reject("1", "failed due to load so");
       return;
    }
}
