package com.yxcorp.gifshow.camera.record.sidebar.g;
import oc9.b0;
import oh9.v;
import com.yxcorp.gifshow.camera.record.sidebar.j;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.kuaishou.viewbinder.ViewBinderOption;
import com.yxcorp.gifshow.camera.record.base.d;
import zg9.g;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import j8c.a;
import java.lang.Object;
import java.lang.String;
import q87.c;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lnc.s6;
import o56.c;
import o56.a;
import xf6.l;
import android.view.View;
import com.yxcorp.utility.n;
import oc9.a0;
import com.yxcorp.gifshow.camera.record.sidebar.AbsRecordSideBarViewBinder;
import java.lang.Integer;
import com.yxcorp.gifshow.camera.record.sidebar.DefaultRecordSlideBarViewBinder;
import c35.c;
import com.kuaishou.viewbinder.IViewBinder;
import java.util.List;
import tkd.b;
import tkd.d;
import om6.r;
import nm6.c;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import android.content.Context;
import android.view.ViewGroup;
import com.kuaishou.ax2c.PreLoader;
import com.yxcorp.gifshow.camera.record.sidebar.g$a;
import com.kuaishou.ax2c.PreLoader$InflateListener;
import i2b.a;
import oc9.y;
import oc9.x;
import wd9.a;
import lnc.a1;
import in6.b;
import java.util.ArrayList;
import java.util.Iterator;
import zg9.e;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import android.util.SparseIntArray;
import com.yxcorp.gifshow.camera.record.sidebar.b;
import java.util.Collection;
import com.google.common.collect.e;
import com.google.common.collect.e$a;
import com.google.common.collect.AbstractIterator;
import com.yxcorp.gifshow.camera.record.sidebar.c;
import zg9.i;
import java.util.Comparator;
import java.util.Collections;
import ekd.q;
import android.app.Application;
import android.widget.LinearLayout$LayoutParams;
import android.content.res.Resources;
import cw9.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.widget.textview.PressedDisableWithAlphaTextImageView;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.yxcorp.gifshow.widget.textview.TextImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.StringBuilder;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.camera.record.sidebar.f;
import android.view.ViewTreeObserver$OnDrawListener;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import di9.b;
import com.yxcorp.gifshow.camera.record.sidebar.SideBarViewBinder;
import com.yxcorp.gifshow.camera.record.sidebar.e;
import java.lang.Runnable;
import android.view.ViewStub;
import com.kuaishou.edit.draft.Asset$b;
import oh9.u;
import oc9.w;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import ra9.c;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import android.content.Intent;
import rh9.i0;
import zg9.h;
import erd.g;
import crd.b;

public class g extends j implements b0, v	// class@000f17
{
    public boolean M;
    public boolean N;
    public boolean O;
    public ViewBinderOption P;
    public c Q;
    public boolean R;
    public static final int[] S;

