package com.yxcorp.plugin.setting.widget.SlideSelector;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.plugin.setting.widget.SlideSelector$a;
import android.graphics.Paint;
import android.content.res.Resources;
import java.lang.String;
import cw9.c;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.Paint$Style;
import com.yxcorp.plugin.setting.widget.SlideSelector$c;
import com.yxcorp.plugin.setting.widget.SlideSelector$e;
import android.view.GestureDetector;
import android.view.GestureDetector$OnGestureListener;
import java.lang.IllegalArgumentException;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Math;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import hhd.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.plugin.setting.widget.SlideSelector$b;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.plugin.setting.widget.SlideSelector$d;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Canvas;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;

public class SlideSelector extends View	// class@000941
{
    public int A;
    public int B;
    public int C;
    public float D;
    public float E;
    public float F;
    public int G;
    public int H;
    public int I;
    public int J;
    public float K;
    public int L;
    public int M;
    public final Paint N;
    public final SlideSelector$c O;
    public final SlideSelector$c[] P;
    public final SlideSelector$e Q;
    public boolean R;
    public int S;
    public SlideSelector$d T;
    public final GestureDetector U;
    public final GestureDetector$SimpleOnGestureListener V;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public int u;
    public int v;
    public int w;
    public String x;
    public String y;
    public String z;
    public static final int W;

