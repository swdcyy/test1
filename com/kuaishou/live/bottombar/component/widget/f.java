package com.kuaishou.live.bottombar.component.widget.f;
import com.kuaishou.live.bottombar.component.widget.c;
import androidx.lifecycle.LifecycleOwner;
import w61.c;
import ok.x;
import o61.g;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.bottombar.component.widget.LiveBottomBarLinearLayout;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import o61.b;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import z61.b;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Integer;
import android.view.View;
import n61.b;
import java.util.Map;
import java.lang.Math;
import com.kuaishou.live.bottombar.component.widget.a$a;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.robust.PatchProxyResult;
import y61.a;
import android.view.View$OnLayoutChangeListener;
import android.view.LayoutInflater;
import android.content.Context;

public class f extends c	// class@000d4b
{
    public int q;
    public View$OnLayoutChangeListener r;

    public void f(LifecycleOwner p0,c p1,x p2){
       super(p0, p1, p2);
       this.r = new g(this);
    }
    public void H(boolean p0,List p1,List p2){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, f.class, "5")) {
          return;
       }
       c ti = this.i;
       if (ti == null) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(ti, p2, this, uof, "6") && !q.f(p2)) {
          Iterator iterator1 = p2.iterator();
          while (iterator1.hasNext()) {
             b uob2 = iterator1.next();
             if (uob2 == null) {
                continue ;
             }else {
                this.E(uob2);
                MutableLiveData mutableLiveD = uob2.n();
                if (mutableLiveD != null && mutableLiveD.getValue() != null) {
                   uob2 = mutableLiveD.getValue();
                   this.J(ti.getLeftLayout(), uob2);
                   this.J(ti.getRightLayout(), uob2);
                }
             }
          }
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          b uob1 = this.C(uob);
          if (uob1 == null) {
             continue ;
          }else if(uob1.mIsRightAlign != null){
             uArrayList1.add(uob);
          }else {
             uArrayList.add(uob);
          }
       }
       this.I(p0, this.i.getLeftLayout(), uArrayList);
       Collections.reverse(uArrayList1);
       this.I(p0, this.i.getRightLayout(), uArrayList1);
       return;
    }
    public final void I(boolean p0,ViewGroup p1,List p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, f.class, "8")) {
          return;
       }
       int i = 0;
       while (i < p2.size()) {
          b uob = p2.get(i);
          if (uob != null && (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), p1, Integer.valueOf(i), uob, this, f.class, "9"))) {
             b uob1 = this.C(uob);
             if (uob1 != null && (b.b(p1, uob1.mFeatureId) == null || p0)) {
                View view = uob.f();
                if (view != null) {
                   this.e.put(Integer.valueOf(uob1.mFeatureId), uob);
                   b.a(uob1.mFeatureId, view, this.e);
                   Integer int i1 = Math.min(i, p1.getChildCount());
                   c tl = this.l;
                   if (tl != null) {
                      tl.a(uob);
                   }
                   p1.addView(view, i1);
                   if (!PatchProxy.applyVoidOneRefs(view, this, f.class, "10")) {
                      c ti = this.i;
                      if (ti != null) {
                         i1 = -2;
                         int i2 = (!ti.getItemWidth())? -2: this.i.getItemWidth();
                         if (view.getLayoutParams() != null) {
                            view.getLayoutParams().width = i2;
                         }else {
                            view.setLayoutParams(new ViewGroup$MarginLayoutParams(i2, i1));
                         }
                      }
                   }
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
       if (PatchProxy.isSupport(f.class)) {
          obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, f.class, "4");
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
    public final void J(ViewGroup p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "7")) {
          return;
       }
       View view = b.b(p0, p1.mFeatureId);
       if (view != null) {
          p0.removeView(view);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       super.c();
       this.getView().addOnLayoutChangeListener(this.r);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.getView().removeOnLayoutChangeListener(this.r);
       return;
    }
    public ViewGroup t(LayoutInflater p0,ViewGroup p1){
       LiveBottomBarLinearLayout liveBottomBa = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "1");
       if (liveBottomBa != PatchProxyResult.class) {
       }else {
          liveBottomBa = new LiveBottomBarLinearLayout(p1.getContext());
       }
       return liveBottomBa;
    }
}
