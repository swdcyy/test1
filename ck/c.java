package ck.c;
import android.view.View;
import java.lang.Object;
import android.text.TextPaint;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Color;
import java.lang.Math;
import android.animation.TimeInterpolator;
import rj.a;
import android.graphics.Typeface;
import android.content.Context;
import android.content.res.TypedArray;
import java.lang.String;
import ll8.c$b;
import w0.x;
import android.content.res.ColorStateList;
import u1.a;
import a2.i0;
import java.lang.CharSequence;
import a2.g;
import y1.e;
import y1.d;
import android.text.TextUtils$TruncateAt;
import android.text.TextUtils;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;

public final class c	// class@000d18
{
    public Paint A;
    public float B;
    public float C;
    public float D;
    public float E;
    public int[] F;
    public boolean G;
    public final TextPaint H;
    public final TextPaint I;
    public TimeInterpolator J;
    public TimeInterpolator K;
    public float L;
    public float M;
    public float N;
    public int O;
    public float P;
    public float Q;
    public float R;
    public int S;
    public final View a;
    public boolean b;
    public float c;
    public final Rect d;
    public final Rect e;
    public final RectF f;
    public int g;
    public int h;
    public float i;
    public float j;
    public ColorStateList k;
    public ColorStateList l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public Typeface s;
    public Typeface t;
    public Typeface u;
    public CharSequence v;
    public CharSequence w;
    public boolean x;
    public boolean y;
    public Bitmap z;
    public static final boolean T;
    public static final Paint U;