    public void SlideSelector(Context p0){
       super(p0, null);
    }
    public void SlideSelector(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SlideSelector(Context p0,AttributeSet p1,int p2){
       SlideSelector slideSelecto = this;
       Context uContext = p0;
       super(p0, p1, p2);
       int i = 4;
       slideSelecto.b = i;
       slideSelecto.c = 1;
       slideSelecto.d = 1;
       String str = "A";
       slideSelecto.e = str;
       slideSelecto.f = str;
       slideSelecto.h = 0xff000000;
       slideSelecto.i = 0xff000000;
       slideSelecto.j = 0xff000000;
       slideSelecto.o = 0xff000000;
       slideSelecto.s = -1;
       slideSelecto.t = -7829368;
       slideSelecto.V = new SlideSelector$a(slideSelecto);
       slideSelecto.setLayerType(1, null);
       Resources resources = p0.getResources();
       String str1 = resources.getString(R.string.arg_RES_7f10104a);
       slideSelecto.g = str1;
       int i1 = c.b(resources, R.dimen.arg_RES_7f070f72);
       slideSelecto.k = i1;
       int i2 = c.b(resources, R.dimen.arg_RES_7f070f72);
       slideSelecto.l = i2;
       int i3 = c.b(resources, R.dimen.arg_RES_7f070f79);
       slideSelecto.m = i3;
       int i4 = c.b(resources, R.dimen.arg_RES_7f0702e8);
       slideSelecto.n = i4;
       int i5 = c.b(resources, R.dimen.arg_RES_7f070271);
       slideSelecto.p = i5;
       int i6 = c.b(resources, R.dimen.arg_RES_7f0702e3);
       slideSelecto.q = i6;
       int i7 = c.b(resources, R.dimen.arg_RES_7f070295);
       slideSelecto.r = i7;
       int i8 = 0;
       TypedArray typedArray = uContext.obtainStyledAttributes(p1, c$b.i5, p2, i8);
       int intx = typedArray.getInt(2, i);
       slideSelecto.u = intx;
       if (intx < 3) {
          throw new IllegalArgumentException("The levelCount must > 2");
       }
       i = 1;
       intx = typedArray.getInt(14, i);
       slideSelecto.v = intx;
       if (intx < 0 || intx > slideSelecto.u) {
          slideSelecto.v = i;
       }
       intx = typedArray.getInt(i8, i);
       slideSelecto.w = intx;
       if (intx < 0 || intx > slideSelecto.u) {
          slideSelecto.w = i;
       }
       slideSelecto.x = typedArray.getString(8);
       slideSelecto.y = typedArray.getString(15);
       slideSelecto.z = typedArray.getString(5);
       if (TextUtils.isEmpty(slideSelecto.x)) {
          slideSelecto.x = str;
       }
       if (TextUtils.isEmpty(slideSelecto.y)) {
          slideSelecto.y = str1;
       }
       if (TextUtils.isEmpty(slideSelecto.z)) {
          slideSelecto.z = str;
       }
       slideSelecto.A = typedArray.getColor(9, 0xff000000);
       slideSelecto.B = typedArray.getColor(16, 0xff000000);
       slideSelecto.C = typedArray.getColor(6, 0xff000000);
       slideSelecto.D = typedArray.getDimension(10, (float)i1);
       slideSelecto.E = typedArray.getDimension(17, (float)i2);
       slideSelecto.F = typedArray.getDimension(7, (float)i3);
       slideSelecto.G = typedArray.getDimensionPixelSize(18, i4);
       slideSelecto.H = typedArray.getColor(3, 0xff000000);
       slideSelecto.I = typedArray.getDimensionPixelSize(1, i5);
       slideSelecto.J = typedArray.getDimensionPixelSize(4, i6);
       slideSelecto.L = typedArray.getColor(11, -1);
       slideSelecto.M = typedArray.getColor(13, -7829368);
       slideSelecto.K = typedArray.getDimension(12, (float)i7);
       typedArray.recycle();
       Paint paint = new Paint(1);
       slideSelecto.N = paint;
       paint.setStyle(Paint$Style.FILL);
       SlideSelector$a uoa = null;
       slideSelecto.O = new SlideSelector$c(uoa);
       SlideSelector$c[] uocArray = new SlideSelector$c[slideSelecto.u];
       slideSelecto.P = uocArray;
       SlideSelector p = slideSelecto.P;
       while (i8 < p.length) {
          p[i8] = new SlideSelector$c(uoa);
          i8 = i8 + 1;
       }
       slideSelecto.Q = new SlideSelector$e(slideSelecto, slideSelecto.K);
       slideSelecto.U = new GestureDetector(uContext, slideSelecto.V);
       return;
    }
    public void a(float p0,boolean p1){
       if (PatchProxy.isSupport(SlideSelector.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Boolean.valueOf(p1), this, SlideSelector.class, "7")) {
          return;
       }
       SlideSelector tS = this.S;
       int i = (int)p0 / tS;
       if ((p0 % (float)tS) - ((float)tS / 2.00f) > 0) {
          i = i + 1;
       }
       int i1 = Math.abs((this.Q.a() - i));
       int i2 = 1;
       if (!i1) {
          if (p1) {
             return;
          }else {
             i1 = 1;
          }
       }
       float[] uofloatArray = new float[]{this.Q.b(),this.P[i].a};
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       valueAnimato.setDuration((((long)i1 * 30) + 100));
       valueAnimato.setInterpolator(new AccelerateDecelerateInterpolator());
       valueAnimato.addUpdateListener(new a(this, p1));
       valueAnimato.addListener(new SlideSelector$b(this, i));
       valueAnimato.start();
       return;
    }
    public void b(float p0,boolean p1){
       SlideSelector$c uoc;
       if (PatchProxy.isSupport(SlideSelector.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Boolean.valueOf(p1), this, SlideSelector.class, "8")) {
          return;
       }
       SlideSelector tO = this.O;
       SlideSelector$c a = tO.a;
       SlideSelector$c c = tO.c;
       if (p0 - a < 0) {
          uoc = a;
       }else if(p0 - c > 0){
          uoc = c;
       }
       tO = this.Q;
       tO.a = uoc;
       if (p1) {
          return;
       }else {
          SlideSelector tS = this.S;
          int i = (int)(uoc - a) / tS;
          if (tO.a() == i) {
             return;
          }else if(Math.abs((uoc - (float)(tS * i))) - ((float)this.S / 2.00f) > 0){
             return;
          }else {
             this.Q.c(i);
             SlideSelector tT = this.T;
             if (tT != null) {
                tT.a(i);
             }
             return;
          }
       }
    }
    public final void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SlideSelector.class, "6")) {
          return;
       }
       this.Q.c(this.w);
       this.b(this.P[this.w].a, true);
       SlideSelector tQ = this.Q;
       SlideSelector tP = this.P;
       SlideSelector tw = this.w;
       SlideSelector$c b = tP[tw].b;
       object oobject = tP[tw];
       Objects.requireNonNull(oobject);
       Object obj = PatchProxy.apply(objArray, oobject, SlideSelector$c.class, "1");
       float f = (obj != PatchProxyResult.class)? obj.floatValue(): Math.abs((oobject.d - oobject.b));
       tQ.b = b + (f / 2.00f);
       return;
    }
    public int getCurrentLevel(){
       return this.w;
    }
    public int getDividerLineHeight(){
       return this.I;
    }
    public int getLevelCount(){
       return this.u;
    }
    public int getLineColor(){
       return this.H;
    }
    public int getLineStrokeWidth(){
       return this.J;
    }
    public String getMaxLevelText(){
       return this.z;
    }
    public int getMaxLevelTextColor(){
       return this.C;
    }
    public float getMaxLevelTextSize(){
       return this.F;
    }
    public String getMinLevelText(){
       return this.x;
    }
    public int getMinLevelTextColor(){
       return this.A;
    }
    public float getMinLevelTextSize(){
       return this.D;
    }
    public int getSliderColor(){
       return this.L;
    }
    public float getSliderRadius(){
       return this.K;
    }
    public int getSliderShadowColor(){
       return this.M;
    }
    public int getStandardLevel(){
       return this.v;
    }
    public String getStandardLevelText(){
       return this.y;
    }
    public int getStandardLevelTextColor(){
       return this.B;
    }
    public float getStandardLevelTextSize(){
       return this.E;
    }
    public int getSuggestedMinimumHeight(){
       Object obj = PatchProxy.apply(null, this, SlideSelector.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       float f = Math.max((float)Math.max(this.I, this.J), (this.K * 2.00f));
       float f1 = (float)this.G + f;
       return (int)((double)((f1 - ((f - (float)this.I) / 2.00f)) + Math.max(Math.max(this.F, this.D), (float)this.v)) + 0x3fe0000000000000);
    }
    public int getTextBottomMargin(){
       return this.G;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideSelector.class, "4")) {
          return;
       }
       SlideSelector tO = this.O;
       this.N.setColor(this.H);
       this.N.setStrokeWidth((float)this.J);
       p0.drawLine(tO.a, tO.b, tO.c, tO.d, this.N);
       SlideSelector tP = this.P;
       int len = tP.length;
       boolean b = false;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = tP[i];
          p0.drawLine(oobject.a, oobject.b, oobject.c, oobject.d, this.N);
       }
       float f = Math.max(Math.max(this.D, this.F), this.E);
       this.N.setFakeBoldText(true);
       this.N.setColor(this.A);
       this.N.setTextSize(this.D);
       p0.drawText(this.x, (tO.a - (this.N.measureText(this.x) / 2.00f)), ((tO.b - (float)this.G) - ((f - this.D) / 2.00f)), this.N);
       this.N.setColor(this.C);
       this.N.setTextSize(this.F);
       p0.drawText(this.z, (tO.c - (this.N.measureText(this.z) / 2.00f)), ((tO.b - (float)this.G) - ((f - this.F) / 2.00f)), this.N);
       this.N.setColor(this.B);
       this.N.setTextSize(this.E);
       p0.drawText(this.y, (this.P[this.v].a - (this.N.measureText(this.y) / 2.00f)), ((tO.b - (float)this.G) - ((f - this.E) / 2.00f)), this.N);
       this.N.setFakeBoldText(b);
       this.N.setColor(this.L);
       this.N.setShadowLayer(4.00f, 0, 0, this.M);
       p0.drawCircle(this.Q.b(), this.Q.b, this.Q.c, this.N);
       this.N.setShadowLayer(0, 0, 0, this.M);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(SlideSelector.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SlideSelector.class, "1")) {
          return;
       }
       p0 = View$MeasureSpec.getSize(p0);
       int size = View$MeasureSpec.getSize(p1);
       p1 = View$MeasureSpec.getMode(p1);
       if (p1 != Integer.MIN_VALUE && p1) {
          if (p1 != 0x40000000) {
             size = 0;
          }
       }else {
          size = Math.min(((this.getSuggestedMinimumHeight() + this.getPaddingTop()) + this.getPaddingBottom()), size);
       }
       this.setMeasuredDimension(p0, size);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(SlideSelector.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, SlideSelector.class, "3")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       p0 = (p0 - this.getPaddingLeft()) - this.getPaddingRight();
       this.S = p0 / (this.u - 1);
       p2 = this.getPaddingLeft();
       float f = (float)p2;
       float f1 = (float)(int)(((float)(((((p1 - this.getPaddingTop()) - this.getPaddingBottom()) + this.getSuggestedMinimumHeight()) / 2) + this.getPaddingTop()) - (Math.max((float)Math.max(this.I, this.J), (this.K * 2.00f)) / 2.00f)) - (float)(this.J / 2));
       this.O.a(f, f1, (float)(p2 + p0), f1);
       float f2 = ((float)p0 * 0x3f800000) / (float)(this.u - 1);
       SlideSelector tP = this.P;
       for (p3 = 0; p3 < tP.length; p3++) {
          float f3 = (float)p3 * f2;
          f3 = f3 + f;
          SlideSelector tI = this.I;
          float f4 = (float)tI / 2.00f;
          f4 = f1 - f4;
          float f5 = (float)tI / 2.00f;
          f5 = f5 + f1;
          tP[p3].a(f3, f4, f3, f5);
       }
       this.c();
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlideSelector.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.U.onTouchEvent(p0)) {
          return true;
       }
       if (p0.getAction() == 1 && this.R != null) {
          this.a((this.Q.b() - this.O.a), false);
       }
       return true;
    }
    public void setCurrentLevel(int p0){
       if (PatchProxy.isSupport(SlideSelector.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlideSelector.class, "11")) {
          return;
       }
       if (p0 < 0 || p0 > this.u) {
          p0 = 1;
       }
       this.w = p0;
       this.c();
       this.invalidate();
       return;
    }
    public void setDividerLineHeight(int p0){
       if (PatchProxy.isSupport(SlideSelector.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlideSelector.class, "24")) {
          return;
       }
       this.I = p0;
       this.requestLayout();
       this.invalidate();
       return;
    }
    public void setLevelCount(int p0){
       if (PatchProxy.isSupport(SlideSelector.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlideSelector.class, "9")) {
          return;
       }
       if (p0 < 3) {
          throw new IllegalArgumentException("The levelCount must > 2");
       }
       this.u = p0;
       this.invalidate();
       return;
    }
    public void setLineColor(int p0){
       if (PatchProxy.isSupport(SlideSelector.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlideSelector.class, "22")) {
          return;
       }
       this.H = p0;
       this.invalidate();
       return;
    }
    public void setLineStrokeWidth(int p0){
       if (PatchProxy.isSupport(SlideSelector.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlideSelector.class, "23")) {
          return;
       }
       this.J = p0;
       this.requestLayout();
       this.invalidate();
       return;
    }
    public void setMaxLevelText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideSelector.class, "14")) {
          return;
       }
       this.z = p0;
       this.invalidate();
       return;
    }
    public void setMaxLevelTextColor(int p0){
       if (PatchProxy.isSupport(SlideSelector.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlideSelector.class, "17")) {
          return;
       }
       this.C = p0;
       this.invalidate();
       return;
    }
    public void setMaxLevelTextSize(float p0){
       if (PatchProxy.isSupport(SlideSelector.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SlideSelector.class, "20")) {
          return;
       }
       this.F = p0;
       this.requestLayout();
       this.invalidate();
       return;
    }
    public void setMinLevelText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideSelector.class, "12")) {
          return;
       }
       this.x = p0;
       this.invalidate();
       return;
    }
    public void setMinLevelTextColor(int p0){
       if (PatchProxy.isSupport(SlideSelector.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlideSelector.class, "15")) {
          return;
       }
       this.A = p0;
       this.invalidate();
       return;
    }
    public void setMinLevelTextSize(float p0){
       if (PatchProxy.isSupport(SlideSelector.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SlideSelector.class, "18")) {
          return;
       }
       this.D = p0;
       this.requestLayout();
       this.invalidate();
       return;
    }
    public void setOnLevelChangeListener(SlideSelector$d p0){
       this.T = p0;
    }
    public void setSliderColor(int p0){
       if (PatchProxy.isSupport(SlideSelector.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlideSelector.class, "26")) {
          return;
       }
       this.L = p0;
       this.invalidate();
       return;
    }
    public void setSliderRadius(float p0){
       if (PatchProxy.isSupport(SlideSelector.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SlideSelector.class, "25")) {
          return;
       }
       this.K = p0;
       this.requestLayout();
       this.invalidate();
       return;
    }
    public void setSliderShadowColor(int p0){
       if (PatchProxy.isSupport(SlideSelector.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlideSelector.class, "27")) {
          return;
       }
       this.M = p0;
       this.invalidate();
       return;
    }
    public void setStandardLevel(int p0){
       if (PatchProxy.isSupport(SlideSelector.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlideSelector.class, "10")) {
          return;
       }
       if (p0 < 0 || p0 > this.u) {
          p0 = 1;
       }
       this.v = p0;
       this.invalidate();
       return;
    }
    public void setStandardLevelText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideSelector.class, "13")) {
          return;
       }
       this.y = p0;
       this.invalidate();
       return;
    }
    public void setStandardLevelTextColor(int p0){
       if (PatchProxy.isSupport(SlideSelector.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlideSelector.class, "16")) {
          return;
       }
       this.B = p0;
       this.invalidate();
       return;
    }
    public void setStandardLevelTextSize(float p0){
       if (PatchProxy.isSupport(SlideSelector.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SlideSelector.class, "19")) {
          return;
       }
       this.E = p0;
       this.requestLayout();
       this.invalidate();
       return;
    }
    public void setTextBottomMargin(int p0){
       if (PatchProxy.isSupport(SlideSelector.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlideSelector.class, "21")) {
          return;
       }
       this.G = p0;
       this.requestLayout();
       this.invalidate();
       return;
    }
}
