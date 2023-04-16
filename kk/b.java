package kk.b;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Object;
import android.content.Context;
import android.widget.LinearLayout;
import android.content.res.Resources;
import cw9.c;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.graphics.Typeface;
import android.view.View;
import a2.i0;
import android.content.res.ColorStateList;
import android.view.ViewGroup;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.animation.AnimatorSet;
import java.util.ArrayList;
import java.util.List;
import rj.b;
import kk.b$a;
import android.animation.Animator$AnimatorListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import androidx.legacy.widget.Space;
import android.widget.LinearLayout$LayoutParams;
import android.widget.EditText;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import rj.a;
import android.animation.TimeInterpolator;
import androidx.core.widget.b;

public final class b	// class@0024b4
{
    public final Context a;
    public final TextInputLayout b;
    public LinearLayout c;
    public int d;
    public FrameLayout e;
    public int f;
    public Animator g;
    public final float h;
    public int i;
    public int j;
    public CharSequence k;
    public boolean l;
    public TextView m;
    public int n;
    public CharSequence o;
    public boolean p;
    public TextView q;
    public int r;
    public Typeface s;

    public void b(TextInputLayout p0){
       super();
       Context context = p0.getContext();
       this.a = context;
       this.b = p0;
       Resources resources = context.getResources();
       this.h = (float)c.b(resources, 0x7f0701c7);
    }
    public void A(boolean p0){
       if (this.p == p0) {
          return;
       }
       this.d();
       int i = 1;
       if (p0) {
          AppCompatTextView uAppCompatTe = new AppCompatTextView(this.a);
          this.q = uAppCompatTe;
          uAppCompatTe.setId(R.id.textinput_helper_text);
          b ts = this.s;
          if (ts != null) {
             this.q.setTypeface(ts);
          }
          this.q.setVisibility(4);
          i0.t0(this.q, i);
          this.z(this.r);
          this.a(this.q, i);
       }else {
          this.p();
          this.u(this.q, i);
          this.q = null;
          this.b.y();
          this.b.F();
       }
       this.p = p0;
       return;
    }
    public void B(ColorStateList p0){
       b tq = this.q;
       if (tq != null) {
          tq.setTextColor(p0);
       }
       return;
    }
    public final void C(TextView p0,Typeface p1){
       if (p0 != null) {
          p0.setTypeface(p1);
       }
       return;
    }
    public void D(Typeface p0){
       if (p0 != this.s) {
          this.s = p0;
          this.C(this.m, p0);
          this.C(this.q, p0);
       }
       return;
    }
    public final void E(ViewGroup p0,int p1){
       if (!p1) {
          p0.setVisibility(8);
       }
       return;
    }
    public final boolean F(TextView p0,CharSequence p1){
       boolean b = (i0.Y(this.b) && (this.b.isEnabled() && (this.j == this.i && (p0 == null || !TextUtils.equals(p0.getText(), p1)))))? true: false;
       return b;
    }
    public void G(CharSequence p0){
       this.d();
       this.k = p0;
       this.m.setText(p0);
       b ti = this.i;
       int i = 1;
       if (ti != i) {
          this.j = i;
       }
       this.I(ti, this.j, this.F(this.m, p0));
       return;
    }
    public void H(CharSequence p0){
       this.d();
       this.o = p0;
       this.q.setText(p0);
       b ti = this.i;
       int i = 2;
       if (ti != i) {
          this.j = i;
       }
       this.I(ti, this.j, this.F(this.q, p0));
       return;
    }
    public final void I(int p0,int p1,boolean p2){
       if (p2) {
          AnimatorSet uAnimatorSet = new AnimatorSet();
          this.g = uAnimatorSet;
          ArrayList uArrayList = new ArrayList();
          Animator uAnimator = this;
          ArrayList uArrayList1 = uArrayList;
          int i = p0;
          int i1 = p1;
          uAnimator.e(uArrayList1, this.p, this.q, 2, i, i1);
          uAnimator.e(uArrayList1, this.l, this.m, 1, i, i1);
          b.a(uAnimatorSet, uArrayList);
          b$a uoa = new b$a(this, p1, this.i(p0), p0, this.i(p1));
          uAnimatorSet.addListener(i1);
          uAnimatorSet.start();
       }else {
          this.v(p0, p1);
       }
       this.b.y();
       this.b.B(p2);
       this.b.F();
       return;
    }
    public void a(TextView p0,int p1){
       if (this.c == null && this.e == null) {
          LinearLayout linearLayout = new LinearLayout(this.a);
          this.c = linearLayout;
          linearLayout.setOrientation(0);
          this.b.addView(this.c, -1, -2);
          FrameLayout uFrameLayout = new FrameLayout(this.a);
          this.e = uFrameLayout;
          this.c.addView(uFrameLayout, -1, new FrameLayout$LayoutParams(-2, -2));
          this.c.addView(new Space(this.a), new LinearLayout$LayoutParams(0, 0, 0x3f800000));
          if (this.b.getEditText() != null) {
             this.b();
          }
       }
       if (this.r(p1)) {
          this.e.setVisibility(0);
          this.e.addView(p0);
          this.f = this.f + 1;
       }else {
          this.c.addView(p0, p1);
       }
       this.c.setVisibility(0);
       this.d = this.d + 1;
       return;
    }
    public void b(){
       if (this.c()) {
          i0.J0(this.c, i0.H(this.b.getEditText()), 0, i0.G(this.b.getEditText()), 0);
       }
       return;
    }
    public final boolean c(){
       boolean b = (this.c != null && this.b.getEditText() != null)? true: false;
       return b;
    }
    public void d(){
       b tg = this.g;
       if (tg != null) {
          tg.cancel();
       }
       return;
    }
    public final void e(List p0,boolean p1,TextView p2,int p3,int p4,int p5){
       if (p2 == null || (p1 && (p3 == p5 || p3 == p4))) {
          p1 = (p5 == p3)? true: false;
          p0.add(this.f(p2, p1));
          if (p5 == p3) {
             p0.add(this.g(p2));
          }
       }
    label_001e :
       return;
    }
    public final ObjectAnimator f(TextView p0,boolean p1){
       int i = (p1)? 0x3f800000: 0;
       float[] uofloatArray = new float[]{i};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.ALPHA, uofloatArray);
       objectAnimat.setDuration(167);
       objectAnimat.setInterpolator(a.a);
       return objectAnimat;
    }
    public final ObjectAnimator g(TextView p0){
       float[] uofloatArray = new float[]{- this.h,0};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.TRANSLATION_Y, uofloatArray);
       objectAnimat.setDuration(217);
       objectAnimat.setInterpolator(a.d);
       return objectAnimat;
    }
    public boolean h(){
       return this.q(this.j);
    }
    public final TextView i(int p0){
       if (p0 == 1) {
          return this.m;
       }
       if (p0 != 2) {
          return null;
       }
       return this.q;
    }
    public CharSequence j(){
       return this.k;
    }
    public int k(){
       b tm = this.m;
       int currentTextC = (tm != null)? tm.getCurrentTextColor(): -1;
       return currentTextC;
    }
    public ColorStateList l(){
       b tm = this.m;
       ColorStateList textColors = (tm != null)? tm.getTextColors(): null;
       return textColors;
    }
    public CharSequence m(){
       return this.o;
    }
    public int n(){
       b tq = this.q;
       int currentTextC = (tq != null)? tq.getCurrentTextColor(): -1;
       return currentTextC;
    }
    public void o(){
       CharSequence uCharSequenc = null;
       this.k = uCharSequenc;
       this.d();
       if (this.i == 1) {
          this.j = (this.p != null && !TextUtils.isEmpty(this.o))? 2: 0;
       }
    label_001e :
       this.I(this.i, this.j, this.F(this.m, uCharSequenc));
       return;
    }
    public void p(){
       this.d();
       b ti = this.i;
       if (ti == 2) {
          this.j = 0;
       }
       this.I(ti, this.j, this.F(this.q, null));
       return;
    }
    public final boolean q(int p0){
       int i = 1;
       if (p0 != i || (this.m == null || TextUtils.isEmpty(this.k))) {
          i = false;
       }
       return i;
    }
    public boolean r(int p0){
       int i = 1;
       if (p0 && p0 != i) {
          i = false;
       }
       return i;
    }
    public boolean s(){
       return this.l;
    }
    public boolean t(){
       return this.p;
    }
    public void u(TextView p0,int p1){
       if (this.c == null) {
          return;
       }
       if (this.r(p1)) {
          b te = this.e;
          if (te != null) {
             int i = this.f - 1;
             this.f = i;
             this.E(te, i);
             this.e.removeView(p0);
          label_0023 :
             int i1 = this.d - 1;
             this.d = i1;
             this.E(this.c, i1);
             return;
          }
       }
       this.c.removeView(p0);
       goto label_0023 ;
    }
    public final void v(int p0,int p1){
       TextView textView;
       if (p0 == p1) {
          return;
       }
       if (p1) {
          textView = this.i(p1);
          if (textView != null) {
             textView.setVisibility(0);
             textView.setAlpha(0x3f800000);
          }
       }
       if (p0) {
          textView = this.i(p0);
          if (textView != null) {
             textView.setVisibility(4);
             if (p0 == 1) {
                textView.setText(null);
             }
          }
       }
       this.i = p1;
       return;
    }
    public void w(boolean p0){
       if (this.l == p0) {
          return;
       }
       this.d();
       int i = 0;
       if (p0) {
          AppCompatTextView uAppCompatTe = new AppCompatTextView(this.a);
          this.m = uAppCompatTe;
          uAppCompatTe.setId(R.id.textinput_error);
          b ts = this.s;
          if (ts != null) {
             this.m.setTypeface(ts);
          }
          this.x(this.n);
          this.m.setVisibility(4);
          i0.t0(this.m, 1);
          this.a(this.m, i);
       }else {
          this.o();
          this.u(this.m, i);
          this.m = null;
          this.b.y();
          this.b.F();
       }
       this.l = p0;
       return;
    }
    public void x(int p0){
       this.n = p0;
       b tm = this.m;
       if (tm != null) {
          this.b.v(tm, p0);
       }
       return;
    }
    public void y(ColorStateList p0){
       b tm = this.m;
       if (tm != null) {
          tm.setTextColor(p0);
       }
       return;
    }
    public void z(int p0){
       this.r = p0;
       b tq = this.q;
       if (tq != null) {
          b.r(tq, p0);
       }
       return;
    }
}
