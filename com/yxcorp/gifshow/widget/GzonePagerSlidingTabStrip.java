package com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip$d;
import android.graphics.RectF;
import android.graphics.Rect;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip$a;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import ll8.c$b;
import com.yxcorp.utility.n;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.widget.LinearLayout$LayoutParams;
import android.content.res.Configuration;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.TextPaint;
import com.yxcorp.gifshow.widget.c$a;
import android.graphics.Typeface;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Integer;
import androidx.viewpager.widget.ViewPager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.widget.c;
import java.lang.Boolean;
import h3.a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d$b;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip$e;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip$f;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip$g;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip$b;
import java.lang.Runnable;
import android.view.ViewGroup;
import android.graphics.Canvas;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip$c;
import android.graphics.drawable.Drawable;
import android.view.View$MeasureSpec;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$e;
import android.content.res.Resources$Theme;
import o1.f;
import androidx.viewpager.widget.ViewPager$i;
import tyc.r1;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.lang.RuntimeException;

public class GzonePagerSlidingTabStrip extends PagerSlidingTabStrip	// class@00185e
{
    public ViewPager$i A1;
    public boolean A2;
    public LinearLayout B1;
    public GzonePagerSlidingTabStrip$f B2;
    public ViewPager C1;
    public GzonePagerSlidingTabStrip$g C2;
    public int D1;
    public final Runnable D2;
    public int E1;
    public float F1;
    public int G1;
    public int H1;
    public Paint I1;
    public Paint J1;
    public int K1;
    public int L1;
    public int M1;
    public boolean N1;
    public boolean O1;
    public boolean P1;
    public int Q1;
    public int R1;
    public int S1;
    public int T1;
    public int U1;
    public int V1;
    public int W1;
    public int X1;
    public int Y1;
    public int Z1;
    public ColorStateList a2;
    public Typeface b2;
    public int c2;
    public int d2;
    public int e2;
    public int f2;
    public int g2;
    public Locale h2;
    public boolean i2;
    public int j2;
    public GzonePagerSlidingTabStrip$e k2;
    public int l2;
    public int m2;
    public boolean n2;
    public int o2;
    public boolean p2;
    public c q2;
    public boolean r2;
    public boolean s2;
    public int t2;
    public boolean u2;
    public RectF v2;
    public LinearLayout$LayoutParams w1;
    public Rect w2;
    public LinearLayout$LayoutParams x1;
    public float x2;
    public final GzonePagerSlidingTabStrip$d y1;
    public Drawable y2;
    public PagerSlidingTabStrip$e z1;
    public boolean z2;
    public static final int[] E2;

