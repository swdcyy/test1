package com.facebook.react.views.slider.ReactSlider;
import androidx.appcompat.widget.AppCompatSeekBar;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Build$VERSION;
import android.animation.StateListAnimator;
import android.view.View;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.widget.SeekBar;
import java.lang.Math;
import java.lang.Double;

public class ReactSlider extends AppCompatSeekBar	// class@0013f1
{
    public double c;
    public double d;
    public double e;
    public double f;
    public double g;
    public static int h = 128;

    public void ReactSlider(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = 0;
       this.d = 0;
       this.e = 0;
       this.f = 0;
       this.g = 0;
       this.b();
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, ReactSlider.class, "1")) {
          return;
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 23 && sDK_INT < 26) {
          super.setStateListAnimator(null);
       }
       return;
    }
    public double c(int p0){
       if (PatchProxy.isSupport(ReactSlider.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ReactSlider.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       if (p0 == this.getMax()) {
          return this.d;
       }else {
          return (((double)p0 * this.getStepValue()) + this.c);
       }
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, ReactSlider.class, "7")) {
          return;
       }
       if (!this.f - null) {
          this.g = (this.d - this.c) / (double)ReactSlider.h;
       }
       this.setMax(this.getTotalSteps());
       this.e();
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, ReactSlider.class, "8")) {
          return;
       }
       ReactSlider tc = this.c;
       this.setProgress((int)Math.round((((this.e - tc) / (this.d - tc)) * (double)this.getTotalSteps())));
       return;
    }
    public final double getStepValue(){
       ReactSlider tf = this.f;
       if (tf > 0) {
       }else {
          tf = this.g;
       }
       return tf;
    }
    public final int getTotalSteps(){
       Object obj = PatchProxy.apply(null, this, ReactSlider.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)Math.ceil(((this.d - this.c) / this.getStepValue()));
    }
    public void setMaxValue(double p0){
       if (PatchProxy.isSupport(ReactSlider.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, ReactSlider.class, "2")) {
          return;
       }
       this.d = p0;
       this.d();
       return;
    }
    public void setMinValue(double p0){
       if (PatchProxy.isSupport(ReactSlider.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, ReactSlider.class, "3")) {
          return;
       }
       this.c = p0;
       this.d();
       return;
    }
    public void setStep(double p0){
       if (PatchProxy.isSupport(ReactSlider.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, ReactSlider.class, "5")) {
          return;
       }
       this.f = p0;
       this.d();
       return;
    }
    public void setValue(double p0){
       if (PatchProxy.isSupport(ReactSlider.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, ReactSlider.class, "4")) {
          return;
       }
       this.e = p0;
       this.e();
       return;
    }
}
