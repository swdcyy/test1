package bk.a;
import com.google.android.material.floatingactionbutton.a;
import com.google.android.material.internal.VisibilityAwareImageButton;
import gk.b;
import android.os.Build$VERSION;
import android.widget.ImageButton;
import android.animation.StateListAnimator;
import android.animation.Animator;
import android.animation.AnimatorSet;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import android.animation.ObjectAnimator;
import android.view.View;
import android.util.Property;
import android.animation.TimeInterpolator;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.GradientDrawable;
import androidx.core.graphics.drawable.a;
import ck.a;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import fk.a;
import android.animation.AnimatorSet$Builder;
import gk.a;
import java.lang.Math;
import ck.b;
import bk.a$a;

public class a extends a	// class@000b42
{
    public InsetDrawable I;

    public void a(VisibilityAwareImageButton p0,b p1){
       super(p0, p1);
    }
    public void A(int[] p0){
       if (Build$VERSION.SDK_INT == 21) {
          a uoa = null;
          if (this.u.isEnabled()) {
             this.u.setElevation(this.n);
             if (this.u.isPressed()) {
                this.u.setTranslationZ(this.p);
             }else if(this.u.isFocused() || this.u.isHovered()){
                this.u.setTranslationZ(this.o);
             }else {
                this.u.setTranslationZ(uoa);
             }
          }else {
             this.u.setElevation(uoa);
             this.u.setTranslationZ(uoa);
          }
       }
       return;
    }
    public void B(float p0,float p1,float p2){
       float[] uofloatArray1;
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT == 21) {
          this.u.refreshDrawableState();
       }else {
          StateListAnimator stateListAni = new StateListAnimator();
          stateListAni.addState(a.C, this.X(p0, p2));
          stateListAni.addState(a.D, this.X(p0, p1));
          stateListAni.addState(a.E, this.X(p0, p1));
          stateListAni.addState(a.F, this.X(p0, p1));
          AnimatorSet uAnimatorSet = new AnimatorSet();
          ArrayList uArrayList = new ArrayList();
          int i = 1;
          float[] uofloatArray = new float[i];
          uofloatArray[0] = p0;
          uArrayList.add(ObjectAnimator.ofFloat(this.u, "elevation", uofloatArray).setDuration(0));
          if (sDK_INT >= 22 && sDK_INT <= 24) {
             a tu = this.u;
             uofloatArray1 = new float[i];
             uofloatArray1[0] = tu.getTranslationZ();
             uArrayList.add(ObjectAnimator.ofFloat(tu, View.TRANSLATION_Z, uofloatArray1).setDuration(100));
          }
          uofloatArray1 = new float[i];
          uofloatArray1[0] = 0;
          uArrayList.add(ObjectAnimator.ofFloat(this.u, View.TRANSLATION_Z, uofloatArray1).setDuration(100));
          Animator[] uAnimatorArr = new Animator[0];
          uAnimatorSet.playSequentially(uArrayList.toArray(uAnimatorArr));
          uAnimatorSet.setInterpolator(a.B);
          stateListAni.addState(a.G, uAnimatorSet);
          stateListAni.addState(a.H, this.X(0, 0));
          this.u.setStateListAnimator(stateListAni);
       }
       if (this.v.b()) {
          this.W();
       }
       return;
    }
    public void C(Rect p0){
       if (this.v.b()) {
          InsetDrawable insetDrawabl = new InsetDrawable(this.k, p0.left, p0.top, p0.right, p0.bottom);
          this.I = v0;
          this.v.e(v0);
       }else {
          this.v.e(this.k);
       }
       return;
    }
    public void H(ColorStateList p0,PorterDuff$Mode p1,ColorStateList p2,int p3){
       LayerDrawable layerDrawabl;
       Drawable uDrawable = a.r(this.g());
       this.j = uDrawable;
       a.o(uDrawable, p0);
       if (p1 != null) {
          a.p(this.j, p1);
       }
       if (p3 > 0) {
          this.l = this.e(p3, p0);
          Drawable[] uDrawableArr = new Drawable[]{this.l,this.j};
          layerDrawabl = new LayerDrawable(uDrawableArr);
       }else {
          this.l = null;
          layerDrawabl = this.j;
       }
       RippleDrawable rippleDrawab = new RippleDrawable(a.a(p2), layerDrawabl, null);
       this.k = rippleDrawab;
       this.m = rippleDrawab;
       this.v.e(rippleDrawab);
       return;
    }
    public void Q(ColorStateList p0){
       a tk = this.k;
       if (tk instanceof RippleDrawable) {
          tk.setColor(a.a(p0));
       }else {
          super.Q(p0);
       }
       return;
    }
    public final Animator X(float p0,float p1){
       AnimatorSet uAnimatorSet = new AnimatorSet();
       float[] uofloatArray = new float[]{p0};
       float[] uofloatArray1 = new float[]{p1};
       uAnimatorSet.play(ObjectAnimator.ofFloat(this.u, "elevation", uofloatArray).setDuration(0)).with(ObjectAnimator.ofFloat(this.u, View.TRANSLATION_Z, uofloatArray1).setDuration(100));
       uAnimatorSet.setInterpolator(a.B);
       return uAnimatorSet;
    }
    public float l(){
       return this.u.getElevation();
    }
    public void o(Rect p0){
       if (this.v.b()) {
          float radius = this.v.getRadius();
          float f = this.l() + this.p;
          p0.set((int)Math.ceil((double)a.e(f, radius, false)), (int)Math.ceil((double)a.f(f, radius, false)), (int)Math.ceil((double)a.e(f, radius, false)), (int)Math.ceil((double)a.f(f, radius, false)));
       }else {
          p0.set(false, false, false, false);
       }
       return;
    }
    public void u(){
    }
    public a v(){
       return new b();
    }
    public GradientDrawable w(){
       return new a$a();
    }
    public void y(){
       this.W();
    }
}
