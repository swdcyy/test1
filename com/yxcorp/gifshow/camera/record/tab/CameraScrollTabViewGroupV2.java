package com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2$d;
import android.util.SparseIntArray;
import android.widget.Scroller;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2$a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import android.view.ViewGroup;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2$c;
import java.lang.Integer;
import android.widget.TextView;
import java.lang.Math;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewParent;
import eh9.j;
import java.lang.Runnable;
import ekd.k1;
import w46.b;
import a2.i0;
import android.animation.ValueAnimator;
import eh9.i;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2$b;
import android.animation.Animator$AnimatorListener;
import java.util.List;
import java.util.ArrayList;
import java.lang.Float;
import android.graphics.Rect;
import android.view.MotionEvent;
import java.lang.IndexOutOfBoundsException;
import android.content.res.Resources;
import android.content.res.ColorStateList;

public class CameraScrollTabViewGroupV2 extends FrameLayout	// class@000f35
{
    public float b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final CameraScrollTabViewGroupV2$d i;
    public boolean j;
    public final CameraScrollTabViewGroupV2$d k;
    public int l;
    public View m;
    public final Scroller n;
    public int o;
    public CameraScrollTabViewGroupV2$c p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public final SparseIntArray u;
    public final SparseIntArray v;
    public boolean w;
    public final LinearLayout x;
    public int y;
    public static final int z;

