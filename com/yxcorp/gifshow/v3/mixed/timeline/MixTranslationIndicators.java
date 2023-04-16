package com.yxcorp.gifshow.v3.mixed.timeline.MixTranslationIndicators;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.util.List;
import java.lang.Math;
import com.yxcorp.gifshow.v3.mixed.timeline.MixVideoView;
import android.widget.FrameLayout;
import hwc.a;
import java.lang.Integer;
import android.view.ViewTreeObserver;
import gwc.q;
import android.view.ViewTreeObserver$OnPreDrawListener;
import java.lang.StringBuilder;
import lnc.ha;
import java.lang.Boolean;
import faa.a;
import q87.c;

public class MixTranslationIndicators extends RelativeLayout	// class@001561
{
    public int b;
    public int c;
    public int d;

    public void MixTranslationIndicators(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, MixTranslationIndicators.class, "8")) {
          return;
       }
       int i = this.c - 1;
       int i1 = 0;
       while (i1 < this.d) {
          if (i1 != i) {
             int i2 = i + 1;
             if (i1 != i2) {
                this.getChildAt(i1).setVisibility(0);
             label_002e :
                i1 = i1 + 1;
             }
          }
          this.getChildAt(i1).setVisibility(8);
          goto label_002e ;
       }
       return;
    }
    public void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MixTranslationIndicators.class, "6")) {
          return;
       }
       if (this.getVisibility()) {
          return;
       }
       int i = Math.min((p0.size() - 1), this.getChildCount());
       this.d = i;
       int i1 = 0;
       while (i1 < i) {
          View childAt = this.getChildAt(i1);
          i1 = i1 + 1;
          int h = a.h;
          int i2 = p0.get(i1).getRight() - h;
          int i3 = p0.get(i1).getLeft() + h;
          int i4 = i3 - i2;
          if (childAt.getVisibility() == 8 || (PatchProxy.isSupport(MixTranslationIndicators.class) && PatchProxy.applyVoidThreeRefs(childAt, Integer.valueOf(i2), Integer.valueOf(i4), this, MixTranslationIndicators.class, "7"))) {
             continue ;
          }else if(!childAt.getMeasuredWidth()){
             ViewTreeObserver viewTreeObse = childAt.getViewTreeObserver();
             q oq = new q(this, childAt, i4, i2, viewTreeObse);
             viewTreeObse.addOnPreDrawListener(v12);
          }else {
             i4 = i4 - childAt.getMeasuredWidth();
             i4 = i4 / 2;
             i2 = i2 + i4;
             childAt.setTranslationX((float)i2);
          }
       }
       while (i < this.getChildCount()) {
          View childAt1 = this.getChildAt(i);
          if (childAt1 != null) {
             childAt1.setVisibility(4);
          }else {
             ha.b("mix_indicator_null", i+" "+this.getChildCount());
          }
          i = i + 1;
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, MixTranslationIndicators.class, "9")) {
          return;
       }
       this.a();
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(MixTranslationIndicators.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, MixTranslationIndicators.class, "2")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       Object[] objArray1 = new Object[0];
       a.D().s("MixTranslationIndicators", "onLayout\(\) called with: changed = ["+p0+"], l = ["+p1+"], t = ["+p2+"], r = ["+p3+"], b = ["+p4+"]", objArray1);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(MixTranslationIndicators.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, MixTranslationIndicators.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.setMeasuredDimension(this.b, this.getMeasuredHeight());
       Object[] objArray = new Object[0];
       a.D().s("MixTranslationIndicators", "onMeasure: "+this.b, objArray);
       return;
    }
    public void setCurrent(int p0){
       this.c = p0;
    }
}
