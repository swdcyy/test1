package com.kuaishou.pagedy.container.widget.DynamicTabLayout;
import android.widget.HorizontalScrollView;
import android.content.Context;
import android.util.AttributeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kuaishou.pagedy.container.widget.DynamicTabLayout$a;
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
import android.graphics.RectF;
import android.content.res.Configuration;
import com.kuaishou.pagedy.container.widget.DynamicTabLayout$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.pagedy.container.widget.DynamicTabLayout$b;
import java.lang.Integer;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import java.lang.CharSequence;
import mo4.g;
import androidx.viewpager2.widget.ViewPager2;
import android.view.View$OnClickListener;
import android.text.TextPaint;
import java.lang.Number;
import com.yxcorp.gifshow.widget.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.pagedy.container.widget.DynamicTabLayout$b$a;
import java.lang.Float;
import com.yxcorp.gifshow.widget.c$a;
import android.widget.LinearLayout$LayoutParams;
import android.graphics.Typeface;
import mo4.f;
import java.lang.Runnable;
import android.graphics.Canvas;
import java.lang.Math;
import i27.c;
import android.view.View$MeasureSpec;
import android.os.Parcelable;
import com.kuaishou.pagedy.container.widget.DynamicTabLayout$SavedState;
import android.view.View$BaseSavedState;
import java.util.Iterator;
import java.lang.Boolean;
import android.content.res.Resources$Theme;
import o1.f;
import androidx.viewpager2.widget.ViewPager2$h;
import java.lang.IllegalStateException;

public class DynamicTabLayout extends HorizontalScrollView	// class@000a78
{
    public int A;
    public int B;
    public int C;
    public int D;
    public ColorStateList E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public Locale K;
    public boolean L;
    public int M;
    public DynamicTabLayout$b N;
    public final int O;
    public int P;
    public boolean Q;
    public int R;
    public boolean S;
    public c T;
    public boolean U;
    public boolean U0;
    public boolean V;
    public boolean V0;
    public int W;
    public boolean W0;
    public c X0;
    public float Y0;
    public float Z0;
    public LinearLayout$LayoutParams b;
    public final List c;
    public final DynamicTabLayout$a d;
    public ViewPager2$h e;
    public LinearLayout f;
    public ViewPager2 g;
    public int h;
    public int i;
    public float j;
    public int k;
    public final Paint l;
    public final RectF m;
    public final Paint n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public static final int[] a1;

