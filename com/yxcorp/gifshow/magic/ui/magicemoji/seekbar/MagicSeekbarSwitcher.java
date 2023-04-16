package com.yxcorp.gifshow.magic.ui.magicemoji.seekbar.MagicSeekbarSwitcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import th0.e;
import th0.d;
import th0.n;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import android.widget.TextView;
import android.view.ViewGroup;
import android.animation.ValueAnimator;
import g5b.l;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import lnc.a1;
import g5b.m;
import java.lang.Float;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.view.animation.Interpolator;

public class MagicSeekbarSwitcher extends ConstraintLayout	// class@001c05
{
    public TextView B;
    public View C;
    public View D;
    public boolean E;
    public boolean F;
    public e G;
    public d H;
    public n I;
    public static final int J;

    public void MagicSeekbarSwitcher(Context p0){
       super(p0, null, -1);
    }
    public void MagicSeekbarSwitcher(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void MagicSeekbarSwitcher(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.E = false;
       this.F = false;
       this.G = new e();
       this.H = new d();
       this.I = new n();
    }
    public static float P(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MagicSeekbarSwitcher.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (p0.getX() + ((float)p0.getWidth() / 2.00f));
    }
    public final void L(boolean p0){
       if (PatchProxy.isSupport(MagicSeekbarSwitcher.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MagicSeekbarSwitcher.class, "3")) {
          return;
       }
       int width = this.B.getWidth();
       int width1 = this.getWidth();
       int i = width1 - width;
       float f = 0x3f800000;
       float f1 = 0x3f800000;
       float f2 = (MagicSeekbarSwitcher.P(this.B) + this.getX()) - MagicSeekbarSwitcher.P(this);
       if (p0) {
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f800000,0x3f800000});
          l ol = new l(this, width1, i, f, f1, width, f2);
          valueAnimato.addUpdateListener(v9);
          valueAnimato.setDuration(300);
          valueAnimato.start();
       }else {
          this.R(0x3f800000, width1, i, 0x3f800000, 0x3f800000, (float)width, f2, true);
       }
       return;
    }
    public final void M(boolean p0){
       if (PatchProxy.isSupport(MagicSeekbarSwitcher.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MagicSeekbarSwitcher.class, "4")) {
          return;
       }
       int width = this.B.getWidth();
       int i = a1.d(0x7f070a77) + width;
       int width1 = this.getWidth();
       int i1 = i - width1;
       float f = 0;
       float f1 = (float)((i - width) - a1.d(0x7f070a75));
       if (p0) {
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f800000,0x3f800000});
          m om = new m(this, width1, i1, f, 0x3f800000, width, f1);
          valueAnimato.addUpdateListener(v9);
          valueAnimato.setDuration(300);
          valueAnimato.start();
       }else {
          this.R(0x3f800000, width1, (- i1), 0, 0xbf800000, (float)width, f1, false);
       }
       return;
    }
    public final float N(float p0){
       if (PatchProxy.isSupport(MagicSeekbarSwitcher.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, MagicSeekbarSwitcher.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return this.G.getInterpolation(p0);
    }
    public final float O(float p0){
       if (PatchProxy.isSupport(MagicSeekbarSwitcher.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, MagicSeekbarSwitcher.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return this.G.getInterpolation(p0);
    }
    public boolean Q(){
       return this.F;
    }
    public final void R(float p0,int p1,int p2,float p3,float p4,float p5,float p6,boolean p7){
       float f;
       float f1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(MagicSeekbarSwitcher.class)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4),Float.valueOf(p5),Float.valueOf(p6),Boolean.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, this, MagicSeekbarSwitcher.class, "10")) {
             return;
          }
       }
       if (PatchProxy.isSupport(MagicSeekbarSwitcher.class)) {
          MagicSeekbarSwitcher obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, MagicSeekbarSwitcher.class, "6");
          if (obj != patchProxyRe) {
             f = obj.floatValue();
          label_0074 :
             p1 = p1 - (int)(f * (float)p2);
             ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
             layoutParams.width = p1;
             this.setLayoutParams(layoutParams);
             this.C.setScaleX((p3 - (this.N(p0) * p4)));
             this.C.setScaleY((p3 - (this.N(p0) * p4)));
             MagicSeekbarSwitcher tC = this.C;
             if (PatchProxy.isSupport(MagicSeekbarSwitcher.class)) {
                obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Boolean.valueOf(p7), this, MagicSeekbarSwitcher.class, "8");
                if (obj != patchProxyRe) {
                   f = obj.floatValue();
                label_00ca :
                   tC.setAlpha((p3 - (f * p4)));
                   tC = this.D;
                   if (PatchProxy.isSupport(MagicSeekbarSwitcher.class)) {
                      obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Boolean.valueOf(p7), this, MagicSeekbarSwitcher.class, "5");
                      if (obj != patchProxyRe) {
                         f1 = obj.floatValue();
                      label_00ff :
                         tC.setAlpha((p3 - (f1 * p4)));
                         if (p7) {
                            this.B.setX(((((float)p1 / 2.00f) + ((0x3f800000 - this.O(p0)) * p6)) - (p5 / 2.00f)));
                         }else {
                            this.B.setX(((((float)p1 / 2.00f) + (this.O(p0) * p6)) - (p5 / 2.00f)));
                         }
                         if (!p0 - 0x3f800000) {
                            this.F = false;
                         }
                         return;
                      }
                   }
                   MagicSeekbarSwitcher tI = (p7)? this.I: this.G;
                   f1 = tI.getInterpolation(p0);
                   goto label_00ff ;
                }
             }
             obj = (p7)? this.I: this.H;
             f = obj.getInterpolation(p0);
             goto label_00ca ;
          }
       }
       f = this.G.getInterpolation(p0);
       goto label_0074 ;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, MagicSeekbarSwitcher.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.C = this.findViewById(0x7f0a2a3b);
       this.B = this.findViewById(0x7f0a2a3c);
       this.D = this.findViewById(0x7f0a2a3a);
       return;
    }
    public void setEnabled(boolean p0){
       if (PatchProxy.isSupport(MagicSeekbarSwitcher.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MagicSeekbarSwitcher.class, "13")) {
          return;
       }
       MagicSeekbarSwitcher tB = this.B;
       float f = 0x3f800000;
       if (tB != null) {
          float f1 = (p0)? 0x3f800000: 0.40f;
          tB.setAlpha(f1);
       }
       tB = this.C;
       if (tB != null) {
          if (!p0) {
             f = 0.40f;
          }
          tB.setAlpha(f);
       }
       return;
    }
    public void setText(int p0){
       if (PatchProxy.isSupport(MagicSeekbarSwitcher.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MagicSeekbarSwitcher.class, "12")) {
          return;
       }
       MagicSeekbarSwitcher tB = this.B;
       if (tB != null) {
          tB.setText(p0);
       }
       return;
    }
}
