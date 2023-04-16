package com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.widget.HorizontalScrollView;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$c;
import java.util.concurrent.CopyOnWriteArrayList;
import android.widget.LinearLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import com.kwai.library.widget.viewpager.tabstrip.c;
import com.kwai.library.widget.viewpager.tabstrip.c$a;
import j17.a;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import ll8.c$b;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.RectF;
import android.content.res.Configuration;
import android.util.SparseArray;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.TextPaint;
import com.yxcorp.gifshow.widget.c$a;
import androidx.viewpager.widget.ViewPager;
import android.graphics.Typeface;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$e;
import java.lang.Object;
import java.util.List;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Exception;
import com.yxcorp.gifshow.widget.c;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Canvas;
import java.lang.String;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import android.view.View$MeasureSpec;
import android.graphics.Bitmap;
import android.graphics.Rect;
import java.lang.Integer;
import android.widget.LinearLayout$LayoutParams;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$a;
import java.lang.Runnable;
import java.lang.Math;
import i27.c;
import android.os.Parcelable;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$SavedState;
import android.view.View$BaseSavedState;
import java.util.Iterator;
import h3.a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d$b;
import android.content.res.Resources$Theme;
import o1.f;
import androidx.viewpager.widget.ViewPager$i;
import java.lang.IllegalStateException;

public class PagerSlidingTabStrip extends HorizontalScrollView	// class@000a91
{
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public ColorStateList G;
    public Typeface H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public Locale N;
    public boolean O;
    public int P;
    public PagerSlidingTabStrip$d Q;
    public int R;
    public int S;
    public boolean T;
    public int U;
    public boolean U0;
    public boolean V;
    public boolean V0;
    public c W;
    public int W0;
    public boolean X0;
    public boolean Y0;
    public boolean Z0;
    public boolean a1;
    public LinearLayout$LayoutParams b;
    public c b1;
    public final PagerSlidingTabStrip$c c;
    public float c1;
    public PagerSlidingTabStrip$e d;
    public float d1;
    public List e;
    public boolean e1;
    public ViewPager$i f;
    public SparseArray f1;
    public LinearLayout g;
    public SparseArray g1;
    public ViewPager h;
    public int h1;
    public int i;
    public int i1;
    public int j;
    public int j1;
    public float k;
    public int k1;
    public int l;
    public boolean l1;
    public Paint m;
    public int m1;
    public RectF n;
    public final SparseArray n1;
    public Paint o;
    public float o1;
    public int p;
    public boolean p1;
    public int q;
    public boolean q1;
    public int r;
    public int r1;
    public boolean s;
    public boolean s1;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public int z;
    public static final int[] t1;
    public static final int[] u1;
    public static String v1;