    static {
       DynamicTabLayout.a1 = new int[3]{0x1010095,0x1010098,0x10100af};
    }
    public void DynamicTabLayout(Context p0){
       super(p0, null);
    }
    public void DynamicTabLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void DynamicTabLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = new CopyOnWriteArrayList();
       this.d = new DynamicTabLayout$a(this);
       this.i = 0;
       this.j = 0;
       this.k = -1;
       this.o = -10066330;
       this.p = 0x1a000000;
       this.q = 0x1a000000;
       this.r = false;
       this.s = false;
       this.t = false;
       this.u = true;
       this.v = 52;
       this.w = 8;
       this.y = 2;
       this.z = 12;
       this.A = 24;
       this.B = 0;
       this.C = 0;
       this.D = 12;
       this.F = 1;
       this.G = 1;
       this.H = 0;
       this.I = 0;
       this.M = 0;
       this.T = null;
       this.U = true;
       this.V0 = false;
       this.W0 = false;
       this.Y0 = 0xbf800000;
       this.Z0 = 0xbf800000;
       this.setFillViewport(true);
       this.setWillNotDraw(0);
       LinearLayout linearLayout = new LinearLayout(p0);
       this.f = linearLayout;
       linearLayout.setOrientation(0);
       this.f.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       this.f.setGravity(this.M);
       this.f.setClipChildren(0);
       this.f.setClipToPadding(0);
       this.addView(this.f);
       DisplayMetrics uDisplayMetr = c.c(this.getResources());
       this.v = (int)TypedValue.applyDimension(true, (float)this.v, uDisplayMetr);
       this.w = (int)TypedValue.applyDimension(true, (float)this.w, uDisplayMetr);
       this.y = (int)TypedValue.applyDimension(true, (float)this.y, uDisplayMetr);
       this.z = (int)TypedValue.applyDimension(true, (float)this.z, uDisplayMetr);
       this.A = (int)TypedValue.applyDimension(true, (float)this.A, uDisplayMetr);
       this.D = (int)TypedValue.applyDimension(2, (float)this.D, uDisplayMetr);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, DynamicTabLayout.a1);
       this.D = typedArray.getDimensionPixelSize(0, this.D);
       this.E = typedArray.getColorStateList(true);
       this.M = typedArray.getInt(2, this.M);
       typedArray.recycle();
       TypedArray typedArray1 = p0.obtainStyledAttributes(p1, c$b.M3);
       this.D = typedArray1.getDimensionPixelSize(23, this.D);
       this.o = typedArray1.getColor(5, this.o);
       this.p = typedArray1.getColor(25, this.p);
       this.q = typedArray1.getColor(3, this.q);
       this.w = typedArray1.getDimensionPixelSize(7, this.w);
       this.y = typedArray1.getDimensionPixelSize(26, this.y);
       this.z = typedArray1.getDimensionPixelSize(4, this.z);
       this.A = typedArray1.getDimensionPixelSize(22, this.A);
       this.J = typedArray1.getResourceId(21, this.J);
       this.r = typedArray1.getBoolean(19, this.r);
       this.v = typedArray1.getDimensionPixelSize(17, this.v);
       this.s = typedArray1.getBoolean(24, this.s);
       this.x = typedArray1.getDimensionPixelSize(9, 0);
       this.t = typedArray1.getBoolean(20, this.t);
       this.P = typedArray1.getDimensionPixelSize(14, 0);
       this.Q = typedArray1.getBoolean(15, 0);
       this.W = typedArray1.getDimensionPixelSize(8, 0);
       this.V = typedArray1.getBoolean(2, true);
       this.U0 = typedArray1.getBoolean(18, 0);
       this.O = typedArray1.getDimensionPixelSize(6, n.c(this.getContext(), 15.00f));
       this.B = typedArray1.getDimensionPixelSize(true, this.B);
       this.C = typedArray1.getDimensionPixelSize(0, this.C);
       typedArray1.recycle();
       Paint paint = new Paint();
       this.l = paint;
       paint.setAntiAlias(true);
       paint.setStyle(Paint$Style.FILL);
       this.m = new RectF();
       paint = new Paint();
       this.n = paint;
       paint.setAntiAlias(true);
       paint.setStrokeWidth((float)(int)TypedValue.applyDimension(true, 0x3f800000, uDisplayMetr));
       this.setAverageWidth(this.V);
       if (this.K == null) {
          this.K = this.getResources().getConfiguration().locale;
       }
       return;
    }
    public void a(DynamicTabLayout$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicTabLayout.class, "3")) {
          return;
       }
       this.c.add(p0);
       return;
    }
    public final void b(int p0,DynamicTabLayout$b p1){
       DynamicTabLayout$b uob;
       if (PatchProxy.isSupport(DynamicTabLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, DynamicTabLayout.class, "19")) {
          return;
       }
       Context context = this.getContext();
       DynamicTabLayout tg = this.g;
       Objects.requireNonNull(p1);
       if (PatchProxy.isSupport(DynamicTabLayout$b.class)) {
          uob = PatchProxy.applyThreeRefs(context, Integer.valueOf(p0), tg, p1, DynamicTabLayout$b.class, "2");
          if (uob != PatchProxyResult.class) {
          label_006b :
             this.f.addView(uob, p0);
             return;
          }
       }
       p1.d = p0;
       uob = p1.b;
       if (uob != null) {
          p1.c = uob;
       }else {
          TextView textView = new TextView(context);
          p1.c = textView;
          textView.setText(p1.a);
          textView.setFocusable(true);
          textView.setGravity(17);
          textView.setSingleLine();
       }
       p1.c.setOnClickListener(new g(p1, tg, p0));
       uob = p1.c;
       goto label_006b ;
    }
    public final float c(View p0,CharSequence p1,TextPaint p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, DynamicTabLayout.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (this.T == null) {
          this.T = new c();
       }
       return (((float)p0.getWidth() - this.T.c(p1, p2, (float)this.D)) / 2.00f);
    }
    public boolean d(){
       return this.U;
    }
    public void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DynamicTabLayout.class, "17")) {
          return;
       }
       DynamicTabLayout tg = this.g;
       if (tg != null && tg.getAdapter() != null) {
          this.f.removeAllViews();
          this.h = this.g.getAdapter().getItemCount();
          boolean b = false;
          int i = 0;
          DynamicTabLayout th = this.h;
          while (i < th) {
             if (this.g.getAdapter() instanceof DynamicTabLayout$b$a) {
                this.b(i, this.g.getAdapter().b(i));
             }else {
                this.b(i, new DynamicTabLayout$b(""));
             }
             i = i + 1;
          }
          if (th > null) {
             DynamicTabLayout tN = this.N;
             if (tN != null) {
                this.b(th, tN);
             }
          }
          this.j();
          this.L = b;
          this.h(this.g.getCurrentItem());
          if (!PatchProxy.applyVoid(objArray, this, DynamicTabLayout.class, "18")) {
             tg = this.g;
             if (tg != null && tg.getCurrentItem() != this.i) {
                this.i = this.g.getCurrentItem();
                this.j = 0;
                this.invalidate();
             }
          }
       }
    label_0093 :
       return;
    }
    public float f(float p0){
       if (PatchProxy.isSupport(DynamicTabLayout.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, DynamicTabLayout.class, "28");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return (p0 + (float)this.getPaddingLeft());
    }
    public void g(int p0,int p1){
       if (PatchProxy.isSupport(DynamicTabLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, DynamicTabLayout.class, "22")) {
          return;
       }
       if (this.h == null) {
          return;
       }
       int i = this.f.getChildAt(p0).getLeft() + p1;
       if (p0 > 0 || p1 > 0) {
          i = (this.U0 != null)? (i - (this.getWidth() / 2)) + (this.f.getChildAt(p0).getWidth() / 2): i - this.v;
       }
    label_004b :
       DynamicTabLayout tH = this.H;
       if (i != tH) {
          if (this.t == null) {
             this.H = i;
             this.scrollTo(i, 0);
          }else if(i < tH){
             this.H = i;
             this.I = this.getWidth() + i;
             this.scrollTo(i, 0);
          }else {
             i = (this.f.getChildAt(p0).getRight() - this.getWidth()) + p1;
             if (p0 > 0 || p1 > 0) {
                i = i + this.v;
             }
             if ((this.getWidth() + i) > this.I) {
                this.I = this.getWidth() + i;
                this.H = i;
                this.scrollTo(i, 0);
             }
          }
       }
       return;
    }
    public int getTabBottomPadding(){
       return this.C;
    }
    public int getTabPadding(){
       Object obj = PatchProxy.apply(null, this, DynamicTabLayout.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getTabPaddingInner();
    }
    public final int getTabPaddingInner(){
       if (this.W0 != null) {
          return this.A;
       }
       if (this.V0 != null) {
          return 0;
       }
       return this.A;
    }
    public int getTabTopPadding(){
       return this.B;
    }
    public LinearLayout getTabsContainer(){
       return this.f;
    }
    public void h(int p0){
       View childAt;
       if (PatchProxy.isSupport(DynamicTabLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DynamicTabLayout.class, "31")) {
          return;
       }
       if (p0 < this.h && p0 >= 0) {
          DynamicTabLayout tk = this.k;
          if (tk == p0) {
             childAt = this.f.getChildAt(tk);
             if (childAt != null) {
                childAt.setSelected(true);
             }
             this.j();
             return;
          }else {
             View childAt1 = this.f.getChildAt(tk);
             if (childAt1 != null) {
                childAt1.setSelected(false);
             }
             this.k = p0;
             childAt = this.f.getChildAt(p0);
             if (childAt != null) {
                childAt.setSelected(true);
             }
             this.j();
          }
       }
       return;
    }
    public final void i(View p0){
       float f;
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicTabLayout.class, "29")) {
          return;
       }
       DynamicTabLayout uDynamicTabL = null;
       DynamicTabLayout ti = this.i;
       if (ti < this.h) {
          uDynamicTabL = this.f.getChildAt((ti + 1));
       }
       if (uDynamicTabL == null) {
          uDynamicTabL = p0;
       }
       TextPaint textPaint = null;
       if (p0 instanceof TextView) {
          textPaint = this.c(p0, p0.getText(), p0.getPaint());
          f = this.c(uDynamicTabL, uDynamicTabL.getText(), uDynamicTabL.getPaint());
       }else if(p0 instanceof c$a){
          textPaint = this.c(p0, p0.getText(), p0.getTextPaint());
          f = this.c(uDynamicTabL, uDynamicTabL.getText(), uDynamicTabL.getTextPaint());
       }else {
          f = 0;
       }
       this.x = (this.S != null)? (int)(textPaint + ((f - textPaint) * this.j)): (int)(textPaint - ((textPaint - f) * this.j));
       return;
    }
    public final void j(){
       View view;
       boolean b;
       DynamicTabLayout tG;
       if (PatchProxy.applyVoid(null, this, DynamicTabLayout.class, "20")) {
          return;
       }
       if (this.g == null) {
          return;
       }
       int i = 0;
       while (i < this.f.getChildCount()) {
          View childAt = this.f.getChildAt(i);
          if (childAt.getLayoutParams() == null || childAt.getLayoutParams().width < null) {
             LinearLayout$LayoutParams layoutParams = PatchProxy.apply(null, this, DynamicTabLayout.class, "21");
             if (layoutParams != PatchProxyResult.class) {
             }else {
                layoutParams = new LinearLayout$LayoutParams(-2, -1);
             }
             childAt.setLayoutParams(layoutParams);
          }
          childAt.setBackgroundResource(this.J);
          childAt.setPadding(this.getTabPaddingInner(), this.B, this.getTabPaddingInner(), this.C);
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
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicTabLayout.class, "25")) {
          return;
       }
       if (this.g == null) {
          return;
       }
       this.j();
       this.L = false;
       this.post(new f(this));
       return;
    }
    public void onDraw(Canvas p0){
       DynamicTabLayout i3;
       int i5;
       float f3;
       float f5;
       int i = this;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, i, DynamicTabLayout.class, "24")) {
          return;
       }
       super.onDraw(p0);
       if (!this.isInEditMode()) {
          DynamicTabLayout h = i.h;
          if (h != null) {
             DynamicTabLayout i1 = i.i;
             if (i1 < h) {
                View childAt = i.f.getChildAt(i1);
                if (childAt == null) {
                   return;
                }else {
                   float f = i.f((float)childAt.getLeft());
                   float f1 = i.f((float)childAt.getRight());
                   int scrollX = this.getScrollX();
                   int i2 = this.getPaddingLeft() + scrollX;
                   scrollX = (scrollX + this.getWidth()) - this.getPaddingRight();
                   float f2 = 0x3f800000;
                   if (i.j - null > 0) {
                      i3 = i.i;
                      if (i3 < (i.h - 1)) {
                         View childAt1 = i.f.getChildAt((i3 + 1));
                         DynamicTabLayout j = i.j;
                         f = (i.f((float)childAt1.getLeft()) * j) + ((f2 - j) * f);
                         f1 = (i.f((float)childAt1.getRight()) * j) + ((f2 - j) * f1);
                      }
                   }
                   int height = this.getHeight();
                   i.l.setColor(i.o);
                   i.m.setEmpty();
                   i3 = i.P;
                   int i4 = 0;
                   if (i3 != null) {
                      i5 = (int)(((f1 - f) - (float)i3) / 2.00f);
                      i.x = i5;
                      i3 = i.j;
                      f2 = ((double)i3 - 0x3fe0000000000000 < 0)? ((float)i5 * i3) / 3.00f: ((float)i5 * (f2 - i3)) / 3.00f;
                      f = (f + (float)i5) - f2;
                      f1 = (f1 - (float)i5) + f2;
                      f3 = (float)scrollX;
                      if (f - f3 <= 0) {
                         f5 = (float)i2;
                         if (f1 - f5 >= 0) {
                            if (f - f5 > 0) {
                               f1 = Math.min(f1, f3);
                            }else if(f1 - f3 < 0){
                               f = Math.max(f, f5);
                            }
                            h = 1;
                         label_00e7 :
                            i3 = i.W;
                            i.m.set(f, (float)(((height - i.w) - 1) - i3), f1, (float)((height - 1) - i3));
                         }
                      }
                      h = null;
                      goto label_00e7 ;
                   }else if(i.Q != null){
                      i.i(childAt);
                   }
                   h = i.x;
                   f = f + (float)h;
                   f1 = f1 - (float)h;
                   f3 = (float)scrollX;
                   if (f - f3 <= 0) {
                      f5 = (float)i2;
                      if (f1 - f5 >= 0) {
                         if (f - f5 > 0) {
                            f1 = Math.min(f1, f3);
                         }else if(f1 - f3 < 0){
                            f = Math.max(f, f5);
                         }
                         h = 1;
                      label_0126 :
                         i3 = i.W;
                         i.m.set(f, (float)((height - i.w) - i3), f1, (float)(height - i3));
                      }
                   }
                   h = null;
                   goto label_0126 ;
                   i1 = i.m;
                   i.Y0 = i1.left;
                   i.Z0 = i1.right;
                   if (this.d() && h) {
                      h = i.X0;
                      if (h != null) {
                         i1 = 0xbf800000;
                         if (h.a() - i1 && i.X0.b() - i1) {
                            RectF rectF = new RectF(i.m);
                            rectF.left = i.X0.a();
                            rectF.right = i.X0.b();
                            i1 = i.O;
                            f1 = (float)i1;
                            obj.drawRoundRect(rectF, f1, (float)i1, i.l);
                         }
                      }
                      i1 = i.O;
                      f1 = (float)i1;
                      obj.drawRoundRect(i.m, f1, (float)i1, i.l);
                   }
                   i.l.setColor(i.p);
                   p0.drawRect(0, (float)(height - i.y), (float)i.f.getWidth(), (float)height, i.l);
                   i.n.setColor(i.q);
                   i5 = i.h - 1;
                   while (i4 < i5) {
                      childAt = i.f.getChildAt(i4);
                      i5 = height - i.z;
                      float f4 = (float)i5;
                      p0.drawLine(i.f((float)childAt.getRight()), (float)i.z, i.f((float)childAt.getRight()), f4, i.n);
                      i4 = i4 + 1;
                   }
                }
             }
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(DynamicTabLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, DynamicTabLayout.class, "23")) {
          return;
       }
       if (this.r != null && (this.L != null || !View$MeasureSpec.getMode(p0))) {
          super.onMeasure(p0, p1);
          return;
       }else if(this.L == null){
          super.onMeasure(p0, p1);
       }
       int measuredWidt = this.getMeasuredWidth();
       int i1 = 0;
       for (int i = 0; i < this.h; i = i + 1) {
          i1 = i1 + this.f.getChildAt(i).getMeasuredWidth();
       }
       if (i1 > 0 && measuredWidt > 0) {
          this.v = this.f.getChildAt(0).getMeasuredWidth();
          if (i1 <= measuredWidt) {
             this.W0 = false;
             if (this.u != null) {
                for (measuredWidt = 0; measuredWidt < this.h; measuredWidt = measuredWidt + 1) {
                   View childAt = this.f.getChildAt(measuredWidt);
                   if (!measuredWidt) {
                      DynamicTabLayout tb = this.b;
                      LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(tb.width, tb.height);
                      tb = this.b;
                      layoutParams.gravity = tb.gravity;
                      layoutParams.weight = tb.weight;
                      layoutParams.rightMargin = tb.rightMargin;
                      layoutParams.bottomMargin = tb.bottomMargin;
                      layoutParams.topMargin = tb.topMargin;
                      layoutParams.leftMargin = 0;
                      childAt.setLayoutParams(layoutParams);
                   }else {
                      childAt.setLayoutParams(this.b);
                   }
                   childAt.setPadding(this.getTabPaddingInner(), this.B, this.getTabPaddingInner(), this.C);
                }
             }
          }else {
             this.W0 = true;
          }
          this.L = true;
       }
       super.onMeasure(p0, p1);
       return;
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicTabLayout.class, "26")) {
          return;
       }
       super.onRestoreInstanceState(p0.getSuperState());
       this.i = p0.b;
       this.requestLayout();
       return;
    }
    public Parcelable onSaveInstanceState(){
       Object obj = PatchProxy.apply(null, this, DynamicTabLayout.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       DynamicTabLayout$SavedState savedState = new DynamicTabLayout$SavedState(super.onSaveInstanceState());
       savedState.b = this.i;
       return savedState;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(DynamicTabLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, DynamicTabLayout.class, "32")) {
          return;
       }
       super.onScrollChanged(p0, p1, p2, p3);
       DynamicTabLayout tc = this.c;
       _monitor_enter(tc);
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          DynamicTabLayout$c uoc = iterator.next();
          if (uoc != null) {
             uoc.a();
          }
       }
       _monitor_exit(tc);
       return;
    }
    public void setAverageWidth(boolean p0){
       if (PatchProxy.isSupport(DynamicTabLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DynamicTabLayout.class, "2")) {
          return;
       }
       this.V = p0;
       this.b = (p0)? new LinearLayout$LayoutParams(0, -1, 0x3f800000): new LinearLayout$LayoutParams(-2, -1);
       return;
    }
    public void setClickOnlyTabStrip(DynamicTabLayout$b p0){
       this.N = p0;
    }
    public void setDividerColorInt(int p0){
       this.q = p0;
    }
    public void setDividerPadding(int p0){
       this.z = p0;
    }
    public void setIgnorePaddingWhenCannotScroll(boolean p0){
       this.V0 = p0;
    }
    public void setIndicatorColor(int p0){
       if (PatchProxy.isSupport(DynamicTabLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DynamicTabLayout.class, "5")) {
          return;
       }
       this.o = f.a(this.getResources(), p0, null);
       return;
    }
    public void setIndicatorColorInt(int p0){
       this.o = p0;
    }
    public void setIndicatorPadding(int p0){
       this.x = p0;
    }
    public void setOnPageChangeListener(ViewPager2$h p0){
       this.e = p0;
    }
    public void setScrollSelectedTabToCenter(boolean p0){
       this.U0 = p0;
    }
    public void setShouldExpand(boolean p0){
       this.r = p0;
    }
    public void setShouldReMeasure(boolean p0){
       this.u = p0;
    }
    public void setTabBottomPadding(int p0){
       if (PatchProxy.isSupport(DynamicTabLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DynamicTabLayout.class, "14")) {
          return;
       }
       if (this.C != p0) {
          this.L = false;
          this.C = p0;
          this.requestLayout();
       }
       return;
    }
    public void setTabGravity(int p0){
       if (PatchProxy.isSupport(DynamicTabLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DynamicTabLayout.class, "12")) {
          return;
       }
       this.M = p0;
       this.f.setGravity(p0);
       return;
    }
    public void setTabIndicatorInterceptor(c p0){
       this.X0 = p0;
    }
    public void setTabLayoutParams(LinearLayout$LayoutParams p0){
       this.b = p0;
    }
    public void setTabPadding(int p0){
       if (PatchProxy.isSupport(DynamicTabLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DynamicTabLayout.class, "13")) {
          return;
       }
       if (this.A != p0) {
          this.L = false;
          this.A = p0;
          this.requestLayout();
       }
       return;
    }
    public void setTabTextSize(int p0){
       if (PatchProxy.isSupport(DynamicTabLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DynamicTabLayout.class, "11")) {
          return;
       }
       this.D = p0;
       this.j();
       return;
    }
    public void setTabTopPadding(int p0){
       if (PatchProxy.isSupport(DynamicTabLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DynamicTabLayout.class, "15")) {
          return;
       }
       if (this.B != p0) {
          this.L = false;
          this.B = p0;
          this.requestLayout();
       }
       return;
    }
    public void setTabTypefaceStyle(int p0){
       if (PatchProxy.isSupport(DynamicTabLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DynamicTabLayout.class, "9")) {
          return;
       }
       this.F = p0;
       this.G = p0;
       this.j();
       return;
    }
    public void setTextColor(int p0){
       if (PatchProxy.isSupport(DynamicTabLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DynamicTabLayout.class, "8")) {
          return;
       }
       this.E = f.b(this.getResources(), p0, null);
       this.j();
       return;
    }
    public void setUnderlineColorInt(int p0){
       this.p = p0;
    }
    public void setUnderlineHeight(int p0){
       this.y = p0;
    }
    public void setViewPager(ViewPager2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicTabLayout.class, "1")) {
          return;
       }
       this.g = p0;
       if (p0.getAdapter() == null) {
          throw new IllegalStateException("ViewPager does not have adapter instance.");
       }
       p0.j(this.d);
       this.e();
       return;
    }
}