    static {
       g.S = new int[13]{0x7f0d0171,0x7f0d012a,0x7f0d0225,0x7f0d0174,0x7f0d0172,0x7f0d0175,0x7f0d0178,0x7f0d0176,0x7f0d1562,0x7f0d017a,0x7f0d017b,0x7f0d0173,0x7f0d00df};
    }
    public void g(CameraPageType p0,b p1,ViewBinderOption p2){
       super(p0, p1);
       this.P = p2;
       this.d.n(v.class, new g(this));
       Object[] objArray = new Object[0];
       a.D().w("RecordSideBarController", "RecordSideBarController constructor", objArray);
    }
    public static boolean I2(){
       Object obj = PatchProxy.apply(null, null, g.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (s6.G()) {
          obj = (a.a().c() && l.c("KEY_POST_CAMERA_STARTUP_OPT_DISABLE_SIDE_BAR", false))? 1: 0;
          if (!obj) {
          label_0035 :
             return b;
          }
       }
       b = false;
       goto label_0035 ;
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, g.class, "12")) {
          return;
       }
       this.O = false;
       n.Y(this.u, false, true);
       if (this.l2() && this.M == null) {
          n.Y(this.w, false, true);
       }
       return;
    }
    public boolean D2(){
       return true;
    }
    public void E0(){
       a0.n(this);
    }
    public AbsRecordSideBarViewBinder E2(int p0){
       g obj;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.P;
       if (obj == null) {
          return new DefaultRecordSlideBarViewBinder(this.d.i());
       }else {
          return obj.b(AbsRecordSideBarViewBinder.class, this.d.i());
       }
    }
    public List F2(){
       Object obj = PatchProxy.apply(null, this, g.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(-831446984).sH().b;
    }
    public final View H2(Context p0,ViewGroup p1,int p2){
       View obj;
       if (PatchProxy.isSupport(g.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, g.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = null;
       if (g.I2()) {
          obj = PreLoader.getInstance().getOrWait(p0, p2, p1, false, true, new g$a(this));
       }
       if (obj == null) {
          obj = a.i(p1, p2);
          Object[] objArray = new Object[0];
          a.D().w("RecordSideBarController", "inflateView, use KwaiLayoutInflater.inflate", objArray);
       }
       return obj;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, g.class, "11")) {
          return;
       }
       this.O = true;
       n.Y(this.u, 4, true);
       if (this.l2()) {
          n.Y(this.w, 4, true);
       }
       return;
    }
    public boolean Kc(){
       return a0.c(this);
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, g.class, "13")) {
          return;
       }
       this.O = false;
       if (this.M == null) {
          n.Y(this.u, false, true);
          if (this.l2()) {
             n.Y(this.w, false, true);
          }
       }
       return;
    }
    public void Q(View p0){
       Iterator iterator;
       b uob;
       View view;
       b uob1;
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, og, "3")) {
          return;
       }
       x.a(this, p0);
       Object[] objArray = new Object[0];
       a.D().w("RecordSideBarController", "onCreateView", objArray);
       this.N = this.d.d(a.i).a;
       ViewGroup viewGroup = p0.findViewById(R.id.camera_sidebar_layout);
       if (!PatchProxy.applyVoidOneRefs(viewGroup, this, og, "18")) {
          objArray = new Object[0];
          a.D().w("RecordSideBarController", "initSidebarList", objArray);
          long l = a1.k();
          Object[] objArray1 = null;
          ArrayList uArrayList = PatchProxy.apply(objArray1, this, og, "22");
          if (uArrayList != PatchProxyResult.class) {
          }else {
             List list = this.F2();
             List list1 = this.d.e(b.class);
             ArrayList uArrayList1 = new ArrayList();
             ArrayList uArrayList2 = new ArrayList();
             Iterator iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                uob1 = iterator1.next();
                Optional optional = y.y(list1, new e(uob1));
                if (optional.isPresent()) {
                   b uob2 = optional.get();
                   ArrayList uArrayList3 = (uob1.O0() >= 0 || uob2.O0() >= 0)? uArrayList2: uArrayList1;
                   if (!uob1.R() && (uob1.T() || uob1.a1())) {
                      uArrayList3.add(uob1);
                   }else {
                      uArrayList3.add(uob2);
                   }
                }
             }
             SparseIntArray sparseIntArr = new SparseIntArray();
             iterator1 = e.c(uArrayList2, b.b).iterator();
             Iterator iterator2 = iterator1;
             while (iterator2.hasNext()) {
                uob1 = iterator2.next();
                int i = uob1.Y0();
                sparseIntArr.put(i, uob1.O0());
             }
             iterator = e.c(list, c.b).iterator();
             iterator1 = iterator;
             while (iterator1.hasNext()) {
                b uob3 = iterator1.next();
                int i1 = uob3.Y0();
                sparseIntArr.put(i1, uob3.O0());
             }
             Collections.sort(uArrayList2, new i(sparseIntArr));
             iterator = uArrayList2.iterator();
             while (iterator.hasNext()) {
                uob = iterator.next();
                int i2 = sparseIntArr.get(uob.Y0());
                if (i2 >= 0 && i2 < uArrayList1.size()) {
                   uArrayList1.add(i2, uob);
                }else {
                   uArrayList1.add(uob);
                }
             }
             uArrayList = uArrayList1;
          }
          if (!q.f(uArrayList) && viewGroup != null) {
             Application uApplication = a.b();
             iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                uob = iterator.next();
                long l1 = a1.k();
                LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -2);
                layoutParams.topMargin = c.a(uApplication.getResources(), 0x7f070139);
                if (uob.R()) {
                   view = this.H2(this.d.a(), viewGroup, uob.R());
                   viewGroup.addView(view, layoutParams);
                }else if(uob.T() || uob.a1()){
                   PressedDisableWithAlphaTextImageView pressedDisab = this.H2(this.d.a(), viewGroup, R.layout.camera_item_normal);
                   pressedDisab.setTopDrawable(ContextCompat.getDrawable(uApplication, uob.T()));
                   pressedDisab.setText(uApplication.getString(uob.a1()));
                   viewGroup.addView(pressedDisab, layoutParams);
                   view = pressedDisab;
                }else {
                   view = objArray1;
                }
                Object[] objArray2 = new Object[0];
                a.D().w("RecordSideBarController", "initSidebarList, cost:"+a1.o(l1)+" , child:"+view, objArray2);
             }
             viewGroup.getViewTreeObserver().addOnDrawListener(new f(this, viewGroup));
          }
          objArray1 = new Object[0];
          a.D().w("RecordSideBarController", "initSidebarList, cost:"+a1.o(l), objArray1);
       }
       return;
    }
    public boolean R0(){
       return a0.b(this);
    }
    public void T1(boolean p0){
       a0.l(this, p0);
    }
    public IViewBinder V5(int p0){
       return this.E2(p0);
    }
    public void W(c p0){
       this.R = false;
    }
    public void X7(int p0,float p1){
       a0.k(this, p0, p1);
    }
    public void d5(int p0){
       a0.o(this, p0);
    }
    public void e2(){
       this.O = false;
    }
    public boolean f2(){
       Object obj = PatchProxy.apply(null, this, g.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (super.f2() && this.R == null)? true: false;
       return b;
    }
    public void i2(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "9")) {
          return;
       }
       d tf = this.f;
       if (tf instanceof b) {
          AbsRecordSideBarViewBinder uAbsRecordSi = tf.gd();
          this.n = uAbsRecordSi;
          this.u = uAbsRecordSi.C();
       }else {
          super.i2(p0);
       }
       return;
    }
    public long ie(){
       return a0.a(this);
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "4")) {
          return;
       }
       super.k(p0);
       Object[] objArray = new Object[0];
       a.D().w("RecordSideBarController", "onViewCreated", objArray);
       if (this.l2()) {
          n.Y(this.w, 0, 0);
          this.b2(new e(this));
       }
       return;
    }
    public SideBarViewBinder k2(int p0){
       return this.E2(p0);
    }
    public boolean l2(){
       Object obj = PatchProxy.apply(null, this, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.N == null && super.l2())? true: false;
       return b;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, g.class, "5")) {
          return;
       }
       super.onDestroy();
       if (g.I2()) {
          PreLoader.getInstance().clear(g.S);
       }
       return;
    }
    public ViewStub p2(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ViewStub viewStub = p0.findViewById(R.id.camera_sidebar_view_stub);
       if (viewStub != null && this.l2()) {
          viewStub.setLayoutResource(R.layout.arg_RES_7f0d018f);
       }
       if (this.N != null) {
          viewStub = null;
       }
       return viewStub;
    }
    public void q1(){
       if (PatchProxy.applyVoid(null, this, g.class, "10")) {
          return;
       }
       this.O = true;
       n.Y(this.u, 4, true);
       if (this.l2()) {
          n.Y(this.w, 4, true);
       }
       return;
    }
    public boolean q2(){
       return a0.d(this);
    }
    public void qb(){
       a0.e(this);
    }
    public void r0(int p0,Asset$b p1,b p2){
       u.b(this, p0, p1, p2);
    }
    public void s0(){
       a0.m(this);
    }
    public boolean t2(){
       return this.O;
    }
    public void u2(boolean p0){
       boolean b;
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "14")) {
          return;
       }
       super.u2(p0);
       int i = 1;
       int i1 = p0 ^ i;
       this.M = i1;
       if (i1) {
          c uoc = this.d.b().V7();
          if (uoc != null) {
             a uoa = uoc.h();
             Object obj = PatchProxy.applyOneRefs(uoa, this, og, "23");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                b = false;
                if (uoa != null) {
                   if (uoa.d() != RecordBubbleItem.SIDEBAR_FOLD_BTN && uoa.d() != RecordBubbleItem.INTELLIGENT) {
                      i = 0;
                   }
                   b = i;
                }
             }
             if (b) {
                uoc.c();
             }
          }
       }
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       super.w1(p0);
       Object[] objArray = new Object[0];
       a.D().w("RecordSideBarController", "onCreate", objArray);
       this.Q = this.d.b().V7();
       this.d.l(i0.class, new h(this));
       return;
    }
}
