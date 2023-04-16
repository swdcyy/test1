package com.yxcorp.gifshow.camera.record.widget.RecordButton;
import r36.b;
import com.yxcorp.gifshow.widget.record.BaseRecordButton;
import android.content.Context;
import android.util.AttributeSet;
import android.animation.AnimatorSet;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import android.view.View;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import th0.n;
import android.animation.TimeInterpolator;
import th0.e;
import ki9.o;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.camera.record.breakpoint.BreakpointIndicator;
import android.animation.Animator;
import ki9.r;
import android.animation.Animator$AnimatorListener;
import ekd.m1;
import com.yxcorp.gifshow.widget.record.RecordRoundProgressView;
import android.content.res.Resources;
import java.lang.Boolean;
import android.widget.TextView;
import r36.a;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import java.lang.Float;
import ki9.q;
import th0.d;
import com.yxcorp.gifshow.camera.record.widget.RecordButton$b;
import com.yxcorp.gifshow.camera.record.widget.RecordButton$a;
import th0.q;
import com.yxcorp.gifshow.widget.record.CaptureShadowView;
import android.view.MotionEvent;
import com.yxcorp.gifshow.camera.record.widget.RecordButton$c;
import com.yxcorp.utility.n;
import ki9.p;
import java.lang.Runnable;
import java.lang.Integer;

public class RecordButton extends BaseRecordButton implements b	// class@000fd2
{
    public View A;
    public View B;
    public View C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public AnimatorSet H;
    public ObjectAnimator I;
    public AnimatorSet J;
    public float K;
    public float L;
    public float M;
    public RecordButton$c N;
    public boolean O;
    public View p;
    public RecordRoundProgressView q;
    public BreakpointIndicator r;
    public CaptureShadowView s;
    public View t;
    public View u;
    public View v;
    public View w;
    public View x;
    public View y;
    public int z;
    public static final int P;

