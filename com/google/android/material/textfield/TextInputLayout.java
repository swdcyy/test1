package com.google.android.material.textfield.TextInputLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import kk.b;
import android.graphics.Rect;
import android.graphics.RectF;
import ck.c;
import android.view.View;
import android.widget.FrameLayout;
import rj.a;
import android.animation.TimeInterpolator;
import ll8.c$b;
import w0.x;
import ck.k;
import java.lang.CharSequence;
import android.content.res.Resources;
import cw9.c;
import android.content.res.ColorStateList;
import androidx.core.content.ContextCompat;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import ck.l;
import a2.i0;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.text.Editable;
import android.widget.EditText;
import android.text.TextUtils;
import android.widget.TextView;
import android.view.LayoutInflater;
import ag6.a;
import com.google.android.material.internal.CheckableImageButton;
import androidx.appcompat.widget.AppCompatImageButton;
import android.widget.ImageButton;
import com.google.android.material.textfield.TextInputLayout$b;
import android.view.View$OnClickListener;
import android.graphics.drawable.ColorDrawable;
import androidx.core.widget.b;
import android.graphics.drawable.GradientDrawable;
import android.animation.ValueAnimator;
import com.google.android.material.textfield.TextInputLayout$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.widget.FrameLayout$LayoutParams;
import androidx.core.graphics.drawable.a;
import android.view.ViewStructure;
import android.util.SparseArray;
import android.graphics.Canvas;
import kk.a;
import java.lang.IllegalStateException;
import android.graphics.Typeface;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.DrawableContainer;
import ck.e;
import android.text.method.TransformationMethod;
import android.text.method.PasswordTransformationMethod;
import ck.d;
import android.os.Parcelable;
import com.google.android.material.textfield.TextInputLayout$SavedState;
import androidx.customview.view.AbsSavedState;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout$d;
import com.google.android.material.textfield.TextInputLayout$a;
import android.text.TextWatcher;
import java.lang.IllegalArgumentException;
import java.lang.String;
import r0.a;
import a2.a;
import java.lang.Object;
import java.lang.Integer;
import w0.l;
import android.graphics.PorterDuffColorFilter;
import w0.d;
import android.graphics.ColorFilter;

public class TextInputLayout extends LinearLayout	// class@0016e5
{
    public int A;
    public int B;
    public Drawable C;
    public final Rect D;
    public final RectF E;
    public Typeface F;
    public boolean G;
    public Drawable H;
    public CharSequence I;
    public CheckableImageButton J;
    public boolean K;
    public Drawable L;
    public Drawable M;
    public ColorStateList N;
    public boolean O;
    public PorterDuff$Mode P;
    public boolean Q;
    public ColorStateList R;
    public ColorStateList S;
    public final int T;
    public final int U;
    public boolean U0;
    public int V;
    public final c V0;
    public final int W;
    public boolean W0;
    public ValueAnimator X0;
    public boolean Y0;
    public boolean Z0;
    public boolean a1;
    public final FrameLayout b;
    public EditText c;
    public CharSequence d;
    public final b e;
    public boolean f;
    public int g;
    public boolean h;
    public TextView i;
    public final int j;
    public final int k;
    public boolean l;
    public CharSequence m;
    public boolean n;
    public GradientDrawable o;
    public final int p;
    public final int q;
    public int r;
    public final int s;
    public float t;
    public float u;
    public float v;
    public float w;
    public int x;
    public final int y;
    public final int z;

