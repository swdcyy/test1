package com.tachikoma.core.component.text.TKMarqueeText;
import com.tachikoma.core.component.e;
import gx4.f;
import android.content.Context;
import android.view.View;
import com.tachikoma.core.component.text.MarqueeTextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import iq8.m;
import android.os.Handler;
import android.widget.TextView;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Boolean;
import com.tachikoma.core.component.text.TKMarqueeText$a;
import java.lang.Runnable;
import iq8.x;
import com.tachikoma.core.bridge.c;
import com.tachikoma.core.component.TKBaseNativeModule;
import iq8.p;
import java.lang.Integer;
import android.graphics.Typeface;
import yp8.a;
import jq8.a;

public class TKMarqueeText extends e	// class@000d8e
{
    public String text;

    public void TKMarqueeText(f p0){
       super(p0);
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public MarqueeTextView createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKMarqueeText.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MarqueeTextView(p0);
    }
    public void destroyOnUIThread(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKMarqueeText.class, "2")) {
          return;
       }
       if (this.isTargetViewExist()) {
          MarqueeTextView view = this.getView();
          Objects.requireNonNull(view);
          if (!PatchProxy.applyVoid(objArray, view, MarqueeTextView.class, "7")) {
             if (!PatchProxy.applyVoid(objArray, view, MarqueeTextView.class, "6")) {
                MarqueeTextView j = view.j;
                if (j != null) {
                   if (!PatchProxy.applyVoid(objArray, j, m.class, "3")) {
                      j.c = true;
                      j.removeMessages(0);
                   }
                   view.i = true;
                }
             }
             if (view.g - view.getScrollInitialValue()) {
                view.g = view.getScrollInitialValue();
                view.postInvalidate();
             }
          }
       }
       return;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       TKMarqueeText tKMarqueeTex = TKMarqueeText.class;
       if (PatchProxy.isSupport(tKMarqueeTex) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKMarqueeTex, "1")) {
          return;
       }
       if (p1) {
          this.destroyOnUIThread();
       }else {
          x.f(new TKMarqueeText$a(this));
       }
       super.onDestroy(p0, p1);
       return;
    }
    public void setColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKMarqueeText.class, "5")) {
          return;
       }
       this.getView().setTextColor(p.c(p0, this.getJSContext()));
       return;
    }
    public void setFontSize(int p0){
       TKMarqueeText tKMarqueeTex = TKMarqueeText.class;
       if (PatchProxy.isSupport(tKMarqueeTex) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKMarqueeTex, "6")) {
          return;
       }
       this.getView().setTextSize(1, (float)p0);
       return;
    }
    public void setFontWeight(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKMarqueeText.class, "7")) {
          return;
       }
       Objects.requireNonNull(p0);
       if (!p0.equals("normal")) {
          if (p0.equals("bold")) {
             this.getView().setTypeface(this.getView().getTypeface(), 1);
          }
       }else {
          this.getView().setTypeface(this.getView().getTypeface(), 0);
       }
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKMarqueeText.class, "4")) {
          return;
       }
       if (p0 != null && p0.equals(this.text)) {
          return;
       }
       this.text = p0;
       this.getDomNode().c().b();
       this.getView().setText(this.text);
       return;
    }
}
