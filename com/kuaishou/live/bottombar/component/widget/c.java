package com.kuaishou.live.bottombar.component.widget.c;
import com.kuaishou.live.bottombar.component.widget.a;
import androidx.lifecycle.LifecycleOwner;
import w61.c;
import ok.x;
import java.lang.Object;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import com.kuaishou.live.bottombar.component.widget.c$a;
import o61.d;
import java.lang.String;
import qp.b;
import dp3.g;
import dp3.f;
import java.util.List;
import java.util.Map;
import o61.b;
import z61.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import android.view.ViewGroup;
import java.lang.Integer;
import z61.c;
import android.content.Context;
import android.view.View;
import o61.c;
import j61.c;
import n61.b;
import u61.c;
import u61.c$a;
import a71.b;
import java.lang.Boolean;
import java.util.Iterator;
import a71.c;
import ekd.q;
import a71.d;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import z61.l;
import w61.a;
import com.kuaishou.live.bottombar.component.widget.a$a;
import java.lang.Runnable;
import o61.e;
import android.view.LayoutInflater;
import android.view.View$OnAttachStateChangeListener;
import java.util.Collection;

public abstract class c implements a	// class@000d47
{
    public final LifecycleOwner b;
    public final c c;
    public final SparseBooleanArray d;
    public final Map e;
    public final x f;
    public HashMap g;
    public Map h;
    public ViewGroup i;
    public List j;
    public int k;
    public a$a l;
    public Runnable m;
    public boolean n;
    public final View$OnAttachStateChangeListener o;
    public final c$a p;

