package com.yxcorp.gifshow.findsecondfloor.widget.SecondFloorRefreshLayout;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.findsecondfloor.widget.SecondFloorRefreshLayout$a;
import nsd.u;
import android.content.Context;
import java.util.HashSet;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import ll8.c$b;
import android.content.res.TypedArray;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.n;
import com.kwai.library.widget.refresh.KwaiRefreshView;
import java.lang.Integer;
import java.lang.Boolean;
import qfa.a;
import java.lang.Enum;
import o17.j;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import java.util.List;
import java.lang.Float;
import android.view.MotionEvent;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.findsecondfloor.widget.SecondFloorRefreshLayout$b;
import java.lang.Number;
import java.lang.Math;
import trd.x;
import android.widget.RelativeLayout$LayoutParams;
import lnc.a1;
import java.util.Objects;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;
import com.kwai.library.widget.refresh.RefreshLayout$RefreshStyle;
import a2.q;
import p17.c;
import com.kwai.library.widget.refresh.config.KwaiRefreshManager;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import android.net.Uri;
import o17.b;
import o17.a;
import com.kwai.library.widget.refresh.RefreshLayout$LayoutParams;
import p17.a;
import o1b.b;

public final class SecondFloorRefreshLayout extends RefreshLayout	// class@00100a
{
    public int g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public int k1;
    public View l1;
    public boolean m1;
    public boolean n1;
    public HashSet o1;
    public ArrayList p1;
    public View q1;
    public static final SecondFloorRefreshLayout$a r1;

