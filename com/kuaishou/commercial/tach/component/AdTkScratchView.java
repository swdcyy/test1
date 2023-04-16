package com.kuaishou.commercial.tach.component.AdTkScratchView;
import com.tachikoma.core.component.e;
import gx4.f;
import android.content.Context;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import vx4.b;
import com.tkruntime.v8.V8Object;
import gx4.c;
import com.tachikoma.core.component.TKBaseNativeModule;
import com.tkruntime.v8.V8Function;
import tx4.y;
import java.util.HashMap;
import java.lang.Number;
import java.lang.Float;
import iq8.n;

public class AdTkScratchView extends e	// class@001649
{

    public void AdTkScratchView(f p0){
       super(p0);
    }
    public View createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdTkScratchView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(-1706876453).b(p0);
    }
    public void setForegroundView(V8Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdTkScratchView.class, "2")) {
          return;
       }
       c nativeModule = this.getNativeModule(p0);
       if (!nativeModule instanceof e) {
          return;
       }
       d.a(-1706876453).bt(this.getView(), nativeModule.getView());
       return;
    }
    public void setScratchCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdTkScratchView.class, "3")) {
          return;
       }
       if (y.a(p0)) {
          d.a(-1706876453).yc(this.getView(), p0);
       }
       return;
    }
    public void setStyle(HashMap p0){
       AdTkScratchView uAdTkScratch = AdTkScratchView.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uAdTkScratch, "4")) {
          return;
       }
       super.setStyle(p0);
       Object obj = p0.get("touchWidth");
       p0 = p0.get("scratchFinishMinProgress");
       if (obj instanceof Number) {
          float f = obj.floatValue();
          if (!PatchProxy.isSupport(uAdTkScratch) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), this, uAdTkScratch, "5")) {
             d.a(-1706876453).nQ(this.getView(), (float)n.a(f));
          }
       }
       if (p0 instanceof Number) {
          float f1 = p0.floatValue();
          if (!PatchProxy.isSupport(uAdTkScratch) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f1), this, uAdTkScratch, "6")) {
             d.a(-1706876453).F60(this.getView(), f1);
          }
       }
       return;
    }
}
