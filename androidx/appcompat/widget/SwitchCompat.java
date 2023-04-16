package androidx.appcompat.widget.SwitchCompat;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat$a;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.graphics.Rect;
import android.view.View;
import w0.s;
import android.text.TextPaint;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import ll8.c$b;
import w0.x;
import android.content.res.TypedArray;
import a2.i0;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable$Callback;
import java.lang.CharSequence;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import w0.l;
import androidx.appcompat.widget.b;
import android.widget.TextView;
import android.view.ViewConfiguration;
import java.lang.Object;
import android.util.Property;
import android.animation.ObjectAnimator;
import androidx.core.graphics.drawable.a;
import android.graphics.Canvas;
import android.view.MotionEvent;
import w0.b0;
import android.text.TextUtils;
import android.text.Layout;
import android.text.method.TransformationMethod;
import android.text.StaticLayout;
import java.lang.Math;
import android.text.Layout$Alignment;
import t0.a;
import android.graphics.Typeface;
import android.graphics.Region$Op;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.StringBuilder;
import java.util.List;
import android.view.ViewParent;
import android.os.IBinder;
import android.view.ActionMode$Callback;
import androidx.core.widget.b;
import r0.a;

public class SwitchCompat extends CompoundButton	// class@00062a
{
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public final TextPaint G;
    public ColorStateList H;
    public Layout I;
    public Layout J;
    public TransformationMethod K;
    public ObjectAnimator L;
    public final b M;
    public final Rect N;
    public Drawable b;
    public ColorStateList c;
    public PorterDuff$Mode d;
    public boolean e;
    public boolean f;
    public Drawable g;
    public ColorStateList h;
    public PorterDuff$Mode i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public CharSequence p;
    public CharSequence q;
    public boolean r;
    public int s;
    public int t;
    public float u;
    public float v;
    public VelocityTracker w;
    public int x;
    public float y;
    public int z;
    public static final Property O;
    public static final int[] P;

