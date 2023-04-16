package com.google.android.material.chip.a;
import q1.d;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;
import android.content.Context;
import com.google.android.material.chip.a$a;
import android.text.TextPaint;
import android.graphics.Paint;
import android.graphics.Paint$FontMetrics;
import android.graphics.RectF;
import android.graphics.PointF;
import android.graphics.PorterDuff$Mode;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.content.res.ColorStateList;
import ek.b;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.a;
import r0.a;
import fk.a;
import java.lang.CharSequence;
import android.graphics.Rect;
import android.text.TextUtils$TruncateAt;
import rj.h;
import y1.a;
import java.util.Arrays;
import android.graphics.ColorFilter;
import com.google.android.material.chip.a$b;
import android.graphics.Canvas;
import xj.a;
import java.lang.Math;
import android.graphics.Outline;
import android.graphics.Paint$Align;
import ll8.c$b;
import android.content.res.TypedArray;
import ck.k;
import ek.a;
import java.lang.String;
import android.graphics.PorterDuffColorFilter;
import zj.a;
import android.graphics.Paint$Style;
import o1.f$a;
import java.lang.Runnable;
import p1.a;
import android.text.TextUtils;

public class a extends Drawable implements d, Drawable$Callback	// class@001678
{
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public final Context H;
    public final TextPaint I;
    public final Paint J;
    public final Paint K;
    public final Paint$FontMetrics L;
    public final RectF M;
    public final PointF N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public int T;
    public int U;
    public boolean U0;
    public ColorFilter V;
    public ColorStateList V0;
    public PorterDuffColorFilter W;
    public WeakReference W0;
    public ColorStateList X;
    public boolean X0;
    public PorterDuff$Mode Y;
    public float Y0;
    public int[] Z;
    public TextUtils$TruncateAt Z0;
    public boolean a1;
    public ColorStateList b;
    public int b1;
    public float c;
    public float d;
    public ColorStateList e;
    public float f;
    public ColorStateList g;
    public CharSequence h;
    public CharSequence i;
    public b j;
    public final f$a k;
    public boolean l;
    public Drawable m;
    public ColorStateList n;
    public float o;
    public boolean p;
    public Drawable q;
    public ColorStateList r;
    public float s;
    public CharSequence t;
    public boolean u;
    public boolean v;
    public Drawable w;
    public h x;
    public h y;
    public float z;
    public static final int[] c1;

