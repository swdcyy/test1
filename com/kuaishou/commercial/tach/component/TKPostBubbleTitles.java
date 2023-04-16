package com.kuaishou.commercial.tach.component.TKPostBubbleTitles;
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
import vx4.l;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Boolean;
import com.kuaishou.commercial.tach.component.TKPostBubbleTitles$a;
import java.lang.Runnable;
import iq8.x;
import java.lang.Integer;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.JsValueRef;
import tx4.y;
import java.lang.Float;

public class TKPostBubbleTitles extends e	// class@001662
{

    public void TKPostBubbleTitles(f p0){
       super(p0);
    }
    public View createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKPostBubbleTitles.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(-1509085419).b(p0);
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       TKPostBubbleTitles tKPostBubble = TKPostBubbleTitles.class;
       if (PatchProxy.isSupport(tKPostBubble) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKPostBubble, "16")) {
          return;
       }
       super.onDestroy(p0, p1);
       if (p1) {
          d.a(-1509085419).i(this.getView());
       }else {
          x.f(new TKPostBubbleTitles$a(this));
       }
       return;
    }
    public void setGradientFontTitle(String p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(TKPostBubbleTitles.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, TKPostBubbleTitles.class, "7")) {
          return;
       }
       d.a(-1509085419).NS(this.getView(), p0, p1, p2, p3);
       return;
    }
    public void setImageTitleMaxHeight(int p0){
       TKPostBubbleTitles tKPostBubble = TKPostBubbleTitles.class;
       if (PatchProxy.isSupport(tKPostBubble) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKPostBubble, "4")) {
          return;
       }
       d.a(-1509085419).MS(this.getView(), p0);
       return;
    }
    public void setOnLoadCallback(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKPostBubbleTitles.class, "2")) {
          return;
       }
       d.a(-1509085419).Db(this.getView(), y.b(p0, this));
       return;
    }
    public void setSubTitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKPostBubbleTitles.class, "8")) {
          return;
       }
       d.a(-1509085419).Ik(this.getView(), p0);
       return;
    }
    public void setSubTitleColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKPostBubbleTitles.class, "10")) {
          return;
       }
       d.a(-1509085419).nu(this.getView(), p0);
       return;
    }
    public void setSubTitleFontSize(float p0,float p1){
       TKPostBubbleTitles tKPostBubble = TKPostBubbleTitles.class;
       if (PatchProxy.isSupport(tKPostBubble) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, tKPostBubble, "12")) {
          return;
       }
       d.a(-1509085419).eF(this.getView(), p0, p1);
       return;
    }
    public void setTitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKPostBubbleTitles.class, "5")) {
          return;
       }
       d.a(-1509085419).S0(this.getView(), p0);
       return;
    }
    public void setTitleColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKPostBubbleTitles.class, "9")) {
          return;
       }
       d.a(-1509085419).eY(this.getView(), p0);
       return;
    }
    public void setTitleDrawableUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKPostBubbleTitles.class, "3")) {
          return;
       }
       d.a(-1509085419).JP(this.getView(), p0);
       return;
    }
    public void setTitleFontSize(float p0,float p1){
       TKPostBubbleTitles tKPostBubble = TKPostBubbleTitles.class;
       if (PatchProxy.isSupport(tKPostBubble) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, tKPostBubble, "13")) {
          return;
       }
       d.a(-1509085419).Vu(this.getView(), p0, p1);
       return;
    }
    public void setTitleMaxLines(int p0){
       TKPostBubbleTitles tKPostBubble = TKPostBubbleTitles.class;
       if (PatchProxy.isSupport(tKPostBubble) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKPostBubble, "6")) {
          return;
       }
       d.a(-1509085419).zx(this.getView(), p0);
       return;
    }
    public void setTitleStyle(int p0){
       TKPostBubbleTitles tKPostBubble = TKPostBubbleTitles.class;
       if (PatchProxy.isSupport(tKPostBubble) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKPostBubble, "15")) {
          return;
       }
       d.a(-1509085419).W6(this.getView(), p0);
       return;
    }
    public void setTitlesIntervalSpace(int p0){
       TKPostBubbleTitles tKPostBubble = TKPostBubbleTitles.class;
       if (PatchProxy.isSupport(tKPostBubble) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKPostBubble, "14")) {
          return;
       }
       d.a(-1509085419).Fc(this.getView(), p0);
       return;
    }
    public void setTitlesMaxWidth(int p0){
       TKPostBubbleTitles tKPostBubble = TKPostBubbleTitles.class;
       if (PatchProxy.isSupport(tKPostBubble) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKPostBubble, "11")) {
          return;
       }
       d.a(-1509085419).Ou(this.getView(), p0);
       return;
    }
    public void startRender(){
    }
}