    public void RecordButton(Context p0,AttributeSet p1){
       super(p0, p1);
       this.D = false;
       this.E = false;
       this.F = false;
       this.G = false;
       this.H = new AnimatorSet();
       this.K = 0x3f800000;
       this.M = (float)a1.d(0x7f070d74);
       this.O = false;
    }
    public void RecordButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.D = false;
       this.E = false;
       this.F = false;
       this.G = false;
       this.H = new AnimatorSet();
       this.K = 0x3f800000;
       this.M = (float)a1.d(0x7f070d74);
       this.O = false;
    }
    public boolean c(){
       boolean b = (this.E == null && this.d == 2)? true: false;
       return b;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RecordButton.class, "8")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().y("record_btn_v3", "onRecordInit", objArray1);
       super.d();
       if (!PatchProxy.applyVoid(objArray, this, RecordButton.class, "15")) {
          int i = 4;
          if (!this.u.getVisibility()) {
             this.u.setVisibility(i);
          }
          if (!this.v.getVisibility()) {
             this.v.setVisibility(i);
          }
          if (!this.t.getVisibility()) {
             this.t.setVisibility(i);
          }
          float[] uofloatArray = new float[]{this.w.getAlpha(),0x3f800000};
          PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, uofloatArray)};
          ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.w, propertyValu);
          objectAnimat.setInterpolator(new n());
          float scaleX = this.w.getScaleX();
          float[] uofloatArray1 = new float[]{scaleX,0x3f800000};
          float[] uofloatArray2 = new float[]{scaleX,0x3f800000};
          PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, uofloatArray1),PropertyValuesHolder.ofFloat(View.SCALE_Y, uofloatArray2)};
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(this.w, propertyValu1);
          objectAnimat1.setInterpolator(new e());
          uofloatArray2 = new float[]{this.A.getAlpha(),0x3f800000};
          propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, uofloatArray2)};
          ObjectAnimator objectAnimat2 = ObjectAnimator.ofPropertyValuesHolder(this.A, propertyValu1);
          objectAnimat2.setInterpolator(new n());
          float scaleX1 = this.C.getScaleX();
          float[] uofloatArray3 = new float[]{scaleX1,0x3f800000};
          float[] uofloatArray4 = new float[]{scaleX1,0x3f800000};
          PropertyValuesHolder[] propertyValu2 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, uofloatArray3),PropertyValuesHolder.ofFloat(View.SCALE_Y, uofloatArray4)};
          ObjectAnimator objectAnimat3 = ObjectAnimator.ofPropertyValuesHolder(this.C, propertyValu2);
          objectAnimat3.setInterpolator(new e());
          objectAnimat3.addUpdateListener(new o(this));
          this.r.e(0);
          AnimatorSet uAnimatorSet = new AnimatorSet();
          this.J = uAnimatorSet;
          Animator[] uAnimatorArr = new Animator[i];
          uAnimatorArr[0] = objectAnimat;
          uAnimatorArr[1] = objectAnimat1;
          uAnimatorArr[2] = objectAnimat2;
          uAnimatorArr[3] = objectAnimat3;
          uAnimatorSet.playTogether(uAnimatorArr);
          this.J.setDuration(300);
          this.J.addListener(new r(this));
          this.J.start();
       }
       this.D = false;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordButton.class, "1")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a34a3);
       this.B = m1.f(p0, 0x7f0a34b8);
       this.t = m1.f(p0, 0x7f0a1329);
       this.A = m1.f(p0, 0x7f0a34ba);
       this.w = m1.f(p0, 0x7f0a13f7);
       this.r = m1.f(p0, 0x7f0a34a5);
       this.u = m1.f(p0, 0x7f0a1324);
       this.v = m1.f(p0, 0x7f0a1315);
       this.y = m1.f(p0, 0x7f0a34a4);
       this.q = m1.f(p0, 0x7f0a32db);
       this.p = m1.f(p0, 0x7f0a34a8);
       this.z = p0.getResources().getColor(0x7f061ce3);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, RecordButton.class, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().y("record_btn_v3", "onRecordPause", objArray);
       if (this.d != null) {
          this.h(true, true);
       }
       super.e();
       return;
    }
    public void f(boolean p0){
       if (PatchProxy.isSupport(RecordButton.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RecordButton.class, "9")) {
          return;
       }
       this.G = p0;
       boolean b = true;
       if (this.d != b) {
          if (this.i != null) {
             this.m(b, this.k());
             this.n(false, this.k());
          }else {
             this.p();
          }
       }
       super.f(p0);
       return;
    }
    public View getClickView(){
       return this;
    }
    public TextView getFlyWheelTextView(){
       return a.b(this);
    }
    public View getShowBubbleView(){
       View obj = PatchProxy.apply(null, this, RecordButton.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.findViewById(R.id.record_btn);
       if (obj == null) {
          obj = this;
       }
       return obj;
    }
    public ViewGroup getTKViewContainer(){
       return a.c(this);
    }
    public void h(boolean p0,boolean p1){
       if (PatchProxy.isSupport(RecordButton.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, RecordButton.class, "14")) {
          return;
       }
       this.O = false;
       int i = p1 ^ 1;
       if (!PatchProxy.applyVoid(null, this, RecordButton.class, "19") && this.F != null) {
          Object[] objArray = new Object[false];
          a.D().s("record_btn_v3", "exitLongClickRecord", objArray);
          this.F = false;
          this.q.setLongClickRecordMode(false);
          this.l(false);
       }
       if (p0) {
          this.m(false, i);
          this.n(1, i);
       }else if(i){
          this.m(1, false);
       }
       return;
    }
    public void j(float p0,float p1){
       if (PatchProxy.isSupport(RecordButton.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, RecordButton.class, "6")) {
          return;
       }
       RecordButton ts = this.s;
       if (ts != null) {
          ts.setTranslationX(p0);
          this.s.setTranslationY(p1);
       }
       return;
    }
    public final boolean k(){
       boolean b = (this.d == 2)? true: false;
       return b;
    }
    public final void l(boolean p0){
       float[] uofloatArray2;
       if (PatchProxy.isSupport(RecordButton.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RecordButton.class, "20")) {
          return;
       }
       this.H.cancel();
       RecordButton tK = this.K;
       int i = (p0)? 0x3fbb3333: 0x3fa1999a;
       float[] uofloatArray = new float[]{tK,i};
       float[] uofloatArray1 = new float[]{tK,i};
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, uofloatArray),PropertyValuesHolder.ofFloat(View.SCALE_Y, uofloatArray1)};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.C, propertyValu);
       objectAnimat.setDuration(300);
       objectAnimat.setInterpolator(new e());
       objectAnimat.addUpdateListener(new q(this));
       RecordButton tM = (p0)? this.M: this.L;
       RecordButton tL = (p0)? this.L: this.M;
       propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, uofloatArray2)};
       uofloatArray2 = new float[]{tM,tL};
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(this.B, propertyValu);
       objectAnimat1.setDuration(200);
       objectAnimat1.setInterpolator(new d());
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
       this.H.playTogether(uAnimatorArr);
       this.H.start();
       return;
    }
    public final void m(boolean p0,boolean p1){
       Property aLPHA;
       float[] uofloatArray;
       PropertyValuesHolder propertyValu;
       if (PatchProxy.isSupport(RecordButton.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, RecordButton.class, "13")) {
          return;
       }
       int i = 0x3f800000;
       int i1 = 0;
       if (p0) {
          aLPHA = View.ALPHA;
          uofloatArray = new float[2];
          uofloatArray[0] = i1;
          if (p1) {
             i = 0;
          }
          uofloatArray[1] = i;
          propertyValu = PropertyValuesHolder.ofFloat(aLPHA, uofloatArray);
       }else {
          aLPHA = View.ALPHA;
          uofloatArray = new float[2];
          if (p1) {
             i = 0;
          }
          uofloatArray[0] = i;
          uofloatArray[1] = i1;
          propertyValu = PropertyValuesHolder.ofFloat(aLPHA, uofloatArray);
       }
       PropertyValuesHolder propertyValu1 = (p0)? PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f19999a,0x3f800000}): PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0x3f19999a});
       PropertyValuesHolder propertyValu2 = (p0)? PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f19999a,0x3f800000}): PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f800000,0x3f19999a});
       RecordButton tv = (this.G != null)? this.v: this.u;
       PropertyValuesHolder[] propertyValu3 = new PropertyValuesHolder[]{propertyValu};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(tv, propertyValu3);
       long l = (p0)? 300: 240;
       objectAnimat.setDuration(l);
       e uoe = (p0)? new e(): new n();
       objectAnimat.setInterpolator(uoe);
       objectAnimat.addListener(new RecordButton$b(this, tv));
       PropertyValuesHolder[] propertyValu4 = new PropertyValuesHolder[]{propertyValu1,propertyValu2};
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(tv, propertyValu4);
       objectAnimat1.setDuration(300);
       objectAnimat1.setInterpolator(new e());
       AnimatorSet uAnimatorSet = new AnimatorSet();
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.start();
       return;
    }
    public final void n(boolean p0,boolean p1){
       Property aLPHA;
       float[] uofloatArray;
       PropertyValuesHolder propertyValu;
       if (PatchProxy.isSupport(RecordButton.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, RecordButton.class, "12")) {
          return;
       }
       int i = 0x3f800000;
       int i1 = 0;
       if (p0) {
          aLPHA = View.ALPHA;
          uofloatArray = new float[2];
          uofloatArray[0] = i1;
          if (p1) {
             i = 0;
          }
          uofloatArray[1] = i;
          propertyValu = PropertyValuesHolder.ofFloat(aLPHA, uofloatArray);
       }else {
          aLPHA = View.ALPHA;
          uofloatArray = new float[2];
          if (p1) {
             i = 0;
          }
          uofloatArray[0] = i;
          uofloatArray[1] = i1;
          propertyValu = PropertyValuesHolder.ofFloat(aLPHA, uofloatArray);
       }
       PropertyValuesHolder propertyValu1 = (p0)? PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f19999a,0x3f800000}): PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0x3f19999a});
       PropertyValuesHolder propertyValu2 = (p0)? PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f19999a,0x3f800000}): PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f800000,0x3f19999a});
       PropertyValuesHolder[] propertyValu3 = new PropertyValuesHolder[]{propertyValu};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.t, propertyValu3);
       long l = (p0)? 300: 240;
       objectAnimat.setDuration(l);
       e uoe = (p0)? new e(): new n();
       objectAnimat.setInterpolator(uoe);
       objectAnimat.addListener(new RecordButton$a(this));
       PropertyValuesHolder[] propertyValu4 = new PropertyValuesHolder[]{propertyValu1,propertyValu2};
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(this.t, propertyValu4);
       objectAnimat1.setDuration(300);
       objectAnimat1.setInterpolator(new e());
       AnimatorSet uAnimatorSet = new AnimatorSet();
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.start();
       return;
    }
    public final void o(boolean p0){
       if (PatchProxy.isSupport(RecordButton.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RecordButton.class, "7")) {
          return;
       }
       if (this.O != null) {
          return;
       }
       int i = 0x3f800000;
       int i1 = (p0)? 0x3f800000: 0x3f5eb852;
       if (p0) {
          i = 0x3f5eb852;
       }
       float[] uofloatArray = new float[]{i1,i};
       float[] uofloatArray1 = new float[]{i1,i};
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, uofloatArray),PropertyValuesHolder.ofFloat(View.SCALE_Y, uofloatArray1)};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.w, propertyValu);
       this.I = objectAnimat;
       objectAnimat.setDuration(100);
       this.I.setInterpolator(new q());
       this.I.start();
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, RecordButton.class, "3")) {
          return;
       }
       super.onAttachedToWindow();
       this.s = m1.f(this.getRootView(), 0x7f0a065e);
       return;
    }
    public void onFinishInflate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RecordButton.class, "2")) {
          return;
       }
       super.onFinishInflate();
       if (!PatchProxy.applyVoid(objArray, this, RecordButton.class, "4")) {
          this.q.setStrokeWidth(4.00f);
          this.C = this.x;
          this.setProgressTextMargin(a1.d(R.dimen.arg_RES_7f070d75));
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       RecordButton obj = PatchProxy.applyOneRefs(p0, this, RecordButton.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.N;
       if (obj != null) {
          obj.a(p0);
       }
       if (this.D == null) {
          boolean b = true;
          if (!p0.getAction()) {
             this.o(b);
          }else if(p0.getAction() == b || p0.getAction() == 3){
             this.o(false);
          }
       }
       return super.onTouchEvent(p0);
    }
    public void p(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RecordButton.class, "11")) {
          return;
       }
       this.O = true;
       RecordButton tI = this.I;
       if (tI != null) {
          tI.cancel();
       }
       int i = this.D ^ true;
       Object[] objArray1 = 2;
       if (i) {
          RecordButton tJ = this.J;
          if (tJ != null && tJ.isRunning()) {
             this.J.end();
          }
          n.Y(this.p, 8, false);
          if (!PatchProxy.applyVoid(objArray, this, RecordButton.class, "16")) {
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[true];
             propertyValu[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[objArray1]{0x3f800000,0});
             ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.w, propertyValu);
             objectAnimat.setDuration(240);
             objectAnimat.setInterpolator(new n());
             float scaleX = this.w.getScaleX();
             float[] uofloatArray = new float[objArray1];
             uofloatArray[0] = scaleX;
             uofloatArray[1] = 0;
             float[] uofloatArray1 = new float[objArray1];
             uofloatArray1[0] = scaleX;
             uofloatArray1[1] = 0;
             PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[objArray1];
             propertyValu1[0] = PropertyValuesHolder.ofFloat(View.SCALE_X, uofloatArray);
             propertyValu1[1] = PropertyValuesHolder.ofFloat(View.SCALE_Y, uofloatArray1);
             ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(this.w, propertyValu1);
             long l = 300;
             objectAnimat1.setDuration(l);
             objectAnimat1.setInterpolator(new e());
             PropertyValuesHolder[] propertyValu2 = new PropertyValuesHolder[true];
             propertyValu2[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[objArray1]{0x3f800000,0});
             ObjectAnimator objectAnimat2 = ObjectAnimator.ofPropertyValuesHolder(this.A, propertyValu2);
             objectAnimat2.setDuration(240);
             objectAnimat2.setInterpolator(new n());
             Animator[] uAnimatorArr = (this.d == objArray1)? 1: null;
             this.r.e(true);
             AnimatorSet uAnimatorSet = new AnimatorSet();
             if (uAnimatorArr) {
                uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2};
                uAnimatorSet.playTogether(uAnimatorArr);
                uAnimatorSet.start();
             }else {
                PropertyValuesHolder[] propertyValu3 = new PropertyValuesHolder[objArray1];
                propertyValu3[0] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[objArray1]{0x3f800000,0x3fa1999a});
                propertyValu3[1] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[objArray1]{0x3f800000,0x3fa1999a});
                ObjectAnimator objectAnimat3 = ObjectAnimator.ofPropertyValuesHolder(this.C, propertyValu3);
                objectAnimat3.setDuration(l);
                objectAnimat3.setInterpolator(new e());
                objectAnimat3.addUpdateListener(new p(this));
                Animator[] uAnimatorArr1 = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2,objectAnimat3};
                uAnimatorSet.playTogether(uAnimatorArr1);
                uAnimatorSet.start();
             }
          }
          this.D = true;
       }
       if (!PatchProxy.isSupport(RecordButton.class) || (PatchProxy.applyVoidOneRefs(Boolean.valueOf(i), this, RecordButton.class, "18") || (this.d == objArray1 && this.isEnabled()))) {
          objArray1 = new Object[false];
          a.D().w("record_btn_v3", "enterLongClickRecord", objArray1);
          this.F = true;
          this.q.setVisibility(false);
          n.Y(this.y, false, false);
          this.l(true);
       }
    label_0162 :
       boolean b = (this.k() && i)? true: false;
       this.m(true, this.k());
       this.n(false, b);
       return;
    }
    public final void q(float p0){
       if (PatchProxy.isSupport(RecordButton.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, RecordButton.class, "21")) {
          return;
       }
       RecordButton ts = this.s;
       if (ts != null) {
          ts.setScaleRate(p0);
       }
       return;
    }
    public void s(Runnable p0){
       a.a(this, p0);
    }
    public void setOnTouchCallback(RecordButton$c p0){
       this.N = p0;
    }
    public void setProgressTextMargin(int p0){
       if (PatchProxy.isSupport(RecordButton.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RecordButton.class, "22")) {
          return;
       }
       float f = (float)p0;
       this.M = f;
       this.L = f - (float)a1.d(0x7f070d77);
       this.B.setTranslationY(this.M);
       return;
    }
    public void z(Runnable p0){
       a.d(this, p0);
    }
}
