package com.kuaishou.merchant.live.cart.onsale.audience.ultron.component.tabbar.view.SlidingTabStrip;
import android.widget.HorizontalScrollView;
import android.content.Context;
import android.util.AttributeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import android.widget.LinearLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.component.tabbar.view.b;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.component.tabbar.view.b$a;
import j17.a;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import ll8.c$b;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.RectF;
import android.content.res.Configuration;
import android.util.SparseIntArray;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.component.tabbar.view.SlidingTabStrip$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import java.lang.CharSequence;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.component.tabbar.view.a;
import android.view.View$OnClickListener;
import java.lang.Boolean;
import java.lang.Exception;
import android.text.TextPaint;
import android.graphics.Typeface;
import java.lang.Number;
import com.yxcorp.gifshow.widget.c;
import java.lang.Float;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Canvas;
import android.util.SparseArray;
import android.text.TextUtils;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import android.view.View$MeasureSpec;
import android.graphics.Rect;
import android.widget.LinearLayout$LayoutParams;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.component.tabbar.view.SlidingTabStrip$c$a;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.component.tabbar.view.SlidingTabStrip$a;
import java.lang.Runnable;
import java.lang.Math;
import i27.c;
import android.os.Parcelable;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.component.tabbar.view.SlidingTabStrip$SavedState;
import android.view.View$BaseSavedState;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.component.tabbar.view.SlidingTabStrip$d;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.component.tabbar.view.SlidingTabStrip$e;
import com.yxcorp.gifshow.widget.c$a;
import android.content.res.Resources$Theme;
import o1.f;

public class SlidingTabStrip extends HorizontalScrollView	// class@001995
{
    public int A;
    public int B;
    public int C;
    public int D;
    public ColorStateList E;
    public Typeface F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public Locale L;
    public boolean M;
    public int N;
    public SlidingTabStrip$c O;
    public int P;
    public int Q;
    public boolean R;
    public int S;
    public boolean T;
    public c U;
    public int U0;
    public boolean V;
    public boolean V0;
    public boolean W;
    public boolean W0;
    public boolean X0;
    public c Y0;
    public float Z0;
    public float a1;
    public LinearLayout$LayoutParams b;
    public boolean b1;
    public SlidingTabStrip$d c;
    public SparseArray c1;
    public List d;
    public SparseIntArray d1;
    public SlidingTabStrip$e e;
    public int e1;
    public LinearLayout f;
    public int f1;
    public int g;
    public int g1;
    public int h;
    public int h1;
    public float i;
    public boolean i1;
    public int j;
    public int j1;
    public Paint k;
    public final SparseIntArray k1;
    public RectF l;
    public float l1;
    public Paint m;
    public boolean m1;
    public int n;
    public boolean n1;
    public int o;
    public int o1;
    public int p;
    public boolean p1;
    public boolean q;
    public SlidingTabStrip$c$a q1;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public static final int[] r1;
    public static final int[] s1;
    public static String t1;

