package com.yxcorp.gifshow.prettify.beauty.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import n1c.a;
import android.util.SparseArray;
import n1c.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p0c.a;
import h16.n;
import h16.k;
import k1c.c;
import java.util.ArrayList;
import com.yxcorp.gifshow.prettify.beauty.k;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import h16.l;
import java.util.Objects;
import java.util.Collection;
import java.util.Set;
import n1c.l;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.prettify.beauty.t;
import com.yxcorp.gifshow.prettify.beauty.m$d;
import q0c.m0;
import com.yxcorp.gifshow.prettify.beauty.r$b;
import com.yxcorp.gifshow.prettify.beauty.r;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import q0c.n0;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.y;
import androidx.recyclerview.widget.RecyclerView$l;
import m0c.m;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import k17.b;
import android.view.View;
import androidx.fragment.app.Fragment;
import q0c.j2;
import com.yxcorp.gifshow.prettify.beauty.BeautyConfigView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import q0c.o0;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import q0c.i0;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.prettify.beauty.w;
import com.yxcorp.gifshow.prettify.widget.RecycleViewWithIndicator;
import com.yxcorp.gifshow.prettify.beauty.w$c;
import java.util.List;
import g9c.a;
import android.widget.LinearLayout;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.prettify.beauty.v;
import com.yxcorp.gifshow.prettify.beauty.m$c;
import q0c.z1;
import java.lang.ref.WeakReference;
import u0c.a;
import com.yxcorp.gifshow.prettify.beauty.h;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import q0c.j0;
import erd.g;
import crd.b;
import brd.t;
import q0c.k0;
import q0c.l0;
import q0c.n2;
import q0c.c0;
import eoc.f;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import q0c.c;
import xyb.a;
import q87.c;
import q0c.s0;
import xf6.g;
import m1c.a;
import com.yxcorp.gifshow.prettify.beauty.m$b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import h16.o;
import android.view.ViewParent;
import android.widget.TextView;
import android.view.ViewGroup;
import q0c.f0;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import q0c.d0;
import pm6.k;
import brd.z;
import t45.d;
import q0c.e0;
import com.yxcorp.gifshow.prettify.beauty.i;
import java.lang.StringBuilder;
import java.lang.Integer;
import k2b.e0;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem;
import w46.b;
import com.google.gson.JsonArray;
import h16.g;
import java.lang.Number;
import com.yxcorp.gifshow.prettify.beauty.j;
import com.kwai.feature.post.api.componet.prettify.beauty.RecoBeautifyConfig;
import com.yxcorp.utility.TextUtils;
import s0c.d;
import ekd.q;
import l0c.c;
import n1c.c;
import java.util.Iterator;
import com.yxcorp.gifshow.prettify.beauty.u;
import com.yxcorp.gifshow.prettify.makeup.e0;
import com.yxcorp.utility.n;
import android.animation.Animator;
import trd.t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import q0c.l2;
import com.yxcorp.gifshow.prettify.beauty.v$b;
import q0c.m2;
import android.view.View$OnClickListener;
import com.kwai.feature.post.api.componet.prettify.beauty.MedicalBeautyConfig;
import android.widget.ImageView;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import com.airbnb.lottie.LottieAnimationView;
import q0c.k2;
import android.animation.Animator$AnimatorListener;
import oe6.e;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import q0c.a;
import com.kwai.feature.post.api.widget.PrettifyDoubleSeekBar;
import java.lang.Math;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import ekd.m1;
import q0c.b0;
import q0c.g0;
import com.kwai.feature.post.api.widget.PrettifyDoubleSeekBar$a;
import android.app.Activity;
import com.yxcorp.gifshow.bubble.b;
import com.yxcorp.gifshow.prettify.utils.PrettifyBubbleItem;
import ra9.c;
import com.yxcorp.gifshow.prettify.beauty.m$a;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import com.yxcorp.gifshow.prettify.beauty.l;
import com.yxcorp.gifshow.bubble.b$b;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.prettify.beauty.BeautifyFilterFragment;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.prettify.base.PrettifyBaseFragment;
import q0c.t0;
import android.view.View$OnLayoutChangeListener;
import androidx.fragment.app.FragmentActivity;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import java.util.Map;
import java.util.Map$Entry;
import java.lang.CharSequence;