    public void CameraScrollTabViewGroupV2(Context p0){
       super(p0, null);
    }
    public void CameraScrollTabViewGroupV2(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void CameraScrollTabViewGroupV2(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0;
       this.c = 0;
       this.d = 0;
       this.e = 0;
       this.f = 0;
       this.g = -1;
       this.h = 0;
       this.i = new CameraScrollTabViewGroupV2$d();
       this.j = false;
       this.k = new CameraScrollTabViewGroupV2$d();
       this.l = -1;
       this.o = 150;
       this.q = 0;
       this.r = 0;
       this.s = 0;
       this.t = false;
       this.u = new SparseIntArray(5);
       this.v = new SparseIntArray(5);
       this.w = false;
       this.y = 0;
       this.n = new Scroller(this.getContext(), new AccelerateDecelerateInterpolator());
       LinearLayout linearLayout = new LinearLayout(this.getContext());
       this.x = linearLayout;
       this.addView(linearLayout, new FrameLayout$LayoutParams(-1, -1));
       linearLayout.setGravity(16);
       this.getViewTreeObserver().addOnPreDrawListener(new CameraScrollTabViewGroupV2$a(this));
    }
    public boolean A(){
       boolean b = (this.b)? true: false;
       return b;
    }
    public final void B(CameraScrollTabViewGroupV2$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "18")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("CameraScrollTabViewGroupV2", "selectTab:"+p0, objArray);
       if (p0.a < this.getItemCount() && p0.a >= null) {
          this.i.a(p0);
          if (!this.v(p0)) {
             return;
          }else if(this.s(p0.a) instanceof ViewGroup){
             CameraScrollTabViewGroupV2 tk = this.k;
             if (tk.a != p0.a) {
                this.f(i, tk);
             }
          }
          this.E(this.k, i);
          this.k.a(p0);
          this.E(this.k, true);
          CameraScrollTabViewGroupV2 tp = this.p;
          if (tp != null) {
             tp.b(this.s(this.k.a));
          }
          int i1 = this.u(this.k.a);
          this.l = i1;
          if (!PatchProxy.isSupport(CameraScrollTabViewGroupV2.class) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), this, CameraScrollTabViewGroupV2.class, "16") && i1 != this.s)) {
             this.s = i1;
             CameraScrollTabViewGroupV2 tm = this.m;
             if (tm != null && tm instanceof TextView) {
                tm.setSelected(i);
                tm = this.r;
                if (tm != null) {
                   this.m.setTextSize(i, (float)tm);
                }
             }
             View view = this.findViewById(i1);
             if (view instanceof TextView) {
                view.setSelected(true);
                if (this.r == null) {
                   this.r = (int)view.getTextSize();
                }
                tm = this.q;
                if (tm != null) {
                   view.setTextSize(2, (float)tm);
                }
             }
             this.m = view;
          }
          this.f(true, this.k);
       }
       return;
    }
    public void C(CameraScrollTabViewGroupV2$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "33")) {
          return;
       }
       this.e(p0);
       this.B(p0);
       return;
    }
    public final void D(int p0,ViewGroup p1,int p2){
       if (PatchProxy.isSupport(CameraScrollTabViewGroupV2.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), this, CameraScrollTabViewGroupV2.class, "50")) {
          return;
       }
       if (p2 == -1) {
          p2 = 0;
       }
       Object[] objArray = new Object[0];
       a.D().w("CameraScrollTabViewGroupV2", "setItemExpandDistance : "+p0+"---"+this.k(p1), objArray);
       p0 = Math.min(Math.max(0, p0), p1.getChildAt(p2).getWidth());
       int i = 1;
       View childAt = p1.getChildAt(i);
       ViewGroup$MarginLayoutParams layoutParams = childAt.getLayoutParams();
       layoutParams.setMarginStart(p0);
       childAt.setLayoutParams(layoutParams);
       if (p2) {
          i = 0;
       }
       View childAt1 = p1.getChildAt(i);
       float f = ((float)p0 * 0x3f800000) / (float)p1.getChildAt(0).getWidth();
       childAt1.setAlpha(f);
       f = ((double)f - 0x3f847ae147ae147b <= 0)? 4: 0;
       childAt1.setVisibility(f);
       p1.getChildAt(p2).setVisibility(0);
       return;
    }
    public final void E(CameraScrollTabViewGroupV2$d p0,boolean p1){
       if (PatchProxy.isSupport(CameraScrollTabViewGroupV2.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, CameraScrollTabViewGroupV2.class, "47")) {
          return;
       }
       CameraScrollTabViewGroupV2$d a = p0.a;
       if (a >= null && a < this.getItemCount()) {
          if (this.s(p0.a) instanceof ViewGroup && (this.getItemCount() > 0 && p0.b >= null)) {
             this.s(p0.a).getChildAt(p0.b).setSelected(p1);
          }else {
             this.s(p0.a).setSelected(p1);
          }
       }
       return;
    }
    public void a(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "1")) {
          return;
       }
       this.x.addView(p0);
       return;
    }
    public void addView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "6")) {
          return;
       }
       super.addView(p0);
       return;
    }
    public void b(int p0,int p1){
       int i;
       if (PatchProxy.isSupport(CameraScrollTabViewGroupV2.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, CameraScrollTabViewGroupV2.class, "38")) {
          return;
       }
       if (p0 != -1 && p0 == this.l) {
          return;
       }
       if (PatchProxy.isSupport(CameraScrollTabViewGroupV2.class)) {
          View obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, CameraScrollTabViewGroupV2.class, "42");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else if(this.u.get(p0, -1) != -1){
             i = this.u.get(p0);
          }else {
             obj = this.findViewById(p0);
             if (obj != null) {
                while (obj.getParent() == null || (obj.getParent() instanceof ViewGroup && obj.getParent() != this.x)) {
                   ViewGroup parent = obj.getParent();
                }
                if (obj.getParent() == this.x) {
                   int i1 = 0;
                   while (true) {
                      if (i1 < this.getItemCount()) {
                         if (this.s(i1).getVisibility() != 8 && this.s(i1) == obj) {
                            this.u.put(p0, i1);
                            i = i1;
                            break ;
                         }else {
                            i1 = i1 + 1;
                         }
                      }
                   }
                }
             }
             i = -1;
          }
       }else {
          goto label_0042 ;
       }
       if (i < 0) {
          return;
       }else {
          this.l = p0;
          if (!this.s(i) instanceof ViewGroup) {
             p1 = -1;
          }
          this.setSelectedItem(new CameraScrollTabViewGroupV2$d(i, p1));
          return;
       }
    }
    public void c(int p0){
       if (PatchProxy.isSupport(CameraScrollTabViewGroupV2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CameraScrollTabViewGroupV2.class, "39")) {
          return;
       }
       if (!PatchProxy.isSupport(CameraScrollTabViewGroupV2.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(0), this, CameraScrollTabViewGroupV2.class, "40")) {
          this.o = 0;
          this.b(p0, 0);
          this.o = 150;
       }
       return;
    }
    public void computeScroll(){
       int i;
       if (PatchProxy.applyVoid(null, this, CameraScrollTabViewGroupV2.class, "7")) {
          return;
       }
       if (this.n.computeScrollOffset()) {
          int currentScrol = this.getCurrentScrollXWithExpand();
          int currX = this.n.getCurrX();
          if (currX == currentScrol) {
             if (this.n.getFinalX() > currentScrol) {
                i = currX + 1;
             }else if(this.n.getFinalX() < currentScrol){
                i = currX - 1;
             }else {
             label_0036 :
                i = currX;
             }
          }else {
             goto label_0036 ;
          }
          Object[] objArray = new Object[0];
          a.D().w("CameraScrollTabViewGroupV2", "computeScroll "+currX+", current : "+currentScrol+"  , next : "+i+"--- ", objArray);
          this.d(i);
          this.invalidate();
       }else {
          k1.r(new j(this), 0);
       }
       return;
    }
    public final void d(int p0){
       if (PatchProxy.isSupport(CameraScrollTabViewGroupV2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CameraScrollTabViewGroupV2.class, "8")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("CameraScrollTabViewGroupV2", "doScroll : "+p0+"   "+this.getCurrentScrollX(), objArray);
       p0 = - p0;
       if (this.s(this.k.a) instanceof ViewGroup) {
          ViewGroup viewGroup = this.s(this.k.a);
          int i1 = this.m(viewGroup);
          int width = viewGroup.getChildAt(i).getWidth();
          Object[] objArray1 = new Object[i];
          a.D().s("CameraScrollTabViewGroupV2", "view 初始位置 : "+i1, objArray1);
          int i2 = ((this.getWidth() - width) / 2) - i1;
          objArray1 = new Object[i];
          a.D().s("CameraScrollTabViewGroupV2", "view完全展开的最大位置"+i2, objArray1);
          i1 = i2 - width;
          Object[] objArray2 = new Object[i];
          a.D().s("CameraScrollTabViewGroupV2", "view完全展开的最小位置"+i1, objArray2);
          if (p0 >= i1 && p0 <= i2) {
             this.D(width, viewGroup, this.k.b);
          }else if(p0 < i1){
             i1 = Math.min((i1 - p0), width);
             this.D((width - i1), viewGroup, this.k.b);
             p0 = p0 + i1;
          }else {
             this.D(Math.max((width + (i2 - p0)), i), viewGroup, this.k.b);
          }
       }
       Object[] objArray3 = new Object[i];
       a.D().w("CameraScrollTabViewGroupV2", "really scroll : "+p0, objArray3);
       FrameLayout$LayoutParams contentViewL = this.getContentViewLayoutParams();
       contentViewL.setMarginStart(p0);
       this.setContentViewLayoutParams(contentViewL);
       CameraScrollTabViewGroupV2 tp = this.p;
       if (tp != null) {
          tp.a();
       }
       return;
    }
    public void e(CameraScrollTabViewGroupV2$d p0){
       Object[] objArray;
       CameraScrollTabViewGroupV2$d obj;
       float f;
       int i2;
       int i3;
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "32")) {
          return;
       }
       View view = this.s(p0.a);
       String str = "CameraScrollTabViewGroupV2";
       int i = 0;
       if (view == null) {
          objArray = new Object[i];
          a.D().t(str, "doScrollView crash! scroll tab size:"+this.getItemCount()+" , index: "+p0, objArray);
          return;
       }else if((v3 = view instanceof ViewGroup) && this.k.a == p0.a){
          int i1 = (p0.b == null)? this.p(view): this.p(view) + this.h(view);
          if (i1 == this.getCurrentScrollX()) {
             obj = PatchProxy.applyOneRefs(view, this, CameraScrollTabViewGroupV2.class, "51");
             if (obj != PatchProxyResult.class) {
                f = obj.floatValue();
             }else if(this.t(view) > 0){
                f = ((float)view.getChildAt(1).getLayoutParams().getMarginStart() * 0x3f800000) / (float)view.getChildAt(i).getWidth();
             }else {
                f = 0;
             }
             if (!f - 0x3f800000) {
                objArray = new Object[i];
                a.D().w(str, "no change "+i1, objArray);
                return;
             }
          }
          this.d(i1);
          return;
       }else if(v3 && !this.w(view)){
          return;
       }else if(v3){
          i2 = view.getChildAt(i).getWidth() / 2;
       }else {
          i2 = view.getWidth() / 2;
       }
       if (p0.a > null) {
          for (i3 = 0; i3 < p0.a; i3 = i3 + 1) {
             int width = (this.s(i3) instanceof ViewGroup)? this.s(i3).getChildAt(i).getWidth(): this.s(i3).getWidth();
             i2 = i2 + width;
          }
       }
       i3 = this.getWidth() / 2;
       if (!v3 && this.s(this.k.a) instanceof ViewGroup) {
          obj = this.k.a;
          if (p0.a > obj) {
             i3 = i3 - this.s(obj).getChildAt(i).getWidth();
          }
       }
       i2 = i2 - i3;
       if (!this.s(this.k.a) instanceof ViewGroup || (!this.w(this.s(this.k.a)) && this.getCurrentScrollX() == i2)) {
          return;
       }else {
          this.d(i2);
          return;
       }
    }
    public final void f(boolean p0,CameraScrollTabViewGroupV2$d p1){
       ValueAnimator valueAnimato;
       View childAt;
       if (PatchProxy.isSupport(CameraScrollTabViewGroupV2.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, CameraScrollTabViewGroupV2.class, "19")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("CameraScrollTabViewGroupV2", "expandOrCollapseChildItemAfterLaidOut : "+p0+"  "+p1, objArray);
       if (this.s(p1.a) instanceof ViewGroup) {
          if (!i0.Y(this)) {
             return;
          }else {
             ViewGroup viewGroup = this.s(p1.a);
             if (this.x(viewGroup) == p0) {
                return;
             }else {
                int width = viewGroup.getChildAt(i).getWidth();
                int marginStart = viewGroup.getChildAt(1).getLayoutParams().getMarginStart();
                int i1 = 2;
                if (p0) {
                   int[] ointArray = new int[i1];
                   ointArray[i] = marginStart;
                   ointArray[1] = width;
                   valueAnimato = ValueAnimator.ofInt(ointArray);
                }else {
                   int[] ointArray1 = new int[i1];
                   ointArray1[i] = marginStart;
                   ointArray1[1] = i;
                   valueAnimato = ValueAnimator.ofInt(ointArray1);
                }
                valueAnimato.setDuration(150);
                if (p0) {
                   childAt = (!viewGroup.getChildAt(i).getVisibility())? viewGroup.getChildAt(1): viewGroup.getChildAt(i);
                }else {
                   childAt = viewGroup.getChildAt(p1.b);
                }
                valueAnimato.addUpdateListener(new i(this, p1, viewGroup, childAt));
                valueAnimato.addListener(new CameraScrollTabViewGroupV2$b(this, childAt));
                valueAnimato.start();
             }
          }
       }
       return;
    }
    public final int g(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          return -1;
       }
       if (p0.getTag() != null) {
          return p0.getId();
       }
       if (p0 instanceof ViewGroup) {
          int i = 0;
          while (i < p0.getChildCount()) {
             int i1 = this.g(p0.getChildAt(i));
             if (i1 == -1) {
                i = i + 1;
             }else {
                return i1;
             }
          }
       }
       return -1;
    }
    public FrameLayout$LayoutParams getContentViewLayoutParams(){
       Object obj = PatchProxy.apply(null, this, CameraScrollTabViewGroupV2.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.x.getLayoutParams();
    }
    public int getCurrentScrollX(){
       Object obj = PatchProxy.apply(null, this, CameraScrollTabViewGroupV2.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (- this.getContentViewLayoutParams().getMarginStart());
    }
    public int getCurrentScrollXWithExpand(){
       Object obj = PatchProxy.apply(null, this, CameraScrollTabViewGroupV2.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int currentScrol = this.getCurrentScrollX();
       CameraScrollTabViewGroupV2 tk = this.k;
       if (tk.b >= null && this.s(tk.a) instanceof ViewGroup) {
          tk = this.i;
          CameraScrollTabViewGroupV2$d a = tk.a;
          CameraScrollTabViewGroupV2$d a1 = this.k.a;
          if (a > a1 || (a == a1 && tk.b == 1)) {
             currentScrol = currentScrol + this.r(this.s(a1));
          }
       }
       return currentScrol;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, CameraScrollTabViewGroupV2.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.x.getChildCount();
    }
    public List getItemViews(){
       ArrayList obj = PatchProxy.apply(null, this, CameraScrollTabViewGroupV2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       for (int i = 0; i < this.x.getChildCount(); i = i + 1) {
          obj.add(this.x.getChildAt(i));
       }
       return obj;
    }
    public final int h(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          return 0;
       }
       if (p0 instanceof ViewGroup) {
          return p0.getChildAt(0).getWidth();
       }
       return p0.getWidth();
    }
    public final int i(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (p0 == null) {
          return i;
       }
       if (p0 instanceof ViewGroup) {
          return (p0.getChildAt(i).getWidth() + p0.getChildAt(1).getLayoutParams().getMarginStart());
       }
       return p0.getWidth();
    }
    public final CameraScrollTabViewGroupV2$d j(float p0,float p1){
       CameraScrollTabViewGroupV2$d obj;
       if (PatchProxy.isSupport(CameraScrollTabViewGroupV2.class)) {
          obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, CameraScrollTabViewGroupV2.class, "34");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new CameraScrollTabViewGroupV2$d();
       int i = (int)p0;
       int itemCount = this.getItemCount();
       int i1 = 0;
       int i2 = 0;
       while (i2 < itemCount) {
          View view = this.s(i2);
          if (!view.getVisibility()) {
             Rect rect = new Rect();
             view.getGlobalVisibleRect(rect);
             if (i >= rect.left && i < rect.right) {
                obj.a = i2;
                if (view instanceof ViewGroup) {
                   View view1 = view;
                   while (i1 < view1.getChildCount()) {
                      if (!view1.getChildAt(i1).getVisibility()) {
                         view1.getChildAt(i1).getGlobalVisibleRect(rect);
                         if (i >= rect.left && i < rect.right) {
                            obj.b = i1;
                         }
                      }
                      i1 = i1 + 1;
                   }
                label_0079 :
                   return obj;
                }else {
                   goto label_0079 ;
                }
             }
          }
          i2 = i2 + 1;
       }
    }
    public int k(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return p0.getChildAt(1).getLayoutParams().getMarginStart();
    }
    public int l(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.t(p0);
       int i1 = p0.getWidth() / 2;
       int i2 = 0;
       if (p0 instanceof ViewGroup) {
          i1 = p0.getChildAt(i2).getWidth() / 2;
       }
       if (i > 0) {
          for (; i2 < i; i2 = i2 + 1) {
             i1 = i1 + this.i(this.s(i2));
          }
       }
       return i1;
    }
    public int m(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (p0 == null) {
          return i;
       }
       int i1 = this.t(p0);
       if (i1 > 0) {
          int i2 = 0;
          for (; i < i1; i = i + 1) {
             i2 = i2 + this.h(this.s(i));
          }
          i = i2;
       }
       return i;
    }
    public View n(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = this.t(p0);
       if (i <= 0) {
          return null;
       }
       i = i - 1;
       if (this.s(i) instanceof ViewGroup) {
          return this.s(i).getChildAt(1);
       }
       return this.s(i);
    }
    public View o(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = this.t(p0);
       if (i == (this.getItemCount() - 1)) {
          return null;
       }
       i++;
       if (this.s(i) instanceof ViewGroup) {
          return this.s(i).getChildAt(0);
       }
       return this.s(i);
    }
    public boolean onTouchEvent(MotionEvent p0){
       Rect rect;
       int i;
       CameraScrollTabViewGroupV2$d a;
       CameraScrollTabViewGroupV2$d obj = PatchProxy.applyOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int b = false;
       if (!this.isEnabled()) {
          return b;
       }
       float f = 0;
       boolean b1 = -1;
       if (!p0.getAction()) {
          this.y = this.getCurrentScrollX();
          if (!this.n.isFinished()) {
             Object[] objArray = new Object[b];
             a.D().w("CameraScrollTabViewGroupV2", "abortAnimation", objArray);
             this.n.abortAnimation();
             this.d(this.n.getFinalX());
          }
          this.b = p0.getRawX();
          this.d = p0.getRawX();
          if (!PatchProxy.applyVoid(null, this, CameraScrollTabViewGroupV2.class, "21")) {
             i = this.getItemCount();
             int i1 = 0;
             while (i1 < i) {
                if (!this.s(i1).getVisibility()) {
                   this.h = i1;
                   if (this.g == b1) {
                      this.g = i1;
                   }
                }
                i1 = i1 + 1;
             }
             if (this.g < null) {
                this.g = b;
             }
          }
          if (this.s(this.g) == null || this.s(this.h) == null) {
             this.e = b;
             this.f = b;
             this.j = b;
             this.b = f;
             return b;
          }
       }
       if (p0.getAction() == 1) {
          Object[] objArray1 = new Object[b];
          a.D().w("CameraScrollTabViewGroupV2", "ACTION_UP", objArray1);
          float rawX = p0.getRawX();
          this.c = rawX;
          if (Math.abs((rawX - this.b)) - 0x42300000 < 0 && this.j == null) {
             obj = this.j(p0.getRawX(), p0.getY());
             if (obj.a > b1) {
                if (!this.v(obj)) {
                   this.e(obj);
                }
                this.l = this.u(obj.a);
                if (!this.v(obj) && i0.Y(this)) {
                   CameraScrollTabViewGroupV2 tp = this.p;
                   if (tp != null) {
                      tp.d(this.s(obj.a));
                   }
                }
                this.setSelectedItem(obj);
             }else {
                this.e(this.k);
             }
          }else {
             rect = new Rect();
             if (this.s(this.g) != null) {
                this.s(this.g).getGlobalVisibleRect(rect);
             }
             this.e = rect.left;
             rect = new Rect();
             if (this.s(this.h) != null) {
                this.s(this.h).getGlobalVisibleRect(rect);
             }
             this.f = rect.right;
             if (this.e >= (this.getWidth() / 2)) {
                CameraScrollTabViewGroupV2 tg1 = this.g;
                if (this.s(tg1) instanceof ViewGroup) {
                   b1 = 0;
                }
                this.setSelectedItem(new CameraScrollTabViewGroupV2$d(tg1, b1));
             }else if(this.f <= (this.getWidth() / 2)){
                CameraScrollTabViewGroupV2 tk = this.k;
                a = tk.a;
                CameraScrollTabViewGroupV2 th = this.h;
                if (a == th) {
                   this.setSelectedItem(new CameraScrollTabViewGroupV2$d(a, tk.b));
                }else if(this.s(th) instanceof ViewGroup){
                   b1 = (!this.s(this.h).getChildAt(b).getVisibility())? 0: 1;
                }
             label_0199 :
                this.setSelectedItem(new CameraScrollTabViewGroupV2$d(this.h, b1));
             }else {
                obj = this.j(((float)this.getWidth() / 2.00f), p0.getY());
                if (obj.a > b1) {
                   this.setSelectedItem(obj);
                }
             }
          }
          this.e = b;
          this.f = b;
          this.j = b;
          this.b = f;
       }else if(p0.getAction() == 3){
          this.C(this.k);
          this.e = b;
          this.f = b;
          this.j = b;
          this.b = f;
       }
       if (p0.getAction() == 2) {
          if (!this.n.isFinished()) {
             Object[] objArray2 = new Object[b];
             a.D().w("CameraScrollTabViewGroupV2", "abortAnimation222", objArray2);
             this.n.abortAnimation();
          }
          if (Math.abs((p0.getRawX() - this.b)) - 0x42300000 > 0) {
             this.j = true;
          }
          rect = new Rect();
          CameraScrollTabViewGroupV2 tg = this.g;
          if (tg >= null) {
             this.s(tg).getGlobalVisibleRect(rect);
          }
          this.e = rect.left;
          rect = new Rect();
          tg = this.h;
          if (tg >= null) {
             this.s(tg).getGlobalVisibleRect(rect);
          }
          this.f = rect.right;
          float f1 = (float)(int)p0.getRawX();
          i = (int)(this.d - f1);
          if (this.e > (this.getWidth() / 2) || this.f < (this.getWidth() / 2)) {
             b = this.y + (i / 10);
             this.y = b;
             this.d(b);
          }else {
             b = this.y + i;
             this.y = b;
             this.d(b);
          }
          this.d = f1;
       }
       return true;
    }
    public int p(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.t(p0);
       int i1 = 0;
       int i2 = p0.getChildAt(i1).getWidth() / 2;
       if (i > 0) {
          for (; i1 < i; i1 = i1 + 1) {
             i2 = i2 + this.h(this.s(i1));
          }
       }
       return (i2 - (this.getWidth() / 2));
    }
    public int q(CameraScrollTabViewGroupV2$d p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.m(this.s(p0.a));
       int i1 = (this.getWidth() / 2) - (this.h(this.s(p0.a)) / 2);
       if (p0.b > null) {
          i1 = i1 - this.h(this.s(p0.a));
       }
       return (i - i1);
    }
    public final int r(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (p0.getChildAt(0).getWidth() - p0.getChildAt(1).getLayoutParams().getMarginStart());
    }
    public View s(int p0){
       if (PatchProxy.isSupport(CameraScrollTabViewGroupV2.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, CameraScrollTabViewGroupV2.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.x.getChildAt(p0);
    }
    public void setContentViewLayoutParams(FrameLayout$LayoutParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "10")) {
          return;
       }
       this.x.setLayoutParams(p0);
       return;
    }
    public void setOnTabSelected(CameraScrollTabViewGroupV2$c p0){
       this.p = p0;
    }
    public final void setSelectedItem(CameraScrollTabViewGroupV2$d p0){
       Object[] objArray1;
       int currentScrol;
       CameraScrollTabViewGroupV2$d a;
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "17")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("CameraScrollTabViewGroupV2", "setSelectedItem:"+p0, objArray);
       if (p0.a >= this.getItemCount() || p0.a < null) {
          throw new IndexOutOfBoundsException("total:"+this.getItemCount()+" and current: "+p0);
       }
       this.i.a(p0);
       int b = i0.Y(this);
       if (!this.v(p0) && (b && (this.getCurrentScrollX() == this.q(p0) && (!this.s(p0.a) instanceof ViewGroup || (this.s(p0.a) != null && (this.x(this.s(p0.a)) && this.getCurrentScrollX() == this.q(p0))))))) {
          objArray1 = new Object[i];
          a.D().w("CameraScrollTabViewGroupV2", "not change item .", objArray1);
          return;
       }else if(!b){
          this.B(p0);
          objArray1 = new Object[i];
          a.D().w("CameraScrollTabViewGroupV2", "isLaidOut .", objArray1);
          return;
       }else {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          View obj = PatchProxy.applyOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "24");
          if (obj != patchProxyRe) {
             b = obj.intValue();
          }else {
             obj = this.s(p0.a);
             Object obj1 = PatchProxy.applyOneRefs(obj, this, CameraScrollTabViewGroupV2.class, "26");
             if (obj1 != patchProxyRe) {
                b = obj1.intValue();
             }else {
                b = this.t(obj);
                if (b > 0) {
                   currentScrol = 0;
                   for (int i2 = 0; i2 < b; i2 = i2 + 1) {
                      currentScrol = currentScrol + this.i(this.s(i2));
                   }
                   b = currentScrol;
                }else {
                   b = 0;
                }
             }
             currentScrol = (this.getWidth() / 2) - (this.h(this.s(p0.a)) / 2);
             if (this.s(p0.a) instanceof ViewGroup && p0.b > null) {
                currentScrol = currentScrol - this.k(this.s(p0.a));
             }
             b = b - currentScrol;
          }
          currentScrol = this.getCurrentScrollX();
          CameraScrollTabViewGroupV2 tk = this.k;
          a = tk.a;
          if (a >= null && tk.b >= null) {
             CameraScrollTabViewGroupV2$d a1 = p0.a;
             if (a1 > a || (a1 == a && p0.b == 1)) {
                b = b + this.r(this.s(a));
                currentScrol = currentScrol + this.r(this.s(this.k.a));
             }
          }
          int i1 = currentScrol;
          Object[] objArray2 = new Object[i];
          a.D().w("CameraScrollTabViewGroupV2", "targetScroll : "+b+"  current :"+i1, objArray2);
          this.n.startScroll(i1, 0, (b - i1), 0, this.o);
          CameraScrollTabViewGroupV2 tp = this.p;
          if (tp != null) {
             tp.c(this.u(p0.a));
          }
          this.postInvalidate();
          return;
       }
    }
    public void setSelectedTextColor(int p0){
       if (PatchProxy.isSupport(CameraScrollTabViewGroupV2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CameraScrollTabViewGroupV2.class, "35")) {
          return;
       }
       int i = 0;
       while (i < this.getItemCount()) {
          TextView textView = this.findViewById(this.u(i));
          if (textView != null) {
             textView.setTextColor(this.getResources().getColorStateList(p0));
          }
          i = i + 1;
       }
       return;
    }
    public int t(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.x.indexOfChild(p0);
    }
    public int u(int p0){
       if (PatchProxy.isSupport(CameraScrollTabViewGroupV2.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, CameraScrollTabViewGroupV2.class, "43");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = -1;
       int i1 = this.v.get(p0, i);
       if (i1 != i) {
          return i1;
       }else {
          i1 = this.g(this.s(p0));
          this.v.put(p0, i1);
          return i1;
       }
    }
    public final boolean v(CameraScrollTabViewGroupV2$d p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       CameraScrollTabViewGroupV2$d a = p0.a;
       boolean b = true;
       if (this.k.a != a) {
          return b;
       }
       if (!this.s(a) instanceof ViewGroup) {
          return false;
       }
       if (this.k.b == p0.b) {
          b = false;
       }
       return b;
    }
    public final boolean w(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       ViewGroup$MarginLayoutParams layoutParams = p0.getChildAt(i).getLayoutParams();
       if (layoutParams.getMarginStart() <= 0 || layoutParams.getMarginStart() >= p0.getChildAt(0).getWidth()) {
          i = false;
       }
       return i;
    }
    public final boolean x(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraScrollTabViewGroupV2.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       if (p0.getChildAt(i).getLayoutParams().getMarginStart() != p0.getChildAt(0).getWidth()) {
          i = false;
       }
       return i;
    }
    public boolean y(){
       return this.j;
    }
    public boolean z(){
       Object obj = PatchProxy.apply(null, this, CameraScrollTabViewGroupV2.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.n.isFinished();
    }
}
