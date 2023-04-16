package com.yxcorp.gifshow.widget.merchant.live.TextLoopSwitcher;
import android.widget.TextSwitcher;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Runnable;
import hzc.b;
import hzc.c;
import android.view.ViewGroup;

public class TextLoopSwitcher extends TextSwitcher	// class@001999
{
    public Handler b;
    public Runnable c;
    public TranslateAnimation d;
    public TranslateAnimation e;
    public TranslateAnimation f;
    public TranslateAnimation g;
    public int h;

    public void TextLoopSwitcher(Context p0){
       super(p0, null);
    }
    public void TextLoopSwitcher(Context p0,AttributeSet p1){
       super(p0, p1);
       this.h = 2;
       if (PatchProxy.applyVoidOneRefs(p0, this, TextLoopSwitcher.class, "1")) {
       }else {
          this.b = new Handler();
          this.d = AnimationUtils.loadAnimation(p0, 0x7f0100ff);
          this.e = AnimationUtils.loadAnimation(p0, 0x7f010102);
          this.f = AnimationUtils.loadAnimation(p0, 0x7f010100);
          this.g = AnimationUtils.loadAnimation(p0, 0x7f010101);
       }
       return;
    }
    public void a(long p0,boolean p1){
       if (PatchProxy.isSupport(TextLoopSwitcher.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Boolean.valueOf(p1), this, TextLoopSwitcher.class, "4")) {
          return;
       }
       TextLoopSwitcher td = this.d;
       if (td != null && (this.e != null && (this.f != null && this.g != null))) {
          td.setDuration(p0);
          this.e.setDuration(p0);
          this.f.setDuration(p0);
          this.g.setDuration(p0);
          this.d.setFillAfter(true);
          this.e.setFillAfter(true);
          this.f.setFillAfter(true);
          this.g.setFillAfter(true);
          if (p1) {
             this.setInAnimation(this.d);
             this.setOutAnimation(this.e);
          }else {
             this.setInAnimation(this.f);
             this.setOutAnimation(this.g);
          }
          this.setClipChildren(true);
          this.setClipToPadding(true);
       }
    label_006f :
       return;
    }
    public void b(int p0,int p1,long p2){
       if (PatchProxy.isSupport(TextLoopSwitcher.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Long.valueOf(p2), this, TextLoopSwitcher.class, "3")) {
          return;
       }
       if (!PatchProxy.isSupport(TextLoopSwitcher.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Long.valueOf(p2), Boolean.TRUE, this, TextLoopSwitcher.class, "2")) {
          if (this.getInAnimation() != null) {
             this.getInAnimation().cancel();
          }
          if (this.getOutAnimation() != null) {
             this.getOutAnimation().cancel();
          }
          this.b.removeCallbacks(this.c);
          this.a(p2, true);
          int[] ointArray = new int[true];
          int i = 0;
          ointArray[i] = i;
          ointArray[i] = p0;
          if (ointArray[i] < p1) {
             b uob = new b(this, ointArray, p1, p2);
             this.c = ointArray[i];
             this.b.postDelayed(ointArray[i], (p2 * (long)this.h));
          }else if(ointArray[i] > p1){
             c uoc = new c(this, ointArray, p1, p2);
             this.c = ointArray[i];
             this.b.postDelayed(ointArray[i], (p2 * (long)this.h));
          }
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, TextLoopSwitcher.class, "5")) {
          return;
       }
       super.onDetachedFromWindow();
       this.b.removeCallbacksAndMessages(null);
       if (this.getInAnimation() != null) {
          this.getInAnimation().cancel();
       }
       if (this.getOutAnimation() != null) {
          this.getOutAnimation().cancel();
       }
       return;
    }
    public void setAnimDurationMillisDivisor(int p0){
       this.h = p0;
    }
}