    static {
       SwitchCompat.O = new SwitchCompat$a(Float.class, "thumbPos");
       int[] ointArray = new int[]{0x10100a0};
       SwitchCompat.P = ointArray;
    }
    public void SwitchCompat(Context p0){
       super(p0, null);
    }
    public void SwitchCompat(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f0408af);
    }
    public void SwitchCompat(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       ColorStateList uColorStateL = null;
       this.c = uColorStateL;
       this.d = uColorStateL;
       this.e = false;
       this.f = false;
       this.h = uColorStateL;
       this.i = uColorStateL;
       this.j = false;
       this.k = false;
       this.w = VelocityTracker.obtain();
       this.N = new Rect();
       s.a(this, this.getContext());
       TextPaint textPaint = new TextPaint(1);
       this.G = textPaint;
       textPaint.density = c.c(this.getResources()).density;
       int[] b5 = c$b.B5;
       x ox = x.v(p0, p1, b5, p2, false);
       i0.q0(this, p0, b5, p1, ox.r(), p2, 0);
       Drawable uDrawable = ox.g(2);
       this.b = uDrawable;
       if (uDrawable != null) {
          uDrawable.setCallback(this);
       }
       uDrawable = ox.g(11);
       this.g = uDrawable;
       if (uDrawable != null) {
          uDrawable.setCallback(this);
       }
       this.p = ox.p(false);
       this.q = ox.p(1);
       this.r = ox.a(3, 1);
       this.l = ox.f(8, false);
       this.m = ox.f(5, false);
       this.n = ox.f(6, false);
       this.o = ox.a(4, false);
       ColorStateList uColorStateL1 = ox.c(9);
       if (uColorStateL1 != null) {
          this.c = uColorStateL1;
          this.e = true;
       }
       PorterDuff$Mode mode = l.e(ox.k(10, -1), uColorStateL);
       if (this.d != mode) {
          this.d = mode;
          this.f = true;
       }
       if (this.e != null || this.f != null) {
          this.b();
       }
       uColorStateL1 = ox.c(12);
       if (uColorStateL1 != null) {
          this.h = uColorStateL1;
          this.j = true;
       }
       PorterDuff$Mode mode1 = l.e(ox.k(13, -1), uColorStateL);
       if (this.i != mode1) {
          this.i = mode1;
          this.k = true;
       }
       if (this.j != null || this.k != null) {
          this.c();
       }
       int i = ox.n(7, false);
       if (i) {
          this.i(p0, i);
       }
       b uob = new b(this);
       this.M = uob;
       uob.m(p1, p2);
       ox.w();
       ViewConfiguration viewConfigur = ViewConfiguration.get(p0);
       this.t = viewConfigur.getScaledTouchSlop();
       this.x = viewConfigur.getScaledMinimumFlingVelocity();
       this.refreshDrawableState();
       this.setChecked(this.isChecked());
       return;
    }
    public static float f(float p0,float p1,float p2){
       if (p0 - p1 < 0) {
          p0 = p1;
       }else if(p0 - p2 > 0){
          p0 = p2;
       }
       return p0;
    }
    public final void a(boolean p0){
       int i = (p0)? 0x3f800000: 0;
       float[] uofloatArray = new float[]{i};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this, SwitchCompat.O, uofloatArray);
       this.L = objectAnimat;
       objectAnimat.setDuration(250);
       this.L.setAutoCancel(1);
       this.L.start();
       return;
    }
    public final void b(){
       SwitchCompat tb = this.b;
       if (tb != null && (this.e != null || this.f != null)) {
          Drawable uDrawable = a.r(tb).mutate();
          this.b = uDrawable;
          if (this.e != null) {
             a.o(uDrawable, this.c);
          }
          if (this.f != null) {
             a.p(this.b, this.d);
          }
          if (this.b.isStateful()) {
             this.b.setState(this.getDrawableState());
          }
       }
    label_003b :
       return;
    }
    public final void c(){
       SwitchCompat tg = this.g;
       if (tg != null && (this.j != null || this.k != null)) {
          Drawable uDrawable = a.r(tg).mutate();
          this.g = uDrawable;
          if (this.j != null) {
             a.o(uDrawable, this.h);
          }
          if (this.k != null) {
             a.p(this.g, this.i);
          }
          if (this.g.isStateful()) {
             this.g.setState(this.getDrawableState());
          }
       }
    label_003b :
       return;
    }
    public final void d(){
       SwitchCompat tL = this.L;
       if (tL != null) {
          tL.cancel();
       }
       return;
    }
    public void draw(Canvas p0){
       int i1;
       int i2;
       SwitchCompat tN = this.N;
       SwitchCompat tC = this.C;
       SwitchCompat tD = this.D;
       SwitchCompat tE = this.E;
       SwitchCompat tF = this.F;
       int i = this.getThumbOffset() + tC;
       SwitchCompat tb = this.b;
       Rect rect = (tb != null)? l.d(tb): l.c;
       SwitchCompat tg = this.g;
       if (tg != null) {
          tg.getPadding(tN);
          Rect left = tN.left;
          i = i + left;
          if (rect != null) {
             Rect left1 = rect.left;
             if (left1 > left) {
                tC = tC + (left1 - left);
             }
             left = rect.top;
             left1 = tN.top;
             i1 = (left > left1)? (left - left1) + tD: tD;
             left1 = rect.right;
             Rect right = tN.right;
             if (left1 > right) {
                tE = tE - (left1 - right);
             }
             rect = rect.bottom;
             left1 = tN.bottom;
             if (rect > left1) {
                i2 = tF - (rect - left1);
             label_004a :
                this.g.setBounds(tC, i1, tE, i2);
             }
          }else {
             i1 = tD;
          }
          i2 = tF;
          goto label_004a ;
       }
       tC = this.b;
       if (tC != null) {
          tC.getPadding(tN);
          int i3 = i - tN.left;
          i = (i + this.B) + tN.right;
          this.b.setBounds(i3, tD, i, tF);
          Drawable background = this.getBackground();
          if (background != null) {
             a.l(background, i3, tD, i, tF);
          }
       }
       super.draw(p0);
       return;
    }
    public void drawableHotspotChanged(float p0,float p1){
       super.drawableHotspotChanged(p0, p1);
       SwitchCompat tb = this.b;
       if (tb != null) {
          a.k(tb, p0, p1);
       }
       tb = this.g;
       if (tb != null) {
          a.k(tb, p0, p1);
       }
       return;
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       int[] drawableStat = this.getDrawableState();
       SwitchCompat tb = this.b;
       int i = 0;
       if (tb != null && tb.isStateful()) {
          i = i | tb.setState(drawableStat);
       }
       tb = this.g;
       if (tb != null && tb.isStateful()) {
          i = i | tb.setState(drawableStat);
       }
       if (i) {
          this.invalidate();
       }
       return;
    }
    public final void e(MotionEvent p0){
       p0 = MotionEvent.obtain(p0);
       p0.setAction(3);
       super.onTouchEvent(p0);
       p0.recycle();
    }
    public final boolean g(float p0,float p1){
       boolean b = false;
       if (this.b == null) {
          return b;
       }
       this.b.getPadding(this.N);
       SwitchCompat tt = this.t;
       int i = this.D - tt;
       int i1 = (this.C + this.getThumbOffset()) - tt;
       SwitchCompat tN = this.N;
       int i2 = (((this.B + i1) + tN.left) + tN.right) + tt;
       int i3 = this.F + tt;
       if (p0 - (float)i1 > 0 && (p0 - (float)i2 < 0 && (p1 - (float)i > 0 && p1 - (float)i3 < 0))) {
          b = true;
       }
    label_003e :
       return b;
    }
    public int getCompoundPaddingLeft(){
       if (!b0.b(this)) {
          return super.getCompoundPaddingLeft();
       }
       int i = super.getCompoundPaddingLeft() + this.z;
       if (!TextUtils.isEmpty(this.getText())) {
          i = i + this.n;
       }
       return i;
    }
    public int getCompoundPaddingRight(){
       if (b0.b(this)) {
          return super.getCompoundPaddingRight();
       }
       int i = super.getCompoundPaddingRight() + this.z;
       if (!TextUtils.isEmpty(this.getText())) {
          i = i + this.n;
       }
       return i;
    }
    public boolean getShowText(){
       return this.r;
    }
    public boolean getSplitTrack(){
       return this.o;
    }
    public int getSwitchMinWidth(){
       return this.m;
    }
    public int getSwitchPadding(){
       return this.n;
    }
    public final boolean getTargetCheckedState(){
       boolean b = (this.y - 0x3f000000 > 0)? true: false;
       return b;
    }
    public CharSequence getTextOff(){
       return this.q;
    }
    public CharSequence getTextOn(){
       return this.p;
    }
    public Drawable getThumbDrawable(){
       return this.b;
    }
    public final int getThumbOffset(){
       float f = (b0.b(this))? 0x3f800000 - this.y: this.y;
       return (int)((f * (float)this.getThumbScrollRange()) + 0x3f000000);
    }
    public final int getThumbScrollRange(){
       SwitchCompat tg = this.g;
       if (tg == null) {
          return 0;
       }
       SwitchCompat tN = this.N;
       tg.getPadding(tN);
       tg = this.b;
       Rect rect = (tg != null)? l.d(tg): l.c;
       return (((((this.z - this.B) - tN.left) - tN.right) - rect.left) - rect.right);
    }
    public int getThumbTextPadding(){
       return this.l;
    }
    public ColorStateList getThumbTintList(){
       return this.c;
    }
    public PorterDuff$Mode getThumbTintMode(){
       return this.d;
    }
    public Drawable getTrackDrawable(){
       return this.g;
    }
    public ColorStateList getTrackTintList(){
       return this.h;
    }
    public PorterDuff$Mode getTrackTintMode(){
       return this.i;
    }
    public final Layout h(CharSequence p0){
       SwitchCompat tK = this.K;
       if (tK != null) {
          p0 = tK.getTransformation(p0, this);
       }
       CharSequence uCharSequenc = p0;
       SwitchCompat tG = this.G;
       int i = (uCharSequenc != null)? (int)Math.ceil((double)Layout.getDesiredWidth(uCharSequenc, tG)): 0;
       StaticLayout staticLayout = new StaticLayout(uCharSequenc, tG, i, Layout$Alignment.ALIGN_NORMAL, 0x3f800000, 0, true);
       return p0;
    }
    public void i(Context p0,int p1){
       x ox = x.t(p0, p1, c$b.E5);
       ColorStateList uColorStateL = ox.c(3);
       this.H = (uColorStateL != null)? uColorStateL: this.getTextColors();
       uColorStateL = 0;
       int i = ox.f(uColorStateL, uColorStateL);
       if (i) {
          float f = (float)i;
          if (f - this.G.getTextSize()) {
             this.G.setTextSize(f);
             this.requestLayout();
          }
       }
       this.k(ox.k(1, -1), ox.k(2, -1));
       this.K = (ox.a(14, uColorStateL))? new a(this.getContext()): null;
       ox.w();
       return;
    }
    public void j(Typeface p0,int p1){
       float f = 0;
       boolean b = false;
       if (p1 > 0) {
          p0 = (p0 == null)? Typeface.defaultFromStyle(p1): Typeface.create(p0, p1);
          this.setSwitchTypeface(p0);
          int style = (p0 != null)? p0.getStyle(): 0;
          style = (~ style) & p1;
          SwitchCompat tG = this.G;
          if (style & 0x01) {
             b = true;
          }
          tG.setFakeBoldText(b);
          tG = this.G;
          if (style & 0x02) {
             f = -0.25f;
          }
          tG.setTextSkewX(f);
       }else {
          this.G.setFakeBoldText(b);
          this.G.setTextSkewX(f);
          this.setSwitchTypeface(p0);
       }
       return;
    }
    public void jumpDrawablesToCurrentState(){
       super.jumpDrawablesToCurrentState();
       SwitchCompat tb = this.b;
       if (tb != null) {
          tb.jumpToCurrentState();
       }
       tb = this.g;
       if (tb != null) {
          tb.jumpToCurrentState();
       }
       tb = this.L;
       if (tb != null && tb.isStarted()) {
          this.L.end();
          this.L = null;
       }
       return;
    }
    public final void k(int p0,int p1){
       Typeface typeface;
       if (p0 != 1) {
          if (p0 != 2) {
             typeface = (p0 != 3)? null: Typeface.MONOSPACE;
          }else {
             typeface = Typeface.SERIF;
          }
       }else {
          typeface = Typeface.SANS_SERIF;
       }
       this.j(typeface, p1);
       return;
    }
    public final void l(MotionEvent p0){
       this.s = 0;
       boolean b = true;
       SwitchCompat switchCompat = (p0.getAction() == b && this.isEnabled())? 1: null;
       boolean b1 = this.isChecked();
       if (switchCompat) {
          this.w.computeCurrentVelocity(1000);
          float xVelocity = this.w.getXVelocity();
          if (Math.abs(xVelocity) - (float)this.x > 0) {
             if (b0.b(this)) {
                if (xVelocity >= 0) {
                }
             }else if(xVelocity > 0){
             }
          }else {
             b = this.getTargetCheckedState();
          }
       }else {
          b = b1;
       }
       if (b != b1) {
          this.playSoundEffect(0);
       }
       this.setChecked(b);
       this.e(p0);
       return;
    }
    public int[] onCreateDrawableState(int p0){
       p0++;
       int[] ointArray = super.onCreateDrawableState(p0);
       if (this.isChecked()) {
          CompoundButton.mergeDrawableStates(ointArray, SwitchCompat.P);
       }
       return ointArray;
    }
    public void onDraw(Canvas p0){
       int i3;
       super.onDraw(p0);
       SwitchCompat tN = this.N;
       SwitchCompat tg = this.g;
       if (tg != null) {
          tg.getPadding(tN);
       }else {
          tN.setEmpty();
       }
       int i = this.D + tN.top;
       int i1 = this.F - tN.bottom;
       SwitchCompat tb = this.b;
       if (tg != null) {
          if (this.o != null && tb != null) {
             Rect rect = l.d(tb);
             tb.copyBounds(tN);
             tN.left = tN.left + rect.left;
             tN.right = tN.right - rect.right;
             p0.clipRect(tN, Region$Op.DIFFERENCE);
             tg.draw(p0);
             p0.restoreToCount(p0.save());
          }else {
             tg.draw(p0);
          }
       }
       int i2 = p0.save();
       if (tb != null) {
          tb.draw(p0);
       }
       tg = (this.getTargetCheckedState())? this.I: this.J;
       if (tg != null) {
          int[] drawableStat = this.getDrawableState();
          SwitchCompat tH = this.H;
          if (tH != null) {
             this.G.setColor(tH.getColorForState(drawableStat, 0));
          }
          this.G.drawableState = drawableStat;
          if (tb != null) {
             Rect bounds = tb.getBounds();
             i3 = bounds.left + bounds.right;
          }else {
             i3 = this.getWidth();
          }
          p0.translate((float)((i3 / 2) - (tg.getWidth() / 2)), (float)(((i + i1) / 2) - (tg.getHeight() / 2)));
          tg.draw(p0);
       }
       p0.restoreToCount(i2);
       return;
    }
    public void onInitializeAccessibilityEvent(AccessibilityEvent p0){
       super.onInitializeAccessibilityEvent(p0);
       p0.setClassName("android.widget.Switch");
    }
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo p0){
       super.onInitializeAccessibilityNodeInfo(p0);
       p0.setClassName("android.widget.Switch");
       SwitchCompat tp = (this.isChecked())? this.p: this.q;
       if (!TextUtils.isEmpty(tp)) {
          CharSequence text = p0.getText();
          if (TextUtils.isEmpty(text)) {
             p0.setText(tp);
          }else {
             p0.setText(text+' '+tp);
          }
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       Rect rect;
       int i;
       SwitchCompat tA;
       super.onLayout(p0, p1, p2, p3, p4);
       p1 = 0;
       if (this.b != null) {
          SwitchCompat tN = this.N;
          SwitchCompat tg = this.g;
          if (tg != null) {
             tg.getPadding(tN);
          }else {
             tN.setEmpty();
          }
          rect = l.d(this.b);
          p3 = Math.max(p1, (rect.left - tN.left));
          p1 = Math.max(p1, (rect.right - tN.right));
       }else {
          p3 = 0;
       }
       if (b0.b(this)) {
          i = this.getPaddingLeft() + p3;
          rect = ((this.z + i) - p3) - p1;
       }else {
          rect = (this.getWidth() - this.getPaddingRight()) - p1;
          i = ((rect - this.z) + p3) + p1;
       }
       p1 = this.getGravity() & 0x70;
       if (p1 != 16) {
          if (p1 != 80) {
             p1 = this.getPaddingTop();
             tA = this.A;
          }else {
             p3 = this.getHeight() - this.getPaddingBottom();
             p1 = p3 - this.A;
          label_008b :
             this.C = i;
             this.D = p1;
             this.F = tA;
             this.E = rect;
             return;
          }
       }else {
          tA = this.A;
          p1 = (((this.getPaddingTop() + this.getHeight()) - this.getPaddingBottom()) / 2) - (tA / 2);
       }
       tA = tA + p1;
       goto label_008b ;
    }
    public void onMeasure(int p0,int p1){
       int i1;
       int intrinsicHei;
       if (this.r != null) {
          if (this.I == null) {
             this.I = this.h(this.p);
          }
          if (this.J == null) {
             this.J = this.h(this.q);
          }
       }
       SwitchCompat tN = this.N;
       SwitchCompat tb = this.b;
       int i = 0;
       if (tb != null) {
          tb.getPadding(tN);
          i1 = (this.b.getIntrinsicWidth() - tN.left) - tN.right;
          intrinsicHei = this.b.getIntrinsicHeight();
       }else {
          i1 = 0;
          intrinsicHei = 0;
       }
       int i2 = (this.r != null)? Math.max(this.I.getWidth(), this.J.getWidth()) + (this.l * 2): 0;
       this.B = Math.max(i2, i1);
       tb = this.g;
       if (tb != null) {
          tb.getPadding(tN);
          i = this.g.getIntrinsicHeight();
       }else {
          tN.setEmpty();
       }
       Rect left = tN.left;
       Rect right = tN.right;
       SwitchCompat tb1 = this.b;
       if (tb1 != null) {
          Rect rect = l.d(tb1);
          left = Math.max(left, rect.left);
          right = Math.max(right, rect.right);
       }
       i1 = Math.max(i, intrinsicHei);
       this.z = Math.max(this.m, (((this.B * 2) + left) + right));
       this.A = i1;
       super.onMeasure(p0, p1);
       if (this.getMeasuredHeight() < i1) {
          this.setMeasuredDimension(this.getMeasuredWidthAndState(), i1);
       }
       return;
    }
    public void onPopulateAccessibilityEvent(AccessibilityEvent p0){
       super.onPopulateAccessibilityEvent(p0);
       SwitchCompat tp = (this.isChecked())? this.p: this.q;
       if (tp != null) {
          p0.getText().add(tp);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       float f;
       float f1;
       this.w.addMovement(p0);
       int actionMasked = p0.getActionMasked();
       if (actionMasked) {
          SwitchCompat switchCompat = 2;
          if (actionMasked != 1) {
             if (actionMasked != switchCompat) {
                if (actionMasked == 3) {
                label_008b :
                   if (this.s == switchCompat) {
                      this.l(p0);
                      super.onTouchEvent(p0);
                      return true;
                   }else {
                      this.s = 0;
                      this.w.clear();
                   }
                }
             }else {
                SwitchCompat ts = this.s;
                if (ts != true) {
                   if (ts == switchCompat) {
                      float x = p0.getX();
                      actionMasked = this.getThumbScrollRange();
                      f = x - this.u;
                      if (actionMasked) {
                         f = f / (float)actionMasked;
                      }else if(f > 0){
                         f = 0x3f800000;
                      }else {
                         f = 0xbf800000;
                      }
                      if (b0.b(this)) {
                         f = - f;
                      }
                      f1 = SwitchCompat.f((this.y + f), 0, 0x3f800000);
                      if (f1 - this.y) {
                         this.u = x;
                         this.setThumbPosition(f1);
                      }
                      return true;
                   }
                }else {
                   f1 = p0.getX();
                   float y = p0.getY();
                   if (Math.abs((f1 - this.u)) - (float)this.t > 0 || Math.abs((y - this.v)) - (float)this.t > 0) {
                      this.s = switchCompat;
                      this.getParent().requestDisallowInterceptTouchEvent(true);
                      this.u = f1;
                      this.v = y;
                      return true;
                   }
                }
             }
          }else {
             goto label_008b ;
          }
       }else {
          f1 = p0.getX();
          f = p0.getY();
          if (this.isEnabled() && this.g(f1, f)) {
             this.s = 1;
             this.u = f1;
             this.v = f;
          }
       }
    label_00b9 :
       return super.onTouchEvent(p0);
    }
    public void setChecked(boolean p0){
       super.setChecked(p0);
       p0 = this.isChecked();
       if (this.getWindowToken() != null && i0.Y(this)) {
          this.a(p0);
       }else {
          this.d();
          float f = (p0)? 0x3f800000: 0;
          this.setThumbPosition(f);
       }
       return;
    }
    public void setCustomSelectionActionModeCallback(ActionMode$Callback p0){
       super.setCustomSelectionActionModeCallback(b.t(this, p0));
    }
    public void setShowText(boolean p0){
       if (this.r != p0) {
          this.r = p0;
          this.requestLayout();
       }
       return;
    }
    public void setSplitTrack(boolean p0){
       this.o = p0;
       this.invalidate();
    }
    public void setSwitchMinWidth(int p0){
       this.m = p0;
       this.requestLayout();
    }
    public void setSwitchPadding(int p0){
       this.n = p0;
       this.requestLayout();
    }
    public void setSwitchTypeface(Typeface p0){
       if (this.G.getTypeface() == null || (!this.G.getTypeface().equals(p0) || (this.G.getTypeface() == null && p0 != null))) {
          this.G.setTypeface(p0);
          this.requestLayout();
          this.invalidate();
       }
       return;
    }
    public void setTextOff(CharSequence p0){
       this.q = p0;
       this.requestLayout();
    }
    public void setTextOn(CharSequence p0){
       this.p = p0;
       this.requestLayout();
    }
    public void setThumbDrawable(Drawable p0){
       SwitchCompat tb = this.b;
       if (tb != null) {
          tb.setCallback(null);
       }
       this.b = p0;
       if (p0 != null) {
          p0.setCallback(this);
       }
       this.requestLayout();
       return;
    }
    public void setThumbPosition(float p0){
       this.y = p0;
       this.invalidate();
    }
    public void setThumbResource(int p0){
       this.setThumbDrawable(a.d(this.getContext(), p0));
    }
    public void setThumbTextPadding(int p0){
       this.l = p0;
       this.requestLayout();
    }
    public void setThumbTintList(ColorStateList p0){
       this.c = p0;
       this.e = true;
       this.b();
    }
    public void setThumbTintMode(PorterDuff$Mode p0){
       this.d = p0;
       this.f = true;
       this.b();
    }
    public void setTrackDrawable(Drawable p0){
       SwitchCompat tg = this.g;
       if (tg != null) {
          tg.setCallback(null);
       }
       this.g = p0;
       if (p0 != null) {
          p0.setCallback(this);
       }
       this.requestLayout();
       return;
    }
    public void setTrackResource(int p0){
       this.setTrackDrawable(a.d(this.getContext(), p0));
    }
    public void setTrackTintList(ColorStateList p0){
       this.h = p0;
       this.j = true;
       this.c();
    }
    public void setTrackTintMode(PorterDuff$Mode p0){
       this.i = p0;
       this.k = true;
       this.c();
    }
    public void toggle(){
       this.setChecked((this.isChecked() ^ 0x01));
    }
    public boolean verifyDrawable(Drawable p0){
       boolean b = (!super.verifyDrawable(p0) && (p0 == this.b || p0 == this.g))? true: false;
       return b;
    }
}