    static {
       int[] ointArray = new int[]{0x101009e};
       a.c1 = ointArray;
    }
    public void a(Context p0){
       super();
       this.k = new a$a(this);
       TextPaint textPaint = new TextPaint(1);
       this.I = textPaint;
       this.J = new Paint(1);
       this.L = new Paint$FontMetrics();
       this.M = new RectF();
       this.N = new PointF();
       this.U = 255;
       this.Y = PorterDuff$Mode.SRC_IN;
       this.W0 = new WeakReference(null);
       this.X0 = true;
       this.H = p0;
       this.h = "";
       textPaint.density = c.c(p0.getResources()).density;
       this.K = null;
       int[] c1 = a.c1;
       this.setState(c1);
       this.X0(c1);
       this.a1 = true;
    }
    public static boolean a0(int[] p0,int p1){
       if (p0 == null) {
          return false;
       }
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (p0[i] == p1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public static boolean g0(ColorStateList p0){
       boolean b = (p0 != null && p0.isStateful())? true: false;
       return b;
    }
    public static boolean h0(Drawable p0){
       boolean b = (p0 != null && p0.isStateful())? true: false;
       return b;
    }
    public static boolean i0(b p0){
       boolean b;
       if (p0 != null) {
          p0 = p0.b;
          if (p0 != null && p0.isStateful()) {
             b = true;
          label_000f :
             return b;
          }
       }
       b = false;
       goto label_000f ;
    }
    public static a m(Context p0,AttributeSet p1,int p2,int p3){
       a uoa = new a(p0);
       uoa.j0(p1, p2, p3);
       return uoa;
    }
    public float A(){
       return this.o;
    }
    public void A0(float p0){
       if (this.o - p0) {
          this.o = p0;
          this.invalidateSelf();
          if (this.c() - this.c()) {
             this.k0();
          }
       }
       return;
    }
    public final boolean A1(){
       boolean b = (this.l != null && this.m != null)? true: false;
       return b;
    }
    public ColorStateList B(){
       return this.n;
    }
    public void B0(int p0){
       this.A0(this.H.getResources().getDimension(p0));
    }
    public final boolean B1(){
       boolean b = (this.p != null && this.q != null)? true: false;
       return b;
    }
    public float C(){
       return this.c;
    }
    public void C0(ColorStateList p0){
       if (this.n != p0) {
          this.n = p0;
          if (this.A1()) {
             a.o(this.m, p0);
          }
          this.onStateChange(this.getState());
       }
       return;
    }
    public final void C1(Drawable p0){
       if (p0 != null) {
          p0.setCallback(null);
       }
       return;
    }
    public float D(){
       return this.z;
    }
    public void D0(int p0){
       this.C0(a.c(this.H, p0));
    }
    public final void D1(){
       ColorStateList uColorStateL = (this.U0 != null)? a.a(this.g): null;
       this.V0 = uColorStateL;
       return;
    }
    public ColorStateList E(){
       return this.e;
    }
    public void E0(int p0){
       this.F0(this.H.getResources().getBoolean(p0));
    }
    public float F(){
       return this.f;
    }
    public void F0(boolean p0){
       if (this.l != p0) {
          this.l = p0;
          p0 = this.A1();
          int i = (this.A1() != p0)? 1: 0;
          if (i) {
             if (p0) {
                this.a(this.m);
             }else {
                this.C1(this.m);
             }
             this.invalidateSelf();
             this.k0();
          }
       }
       return;
    }
    public Drawable G(){
       a tq = this.q;
       Drawable uDrawable = (tq != null)? a.q(tq): null;
       return uDrawable;
    }
    public void G0(float p0){
       if (this.c - p0) {
          this.c = p0;
          this.invalidateSelf();
          this.k0();
       }
       return;
    }
    public CharSequence H(){
       return this.t;
    }
    public void H0(int p0){
       this.G0(this.H.getResources().getDimension(p0));
    }
    public float I(){
       return this.F;
    }
    public void I0(float p0){
       if (this.z - p0) {
          this.z = p0;
          this.invalidateSelf();
          this.k0();
       }
       return;
    }
    public float J(){
       return this.s;
    }
    public void J0(int p0){
       this.I0(this.H.getResources().getDimension(p0));
    }
    public float K(){
       return this.E;
    }
    public void K0(ColorStateList p0){
       if (this.e != p0) {
          this.e = p0;
          this.onStateChange(this.getState());
       }
       return;
    }
    public int[] L(){
       return this.Z;
    }
    public void L0(int p0){
       this.K0(a.c(this.H, p0));
    }
    public ColorStateList M(){
       return this.r;
    }
    public void M0(float p0){
       if (this.f - p0) {
          this.f = p0;
          this.J.setStrokeWidth(p0);
          this.invalidateSelf();
       }
       return;
    }
    public void N(RectF p0){
       this.f(this.getBounds(), p0);
    }
    public void N0(int p0){
       this.M0(this.H.getResources().getDimension(p0));
    }
    public TextUtils$TruncateAt O(){
       return this.Z0;
    }
    public void O0(Drawable p0){
       Drawable uDrawable = this.G();
       if (uDrawable != p0) {
          float f = this.g();
          p0 = (p0 != null)? a.r(p0).mutate(): null;
          this.q = p0;
          float f1 = this.g();
          this.C1(uDrawable);
          if (this.B1()) {
             this.a(this.q);
          }
          this.invalidateSelf();
          if (f - f1) {
             this.k0();
          }
       }
       return;
    }
    public h P(){
       return this.y;
    }
    public void P0(CharSequence p0){
       if (this.t != p0) {
          this.t = a.c().i(p0);
          this.invalidateSelf();
       }
       return;
    }
    public float Q(){
       return this.B;
    }
    public void Q0(float p0){
       if (this.F - p0) {
          this.F = p0;
          this.invalidateSelf();
          if (this.B1()) {
             this.k0();
          }
       }
       return;
    }
    public float R(){
       return this.A;
    }
    public void R0(int p0){
       this.Q0(this.H.getResources().getDimension(p0));
    }
    public ColorStateList S(){
       return this.g;
    }
    public void S0(int p0){
       this.O0(a.d(this.H, p0));
    }
    public h T(){
       return this.x;
    }
    public void T0(float p0){
       if (this.s - p0) {
          this.s = p0;
          this.invalidateSelf();
          if (this.B1()) {
             this.k0();
          }
       }
       return;
    }
    public CharSequence U(){
       return this.h;
    }
    public void U0(int p0){
       this.T0(this.H.getResources().getDimension(p0));
    }
    public b V(){
       return this.j;
    }
    public void V0(float p0){
       if (this.E - p0) {
          this.E = p0;
          this.invalidateSelf();
          if (this.B1()) {
             this.k0();
          }
       }
       return;
    }
    public float W(){
       return this.D;
    }
    public void W0(int p0){
       this.V0(this.H.getResources().getDimension(p0));
    }
    public float X(){
       return this.C;
    }
    public boolean X0(int[] p0){
       if (!Arrays.equals(this.Z, p0)) {
          this.Z = p0;
          if (this.B1()) {
             return this.l0(this.getState(), p0);
          }
       }
       return false;
    }
    public final float Y(){
       if (this.X0 == null) {
          return this.Y0;
       }
       float f = this.k(this.i);
       this.Y0 = f;
       this.X0 = false;
       return f;
    }
    public void Y0(ColorStateList p0){
       if (this.r != p0) {
          this.r = p0;
          if (this.B1()) {
             a.o(this.q, p0);
          }
          this.onStateChange(this.getState());
       }
       return;
    }
    public final ColorFilter Z(){
       a tV = this.V;
       if (tV != null) {
       }else {
          tV = this.W;
       }
       return tV;
    }
    public void Z0(int p0){
       this.Y0(a.c(this.H, p0));
    }
    public final void a(Drawable p0){
       if (p0 != null) {
          p0.setCallback(this);
          a.m(p0, a.f(this));
          p0.setLevel(this.getLevel());
          p0.setVisible(this.isVisible(), false);
          if (p0 == this.q) {
             if (p0.isStateful()) {
                p0.setState(this.L());
             }
             a.o(p0, this.r);
          }else if(p0.isStateful()){
             p0.setState(this.getState());
          }
       }
       return;
    }
    public void a1(int p0){
       this.b1(this.H.getResources().getBoolean(p0));
    }
    public final void b(Rect p0,RectF p1){
       float f1;
       p1.setEmpty();
       if (this.A1() || this.z1()) {
          float f = this.z + this.A;
          if (!a.f(this)) {
             f1 = (float)p0.left + f;
             p1.left = f1;
             p1.right = f1 + this.o;
          }else {
             f1 = (float)p0.right - f;
             p1.right = f1;
             p1.left = f1 - this.o;
          }
          a to = this.o;
          float f2 = p0.exactCenterY() - (to / 2.00f);
          p1.top = f2;
          p1.bottom = f2 + to;
       }
       return;
    }
    public boolean b0(){
       return this.u;
    }
    public void b1(boolean p0){
       if (this.p != p0) {
          this.p = p0;
          p0 = this.B1();
          int i = (this.B1() != p0)? 1: 0;
          if (i) {
             if (p0) {
                this.a(this.q);
             }else {
                this.C1(this.q);
             }
             this.invalidateSelf();
             this.k0();
          }
       }
       return;
    }
    public float c(){
       if (this.A1() || this.z1()) {
          return ((this.A + this.o) + this.B);
       }
       return 0;
    }
    public boolean c0(){
       return this.v;
    }
    public void c1(a$b p0){
       this.W0 = new WeakReference(p0);
    }
    public final void d(Rect p0,RectF p1){
       p1.set(p0);
       if (this.B1()) {
          float f = (((this.G + this.F) + this.s) + this.E) + this.D;
          p1.right = (!a.f(this))? (float)p0.right - f: (float)p0.left + f;
       }
    label_002a :
       return;
    }
    public boolean d0(){
       return this.l;
    }
    public void d1(TextUtils$TruncateAt p0){
       this.Z0 = p0;
    }
    public void draw(Canvas p0){
       Rect bounds = this.getBounds();
       if (!bounds.isEmpty() && this.getAlpha()) {
          Rect rect = null;
          a tU = this.U;
          if (tU < 255) {
             rect = a.a(p0, (float)bounds.left, (float)bounds.top, (float)bounds.right, (float)bounds.bottom, tU);
          }
          this.o(p0, bounds);
          this.q(p0, bounds);
          this.s(p0, bounds);
          this.p(p0, bounds);
          this.n(p0, bounds);
          if (this.a1 != null) {
             this.u(p0, bounds);
          }
          this.r(p0, bounds);
          this.t(p0, bounds);
          if (this.U < 255) {
             p0.restoreToCount(rect);
          }
       }
    label_004c :
       return;
    }
    public final void e(Rect p0,RectF p1){
       float f1;
       p1.setEmpty();
       if (this.B1()) {
          float f = this.G + this.F;
          if (!a.f(this)) {
             f1 = (float)p0.right - f;
             p1.right = f1;
             p1.left = f1 - this.s;
          }else {
             f1 = (float)p0.left + f;
             p1.left = f1;
             p1.right = f1 + this.s;
          }
          a ts = this.s;
          float f2 = p0.exactCenterY() - (ts / 2.00f);
          p1.top = f2;
          p1.bottom = f2 + ts;
       }
       return;
    }
    public boolean e0(){
       return a.h0(this.q);
    }
    public void e1(h p0){
       this.y = p0;
    }
    public final void f(Rect p0,RectF p1){
       p1.setEmpty();
       if (this.B1()) {
          float f = (((this.G + this.F) + this.s) + this.E) + this.D;
          if (!a.f(this)) {
             float f1 = (float)p0.right;
             p1.right = f1;
             p1.left = f1 - f;
          }else {
             Rect left = p0.left;
             p1.left = (float)left;
             p1.right = (float)left + f;
          }
          p1.top = (float)p0.top;
          p1.bottom = (float)p0.bottom;
       }
       return;
    }
    public boolean f0(){
       return this.p;
    }
    public void f1(int p0){
       this.e1(h.c(this.H, p0));
    }
    public final float g(){
       if (this.B1()) {
          return ((this.E + this.s) + this.F);
       }
       return 0;
    }
    public void g1(float p0){
       if (this.B - p0) {
          this.B = p0;
          this.invalidateSelf();
          if (this.c() - this.c()) {
             this.k0();
          }
       }
       return;
    }
    public int getAlpha(){
       return this.U;
    }
    public ColorFilter getColorFilter(){
       return this.V;
    }
    public int getIntrinsicHeight(){
       return (int)this.c;
    }
    public int getIntrinsicWidth(){
       return Math.min(Math.round(((((((this.z + this.c()) + this.C) + this.Y()) + this.D) + this.g()) + this.G)), this.b1);
    }
    public int getOpacity(){
       return -3;
    }
    public void getOutline(Outline p0){
       Rect bounds = this.getBounds();
       if (!bounds.isEmpty()) {
          p0.setRoundRect(bounds, this.d);
       }else {
          p0.setRoundRect(0, 0, this.getIntrinsicWidth(), this.getIntrinsicHeight(), this.d);
       }
       p0.setAlpha(((float)this.getAlpha() / 0x437f0000));
       return;
    }
    public final void h(Rect p0,RectF p1){
       p1.setEmpty();
       if (this.i != null) {
          float f = (this.z + this.c()) + this.C;
          float f1 = (this.G + this.g()) + this.D;
          if (!a.f(this)) {
             p1.left = (float)p0.left + f;
             p1.right = (float)p0.right - f1;
          }else {
             p1.left = (float)p0.left + f1;
             p1.right = (float)p0.right - f;
          }
          p1.top = (float)p0.top;
          p1.bottom = (float)p0.bottom;
       }
       return;
    }
    public void h1(int p0){
       this.g1(this.H.getResources().getDimension(p0));
    }
    public final float i(){
       this.I.getFontMetrics(this.L);
       a tL = this.L;
       return ((tL.descent + tL.ascent) / 2.00f);
    }
    public void i1(float p0){
       if (this.A - p0) {
          this.A = p0;
          this.invalidateSelf();
          if (this.c() - this.c()) {
             this.k0();
          }
       }
       return;
    }
    public void invalidateDrawable(Drawable p0){
       Drawable$Callback callback = this.getCallback();
       if (callback != null) {
          callback.invalidateDrawable(this);
       }
       return;
    }
    public boolean isStateful(){
       boolean b = (!a.g0(this.b) && (a.g0(this.e) || (this.U0 == null || (!a.g0(this.V0) && (!a.i0(this.j) && (!this.l() && (!a.h0(this.m) && (a.h0(this.w) || a.g0(this.X)))))))))? true: false;
       return b;
    }
    public Paint$Align j(Rect p0,PointF p1){
       p1.set(0, 0);
       Paint$Align lEFT = Paint$Align.LEFT;
       if (this.i != null) {
          float f = (this.z + this.c()) + this.C;
          if (!a.f(this)) {
             p1.x = (float)p0.left + f;
             lEFT = Paint$Align.LEFT;
          }else {
             p1.x = (float)p0.right - f;
             lEFT = Paint$Align.RIGHT;
          }
          p1.y = (float)p0.centerY() - this.i();
       }
       return lEFT;
    }
    public final void j0(AttributeSet p0,int p1,int p2){
       int[] ointArray = new int[0];
       TypedArray typedArray = k.h(this.H, p0, c$b.J, p1, p2, ointArray);
       this.s0(a.a(this.H, typedArray, 8));
       this.G0(typedArray.getDimension(16, 0));
       this.u0(typedArray.getDimension(9, 0));
       this.K0(a.a(this.H, typedArray, 18));
       this.M0(typedArray.getDimension(19, 0));
       this.l1(a.a(this.H, typedArray, 30));
       p2 = 3;
       this.q1(typedArray.getText(p2));
       this.r1(a.d(this.H, typedArray, 0));
       int i = 1;
       int intx = typedArray.getInt(i, 0);
       if (intx != i) {
          if (intx != 2) {
             if (intx == p2) {
                this.d1(TextUtils$TruncateAt.END);
             }
          }else {
             this.d1(TextUtils$TruncateAt.MIDDLE);
          }
       }else {
          this.d1(TextUtils$TruncateAt.START);
       }
       this.F0(typedArray.getBoolean(15, 0));
       String str = "http://schemas.android.com/apk/res-auto";
       if (p0 != null && (p0.getAttributeValue(str, "chipIconEnabled") != null && p0.getAttributeValue(str, "chipIconVisible") == null)) {
          this.F0(typedArray.getBoolean(12, 0));
       }
    label_00a0 :
       this.y0(a.b(this.H, typedArray, 11));
       this.C0(a.a(this.H, typedArray, 14));
       this.A0(typedArray.getDimension(13, 0));
       this.b1(typedArray.getBoolean(26, 0));
       if (p0 != null && (p0.getAttributeValue(str, "closeIconEnabled") != null && p0.getAttributeValue(str, "closeIconVisible") == null)) {
          this.b1(typedArray.getBoolean(21, 0));
       }
    label_00e3 :
       this.O0(a.b(this.H, typedArray, 20));
       this.Y0(a.a(this.H, typedArray, 25));
       this.T0(typedArray.getDimension(23, 0));
       this.m0(typedArray.getBoolean(4, 0));
       this.r0(typedArray.getBoolean(7, 0));
       if (p0 != null && (p0.getAttributeValue(str, "checkedIconEnabled") != null && p0.getAttributeValue(str, "checkedIconVisible") == null)) {
          this.r0(typedArray.getBoolean(6, 0));
       }
    label_012c :
       this.o0(a.b(this.H, typedArray, 5));
       this.o1(h.b(this.H, typedArray, 31));
       this.e1(h.b(this.H, typedArray, 27));
       this.I0(typedArray.getDimension(17, 0));
       this.i1(typedArray.getDimension(29, 0));
       this.g1(typedArray.getDimension(28, 0));
       this.v1(typedArray.getDimension(33, 0));
       this.t1(typedArray.getDimension(32, 0));
       this.V0(typedArray.getDimension(24, 0));
       this.Q0(typedArray.getDimension(22, 0));
       this.w0(typedArray.getDimension(10, 0));
       this.k1(typedArray.getDimensionPixelSize(2, Integer.MAX_VALUE));
       typedArray.recycle();
       return;
    }
    public void j1(int p0){
       this.i1(this.H.getResources().getDimension(p0));
    }
    public final float k(CharSequence p0){
       if (p0 == null) {
          return 0;
       }
       return this.I.measureText(p0, 0, p0.length());
    }
    public void k0(){
       a$b uob = this.W0.get();
       if (uob != null) {
          uob.a();
       }
       return;
    }
    public void k1(int p0){
       this.b1 = p0;
    }
    public final boolean l(){
       boolean b = (this.v != null && (this.w != null && this.u != null))? true: false;
       return b;
    }
    public final boolean l0(int[] p0,int[] p1){
       boolean b = super.onStateChange(p0);
       a tb = this.b;
       a uoa = null;
       int colorForStat = (tb != null)? tb.getColorForState(p0, this.O): 0;
       int i = 1;
       if (this.O != colorForStat) {
          this.O = colorForStat;
          b = Float.MIN_VALUE;
       }
       tb = this.e;
       colorForStat = (tb != null)? tb.getColorForState(p0, this.P): 0;
       if (this.P != colorForStat) {
          this.P = colorForStat;
          b = Float.MIN_VALUE;
       }
       tb = this.V0;
       colorForStat = (tb != null)? tb.getColorForState(p0, this.Q): 0;
       if (this.Q != colorForStat) {
          this.Q = colorForStat;
          if (this.U0 != null) {
             b = Float.MIN_VALUE;
          }
       }
       tb = this.j;
       if (tb != null) {
          b b1 = tb.b;
          if (b1 != null) {
             colorForStat = b1.getColorForState(p0, this.R);
          label_0053 :
             if (this.R != colorForStat) {
                this.R = colorForStat;
                b = Float.MIN_VALUE;
             }
             colorForStat = (a.a0(this.getState(), 0x10100a0) && this.u != null)? true: false;
             if (this.S != colorForStat && this.w != null) {
                this.S = colorForStat;
                if (this.c() - this.c()) {
                   b = 1;
                   b1 = 1;
                label_0089 :
                   a tX = this.X;
                   if (tX != null) {
                      uoa = tX.getColorForState(p0, this.T);
                   }
                   if (this.T != uoa) {
                      this.T = uoa;
                      this.W = a.a(this, this.X, this.Y);
                   }else {
                      i = b;
                   }
                   if (a.h0(this.m)) {
                      i = i | this.m.setState(p0);
                   }
                   if (a.h0(this.w)) {
                      i = i | this.w.setState(p0);
                   }
                   if (a.h0(this.q)) {
                      i = i | this.q.setState(p1);
                   }
                   if (i) {
                      this.invalidateSelf();
                   }
                   if (b1) {
                      this.k0();
                   }
                   return i;
                }else {
                   b = 1;
                }
             }
             b1 = 0;
             goto label_0089 ;
          }
       }
       colorForStat = 0;
       goto label_0053 ;
    }
    public void l1(ColorStateList p0){
       if (this.g != p0) {
          this.g = p0;
          this.D1();
          this.onStateChange(this.getState());
       }
       return;
    }
    public void m0(boolean p0){
       if (this.u != p0) {
          this.u = p0;
          float f = this.c();
          if (!p0 && this.S != null) {
             this.S = false;
          }
          this.invalidateSelf();
          if (f - this.c()) {
             this.k0();
          }
       }
       return;
    }
    public void m1(int p0){
       this.l1(a.c(this.H, p0));
    }
    public final void n(Canvas p0,Rect p1){
       if (this.z1()) {
          this.b(p1, this.M);
          a tM = this.M;
          RectF left = tM.left;
          RectF top = tM.top;
          p0.translate(left, top);
          this.w.setBounds(0, 0, (int)this.M.width(), (int)this.M.height());
          this.w.draw(p0);
          p0.translate((- left), (- top));
       }
       return;
    }
    public void n0(int p0){
       this.m0(this.H.getResources().getBoolean(p0));
    }
    public void n1(boolean p0){
       this.a1 = p0;
    }
    public final void o(Canvas p0,Rect p1){
       this.J.setColor(this.O);
       this.J.setStyle(Paint$Style.FILL);
       this.J.setColorFilter(this.Z());
       this.M.set(p1);
       p0.drawRoundRect(this.M, this.d, this.d, this.J);
    }
    public void o0(Drawable p0){
       if (this.w != p0) {
          this.w = p0;
          this.C1(this.w);
          this.a(this.w);
          this.invalidateSelf();
          if (this.c() - this.c()) {
             this.k0();
          }
       }
       return;
    }
    public void o1(h p0){
       this.x = p0;
    }
    public boolean onLayoutDirectionChanged(int p0){
       boolean b = super.onLayoutDirectionChanged(p0);
       if (this.A1()) {
          b = b | this.m.setLayoutDirection(p0);
       }
       if (this.z1()) {
          b = b | this.w.setLayoutDirection(p0);
       }
       if (this.B1()) {
          b = b | this.q.setLayoutDirection(p0);
       }
       if (b) {
          this.invalidateSelf();
       }
       return true;
    }
    public boolean onLevelChange(int p0){
       boolean b = super.onLevelChange(p0);
       if (this.A1()) {
          b = b | this.m.setLevel(p0);
       }
       if (this.z1()) {
          b = b | this.w.setLevel(p0);
       }
       if (this.B1()) {
          b = b | this.q.setLevel(p0);
       }
       if (b) {
          this.invalidateSelf();
       }
       return b;
    }
    public boolean onStateChange(int[] p0){
       return this.l0(p0, this.L());
    }
    public final void p(Canvas p0,Rect p1){
       if (this.A1()) {
          this.b(p1, this.M);
          a tM = this.M;
          RectF left = tM.left;
          RectF top = tM.top;
          p0.translate(left, top);
          this.m.setBounds(0, 0, (int)this.M.width(), (int)this.M.height());
          this.m.draw(p0);
          p0.translate((- left), (- top));
       }
       return;
    }
    public void p0(int p0){
       this.o0(a.d(this.H, p0));
    }
    public void p1(int p0){
       this.o1(h.c(this.H, p0));
    }
    public final void q(Canvas p0,Rect p1){
       if (this.f - null > 0) {
          this.J.setColor(this.P);
          this.J.setStyle(Paint$Style.STROKE);
          this.J.setColorFilter(this.Z());
          float f = this.f / 2.00f;
          this.M.set(((float)p1.left + f), ((float)p1.top + f), ((float)p1.right - f), ((float)p1.bottom - f));
          p0.drawRoundRect(this.M, (this.d - (this.f / 2.00f)), (this.d - (this.f / 2.00f)), this.J);
       }
       return;
    }
    public void q0(int p0){
       this.r0(this.H.getResources().getBoolean(p0));
    }
    public void q1(CharSequence p0){
       String str;
       if (p0 == null) {
          str = "";
       }
       if (this.h != str) {
          this.h = str;
          this.i = a.c().i(str);
          this.X0 = true;
          this.invalidateSelf();
          this.k0();
       }
       return;
    }
    public final void r(Canvas p0,Rect p1){
       if (this.B1()) {
          this.e(p1, this.M);
          a tM = this.M;
          RectF left = tM.left;
          RectF top = tM.top;
          p0.translate(left, top);
          this.q.setBounds(0, 0, (int)this.M.width(), (int)this.M.height());
          this.q.draw(p0);
          p0.translate((- left), (- top));
       }
       return;
    }
    public void r0(boolean p0){
       if (this.v != p0) {
          this.v = p0;
          p0 = this.z1();
          int i = (this.z1() != p0)? 1: 0;
          if (i) {
             if (p0) {
                this.a(this.w);
             }else {
                this.C1(this.w);
             }
             this.invalidateSelf();
             this.k0();
          }
       }
       return;
    }
    public void r1(b p0){
       if (this.j != p0) {
          this.j = p0;
          if (p0 != null) {
             p0.e(this.H, this.I, this.k);
             this.X0 = true;
          }
          this.onStateChange(this.getState());
          this.k0();
       }
       return;
    }
    public final void s(Canvas p0,Rect p1){
       this.J.setColor(this.Q);
       this.J.setStyle(Paint$Style.FILL);
       this.M.set(p1);
       p0.drawRoundRect(this.M, this.d, this.d, this.J);
    }
    public void s0(ColorStateList p0){
       if (this.b != p0) {
          this.b = p0;
          this.onStateChange(this.getState());
       }
       return;
    }
    public void s1(int p0){
       this.r1(new b(this.H, p0));
    }
    public void scheduleDrawable(Drawable p0,Runnable p1,long p2){
       Drawable$Callback callback = this.getCallback();
       if (callback != null) {
          callback.scheduleDrawable(this, p1, p2);
       }
       return;
    }
    public void setAlpha(int p0){
       if (this.U != p0) {
          this.U = p0;
          this.invalidateSelf();
       }
       return;
    }
    public void setColorFilter(ColorFilter p0){
       if (this.V != p0) {
          this.V = p0;
          this.invalidateSelf();
       }
       return;
    }
    public void setTintList(ColorStateList p0){
       if (this.X != p0) {
          this.X = p0;
          this.onStateChange(this.getState());
       }
       return;
    }
    public void setTintMode(PorterDuff$Mode p0){
       if (this.Y != p0) {
          this.Y = p0;
          this.W = a.a(this, this.X, p0);
          this.invalidateSelf();
       }
       return;
    }
    public boolean setVisible(boolean p0,boolean p1){
       boolean b = super.setVisible(p0, p1);
       if (this.A1()) {
          b = b | this.m.setVisible(p0, p1);
       }
       if (this.z1()) {
          b = b | this.w.setVisible(p0, p1);
       }
       if (this.B1()) {
          b = b | this.q.setVisible(p0, p1);
       }
       if (b) {
          this.invalidateSelf();
       }
       return b;
    }
    public final void t(Canvas p0,Rect p1){
       a tK = this.K;
       if (tK != null) {
          tK.setColor(a.d(0xff000000, 127));
          p0.drawRect(p1, this.K);
          if (this.A1() || this.z1()) {
             this.b(p1, this.M);
             p0.drawRect(this.M, this.K);
          }
          if (this.i != null) {
             p0.drawLine((float)p1.left, p1.exactCenterY(), (float)p1.right, p1.exactCenterY(), this.K);
          }
          if (this.B1()) {
             this.e(p1, this.M);
             p0.drawRect(this.M, this.K);
          }
          this.K.setColor(a.d(0xffff0000, 127));
          this.d(p1, this.M);
          p0.drawRect(this.M, this.K);
          this.K.setColor(a.d(-16711936, 127));
          this.f(p1, this.M);
          p0.drawRect(this.M, this.K);
       }
       return;
    }
    public void t0(int p0){
       this.s0(a.c(this.H, p0));
    }
    public void t1(float p0){
       if (this.D - p0) {
          this.D = p0;
          this.invalidateSelf();
          this.k0();
       }
       return;
    }
    public final void u(Canvas p0,Rect p1){
       if (this.i != null) {
          Paint$Align uAlign = this.j(p1, this.N);
          this.h(p1, this.M);
          if (this.j != null) {
             p1.drawableState = this.getState();
             this.j.d(this.H, this.I, this.k);
          }
          this.I.setTextAlign(uAlign);
          int i = 0;
          int i1 = (Math.round(this.Y()) > Math.round(this.M.width()))? 1: 0;
          if (i1) {
             i = p0.save();
             p0.clipRect(this.M);
          }
          a ti = this.i;
          if (i1 && this.Z0 != null) {
             ti = TextUtils.ellipsize(ti, this.I, this.M.width(), this.Z0);
          }
          a uoa = ti;
          ti = this.N;
          p0.drawText(uoa, 0, uoa.length(), ti.x, ti.y, this.I);
          if (i1) {
             p0.restoreToCount(i);
          }
       }
       return;
    }
    public void u0(float p0){
       if (this.d - p0) {
          this.d = p0;
          this.invalidateSelf();
       }
       return;
    }
    public void u1(int p0){
       this.t1(this.H.getResources().getDimension(p0));
    }
    public void unscheduleDrawable(Drawable p0,Runnable p1){
       Drawable$Callback callback = this.getCallback();
       if (callback != null) {
          callback.unscheduleDrawable(this, p1);
       }
       return;
    }
    public Drawable v(){
       return this.w;
    }
    public void v0(int p0){
       this.u0(this.H.getResources().getDimension(p0));
    }
    public void v1(float p0){
       if (this.C - p0) {
          this.C = p0;
          this.invalidateSelf();
          this.k0();
       }
       return;
    }
    public ColorStateList w(){
       return this.b;
    }
    public void w0(float p0){
       if (this.G - p0) {
          this.G = p0;
          this.invalidateSelf();
          this.k0();
       }
       return;
    }
    public void w1(int p0){
       this.v1(this.H.getResources().getDimension(p0));
    }
    public float x(){
       return this.d;
    }
    public void x0(int p0){
       this.w0(this.H.getResources().getDimension(p0));
    }
    public void x1(boolean p0){
       if (this.U0 != p0) {
          this.U0 = p0;
          this.D1();
          this.onStateChange(this.getState());
       }
       return;
    }
    public float y(){
       return this.G;
    }
    public void y0(Drawable p0){
       Drawable uDrawable = this.z();
       if (uDrawable != p0) {
          float f = this.c();
          p0 = (p0 != null)? a.r(p0).mutate(): null;
          this.m = p0;
          float f1 = this.c();
          this.C1(uDrawable);
          if (this.A1()) {
             this.a(this.m);
          }
          this.invalidateSelf();
          if (f - f1) {
             this.k0();
          }
       }
       return;
    }
    public boolean y1(){
       return this.a1;
    }
    public Drawable z(){
       a tm = this.m;
       Drawable uDrawable = (tm != null)? a.q(tm): null;
       return uDrawable;
    }
    public void z0(int p0){
       this.y0(a.d(this.H, p0));
    }
    public final boolean z1(){
       boolean b = (this.v != null && (this.w != null && this.S != null))? true: false;
       return b;
    }
}
