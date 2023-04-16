package com.kuaishou.live.common.core.component.pk.combowin.LivePkComboWinNumberScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.widget.LinearLayout$LayoutParams;
import d61.v;
import jw1.c;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.animation.Animator;
import va1.n0;
import android.view.View;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import jw1.d;

public class LivePkComboWinNumberScrollView extends ConstraintLayout	// class@001736
{
    public TextView B;
    public TextView C;
    public AnimatorSet D;
    public static final int E;

    static {
       LivePkComboWinNumberScrollView.E = a1.e(18.00f);
    }
    public void LivePkComboWinNumberScrollView(Context p0){
       super(p0, null);
    }
    public void LivePkComboWinNumberScrollView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LivePkComboWinNumberScrollView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public final void L(int p0){
       if (PatchProxy.isSupport(LivePkComboWinNumberScrollView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LivePkComboWinNumberScrollView.class, "7")) {
          return;
       }
       LinearLayout$LayoutParams layoutParams = this.B.getLayoutParams();
       layoutParams.width = (v.c(p0))? c.h: c.g;
       this.B.setLayoutParams(layoutParams);
       this.C.setLayoutParams(layoutParams);
       return;
    }
    public void M(int p0,int p1,boolean p2){
       float f;
       PropertyValuesHolder[] this;
       if (PatchProxy.isSupport(LivePkComboWinNumberScrollView.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, LivePkComboWinNumberScrollView.class, "3")) {
          return;
       }
       this.L(p1);
       this.setNumberShadowColor(p2);
       this.B.setText(String.valueOf(p0));
       this.C.setText(String.valueOf(p1));
       if (p0 != p1 && !PatchProxy.applyVoid(null, this, LivePkComboWinNumberScrollView.class, "6")) {
          n0.m(this.D);
          float[] uofloatArray = new float[]{0,f};
          f = (float)(- LivePkComboWinNumberScrollView.E);
          this = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, uofloatArray)};
          ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.B, this);
          objectAnimat.setDuration(300);
          float[] uofloatArray1 = new float[]{0,f};
          PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, uofloatArray1)};
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(this.C, propertyValu);
          objectAnimat1.setDuration(300);
          AnimatorSet uAnimatorSet = new AnimatorSet();
          this.D = uAnimatorSet;
          Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
          uAnimatorSet.playTogether(uAnimatorArr);
          this.D.start();
       }
       return;
    }
    public void N(){
       if (PatchProxy.applyVoid(null, this, LivePkComboWinNumberScrollView.class, "5")) {
          return;
       }
       n0.m(this.D);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LivePkComboWinNumberScrollView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.B = this.findViewById(0x7f0a2263);
       this.C = this.findViewById(0x7f0a2265);
       return;
    }
    public void setCurrentWinCounts(int p0){
       if (PatchProxy.isSupport(LivePkComboWinNumberScrollView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LivePkComboWinNumberScrollView.class, "2")) {
          return;
       }
       this.L(p0);
       this.B.setText(String.valueOf(p0));
       this.C.setText(String.valueOf(p0));
       return;
    }
    public void setNumberShadowColor(boolean p0){
       if (PatchProxy.isSupport(LivePkComboWinNumberScrollView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LivePkComboWinNumberScrollView.class, "4")) {
          return;
       }
       LivePkComboWinNumberScrollView tB = this.B;
       int i = 0x7f06042c;
       int i1 = (p0)? 0x7f06042c: 0x7f06028a;
       d.a(tB, i1);
       tB = this.C;
       if (!p0) {
          i = 0x7f06028a;
       }
       d.a(tB, i);
       return;
    }
}