    public void TextInputLayout(Context p0){
       super(p0, null);
    }
    public void TextInputLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f040917);
    }
    public void TextInputLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = new b(this);
       this.D = new Rect();
       this.E = new RectF();
       c uoc = new c(this);
       this.V0 = uoc;
       int i = 1;
       this.setOrientation(i);
       int b = false;
       this.setWillNotDraw(b);
       this.setAddStatesFromChildren(i);
       FrameLayout uFrameLayout = new FrameLayout(p0);
       this.b = uFrameLayout;
       uFrameLayout.setAddStatesFromChildren(i);
       this.addView(uFrameLayout);
       TimeInterpolator a = a.a;
       uoc.U(a);
       uoc.R(a);
       uoc.H(0x800033);
       int[] ointArray = new int[b];
       x ox = k.i(p0, p1, c$b.G5, p2, R.style.arg_RES_7f1104c2, ointArray);
       this.l = ox.a(21, i);
       this.setHint(ox.p(i));
       this.W0 = ox.a(20, i);
       this.p = c.a(p0.getResources(), 0x7f070bc4);
       this.q = c.a(p0.getResources(), 0x7f070bc7);
       this.s = ox.e(4, b);
       this.t = ox.d(8, 0);
       this.u = ox.d(7, 0);
       this.v = ox.d(5, 0);
       this.w = ox.d(6, 0);
       this.B = ox.b(2, b);
       this.V = ox.b(9, b);
       int i1 = c.b(p0.getResources(), R.dimen.arg_RES_7f070bc9);
       this.y = i1;
       this.z = c.b(p0.getResources(), 0x7f070bca);
       this.x = i1;
       this.setBoxBackgroundMode(ox.k(3, b));
       if (ox.s(b)) {
          ColorStateList uColorStateL = ox.c(b);
          this.S = uColorStateL;
          this.R = uColorStateL;
       }
       this.T = ContextCompat.getColor(p0, 0x7f0618e4);
       this.W = ContextCompat.getColor(p0, 0x7f0618e5);
       this.U = ContextCompat.getColor(p0, 0x7f0618e7);
       int i2 = 22;
       i1 = -1;
       if (ox.n(i2, i1) != i1) {
          this.setHintTextAppearance(ox.n(i2, b));
       }
       i2 = ox.n(16, b);
       boolean b1 = ox.a(15, b);
       int i3 = ox.n(19, b);
       boolean b2 = ox.a(18, b);
       CharSequence uCharSequenc = ox.p(17);
       boolean b3 = ox.a(11, b);
       this.setCounterMaxLength(ox.k(12, i1));
       this.k = ox.n(14, b);
       this.j = ox.n(13, b);
       this.G = ox.a(25, b);
       this.H = ox.g(24);
       this.I = ox.p(23);
       b = 26;
       if (ox.s(b)) {
          this.O = i;
          this.N = ox.c(b);
       }
       if (ox.s(27)) {
          this.Q = i;
          this.P = l.b(ox.k(27, i1), null);
       }
       ox.w();
       this.setHelperTextEnabled(b2);
       this.setHelperText(uCharSequenc);
       this.setHelperTextTextAppearance(i3);
       this.setErrorEnabled(b1);
       this.setErrorTextAppearance(i2);
       this.setCounterEnabled(b3);
       this.d();
       i0.D0(this, 2);
       return;
    }
    public static void t(ViewGroup p0,boolean p1){
       int childCount = p0.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = p0.getChildAt(i);
          childAt.setEnabled(p1);
          if (childAt instanceof ViewGroup) {
             TextInputLayout.t(childAt, p1);
          }
          i = i + 1;
       }
       return;
    }
    public final void A(){
       LinearLayout$LayoutParams layoutParams = this.b.getLayoutParams();
       int i = this.h();
       if (i != layoutParams.topMargin) {
          layoutParams.topMargin = i;
          this.b.requestLayout();
       }
       return;
    }
    public void B(boolean p0){
       this.C(p0, false);
    }
    public final void C(boolean p0,boolean p1){
       TextInputLayout ti;
       boolean b = this.isEnabled();
       TextInputLayout tc = this.c;
       int i = 1;
       tc = (tc != null && !TextUtils.isEmpty(tc.getText()))? 1: 0;
       TextInputLayout tc1 = this.c;
       if (tc1 == null || !tc1.hasFocus()) {
          i = 0;
       }
       boolean b1 = this.e.h();
       tc1 = this.R;
       if (tc1 != null) {
          this.V0.G(tc1);
          this.V0.L(this.R);
       }
       if (!b) {
          this.V0.G(ColorStateList.valueOf(this.W));
          this.V0.L(ColorStateList.valueOf(this.W));
       }else if(b1){
          this.V0.G(this.e.l());
       }else if(this.h != null){
          ti = this.i;
          if (ti != null) {
             this.V0.G(ti.getTextColors());
          }
       }
       if (i) {
          ti = this.S;
          if (ti != null) {
             this.V0.G(ti);
          }
       }
       if (tc || (this.isEnabled() && (i || b1))) {
          if (p1 || this.U0 != null) {
             this.j(p0);
          }
       }else if(p1 || this.U0 == null){
          this.m(p0);
       }
       return;
    }
    public final void D(){
       TextInputLayout tc;
       Drawable[] uDrawableArr;
       if (this.c == null) {
          return;
       }
       int i = 3;
       int i1 = 1;
       int i2 = 2;
       boolean b = false;
       if (this.w()) {
          if (this.J == null) {
             CheckableImageButton uCheckableIm = a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d0264, this.b, b);
             this.J = uCheckableIm;
             uCheckableIm.setImageDrawable(this.H);
             this.J.setContentDescription(this.I);
             this.b.addView(this.J);
             this.J.setOnClickListener(new TextInputLayout$b(this));
          }
          tc = this.c;
          if (tc != null && i0.C(tc) <= 0) {
             this.c.setMinimumHeight(i0.C(this.J));
          }
          this.J.setVisibility(b);
          this.J.setChecked(this.K);
          if (this.L == null) {
             this.L = new ColorDrawable();
          }
          this.L.setBounds(b, b, this.J.getMeasuredWidth(), i1);
          uDrawableArr = b.a(this.c);
          TextInputLayout tL = this.L;
          if (uDrawableArr[i2] != tL) {
             this.M = uDrawableArr[i2];
          }
          b.l(this.c, uDrawableArr[b], uDrawableArr[i1], tL, uDrawableArr[i]);
          this.J.setPadding(this.c.getPaddingLeft(), this.c.getPaddingTop(), this.c.getPaddingRight(), this.c.getPaddingBottom());
       }else {
          tc = this.J;
          if (tc != null && !tc.getVisibility()) {
             this.J.setVisibility(8);
          }
          if (this.L != null) {
             uDrawableArr = b.a(this.c);
             if (uDrawableArr[i2] == this.L) {
                b.l(this.c, uDrawableArr[b], uDrawableArr[i1], this.M, uDrawableArr[i]);
                this.L = null;
             }
          }
       }
       return;
    }
    public final void E(){
       if (this.r == null || (this.o == null || (this.c != null && this.getRight()))) {
          int left = this.c.getLeft();
          int i = this.f();
          int right = this.c.getRight();
          int i1 = this.c.getBottom() + this.p;
          if (this.r == 2) {
             TextInputLayout tz = this.z;
             left = left + (tz / 2);
             i = i - (tz / 2);
             right = right - (tz / 2);
             i1 = i1 + (tz / 2);
          }
          this.o.setBounds(left, i, right, i1);
          this.b();
          this.z();
       }
    label_0049 :
       return;
    }
    public void F(){
       if (this.o != null && this.r != null) {
          TextInputLayout tc = this.c;
          int i = 1;
          boolean b = (tc != null && tc.hasFocus())? true: false;
          TextInputLayout tc1 = this.c;
          if (tc1 == null || !tc1.isHovered()) {
             i = 0;
          }
          if (this.r == 2) {
             if (!this.isEnabled()) {
                this.A = this.W;
             }else if(this.e.h()){
                this.A = this.e.k();
             }else if(this.h != null){
                TextInputLayout ti = this.i;
                if (ti != null) {
                   this.A = ti.getCurrentTextColor();
                }
             }
             if (b) {
                this.A = this.V;
             }else if(i){
                this.A = this.U;
             }else {
                this.A = this.T;
             }
             this.x = (i || (b && this.isEnabled()))? this.z: this.y;
             this.b();
          }
       }
    label_007d :
       return;
    }
    public void a(float p0){
       if (!this.V0.t() - p0) {
          return;
       }
       if (this.X0 == null) {
          ValueAnimator valueAnimato = new ValueAnimator();
          this.X0 = valueAnimato;
          valueAnimato.setInterpolator(a.b);
          this.X0.setDuration(167);
          this.X0.addUpdateListener(new TextInputLayout$c(this));
       }
       float[] uofloatArray = new float[]{this.V0.t(),p0};
       this.X0.setFloatValues(uofloatArray);
       this.X0.start();
       return;
    }
    public void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       if (p0 instanceof EditText) {
          FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(p2);
          layoutParams.gravity = (layoutParams.gravity & 0x8f) | 0x10;
          this.b.addView(p0, layoutParams);
          this.b.setLayoutParams(p2);
          this.A();
          this.setEditText(p0);
       }else {
          super.addView(p0, p1, p2);
       }
       return;
    }
    public final void b(){
       TextInputLayout tC;
       if (this.o == null) {
          return;
       }
       this.u();
       TextInputLayout tc = this.c;
       if (tc != null && this.r == 2) {
          if (tc.getBackground() != null) {
             this.C = this.c.getBackground();
          }
          i0.v0(this.c, null);
       }
       tc = this.c;
       if (tc != null && this.r == 1) {
          tC = this.C;
          if (tC != null) {
             i0.v0(tc, tC);
          }
       }
       tc = this.x;
       if (tc > -1) {
          tC = this.A;
          if (tC != null) {
             this.o.setStroke(tc, tC);
          }
       }
       this.o.setCornerRadii(this.getCornerRadiiAsArray());
       this.o.setColor(this.B);
       this.invalidate();
       return;
    }
    public final void c(RectF p0){
       float f = (float)this.q;
       p0.left = p0.left - f;
       p0.top = p0.top - f;
       p0.right = p0.right + f;
       p0.bottom = p0.bottom + f;
    }
    public final void d(){
       TextInputLayout tH = this.H;
       if (tH != null && (this.O != null || this.Q != null)) {
          Drawable uDrawable = a.r(tH).mutate();
          this.H = uDrawable;
          if (this.O != null) {
             a.o(uDrawable, this.N);
          }
          if (this.Q != null) {
             a.p(this.H, this.P);
          }
          tH = this.J;
          if (tH != null) {
             TextInputLayout tH1 = this.H;
             if (tH.getDrawable() != tH1) {
                this.J.setImageDrawable(tH1);
             }
          }
       }
    label_003b :
       return;
    }
    public void dispatchProvideAutofillStructure(ViewStructure p0,int p1){
       if (this.d != null) {
          TextInputLayout tc = this.c;
          if (tc != null) {
             TextInputLayout tn = this.n;
             this.n = false;
             this.c.setHint(this.d);
             super.dispatchProvideAutofillStructure(p0, p1);
             this.c.setHint(tc.getHint());
             this.n = tn;
             return;
          }
       }
       super.dispatchProvideAutofillStructure(p0, p1);
       return;
    }
    public void dispatchRestoreInstanceState(SparseArray p0){
       this.a1 = true;
       super.dispatchRestoreInstanceState(p0);
       this.a1 = false;
    }
    public void draw(Canvas p0){
       TextInputLayout to = this.o;
       if (to != null) {
          to.draw(p0);
       }
       super.draw(p0);
       if (this.l != null) {
          this.V0.i(p0);
       }
       return;
    }
    public void drawableStateChanged(){
       if (this.Z0 != null) {
          return;
       }
       int b = true;
       this.Z0 = b;
       super.drawableStateChanged();
       int[] drawableStat = this.getDrawableState();
       if (!i0.Y(this) || !this.isEnabled()) {
          b = false;
       }
       this.B(b);
       this.y();
       this.E();
       this.F();
       TextInputLayout tV0 = this.V0;
       b = (tV0 != null)? tV0.S(drawableStat) | 0: 0;
       if (b) {
          this.invalidate();
       }
       this.Z0 = false;
       return;
    }
    public final void e(){
       TextInputLayout tr = this.r;
       if (tr == null) {
          this.o = null;
       }else if(tr == 2 && (this.l != null && !this.o instanceof a)){
          this.o = new a();
       }else if(!this.o instanceof GradientDrawable){
          this.o = new GradientDrawable();
       }
       return;
    }
    public final int f(){
       TextInputLayout tc = this.c;
       int i = 0;
       if (tc == null) {
          return i;
       }
       TextInputLayout tr = this.r;
       if (tr == 1) {
          return tc.getTop();
       }
       if (tr != 2) {
          return i;
       }
       return (tc.getTop() + this.h());
    }
    public final int g(){
       TextInputLayout tr = this.r;
       if (tr == 1) {
          return (this.getBoxBackground().getBounds().top + this.s);
       }
       if (tr != 2) {
          return this.getPaddingTop();
       }
       return (this.getBoxBackground().getBounds().top - this.h());
    }
    public final Drawable getBoxBackground(){
       TextInputLayout tr = this.r;
       if (tr == 1 || tr == 2) {
          return this.o;
       }
       throw new IllegalStateException();
    }
    public int getBoxBackgroundColor(){
       return this.B;
    }
    public float getBoxCornerRadiusBottomEnd(){
       return this.v;
    }
    public float getBoxCornerRadiusBottomStart(){
       return this.w;
    }
    public float getBoxCornerRadiusTopEnd(){
       return this.u;
    }
    public float getBoxCornerRadiusTopStart(){
       return this.t;
    }
    public int getBoxStrokeColor(){
       return this.V;
    }
    public final float[] getCornerRadiiAsArray(){
       float[] uofloatArray;
       TextInputLayout tt;
       TextInputLayout tu;
       TextInputLayout tv;
       TextInputLayout tw;
       int i = 5;
       int i1 = 3;
       int i2 = 1;
       int i3 = 8;
       if (!l.a(this)) {
          uofloatArray = new float[i3];
          tt = this.t;
          uofloatArray[0] = tt;
          uofloatArray[i2] = tt;
          tu = this.u;
          uofloatArray[2] = tu;
          uofloatArray[i1] = tu;
          tv = this.v;
          uofloatArray[4] = tv;
          uofloatArray[i] = tv;
          tw = this.w;
          uofloatArray[6] = tw;
          uofloatArray[7] = tw;
          return uofloatArray;
       }else {
          uofloatArray = new float[i3];
          tt = this.u;
          uofloatArray[0] = tt;
          uofloatArray[i2] = tt;
          tu = this.t;
          uofloatArray[2] = tu;
          uofloatArray[i1] = tu;
          tv = this.w;
          uofloatArray[4] = tv;
          uofloatArray[i] = tv;
          tw = this.v;
          uofloatArray[6] = tw;
          uofloatArray[7] = tw;
          return uofloatArray;
       }
    }
    public int getCounterMaxLength(){
       return this.g;
    }
    public CharSequence getCounterOverflowDescription(){
       if (this.f != null && this.h != null) {
          TextInputLayout ti = this.i;
          if (ti != null) {
             return ti.getContentDescription();
          }
       }
       return null;
    }
    public ColorStateList getDefaultHintTextColor(){
       return this.R;
    }
    public EditText getEditText(){
       return this.c;
    }
    public CharSequence getError(){
       CharSequence uCharSequenc = (this.e.s())? this.e.j(): null;
       return uCharSequenc;
    }
    public int getErrorCurrentTextColors(){
       return this.e.k();
    }
    public final int getErrorTextCurrentColor(){
       return this.e.k();
    }
    public CharSequence getHelperText(){
       CharSequence uCharSequenc = (this.e.t())? this.e.m(): null;
       return uCharSequenc;
    }
    public int getHelperTextCurrentTextColor(){
       return this.e.n();
    }
    public CharSequence getHint(){
       TextInputLayout tm = (this.l != null)? this.m: null;
       return tm;
    }
    public final float getHintCollapsedTextHeight(){
       return this.V0.n();
    }
    public final int getHintCurrentCollapsedTextColor(){
       return this.V0.p();
    }
    public CharSequence getPasswordVisibilityToggleContentDescription(){
       return this.I;
    }
    public Drawable getPasswordVisibilityToggleDrawable(){
       return this.H;
    }
    public Typeface getTypeface(){
       return this.F;
    }
    public final int h(){
       float f;
       int i = 0;
       if (this.l == null) {
          return i;
       }
       TextInputLayout tr = this.r;
       if (tr != null && tr != 1) {
          if (tr != 2) {
             return i;
          }else {
             f = this.V0.n() / 2.00f;
          }
       }else {
          f = this.V0.n();
       }
       return (int)f;
    }
    public final void i(){
       if (this.k()) {
          this.o.d();
       }
       return;
    }
    public final void j(boolean p0){
       TextInputLayout tX0 = this.X0;
       if (tX0 != null && tX0.isRunning()) {
          this.X0.cancel();
       }
       if (p0 && this.W0 != null) {
          this.a(0x3f800000);
       }else {
          this.V0.P(0x3f800000);
       }
       this.U0 = false;
       if (this.k()) {
          this.r();
       }
       return;
    }
    public final boolean k(){
       boolean b = (this.l != null && (!TextUtils.isEmpty(this.m) && this.o instanceof a))? true: false;
       return b;
    }
    public final void l(){
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT != 21 && sDK_INT != 22) {
          return;
       }
       Drawable background = this.c.getBackground();
       if (background == null) {
          return;
       }
       if (this.Y0 == null) {
          Drawable uDrawable = background.getConstantState().newDrawable();
          if (background instanceof DrawableContainer) {
             this.Y0 = e.a(background, uDrawable.getConstantState());
          }
          if (this.Y0 == null) {
             i0.v0(this.c, uDrawable);
             this.Y0 = true;
             this.q();
          }
       }
       return;
    }
    public final void m(boolean p0){
       TextInputLayout tX0 = this.X0;
       if (tX0 != null && tX0.isRunning()) {
          this.X0.cancel();
       }
       if (p0 && this.W0 != null) {
          this.a(0);
       }else {
          this.V0.P(0);
       }
       if (this.k() && this.o.a()) {
          this.i();
       }
       this.U0 = true;
       return;
    }
    public final boolean n(){
       TextInputLayout tc = this.c;
       boolean b = (tc != null && tc.getTransformationMethod() instanceof PasswordTransformationMethod)? true: false;
       return b;
    }
    public boolean o(){
       return this.e.t();
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       if (this.o != null) {
          this.E();
       }
       if (this.l != null) {
          TextInputLayout tc = this.c;
          if (tc != null) {
             TextInputLayout tD = this.D;
             d.a(this, tc, tD);
             int i = tD.left + this.c.getCompoundPaddingLeft();
             p3 = tD.right - this.c.getCompoundPaddingRight();
             this.V0.J(i, (tD.top + this.c.getCompoundPaddingTop()), p3, (tD.bottom - this.c.getCompoundPaddingBottom()));
             this.V0.E(i, this.g(), p3, ((p4 - p2) - this.getPaddingBottom()));
             this.V0.C();
             if (this.k() && this.U0 == null) {
                this.r();
             }
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       this.D();
       super.onMeasure(p0, p1);
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (!p0 instanceof TextInputLayout$SavedState) {
          super.onRestoreInstanceState(p0);
          return;
       }else {
          super.onRestoreInstanceState(p0.a());
          this.setError(p0.d);
          if (p0.e != null) {
             this.s(true);
          }
          this.requestLayout();
          return;
       }
    }
    public Parcelable onSaveInstanceState(){
       TextInputLayout$SavedState savedState = new TextInputLayout$SavedState(super.onSaveInstanceState());
       if (this.e.h()) {
          savedState.d = this.getError();
       }
       savedState.e = this.K;
       return savedState;
    }
    public boolean p(){
       return this.n;
    }
    public final void q(){
       this.e();
       if (this.r != null) {
          this.A();
       }
       this.E();
       return;
    }
    public final void r(){
       if (!this.k()) {
          return;
       }
       TextInputLayout tE = this.E;
       this.V0.k(tE);
       this.c(tE);
       this.o.g(tE);
       return;
    }
    public void s(boolean p0){
       if (this.G != null) {
          int selectionEnd = this.c.getSelectionEnd();
          if (this.n()) {
             this.c.setTransformationMethod(null);
             this.K = true;
          }else {
             this.c.setTransformationMethod(PasswordTransformationMethod.getInstance());
             this.K = false;
          }
          this.J.setChecked(this.K);
          if (p0) {
             this.J.jumpDrawablesToCurrentState();
          }
          this.c.setSelection(selectionEnd);
       }
       return;
    }
    public void setBoxBackgroundColor(int p0){
       if (this.B != p0) {
          this.B = p0;
          this.b();
       }
       return;
    }
    public void setBoxBackgroundColorResource(int p0){
       this.setBoxBackgroundColor(ContextCompat.getColor(this.getContext(), p0));
    }
    public void setBoxBackgroundMode(int p0){
       if (p0 == this.r) {
          return;
       }
       this.r = p0;
       this.q();
       return;
    }
    public void setBoxStrokeColor(int p0){
       if (this.V != p0) {
          this.V = p0;
          this.F();
       }
       return;
    }
    public void setCounterEnabled(boolean p0){
       if (this.f != p0) {
          int i = 2;
          if (p0) {
             AppCompatTextView uAppCompatTe = new AppCompatTextView(this.getContext());
             this.i = uAppCompatTe;
             uAppCompatTe.setId(R.id.textinput_counter);
             TextInputLayout tF = this.F;
             if (tF != null) {
                this.i.setTypeface(tF);
             }
             this.i.setMaxLines(1);
             this.v(this.i, this.k);
             this.e.a(this.i, i);
             TextInputLayout tc = this.c;
             if (tc == null) {
                this.x(0);
             }else {
                this.x(tc.getText().length());
             }
          }else {
             this.e.u(this.i, i);
             this.i = null;
          }
          this.f = p0;
       }
       return;
    }
    public void setCounterMaxLength(int p0){
       if (this.g != p0) {
          this.g = (p0 > 0)? p0: -1;
          if (this.f != null) {
             TextInputLayout tc = this.c;
             tc = (tc == null)? 0: tc.getText().length();
             this.x(tc);
          }
       }
       return;
    }
    public void setDefaultHintTextColor(ColorStateList p0){
       this.R = p0;
       this.S = p0;
       if (this.c != null) {
          this.B(false);
       }
       return;
    }
    public final void setEditText(EditText p0){
       if (this.c != null) {
          throw new IllegalArgumentException("We already have an EditText, can only have one");
       }
       this.c = p0;
       this.q();
       this.setTextInputAccessibilityDelegate(new TextInputLayout$d(this));
       if (!this.n()) {
          this.V0.V(this.c.getTypeface());
       }
       this.V0.N(this.c.getTextSize());
       int gravity = this.c.getGravity();
       this.V0.H(((gravity & 0x8f) | 0x30));
       this.V0.M(gravity);
       this.c.addTextChangedListener(new TextInputLayout$a(this));
       if (this.R == null) {
          this.R = this.c.getHintTextColors();
       }
       if (this.l != null) {
          if (TextUtils.isEmpty(this.m)) {
             CharSequence hint = this.c.getHint();
             this.d = hint;
             this.setHint(hint);
             this.c.setHint(null);
          }
          this.n = true;
       }
       if (this.i != null) {
          this.x(this.c.getText().length());
       }
       this.e.b();
       this.D();
       this.C(false, true);
       return;
    }
    public void setEnabled(boolean p0){
       TextInputLayout.t(this, p0);
       super.setEnabled(p0);
    }
    public void setError(CharSequence p0){
       if (!this.e.s()) {
          if (TextUtils.isEmpty(p0)) {
             return;
          }else {
             this.setErrorEnabled(true);
          }
       }
       if (!TextUtils.isEmpty(p0)) {
          this.e.G(p0);
       }else {
          this.e.o();
       }
       return;
    }
    public void setErrorEnabled(boolean p0){
       this.e.w(p0);
    }
    public void setErrorTextAppearance(int p0){
       this.e.x(p0);
    }
    public void setErrorTextColor(ColorStateList p0){
       this.e.y(p0);
    }
    public void setHelperText(CharSequence p0){
       if (TextUtils.isEmpty(p0)) {
          if (this.o()) {
             this.setHelperTextEnabled(false);
          }
       }else if(!this.o()){
          this.setHelperTextEnabled(true);
       }
       this.e.H(p0);
       return;
    }
    public void setHelperTextColor(ColorStateList p0){
       this.e.B(p0);
    }
    public void setHelperTextEnabled(boolean p0){
       this.e.A(p0);
    }
    public void setHelperTextTextAppearance(int p0){
       this.e.z(p0);
    }
    public void setHint(CharSequence p0){
       if (this.l != null) {
          this.setHintInternal(p0);
          this.sendAccessibilityEvent(2048);
       }
       return;
    }
    public void setHintAnimationEnabled(boolean p0){
       this.W0 = p0;
    }
    public void setHintEnabled(boolean p0){
       if (p0 != this.l) {
          this.l = p0;
          if (!p0) {
             this.n = false;
             if (!TextUtils.isEmpty(this.m) && TextUtils.isEmpty(this.c.getHint())) {
                this.c.setHint(this.m);
             }
             this.setHintInternal(null);
          }else {
             CharSequence hint = this.c.getHint();
             if (!TextUtils.isEmpty(hint)) {
                if (TextUtils.isEmpty(this.m)) {
                   this.setHint(hint);
                }
                this.c.setHint(null);
             }
             this.n = true;
          }
          if (this.c != null) {
             this.A();
          }
       }
       return;
    }
    public final void setHintInternal(CharSequence p0){
       if (!TextUtils.equals(p0, this.m)) {
          this.m = p0;
          this.V0.T(p0);
          if (this.U0 == null) {
             this.r();
          }
       }
       return;
    }
    public void setHintTextAppearance(int p0){
       this.V0.F(p0);
       this.S = this.V0.l();
       if (this.c != null) {
          this.B(false);
          this.A();
       }
       return;
    }
    public void setPasswordVisibilityToggleContentDescription(int p0){
       CharSequence text = (p0)? this.getResources().getText(p0): null;
       this.setPasswordVisibilityToggleContentDescription(text);
       return;
    }
    public void setPasswordVisibilityToggleContentDescription(CharSequence p0){
       this.I = p0;
       TextInputLayout tJ = this.J;
       if (tJ != null) {
          tJ.setContentDescription(p0);
       }
       return;
    }
    public void setPasswordVisibilityToggleDrawable(int p0){
       Drawable uDrawable = (p0)? a.d(this.getContext(), p0): null;
       this.setPasswordVisibilityToggleDrawable(uDrawable);
       return;
    }
    public void setPasswordVisibilityToggleDrawable(Drawable p0){
       this.H = p0;
       TextInputLayout tJ = this.J;
       if (tJ != null) {
          tJ.setImageDrawable(p0);
       }
       return;
    }
    public void setPasswordVisibilityToggleEnabled(boolean p0){
       if (this.G != p0) {
          this.G = p0;
          if (!p0 && this.K != null) {
             TextInputLayout tc = this.c;
             if (tc != null) {
                tc.setTransformationMethod(PasswordTransformationMethod.getInstance());
             }
          }
          this.K = false;
          this.D();
       }
       return;
    }
    public void setPasswordVisibilityToggleTintList(ColorStateList p0){
       this.N = p0;
       this.O = true;
       this.d();
    }
    public void setPasswordVisibilityToggleTintMode(PorterDuff$Mode p0){
       this.P = p0;
       this.Q = true;
       this.d();
    }
    public void setTextInputAccessibilityDelegate(TextInputLayout$d p0){
       TextInputLayout tc = this.c;
       if (tc != null) {
          i0.s0(tc, p0);
       }
       return;
    }
    public void setTypeface(Typeface p0){
       if (p0 != this.F) {
          this.F = p0;
          this.V0.V(p0);
          this.e.D(p0);
          TextInputLayout ti = this.i;
          if (ti != null) {
             ti.setTypeface(p0);
          }
       }
       return;
    }
    public final void u(){
       TextInputLayout tr = this.r;
       if (tr != 1) {
          if (tr == 2 && this.V == null) {
             this.V = this.S.getColorForState(this.getDrawableState(), this.S.getDefaultColor());
          }
       }else {
          this.x = 0;
       }
       return;
    }
    public void v(TextView p0,int p1){
       int i = 1;
       try{
          b.r(p0, p1);
          if (Build$VERSION.SDK_INT < 23 || p0.getTextColors().getDefaultColor() != -65281) {
             i = 0;
          }
       }catch(java.lang.Exception e0){
       }
       if (e0) {
          b.r(p0, R.style.arg_RES_7f1102df);
          p0.setTextColor(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f060957));
       }
       return;
    }
    public final boolean w(){
       boolean b = (this.G != null && (this.n() || this.K != null))? true: false;
       return b;
    }
    public void x(int p0){
       TextInputLayout th = this.h;
       if (this.g == -1) {
          this.i.setText(String.valueOf(p0));
          this.i.setContentDescription(null);
          this.h = false;
       }else if(i0.p(this.i) == 1){
          i0.t0(this.i, false);
       }
       boolean b = (p0 > this.g)? true: false;
       this.h = b;
       if (th != b) {
          TextInputLayout ti = this.i;
          TextInputLayout tj = (b)? this.j: this.k;
          this.v(ti, tj);
          if (this.h != null) {
             i0.t0(this.i, 1);
          }
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(this.g)};
       this.i.setText(this.getContext().getString(R.string.arg_RES_7f10050c, objArray));
       Object[] objArray1 = new Object[]{Integer.valueOf(p0),Integer.valueOf(this.g)};
       this.i.setContentDescription(this.getContext().getString(R.string.arg_RES_7f10050b, objArray1));
       if (this.c != null && th != this.h) {
          this.B(false);
          this.F();
          this.y();
       }
       return;
    }
    public void y(){
       TextInputLayout tc = this.c;
       if (tc == null) {
          return;
       }
       Drawable background = tc.getBackground();
       if (background == null) {
          return;
       }
       this.l();
       if (l.a(background)) {
          background = background.mutate();
       }
       if (this.e.h()) {
          background.setColorFilter(d.d(this.e.k(), PorterDuff$Mode.SRC_IN));
       }else if(this.h != null){
          TextInputLayout ti = this.i;
          if (ti != null) {
             background.setColorFilter(d.d(ti.getCurrentTextColor(), PorterDuff$Mode.SRC_IN));
          }
       }
       a.c(background);
       this.c.refreshDrawableState();
       return;
    }
    public final void z(){
       TextInputLayout tc = this.c;
       if (tc == null) {
          return;
       }
       Drawable background = tc.getBackground();
       if (background == null) {
          return;
       }
       if (l.a(background)) {
          background = background.mutate();
       }
       d.a(this, this.c, new Rect());
       Rect bounds = background.getBounds();
       if (bounds.left != bounds.right) {
          Rect rect = new Rect();
          background.getPadding(rect);
          background.setBounds((bounds.left - rect.left), bounds.top, (bounds.right + (rect.right * 2)), this.c.getBottom());
       }
       return;
    }
}