    static {
       SlidingTabStrip.r1 = new int[3]{0x1010095,0x1010098,0x10100af};
       SlidingTabStrip.s1 = new int[6]{0x1010095,0x1010098,0x10100af,0x10100d4,0x10100f4,0x10100f5};
       SlidingTabStrip.t1 = "SlidingTabStrip";
    }
    public void SlidingTabStrip(Context p0){
       super(p0, null);
    }
    public void SlidingTabStrip(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SlidingTabStrip(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = new CopyOnWriteArrayList();
       this.h = 0;
       this.i = 0;
       this.j = -1;
       this.n = -10066330;
       this.o = 0x1a000000;
       this.p = 0x1a000000;
       this.q = false;
       this.r = false;
       this.s = false;
       this.t = true;
       this.u = 52;
       this.v = 8;
       this.w = 0;
       this.x = 2;
       this.y = 12;
       this.z = 24;
       this.A = 0;
       this.B = 0;
       this.C = 1;
       this.D = 12;
       this.F = null;
       this.G = 0;
       this.H = 1;
       this.I = 0;
       this.J = 0;
       this.N = 0;
       this.U = null;
       this.V = true;
       this.W = true;
       this.W0 = false;
       this.X0 = false;
       this.Z0 = 0xbf800000;
       this.a1 = 0xbf800000;
       this.b1 = false;
       this.o1 = 0;
       this.setFillViewport(true);
       this.setWillNotDraw(0);
       LinearLayout linearLayout = new LinearLayout(p0);
       this.f = linearLayout;
       linearLayout.setOrientation(0);
       this.f.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       this.f.setGravity(this.N);
       this.f.setClipChildren(0);
       this.f.setClipToPadding(0);
       this.addView(this.f);
       DisplayMetrics uDisplayMetr = c.c(this.getResources());
       this.u = (int)TypedValue.applyDimension(true, (float)this.u, uDisplayMetr);
       this.v = (int)TypedValue.applyDimension(true, (float)this.v, uDisplayMetr);
       this.x = (int)TypedValue.applyDimension(true, (float)this.x, uDisplayMetr);
       this.y = (int)TypedValue.applyDimension(true, (float)this.y, uDisplayMetr);
       this.z = (int)TypedValue.applyDimension(true, (float)this.z, uDisplayMetr);
       this.C = (int)TypedValue.applyDimension(true, (float)this.C, uDisplayMetr);
       this.D = a.d(this.getContext(), b.G.a().r);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, SlidingTabStrip.r1);
       this.D = typedArray.getDimensionPixelSize(0, this.D);
       this.E = typedArray.getColorStateList(true);
       this.N = typedArray.getInt(2, this.N);
       typedArray.recycle();
       TypedArray typedArray1 = p0.obtainStyledAttributes(p1, c$b.O3);
       this.D = typedArray1.getDimensionPixelSize(true, this.D);
       this.e(typedArray1, true);
       typedArray1.recycle();
       Paint paint = new Paint();
       this.k = paint;
       paint.setAntiAlias(true);
       this.k.setStyle(Paint$Style.FILL);
       this.l = new RectF();
       paint = new Paint();
       this.m = paint;
       paint.setAntiAlias(true);
       this.m.setStrokeWidth((float)this.C);
       this.setAverageWidth(this.W);
       if (this.L == null) {
          this.L = this.getResources().getConfiguration().locale;
       }
       this.i1 = true;
       this.k1 = new SparseIntArray();
       return;
    }
    public final void a(int p0,SlidingTabStrip$c p1){
       SlidingTabStrip$c uoc;
       if (PatchProxy.isSupport(SlidingTabStrip.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, SlidingTabStrip.class, "24")) {
          return;
       }
       Context context = this.getContext();
       Objects.requireNonNull(p1);
       if (PatchProxy.isSupport(SlidingTabStrip$c.class)) {
          uoc = PatchProxy.applyThreeRefs(context, Integer.valueOf(p0), this, p1, SlidingTabStrip$c.class, "3");
          if (uoc != PatchProxyResult.class) {
          label_0069 :
             this.f.addView(uoc, p0);
             return;
          }
       }
       p1.d = p0;
       uoc = p1.b;
       if (uoc != null) {
          p1.c = uoc;
       }else {
          TextView textView = new TextView(context);
          p1.c = textView;
          textView.setText(p1.a);
          textView.setFocusable(true);
          textView.setGravity(17);
          textView.setSingleLine();
       }
       p1.c.setOnClickListener(new a(p1, p0, this));
       uoc = p1.c;
       goto label_0069 ;
    }
    public final void b(View p0,boolean p1){
       if (PatchProxy.isSupport(SlidingTabStrip.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, SlidingTabStrip.class, "48")) {
          return;
       }
       if (p0 instanceof TextView) {
          SlidingTabStrip tl1 = this.l1;
          if (tl1) {
             if (p1) {
                p0.setTextSize(0, ((float)this.D * tl1));
             }else {
                p0.setTextSize(0, (float)this.D);
             }
          }
       }
       return;
    }
    public final void c(View p0,boolean p1){
       TextView textView;
       if (PatchProxy.isSupport(SlidingTabStrip.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, SlidingTabStrip.class, "47")) {
          return;
       }
       boolean b = true;
       int i = (!p1 || (this.H == b || (!p1 && this.G == b)))? 1: 0;
       if (p0 instanceof TextView) {
       }else {
          try{
             SlidingTabStrip tg1 = this.g1;
             textView = (tg1 != null)? p0.findViewById(tg1): p0.findViewById(R.id.tab_text);
          }catch(java.lang.Exception e5){
             e5.printStackTrace();
             textView = null;
          }
       }
    }
    public final float d(View p0,CharSequence p1,TextPaint p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, SlidingTabStrip.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (this.U == null) {
          this.U = new c();
       }
       return (((float)p0.getWidth() - this.U.c(p1, p2, (float)this.D)) / 2.00f);
    }
    public final void e(TypedArray p0,boolean p1){
       SlidingTabStrip tm1;
       if (PatchProxy.isSupport(SlidingTabStrip.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, SlidingTabStrip.class, "53")) {
          return;
       }
       this.D = p0.getDimensionPixelSize(1, this.D);
       int i = (p1)? a.a(this.getContext(), b.G.a().b): this.n;
       this.n = p0.getColor(13, i);
       i = (p1)? a.a(this.getContext(), b.G.a().c): this.o;
       this.o = p0.getColor(35, i);
       i = (p1)? a.a(this.getContext(), b.G.a().d): this.p;
       this.p = p0.getColor(8, i);
       i = (p1)? a.d(this.getContext(), b.G.a().e): this.v;
       this.v = p0.getDimensionPixelSize(15, i);
       i = (p1)? a.d(this.getContext(), b.G.a().f): this.x;
       this.x = p0.getDimensionPixelSize(36, i);
       i = (p1)? a.d(this.getContext(), b.G.a().g): this.y;
       this.y = p0.getDimensionPixelSize(9, i);
       i = (p1)? a.d(this.getContext(), b.G.a().h): this.z;
       this.z = p0.getDimensionPixelSize(33, i);
       b s = (p1)? b.G.a().s: this.K;
       this.K = p0.getResourceId(31, s);
       s = (p1)? b.G.a().t: this.q;
       this.q = p0.getBoolean(29, s);
       i = (p1)? a.d(this.getContext(), b.G.a().i): this.u;
       this.u = p0.getDimensionPixelSize(25, i);
       s = (p1)? b.G.a().u: this.r;
       this.r = p0.getBoolean(34, s);
       i = (p1)? a.d(this.getContext(), b.G.a().j): this.w;
       this.w = p0.getDimensionPixelSize(17, i);
       s = (p1)? b.G.a().v: this.s;
       this.s = p0.getBoolean(30, s);
       i = (p1)? a.d(this.getContext(), b.G.a().k): this.Q;
       this.Q = p0.getDimensionPixelSize(22, i);
       s = (p1)? b.G.a().w: this.R;
       this.R = p0.getBoolean(23, s);
       i = (p1)? a.d(this.getContext(), b.G.a().l): this.U0;
       this.U0 = p0.getDimensionPixelSize(16, i);
       s = (p1)? b.G.a().x: this.W;
       this.W = p0.getBoolean(3, s);
       s = (p1)? b.G.a().y: this.V0;
       this.V0 = p0.getBoolean(26, s);
       i = (p1)? a.d(this.getContext(), b.G.a().o): this.P;
       this.P = p0.getDimensionPixelSize(14, i);
       i = (p1)? a.d(this.getContext(), b.G.a().p): this.A;
       this.A = p0.getDimensionPixelSize(2, i);
       i = (p1)? a.d(this.getContext(), b.G.a().q): this.B;
       this.B = p0.getDimensionPixelSize(0, i);
       i = (p1)? a.d(this.getContext(), b.G.a().m): this.e1;
       this.e1 = p0.getDimensionPixelSize(7, i);
       i = (p1)? a.d(this.getContext(), b.G.a().n): this.f1;
       this.f1 = p0.getDimensionPixelSize(5, i);
       s = (p1)? b.G.a().z: this.V;
       this.V = p0.getBoolean(11, s);
       s = (p1)? b.G.a().B: this.h1;
       this.h1 = p0.getInt(32, s);
       s = (p1)? b.G.a().A: this.j1;
       this.j1 = p0.getInt(12, s);
       s = (p1)? b.G.a().C: this.l1;
       this.l1 = p0.getFloat(28, s);
       s = (p1)? b.G.a().D: this.m1;
       this.m1 = p0.getBoolean(27, s);
       b e = (p1)? b.G.a().E: this.n1;
       this.n1 = p0.getBoolean(10, e);
       return;
    }
    public final float f(float p0){
       if (PatchProxy.isSupport(SlidingTabStrip.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, SlidingTabStrip.class, "31");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return ((p0 * c.c(this.getResources()).density) + 0x3f000000);
    }
    public final void g(){
       SlidingTabStrip te1;
       SlidingTabStrip tSlidingTabS;
       if (PatchProxy.applyVoid(null, this, SlidingTabStrip.class, "41")) {
          return;
       }
       if (this.i1 != null) {
          boolean b = false;
          this.i1 = b;
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
             te1 = this.e1;
             uofloatArray[b] = (float)te1;
             uofloatArray[1] = (float)te1;
             uofloatArray[2] = (float)te1;
             uofloatArray[i2] = (float)te1;
             tSlidingTabS = this.f1;
             uofloatArray[i1] = (float)tSlidingTabS;
             uofloatArray[i] = (float)tSlidingTabS;
             uofloatArray[6] = (float)tSlidingTabS;
             uofloatArray[7] = (float)tSlidingTabS;
             gradientDraw.setCornerRadii(uofloatArray);
             this.setBackground(gradientDraw);
          }else if(background instanceof GradientDrawable){
             float[] uofloatArray1 = new float[i3];
             te1 = this.e1;
             uofloatArray1[b] = (float)te1;
             uofloatArray1[1] = (float)te1;
             uofloatArray1[2] = (float)te1;
             uofloatArray1[i2] = (float)te1;
             tSlidingTabS = this.f1;
             uofloatArray1[i1] = (float)tSlidingTabS;
             uofloatArray1[i] = (float)tSlidingTabS;
             uofloatArray1[6] = (float)tSlidingTabS;
             uofloatArray1[7] = (float)tSlidingTabS;
             background.setCornerRadii(uofloatArray1);
             this.setBackground(background);
          }
       }
       return;
    }
    public int getTabBottomPadding(){
       return this.B;
    }
    public int getTabItemAlignmentMode(){
       return this.h1;
    }
    public int getTabItemViewId(){
       return this.g1;
    }
    public int getTabPadding(){
       Object obj = PatchProxy.apply(null, this, SlidingTabStrip.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getTabPaddingInner();
    }
    public final int getTabPaddingInner(){
       SlidingTabStrip obj = PatchProxy.apply(null, this, SlidingTabStrip.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (this.X0 != null) {
          obj = this.z;
       }else if(this.W0 != null){
          obj = 0;
       }else {
          obj = this.z;
       }
       if (!this.l()) {
          i = obj;
       }
       return i;
    }
    public int getTabTopPadding(){
       return this.A;
    }
    public LinearLayout getTabsContainer(){
       return this.f;
    }
    public final void h(Canvas p0){
       TextView textView;
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidingTabStrip.class, "39")) {
          return;
       }
       if (this.c1.size() <= 0) {
          return;
       }
       int i = 0;
       while (i < this.g) {
          String str = this.c1.get(i);
          if (!TextUtils.isEmpty(str)) {
             Bitmap uBitmap = PatchProxy.applyOneRefs(str, this, SlidingTabStrip.class, "38");
             if (uBitmap != PatchProxyResult.class) {
             }else {
                String str1 = "EMPTY";
                ViewGroup viewGroup = null;
                if (str.equals(str1)) {
                   textView = a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d15a3, viewGroup, 0);
                }else {
                   textView = a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d15a4, viewGroup, 0);
                   textView.setText(str);
                }
                textView.setDrawingCacheEnabled(true);
                if (str.equals(str1)) {
                   int i3 = 0x40000000;
                   textView.measure(View$MeasureSpec.makeMeasureSpec((int)this.f(8.00f), i3), View$MeasureSpec.makeMeasureSpec((int)this.f(8.00f), i3));
                }else {
                   textView.measure(View$MeasureSpec.makeMeasureSpec(0, 0), View$MeasureSpec.makeMeasureSpec(0, 0));
                }
                textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
                uBitmap = Bitmap.createBitmap(textView.getDrawingCache());
                textView.destroyDrawingCache();
             }
             if (uBitmap != null) {
                int width = uBitmap.getWidth();
                int height = uBitmap.getHeight();
                Rect rect = new Rect(0, 0, width, height);
                View childAt = this.f.getChildAt(i);
                int i1 = this.d1.get(i);
                if (i1 == -1 && childAt instanceof TextView) {
                   Object obj = PatchProxy.applyOneRefs(childAt, this, SlidingTabStrip.class, "40");
                   if (obj != PatchProxyResult.class) {
                      i1 = obj.intValue();
                   }else {
                      int i2 = childAt.getWidth() - (int)childAt.getPaint().measureText(childAt.getText().toString());
                      i2 = i2 / 2;
                      i1 = childAt.getRight() - i2;
                   }
                   this.d1.put(i, i1);
                }
                width = width + i1;
                height = height + 10;
                Rect rect1 = new Rect(i1, 10, width, height);
                p0.drawBitmap(uBitmap, rect, rect1, this.k);
             }
          }
          i = i + 1;
       }
       return;
    }
    public ViewGroup$LayoutParams i(View p0){
       LinearLayout$LayoutParams layoutParams;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, SlidingTabStrip.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       if ((double)this.l1 - null && (!this.l() && p0 instanceof TextView)) {
          TextView textView = new TextView(this.getContext());
          textView.setTextSize(0, ((float)this.D * this.l1));
          textView.getPaint().setFakeBoldText(true);
          layoutParams = new LinearLayout$LayoutParams(((int)textView.getPaint().measureText(p0.getText().toString()) + (this.getTabPaddingInner() * 2)), -1);
       }else {
          LinearLayout$LayoutParams layoutParams1 = PatchProxy.apply(null, this, SlidingTabStrip.class, "4");
          if (layoutParams1 != patchProxyRe) {
          }else {
             layoutParams1 = new LinearLayout$LayoutParams(-2, -1);
          }
          layoutParams = layoutParams1;
       }
       return layoutParams;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, SlidingTabStrip.class, "8")) {
          return;
       }
       float f = 0x3f800000;
       int i = 0;
       if (this.g <= this.j1) {
          this.b = (this.h1 == 2)? new LinearLayout$LayoutParams(i, -1, f): new LinearLayout$LayoutParams(-2, -1);
       }else {
          this.b = new LinearLayout$LayoutParams(-2, -1);
       }
       if (this.W != null) {
          this.b = new LinearLayout$LayoutParams(i, -1, f);
       }else {
          SlidingTabStrip tb = this.b;
          LinearLayout$LayoutParams gravity = tb.gravity;
          SlidingTabStrip th1 = this.h1;
          if (th1 == null) {
             gravity = 3;
          }else if(th1 == 1){
             gravity = 17;
          }
          tb.gravity = gravity;
       }
       return;
    }
    public boolean k(){
       return this.V;
    }
    public final boolean l(){
       boolean b = (this.h1 == 2 && this.g <= this.j1)? true: false;
       return b;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, SlidingTabStrip.class, "17")) {
          return;
       }
       if (this.q1 == null) {
          return;
       }
       this.f.removeAllViews();
       this.g = this.q1.getCount();
       SlidingTabStrip tc1 = this.c1;
       if (tc1 == null) {
          this.c1 = new SparseArray();
       }else {
          tc1.clear();
       }
       tc1 = this.d1;
       if (tc1 == null) {
          this.d1 = new SparseIntArray();
       }else {
          tc1.clear();
       }
       this.j();
       boolean b = false;
       int i = 0;
       SlidingTabStrip tg = this.g;
       while (i < tg) {
          this.d1.put(i, -1);
          this.k1.put(i, -1);
          this.a(i, this.q1.b(i));
          i = i + 1;
       }
       if (tg > null) {
          SlidingTabStrip tO = this.O;
          if (tO != null) {
             this.a(tg, tO);
          }
       }
       this.t();
       this.M = b;
       this.p(this.h);
       return;
    }
    public float n(float p0){
       if (PatchProxy.isSupport(SlidingTabStrip.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, SlidingTabStrip.class, "43");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return (p0 + (float)this.getPaddingLeft());
    }
    public void o(int p0,int p1){
       if (PatchProxy.isSupport(SlidingTabStrip.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SlidingTabStrip.class, "28")) {
          return;
       }
       if (this.g == null) {
          return;
       }
       int i = this.f.getChildAt(p0).getLeft() + p1;
       if (p0 > 0 || p1 > 0) {
          i = (this.V0 != null)? (i - (this.getWidth() / 2)) + (this.f.getChildAt(p0).getWidth() / 2): i - this.u;
       }
    label_004b :
       SlidingTabStrip tI = this.I;
       if (i != tI) {
          if (this.s == null) {
             this.I = i;
             this.scrollTo(i, 0);
          }else if(i < tI){
             this.I = i;
             this.J = this.getWidth() + i;
             this.scrollTo(i, 0);
          }else {
             i = (this.f.getChildAt(p0).getRight() - this.getWidth()) + p1;
             if (p0 > 0 || p1 > 0) {
                i = i + this.u;
             }
             if ((this.getWidth() + i) > this.J) {
                this.J = this.getWidth() + i;
                this.I = i;
                this.scrollTo(i, 0);
             }
          }
       }
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidingTabStrip.class, "18")) {
          return;
       }
       if (this.q1 == null) {
          return;
       }
       this.t();
       this.M = false;
       this.post(new SlidingTabStrip$a(this));
       return;
    }
    public void onDraw(Canvas p0){
       SlidingTabStrip h;
       int i4;
       float f3;
       float f5;
       int i = this;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, i, SlidingTabStrip.class, "42")) {
          return;
       }
       super.onDraw(p0);
       if (!this.isInEditMode()) {
          SlidingTabStrip g = i.g;
          if (g != null && i.h < g) {
             this.g();
             View childAt = i.f.getChildAt(i.h);
             float f = i.n((float)childAt.getLeft());
             float f1 = i.n((float)childAt.getRight());
             int scrollX = this.getScrollX();
             int i1 = this.getPaddingLeft() + scrollX;
             scrollX = (scrollX + this.getWidth()) - this.getPaddingRight();
             float f2 = 0x3f800000;
             if (i.i - null > 0) {
                h = i.h;
                if (h < (i.g - 1)) {
                   View childAt1 = i.f.getChildAt((h + 1));
                   SlidingTabStrip i2 = i.i;
                   f = (i.n((float)childAt1.getLeft()) * i2) + ((f2 - i2) * f);
                   f1 = (i.n((float)childAt1.getRight()) * i2) + ((f2 - i2) * f1);
                }
             }
             int height = this.getHeight();
             i.k.setColor(i.n);
             i.l.setEmpty();
             h = i.Q;
             int i3 = 0;
             if (h != null) {
                i4 = (int)(((f1 - f) - (float)h) / 2.00f);
                i.w = i4;
                h = i.i;
                f2 = ((double)h - 0x3fe0000000000000 < 0)? ((float)i4 * h) / 3.00f: ((float)i4 * (f2 - h)) / 3.00f;
                f = (f + (float)i4) - f2;
                f1 = (f1 - (float)i4) + f2;
                f3 = (float)scrollX;
                if (f - f3 <= 0) {
                   f5 = (float)i1;
                   if (f1 - f5 >= 0) {
                      if (f - f5 > 0) {
                         f1 = Math.min(f1, f3);
                      }else if(f1 - f3 < 0){
                         f = Math.max(f, f5);
                      }
                      g = 1;
                   label_00e9 :
                      h = i.U0;
                      i.l.set(f, (float)(((height - i.v) - 1) - h), f1, (float)((height - 1) - h));
                   }
                }
                g = null;
                goto label_00e9 ;
             }else if(i.R != null){
                i.s(childAt);
             }
             g = i.w;
             f = f + (float)g;
             f1 = f1 - (float)g;
             f3 = (float)scrollX;
             if (f - f3 <= 0) {
                f5 = (float)i1;
                if (f1 - f5 >= 0) {
                   if (f - f5 > 0) {
                      f1 = Math.min(f1, f3);
                   }else if(f1 - f3 < 0){
                      f = Math.max(f, f5);
                   }
                   g = 1;
                label_0128 :
                   h = i.U0;
                   i.l.set(f, (float)((height - i.v) - h), f1, (float)(height - h));
                }
             }
             g = null;
             goto label_0128 ;
             SlidingTabStrip l = i.l;
             i.Z0 = l.left;
             i.a1 = l.right;
             if (this.k() && g) {
                g = i.Y0;
                if (g != null) {
                   l = 0xbf800000;
                   if (g.a() - l && i.Y0.b() - l) {
                      RectF rectF = new RectF(i.l);
                      rectF.left = i.Y0.a();
                      rectF.right = i.Y0.b();
                      if (i.b1 != null) {
                         obj.drawRect(rectF, i.k);
                      }else {
                         l = i.P;
                         f1 = (float)l;
                         obj.drawRoundRect(rectF, f1, (float)l, i.k);
                      }
                   }
                }
                if (i.b1 != null) {
                   obj.drawRect(i.l, i.k);
                }else {
                   l = i.P;
                   f1 = (float)l;
                   obj.drawRoundRect(i.l, f1, (float)l, i.k);
                }
             }
             i.k.setColor(i.o);
             p0.drawRect(0, (float)(height - i.x), (float)i.f.getWidth(), (float)height, i.k);
             i.m.setColor(i.p);
             i4 = i.g - 1;
             while (i3 < i4) {
                childAt = i.f.getChildAt(i3);
                i4 = height - i.y;
                float f4 = (float)i4;
                p0.drawLine(i.n((float)childAt.getRight()), (float)i.y, i.n((float)childAt.getRight()), f4, i.m);
                i3 = i3 + 1;
             }
             this.h(p0);
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(SlidingTabStrip.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SlidingTabStrip.class, "30")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, SlidingTabStrip.class, "29") && this.n1 != null) {
          this.setPadding((int)this.f(19.00f), this.getPaddingTop(), (int)this.f(19.00f), this.getPaddingBottom());
       }
       SlidingTabStrip slidingTabSt = (this.h1 == null && (this.p1 == null && this.q == null))? 1: null;
       if (!slidingTabSt && (this.M != null || !View$MeasureSpec.getMode(p0))) {
          super.onMeasure(p0, p1);
          return;
       }else if(this.M == null){
          super.onMeasure(p0, p1);
       }
       int measuredWidt = this.getMeasuredWidth();
       int i1 = 0;
       for (int i = 0; i < this.g; i = i + 1) {
          i1 = i1 + this.f.getChildAt(i).getMeasuredWidth();
       }
       if (i1 > 0 && measuredWidt > 0) {
          this.u = this.f.getChildAt(0).getMeasuredWidth();
          if (i1 <= measuredWidt) {
             this.X0 = false;
             if (this.t != null) {
                measuredWidt = 0;
                while (measuredWidt < this.g) {
                   View childAt = this.f.getChildAt(measuredWidt);
                   ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
                   if (layoutParams == null || layoutParams.width <= null) {
                      if (!measuredWidt) {
                         SlidingTabStrip tb = this.b;
                         LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(tb.width, tb.height);
                         tb = this.b;
                         layoutParams1.gravity = tb.gravity;
                         layoutParams1.weight = tb.weight;
                         layoutParams1.rightMargin = tb.rightMargin;
                         layoutParams1.bottomMargin = tb.bottomMargin;
                         layoutParams1.topMargin = tb.topMargin;
                         layoutParams1.leftMargin = 0;
                         childAt.setLayoutParams(layoutParams1);
                      }else {
                         childAt.setLayoutParams(this.b);
                      }
                      childAt.setPadding(this.getTabPaddingInner(), this.A, this.getTabPaddingInner(), this.B);
                   }
                   measuredWidt = measuredWidt + 1;
                }
             }
          }else {
             this.X0 = true;
          }
          this.M = true;
       }
       super.onMeasure(p0, p1);
       return;
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidingTabStrip.class, "49")) {
          return;
       }
       super.onRestoreInstanceState(p0.getSuperState());
       this.h = p0.b;
       this.requestLayout();
       return;
    }
    public Parcelable onSaveInstanceState(){
       Object obj = PatchProxy.apply(null, this, SlidingTabStrip.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SlidingTabStrip$SavedState savedState = new SlidingTabStrip$SavedState(super.onSaveInstanceState());
       savedState.b = this.h;
       return savedState;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(SlidingTabStrip.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, SlidingTabStrip.class, "51")) {
          return;
       }
       super.onScrollChanged(p0, p1, p2, p3);
       SlidingTabStrip td = this.d;
       _monitor_enter(td);
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          SlidingTabStrip$d uod = iterator.next();
          if (uod != null) {
             uod.a();
          }
       }
       _monitor_exit(td);
       td = this.c;
       if (td != null) {
          td.a();
       }
       return;
    }
    public void p(int p0){
       View childAt;
       if (PatchProxy.isSupport(SlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlidingTabStrip.class, "46")) {
          return;
       }
       if (p0 < this.g && p0 >= 0) {
          SlidingTabStrip tj = this.j;
          if (tj == p0) {
             childAt = this.f.getChildAt(tj);
             if (childAt != null) {
                childAt.setSelected(true);
                this.b(childAt, true);
                this.c(childAt, true);
             }
             this.r();
             return;
          }else {
             View childAt1 = this.f.getChildAt(tj);
             if (childAt1 != null) {
                childAt1.setSelected(false);
                this.b(childAt1, false);
                this.c(childAt1, false);
             }
             this.j = p0;
             childAt = this.f.getChildAt(p0);
             if (childAt != null) {
                childAt.setSelected(true);
                this.b(childAt, true);
                this.c(childAt, true);
             }
             this.r();
          }
       }
       return;
    }
    public void q(int p0,boolean p1){
       if (PatchProxy.isSupport(SlidingTabStrip.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, SlidingTabStrip.class, "26")) {
          return;
       }
       if (p0 < this.g && p0 >= 0) {
          if (this.h == p0) {
             return;
          }else {
             this.h = p0;
             this.o(p0, 0);
             this.p(p0);
             SlidingTabStrip te = this.e;
             if (te != null) {
                te.a(p0, p1);
             }
          }
       }
       return;
    }
    public final void r(){
       if (PatchProxy.applyVoid(null, this, SlidingTabStrip.class, "25")) {
          return;
       }
       SlidingTabStrip to1 = this.o1;
       if (to1 != this.j) {
          View childAt = this.f.getChildAt(to1);
          if (childAt != null) {
             boolean b = false;
             this.b(childAt, b);
             this.c(childAt, b);
          }
          childAt = this.f.getChildAt(this.j);
          if (childAt != null) {
             this.b(childAt, true);
             this.c(childAt, true);
          }
          this.o1 = this.j;
       }
       return;
    }
    public final void s(View p0){
       float f;
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidingTabStrip.class, "44")) {
          return;
       }
       SlidingTabStrip slidingTabSt = null;
       SlidingTabStrip th = this.h;
       if (th < this.g) {
          slidingTabSt = this.f.getChildAt((th + 1));
       }
       if (slidingTabSt == null) {
          slidingTabSt = p0;
       }
       TextPaint textPaint = null;
       if (p0 instanceof TextView) {
          textPaint = this.d(p0, p0.getText(), p0.getPaint());
          f = this.d(slidingTabSt, slidingTabSt.getText(), slidingTabSt.getPaint());
       }else if(p0 instanceof c$a){
          textPaint = this.d(p0, p0.getText(), p0.getTextPaint());
          f = this.d(slidingTabSt, slidingTabSt.getText(), slidingTabSt.getTextPaint());
       }else {
          f = 0;
       }
       this.w = (this.T != null)? (int)(textPaint + ((f - textPaint) * this.i)): (int)(textPaint - ((textPaint - f) * this.i));
       return;
    }
    public void setAverageWidth(boolean p0){
       if (PatchProxy.isSupport(SlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SlidingTabStrip.class, "6")) {
          return;
       }
       this.W = p0;
       this.j();
       this.m();
       return;
    }
    public void setClickOnlyTabStrip(SlidingTabStrip$c p0){
       this.O = p0;
    }
    public void setCurrentPosition(int p0){
       this.h = p0;
    }
    public void setDividerColorInt(int p0){
       this.p = p0;
    }
    public void setDividerPadding(int p0){
       this.y = p0;
    }
    public void setIgnorePaddingWhenCannotScroll(boolean p0){
       this.W0 = p0;
    }
    public void setIndicatorColor(int p0){
       if (PatchProxy.isSupport(SlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlidingTabStrip.class, "5")) {
          return;
       }
       this.n = f.a(this.getResources(), p0, null);
       return;
    }
    public void setIndicatorColorInt(int p0){
       this.n = p0;
    }
    public void setIndicatorForceRect(boolean p0){
       this.b1 = p0;
    }
    public void setIndicatorForceRectAndInvalidate(boolean p0){
       if (PatchProxy.isSupport(SlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SlidingTabStrip.class, "55")) {
          return;
       }
       this.b1 = p0;
       this.invalidate();
       return;
    }
    public void setIndicatorPadding(int p0){
       this.w = p0;
    }
    public void setScrollListener(SlidingTabStrip$d p0){
       this.c = p0;
    }
    public void setScrollSelectedTabToCenter(boolean p0){
       this.V0 = p0;
    }
    public void setSelectListener(SlidingTabStrip$e p0){
       this.e = p0;
    }
    public void setShouldExpand(boolean p0){
       this.q = p0;
    }
    public void setShouldReMeasure(boolean p0){
       this.t = p0;
    }
    public void setStyle(int p0){
       if (PatchProxy.isSupport(SlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlidingTabStrip.class, "54")) {
          return;
       }
       Object[] objArray = null;
       int i = 2;
       int i1 = 1;
       if (!PatchProxy.applyVoid(objArray, this, SlidingTabStrip.class, "52")) {
          DisplayMetrics uDisplayMetr = c.c(this.getResources());
          this.w = 0;
          this.Q = 0;
          this.n = -10066330;
          this.v = (int)TypedValue.applyDimension(i1, 8.00f, uDisplayMetr);
          this.U0 = 0;
          this.R = false;
          this.o = 0x1a000000;
          this.x = (int)TypedValue.applyDimension(i1, 2.00f, uDisplayMetr);
          this.p = 0x1a000000;
          float f = 12.00f;
          this.y = (int)TypedValue.applyDimension(i1, f, uDisplayMetr);
          this.A = 0;
          this.B = 0;
          this.D = (int)TypedValue.applyDimension(i, f, uDisplayMetr);
          this.E = objArray;
          this.h1 = 0;
          this.o1 = 0;
          this.l1 = 0;
       }
       TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, SlidingTabStrip.s1);
       this.D = typedArray.getDimensionPixelSize(0, 0);
       this.E = typedArray.getColorStateList(i1);
       this.N = typedArray.getInt(i, this.N);
       ColorStateList colorStateLi = typedArray.getColorStateList(3);
       i = typedArray.getLayoutDimension(4, -1);
       int layoutDimens = typedArray.getLayoutDimension(5, -2);
       typedArray.recycle();
       this.i1 = i1;
       TypedArray typedArray1 = this.getContext().obtainStyledAttributes(p0, c$b.O3);
       this.e(typedArray1, 0);
       typedArray1.recycle();
       this.setBackgroundTintList(colorStateLi);
       this.setLayoutParams(new LinearLayout$LayoutParams(i, layoutDimens));
       this.m();
       return;
    }
    public void setTabBottomPadding(int p0){
       if (PatchProxy.isSupport(SlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlidingTabStrip.class, "22")) {
          return;
       }
       if (this.B != p0) {
          this.M = false;
          this.B = p0;
          this.requestLayout();
       }
       return;
    }
    public void setTabGravity(int p0){
       if (PatchProxy.isSupport(SlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlidingTabStrip.class, "16")) {
          return;
       }
       this.N = p0;
       this.f.setGravity(p0);
       return;
    }
    public void setTabIndicatorInterceptor(c p0){
       this.Y0 = p0;
    }
    public void setTabItemAlignmentMode(int p0){
       if (PatchProxy.isSupport(SlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlidingTabStrip.class, "7")) {
          return;
       }
       this.h1 = p0;
       this.j();
       this.m();
       return;
    }
    public void setTabItemViewId(int p0){
       this.g1 = p0;
    }
    public void setTabLayoutParams(LinearLayout$LayoutParams p0){
       this.b = p0;
       this.p1 = true;
    }
    public void setTabPadding(int p0){
       if (PatchProxy.isSupport(SlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlidingTabStrip.class, "21")) {
          return;
       }
       if (this.z != p0) {
          this.M = false;
          this.z = p0;
          this.requestLayout();
       }
       return;
    }
    public void setTabProvider(SlidingTabStrip$c$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidingTabStrip.class, "15")) {
          return;
       }
       this.q1 = p0;
       this.m();
       return;
    }
    public void setTabTextSize(int p0){
       if (PatchProxy.isSupport(SlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlidingTabStrip.class, "14")) {
          return;
       }
       this.D = p0;
       this.t();
       return;
    }
    public void setTabTopPadding(int p0){
       if (PatchProxy.isSupport(SlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlidingTabStrip.class, "23")) {
          return;
       }
       if (this.A != p0) {
          this.M = false;
          this.A = p0;
          this.requestLayout();
       }
       return;
    }
    public void setTabTypefaceStyle(int p0){
       if (PatchProxy.isSupport(SlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlidingTabStrip.class, "12")) {
          return;
       }
       this.G = p0;
       this.H = p0;
       this.t();
       return;
    }
    public void setTextColor(int p0){
       if (PatchProxy.isSupport(SlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlidingTabStrip.class, "11")) {
          return;
       }
       this.E = f.b(this.getResources(), p0, null);
       this.t();
       return;
    }
    public void setUnderlineColorInt(int p0){
       this.o = p0;
    }
    public void setUnderlineHeight(int p0){
       this.x = p0;
    }
    public final void t(){
       View view;
       boolean b;
       SlidingTabStrip tH;
       if (PatchProxy.applyVoid(null, this, SlidingTabStrip.class, "27")) {
          return;
       }
       if (this.q1 == null) {
          return;
       }
       int i = 0;
       while (i < this.f.getChildCount()) {
          View childAt = this.f.getChildAt(i);
          childAt.setBackgroundResource(this.K);
          childAt.setPadding(this.getTabPaddingInner(), this.A, this.getTabPaddingInner(), this.B);
          if (childAt instanceof TextView) {
             view = childAt;
          }else {
             int i1 = 0x7f0a3caa;
             try{
                view = childAt.findViewById(i1);
             }catch(java.lang.Exception e0){
                view = null;
             }
          }
          i = i + 1;
       }
       return;
    }
}