public class m extends PresenterV2	// class@001113
{
    public PublishSubject A;
    public d B;
    public a C;
    public o D;
    public r E;
    public b F;
    public a G;
    public int H;
    public String I;
    public int J;
    public BaseFragment K;
    public j2 L;
    public final SparseArray M;
    public final SparseArray N;
    public final k O;
    public final k P;
    public boolean Q;
    public h R;
    public boolean S;
    public boolean T;
    public PostBubbleManager U;
    public long V;
    public boolean W;
    public boolean X;
    public View p;
    public ScrollToCenterRecyclerView q;
    public BeautyConfigView r;
    public View s;
    public PrettifyDoubleSeekBar t;
    public TextView u;
    public BeautifyFilterFragment v;
    public BeautifyConfig w;
    public a x;
    public PublishSubject y;
    public PublishSubject z;
    public static Map Y;

    public void m(){
       super();
       this.G = new a();
       this.M = new SparseArray();
       this.N = new SparseArray();
       this.O = new k();
       this.P = new k();
       this.Q = false;
       this.S = false;
       this.T = false;
       this.V = -1;
       this.W = false;
       this.X = false;
    }
    public void E8(){
       m g;
       m r;
       m x1;
       j2 l;
       j2 c;
       d uod = this;
       a uoa = a.class;
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uod, om, "4")) {
          return;
       }
       m x = uod.x;
       uod.B = x.k;
       k ok = x.o().f();
       int i = 1;
       uod.G.a(i, uod.x.l());
       l ol = y.y(ok.b(), k.b).orNull();
       String str = "2";
       if (ol != null) {
          g = uod.G;
          ol = ol.d;
          Objects.requireNonNull(g);
          if (!PatchProxy.applyVoidOneRefs(ol, g, uoa, str)) {
             g.f.addAll(ol);
          }
       }
       if (uod.x.l() != null) {
          m g1 = uod.G;
          c b = uod.x.l().b;
          Objects.requireNonNull(g1);
          if (!PatchProxy.applyVoidOneRefs(b, g1, uoa, "3")) {
             g1.g.clear();
             g1.g.addAll(b);
          }
       }
       uod.J = uod.x.v();
       if (uod.G.b()) {
          uod.G.e();
       }
       if (!PatchProxy.applyVoid(objArray, uod, om, "5")) {
          uod.M.clear();
          uod.N.clear();
          uod.O.c();
          uod.P.c();
          uod.q.setLayoutManager(new LinearLayoutManager(this.getContext(), 0, 0));
          uod.E = (uod.x.j())? new t(uod.x, new m$d(uod, objArray), uod.G): new r(uod.x, new m$d(uod, objArray), uod.G);
          uod.q.setAdapter(uod.E);
          uod.q.addOnScrollListener(new n0(uod));
          int i1 = 0x7f07033f;
          if (uod.x.j()) {
             g og = new g();
             og.K(0);
             uod.q.setItemAnimator(og);
             m om1 = v15;
             x1 = v15;
             om1 = new m(0, a1.d(i1), a1.d(0x7f0703d5), a1.e(0x3f000000), a1.e(0x41f00000), 2);
             uod.q.addItemDecoration(x1);
          }else {
             uod.q.addItemDecoration(new b(0, a1.d(i1), a1.d(R.dimen.arg_RES_7f0703d4)));
          }
          if (uod.x.i != null) {
             uod.s.setVisibility(0);
          }
          r = uod.K;
          View view = (r != null && r.getView() != null)? uod.K.getView().findViewById(R.id.tabs_container): null;
          l = new j2(view, uod.r, uod.K, uod.x);
          uod.L = l;
          l.doBindView(uod.v.getView());
       }
       if (!PatchProxy.applyVoidOneRefs(ok, uod, om, "6")) {
          uod.r.c(new o0(uod));
          r = uod.L;
          i0 oi0 = new i0(uod);
          Objects.requireNonNull(r);
          if (!PatchProxy.applyVoidTwoRefs(oi0, ok, r, j2.class, str)) {
             a.p(oi0, "partTabChangeListener");
             a.p(ok, "beautyGroupInfo");
             r.l = ok;
             j2 b2 = r.b;
             if (b2 != null) {
                j2 d = r.d;
                if (d == null) {
                   a.S("mBeautyTabListLayoutWithIndicator");
                }
                w ow = new w(d, oi0, r.p.j());
                r.i = ow;
                l = r.l;
                a.m(l);
                ow.W0(l.b());
                l = r.c;
                str = "mBeautyPartsTabList";
                if (l == null) {
                   a.S(str);
                }
                d = r.i;
                if (d == null) {
                   a.S("mBeautyPartsTabAdapter");
                }
                l.setAdapter(d);
                l = r.c;
                if (l == null) {
                   a.S(str);
                }
                l.setLayoutManager(new LinearLayoutManager(b2.getContext(), 0, 0));
                l = r.d;
                if (l == null) {
                   a.S("mBeautyTabListLayoutWithIndicator");
                }
                c = r.c;
                if (c == null) {
                   a.S(str);
                }
                l.setRecyclerView(c);
             }
          }
       }
       int[] ointArray = (uod.v.getArguments() == null)? null: SerializableHook.getSerializable(uod.v.getArguments(), "fragment_tab_key");
       String str1 = "1";
       if (!PatchProxy.applyVoidOneRefs(ointArray, uod, om, "11")) {
          if (ointArray == null || ointArray.length <= i) {
             r = uod.r;
             Objects.requireNonNull(r);
             if (!PatchProxy.applyVoid(null, r, PrettifyConfigView.class, "30")) {
                PrettifyConfigView e = r.e;
                if (e != null) {
                   e.setVisibility(8);
                }
             }
          }else {
             uod.r.setDividerViewVisibility(4);
          }
          r = uod.r;
          x1 = uod.x;
          m g2 = uod.G;
          Objects.requireNonNull(r);
          if (!PatchProxy.applyVoidTwoRefs(x1, g2, r, BeautyConfigView.class, str1)) {
             r.s = x1;
             BeautyConfigView q = r.q;
             q.m = x1;
             q.n = g2;
          }
          uod.r.setBeautyConfigViewListener(new m$c(uod));
       }
       uod.S8(new WeakReference(uod));
       boolean b1 = uod.C.i();
       h oh = h.class;
       if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b1), null, oh, str1)) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SHOW_BEAUTY_TAB";
          JsonObject jsonObject = new JsonObject();
          jsonObject.H("have_custom_setting", Boolean.valueOf(b1));
          uElementPack.params = jsonObject.toString();
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          showEvent.contentPackage = new ClientContent$ContentPackage();
          showEvent.elementPackage = uElementPack;
          u1.g0(showEvent);
       }
       uod.X7(uod.y.subscribe(new j0(uod)));
       uod.X7(uod.z.subscribe(new k0(uod)));
       uod.X7(uod.A.subscribe(new l0(uod)));
       uod.X7(f.a(n2.class, new c0(uod)));
       if (uod.r.v()) {
          c.b(uod.w);
       }
       if (!PatchProxy.applyVoid(null, uod, om, "46")) {
          Object[] objArray1 = new Object[0];
          a.D().w("BeautifyPresenter", "set prettify animator listener", objArray1);
          uod.R = new s0(uod);
          uod.x.a().add(uod.R);
       }
       if (g.f()) {
          f.b(a.class, new m$b(uod), uod.v);
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, m.class, "27")) {
          return;
       }
       m tF = this.F;
       if (tF != null && !tF.isDisposed()) {
          this.F.dispose();
       }
       return;
    }
    public void J8(){
       m om = m.class;
       if (PatchProxy.applyVoid(null, this, om, "7")) {
          return;
       }
       m tC = this.C;
       Objects.requireNonNull(tC);
       if (!PatchProxy.applyVoid(null, tC, a.class, "3")) {
          tC.a.a(tC.d);
       }
       this.E.a1(true);
       if (!PatchProxy.applyVoid(null, this, om, "10") && !this.G.b()) {
          tC = this.D;
          if (tC != null && (tC.d() || this.D.g())) {
             this.D.a(this.H);
             this.D.f(this.I);
          }
       }
       this.V8();
       this.W8();
       if (!PatchProxy.applyVoid(null, this, om, "47")) {
          Object[] objArray = new Object[0];
          a.D().w("BeautifyPresenter", "remove prettify animator listener", objArray);
          this.x.a().remove(this.R);
       }
       om = this.u;
       if (om != null && om.getParent() != null) {
          this.u.getParent().removeView(this.u);
          this.u = null;
       }
       return;
    }
    public void P8(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "37")) {
          return;
       }
       this.d9(p0);
       this.C.j(p0);
       k1.r(new f0(this, p0), 10);
       return;
    }
    public boolean R8(BeautifyConfig p0){
       boolean b = (p0 == null || p0.mId <= null)? true: false;
       return b;
    }
    public final void S8(WeakReference p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       m om = m.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, om, "19")) {
          return;
       }
       a uoa1 = new a(this.x.o());
       this.C = uoa1;
       o oo = PatchProxy.apply(null, uoa1, uoa, "12");
       if (oo != patchProxyRe) {
       }else {
          oo = uoa1.a.g();
       }
       this.D = oo;
       if (!PatchProxy.applyVoid(null, this, om, "9") && !this.G.b()) {
          om = this.D;
          if (om != null && (om.d() || this.D.g())) {
             this.H = this.D.e();
             this.I = this.D.c();
          }
       }
       if (p0.get() != null) {
          Object[] objArray = new Object[0];
          a.D().E("BeautifyPresenter", "[beautify][keypath][data] ", "loadData start", objArray);
          BeautifyConfig uBeautifyCon = this.C.f();
          this.w = uBeautifyCon;
          if (uBeautifyCon != null && this.x.x()) {
             om = this.C;
             Objects.requireNonNull(om);
             BeautifyConfig uBeautifyCon1 = PatchProxy.apply(null, om, uoa, "15");
             if (uBeautifyCon1 != patchProxyRe) {
             }else {
                uBeautifyCon1 = om.a.c();
             }
             if (uBeautifyCon1 != null) {
                this.w.copyFilterValue(uBeautifyCon1);
             }
          }
       label_00a8 :
          this.F = t.just(this.C.b()).doOnNext(new d0(this, p0)).subscribeOn(k.a).observeOn(d.a).subscribe(new e0(this, p0), i.b);
       }
       return;
    }
    public void V8(){
       m om = m.class;
       if (PatchProxy.applyVoid(null, this, om, "42")) {
          return;
       }
       boolean i = this.O.b();
       int i1 = this.O.a();
       if ((i1 - i) > 0) {
          int i2 = 0;
          while (i <= i1) {
             if (i < 0) {
                Object[] objArray = new Object[i2];
                a.D().w("BeautifyPresenter", "skip illegal item index "+i, objArray);
             }else {
                BeautifyConfig uBeautifyCon = this.E.N0(i);
                if (PatchProxy.isSupport(om) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), uBeautifyCon, this, om, "39") && this.M.get(i) == null)) {
                   this.M.put(i, uBeautifyCon);
                }
             }
             i = i + 1;
          }
          this.O.c();
          om = this.v;
          i = this.x.w();
          if (this.J == 2) {
             i2 = true;
          }
          h.j(om, i, i2, this.M);
          this.M.clear();
       }
       return;
    }
    public void W8(){
       Object[] objArray1;
       m tM;
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "43")) {
          return;
       }
       int i = this.P.b();
       int i1 = this.P.a();
       if ((i1 - i) > 0) {
          int i2 = 0;
          a uoa = 1;
          while (i <= i1) {
             String str = "BeautifyPresenter";
             if (i < 0) {
                objArray1 = new Object[i2];
                a.D().w(str, "skip illegal item index "+i, objArray1);
             }else {
                BeautyFilterItem uBeautyFilte = this.r.r(i);
                if (!PatchProxy.isSupport(om) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), uBeautyFilte, this, om, "40")) {
                   if (uBeautyFilte == null) {
                      objArray1 = new Object[i2];
                      a.D().t(str, "onBeautyItemShowError", objArray1);
                   }else if(uBeautyFilte.getShowLevel() == uoa){
                      this.Q = uoa;
                      if (this.M.get(i) == null) {
                         tM = this.M;
                         BeautifyConfig uBeautifyCon = PatchProxy.applyOneRefs(uBeautyFilte, this, om, "41");
                         if (uBeautifyCon != PatchProxyResult.class) {
                         }else {
                            uBeautifyCon = new BeautifyConfig();
                            if (uBeautyFilte.getItemId() == -2) {
                               uBeautifyCon.mId = -1;
                            }
                         }
                         tM.put(i, uBeautifyCon);
                      }
                   }else if(this.N.get(i) == null){
                      tM = this.N;
                      int i3 = (this.Q != null)? i - 2: i;
                      tM.put(i3, uBeautyFilte);
                   }
                }
             }
             i = i + 1;
          }
          this.P.c();
          om = this.v;
          m tw = this.w;
          m tN = this.N;
          if (!PatchProxy.applyVoidThreeRefs(om, tw, tN, null, h.class, "21")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "BEAUTY_MATERIAL";
             JsonObject jsonObject = new JsonObject();
             JsonArray jsonArray = new JsonArray();
             int i4 = 0;
             String str1 = "";
             while (i4 < tN.size()) {
                BeautyFilterItem uBeautyFilte1 = tN.get(tN.keyAt(i4));
                JsonObject jsonObject1 = new JsonObject();
                jsonObject1.c0("suit_name", h.e(tw, uoa));
                g beautyPartGr = uBeautyFilte1.getBeautyPartGroup();
                if (beautyPartGr != null) {
                   str1 = beautyPartGr.mLoggerName;
                }
                jsonObject1.c0("part_name", str1);
                jsonObject1.c0("material_name", uBeautyFilte1.getLoggerName());
                i4 = i4 + 1;
                jsonObject1.a0("material_index", Integer.valueOf(i4));
                jsonArray.G(jsonObject1);
             }
             jsonObject.G("show_items", jsonArray);
             uElementPack.params = jsonObject.toString();
             u1.C0(str1, om, 3, uElementPack, objArray);
          }
          if (this.Q != null && this.M.size() > 0) {
             om = this.v;
             boolean b = this.x.w();
             if (this.J == 2) {
                i2 = true;
             }
             h.j(om, b, i2, this.M);
             this.M.clear();
          }
          this.N.clear();
       }
       return;
    }
    public final void X8(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "44")) {
          return;
       }
       if (this.X != null) {
          return;
       }
       boolean b = true;
       this.X = b;
       BeautifyConfig uBeautifyCon = y.y(p0, j.b).orNull();
       if (uBeautifyCon instanceof RecoBeautifyConfig) {
          BeautifyConfig currentConfi = uBeautifyCon.getCurrentConfig();
          m tK = this.K;
          boolean b1 = (uBeautifyCon.isLastConfig() || !uBeautifyCon.getRecoSize())? true: false;
          if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(tK, currentConfi, Boolean.valueOf(b1), null, h.class, "38")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             String str = "AI_BEAUTY";
             uElementPack.action2 = str;
             uElementPack.type = b;
             JsonObject jsonObject = new JsonObject();
             if (!b1) {
                str = "CHANGE";
             }
             jsonObject.c0("button_action", str);
             if (currentConfi != null) {
                jsonObject.a0("suit_id", Integer.valueOf(currentConfi.mId));
                jsonObject.c0("suit_name", TextUtils.k(currentConfi.mLoggerName));
             }
             uElementPack.params = jsonObject.toString();
             u1.C0("", tK, 3, uElementPack, null);
          }
       }
       return;
    }
    public void Y8(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "38")) {
          return;
       }
       if (p0 != null) {
          m tB = this.B;
          if (tB != null) {
             if (p0 instanceof RecoBeautifyConfig) {
                p0 = p0.getCurrentConfig();
                if (p0 != null) {
                   this.B.Z0(p0);
                }
             }else {
                tB.Z0(p0);
             }
          }
       }
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, m.class, "36")) {
          return;
       }
       m tB = this.B;
       if (tB != null) {
          tB.J();
       }
       return;
    }
    public void a9(BeautifyConfig p0,boolean p1){
       m l;
       j2 c;
       j2 e;
       int i3;
       Object[] objArray;
       BeautifyConfig uBeautifyCon1;
       BeautyConfigView q;
       ArrayList uArrayList;
       BeautyConfigView uBeautyConfi;
       Iterator iterator2;
       Object[] objArray2;
       int i = this;
       Object obj = p0;
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(p1), i, om, "34")) {
          return;
       }
       Object obj1 = null;
       boolean i1 = 2;
       int i2 = 0;
       if (!PatchProxy.applyVoidOneRefs(obj, i, om, "32")) {
          i.H = i1;
          i.w = obj;
          if (i.r.v()) {
             c.b(p0);
          }
          m r1 = i.r;
          l = i.C;
          BeautifyConfig mId = obj.mId;
          if (mId == 100) {
             mId = 2;
          }
          BeautifyConfig uBeautifyCon = l.c(mId);
          int i4 = (q.f(i.C.c))? obj1: i.C.c.get(i2);
          boolean b = (i.J == i1)? true: false;
          Objects.requireNonNull(r1);
          if (PatchProxy.isSupport(BeautyConfigView.class)) {
             i1 = b;
             uBeautifyCon1 = i4;
             if (PatchProxy.applyVoidFourRefs(p0, uBeautifyCon, i4, Boolean.valueOf(b), r1, BeautyConfigView.class, "6")) {
             label_026d :
                i.P.d(i.r.getFirstItemVisible(), i.r.getLastItemVisible());
             }
          }else {
             i1 = b;
             uBeautifyCon1 = i4;
          }
          objArray = new Object[i2];
          a.D().w("BeautyConfigView", "setLastBeautifyConfig "+i1, objArray);
          r1.p = obj;
          r1.o = uBeautifyCon;
          q = r1.q;
          q.q = i1;
          if (!PatchProxy.applyVoidThreeRefs(p0, uBeautifyCon, uBeautifyCon1, q, v.class, "10")) {
             Object[] objArray1 = new Object[i2];
             a.D().s("BeautyItemAdapter", "initItems", objArray1);
             q.h = obj;
             q.g = uBeautifyCon;
             q.i = uBeautifyCon1;
             int i5 = q.m.c().b();
             v h = q.h;
             c uoc = c.class;
             if (PatchProxy.isSupport(uoc)) {
                uArrayList = PatchProxy.applyTwoRefs(Integer.valueOf(i5), h, obj1, uoc, "3");
                if (uArrayList != PatchProxyResult.class) {
                label_01fc :
                   q.W0(uArrayList);
                   Iterator iterator = q.Q0().iterator();
                   while (true) {
                      i3 = -1;
                      if (iterator.hasNext()) {
                         BeautyFilterItem uBeautyFilte = iterator.next();
                         if (uBeautyFilte.getItemId() == i3) {
                            i3 = uBeautyFilte.getItemId();
                            uBeautyConfi = 1;
                         }
                      }else {
                         uBeautyConfi = null;
                      }
                      String str = -2;
                      if (q.m.n()) {
                         h = q.i;
                         if (h != null) {
                            if (obj.equals(h) && uBeautyConfi) {
                               q.k = i3;
                            }else if(obj.equals(q.g)){
                               q.k = str;
                            }
                         }else if(obj.equals(uBeautifyCon) && uBeautyConfi != null){
                            i3 = -2;
                         }
                         q.k = i3;
                      }else {
                         goto label_0244 ;
                      }
                      q.d1(obj, uBeautifyCon);
                   }
                }
             }
             uArrayList = new ArrayList();
             Iterator iterator1 = h.mBeautyFilterItemList.iterator();
             String str1 = "BeautyUtil";
             while (iterator1.hasNext()) {
                BeautyFilterItem uBeautyFilte1 = iterator1.next();
                String str2 = " ";
                if (uBeautyFilte1.mHidden != null) {
                   iterator2 = iterator1;
                   objArray2 = new Object[0];
                   a.D().w(str1, "hidden item : "+uBeautyFilte1.mId+str2+uBeautyFilte1.mName, objArray2);
                label_017f :
                   obj1 = 0;
                }else {
                   iterator2 = iterator1;
                   if (!uBeautyFilte1.mSupportVersion.isEmpty() && !uBeautyFilte1.mSupportVersion.contains(Integer.valueOf(i5))) {
                      objArray2 = new Object[0];
                      a.D().w(str1, "beautify version not support : "+uBeautyFilte1.mId+str2+uBeautyFilte1.mName, objArray2);
                      goto label_017f ;
                   }else if(h.mUnSupportItemList.contains(Integer.valueOf(uBeautyFilte1.getItemId()))){
                      objArray2 = new Object[0];
                      a.D().w(str1, "suite not support : "+uBeautyFilte1.mId+str2+uBeautyFilte1.mName, objArray2);
                   }else {
                      uArrayList.add(uBeautyFilte1);
                   }
                }
                iterator1 = iterator2;
                StringBuilder str3 = null;
             }
             if (uArrayList.isEmpty()) {
                Object[] objArray3 = new Object[0];
                a.D().t(str1, "ShowBeautifyItemListError", objArray3);
             }
             Object[] objArray4 = new Object[0];
             a.D().w(str1, "getShowItemList : "+h.mId+", size : "+uArrayList.size(), objArray4);
             goto label_01fc ;
          }
          if (i1) {
             y.q(r1.q.Q0(), u.b);
          }
          r1.q.k0();
          r1.g();
          r1.e(true, null);
          goto label_026d ;
       }
       if (!PatchProxy.isSupport(om) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), i, om, "33")) {
          if (p1) {
             e0.d(i.p, i.r);
          }else {
             i3 = false;
             n.Y(i.p, 8, i3);
             n.Y(i.r, i3, i3);
          }
          if (i.J == 2) {
             l = i.L;
             if (l != null) {
                m r = i.r;
                j2 oj2 = j2.class;
                if (!PatchProxy.applyVoidOneRefs(r, l, oj2, "6")) {
                   a.p(r, "beautyConfigView");
                   if (l.m != null) {
                      c = l.c;
                      if (c == null) {
                         a.S("mBeautyPartsTabList");
                      }
                      c.scrollToPosition(0);
                      c = l.h;
                      if (c != null && c.isRunning()) {
                         c = l.h;
                         if (c == null) {
                            a.S("mTabAnimator");
                         }
                         c.cancel();
                      }
                      List list = t.k(l.m);
                      View[] viewArray = new View[2];
                      viewArray[0] = l.b;
                      e = l.e;
                      if (e == null) {
                         a.S("mResetViewLayout");
                      }
                      viewArray[1] = e;
                      Animator uAnimator = e0.e(list, l.m, null, l.b, CollectionsKt__CollectionsKt.L(viewArray));
                      a.o(uAnimator, "MakeupViewSwitchHelper.g¡­ner,\n          nextViews\)");
                      l.h = uAnimator;
                      c = l.i;
                      if (c == null) {
                         a.S("mBeautyPartsTabAdapter");
                      }
                      c.k0();
                      c = l.e;
                      if (c == null) {
                         a.S("mResetViewLayout");
                      }
                      c.setVisibility(0);
                      if (!PatchProxy.applyVoidOneRefs(r, l, oj2, "8") && l.b != null) {
                         l.a(r.u());
                         r.setItemIntensityChangedListener(new l2(l, r));
                         c = l.e;
                         if (c == null) {
                            a.S("mResetViewLayout");
                         }
                         c.setOnClickListener(new m2(l, r));
                      }
                      if (l.p.o().h() != null && !PatchProxy.applyVoid(null, l, oj2, "7")) {
                         j2 j = l.j;
                         if (j != null) {
                            i3 = 0;
                            j.setVisibility(i3);
                            if (l.k == null) {
                               j.D(R.string.arg_RES_7f103d9e);
                               j.setRepeatCount(i3);
                               j.a(new k2(j));
                               l.k = true;
                            }
                            objArray = new Object[i3];
                            a.D().w("RecordBeautyTabsPresenter", "startMedicalBeautyAnim", objArray);
                            j.s();
                         }
                      }
                      j2 d = l.d;
                      if (d == null) {
                         a.S("mBeautyTabListLayoutWithIndicator");
                      }
                      d.m();
                   }
                }
             }
          }
          if (i.C.g() != null && !e.n()) {
             SharedPreferences$Editor uEditor = e.a.edit();
             uEditor.putBoolean("has_show_medical_beauty_item", true);
             g.a(uEditor);
          }
       }
       return;
    }
    public final void b9(){
       if (PatchProxy.applyVoid(null, this, m.class, "31")) {
          return;
       }
       if (this.t != null) {
          m tw = this.w;
          if (tw instanceof RecoBeautifyConfig && (tw.getCurrentConfig() != null && (a.g() && (!this.G.b() && !this.v.isHidden())))) {
             BeautifyConfig currentConfi = this.w.getCurrentConfig();
             this.t.setVisibility(0);
             this.t.setDefaultIndicatorProgress((int)Math.min((currentConfi.mDefaultIntensity * 100.00f), 100.00f));
             this.t.setProgress(Math.min((int)(currentConfi.mIntensity * 100.00f), 100));
          }else {
             this.t.setVisibility(8);
          }
       }
       return;
    }
    public void c9(){
       if (PatchProxy.applyVoid(null, this, m.class, "17")) {
          return;
       }
       LinearLayoutManager layoutManage = this.q.getLayoutManager();
       int i = layoutManage.i0();
       this.O.d(i, layoutManage.c());
       return;
    }
    public final void d9(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "30")) {
          return;
       }
       if (p0 == null) {
          Object[] objArray = new Object[0];
          a.D().w("BeautifyPresenter", "selectBeautyCategoryItem, config is null", objArray);
          return;
       }else {
          this.w = p0;
          if (!p0 instanceof RecoBeautifyConfig && this.r.v()) {
             c.b(this.w);
          }
          this.q.x(this.E.f1(p0));
          this.b9();
          return;
       }
    }
    public void doBindView(View p0){
       m om = m.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, om, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a1a79);
       View view = m1.f(p0, R.id.live_beauty_filter_category_list_container);
       this.p = view;
       if (view == null) {
          this.p = this.q;
       }
       this.r = m1.f(p0, 0x7f0a1a7c);
       this.s = m1.f(p0, 0x7f0a4030);
       this.t = m1.f(p0, 0x7f0a1a7b);
       m1.a(p0, new b0(this), R.id.touch_view);
       m1.a(p0, new g0(this), R.id.live_beauty_filter_config_view);
       if (!PatchProxy.applyVoid(null, this, om, "3")) {
          m tt = this.t;
          if (tt != null) {
             tt.setupSeekBarMode(1);
             this.t.setOnSeekBarChangeListener(new m0(this));
          }
       }
       return;
    }
    public void e9(){
       if (PatchProxy.applyVoid(null, this, m.class, "51")) {
          return;
       }
       String str = "BeautifyPresenter";
       boolean b = true;
       int i = 0;
       if (this.E == null || this.q == null) {
          a uoa = a.D();
          StringBuilder str1 = "object is null when selectDefaultSuitAndEnter ,  mBeautyFilterCategoryAdapter is null?";
          boolean b1 = (this.E == null)? true: false;
          str1 = str1+b1+"  mBeautyFilterCategoryList is null?";
          if (this.q != null) {
             b = false;
          }
          Object[] objArray = new Object[i];
          uoa.A(str, str1+b, objArray);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          a.D().w(str, "select default suit and enter", objArray1);
          if (this.E.getItemCount() > 0) {
             i = 1;
          }
          BeautifyConfig uBeautifyCon = this.E.N0(i);
          if (uBeautifyCon != null) {
             this.E.k0();
             View childAt = this.q.getChildAt(i);
             if (childAt != null) {
                childAt.callOnClick();
             }
             this.q.invalidate();
             this.a9(uBeautifyCon, b);
          }
          return;
       }
    }
    public void h9(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "50")) {
          return;
       }
       if (p0 != null && (this.getActivity() != null && this.J == 2)) {
          b uob = new b(PrettifyBubbleItem.MEDICAL_BEAUTY_GUIDE);
          uob.b(p0);
          uob.j(new m$a(this));
          uob.k(new l(this));
          this.U.n(uob);
       }
    label_0037 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.v = this.r8("FRAGMENT");
       this.w = this.t8("LAST_SELECT_CONFIG");
       this.x = this.r8("BEAUTY_OPTION");
       this.y = this.r8("RESET_BEAUTY_UI");
       this.z = this.r8("BEAUTY_RELOAD_UI");
       this.A = this.r8("BEAUTY_REFRESH_SELECT");
       this.K = this.t8("PRETTIFY_FRAGMENT");
       this.U = this.r8("BUBBLE_MANAGER");
       return;
    }
    public void j9(){
       StringBuilder str;
       Object[] objArray2;
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "48")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("BeautifyPresenter", "try show medical beauty bubble", objArray1);
       if (a.g() && (this.C.g() != null && (!e.m() && (!e.n() && (!this.G.b() && !this.x.s()))))) {
          boolean b = true;
          if (this.x.t() != b) {
             m tK = this.K;
             if (tK instanceof PrettifyBaseFragment) {
                PrettifyBaseFragment x = tK.x;
                if (this.T != null && (this.S == null && (x != null && !PatchProxy.applyVoid(objArray, this, om, "49")))) {
                   if (this.w != null) {
                      om = this.E;
                      if (om == null || (this.q != null && om.getItemCount())) {
                         BeautifyConfig mId = this.w.mId;
                         str = -1;
                         if (mId != str && mId != -12) {
                            int i = this.E.g1(mId);
                            if (i != str) {
                               b = i;
                            }
                         }
                         objArray2 = new Object[0];
                         a.D().w("BeautifyPresenter", "show medical beauty bubble, itemPosition is "+b, objArray2);
                         if (this.q.getChildCount()) {
                            this.q.x(b);
                            this.h9(this.q.getChildAt(b));
                         }else {
                            this.q.addOnLayoutChangeListener(new t0(this, b));
                         }
                      }
                   }
                   a uoa = a.D();
                   str = "object is null when doActionShowMedicalBubble , mSelectedBeautifyConfig is null?";
                   boolean b1 = (this.w == null)? true: false;
                   str = str+b1+"  mBeautyFilterCategoryAdapter is null?";
                   b1 = (this.E == null)? true: false;
                   str = str+b1+"  mBeautyFilterCategoryList is null?";
                   if (this.q != null) {
                      b = false;
                   }
                   objArray2 = new Object[0];
                   uoa.A("BeautifyPresenter", str+b, objArray2);
                }
             }
          }
       }
    label_010f :
       return;
    }
    public void k9(){
       if (PatchProxy.applyVoid(null, this, m.class, "8")) {
          return;
       }
       if (this.u == null) {
          TextView textView = new TextView(this.v.getContext());
          this.u = textView;
          textView.setTextColor(a1.a(R.color.arg_RES_7f0600a6));
          if (this.v.getActivity() != null) {
             FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
             layoutParams.setMargins(a1.e(10.00f), a1.e(0x41f00000), 0, 0);
             this.v.getActivity().getWindow().getDecorView().addView(this.u, layoutParams);
          }
       }
       StringBuilder str = "Ì×ÏµÃû³Æ£º  ";
       m tw = this.w;
       if (tw != null && (tw instanceof RecoBeautifyConfig && tw.getCurrentConfig() != null)) {
          str = str+this.w.getCurrentConfig().mName;
       }
    label_0081 :
       String str1 = "\n";
       str = str+str1;
       Map y = m.Y;
       if (y != null) {
          Iterator iterator = y.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             str = str+uEntry.getKey()+":  "+uEntry.getValue()+str1;
          }
       }
       this.u.setText(str);
       return;
    }
}
