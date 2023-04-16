package com.kuaishou.commercial.tach.component.AdTkShineView;
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
import vx4.c;
import java.lang.Float;
import iq8.n;
import java.util.HashMap;
import java.lang.Number;
import java.lang.Long;
import java.lang.Integer;

public class AdTkShineView extends e	// class@00164a
{

    public void AdTkShineView(f p0){
       super(p0);
    }
    public View createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdTkShineView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(0x500bbde5).b(p0);
    }
    public void setRadius(float p0){
       AdTkShineView uAdTkShineVi = AdTkShineView.class;
       if (PatchProxy.isSupport(uAdTkShineVi) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uAdTkShineVi, "2")) {
          return;
       }
       d.a(0x500bbde5).Tz(this.getView(), n.a(p0));
       return;
    }
    public void setStyle(HashMap p0){
       AdTkShineView uAdTkShineVi = AdTkShineView.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uAdTkShineVi, "4")) {
          return;
       }
       super.setStyle(p0);
       Object obj = p0.get("radius");
       Object obj1 = p0.get("duration");
       Object obj2 = p0.get("swipeDelayTime");
       p0 = p0.get("animationTimes");
       if (obj instanceof Number) {
          this.setRadius(obj.floatValue());
       }
       if (obj1 instanceof Number) {
          long l = obj1.longValue();
          if (!PatchProxy.isSupport(uAdTkShineVi) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), this, uAdTkShineVi, "7")) {
             d.a(0x500bbde5).Gy(this.getView(), l);
          }
       }
       if (obj2 instanceof Number) {
          d.a(0x500bbde5).Bw(this.getView(), obj2.longValue());
       }
       if (p0 instanceof Number) {
          int i = p0.intValue();
          if (!PatchProxy.isSupport(uAdTkShineVi) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, uAdTkShineVi, "6")) {
             d.a(0x500bbde5).f6(this.getView(), i);
          }
       }
       return;
    }
    public void startAnimation(){
       if (PatchProxy.applyVoid(null, this, AdTkShineView.class, "3")) {
          return;
       }
       d.a(0x500bbde5).QQ(this.getView());
       return;
    }
    public void stopAnimation(){
       if (PatchProxy.applyVoid(null, this, AdTkShineView.class, "5")) {
          return;
       }
       d.a(0x500bbde5).OR(this.getView());
       return;
    }
}