    static {
       SecondFloorRefreshLayout.r1 = new SecondFloorRefreshLayout$a(null);
    }
    public void SecondFloorRefreshLayout(Context p0){
       super(p0);
       this.k1 = -1;
       this.n1 = true;
       this.o1 = new HashSet();
       this.p1 = new ArrayList();
    }
    public void SecondFloorRefreshLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.k1 = -1;
       this.n1 = true;
       this.o1 = new HashSet();
       this.p1 = new ArrayList();
    }
    public View A(){
       KwaiImageView obj = PatchProxy.apply(null, this, SecondFloorRefreshLayout.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KwaiImageView(this.getContext());
       obj.setScaleType(ImageView$ScaleType.CENTER_CROP);
       obj.setLayoutParams(new ViewGroup$LayoutParams(0, 0));
       return obj;
    }
    public View B(AttributeSet p0){
       KwaiRefreshView obj = PatchProxy.applyOneRefs(p0, this, SecondFloorRefreshLayout.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, c$b.n0);
       a.o(typedArray, "context.obtainStyledAttr¡­able.CustomRefreshLayout\)");
       this.g1 = typedArray.getResourceId(0, 0);
       typedArray.recycle();
       int i = n.c(this.getContext(), 22.50f);
       if (this.g1 == null) {
          obj = new KwaiRefreshView(this.getContext());
       }else {
          View view = n.G(this.getContext(), this.g1);
          a.o(view, "ViewUtil.inflate\(context, mRefreshLayout\)");
       }
       if (!obj instanceof KwaiRefreshView) {
          obj.setPadding(i, i, i, i);
       }
       return obj;
    }
    public void I(int p0,boolean p1){
       RefreshLayout tA;
       RefreshLayout tA1;
       float f;
       if (PatchProxy.isSupport(SecondFloorRefreshLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, SecondFloorRefreshLayout.class, "15")) {
          return;
       }
       if (this.K == null) {
          return;
       }
       RefreshLayout tJ = this.J;
       SecondFloorRefreshLayout secondFloorR = 1;
       if (tJ == null) {
       label_0033 :
          this.setOffsetYIfNormal(p0);
       }else {
          int i = a.b[tJ.ordinal()];
          if (i != secondFloorR) {
             if (i != 2) {
                goto label_0033 ;
             }else {
                this.setOffsetYIfPinned(p0);
             }
          }else {
             this.setOffsetYIfFloat(p0);
          }
       }
       RefreshLayout tJ1 = this.J;
       if (tJ1 == null || a.c[tJ1.ordinal()] != secondFloorR) {
          if (!PatchProxy.isSupport(SecondFloorRefreshLayout.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), this, SecondFloorRefreshLayout.class, "16")) {
             tA = this.A;
             this.S.pullProgress(tA, (tA / this.C));
             tJ1 = this.V;
             if (tJ1 != null) {
                tA = this.A;
                tJ1.a(tA, (tA / this.C), p1);
             }
             if (this.W != null) {
                for (tJ1 = 0; tJ1 < this.W.size(); tJ1++) {
                   tA1 = this.A;
                   f = tA1 / this.C;
                   this.W.get(tJ1).a(tA1, f, p1);
                }
             }
          }
       }else if(PatchProxy.isSupport(SecondFloorRefreshLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), this, SecondFloorRefreshLayout.class, "17")){
          tA = this.A;
          this.S.pullProgress(tA, ((tA - this.B) / this.C));
          tJ1 = this.V;
          if (tJ1 != null) {
             tA = this.A;
             tJ1.a(tA, ((tA - this.B) / this.C), p1);
          }
          if (this.W != null) {
             for (tJ1 = 0; tJ1 < this.W.size(); tJ1++) {
                tA1 = this.A;
                f = tA1 - this.B;
                f = f / this.C;
                this.W.get(tJ1).a(tA1, f, p1);
             }
          }
       }
       if (this.X0 != null) {
          tJ1 = this.N;
          if (tJ1 != null) {
             String str = "mRefreshView";
             a.o(tJ1, str);
             if (tJ1.getVisibility() && this.A - (float)0 > 0) {
                tJ1 = this.N;
                a.o(tJ1, str);
                tJ1.setVisibility(0);
                tJ1 = this.P;
                if (tJ1 != null) {
                   a.o(tJ1, "mBackgroundView");
                   tJ1.setVisibility(0);
                }
             }
          }
       }
       this.invalidate();
       return;
    }
    public boolean J(){
       Object obj = PatchProxy.apply(null, this, SecondFloorRefreshLayout.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.h1 == null && (this.i1 != null || this.j1 != null)) {
          return false;
       }
       return super.J();
    }
    public final void M(float p0,boolean p1){
       if (PatchProxy.isSupport(SecondFloorRefreshLayout.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Boolean.valueOf(p1), this, SecondFloorRefreshLayout.class, "29")) {
          return;
       }
       this.w(p0, p1);
       return;
    }
    public final boolean N(){
       return this.m1;
    }
    public final boolean O(){
       return this.h1;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj1;
       Iterator iterator;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] obj = PatchProxy.applyOneRefs(p0, this, SecondFloorRefreshLayout.class, "27");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = null;
       Integer integer = (p0 != null)? Integer.valueOf(p0.getAction()): obj;
       if (integer != null && !integer.intValue()) {
          obj1 = PatchProxy.apply(obj, this, SecondFloorRefreshLayout.class, "36");
          if (obj1 != patchProxyRe) {
             obj1.booleanValue();
          }else {
             iterator = this.o1.iterator();
             while (true) {
                obj1 = 0;
                while (iterator.hasNext()) {
                   if (iterator.next().b() || obj1) {
                      obj1 = 1;
                   }else {
                      continue ;
                   }
                }
             }
          }
       }else if(integer != null && integer.intValue() == 1){
          obj1 = PatchProxy.apply(obj, this, SecondFloorRefreshLayout.class, "37");
          if (obj1 != patchProxyRe) {
             obj1.booleanValue();
          }else {
             iterator = this.o1.iterator();
             while (true) {
                obj1 = 0;
                while (iterator.hasNext()) {
                   if (iterator.next().a() || obj1) {
                      obj1 = 1;
                   }else {
                      continue ;
                   }
                }
             }
          }
       }
       return super.dispatchTouchEvent(p0);
    }
    public final View getBackGroundView(){
       return this.P;
    }
    public int getChildDrawingOrder(int p0,int p1){
       RefreshLayout obj;
       RefreshLayout obj1;
       RefreshLayout tp;
       Object obj3;
       RefreshLayout obj4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(SecondFloorRefreshLayout.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SecondFloorRefreshLayout.class, "4");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       obj = this.J;
       int i = 1;
       if (obj == null || a.a[obj.ordinal()] != i) {
          SecondFloorRefreshLayout secondFloorR = -1;
          if (this.k1 != secondFloorR) {
             if (PatchProxy.isSupport(SecondFloorRefreshLayout.class)) {
                obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p1), this, SecondFloorRefreshLayout.class, "5");
                if (obj1 != patchProxyRe) {
                   obj1 = obj1.intValue();
                }else {
                label_0055 :
                   obj1 = this.o;
                   if (obj1 >= null) {
                      if (!p1) {
                         tp = this.p;
                      }else if(p1 == i){
                         tp = this.k1;
                      }else {
                         int i1 = 2;
                         if (p1 != i1) {
                            SecondFloorRefreshLayout tk1 = this.k1;
                            RefreshLayout tp1 = this.p;
                            if (PatchProxy.isSupport(SecondFloorRefreshLayout.class)) {
                               Object obj2 = PatchProxy.applyThreeRefs(Integer.valueOf(tk1), Integer.valueOf(obj1), Integer.valueOf(tp1), this, SecondFloorRefreshLayout.class, "6");
                               if (obj2 != patchProxyRe) {
                                  obj1 = obj2.intValue();
                               label_00a0 :
                                  if (p1 <= obj1) {
                                     if (PatchProxy.isSupport(SecondFloorRefreshLayout.class)) {
                                        obj3 = PatchProxy.applyOneRefs(Integer.valueOf(p1), this, SecondFloorRefreshLayout.class, "8");
                                        if (obj3 != patchProxyRe) {
                                           p1 = obj3.intValue();
                                        }
                                     }
                                     this.p1.clear();
                                     if (!PatchProxy.applyVoid(null, this, SecondFloorRefreshLayout.class, "7")) {
                                        this.p1.add(Integer.valueOf(this.p));
                                        this.p1.add(Integer.valueOf(this.k1));
                                        this.p1.add(Integer.valueOf(this.o));
                                        x.m0(this.p1);
                                     }
                                     obj3 = p1 - 3;
                                     obj4 = this.p1.get(0);
                                     a.o(obj4, "indexList[0]");
                                     if (a.t(obj3, obj4.intValue()) > 0) {
                                        obj4 = this.p1.get(i);
                                        a.o(obj4, "indexList[1]");
                                        if (a.t(obj3, obj4.intValue()) <= 0) {
                                           p1 = p1 - 2;
                                        }else {
                                           obj4 = this.p1.get(i1);
                                           a.o(obj4, "indexList[2]");
                                           if (a.t(obj3, obj4.intValue()) <= 0) {
                                              p1--;
                                           }
                                        }
                                     }
                                  }
                               }
                            }
                            obj1 = Math.max(tk1, obj1);
                            if (tp1 <= obj1) {
                               tp1 = obj1;
                            }
                            obj1 = tp1;
                            goto label_00a0 ;
                         }
                      }
                   }
                }
             }else {
                goto label_0055 ;
             }
             p1 = obj1;
          }else if(this.p != secondFloorR){
             p1 = this.p(p1);
          }else {
             p1 = this.q(p1);
          }
       }else {
          obj4 = this.o;
          if (obj4 >= null) {
             if (p1 == (p0 - i)) {
                tp = obj4;
             }else if(p1 >= obj4){
                p1++;
             }
          }
       }
       return p1;
    }
    public final View getLoadingView(){
       return this.q1;
    }
    public final View getRefreshTipsView(){
       return this.l1;
    }
    public final View getRefreshView(){
       return this.N;
    }
    public void l(AttributeSet p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SecondFloorRefreshLayout.class, "2")) {
          return;
       }
       super.l(p0);
       Object[] objArray = null;
       View view = PatchProxy.apply(objArray, this, SecondFloorRefreshLayout.class, "12");
       if (view != PatchProxyResult.class) {
       }else {
          view = n.H(this, R.layout.arg_RES_7f0d044e);
          a.o(view, "ViewUtil.inflate\(this, R¡­ault_refresh_tips_layout\)");
       }
       this.l1 = view;
       if (!PatchProxy.applyVoid(objArray, this, SecondFloorRefreshLayout.class, "3")) {
          RefreshLayout tN = this.N;
          if (tN instanceof KwaiRefreshView) {
             view = tN.findViewById(R.id.pull_to_refresh_loading);
             this.q1 = view;
             ViewGroup$LayoutParams layoutParams = (view != null)? view.getLayoutParams(): objArray;
             if (layoutParams instanceof RelativeLayout$LayoutParams) {
                objArray = layoutParams;
             }
             if (objArray != null) {
                objArray.removeRule(13);
             }
             if (objArray != null) {
                objArray.addRule(10);
             }
             if (objArray != null) {
                objArray.addRule(14);
             }
             SecondFloorRefreshLayout tq1 = this.q1;
             if (tq1 != null) {
                tq1.setLayoutParams(objArray);
             }
             RelativeLayout$LayoutParams layoutParams1 = new RelativeLayout$LayoutParams(-1, -2);
             SecondFloorRefreshLayout tq11 = this.q1;
             if (tq11 != null) {
                layoutParams1.addRule(6, tq11.getId());
             }
             layoutParams1.topMargin = a1.e(2.00f);
             tq11 = this.l1;
             if (tq11 != null) {
                tq11.setLayoutParams(layoutParams1);
             }
             tN = this.N;
             Objects.requireNonNull(tN, "null cannot be cast to non-null type com.kwai.library.widget.refresh.KwaiRefreshView");
             tN.addView(this.l1);
          }
       }
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, SecondFloorRefreshLayout.class, "21")) {
          return;
       }
       if (!this.v()) {
          int i = 0;
          int childCount = this.getChildCount();
          while (i < childCount) {
             View childAt = this.getChildAt(i);
             int i1 = a.g(childAt, this.N) ^ 0x01;
             if (i1) {
                i1 = a.g(childAt, this.F) ^ 0x01;
                if (i1) {
                   i1 = a.g(childAt, this.P) ^ 0x01;
                   if (i1) {
                      i1 = a.g(childAt, this.l1) ^ 0x01;
                      if (i1) {
                         this.K = childAt;
                         break ;
                      }
                   }
                }
             }
             i = i + 1;
          }
       }
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, SecondFloorRefreshLayout.class, "31")) {
          return;
       }
       if (this.h1 != null || (this.i1 == null && this.j1 == null)) {
          super.o();
       }
    label_001c :
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SecondFloorRefreshLayout.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.j1 == null && (this.i1 != null || this.m1 != null)) {
          return true;
       }
       return super.onInterceptTouchEvent(p0);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(SecondFloorRefreshLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SecondFloorRefreshLayout.class, "9")) {
          return;
       }
       super.onMeasure(p0, p1);
       int i = 0;
       if (!PatchProxy.isSupport(SecondFloorRefreshLayout.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SecondFloorRefreshLayout.class, "10")) {
          SecondFloorRefreshLayout tl11 = this.l1;
          if (tl11 != null) {
             ViewGroup$LayoutParams layoutParams = tl11.getLayoutParams();
             Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
             int i1 = 0x40000000;
             p0 = (layoutParams.width == -1)? View$MeasureSpec.makeMeasureSpec(Math.max(i, ((((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight()) - layoutParams.leftMargin) - layoutParams.rightMargin)), i1): ViewGroup.getChildMeasureSpec(p0, (((this.getPaddingLeft() + this.getPaddingRight()) + layoutParams.leftMargin) + layoutParams.rightMargin), layoutParams.width);
             p1 = (layoutParams.height == -1)? View$MeasureSpec.makeMeasureSpec(Math.max(i, ((((this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin)), i1): ViewGroup.getChildMeasureSpec(p1, (((this.getPaddingTop() + this.getPaddingBottom()) + layoutParams.topMargin) + layoutParams.bottomMargin), layoutParams.height);
             tl11.measure(p0, p1);
          }
       }
       SecondFloorRefreshLayout tl1 = this.l1;
       if (tl1 != null) {
          this.k1 = -1;
          p1 = this.getChildCount();
          while (i < p1) {
             if (this.getChildAt(i) == tl1) {
                this.k1 = i;
                break ;
             }
             i = i + 1;
          }
       }
       return;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       if (PatchProxy.isSupport(SecondFloorRefreshLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, SecondFloorRefreshLayout.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "child");
       a.p(p1, "target");
       boolean b = (this.isEnabled() && (p2 & 0x02))? true: false;
       return b;
    }
    public boolean onTouchEvent(MotionEvent p0){
       float f1;
       RefreshLayout obj = PatchProxy.applyOneRefs(p0, this, SecondFloorRefreshLayout.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.N()) {
          return true;
       }
       this.n();
       boolean b = false;
       if (this.K == null) {
          return b;
       }
       obj = this.J;
       if (obj == null || a.d[obj.ordinal()] != 1) {
          if (!this.isEnabled() || (this.g(this.K) && this.n == null)) {
             return b;
          }
       }else if(this.isEnabled() && (this.g(this.K) || this.d != null)){
          return b;
       }
       if (this.J == RefreshLayout$RefreshStyle.FLOAT && (this.g(this.K) || this.d != null)) {
          return b;
       }else {
          a.m(p0);
          int action = p0.getAction();
          if (action) {
             int i = 0xbf800000;
             RefreshLayout refreshLayou = -1;
             if (action != 1) {
                if (action != 2) {
                   if (action != 3) {
                      if (action != 5) {
                         if (action == 6) {
                            this.D(p0);
                         }
                      }else {
                         this.C(p0);
                      }
                   }
                }else {
                   obj = this.q;
                   if (obj == refreshLayou) {
                      return b;
                   }else {
                      float f = this.r(p0, obj);
                      if (!f - i) {
                         return b;
                      }else if(this.i != null){
                         f1 = (float)this.getTargetOrRefreshViewTop();
                         this.y = f;
                         this.x = f1;
                      }else {
                         f1 = (((float)this.getOverScrollYOffset() + f) - this.y) + this.x;
                      }
                      if (this.j != null) {
                         f = (float)b;
                         if (f1 - f <= 0) {
                            if (this.n != null) {
                               this.K.dispatchTouchEvent(p0);
                            }else {
                               p0 = MotionEvent.obtain(p0);
                               a.o(p0, "obtain");
                               p0.setAction(b);
                               this.n = true;
                               this.K.dispatchTouchEvent(p0);
                            }
                         }else if(f1 - f > 0 && (f1 - this.C < 0 && this.n != null)){
                            p0 = MotionEvent.obtain(p0);
                            a.o(p0, "obtain");
                            p0.setAction(3);
                            this.n = b;
                            this.K.dispatchTouchEvent(p0);
                         }
                         this.w(f1, true);
                      }else if(this.l != null){
                         float f2 = (float)b;
                         if (f1 - f2 > 0) {
                            this.w(f1, true);
                         }else if(this.A - f2 > 0){
                            this.w(f1, true);
                         }else {
                            return b;
                         }
                      }else {
                         this.t(f);
                      }
                   }
                }
             }
             obj = this.q;
             if (obj == refreshLayou || !this.r(p0, obj) - i) {
                this.G();
                return b;
             }else if(this.j != null || this.i != null){
                if (this.n != null) {
                   this.K.dispatchTouchEvent(p0);
                }
                this.G();
                return b;
             }else {
                this.G();
                this.o();
                return b;
             }
          }else {
             this.q = q.e(p0, b);
             this.l = b;
          }
          return true;
       }
    }
    public final void setEnableSecondFloor(boolean p0){
       this.n1 = p0;
    }
    public final void setEnteringFirstFloor(boolean p0){
       this.j1 = p0;
    }
    public final void setEnteringSecondFloor(boolean p0){
       this.i1 = p0;
    }
    public final void setGuideMode(boolean p0){
       this.m1 = p0;
    }
    public final void setInSecondFloor(boolean p0){
       this.h1 = p0;
    }
    public final void setOffsetYIfFloat(int p0){
       if (PatchProxy.isSupport(SecondFloorRefreshLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SecondFloorRefreshLayout.class, "20")) {
          return;
       }
       RefreshLayout tN = this.N;
       if (tN != null) {
          tN.offsetTopAndBottom(p0);
       }
       tN = this.P;
       if (tN != null) {
          tN.offsetTopAndBottom(p0);
       }
       tN = this.N;
       if (tN != null) {
          tN.offsetTopAndBottom(p0);
       }
       RefreshLayout tN1 = this.N;
       float f = (tN1 != null)? (float)tN1.getTop(): 0;
       this.A = f;
       return;
    }
    public final void setOffsetYIfNormal(int p0){
       if (PatchProxy.isSupport(SecondFloorRefreshLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SecondFloorRefreshLayout.class, "18")) {
          return;
       }
       this.K.offsetTopAndBottom(p0);
       RefreshLayout tF = this.F;
       if (tF != null) {
          tF.offsetTopAndBottom(p0);
       }
       float f = ((float)p0 / this.D) + this.E;
       int i = (int)f;
       this.E = f - (float)i;
       RefreshLayout tN = this.N;
       if (tN != null) {
          tN.offsetTopAndBottom(i);
       }
       tN = this.P;
       if (tN != null) {
          tN.offsetTopAndBottom(i);
       }
       tN = this.K;
       a.o(tN, "mTarget");
       this.A = (float)tN.getTop();
       return;
    }
    public final void setOffsetYIfPinned(int p0){
       if (PatchProxy.isSupport(SecondFloorRefreshLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SecondFloorRefreshLayout.class, "19")) {
          return;
       }
       this.K.offsetTopAndBottom(p0);
       RefreshLayout tF = this.F;
       if (tF != null) {
          tF.offsetTopAndBottom(p0);
       }
       RefreshLayout tK = this.K;
       a.o(tK, "mTarget");
       this.A = (float)tK.getTop();
       return;
    }
    public void setRefreshing(boolean p0){
       if (PatchProxy.isSupport(SecondFloorRefreshLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SecondFloorRefreshLayout.class, "33")) {
          return;
       }
       if (this.h1 != null || (this.i1 == null && this.j1 == null)) {
          super.setRefreshing(p0);
       }
    label_0027 :
       return;
    }
    public boolean v(){
       RefreshLayout obj = PatchProxy.apply(null, this, SecondFloorRefreshLayout.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.K;
       if (obj == this.F || (obj == this.N || (obj != this.P && obj != this.l1))) {
          int childCount = this.getChildCount();
          int i = 0;
          while (i < childCount) {
             if (this.K == this.getChildAt(i)) {
                return true;
             }
             i = i + 1;
          }
       }
       return false;
    }
    public void w(float p0,boolean p1){
       if (PatchProxy.isSupport(SecondFloorRefreshLayout.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Boolean.valueOf(p1), this, SecondFloorRefreshLayout.class, "30")) {
          return;
       }
       if (this.h1 != null || (this.i1 == null && this.j1 == null)) {
          super.w(p0, p1);
       }
    label_002b :
       return;
    }
    public void x(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SecondFloorRefreshLayout.class, "14")) {
          return;
       }
       a.p(p0, "view");
       if (!p0 instanceof KwaiImageView) {
          return;
       }
       c uoc = KwaiRefreshManager.a();
       if (uoc != null) {
          int i = uoc.c();
          int i1 = uoc.b();
          String str = uoc.a();
          if (TextUtils.x(str) || (i > 0 && i1 > 0)) {
             p0.setScaleType(ImageView$ScaleType.CENTER_CROP);
             p0.setLayoutParams(new ViewGroup$LayoutParams(Math.min(n.c(this.getContext(), (float)i), n.z(this.getContext())), n.c(this.getContext(), (float)i1)));
             p0.setImageURI(Uri.fromFile(new File(str)));
          }
       }
       return;
    }
    public b y(){
       Object obj = PatchProxy.apply(null, this, SecondFloorRefreshLayout.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.getContext());
    }
    public RefreshLayout$LayoutParams z(AttributeSet p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SecondFloorRefreshLayout.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, c$b.n0);
       a.o(typedArray, "context.obtainStyledAttr¡­able.CustomRefreshLayout\)");
       int layoutDimens = typedArray.getLayoutDimension(2, this.v);
       int i = 1;
       if (typedArray.hasValue(i)) {
          layoutDimens = typedArray.getLayoutDimension(i, this.v);
       }else if(layoutDimens < 0){
          layoutDimens = this.v;
       }
       i = (KwaiRefreshManager.e(null, i, null) && b.a("h"))? a1.e(80.00f): a1.e(70.00f);
       if (layoutDimens < i) {
          layoutDimens = i;
       }
       typedArray.recycle();
       return new RefreshLayout$LayoutParams(-1, layoutDimens);
    }
}
