package com.kuaishou.commercial.tach.component.TKFlareButton;
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
import vx4.k;
import java.lang.Integer;
import java.lang.Long;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.Double;

public class TKFlareButton extends e	// class@00165a
{

    public void TKFlareButton(f p0){
       super(p0);
    }
    public View createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKFlareButton.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(0xa59ab98).b(p0);
    }
    public void setCDNUrls(String p0,int p1,int p2,String p3,String p4,long p5){
       TKFlareButton tKFlareButto = TKFlareButton.class;
       if (PatchProxy.isSupport(tKFlareButto)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,p4,Long.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, tKFlareButto, "4")) {
             return;
          }
       }
       d.a(0xa59ab98).vf(this.getView(), p0, p1, p2, p3, p4, this.getRootDir());
       return;
    }
    public void setImageURI(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKFlareButton.class, "3")) {
          return;
       }
       d.a(0xa59ab98).s8(this.getView(), p0, this.getRootDir());
       return;
    }
    public void setUrls(String p0,int p1,int p2){
       if (PatchProxy.isSupport(TKFlareButton.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TKFlareButton.class, "2")) {
          return;
       }
       d.a(0xa59ab98).GZ(this.getView(), p0, p1, p2);
       return;
    }
    public void startFlareAnimation(double p0){
       TKFlareButton tKFlareButto = TKFlareButton.class;
       if (PatchProxy.isSupport(tKFlareButto) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, tKFlareButto, "5")) {
          return;
       }
       d.a(0xa59ab98).W9(this.getView(), (long)p0);
       return;
    }
    public void stopFlareAnimation(){
       if (PatchProxy.applyVoid(null, this, TKFlareButton.class, "6")) {
          return;
       }
       d.a(0xa59ab98).w5(this.getView());
       return;
    }
}