    static {
       c.T = false;
       c.U = null;
    }
    public void c(View p0){
       super();
       this.g = 16;
       this.h = 16;
       this.i = 15.00f;
       this.j = 15.00f;
       this.a = p0;
       TextPaint textPaint = new TextPaint(129);
       this.H = textPaint;
       this.I = new TextPaint(textPaint);
       this.e = new Rect();
       this.d = new Rect();
       this.f = new RectF();
    }
    public static boolean D(Rect p0,int p1,int p2,int p3,int p4){
       boolean b = (p0.left == p1 && (p0.top == p2 && (p0.right == p3 && p0.bottom == p4)))? true: false;
       return b;
    }
    public static int a(int p0,int p1,float p2){
       float f = 0x3f800000 - p2;
       return Color.argb((int)(((float)Color.alpha(p0) * f) + ((float)Color.alpha(p1) * p2)), (int)(((float)Color.red(p0) * f) + ((float)Color.red(p1) * p2)), (int)(((float)Color.green(p0) * f) + ((float)Color.green(p1) * p2)), (int)(((float)Color.blue(p0) * f) + ((float)Color.blue(p1) * p2)));
    }
    public static boolean x(float p0,float p1){
       boolean b = (Math.abs((p0 - p1)) - 0x3a83126f < 0)? true: false;
       return b;
    }
    public static float z(float p0,float p1,float p2,TimeInterpolator p3){
       if (p3 != null) {
          p2 = p3.getInterpolation(p2);
       }
       return a.a(p0, p1, p2);
    }
    public void A(){
       boolean b = (this.e.width() > 0 && (this.e.height() > 0 && (this.d.width() > 0 && this.d.height() > 0)))? true: false;
       this.b = b;
       return;
    }
    public final Typeface B(int p0){
       int[] ointArray = new int[]{0x10103ac};
       TypedArray typedArray = this.a.getContext().obtainStyledAttributes(p0, ointArray);
       String str = typedArray.getString(0);
       if (str != null) {
          typedArray.recycle();
          return Typeface.create(str, 0);
       }else {
          typedArray.recycle();
          return null;
       }
    }
    public void C(){
       if (this.a.getHeight() > 0 && this.a.getWidth() > 0) {
          this.b();
          this.d();
       }
       return;
    }
    public void E(int p0,int p1,int p2,int p3){
       if (!c.D(this.e, p0, p1, p2, p3)) {
          this.e.set(p0, p1, p2, p3);
          this.G = true;
          this.A();
       }
       return;
    }
    public void F(int p0){
       x ox = x.t(this.a.getContext(), p0, c$b.E5);
       int i = 3;
       if (ox.s(i)) {
          this.l = ox.c(i);
       }
       i = 0;
       if (ox.s(i)) {
          this.j = (float)ox.f(i, (int)this.j);
       }
       this.O = ox.k(6, i);
       this.M = ox.i(7, 0);
       this.N = ox.i(8, 0);
       this.L = ox.i(9, 0);
       ox.w();
       this.s = this.B(p0);
       this.C();
       return;
    }
    public void G(ColorStateList p0){
       if (this.l != p0) {
          this.l = p0;
          this.C();
       }
       return;
    }
    public void H(int p0){
       if (this.h != p0) {
          this.h = p0;
          this.C();
       }
       return;
    }
    public void I(Typeface p0){
       if (this.s != p0) {
          this.s = p0;
          this.C();
       }
       return;
    }
    public void J(int p0,int p1,int p2,int p3){
       if (!c.D(this.d, p0, p1, p2, p3)) {
          this.d.set(p0, p1, p2, p3);
          this.G = true;
          this.A();
       }
       return;
    }
    public void K(int p0){
       x ox = x.t(this.a.getContext(), p0, c$b.E5);
       int i = 3;
       if (ox.s(i)) {
          this.k = ox.c(i);
       }
       i = 0;
       if (ox.s(i)) {
          this.i = (float)ox.f(i, (int)this.i);
       }
       this.S = ox.k(6, i);
       this.Q = ox.i(7, 0);
       this.R = ox.i(8, 0);
       this.P = ox.i(9, 0);
       ox.w();
       this.t = this.B(p0);
       this.C();
       return;
    }
    public void L(ColorStateList p0){
       if (this.k != p0) {
          this.k = p0;
          this.C();
       }
       return;
    }
    public void M(int p0){
       if (this.g != p0) {
          this.g = p0;
          this.C();
       }
       return;
    }
    public void N(float p0){
       if (this.i - p0) {
          this.i = p0;
          this.C();
       }
       return;
    }
    public void O(Typeface p0){
       if (this.t != p0) {
          this.t = p0;
          this.C();
       }
       return;
    }
    public void P(float p0){
       p0 = a.a(p0, 0, 0x3f800000);
       if (p0 - this.c) {
          this.c = p0;
          this.d();
       }
       return;
    }
    public final void Q(float p0){
       this.g(p0);
       boolean b = (c.T && this.D - 0x3f800000)? true: false;
       this.y = b;
       if (b) {
          this.j();
       }
       i0.j0(this.a);
       return;
    }
    public void R(TimeInterpolator p0){
       this.J = p0;
       this.C();
    }
    public final boolean S(int[] p0){
       this.F = p0;
       if (!this.y()) {
          return false;
       }
       this.C();
       return true;
    }
    public void T(CharSequence p0){
       if (p0 == null || !p0.equals(this.v)) {
          this.v = p0;
          this.w = null;
          this.h();
          this.C();
       }
       return;
    }
    public void U(TimeInterpolator p0){
       this.K = p0;
       this.C();
    }
    public void V(Typeface p0){
       this.t = p0;
       this.s = p0;
       this.C();
    }
    public final void b(){
       c tE = this.E;
       this.g(this.j);
       c tw = this.w;
       int i = 0;
       c uoc = null;
       float f = (tw != null)? this.H.measureText(tw, i, tw.length()): null;
       int i1 = g.b(this.h, this.x);
       int i2 = i1 & 0x70;
       if (i2 != 48) {
          this.n = (i2 != 80)? (float)this.e.centerY() + (((this.H.descent() - this.H.ascent()) / 2.00f) - this.H.descent()): (float)this.e.bottom;
       }else {
          this.n = (float)this.e.top - this.H.ascent();
       }
       i1 = i1 & 0x800007;
       if (i1 != 1) {
          this.p = (i1 != 5)? (float)this.e.left: (float)this.e.right - f;
       }else {
          this.p = (float)this.e.centerX() - (f / 2.00f);
       }
       this.g(this.i);
       tw = this.w;
       if (tw != null) {
          uoc = this.H.measureText(tw, i, tw.length());
       }
       int i3 = g.b(this.g, this.x);
       i = i3 & 0x70;
       if (i != 48) {
          this.m = (i != 80)? (float)this.d.centerY() + (((this.H.descent() - this.H.ascent()) / 2.00f) - this.H.descent()): (float)this.d.bottom;
       }else {
          this.m = (float)this.d.top - this.H.ascent();
       }
       i3 = i3 & 0x800007;
       if (i3 != 1) {
          this.o = (i3 != 5)? (float)this.d.left: (float)this.d.right - uoc;
       }else {
          this.o = (float)this.d.centerX() - (uoc / 2.00f);
       }
       this.h();
       this.Q(tE);
       return;
    }
    public float c(){
       if (this.v == null) {
          return 0;
       }
       this.v(this.I);
       c tv = this.v;
       return this.I.measureText(tv, 0, tv.length());
    }
    public final void d(){
       this.f(this.c);
    }
    public final boolean e(CharSequence p0){
       int i = 1;
       if (i0.B(this.a) == i) {
       }else {
          i = 0;
       }
       d d = (i)? e.d: e.c;
       return d.a(p0, 0, p0.length());
    }
    public final void f(float p0){
       this.w(p0);
       this.q = c.z(this.o, this.p, p0, this.J);
       this.r = c.z(this.m, this.n, p0, this.J);
       this.Q(c.z(this.i, this.j, p0, this.K));
       if (this.l != this.k) {
          this.H.setColor(c.a(this.q(), this.p(), p0));
       }else {
          this.H.setColor(this.p());
       }
       this.H.setShadowLayer(c.z(this.P, this.L, p0, null), c.z(this.Q, this.M, p0, null), c.z(this.R, this.N, p0, null), c.a(this.S, this.O, p0));
       i0.j0(this.a);
       return;
    }
    public final void g(float p0){
       c tj;
       c ts;
       c uoc;
       int i;
       if (this.v == null) {
          return;
       }
       float f = (float)this.e.width();
       float f1 = (float)this.d.width();
       boolean b = true;
       if (c.x(p0, this.j)) {
          tj = this.j;
          this.D = 0x3f800000;
          ts = this.s;
          if (this.u != ts) {
             this.u = ts;
             uoc = 1;
          }else {
             uoc = null;
          }
       }else {
          ts = this.i;
          c tt = this.t;
          if (this.u != tt) {
             this.u = tt;
             i = 1;
          }else {
             i = 0;
          }
          this.D = (c.x(p0, ts))? 0x3f800000: p0 / this.i;
          p0 = this.j / this.i;
          f = ((f1 * p0) - f > 0)? Math.min((f / p0), f1): f1;
          tj = ts;
          uoc = i;
       }
       if (f > 0) {
          uoc = (!this.E - tj && (this.G != null || uoc))? 1: null;
          this.E = tj;
          this.G = false;
       }
       if (this.w == null || uoc) {
          this.H.setTextSize(this.E);
          this.H.setTypeface(this.u);
          tj = this.H;
          if (!this.D - 0x3f800000) {
             b = false;
          }
          tj.setLinearText(b);
          CharSequence uCharSequenc = TextUtils.ellipsize(this.v, this.H, f, TextUtils$TruncateAt.END);
          if (!TextUtils.equals(uCharSequenc, this.w)) {
             this.w = uCharSequenc;
             this.x = this.e(uCharSequenc);
          }
       }
       return;
    }
    public final void h(){
       c tz = this.z;
       if (tz != null) {
          tz.recycle();
          this.z = null;
       }
       return;
    }
    public void i(Canvas p0){
       float f;
       int i = p0.save();
       if (this.w != null && this.b != null) {
          c tq = this.q;
          c tr = this.r;
          c uoc = (this.y != null && this.z != null)? 1: null;
          if (uoc) {
             f = this.B * this.D;
          }else {
             f = this.H.ascent() * this.D;
             this.H.descent();
          }
          if (uoc) {
             tr = tr + f;
          }
          c uoc1 = tr;
          tr = this.D;
          if (tr - 0x3f800000) {
             p0.scale(tr, tr, tq, uoc1);
          }
          if (uoc) {
             p0.drawBitmap(this.z, tq, uoc1, this.A);
          }else {
             c tw = this.w;
             p0.drawText(tw, 0, tw.length(), tq, uoc1, this.H);
          }
       }
       p0.restoreToCount(i);
       return;
    }
    public final void j(){
       if (this.z != null || (!this.d.isEmpty() && !TextUtils.isEmpty(this.w))) {
          this.f(0);
          this.B = this.H.ascent();
          this.C = this.H.descent();
          c tw = this.w;
          int i = Math.round(this.H.measureText(tw, 0, tw.length()));
          int i1 = Math.round((this.C - this.B));
          if (i > 0 && i1 > 0) {
             this.z = Bitmap.createBitmap(i, i1, Bitmap$Config.ARGB_8888);
             c tw1 = this.w;
             new Canvas(this.z).drawText(tw1, 0, tw1.length(), 0, ((float)i1 - this.H.descent()), this.H);
             if (this.A == null) {
                this.A = new Paint(3);
             }
          }
       }
       return;
    }
    public void k(RectF p0){
       boolean b = this.e(this.v);
       c te = this.e;
       float f = (!b)? (float)te.left: (float)te.right - this.c();
       p0.left = f;
       c te1 = this.e;
       p0.top = (float)te1.top;
       f = (!b)? f + this.c(): (float)te1.right;
       p0.right = f;
       p0.bottom = (float)this.e.top + this.n();
       return;
    }
    public ColorStateList l(){
       return this.l;
    }
    public int m(){
       return this.h;
    }
    public float n(){
       this.v(this.I);
       return (- this.I.ascent());
    }
    public Typeface o(){
       c ts = this.s;
       if (ts != null) {
       }else {
          ts = Typeface.DEFAULT;
       }
       return ts;
    }
    public int p(){
       c tF = this.F;
       if (tF != null) {
          return this.l.getColorForState(tF, 0);
       }
       return this.l.getDefaultColor();
    }
    public final int q(){
       c tF = this.F;
       if (tF != null) {
          return this.k.getColorForState(tF, 0);
       }
       return this.k.getDefaultColor();
    }
    public int r(){
       return this.g;
    }
    public Typeface s(){
       c tt = this.t;
       if (tt != null) {
       }else {
          tt = Typeface.DEFAULT;
       }
       return tt;
    }
    public float t(){
       return this.c;
    }
    public CharSequence u(){
       return this.v;
    }
    public final void v(TextPaint p0){
       p0.setTextSize(this.j);
       p0.setTypeface(this.s);
    }
    public final void w(float p0){
       this.f.left = c.z((float)this.d.left, (float)this.e.left, p0, this.J);
       this.f.top = c.z(this.m, this.n, p0, this.J);
       this.f.right = c.z((float)this.d.right, (float)this.e.right, p0, this.J);
       this.f.bottom = c.z((float)this.d.bottom, (float)this.e.bottom, p0, this.J);
    }
    public final boolean y(){
       boolean b;
       c tl = this.l;
       if (tl == null || !tl.isStateful()) {
          tl = this.k;
          if (tl == null || !tl.isStateful()) {
             b = false;
          label_0017 :
             return b;
          }
       }
       b = true;
       goto label_0017 ;
    }
}