    static {
       PagerSlidingTabStrip.t1 = new int[3]{0x1010095,0x1010098,0x10100af};
       PagerSlidingTabStrip.u1 = new int[6]{0x1010095,0x1010098,0x10100af,0x10100d4,0x10100f4,0x10100f5};
       PagerSlidingTabStrip.v1 = "PagerSlidingTabStrip";
    }
    public void PagerSlidingTabStrip(Context p0){
       super(p0, null);
    }
    public void PagerSlidingTabStrip(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void PagerSlidingTabStrip(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = new PagerSlidingTabStrip$c(this);
       this.e = new CopyOnWriteArrayList();
       this.j = 0;
       this.k = 0;
       this.l = -1;
       this.p = -10066330;
       this.q = 0x1a000000;
       this.r = 0x1a000000;
       this.s = false;
       this.t = false;
       this.u = false;
       this.v = true;
       this.w = 52;
       this.x = 8;
       this.y = 0;
       this.z = 2;
       this.A = 12;
       this.B = 24;
       this.C = 0;
       this.D = 0;
       this.E = 1;
       this.F = 12;
       this.H = null;
       this.I = 0;
       this.J = 1;
       this.K = 0;
       this.L = 0;
       this.P = 0;
       this.W = null;
       this.U0 = true;
       this.V0 = true;
       this.Y0 = true;
       this.Z0 = false;
       this.a1 = false;
       this.c1 = 0xbf800000;
       this.d1 = 0xbf800000;
       this.e1 = false;
       this.r1 = 0;
       this.setFillViewport(true);
       this.setWillNotDraw(0);
       LinearLayout linearLayout = new LinearLayout(p0);
       this.g = linearLayout;
       linearLayout.setOrientation(0);
       this.g.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       this.g.setGravity(this.P);
       this.g.setClipChildren(0);
       this.g.setClipToPadding(0);
       this.addView(this.g);
       DisplayMetrics uDisplayMetr = c.c(this.getResources());
       this.w = (int)TypedValue.applyDimension(true, (float)this.w, uDisplayMetr);
       this.x = (int)TypedValue.applyDimension(true, (float)this.x, uDisplayMetr);
       this.z = (int)TypedValue.applyDimension(true, (float)this.z, uDisplayMetr);
       this.A = (int)TypedValue.applyDimension(true, (float)this.A, uDisplayMetr);
       this.B = (int)TypedValue.applyDimension(true, (float)this.B, uDisplayMetr);
       this.E = (int)TypedValue.applyDimension(true, (float)this.E, uDisplayMetr);
       this.F = a.d(this.getContext(), c.G.a().r);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, PagerSlidingTabStrip.t1);
       this.F = typedArray.getDimensionPixelSize(0, this.F);
       this.G = typedArray.getColorStateList(true);
       this.P = typedArray.getInt(2, this.P);
       typedArray.recycle();
       TypedArray typedArray1 = p0.obtainStyledAttributes(p1, c$b.O3);
       this.F = typedArray1.getDimensionPixelSize(true, this.F);
       this.g(typedArray1, true);
       typedArray1.recycle();
       Paint paint = new Paint();
       this.m = paint;
       paint.setAntiAlias(true);
       this.m.setStyle(Paint$Style.FILL);
       this.n = new RectF();
       paint = new Paint();
       this.o = paint;
       paint.setAntiAlias(true);
       this.o.setStrokeWidth((float)this.E);
       this.setAverageWidth(this.V0);
       if (this.N == null) {
          this.N = this.getResources().getConfiguration().locale;
       }
       this.l1 = true;
       this.n1 = new SparseArray();
       return;
    }
    public void A(int p0,int p1){
       this.I = p0;
       this.J = p1;
       this.D();
    }
    public final void B(){
       PagerSlidingTabStrip tr1 = this.r1;
       if (tr1 != this.l) {
          View childAt = this.g.getChildAt(tr1);
          if (childAt != null) {
             boolean b = false;
             this.c(childAt, b);
             this.d(childAt, b);
          }
          childAt = this.g.getChildAt(this.l);
          if (childAt != null) {
             this.c(childAt, true);
             this.d(childAt, true);
          }
          this.r1 = this.l;
       }
       return;
    }
    public final void C(View p0){
       float f;
       PagerSlidingTabStrip tj = this.j;
       View childAt = (tj < this.i)? this.g.getChildAt((tj + 1)): null;
       if (childAt == null) {
          childAt = p0;
       }
       TextPaint textPaint = null;
       if (p0 instanceof TextView) {
          textPaint = this.e(p0, p0.getText(), p0.getPaint());
          f = this.e(childAt, childAt.getText(), childAt.getPaint());
       }else if(p0 instanceof c$a){
          textPaint = this.e(p0, p0.getText(), p0.getTextPaint());
          f = this.e(childAt, childAt.getText(), childAt.getTextPaint());
       }else {
          f = 0;
       }
       this.y = (this.V != null)? (int)(textPaint + ((f - textPaint) * this.k)): (int)(textPaint - ((textPaint - f) * this.k));
       return;
    }
    public final void D(){
       View view;
       PagerSlidingTabStrip tJ;
       PagerSlidingTabStrip tG;
       PagerSlidingTabStrip th = this.h;
       if (th == null) {
          return;
       }
       th.getCurrentItem();
       int i = 0;
       while (i < this.g.getChildCount()) {
          View childAt = this.g.getChildAt(i);
          childAt.setBackgroundResource(this.M);
          childAt.setPadding(this.getTabPaddingInner(), this.C, this.getTabPaddingInner(), this.D);
          Typeface typeface = null;
          if (childAt instanceof TextView) {
             view = childAt;
          }else {
             int i1 = 0x7f0a3caa;
             try{
                view = childAt.findViewById(i1);
             }catch(java.lang.Exception e0){
                view = typeface;
             }
          }
          i = i + 1;
       }
       return;
    }
    public void a(PagerSlidingTabStrip$e p0){
       this.e.add(p0);
    }
    public final void b(int p0,PagerSlidingTabStrip$d p1){
       this.g.addView(p1.a(this.getContext(), p0, this.h), p0);
    }
    public final void c(View p0,boolean p1){
       if (p0 instanceof TextView) {
          PagerSlidingTabStrip to1 = this.o1;
          if (to1) {
             if (p1) {
                p0.setTextSize(0, ((float)this.F * to1));
             }else {
                p0.setTextSize(0, (float)this.F);
             }
          }
       }
       return;
    }
    public final void d(View p0,boolean p1){
       TextView textView;
       boolean b = true;
       int i = (!p1 || (this.J == b || (!p1 && this.I == b)))? 1: 0;
       if (p0 instanceof TextView) {
       }else {
          try{
             PagerSlidingTabStrip tj1 = this.j1;
             textView = (tj1 != null)? p0.findViewById(tj1): p0.findViewById(R.id.tab_text);
          }catch(java.lang.Exception e5){
             e5.printStackTrace();
             textView = null;
          }
       }
    }
    public final float e(View p0,CharSequence p1,TextPaint p2){
       if (this.W == null) {
          this.W = new c();
       }
       return (((float)p0.getWidth() - this.W.c(p1, p2, (float)this.F)) / 2.00f);
    }
    public final void f(){
       if (this.q1 == null) {
          return;
       }
       this.setPadding(((int)this.h(19.00f) - this.getTabPaddingInner()), this.getPaddingTop(), ((int)this.h(19.00f) - this.getTabPaddingInner()), this.getPaddingBottom());
       return;
    }
    public final void g(TypedArray p0,boolean p1){
       PagerSlidingTabStrip tp1;
       this.F = p0.getDimensionPixelSize(1, this.F);
       int i = (p1)? a.a(this.getContext(), c.G.a().b): this.p;
       this.p = p0.getColor(13, i);
       i = (p1)? a.a(this.getContext(), c.G.a().c): this.q;
       this.q = p0.getColor(35, i);
       i = (p1)? a.a(this.getContext(), c.G.a().d): this.r;
       this.r = p0.getColor(8, i);
       i = (p1)? a.d(this.getContext(), c.G.a().e): this.x;
       this.x = p0.getDimensionPixelSize(15, i);
       i = (p1)? a.d(this.getContext(), c.G.a().f): this.z;
       this.z = p0.getDimensionPixelSize(36, i);
       i = (p1)? a.d(this.getContext(), c.G.a().g): this.A;
       this.A = p0.getDimensionPixelSize(9, i);
       i = (p1)? a.d(this.getContext(), c.G.a().h): this.B;
       this.B = p0.getDimensionPixelSize(33, i);
       c s = (p1)? c.G.a().s: this.M;
       this.M = p0.getResourceId(31, s);
       s = (p1)? c.G.a().t: this.s;
       this.s = p0.getBoolean(29, s);
       i = (p1)? a.d(this.getContext(), c.G.a().i): this.w;
       this.w = p0.getDimensionPixelSize(25, i);
       s = (p1)? c.G.a().u: this.t;
       this.t = p0.getBoolean(34, s);
       i = (p1)? a.d(this.getContext(), c.G.a().j): this.y;
       this.y = p0.getDimensionPixelSize(17, i);
       s = (p1)? c.G.a().v: this.u;
       this.u = p0.getBoolean(30, s);
       i = (p1)? a.d(this.getContext(), c.G.a().k): this.S;
       this.S = p0.getDimensionPixelSize(22, i);
       s = (p1)? c.G.a().w: this.T;
       this.T = p0.getBoolean(23, s);
       i = (p1)? a.d(this.getContext(), c.G.a().l): this.W0;
       this.W0 = p0.getDimensionPixelSize(16, i);
       s = (p1)? c.G.a().x: this.V0;
       this.V0 = p0.getBoolean(3, s);
       s = (p1)? c.G.a().y: this.X0;
       this.X0 = p0.getBoolean(26, s);
       i = (p1)? a.d(this.getContext(), c.G.a().o): this.R;
       this.R = p0.getDimensionPixelSize(14, i);
       i = (p1)? a.d(this.getContext(), c.G.a().p): this.C;
       this.C = p0.getDimensionPixelSize(2, i);
       i = (p1)? a.d(this.getContext(), c.G.a().q): this.D;
       this.D = p0.getDimensionPixelSize(0, i);
       i = (p1)? a.d(this.getContext(), c.G.a().m): this.h1;
       this.h1 = p0.getDimensionPixelSize(7, i);
       i = (p1)? a.d(this.getContext(), c.G.a().n): this.i1;
       this.i1 = p0.getDimensionPixelSize(5, i);
       s = (p1)? c.G.a().z: this.U0;
       this.U0 = p0.getBoolean(11, s);
       s = (p1)? c.G.a().B: this.k1;
       this.k1 = p0.getInt(32, s);
       s = (p1)? c.G.a().A: this.m1;
       this.m1 = p0.getInt(12, s);
       s = (p1)? c.G.a().C: this.o1;
       this.o1 = p0.getFloat(28, s);
       s = (p1)? c.G.a().D: this.p1;
       this.p1 = p0.getBoolean(27, s);
       c e = (p1)? c.G.a().E: this.q1;
       this.q1 = p0.getBoolean(10, e);
       return;
    }
    public int getTabBottomPadding(){
       return this.D;
    }
    public int getTabItemAlignmentMode(){
       return this.k1;
    }
    public int getTabItemViewId(){
       return this.j1;
    }
    public int getTabPadding(){
       return this.getTabPaddingInner();
    }
    public final int getTabPaddingInner(){
       PagerSlidingTabStrip tB;
       int i = 0;
       if (this.a1 != null) {
          tB = this.B;
       }else if(this.Z0 != null){
          tB = 0;
       }else {
          tB = this.B;
       }
       if (!this.o()) {
          i = tB;
       }
       return i;
    }
    public int getTabTopPadding(){
       return this.C;
    }
    public LinearLayout getTabsContainer(){
       return this.g;
    }
    public final float h(float p0){
       return ((p0 * c.c(this.getResources()).density) + 0x3f000000);
    }
    public final void i(){
       PagerSlidingTabStrip th1;
       PagerSlidingTabStrip ti1;
       if (this.l1 != null) {
          boolean b = false;
          this.l1 = b;
          Drawable background = this.getBackground();
          int i = 5;
          int i1 = 4;
          int i2 = 3;
          int i3 = 8;
          if (background instanceof ColorDrawable) {
             GradientDrawable gradientDraw = new GradientDrawable();
             gradientDraw.setColor(background.getColor());
             gradientDraw.setShape(b);
             float[] uofloatArray = new float[i3];
             th1 = this.h1;
             uofloatArray[b] = (float)th1;
             uofloatArray[1] = (float)th1;
             uofloatArray[2] = (float)th1;
             uofloatArray[i2] = (float)th1;
             ti1 = this.i1;
             uofloatArray[i1] = (float)ti1;
             uofloatArray[i] = (float)ti1;
             uofloatArray[6] = (float)ti1;
             uofloatArray[7] = (float)ti1;
             gradientDraw.setCornerRadii(uofloatArray);
             this.setBackground(gradientDraw);
          }else if(background instanceof GradientDrawable){
             float[] uofloatArray1 = new float[i3];
             th1 = this.h1;
             uofloatArray1[b] = (float)th1;
             uofloatArray1[1] = (float)th1;
             uofloatArray1[2] = (float)th1;
             uofloatArray1[i2] = (float)th1;
             ti1 = this.i1;
             uofloatArray1[i1] = (float)ti1;
             uofloatArray1[i] = (float)ti1;
             uofloatArray1[6] = (float)ti1;
             uofloatArray1[7] = (float)ti1;
             background.setCornerRadii(uofloatArray1);
             this.setBackground(background);
          }
       }
       return;
    }
    public final void j(Canvas p0){
       TextView textView;
       if (this.f1.size() <= 0) {
          return;
       }
       int i = 0;
       while (i < this.i) {
          String str = this.f1.get(i);
          if (!TextUtils.isEmpty(str)) {
             String str1 = "EMPTY";
             ViewGroup viewGroup = null;
             if (str.equals(str1)) {
                textView = a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d15a3, viewGroup, false);
             }else {
                textView = a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d15a4, viewGroup, false);
                textView.setText(str);
             }
             textView.setDrawingCacheEnabled(true);
             if (str.equals(str1)) {
                int i1 = 0x40000000;
                textView.measure(View$MeasureSpec.makeMeasureSpec((int)this.h(8.00f), i1), View$MeasureSpec.makeMeasureSpec((int)this.h(8.00f), i1));
             }else {
                textView.measure(View$MeasureSpec.makeMeasureSpec(false, false), View$MeasureSpec.makeMeasureSpec(false, false));
             }
             textView.layout(false, false, textView.getMeasuredWidth(), textView.getMeasuredHeight());
             Bitmap uBitmap = Bitmap.createBitmap(textView.getDrawingCache());
             textView.destroyDrawingCache();
             if (uBitmap != null) {
                int width = uBitmap.getWidth();
                int height = uBitmap.getHeight();
                Rect rect = new Rect(false, false, width, height);
                View childAt = this.g.getChildAt(i);
                int i2 = this.g1.get(i).intValue();
                if (i2 == -1 && childAt instanceof TextView) {
                   int i3 = childAt.getWidth() - (int)childAt.getPaint().measureText(childAt.getText().toString());
                   i3 = i3 / 2;
                   i2 = childAt.getRight() - i3;
                   this.g1.put(i, Integer.valueOf(i2));
                }
                width = width + i2;
                height = height + 10;
                Rect rect1 = new Rect(i2, 10, width, height);
                p0.drawBitmap(uBitmap, rect, rect1, this.m);
             }
          }
          i = i + 1;
       }
       return;
    }
    public ViewGroup$LayoutParams k(){
       return new LinearLayout$LayoutParams(-2, -1);
    }
    public ViewGroup$LayoutParams l(View p0){
       LinearLayout$LayoutParams layoutParams;
       if ((double)this.o1 - null && (!this.o() && p0 instanceof TextView)) {
          TextView textView = new TextView(this.getContext());
          textView.setTextSize(0, ((float)this.F * this.o1));
          textView.getPaint().setFakeBoldText(true);
          layoutParams = new LinearLayout$LayoutParams(((int)textView.getPaint().measureText(p0.getText().toString()) + (this.getTabPaddingInner() * 2)), -1);
       }else {
          layoutParams = this.k();
       }
       return layoutParams;
    }
    public final void m(){
       float f = 0x3f800000;
       int i = 0;
       if (this.i <= this.m1) {
          this.b = (this.k1 == 2)? new LinearLayout$LayoutParams(i, -1, f): new LinearLayout$LayoutParams(-2, -1);
       }else {
          this.b = new LinearLayout$LayoutParams(-2, -1);
       }
       if (this.V0 != null) {
          this.b = new LinearLayout$LayoutParams(i, -1, f);
       }else {
          PagerSlidingTabStrip tb = this.b;
          LinearLayout$LayoutParams gravity = tb.gravity;
          PagerSlidingTabStrip tk1 = this.k1;
          if (tk1 == null) {
             gravity = 3;
          }else if(tk1 == 1){
             gravity = 17;
          }
          tb.gravity = gravity;
       }
       return;
    }
    public boolean n(){
       return this.U0;
    }
    public final boolean o(){
       boolean b = (this.k1 == 2 && this.i <= this.m1)? true: false;
       return b;
    }
    public void onConfigurationChanged(Configuration p0){
       if (this.h == null) {
          return;
       }
       this.D();
       this.O = false;
       this.post(new PagerSlidingTabStrip$a(this));
       return;
    }
    public void onDraw(Canvas p0){
       PagerSlidingTabStrip j;
       int i3;
       float f3;
       float f5;
       PagerSlidingTabStrip pagerSliding = this;
       Canvas uCanvas = p0;
       super.onDraw(p0);
       if (!this.isInEditMode()) {
          PagerSlidingTabStrip i = pagerSliding.i;
          if (i != null && pagerSliding.j < i) {
             this.i();
             View childAt = pagerSliding.g.getChildAt(pagerSliding.j);
             float f = pagerSliding.r((float)childAt.getLeft());
             float f1 = pagerSliding.r((float)childAt.getRight());
             int scrollX = this.getScrollX();
             int i1 = this.getPaddingLeft() + scrollX;
             scrollX = (scrollX + this.getWidth()) - this.getPaddingRight();
             float f2 = 0x3f800000;
             if (pagerSliding.k - null > 0) {
                j = pagerSliding.j;
                if (j < (pagerSliding.i - 1)) {
                   View childAt1 = pagerSliding.g.getChildAt((j + 1));
                   PagerSlidingTabStrip k = pagerSliding.k;
                   f = (pagerSliding.r((float)childAt1.getLeft()) * k) + ((f2 - k) * f);
                   f1 = (pagerSliding.r((float)childAt1.getRight()) * k) + ((f2 - k) * f1);
                }
             }
             int height = this.getHeight();
             pagerSliding.m.setColor(pagerSliding.p);
             pagerSliding.n.setEmpty();
             j = pagerSliding.S;
             int i2 = 0;
             if (j != null) {
                i3 = (int)(((f1 - f) - (float)j) / 2.00f);
                pagerSliding.y = i3;
                j = pagerSliding.k;
                f2 = ((double)j - 0x3fe0000000000000 < 0)? ((float)i3 * j) / 3.00f: ((float)i3 * (f2 - j)) / 3.00f;
                f = (f + (float)i3) - f2;
                f1 = (f1 - (float)i3) + f2;
                f3 = (float)scrollX;
                if (f - f3 <= 0) {
                   f5 = (float)i1;
                   if (f1 - f5 >= 0) {
                      if (f - f5 > 0) {
                         f1 = Math.min(f1, f3);
                      }else if(f1 - f3 < 0){
                         f = Math.max(f, f5);
                      }
                      i = 1;
                   label_00de :
                      j = pagerSliding.W0;
                      pagerSliding.n.set(f, (float)(((height - pagerSliding.x) - 1) - j), f1, (float)((height - 1) - j));
                   }
                }
                i = null;
                goto label_00de ;
             }else if(pagerSliding.T != null){
                pagerSliding.C(childAt);
             }
             i = pagerSliding.y;
             f = f + (float)i;
             f1 = f1 - (float)i;
             f3 = (float)scrollX;
             if (f - f3 <= 0) {
                f5 = (float)i1;
                if (f1 - f5 >= 0) {
                   if (f - f5 > 0) {
                      f1 = Math.min(f1, f3);
                   }else if(f1 - f3 < 0){
                      f = Math.max(f, f5);
                   }
                   i = 1;
                label_011d :
                   j = pagerSliding.W0;
                   pagerSliding.n.set(f, (float)((height - pagerSliding.x) - j), f1, (float)(height - j));
                }
             }
             i = null;
             goto label_011d ;
             PagerSlidingTabStrip n = pagerSliding.n;
             pagerSliding.c1 = n.left;
             pagerSliding.d1 = n.right;
             if (this.n() && i) {
                i = pagerSliding.b1;
                if (i != null) {
                   n = 0xbf800000;
                   if (i.a() - n && pagerSliding.b1.b() - n) {
                      RectF rectF = new RectF(pagerSliding.n);
                      rectF.left = pagerSliding.b1.a();
                      rectF.right = pagerSliding.b1.b();
                      if (pagerSliding.e1 != null) {
                         uCanvas.drawRect(rectF, pagerSliding.m);
                      }else {
                         n = pagerSliding.R;
                         f1 = (float)n;
                         uCanvas.drawRoundRect(rectF, f1, (float)n, pagerSliding.m);
                      }
                   }
                }
                if (pagerSliding.e1 != null) {
                   uCanvas.drawRect(pagerSliding.n, pagerSliding.m);
                }else {
                   n = pagerSliding.R;
                   f1 = (float)n;
                   uCanvas.drawRoundRect(pagerSliding.n, f1, (float)n, pagerSliding.m);
                }
             }
             pagerSliding.m.setColor(pagerSliding.q);
             p0.drawRect(0, (float)(height - pagerSliding.z), (float)pagerSliding.g.getWidth(), (float)height, pagerSliding.m);
             pagerSliding.o.setColor(pagerSliding.r);
             i3 = pagerSliding.i - 1;
             while (i2 < i3) {
                childAt = pagerSliding.g.getChildAt(i2);
                i3 = height - pagerSliding.A;
                float f4 = (float)i3;
                p0.drawLine(pagerSliding.r((float)childAt.getRight()), (float)pagerSliding.A, pagerSliding.r((float)childAt.getRight()), f4, pagerSliding.o);
                i2 = i2 + 1;
             }
             this.j(p0);
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       this.f();
       PagerSlidingTabStrip pagerSliding = (this.k1 == null && (this.s1 == null && this.s == null))? 1: null;
       if (!pagerSliding && (this.O != null || !View$MeasureSpec.getMode(p0))) {
          super.onMeasure(p0, p1);
          return;
       }else if(this.O == null){
          super.onMeasure(p0, p1);
       }
       int measuredWidt = this.getMeasuredWidth();
       int i1 = 0;
       for (int i = 0; i < this.i; i = i + 1) {
          View childAt = this.g.getChildAt(i);
          int i2 = (childAt == null)? 0: childAt.getMeasuredWidth();
          i1 = i1 + i2;
       }
       if (i1 > 0 && measuredWidt > 0) {
          this.w = this.g.getChildAt(0).getMeasuredWidth();
          if (i1 <= measuredWidt) {
             this.a1 = false;
             if (this.v != null) {
                measuredWidt = 0;
                while (measuredWidt < this.i) {
                   View childAt1 = this.g.getChildAt(measuredWidt);
                   ViewGroup$LayoutParams layoutParams = (childAt1 == null)? null: childAt1.getLayoutParams();
                   if (layoutParams == null || layoutParams.width <= null) {
                      if (!measuredWidt) {
                         PagerSlidingTabStrip tb = this.b;
                         LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(tb.width, tb.height);
                         tb = this.b;
                         layoutParams1.gravity = tb.gravity;
                         layoutParams1.weight = tb.weight;
                         layoutParams1.rightMargin = tb.rightMargin;
                         layoutParams1.bottomMargin = tb.bottomMargin;
                         layoutParams1.topMargin = tb.topMargin;
                         layoutParams1.leftMargin = 0;
                         childAt1.setLayoutParams(layoutParams1);
                      }else {
                         childAt1.setLayoutParams(this.b);
                      }
                      childAt1.setPadding(this.getTabPaddingInner(), this.C, this.getTabPaddingInner(), this.D);
                   }
                   measuredWidt = measuredWidt + 1;
                }
             }
          }else {
             this.a1 = true;
          }
          this.O = true;
       }
       super.onMeasure(p0, p1);
       return;
    }
    public void onRestoreInstanceState(Parcelable p0){
       super.onRestoreInstanceState(p0.getSuperState());
       this.j = p0.b;
       this.requestLayout();
    }
    public Parcelable onSaveInstanceState(){
       PagerSlidingTabStrip$SavedState savedState = new PagerSlidingTabStrip$SavedState(super.onSaveInstanceState());
       savedState.b = this.j;
       return savedState;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       super.onScrollChanged(p0, p1, p2, p3);
       PagerSlidingTabStrip te = this.e;
       _monitor_enter(te);
       Iterator iterator = this.e.iterator();
       while (iterator.hasNext()) {
          PagerSlidingTabStrip$e uoe = iterator.next();
          if (uoe != null) {
             uoe.a();
          }
       }
       _monitor_exit(te);
       te = this.d;
       if (te != null) {
          te.a();
       }
       return;
    }
    public boolean p(View p0){
       if (p0 == null) {
          return false;
       }
       Rect rect = new Rect();
       this.getHitRect(rect);
       return p0.getLocalVisibleRect(rect);
    }
    public void q(){
       if (this.h == null) {
          return;
       }
       this.g.removeAllViews();
       this.i = this.h.getAdapter().j();
       PagerSlidingTabStrip tPagerSlidin = this.f1;
       if (tPagerSlidin == null) {
          this.f1 = new SparseArray();
       }else {
          tPagerSlidin.clear();
       }
       tPagerSlidin = this.g1;
       if (tPagerSlidin == null) {
          this.g1 = new SparseArray();
       }else {
          tPagerSlidin.clear();
       }
       this.m();
       boolean b = false;
       int i = 0;
       PagerSlidingTabStrip ti = this.i;
       while (i < ti) {
          this.g1.put(i, Integer.valueOf(-1));
          this.n1.put(i, Integer.valueOf(-1));
          if (this.h.getAdapter() instanceof PagerSlidingTabStrip$d$b) {
             this.b(i, this.h.getAdapter().b(i));
          }else {
             this.b(i, new PagerSlidingTabStrip$d(Integer.toString(i), this.h.getAdapter().l(i)));
          }
          i = i + 1;
       }
       if (ti > null) {
          PagerSlidingTabStrip tQ = this.Q;
          if (tQ != null) {
             this.b(ti, tQ);
          }
       }
       this.D();
       this.O = b;
       this.u(this.h.getCurrentItem());
       tPagerSlidin = this.h;
       if (tPagerSlidin != null && tPagerSlidin.getCurrentItem() != this.j) {
          this.j = this.h.getCurrentItem();
          this.k = 0;
          this.invalidate();
       }
       this.f();
       return;
    }
    public float r(float p0){
       return (p0 + (float)this.getPaddingLeft());
    }
    public void s(PagerSlidingTabStrip$e p0){
       this.e.remove(p0);
    }
    public void setAverageWidth(boolean p0){
       this.V0 = p0;
       this.m();
       this.q();
    }
    public void setClickOnlyTabStrip(PagerSlidingTabStrip$d p0){
       this.Q = p0;
    }
    public void setDividerColorInt(int p0){
       this.r = p0;
    }
    public void setDividerPadding(int p0){
       this.A = p0;
    }
    public void setIgnorePaddingWhenCannotScroll(boolean p0){
       this.Z0 = p0;
    }
    public void setIndicatorColor(int p0){
       this.p = f.a(this.getResources(), p0, null);
    }
    public void setIndicatorColorInt(int p0){
       this.p = p0;
    }
    public void setIndicatorForceRect(boolean p0){
       this.e1 = p0;
    }
    public void setIndicatorForceRectAndInvalidate(boolean p0){
       this.e1 = p0;
       this.invalidate();
    }
    public void setIndicatorPadding(int p0){
       this.y = p0;
    }
    public void setOnPageChangeListener(ViewPager$i p0){
       this.f = p0;
    }
    public void setScrollListener(PagerSlidingTabStrip$e p0){
       this.d = p0;
    }
    public void setScrollSelectedTabToCenter(boolean p0){
       this.X0 = p0;
    }
    public void setScrollWithPager(boolean p0){
       this.Y0 = p0;
    }
    public void setShouldExpand(boolean p0){
       this.s = p0;
    }
    public void setShouldReMeasure(boolean p0){
       this.v = p0;
    }
    public void setStyle(int p0){
       DisplayMetrics uDisplayMetr = c.c(this.getResources());
       this.y = 0;
       this.S = 0;
       this.p = -10066330;
       this.x = (int)TypedValue.applyDimension(1, 8.00f, uDisplayMetr);
       this.W0 = 0;
       this.T = false;
       this.q = 0x1a000000;
       this.z = (int)TypedValue.applyDimension(1, 2.00f, uDisplayMetr);
       this.r = 0x1a000000;
       this.A = (int)TypedValue.applyDimension(1, 12.00f, uDisplayMetr);
       this.C = 0;
       this.D = 0;
       this.F = (int)TypedValue.applyDimension(2, 12.00f, uDisplayMetr);
       this.G = null;
       this.k1 = 0;
       this.r1 = 0;
       this.o1 = 0;
       TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, PagerSlidingTabStrip.u1);
       this.F = typedArray.getDimensionPixelSize(0, 0);
       this.G = typedArray.getColorStateList(1);
       this.P = typedArray.getInt(2, this.P);
       ColorStateList colorStateLi = typedArray.getColorStateList(3);
       int layoutDimens = typedArray.getLayoutDimension(4, -1);
       int layoutDimens1 = typedArray.getLayoutDimension(5, -2);
       typedArray.recycle();
       this.l1 = true;
       TypedArray typedArray1 = this.getContext().obtainStyledAttributes(p0, c$b.O3);
       this.g(typedArray1, 0);
       typedArray1.recycle();
       this.setBackgroundTintList(colorStateLi);
       this.setLayoutParams(new LinearLayout$LayoutParams(layoutDimens, layoutDimens1));
       this.q();
    }
    public void setTabBottomPadding(int p0){
       if (this.D != p0) {
          this.O = false;
          this.D = p0;
          this.requestLayout();
       }
       return;
    }
    public void setTabGravity(int p0){
       this.P = p0;
       this.g.setGravity(p0);
    }
    public void setTabIndicatorInterceptor(c p0){
       this.b1 = p0;
    }
    public void setTabItemAlignmentMode(int p0){
       this.k1 = p0;
       this.m();
       this.q();
    }
    public void setTabItemViewId(int p0){
       this.j1 = p0;
    }
    public void setTabLayoutParams(LinearLayout$LayoutParams p0){
       this.b = p0;
       this.s1 = true;
    }
    public void setTabPadding(int p0){
       if (this.B != p0) {
          this.O = false;
          this.B = p0;
          this.requestLayout();
       }
       return;
    }
    public void setTabTextSize(int p0){
       this.F = p0;
       this.D();
    }
    public void setTabTopPadding(int p0){
       if (this.C != p0) {
          this.O = false;
          this.C = p0;
          this.requestLayout();
       }
       return;
    }
    public void setTabTypefaceStyle(int p0){
       this.I = p0;
       this.J = p0;
       this.D();
    }
    public void setTextColor(int p0){
       this.G = f.b(this.getResources(), p0, null);
       this.D();
    }
    public void setUnderlineColorInt(int p0){
       this.q = p0;
    }
    public void setUnderlineHeight(int p0){
       this.z = p0;
    }
    public void setViewPager(ViewPager p0){
       this.h = p0;
       if (p0.getAdapter() == null) {
          throw new IllegalStateException("ViewPager does not have adapter instance.");
       }
       p0.setOnPageChangeListener(this.c);
       this.q();
       return;
    }
    public void t(int p0,int p1){
       if (this.i == null) {
          return;
       }
       int i = this.g.getChildAt(p0).getLeft() + p1;
       if (p0 > 0 || p1 > 0) {
          i = (this.X0 != null)? (i - (this.getWidth() / 2)) + (this.g.getChildAt(p0).getWidth() / 2): i - this.w;
       }
    label_0030 :
       PagerSlidingTabStrip tK = this.K;
       if (i != tK) {
          if (this.u == null) {
             this.K = i;
             this.scrollTo(i, 0);
          }else if(i < tK){
             this.K = i;
             this.L = this.getWidth() + i;
             this.scrollTo(i, 0);
          }else {
             i = (this.g.getChildAt(p0).getRight() - this.getWidth()) + p1;
             if (p0 > 0 || p1 > 0) {
                i = i + this.w;
             }
             if ((this.getWidth() + i) > this.L) {
                this.L = this.getWidth() + i;
                this.K = i;
                this.scrollTo(i, 0);
             }
          }
       }
       return;
    }
    public void u(int p0){
       View childAt;
       if (p0 < this.i && p0 >= 0) {
          PagerSlidingTabStrip tl = this.l;
          if (tl == p0) {
             childAt = this.g.getChildAt(tl);
             if (childAt != null) {
                childAt.setSelected(true);
                this.c(childAt, true);
                this.d(childAt, true);
             }
             this.B();
             return;
          }else {
             View childAt1 = this.g.getChildAt(tl);
             if (childAt1 != null) {
                childAt1.setSelected(false);
                this.c(childAt1, false);
                this.d(childAt1, false);
             }
             this.l = p0;
             childAt = this.g.getChildAt(p0);
             if (childAt != null) {
                childAt.setSelected(true);
                this.c(childAt, true);
                this.d(childAt, true);
             }
             this.B();
          }
       }
       return;
    }
    public PagerSlidingTabStrip v(boolean p0){
       this.U0 = p0;
       return this;
    }
    public PagerSlidingTabStrip w(int p0){
       this.x = p0;
       return this;
    }
    public PagerSlidingTabStrip x(int p0){
       this.W0 = p0;
       return this;
    }
    public PagerSlidingTabStrip y(int p0){
       this.S = p0;
       return this;
    }
    public PagerSlidingTabStrip z(boolean p0){
       this.T = p0;
       return this;
    }
}
