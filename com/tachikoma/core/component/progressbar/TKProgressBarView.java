package com.tachikoma.core.component.progressbar.TKProgressBarView;
import com.tachikoma.core.component.e;
import gx4.f;
import java.lang.String;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Exception;
import java.lang.StringBuilder;
import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ClipDrawable;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tachikoma.core.bridge.c;
import com.tachikoma.core.component.TKBaseNativeModule;
import iq8.p;
import android.graphics.drawable.LayerDrawable;
import java.lang.Boolean;
import android.graphics.PorterDuff$Mode;
import java.lang.Float;
import iq8.n;
import java.lang.Double;

public class TKProgressBarView extends e	// class@000d84
{
    public boolean animating;
    public String backgroundColor;
    public String color;
    public float cornerRadius;
    public double progress;
    public String v;
    public int w;
    public String x;

    public void TKProgressBarView(f p0){
       super(p0);
       this.w = 0;
       this.x = null;
       float f = 0;
       try{
          this.cornerRadius = f;
          p0 = p0.b;
          if (p0 != null && (p0.length > 0 && p0[0] instanceof String)) {
             object oobject = p0[0];
             this.x = oobject;
             this.w = TKProgressBarView.getStyleFromString(oobject);
          }
       label_0025 :
          return;
       }catch(java.lang.Exception e3){
          throw new RuntimeException(e3);
       }
    }
    public static int getStyleFromString(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TKProgressBarView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          throw new Exception("ProgressBar needs to have a style, null received");
       }
       if (p0.equals("Horizontal")) {
          return 0x1010078;
       }
       if (p0.equals("Small")) {
          return 0x1010079;
       }
       if (p0.equals("Large")) {
          return 0x101007a;
       }
       if (p0.equals("Inverse")) {
          return 0x1010287;
       }
       if (p0.equals("SmallInverse")) {
          return 0x1010288;
       }
       if (p0.equals("LargeInverse")) {
          return 0x1010289;
       }
       if (p0.equals("Normal")) {
          return 0x1010077;
       }
       throw new Exception("Unknown ProgressBar style: "+p0);
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public ProgressBar createViewInstance(Context p0){
       ProgressBar obj = PatchProxy.applyOneRefs(p0, this, TKProgressBarView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ProgressBar(p0, null, this.w);
       obj.setMax(1000);
       return obj;
    }
    public final Drawable m(String p0){
       GradientDrawable obj = PatchProxy.applyOneRefs(p0, this, TKProgressBarView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new GradientDrawable();
       obj.setCornerRadius(this.cornerRadius);
       ClipDrawable uClipDrawabl = new ClipDrawable(obj, 3, 1);
       obj = new GradientDrawable();
       obj.setCornerRadius(this.cornerRadius);
       if (!TextUtils.isEmpty(p0)) {
          obj.setColor(p.c(p0, this.getJSContext()));
       }
       Drawable[] uDrawableArr = new Drawable[]{obj,uClipDrawabl};
       return new LayerDrawable(uDrawableArr);
    }
    public final void n(boolean p0,Drawable p1){
       TKProgressBarView tKProgressBa = TKProgressBarView.class;
       if (PatchProxy.isSupport(tKProgressBa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, tKProgressBa, "6")) {
          return;
       }
       if (p0) {
          this.getView().setIndeterminateDrawable(p1);
       }else {
          this.getView().setProgressDrawable(p1);
       }
       return;
    }
    public void setAnimating(boolean p0){
       TKProgressBarView tKProgressBa = TKProgressBarView.class;
       if (PatchProxy.isSupport(tKProgressBa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKProgressBa, "8")) {
          return;
       }
       if (p0) {
          this.getView().setVisibility(0);
       }else {
          this.getView().setVisibility(8);
       }
       return;
    }
    public void setBackgroundColor(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKProgressBarView.class, "4")) {
          return;
       }
       if (!p0 instanceof String) {
          return;
       }
       this.backgroundColor = p0;
       this.n(this.getView().isIndeterminate(), this.m(this.backgroundColor));
       return;
    }
    public void setColor(String p0){
       TKProgressBarView tKProgressBa = TKProgressBarView.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, tKProgressBa, "2")) {
          return;
       }
       this.color = p0;
       ProgressBar view = this.getView();
       TKProgressBarView tcolor = this.color;
       if (!PatchProxy.applyVoidTwoRefs(view, tcolor, this, tKProgressBa, "9")) {
          Drawable indeterminat = (view.isIndeterminate())? view.getIndeterminateDrawable(): view.getProgressDrawable();
          if (indeterminat == null) {
             indeterminat = this.m(this.backgroundColor);
             this.n(this.getView().isIndeterminate(), indeterminat);
          }
          if (indeterminat instanceof LayerDrawable) {
             indeterminat = indeterminat.getDrawable((indeterminat.getNumberOfLayers() - 1));
             int i = p.c(tcolor, this.getJSContext());
             if (i) {
                indeterminat.setColorFilter(i, PorterDuff$Mode.SRC_IN);
             }else {
                indeterminat.clearColorFilter();
             }
          }
       }
       return;
    }
    public void setCornerRadius(float p0){
       TKProgressBarView tKProgressBa = TKProgressBarView.class;
       if (PatchProxy.isSupport(tKProgressBa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, tKProgressBa, "5")) {
          return;
       }
       this.cornerRadius = (float)n.a(p0);
       this.n(this.getView().isIndeterminate(), this.m(this.backgroundColor));
       return;
    }
    public void setIndeterminate(boolean p0){
       TKProgressBarView tKProgressBa = TKProgressBarView.class;
       if (PatchProxy.isSupport(tKProgressBa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKProgressBa, "3")) {
          return;
       }
       this.getView().setIndeterminate(p0);
       this.n(p0, this.m(this.backgroundColor));
       return;
    }
    public void setProgress(double p0){
       TKProgressBarView tKProgressBa = TKProgressBarView.class;
       if (PatchProxy.isSupport(tKProgressBa) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, tKProgressBa, "7")) {
          return;
       }
       this.getView().setProgress((int)(p0 * 0x408f400000000000));
       return;
    }
    public boolean supportAsyncPrepareView(){
       return false;
    }
}
