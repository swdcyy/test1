package com.kwai.feature.post.api.widget.RecordSeekBar;
import com.kwai.library.widget.seekbar.KwaiSeekBar;
import android.content.Context;
import android.util.AttributeSet;
import android.os.Handler;
import t46.t;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.widget.SeekBar;
import java.lang.String;
import android.graphics.Typeface;
import ekd.d0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Runnable;
import android.animation.ValueAnimator;
import t46.s;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import th0.e;
import android.animation.TimeInterpolator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.widget.ProgressBar;
import android.graphics.drawable.Drawable;
import java.lang.Integer;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.kwai.feature.post.api.widget.RecordSeekBar$a;
import lnc.a1;
import android.view.View;

public class RecordSeekBar extends KwaiSeekBar	// class@00147b
{
    public int r;
    public int s;
    public boolean t;
    public int u;
    public ValueAnimator v;
    public Handler w;
    public Runnable x;
    public int y;
    public static final int z;

    public void RecordSeekBar(Context p0){
       super(p0, null);
    }
    public void RecordSeekBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RecordSeekBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.w = new Handler();
       this.x = new t(this);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.y4);
       boolean b = false;
       this.t = typedArray.getBoolean(1, b);
       this.u = typedArray.getInt(b, b);
       typedArray.recycle();
       Paint progressText = this.getProgressTextPaint();
       if (progressText == null) {
          return;
       }
       if (this.t != null) {
          this.r = 0xffffff & progressText.getColor();
       }
       progressText.setTypeface(d0.a("alte-din.ttf", this.getContext()));
       return;
    }
    public void c(boolean p0){
       if (PatchProxy.isSupport(RecordSeekBar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RecordSeekBar.class, "4")) {
          return;
       }
       if (this.t == null) {
          return;
       }
       this.w.removeCallbacks(this.x);
       RecordSeekBar tv = this.v;
       if (tv != null) {
          tv.cancel();
          this.v = null;
       }
       if (p0) {
          this.setProgressTextAlpha(255);
          this.w.postDelayed(this.x, 2000);
       }
       return;
    }
    public void d(boolean p0){
       if (PatchProxy.isSupport(RecordSeekBar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RecordSeekBar.class, "5")) {
          return;
       }
       RecordSeekBar tv = this.v;
       if (tv != null) {
          tv.cancel();
          this.v = null;
       }
       int i = 255;
       if (!p0 || (this.s == i || (!p0 && this.s == null))) {
          return;
       }else {
          int[] ointArray = new int[2];
          int i1 = (p0)? 0: 255;
          ointArray[0] = i1;
          if (!p0) {
             i = 0;
          }
          ointArray[1] = i;
          ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
          this.v = valueAnimato;
          valueAnimato.addUpdateListener(new s(this));
          this.v.setInterpolator(new e());
          this.v.setDuration(300);
          this.v.start();
          return;
       }
    }
    public synchronized int getProgress(){
       Object obj = PatchProxy.apply(null, this, RecordSeekBar.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (super.getProgress() + this.y);
    }
    public Drawable getThumbDrawable(){
       return this.b;
    }
    public void setAdsorptionThreshold(int p0){
       this.u = p0;
    }
    public void setDefaultIndicatorProgress(int p0){
       if (PatchProxy.isSupport(RecordSeekBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RecordSeekBar.class, "11")) {
          return;
       }
       super.setDefaultIndicatorProgress((p0 - this.y));
       return;
    }
    public void setExtOffset(int p0){
       this.y = p0;
    }
    public void setOnSeekBarChangeListener(SeekBar$OnSeekBarChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordSeekBar.class, "2")) {
          return;
       }
       super.setOnSeekBarChangeListener(new RecordSeekBar$a(this, p0));
       return;
    }
    public void setOnlyDraggingShowSeekBarValue(boolean p0){
       this.t = p0;
    }
    public synchronized void setProgress(int p0){
       if (PatchProxy.isSupport(RecordSeekBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RecordSeekBar.class, "9")) {
          return;
       }
       super.setProgress((p0 - this.y));
       return;
    }
    public void setProgressTextAlpha(int p0){
       if (PatchProxy.isSupport(RecordSeekBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RecordSeekBar.class, "6")) {
          return;
       }
       Paint progressText = this.getProgressTextPaint();
       if (progressText != null) {
          if (!PatchProxy.isSupport(RecordSeekBar.class) || !PatchProxy.applyVoidTwoRefs(progressText, Integer.valueOf(p0), this, RecordSeekBar.class, "7")) {
             int i = 128;
             if (p0 < i) {
                if (this.s >= i) {
                   progressText.clearShadowLayer();
                }
             }else if(this.s < i){
                progressText.setShadowLayer(3.00f, 0, 0x3f800000, a1.a(R.color.arg_RES_7f062040));
             }
             this.s = p0;
             progressText.setColor(((p0 << 24) | this.r));
          }
          this.invalidate();
       }
       return;
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(RecordSeekBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RecordSeekBar.class, "1")) {
          return;
       }
       super.setVisibility(p0);
       boolean b = (!p0)? true: false;
       this.c(b);
       return;
    }
}
