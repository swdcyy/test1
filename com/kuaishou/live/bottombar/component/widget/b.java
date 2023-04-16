package com.kuaishou.live.bottombar.component.widget.b;
import com.kuaishou.live.bottombar.component.widget.c;
import androidx.lifecycle.LifecycleOwner;
import w61.c;
import ok.x;
import java.util.List;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.bottombar.component.widget.LiveAudienceBottomBarLayout;
import java.util.HashMap;
import java.util.Iterator;
import o61.b;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import z61.b;
import java.lang.Integer;
import android.view.View;
import u61.a;
import u61.b;
import c71.e;
import java.lang.Number;
import android.view.ViewGroup$LayoutParams;
import qp.b;
import z61.a;
import z61.a$a;
import java.util.ArrayList;
import java.lang.Boolean;
import android.view.ViewGroup;
import java.util.Collections;
import n61.b;
import java.lang.Math;
import com.kuaishou.live.bottombar.component.widget.a$a;
import y61.a;
import android.content.Context;
import android.widget.RelativeLayout;
import android.content.res.Resources;
import cw9.c;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.LayoutInflater;

public class b extends c	// class@000d45
{
    public int q;

    public void b(LifecycleOwner p0,c p1,x p2){
       super(p0, p1, p2);
    }
    public Map B(List p0,List p1){
       int i3;
       int i4;
       int i5;
       ViewGroup$LayoutParams width;
       a a;
       Object obj = this;
       Object obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "2";
       Object obj2 = PatchProxy.applyTwoRefs(obj1, p1, obj, b.class, str);
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       if (obj.i != null && (q.f(p0) || q.f(p1))) {
          return null;
       }
       int containerWid = obj.i.getContainerWidth();
       HashMap hashMap = new HashMap();
       HashMap hashMap1 = new HashMap();
       int i = p0.size() - 1;
       Iterator iterator = p0.iterator();
       int i1 = 0;
       a uoa = null;
       int i2 = 0;
       while (iterator.hasNext()) {
          Object obj3 = iterator.next();
          MutableLiveData mutableLiveD = obj3.n();
          if (mutableLiveD == null || mutableLiveD.getValue() == null) {
             i3 = p1;
          }else {
             hashMap1.put(Integer.valueOf(mutableLiveD.getValue().mFeatureId), obj3);
             View view = obj3.f();
             if (obj3 instanceof a) {
                i4 = obj3.l();
                if (uoa == null) {
                   i2 = i4;
                   uoa = obj3;
                }else {
                   uoa.v(i4);
                }
                i4 = i2;
                i3 = 0;
             }else if(obj3 instanceof b){
                i2 = obj3.t();
                i4 = i2;
             }else {
                e uoe = e.class;
                obj3 = PatchProxy.applyOneRefs(view, null, uoe, "1");
                if (obj3 != patchProxyRe) {
                   i5 = obj3.intValue();
                label_00b4 :
                   i3 = 0;
                }else if(view == null || view.getVisibility() == 8){
                   i5 = 0;
                }else {
                   PatchProxy.applyVoidOneRefs(view, null, uoe, str);
                   if (view.getLayoutParams() != null) {
                      width = view.getLayoutParams().width;
                      if (width > null) {
                         i5 = width;
                         goto label_00b4 ;
                      }
                   }
                   if (!view.getMeasuredWidth()) {
                      view.measure(0, 0);
                   }else {
                      width = 0;
                   }
                   i5 = view.getMeasuredWidth();
                }
                i4 = i2;
                i2 = i5;
             }
             b.f("LiveAudienceBottomBarWidget", "MeasureItemWidth", "view", view, "width", Integer.valueOf(i2));
             hashMap.put(Integer.valueOf(mutableLiveD.getValue().mFeatureId), Integer.valueOf(i2));
             i1 = i1 + i2;
             if (i > 0) {
                i = i - 1;
                i1 = i1 + this.J();
             }
             i2 = i4;
          }
          obj3 = 1;
       }
       HashMap hashMap2 = new HashMap();
       if (i1 > containerWid) {
          Iterator iterator1 = p1.iterator();
          while (iterator1.hasNext()) {
             Integer integer = iterator1.next();
             Integer integer1 = hashMap.get(integer);
             b uob = hashMap1.get(integer);
             if (integer1 == null || uob == null) {
                integer1 = 1;
             }else {
                i4 = integer1.intValue() + this.J();
                i1 = i1 - i4;
                if (uob == uoa) {
                   uoa = null;
                }
                obj.F(uob);
                obj1.remove(uob);
                if (!PatchProxy.applyVoidTwoRefs(hashMap2, uob, obj, b.class, "3")) {
                   MutableLiveData mutableLiveD1 = uob.n();
                   if (mutableLiveD1 != null && mutableLiveD1.getValue() != null) {
                      b value = mutableLiveD1.getValue();
                      if (value != null && value instanceof a) {
                         a = value.a;
                         if (a != null) {
                            List list = hashMap2.get(Integer.valueOf(a.a));
                            if (list == null) {
                               ArrayList uArrayList = new ArrayList();
                               uArrayList.add(mutableLiveD1);
                               hashMap2.put(Integer.valueOf(a.a), uArrayList);
                            }else if(!list.contains(mutableLiveD1)){
                               list.add(mutableLiveD1);
                            }
                         }
                      }
                   }
                }
                if (i1 > containerWid && p0.size() > 1) {
                }
             }
          }
       }
       if (uoa != null && i2 > 0) {
          uoa.v(((containerWid - i1) + i2));
       }
       HashMap hashMap3 = (hashMap2.size() > 0)? hashMap2: null;
       return hashMap3;
    }
    public void H(boolean p0,List p1,List p2){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, b.class, "5")) {
          return;
       }
       c ti = this.i;
       if (ti == null) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(ti, p2, this, uob, "6") && !q.f(p2)) {
          Iterator iterator1 = p2.iterator();
          while (iterator1.hasNext()) {
             uob = iterator1.next();
             if (uob == null) {
                continue ;
             }else {
                this.E(uob);
                MutableLiveData mutableLiveD = uob.n();
                if (mutableLiveD != null && mutableLiveD.getValue() != null) {
                   uob = mutableLiveD.getValue();
                   this.K(ti.getLeftLayout(), uob);
                   this.K(ti.getRightLayout(), uob);
                }
             }
          }
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          uob = iterator.next();
          b uob1 = this.C(uob);
          if (uob1 == null) {
             continue ;
          }else if(uob1.mIsRightAlign != null){
             uArrayList1.add(uob);
          }else {
             uArrayList.add(uob);
          }
       }
       Collections.reverse(uArrayList1);
       this.I(this.i.getLeftLayout(), uArrayList);
       this.L(this.i.getLeftLayout(), false);
       this.I(this.i.getRightLayout(), uArrayList1);
       this.L(this.i.getRightLayout(), true);
       return;
    }
    public final void I(ViewGroup p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "8")) {
          return;
       }
       int i = 0;
       while (i < p1.size()) {
          b uob = p1.get(i);
          if (uob != null && (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(i), uob, this, b.class, "9"))) {
             b uob1 = this.C(uob);
             if (uob1 != null && b.b(p0, uob1.mFeatureId) == null) {
                View view = uob.f();
                if (view != null) {
                   this.e.put(Integer.valueOf(uob1.mFeatureId), uob);
                   b.a(uob1.mFeatureId, view, this.e);
                   int i1 = Math.min(i, p0.getChildCount());
                   c tl = this.l;
                   if (tl != null) {
                      tl.a(uob);
                   }
                   p0.addView(view, i1);
                   this.G(uob1);
                }
             }
          }
          i = i + 1;
       }
       return;
    }
    public int[] I1(boolean p0,int p1,int p2){
       c obj;
       ViewGroup rightLayout;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, b.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.i;
       if (obj == null) {
          return null;
       }else if(p0){
          rightLayout = obj.getRightLayout();
       }else {
          rightLayout = obj.getLeftLayout();
       }
       View view = b.b(rightLayout, p1);
       if (view == null) {
          return null;
       }else {
          return a.a(view, p2);
       }
    }
    public final int J(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = PatchProxy.apply(null, this, uob, "11");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       if (this.q <= null) {
          if (PatchProxy.isSupport(uob)) {
             Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(R.dimen.arg_RES_7f070625), this, uob, "12");
             if (obj1 != patchProxyRe) {
                i = obj1.intValue();
             }else {
             label_0034 :
                c ti = this.i;
                i = (ti == null)? 0: c.a(ti.getContext().getResources(), R.dimen.arg_RES_7f070625);
             }
          }else {
             goto label_0034 ;
          }
          this.q = i;
       }
       return this.q;
    }
    public final void K(ViewGroup p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "7")) {
          return;
       }
       View view = b.b(p0, p1.mFeatureId);
       if (view != null) {
          p0.removeView(view);
       }
       return;
    }
    public final void L(ViewGroup p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "10")) {
          return;
       }
       int childCount = p0.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = p0.getChildAt(i);
          ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
          if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
             if (p1) {
                ViewGroup$LayoutParams layoutParams1 = layoutParams;
                int i1 = (!i)? 0: this.J();
                layoutParams1.leftMargin = i1;
             }else {
                layoutParams.rightMargin = this.J();
             }
             childAt.setLayoutParams(layoutParams);
          }
          i = i + 1;
       }
       return;
    }
    public ViewGroup t(LayoutInflater p0,ViewGroup p1){
       LiveAudienceBottomBarLayout liveAudience = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (liveAudience != PatchProxyResult.class) {
       }else {
          liveAudience = new LiveAudienceBottomBarLayout(p1.getContext());
       }
       return liveAudience;
    }
}
