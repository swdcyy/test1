package com.yxcorp.gifshow.prettify.makeup.y;
import com.yxcorp.gifshow.prettify.makeup.b0$c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.util.SparseArray;
import n1c.l;
import java.util.ArrayList;
import f1c.d0;
import java.util.List;
import n1c.k;
import com.kwai.feature.post.api.componet.prettify.makeup.model.RecoSuiteGroup;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f1c.f0;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.lang.Float;
import n0c.b;
import p0c.f;
import android.view.View;
import androidx.fragment.app.Fragment;
import k1c.c;
import p0c.f$c;
import com.yxcorp.gifshow.prettify.makeup.v;
import com.yxcorp.gifshow.prettify.makeup.y$a;
import f1c.d;
import com.yxcorp.gifshow.prettify.makeup.o;
import f1c.e;
import com.yxcorp.gifshow.prettify.makeup.b0;
import f1c.d1;
import hka.h;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import f1c.e1;
import com.kwai.feature.post.api.widget.PrettifyDoubleSeekBar$a;
import f1c.f1;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.prettify.makeup.l;
import f1c.g1;
import f1c.h1;
import f1c.v0;
import android.view.View$OnClickListener;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import lnc.a1;
import com.yxcorp.gifshow.prettify.makeup.x;
import erd.g;
import crd.b;
import brd.t;
import f1c.z0;
import f1c.a1;
import f1c.c1;
import com.yxcorp.gifshow.prettify.makeup.a;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupKey;
import com.yxcorp.gifshow.prettify.makeup.y$b;
import com.yxcorp.gifshow.prettify.makeup.d;
import com.yxcorp.gifshow.prettify.makeup.m;
import com.yxcorp.gifshow.prettify.makeup.m$a;
import java.util.Objects;
import n1c.d;
import xyb.a;
import com.yxcorp.gifshow.prettify.makeup.w;
import f1c.y0;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupGroup$a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial;
import i1c.c;
import mkc.c;
import android.widget.FrameLayout;
import g9c.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchBeautyMakeUpStatusPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BeautyMakeUpStatusPackage;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupItem;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import k2b.y1;
import android.content.Context;
import i2b.a;
import ekd.m1;
import android.view.ViewGroup;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import android.widget.ImageView;
import com.yxcorp.gifshow.tips.TipsContainer;
import f1c.x0;
import f1c.t0;
import com.yxcorp.gifshow.prettify.makeup.MakeupFragment;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.System;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView;
import f1c.u0;
import java.lang.Runnable;

public class y extends PresenterV2 implements b0$c	// class@0011a2
{
    public PrettifyConfigView A;
    public PrettifyConfigView B;
    public TipsContainer C;
    public b0 D;
    public l E;
    public final SparseArray F;
    public l G;
    public View H;
    public e I;
    public y$b J;
    public boolean K;
    public final List L;
    public j M;
    public ScrollToCenterRecyclerView N;
    public final List O;
    public final d0 P;
    public ImageView Q;
    public ViewGroup R;
    public RecoSuiteGroup S;
    public boolean T;
    public long U;
    public final k V;
    public MakeupFragment p;
    public f q;
    public PublishSubject r;
    public PublishSubject s;
    public PublishSubject t;
    public PublishSubject u;
    public BaseFragment v;
    public a w;
    public View x;
    public View y;
    public View z;