    static {
       GzonePagerSlidingTabStrip.E2 = new int[3]{0x1010095,0x1010098,0x10100af};
    }
    public void GzonePagerSlidingTabStrip(Context p0){
       super(p0, null);
    }
    public void GzonePagerSlidingTabStrip(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void GzonePagerSlidingTabStrip(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.y1 = new GzonePagerSlidingTabStrip$d(this);
       this.E1 = 0;
       this.F1 = 0;
       this.G1 = -1;
       this.H1 = 0;
       this.K1 = -10066330;
       this.L1 = 0x1a000000;
       this.M1 = 0x1a000000;
       this.N1 = false;
       this.O1 = false;
       this.P1 = false;
       this.Q1 = 52;
       this.R1 = 8;
       this.S1 = 0;
       this.T1 = 2;
       this.U1 = 12;
       this.V1 = 24;
       this.W1 = -1;
       this.X1 = -1;
       this.Y1 = 1;
       this.Z1 = 12;
       this.b2 = null;
       this.c2 = 1;
       this.d2 = 1;
       this.e2 = 0;
       this.f2 = 0;
       this.j2 = 0;
       this.q2 = null;
       this.r2 = true;
       this.s2 = true;
       this.v2 = new RectF();
       this.w2 = new Rect();
       this.x2 = 0x3f800000;
       this.D2 = new GzonePagerSlidingTabStrip$a(this);
       this.removeAllViews();
       this.setFillViewport(1);
       this.setWillNotDraw(0);
       LinearLayout linearLayout = new LinearLayout(p0);
       this.B1 = linearLayout;
       linearLayout.setOrientation(0);
       this.B1.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       this.B1.setGravity(this.j2);
       this.B1.setClipChildren(0);
       this.B1.setClipToPadding(0);
       this.addView(this.B1);
       DisplayMetrics uDisplayMetr = c.c(this.getResources());
       this.Q1 = (int)TypedValue.applyDimension(1, (float)this.Q1, uDisplayMetr);
       this.R1 = (int)TypedValue.applyDimension(1, (float)this.R1, uDisplayMetr);
       this.T1 = (int)TypedValue.applyDimension(1, (float)this.T1, uDisplayMetr);
       this.U1 = (int)TypedValue.applyDimension(1, (float)this.U1, uDisplayMetr);
       this.V1 = (int)TypedValue.applyDimension(1, (float)this.V1, uDisplayMetr);
       this.Y1 = (int)TypedValue.applyDimension(1, (float)this.Y1, uDisplayMetr);
       this.Z1 = (int)TypedValue.applyDimension(2, (float)this.Z1, uDisplayMetr);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, GzonePagerSlidingTabStrip.E2);
       this.Z1 = typedArray.getDimensionPixelSize(0, this.Z1);
       this.a2 = typedArray.getColorStateList(1);
       this.j2 = typedArray.getInt(2, this.j2);
       typedArray.recycle();
       TypedArray typedArray1 = p0.obtainStyledAttributes(p1, c$b.O3);
       this.K1 = typedArray1.getColor(13, this.K1);
       this.L1 = typedArray1.getColor(35, this.L1);
       this.M1 = typedArray1.getColor(8, this.M1);
       this.R1 = typedArray1.getDimensionPixelSize(15, this.R1);
       this.T1 = typedArray1.getDimensionPixelSize(36, this.T1);
       this.U1 = typedArray1.getDimensionPixelSize(9, this.U1);
       this.V1 = typedArray1.getDimensionPixelSize(33, this.V1);
       this.g2 = typedArray1.getResourceId(31, this.g2);
       this.N1 = typedArray1.getBoolean(29, this.N1);
       this.Q1 = typedArray1.getDimensionPixelSize(25, this.Q1);
       this.O1 = typedArray1.getBoolean(34, this.O1);
       this.S1 = typedArray1.getDimensionPixelSize(17, 0);
       this.P1 = typedArray1.getBoolean(30, this.P1);
       this.m2 = typedArray1.getDimensionPixelSize(22, 0);
       this.n2 = typedArray1.getBoolean(23, 0);
       this.t2 = typedArray1.getDimensionPixelSize(16, 0);
       this.s2 = typedArray1.getBoolean(3, 1);
       this.u2 = typedArray1.getBoolean(26, 0);
       this.l2 = typedArray1.getDimensionPixelSize(14, n.c(this.getContext(), 15.00f));
       typedArray1.recycle();
       Paint paint = new Paint();
       this.I1 = paint;
       paint.setAntiAlias(1);
       this.I1.setStyle(Paint$Style.FILL);
       paint = new Paint();
       this.J1 = paint;
       paint.setAntiAlias(1);
       this.J1.setStrokeWidth((float)this.Y1);
       this.w1 = (this.s2 != null)? new LinearLayout$LayoutParams(0, -1, 0x3f800000): new LinearLayout$LayoutParams(-2, -1);
       if (this.h2 == null) {
          this.h2 = this.getResources().getConfiguration().locale;
       }
       return;
    }
    private void C(View p0){
       float f;
       if (PatchProxy.applyVoidOneRefs(p0, this, GzonePagerSlidingTabStrip.class, "25")) {
          return;
       }
       GzonePagerSlidingTabStrip gzonePagerSl = null;
       GzonePagerSlidingTabStrip tE1 = this.E1;
       if (tE1 < this.D1) {
          gzonePagerSl = this.B1.getChildAt((tE1 + 1));
       }
       if (gzonePagerSl == null) {
          gzonePagerSl = p0;
       }
       TextPaint textPaint = null;
       if (p0 instanceof TextView) {
          textPaint = this.e(p0, p0.getText(), p0.getPaint());
          f = this.e(gzonePagerSl, gzonePagerSl.getText(), gzonePagerSl.getPaint());
       }else if(p0 instanceof c$a){
          textPaint = this.e(p0, p0.getText(), p0.getTextPaint());
          f = this.e(gzonePagerSl, gzonePagerSl.getText(), gzonePagerSl.getTextPaint());
       }else {
          f = 0;
       }
       this.S1 = (this.p2 != null)? (int)(textPaint + ((f - textPaint) * this.F1)): (int)(textPaint - ((textPaint - f) * this.F1));
       return;
    }
    private void D(){
       if (PatchProxy.applyVoid(null, this, GzonePagerSlidingTabStrip.class, "16")) {
          return;
       }
       int childCount = this.B1.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = this.B1.getChildAt(i);
          if (childAt.getLayoutParams() == null || childAt.getLayoutParams().width < null) {
             childAt.setLayoutParams(this.k());
          }
          childAt.setBackgroundResource(this.g2);
          boolean b = true;
          boolean b1 = (!i)? true: false;
          i = i + 1;
          boolean b2 = (i == childCount)? true: false;
          this.G(childAt, b1, b2);
          TextView textView = this.I(childAt);
          if (textView != null) {
             textView.setTextSize(0, (float)this.Z1);
             if (childAt.isSelected()) {
                textView.setTypeface(null, this.d2);
             }else {
                textView.setTypeface(this.b2, this.c2);
             }
             GzonePagerSlidingTabStrip ta2 = this.a2;
             if (ta2 != null) {
                textView.setTextColor(ta2);
             }
             if (this.O1 != null) {
                textView.setAllCaps(b);
             }
          }
       }
       return;
    }
    public static void E(GzonePagerSlidingTabStrip p0){
       p0.D();
    }
    private void b(int p0,PagerSlidingTabStrip$d p1){
       if (PatchProxy.isSupport(GzonePagerSlidingTabStrip.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, GzonePagerSlidingTabStrip.class, "14")) {
          return;
       }
       View view = p1.a(this.getContext(), p0, this.C1);
       boolean b = false;
       view.setSelected(b);
       TextView textView = this.I(view);
       if (textView != null) {
          textView.setTextSize(b, (float)this.Z1);
       }
       this.B1.addView(view, p0);
       return;
    }
    private float e(View p0,CharSequence p1,TextPaint p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, GzonePagerSlidingTabStrip.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (this.q2 == null) {
          this.q2 = new c();
       }
       return (((float)p0.getWidth() - this.q2.c(p1, p2, (float)this.Z1)) / 2.00f);
    }
    public void A(int p0,int p1){
       if (PatchProxy.isSupport(GzonePagerSlidingTabStrip.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, GzonePagerSlidingTabStrip.class, "7")) {
          return;
       }
       this.c2 = p0;
       this.d2 = p1;
       this.D();
       return;
    }
    public final void F(RectF p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GzonePagerSlidingTabStrip.class, "22")) {
          return;
       }
       if (p0.left - (float)(this.getPaddingLeft() + this.getScrollX()) < 0) {
          p0.left = (float)(this.getPaddingLeft() + this.getScrollX());
       }
       if (p0.right - (float)((this.getWidth() + this.getScrollX()) - this.getPaddingRight()) > 0) {
          p0.right = (float)((this.getWidth() + this.getScrollX()) - this.getPaddingRight());
       }
       RectF left = p0.left;
       if (p0.right - left < 0) {
          p0.right = left;
       }
       return;
    }
    public final void G(View p0,boolean p1,boolean p2){
       GzonePagerSlidingTabStrip tW1;
       GzonePagerSlidingTabStrip tX1;
       if (PatchProxy.isSupport(GzonePagerSlidingTabStrip.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, GzonePagerSlidingTabStrip.class, "17")) {
          return;
       }
       if (p1) {
          tW1 = this.W1;
          if (tW1 >= null) {
          label_0026 :
             if (p2) {
                tX1 = this.X1;
                if (tX1 >= null) {
                label_002f :
                   p0.setPadding(tW1, 0, tX1, 0);
                   return;
                }
             }
             tX1 = this.V1;
             goto label_002f ;
          }
       }
       tW1 = this.V1;
       goto label_0026 ;
    }
    public final void H(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, GzonePagerSlidingTabStrip.class, "30")) {
          return;
       }
       if (this.B2 == null || (this.C1.getAdapter() != null && this.C1.getAdapter() instanceof PagerSlidingTabStrip$d$b)) {
          int childCount = this.B1.getChildCount();
          int i = 0;
          while (i < childCount) {
             PagerSlidingTabStrip$d uod = this.C1.getAdapter().b(i);
             if (uod instanceof GzonePagerSlidingTabStrip$e && uod.j == null) {
                View childAt = this.B1.getChildAt(i);
                Rect obj = PatchProxy.applyOneRefs(childAt, this, GzonePagerSlidingTabStrip.class, "31");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else {
                   obj = new Rect();
                   childAt.getLocalVisibleRect(obj);
                   b = (obj.width() == childAt.getWidth())? true: false;
                }
                if (b) {
                   this.B2.a(i);
                   uod.j = true;
                }
             }
          label_007b :
             i = i + 1;
          }
       }
       return;
    }
    public final TextView I(View p0){
       TextView obj = PatchProxy.applyOneRefs(p0, this, GzonePagerSlidingTabStrip.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof TextView) {
          obj = p0;
       }else {
          int i = 0x7f0a3caa;
          try{
             obj = p0.findViewById(i);
          }catch(java.lang.Exception e0){
          }
       }
       return obj;
    }
    public void J(){
       if (PatchProxy.applyVoid(null, this, GzonePagerSlidingTabStrip.class, "35")) {
          return;
       }
       this.L();
       return;
    }
    public void K(){
       if (PatchProxy.applyVoid(null, this, GzonePagerSlidingTabStrip.class, "32")) {
          return;
       }
       this.H();
       return;
    }
    public final void L(){
       if (PatchProxy.applyVoid(null, this, GzonePagerSlidingTabStrip.class, "33")) {
          return;
       }
       if (this.A2 != null && this.getTabsContainer().getChildCount() > 0) {
          View childAt = this.getTabsContainer().getChildAt(0);
          childAt.setPadding(0, childAt.getPaddingTop(), childAt.getPaddingRight(), childAt.getPaddingBottom());
       }
       return;
    }
    public void M(boolean p0,boolean p1,int p2){
       if (PatchProxy.isSupport(GzonePagerSlidingTabStrip.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), this, GzonePagerSlidingTabStrip.class, "37")) {
          return;
       }
       if (p0) {
          GzonePagerSlidingTabStrip$g og = new GzonePagerSlidingTabStrip$g(this, p0, p1, p2, null);
          this.C2 = v0;
       }else {
          this.C2 = null;
       }
       this.setIsAverageWidth(false);
       this.setTabPadding(p2);
       return;
    }
    public GzonePagerSlidingTabStrip N(boolean p0){
       this.r2 = p0;
       return this;
    }
    public void O(int p0,int p1){
       if (PatchProxy.isSupport(GzonePagerSlidingTabStrip.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, GzonePagerSlidingTabStrip.class, "13")) {
          return;
       }
       if (this.W1 != p0 || this.X1 != p1) {
          this.W1 = p0;
          this.X1 = p1;
          this.requestLayout();
       }
       return;
    }
    public float getLeftFadingEdgeStrength(){
       Object obj = PatchProxy.apply(null, this, GzonePagerSlidingTabStrip.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (this.z2 != null) {
          return 0;
       }
       return super.getLeftFadingEdgeStrength();
    }
    public int getTabPadding(){
       return this.V1;
    }
    public LinearLayout getTabsContainer(){
       return this.B1;
    }
    public ViewGroup$LayoutParams k(){
       Object obj = PatchProxy.apply(null, this, GzonePagerSlidingTabStrip.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LinearLayout$LayoutParams(-2, -1);
    }
    public boolean n(){
       return this.r2;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GzonePagerSlidingTabStrip.class, "11")) {
          return;
       }
       this.D();
       this.i2 = false;
       this.post(new GzonePagerSlidingTabStrip$b(this));
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, GzonePagerSlidingTabStrip.class, "20")) {
          return;
       }
       super.onDetachedFromWindow();
       this.removeCallbacks(this.D2);
       return;
    }
    public void onDraw(Canvas p0){
       GzonePagerSlidingTabStrip tF1;
       View view1;
       int textLeftMarg;
       int paddingLeft;
       if (PatchProxy.applyVoidOneRefs(p0, this, GzonePagerSlidingTabStrip.class, "21")) {
          return;
       }
       if (!this.isInEditMode()) {
          GzonePagerSlidingTabStrip tD1 = this.D1;
          if (tD1 != null) {
             GzonePagerSlidingTabStrip tE1 = this.E1;
             if (tE1 < tD1) {
                View childAt = this.B1.getChildAt(tE1);
                float f = (float)childAt.getLeft();
                float f1 = (float)childAt.getRight();
                float f2 = 2.00f;
                float f3 = ((f + f1) / f2) + (float)this.getPaddingLeft();
                View view = null;
                float f4 = 0x3f800000;
                if (this.F1 - null > 0) {
                   GzonePagerSlidingTabStrip tE11 = this.E1;
                   if (tE11 < (this.D1 - 1)) {
                      view = this.B1.getChildAt((tE11 + 1));
                      tF1 = this.F1;
                      f = ((float)view.getLeft() * tF1) + ((f4 - tF1) * f);
                      f1 = ((float)view.getRight() * tF1) + ((f4 - tF1) * f1);
                      f3 = ((f + f1) / f2) + (float)this.getPaddingLeft();
                   }
                }
                int height = this.getHeight();
                this.I1.setColor(this.K1);
                tF1 = this.m2;
                if (tF1 != null) {
                   tE1 = this.F1;
                   f1 = 3.00f;
                   f4 = ((double)tE1 - 0x3fe0000000000000 < 0)? ((this.x2 * (float)tF1) * tE1) / f1: ((this.x2 * (float)tF1) * (f4 - tE1)) / f1;
                   if (this.p2 != null && view instanceof GzonePagerSlidingTabStrip$c) {
                      view1 = view;
                      f3 = f3 - ((float)view1.a() / f2);
                      textLeftMarg = view1.getTextLeftMargin();
                   }else if(childAt instanceof GzonePagerSlidingTabStrip$c){
                      view1 = childAt;
                      f3 = f3 - ((float)view1.a() / f2);
                      textLeftMarg = view1.getTextLeftMargin();
                   }else if(this.p2 != null && view instanceof TextView){
                      f3 = f3 - ((float)view.getPaddingRight() / f2);
                      paddingLeft = view.getPaddingLeft();
                   }else if(childAt instanceof TextView){
                      f3 = f3 - ((float)childAt.getPaddingRight() / f2);
                      paddingLeft = childAt.getPaddingLeft();
                   }else {
                   label_00f4 :
                      tE1 = this.m2;
                      tF1 = this.t2;
                      this.v2.set(((f3 - ((float)tE1 / f2)) - f4), (float)(((height - this.R1) - 1) - tF1), ((f3 + ((float)tE1 / f2)) + f4), (float)((height - 1) - tF1));
                   }
                   f3 = f3 + ((float)paddingLeft / f2);
                   goto label_00f4 ;
                   f3 = f3 + ((float)textLeftMarg / f2);
                   goto label_00ce ;
                }else if(this.n2 != null){
                   this.C(childAt);
                }
                GzonePagerSlidingTabStrip tS1 = this.S1;
                GzonePagerSlidingTabStrip tt2 = this.t2;
                this.v2.set((f + (float)tS1), (float)((height - this.R1) - tt2), (f1 - (float)tS1), (float)(height - tt2));
                if (this.n()) {
                   if (this.y2 != null) {
                      tE1 = this.v2;
                      this.w2.set((int)tE1.left, (int)tE1.top, (int)tE1.right, (int)tE1.bottom);
                      this.y2.setBounds(this.w2);
                      this.y2.draw(p0);
                   }else {
                      this.F(this.v2);
                      tE1 = this.l2;
                      f1 = (float)tE1;
                      p0.drawRoundRect(this.v2, f1, (float)tE1, this.I1);
                   }
                }
                this.I1.setColor(this.L1);
                p0.drawRect(0, (float)(height - this.T1), (float)this.B1.getWidth(), (float)height, this.I1);
                this.J1.setColor(this.M1);
                paddingLeft = 0;
                textLeftMarg = this.D1 - 1;
                while (paddingLeft < textLeftMarg) {
                   view1 = this.B1.getChildAt(paddingLeft);
                   textLeftMarg = height - this.U1;
                   p0.drawLine((float)view1.getRight(), (float)this.U1, (float)view1.getRight(), (float)textLeftMarg, this.J1);
                   paddingLeft = paddingLeft + 1;
                }
             }
          }
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(GzonePagerSlidingTabStrip.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, GzonePagerSlidingTabStrip.class, "38")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       GzonePagerSlidingTabStrip tC2 = this.C2;
       if (tC2 != null) {
          tC2.a((p3 - p1));
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       GzonePagerSlidingTabStrip tw1;
       if (PatchProxy.isSupport(GzonePagerSlidingTabStrip.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, GzonePagerSlidingTabStrip.class, "19")) {
          return;
       }
       if (this.N1 != null && (this.i2 != null || !View$MeasureSpec.getMode(p0))) {
          super.onMeasure(p0, p1);
          return;
       }else if(this.i2 == null){
          super.onMeasure(p0, p1);
       }
       int measuredWidt = this.getMeasuredWidth();
       GzonePagerSlidingTabStrip tC2 = this.C2;
       if (tC2 != null) {
          tC2.a(measuredWidt);
       }
       int i1 = 0;
       for (int i = 0; i < this.D1; i = i + 1) {
          i1 = i1 + this.B1.getChildAt(i).getMeasuredWidth();
       }
       if (i1 > 0 && measuredWidt > 0) {
          this.Q1 = this.B1.getChildAt(0).getMeasuredWidth();
          if (i1 <= measuredWidt || this.s2 == null) {
             measuredWidt = 0;
             while (measuredWidt < this.D1) {
                View childAt = this.B1.getChildAt(measuredWidt);
                if (!measuredWidt) {
                   if (this.x1 == null) {
                      tw1 = this.w1;
                      this.x1 = new LinearLayout$LayoutParams(tw1.width, tw1.height);
                   }
                   GzonePagerSlidingTabStrip tx1 = this.x1;
                   tw1 = this.w1;
                   tx1.width = tw1.width;
                   tx1.height = tw1.height;
                   tx1.gravity = tw1.gravity;
                   tx1.weight = tw1.weight;
                   tx1.rightMargin = tw1.rightMargin;
                   tx1.bottomMargin = tw1.bottomMargin;
                   tx1.topMargin = tw1.topMargin;
                   tx1.leftMargin = 0;
                   childAt.setLayoutParams(tx1);
                }else {
                   childAt.setLayoutParams(this.w1);
                }
                boolean b = (!measuredWidt)? true: false;
                measuredWidt = measuredWidt + 1;
                boolean b1 = (measuredWidt == this.D1)? true: false;
                this.G(childAt, b, b1);
             }
          }
          this.i2 = true;
       }
       super.onMeasure(p0, p1);
       return;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(GzonePagerSlidingTabStrip.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, GzonePagerSlidingTabStrip.class, "36")) {
          return;
       }
       super.onScrollChanged(p0, p1, p2, p3);
       GzonePagerSlidingTabStrip tz1 = this.z1;
       if (tz1 != null) {
          tz1.a();
       }
       this.H();
       return;
    }
    public void q(){
       GzonePagerSlidingTabStrip tk2;
       if (PatchProxy.applyVoid(null, this, GzonePagerSlidingTabStrip.class, "10")) {
          return;
       }
       GzonePagerSlidingTabStrip tC1 = this.C1;
       if (tC1 != null && tC1.getAdapter() != null) {
          this.G1 = -1;
          this.B1.removeAllViews();
          this.D1 = this.C1.getAdapter().j();
          boolean b = false;
          int i = 0;
          GzonePagerSlidingTabStrip tD1 = this.D1;
          while (i < tD1) {
             if (this.C1.getAdapter() instanceof PagerSlidingTabStrip$d$b) {
                this.b(i, this.C1.getAdapter().b(i));
             }else {
                this.b(i, new GzonePagerSlidingTabStrip$e(Integer.toString(i), this.C1.getAdapter().l(i)));
             }
             i = i + 1;
          }
          if (tD1 > null) {
             tk2 = this.k2;
             if (tk2 != null) {
                this.b(tD1, tk2);
             }
          }
          tk2 = this.C2;
          if (tk2 != null) {
             tk2.b(this.getWidth());
          }
          this.D();
          this.i2 = b;
          this.u(this.C1.getCurrentItem());
          this.L();
          this.postInvalidate();
       }
       return;
    }
    public void setClickOnlyTabStrip(GzonePagerSlidingTabStrip$e p0){
       this.k2 = p0;
    }
    public void setDisableLeftFadingEdge(boolean p0){
       this.z2 = p0;
    }
    public void setIndicatorColor(int p0){
       if (PatchProxy.isSupport(GzonePagerSlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GzonePagerSlidingTabStrip.class, "2")) {
          return;
       }
       this.K1 = f.a(this.getResources(), p0, null);
       return;
    }
    public void setIndicatorColorInt(int p0){
       this.K1 = p0;
    }
    public void setIndicatorDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GzonePagerSlidingTabStrip.class, "5")) {
          return;
       }
       this.y2 = p0;
       this.invalidate();
       return;
    }
    public void setIndicatorPadding(int p0){
       this.S1 = p0;
    }
    public void setIndicatorWidthMaxScale(float p0){
       this.x2 = p0;
    }
    public void setIsAverageWidth(boolean p0){
       if (PatchProxy.isSupport(GzonePagerSlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GzonePagerSlidingTabStrip.class, "28")) {
          return;
       }
       if (this.s2 == p0) {
          return;
       }
       this.s2 = p0;
       this.w1 = (p0)? new LinearLayout$LayoutParams(0, -1, 0x3f800000): new LinearLayout$LayoutParams(-2, -1);
       this.x1 = null;
       this.i2 = false;
       this.B1.requestLayout();
       return;
    }
    public void setOnChildShowListener(GzonePagerSlidingTabStrip$f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GzonePagerSlidingTabStrip.class, "29")) {
          return;
       }
       this.B2 = p0;
       this.H();
       return;
    }
    public void setOnPageChangeListener(ViewPager$i p0){
       this.A1 = p0;
    }
    public void setRemoveFirstTabLeftPadding(boolean p0){
       this.A2 = p0;
    }
    public void setScrollListener(PagerSlidingTabStrip$e p0){
       this.z1 = p0;
    }
    public void setScrollSelectedTabToCenter(boolean p0){
       this.u2 = p0;
    }
    public void setTabGravity(int p0){
       if (PatchProxy.isSupport(GzonePagerSlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GzonePagerSlidingTabStrip.class, "9")) {
          return;
       }
       this.j2 = p0;
       this.B1.setGravity(p0);
       return;
    }
    public void setTabLayoutParams(LinearLayout$LayoutParams p0){
       this.w1 = p0;
    }
    public void setTabPadding(int p0){
       if (PatchProxy.isSupport(GzonePagerSlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GzonePagerSlidingTabStrip.class, "12")) {
          return;
       }
       if (this.V1 != p0) {
          this.V1 = p0;
          if (this.isInLayout()) {
             this.post(new r1(this));
          }else {
             this.D();
          }
       }
       return;
    }
    public void setTabTypefaceStyle(int p0){
       if (PatchProxy.isSupport(GzonePagerSlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GzonePagerSlidingTabStrip.class, "6")) {
          return;
       }
       this.c2 = p0;
       this.d2 = p0;
       this.D();
       return;
    }
    public void setTextColor(int p0){
       if (PatchProxy.isSupport(GzonePagerSlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GzonePagerSlidingTabStrip.class, "3")) {
          return;
       }
       this.a2 = f.b(this.getResources(), p0, null);
       this.D();
       return;
    }
    public void setTextColor(ColorStateList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GzonePagerSlidingTabStrip.class, "4")) {
          return;
       }
       this.a2 = p0;
       this.D();
       return;
    }
    public void setViewPager(ViewPager p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GzonePagerSlidingTabStrip.class, "8")) {
          return;
       }
       this.C1 = p0;
       if (p0.getAdapter() == null) {
          throw new IllegalStateException("ViewPager does not have adapter instance.");
       }
       this.H1 = 0;
       p0.setOnPageChangeListener(this.y1);
       this.q();
       return;
    }
    public void t(int p0,int p1){
       if (PatchProxy.isSupport(GzonePagerSlidingTabStrip.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, GzonePagerSlidingTabStrip.class, "18")) {
          return;
       }
       if (this.D1 == null || this.C1.getAdapter() == null) {
          return;
       }
       View childAt = this.B1.getChildAt(p0);
       if (childAt == null || this.B1.getChildCount() != this.C1.getAdapter().j()) {
          Log.b("GzonePagerSlidingTabStr", "scrollToChild: null "+p0);
          this.q();
          childAt = this.B1.getChildAt(p0);
       }
       if (childAt != null) {
          this.removeCallbacks(this.D2);
          if (p0 > 0 && (p0 < this.B1.getChildCount() && !this.B1.getChildAt(p0).getLeft())) {
             this.post(this.D2);
             return;
          }else {
             int i = this.B1.getChildAt(p0).getLeft() + p1;
             if (p0 > 0 || p1 > 0) {
                i = (this.u2 != null)? (i - (this.getWidth() / 2)) + (this.B1.getChildAt(p0).getWidth() / 2): i - this.Q1;
             }
          label_00b0 :
             GzonePagerSlidingTabStrip te2 = this.e2;
             if (i != te2) {
                if (this.P1 == null) {
                   this.e2 = i;
                   this.scrollTo(i, 0);
                }else if(i < te2){
                   this.e2 = i;
                   this.f2 = this.getWidth() + i;
                   this.scrollTo(i, 0);
                }else {
                   i = (this.B1.getChildAt(p0).getRight() - this.getWidth()) + p1;
                   if (p0 > 0 || p1 > 0) {
                      i = i + this.Q1;
                   }
                   if ((this.getWidth() + i) > this.f2) {
                      this.f2 = this.getWidth() + i;
                      this.e2 = i;
                      this.scrollTo(i, 0);
                   }
                }
             }
             return;
          }
       }else {
          this.q();
          throw new RuntimeException("position:"+p0+"is unable,childCount="+this.B1.getChildCount());
       }
    }
    public void u(int p0){
       if (PatchProxy.isSupport(GzonePagerSlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GzonePagerSlidingTabStrip.class, "27")) {
          return;
       }
       GzonePagerSlidingTabStrip tG1 = this.G1;
       if (tG1 == p0) {
          return;
       }
       if (p0 < this.D1 && p0 >= 0) {
          View childAt = this.B1.getChildAt(tG1);
          if (childAt != null) {
             childAt.setSelected(false);
          }
          this.G1 = p0;
          View childAt1 = this.B1.getChildAt(p0);
          if (childAt1 != null) {
             childAt1.setSelected(true);
          }
          this.D();
       }
       return;
    }
    public PagerSlidingTabStrip v(boolean p0){
       this.N(p0);
       return this;
    }
    public PagerSlidingTabStrip w(int p0){
       this.R1 = p0;
       return this;
    }
    public PagerSlidingTabStrip y(int p0){
       this.m2 = p0;
       return this;
    }
}
