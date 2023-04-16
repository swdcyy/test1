package com.yxcorp.gifshow.homepage.wiget.SlideSwipeLightLoadingView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.n;
import android.animation.ValueAnimator;
import rua.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public class SlideSwipeLightLoadingView extends View	// class@001811
{
    public int b;
    public ValueAnimator c;
    public static final int d;

    public void SlideSwipeLightLoadingView(Context p0){
       super(p0, null);
    }
    public void SlideSwipeLightLoadingView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SlideSwipeLightLoadingView(Context p0,AttributeSet p1,int p2){
       SlideSwipeLightLoadingView tb;
       super(p0, p1, p2);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SlideSwipeLightLoadingView.class, "1")) {
       }else {
          int i = n.z(this.getContext());
          this.b = i;
          this.setTranslationX((float)(- i));
       }
       if (!PatchProxy.applyVoid(objArray, this, SlideSwipeLightLoadingView.class, "2")) {
          int[] ointArray = new int[]{- tb,tb};
          tb = this.b;
          ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
          this.c = valueAnimato;
          valueAnimato.setDuration(1300);
          this.c.addUpdateListener(new e(this));
          this.c.setRepeatCount(-1);
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, SlideSwipeLightLoadingView.class, "5")) {
          return;
       }
       super.onDetachedFromWindow();
       SlideSwipeLightLoadingView tc = this.c;
       if (tc != null) {
          if (tc.isRunning()) {
             this.c.cancel();
          }
          this.c = null;
       }
       return;
    }
}