    public void y(){
       super();
       this.F = new SparseArray();
       this.G = new l();
       this.K = false;
       this.L = new ArrayList();
       ArrayList uArrayList = new ArrayList();
       this.O = uArrayList;
       this.P = new d0(uArrayList, this.G);
       this.T = false;
       this.U = -1;
       this.V = new k();
    }
    public static void P8(y p0){
       p0.h9();
    }
    public void A2(RecoSuiteGroup p0,MakeupSuite p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, y.class, "36")) {
          return;
       }
       y tp = this.p;
       boolean b = (p0.getRecoIndex() >= 0)? true: false;
       if (!PatchProxy.isSupport(f0.class) || !PatchProxy.applyVoidFourRefs(p0, p1, tp, Boolean.valueOf(b), null, f0.class, "19")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          String str = "AI_MAKEUP";
          uElementPack.action2 = str;
          JsonObject jsonObject = new JsonObject();
          if (b) {
             str = "CHANGE";
          }
          jsonObject.c0("button_action", str);
          f0.e(jsonObject, p1);
          f0.d(jsonObject, p0);
          uElementPack.params = jsonObject.toString();
          u1.M("", tp, 1, uElementPack, new ClientContent$ContentPackage(), null);
       }
       return;
    }
    public void C2(float p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oy, "38")) {
          return;
       }
       oy = this.q;
       if (oy != null && oy.l() != null) {
          this.q.l().d(p0);
       }
       return;
    }
    public void E8(){
       y oy = y.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oy, "4")) {
          return;
       }
       y tv = this.v;
       if (tv != null && tv.getView() != null) {
          this.H = this.v.getView().findViewById(0x7f0a3cb7);
       }
       y tq = this.q;
       this.P.i = tq;
       this.G.a(2, tq.m);
       if (this.z != null && this.G.b()) {
          this.G.d(this.z);
       }
       if (this.G.b()) {
          this.G.e();
       }
       int i = 8;
       if (this.z != null && !this.q.j().a()) {
          this.z.setVisibility(i);
       }
       tv = this.q;
       v ov = (tv.h == null && tv.o != null)? 1: null;
       this.I = (ov)? new v(new y$a(this)): new o(new y$a(this));
       this.I.doBindView(this.p.getView());
       if (!PatchProxy.applyVoid(objArray, this, oy, "12")) {
          if (!PatchProxy.applyVoid(objArray, this, oy, "14")) {
             this.V.c();
             b0 uob0 = new b0(this.q, this.G, new d1(this), this);
             this.D = uob0;
             this.A.setAdapter(uob0);
             this.A.setupSeekBarMode(1);
             this.A.setSeekBarChangeListener(new e1(this));
             this.A.c(new f1(this));
          }
          if (!PatchProxy.applyVoid(objArray, this, oy, "15")) {
             this.I.n();
          }
          if (!PatchProxy.applyVoid(objArray, this, oy, "17")) {
             l ol = new l(this.q, new g1(this));
             this.E = ol;
             this.B.setAdapter(ol);
             this.B.setupSeekBarMode(1);
             this.B.setSeekBarChangeListener(new h1(this));
          }
          if (!PatchProxy.applyVoid(objArray, this, oy, "18")) {
             this.A.f();
             this.I.i();
             this.B.setBackBtnOnClickListener(new v0(this));
          }
          this.R8();
          if (this.p.getArguments() != null) {
             objArray = SerializableHook.getSerializable(this.p.getArguments(), "fragment_tab_key");
          }
          if (!PatchProxy.applyVoidOneRefs(objArray, this, oy, "13")) {
             if (objArray == null || objArray.length <= 1) {
                this.B.setDividerViewVisibility(i);
                ViewGroup$LayoutParams layoutParams = this.A.getLayoutParams();
                layoutParams.height = a1.e(115.00f);
                this.A.setLayoutParams(layoutParams);
                this.A.setPadding(5, a1.e(15.00f), 0, 0);
             }else {
                this.B.setDividerViewVisibility(4);
             }
             this.I.l(objArray);
          }
          this.F.clear();
       }
       this.X7(this.r.subscribe(new x(this)));
       this.X7(this.s.subscribe(new z0(this)));
       this.X7(this.t.subscribe(new a1(this)));
       this.X7(this.u.subscribe(new c1(this)));
       MakeupKey rECORD = MakeupKey.RECORD;
       if (this.D.h == rECORD) {
          if (this.J == null) {
             this.J = new y$b(this);
          }
          d.a().b(rECORD).q(this.J);
       }
       return;
    }
    public void F8(){
       PatchProxy.applyVoid(null, this, y.class, "3");
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, y.class, "8")) {
          return;
       }
       this.Z8();
       this.I.a();
       d.a().b(this.D.h).q(objArray);
       y tD = this.D;
       Objects.requireNonNull(tD);
       if (!PatchProxy.applyVoid(objArray, tD, b0.class, "28")) {
          tD.h1(true);
          tD.p.b();
       }
       tD = this.q;
       if (tD != null && tD.l() != null) {
          this.q.l().c(2);
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, y.class, "19")) {
          return;
       }
       this.Y8();
       this.b9();
       Object[] objArray = new Object[0];
       a.D().E("MakeupPresenter", "[makeup][keypath][data] ", "initMakeupModel", objArray);
       this.X7(d.a().c(this.q.h(), this.q.e(), this.q.a(), this.q.c()).subscribe(new w(this), new y0(this)));
       return;
    }
    public MakeupGroup$a S8(){
       Object[] objArray = null;
       MakeupSuite obj = PatchProxy.apply(objArray, this, y.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.K != null) {
          obj = this.D.m1();
          if (obj != null) {
             objArray = new MakeupGroup$a();
             objArray.a = obj.getGroupId();
             objArray.b = obj.getGroupName();
          }
       }
       return objArray;
    }
    public void V8(boolean p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oy, "25")) {
          return;
       }
       if (this.p.isAdded() && this.T == null) {
          MakeupSuite makeupSuite = this.D.m1();
          MakeupPart makeupPart = this.I.c();
          MakeupMaterial makeupMateri = this.E.g1();
          if (!p0) {
             MakeupMaterial empty = (makeupMateri == null)? MakeupMaterial.getEmpty(): makeupMateri;
             makeupPart.setSelectMaterial(empty);
          }
          this.q.f().I1(makeupSuite, makeupPart, makeupMateri, p0);
       }
       return;
    }
    public void W8(MakeupSuite p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "27")) {
          return;
       }
       if (this.p.isAdded() && this.T == null) {
          this.q.f().I1(p0, null, null, false);
       }
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, y.class, "29")) {
          return;
       }
       y tx = this.x;
       if (tx != null && !tx.getVisibility()) {
          c.c(this.C, this.x);
       }
       this.C.setVisibility(8);
       return;
    }
    public final void Y8(){
       if (PatchProxy.applyVoid(null, this, y.class, "31")) {
          return;
       }
       y ty = this.y;
       if (ty != null && !ty.getVisibility()) {
          c.c(this.C, this.y);
       }
       return;
    }
    public void Z8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, y.class, "9")) {
          return;
       }
       int i = this.V.b();
       int i1 = this.V.a();
       if ((i1 - i) > 0) {
          while (i <= i1) {
             if (i >= 0 && !this.D.N0(i) instanceof RecoSuiteGroup) {
                this.F.put(i, this.D.N0(i));
             }
             i = i + 1;
          }
          this.V.c();
       }
       if (this.F.size() > 0) {
          y tF = this.F;
          if (PatchProxy.applyVoidOneRefs(tF, objArray, f0.class, "1") || (tF != null && tF.size())) {
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             ClientContent$BatchBeautyMakeUpStatusPackage uBatchBeauty = new ClientContent$BatchBeautyMakeUpStatusPackage();
             uContentPack.batchBeautyMakeUpStatusPackage = uBatchBeauty;
             ClientContent$BeautyMakeUpStatusPackage[] uBeautyMakeU = new ClientContent$BeautyMakeUpStatusPackage[tF.size()];
             uBatchBeauty.beautyMakeUpStatusUsePackage = uBeautyMakeU;
             i1 = 0;
             while (i1 < tF.size()) {
                MakeupSuite makeupSuite = tF.valueAt(i1);
                if (MakeupItem.isValid(makeupSuite)) {
                   ClientContent$BeautyMakeUpStatusPackage uBeautyMakeU1 = new ClientContent$BeautyMakeUpStatusPackage();
                   uBeautyMakeU1.primaryTypeNew = makeupSuite.mId;
                   uContentPack.batchBeautyMakeUpStatusPackage.beautyMakeUpStatusUsePackage[i1] = uBeautyMakeU1;
                }
                i1 = i1 + 1;
             }
             u1.u0(3, y1.a("showMakeup", 1382, 12), uContentPack);
          }
       label_00a7 :
          this.F.clear();
       }
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, y.class, "20")) {
          return;
       }
       this.V.d(this.A.getFirstItemVisible(), this.A.getLastItemVisible());
       return;
    }
    public final void b9(){
       if (PatchProxy.applyVoid(null, this, y.class, "28")) {
          return;
       }
       this.C.setVisibility(0);
       if (this.x == null) {
          this.x = a.a(this.getContext(), 0x7f0d1617);
       }
       c.i(this.C, this.x);
       return;
    }
    public void c9(MakeupMaterial p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "24")) {
          return;
       }
       if (p0 == null || p0.isEmpty()) {
          this.B.g();
       }else {
          this.B.o();
          this.B.setDefaultIndicatorProgress(p0.getRecommendIntensity());
          this.B.setSeekBarProgress(p0.getIntensity());
       }
       return;
    }
    public void d9(MakeupSuite p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "23")) {
          return;
       }
       if (!this.q.a()) {
          return;
       }
       if (p0 == null || p0.isEmpty()) {
          this.A.g();
       }else {
          this.A.o();
          this.A.setDefaultIndicatorProgress(p0.getRecommendIntensity());
          this.A.setSeekBarProgress(p0.getIntensity());
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "2")) {
          return;
       }
       this.A = m1.f(p0, 0x7f0a2a65);
       this.R = m1.f(p0, 0x7f0a2a5d);
       this.N = m1.f(p0, 0x7f0a2a5e);
       this.Q = m1.f(p0, 0x7f0a0753);
       this.C = m1.f(p0, 0x7f0a3f11);
       this.B = m1.f(p0, 0x7f0a2a5f);
       View view = m1.f(p0, R.id.male_btn);
       this.z = view;
       if (view != null) {
          m1.a(p0, new x0(this), R.id.male_btn);
       }
       return;
    }
    public void e9(){
       if (PatchProxy.applyVoid(null, this, y.class, "30")) {
          return;
       }
       if (this.y == null) {
          View view = a.a(this.getContext(), R.layout.arg_RES_7f0d1616);
          this.y = view;
          view.setOnClickListener(new t0(this));
       }
       c.i(this.C, this.y);
       return;
    }
    public final void h9(){
       if (PatchProxy.applyVoid(null, this, y.class, "11")) {
          return;
       }
       if (this.p.isVisible()) {
          y tA = this.A;
          if (tA != null && this.D != null) {
             int firstItemVis = tA.getFirstItemVisible();
             int lastItemVisi = this.A.getLastItemVisible();
             while (firstItemVis >= 0 && (firstItemVis <= lastItemVisi && firstItemVis < this.D.getItemCount())) {
                MakeupSuite makeupSuite = this.D.N0(firstItemVis);
                if (makeupSuite instanceof RecoSuiteGroup) {
                   this.S = makeupSuite;
                   break ;
                }
                firstItemVis = firstItemVis + 1;
             }
          }
       }
       return;
    }
    public boolean j5(){
       return (this.T ^ 0x01);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, y.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("MAKEUP_OPTION");
       this.r = this.r8("HIDDEN_CHANGED");
       this.s = this.r8("MAKEUP_RESET_UI");
       this.t = this.r8("MAKEUP_RELOAD_UI");
       this.u = this.r8("MAKEUP_REFRESH_SELECT");
       this.v = this.t8("PRETTIFY_FRAGMENT");
       return;
    }
    public void o(boolean p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oy, "39")) {
          return;
       }
       oy = this.U;
       if (oy - -1) {
          long l = a1.o(oy);
          y tv = this.v;
          int i = (p0)? 7: 8;
          f0.j(l, tv, i);
          y tq = this.q;
          if (tq != null && tq.l() != null) {
             this.q.l().c(2);
          }
          this.U = -1;
       }
       return;
    }
    public void t(boolean p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oy, "37")) {
          return;
       }
       this.U = System.currentTimeMillis();
       oy = this.q;
       if (oy != null && oy.l() != null) {
          this.q.l().b(2, p0);
       }
       return;
    }
    public void v(){
       if (PatchProxy.applyVoid(null, this, y.class, "40")) {
          return;
       }
       y tU = this.U;
       if (tU - -1) {
          f0.j(a1.o(tU), this.v, 9);
          tU = this.q;
          if (tU != null && tU.l() != null) {
             this.q.l().c(2);
          }
          this.U = -1;
       }
       return;
    }
    public void x7(View p0,int p1,MakeupSuite p2){
       if (PatchProxy.isSupport(y.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, y.class, "35")) {
          return;
       }
       this.q.f().z0(p0, p1, p2);
       y tA = this.A;
       if (tA != null && !tA.getFilterItemList().getScrollState()) {
          this.A.postDelayed(new u0(this), 100);
       }else {
          this.h9();
       }
       return;
    }
}