    public void c(LifecycleOwner p0,c p1,x p2){
       super();
       this.d = new SparseBooleanArray();
       this.e = new HashMap(8);
       this.o = new c$a(this);
       this.p = new d(this);
       this.b = p0;
       this.c = p1;
       this.f = p2;
       b.e("LiveBaseBottomBarWidget", " bottom bar widget init ", "widget ", this);
    }
    public void A(int p0){
       f.b(this, p0);
    }
    public Map B(List p0,List p1){
       return null;
    }
    public b C(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && (p0.n() == null || p0.n().getValue() == null)) {
          return null;
       }
       return p0.n().getValue();
    }
    public b D(ViewGroup p0,MutableLiveData p1){
       b obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p1.getValue();
       if (obj == null) {
          return null;
       }
       b uob = this.e.get(Integer.valueOf(obj.mFeatureId));
       if (uob != null) {
          return uob;
       }
       c viewItemInst = obj.getViewItemInstanceFactory();
       if (viewItemInst == null) {
          return null;
       }
       uob = viewItemInst.a();
       if (uob == null) {
          return null;
       }
       uob.y(this.b, p1);
       uob.r(p0.getContext(), p0);
       View view = uob.f();
       if (view == null) {
          return null;
       }
       uob.w();
       uob.u(new c(this, obj));
       b mFeatureId = obj.mFeatureId;
       obj = b.class;
       if (!PatchProxy.isSupport(obj) || !PatchProxy.applyVoidTwoRefs(view, Integer.valueOf(mFeatureId), null, obj, "2")) {
          view.setTag(Integer.valueOf(mFeatureId));
       }
       if (uob instanceof c) {
          uob.p(this.p);
       }
       return uob;
    }
    public final void E(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "17")) {
          return;
       }
       this.F(p0);
       p0 = this.C(p0);
       if (p0 != null && p0.mHiddenCallback != null) {
          b.f("LiveBaseBottomBarWidget", "BottomBarItem Hidden", "mText", p0.mText, "mFeatureId", Integer.valueOf(p0.mFeatureId));
          p0.mHiddenCallback.D();
       }
       return;
    }
    public boolean E1(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.e.containsKey(Integer.valueOf(p0));
    }
    public final void F(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "18")) {
          return;
       }
       p0.a();
       if (p0 instanceof c) {
          p0.p(null);
       }
       return;
    }
    public void F1(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "7")) {
          return;
       }
       uoc = this.j;
       if (uoc == null) {
          return;
       }
       Iterator iterator = uoc.iterator();
       while (iterator.hasNext()) {
          iterator.next().q(p0);
       }
       return;
    }
    public final void G(b p0){
       b mFeatureId;
       boolean b;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "19")) {
          return;
       }
       b.f("LiveBaseBottomBarWidget", "BottomBarItem Show", "mText", p0.mText, "mFeatureId", Integer.valueOf(p0.mFeatureId));
       b mShowCallbac = p0.mShowCallback;
       if (mShowCallbac != null) {
          mShowCallbac.onShow();
       }
       if (!q.h(this.g)) {
          d uod = this.g.get(Integer.valueOf(p0.mFeatureId));
          if (uod != null) {
             uod.onShow();
          }
       }
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "20") || (!this.d.get(p0.mFeatureId, false) && p0.mShouldReportLogWithBottomBar != null)) {
          this.d.append(p0.mFeatureId, true);
          String str = null;
          mShowCallbac = p0.mShowLogParamsSupplier;
          if (mShowCallbac != null) {
             JsonObject jsonObject = mShowCallbac.get();
             if (jsonObject != null) {
                str = jsonObject.toString();
             }
          }
          String str1 = str;
          mFeatureId = p0.mFeatureId;
          c tk = this.k;
          c tc = this.c;
          b = (p0 instanceof l && p0.mIsSelected != null)? true: false;
          a.b(0, mFeatureId, tk, tc, false, b, this.f.get(), str1, false);
       }
    label_0095 :
       return;
    }
    public Map G1(){
       return this.h;
    }
    public abstract void H(boolean p0,List p1,List p2);
    public final void H1(a$a p0){
       this.l = p0;
    }
    public void J1(String p0,int p1,List p2,List p3,Map p4){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoc, "6")) {
             return;
          }
       }
       uoc = this.i;
       if (uoc == null) {
          return;
       }else {
          uoc.removeCallbacks(this.m);
          e uoe = new e(this, p0, p1, p2, p3, p4);
          this.m = uoc;
          this.i.post(uoc);
          return;
       }
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       b.e("LiveBaseBottomBarWidget", " onWidgetAttached ", "widget ", this);
       c tl = this.l;
       if (tl != null) {
          tl.b();
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       b.e("LiveBaseBottomBarWidget", " onWidgetDetached ", "widget ", this);
       return;
    }
    public final View getView(){
       return this.i;
    }
    public final void i(LayoutInflater p0,ViewGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       ViewGroup viewGroup = this.t(p0, p1);
       this.i = viewGroup;
       viewGroup.addOnAttachStateChangeListener(this.o);
       return;
    }
    public void release(){
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "2")) {
          return;
       }
       boolean b = false;
       boolean b1 = (this.i == null)? true: false;
       Boolean uBoolean = Boolean.valueOf(b1);
       if (this.m == null) {
          b = true;
       }
       b.g("LiveBaseBottomBarWidget", " bottom bar widget release ", "mBottomBarContainer ", uBoolean, "mUpdateBottomBarRunnable ", Boolean.valueOf(b), "widget ", this);
       this.n = true;
       c ti = this.i;
       if (ti == null) {
          return;
       }else {
          ti.removeCallbacks(this.m);
          this.i.removeOnAttachStateChangeListener(this.o);
          if (!PatchProxy.applyVoid(null, this, uoc, "16")) {
             Collection uCollection = this.e.values();
             if (!q.f(uCollection)) {
                Iterator iterator = uCollection.iterator();
                while (iterator.hasNext()) {
                   b uob = iterator.next();
                   this.F(uob);
                   uob.a();
                }
                this.e.clear();
             }
          }
          this.d.clear();
          this.g = null;
          this.h = null;
          this.i.removeAllViews();
          return;
       }
    }
    public abstract ViewGroup t(LayoutInflater p0,ViewGroup p1);
}
