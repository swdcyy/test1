package com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameController;
import jt1.a;
import zs1.b;
import ps1.e;
import ut1.d;
import hu1.c;
import st1.a;
import ht1.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ft1.b;
import com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameController$1;
import msd.a;
import yt1.f;
import zs1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import yt1.e;
import jt1.d;
import yt1.b;
import au1.c;
import kt1.d;
import com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameController$gameViewModel$2;
import com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameController$$special$$inlined$viewModels$1;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameViewModel;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameController$$special$$inlined$viewModels$2;
import com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameController$b;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkSwitchManager;
import java.util.Objects;
import qrd.p;
import java.lang.Boolean;
import android.content.Context;
import android.view.View;
import ha1.b;
import ha1.a;
import jt1.i;
import androidx.lifecycle.LifecycleOwner;
import jt1.e;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import jt1.f;
import jt1.g;
import jt1.h;
import java.util.List;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkDebugLogKt;
import ut1.f;
import java.lang.Integer;
import com.kuaishou.android.live.log.b;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiPkVoteEnd;
import com.kuaishou.live.common.core.component.multipk.core.a;
import lf3.g;
import pu1.m;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkTimeLine;
import java.lang.Long;
import w12.a;
import zs1.d;
import trd.j;
import crd.b;
import lnc.b9;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.multipk.game.vc.a;
import bt1.c;
import bt1.b;
import androidx.lifecycle.MutableLiveData;
import eu1.b;
import pu1.i;
import com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameController$a;
import z0.a;
import androidx.lifecycle.Transformations;
import android.view.ViewGroup;
import com.kuaishou.live.common.core.component.multipk.game.vc.anim.LiveMultiPkGameAnimVC;
import xt1.g;
import ws1.c;
import yt1.g;
import yt1.c;
import wt1.c;
import jt1.c;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkBangsVC;
import ut1.j;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpVC;
import du1.d;
import ct1.b;
import com.kuaishou.protobuf.livestream.nano.CohesionPkInfo;
import bt1.a;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkBottomTip;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.live.common.core.component.multipk.game.vc.scorelimit.LiveMultiPkScoreLimitMvpNoticeViewController;

public class LiveMultiPkGameController extends a	// class@0015e7
{
    public a k;
    public final c l;
    public final d m;
    public final p n;
    public final LiveMultiPkGameController$b o;
    public LiveMultiPkScoreLimitMvpNoticeViewController p;
    public ViewController q;
    public b r;
    public final b s;
    public final e t;
    public final d u;
    public final c v;
    public final a w;
    public final a x;

    public void LiveMultiPkGameController(b p0,e p1,d p2,c p3,a p4,a p5){
       a.p(p0, "coreModel");
       a.p(p1, "pkDelegate");
       a.p(p2, "countDownModel");
       a.p(p3, "renderModel");
       a.p(p4, "logDelegate");
       a.p(p5, "skinManager");
       super(new b(p0, new LiveMultiPkGameController$1(p1)));
       this.s = p0;
       this.t = p1;
       this.u = p2;
       this.v = p3;
       this.w = p4;
       this.x = p5;
       f uof = p0.u();
       d uod = PatchProxy.applyOneRefs(p1, this, LiveMultiPkGameController.class, "25");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d(this, p1);
       }
       c uoc = PatchProxy.apply(null, this, LiveMultiPkGameController.class, "24");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c();
       }
       this.l = new f(uof, uod, uoc);
       this.m = new d();
       this.n = new ViewModelLazy(m0.d(LiveMultiPkGameViewModel.class), new LiveMultiPkGameController$$special$$inlined$viewModels$2(new LiveMultiPkGameController$$special$$inlined$viewModels$1(this)), new LiveMultiPkGameController$gameViewModel$2(this));
       this.o = new LiveMultiPkGameController$b(this);
       return;
    }
    public void F2(){
       View view;
       LiveMultiPkGameController liveMultiPkG = LiveMultiPkGameController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveMultiPkG, "4")) {
          return;
       }
       super.F2();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "2";
       if (!PatchProxy.applyVoid(objArray, this, liveMultiPkG, "11")) {
          LiveMultiPkSwitchManager d = LiveMultiPkSwitchManager.d;
          Objects.requireNonNull(d);
          Boolean uBoolean = PatchProxy.apply(objArray, d, LiveMultiPkSwitchManager.class, str);
          if (uBoolean == patchProxyRe) {
             uBoolean = LiveMultiPkSwitchManager.b.getValue();
          }
          int i = 0x7f0d0cc1;
          if (uBoolean.booleanValue()) {
             view = b.b(this.D2(), i);
             a.o(view, "LiteLayoutInflater.infla¡­_multi_pk_game_container\)");
          }else {
             view = a.a(this, this.D2(), i);
          }
          this.R2(view);
          i oi = new i(this.P2(), this, this.x);
          Object obj = PatchProxy.apply(objArray, this, liveMultiPkG, "3");
          if (obj != patchProxyRe) {
          }else {
             obj = this.n.getValue();
          }
          if (!PatchProxy.applyVoidOneRefs(obj, oi, i.class, "1")) {
             a.p(obj, "viewModel");
             obj.d.observe(oi.d, new e(oi));
             obj.b.observe(oi.d, new f(oi));
             obj.c.observe(oi.d, new g(oi));
             obj.v0().observe(oi.d, new h(oi));
          }
       }
       this.b3();
       if (!PatchProxy.applyVoid(objArray, this, liveMultiPkG, "12")) {
          b uob = this.W2();
          Objects.requireNonNull(uob);
          if (!PatchProxy.applyVoid(objArray, uob, b.class, str)) {
             b.T(LiveMultiPkDebugLogKt.b(), "create", "pkId", uob.i.e(), "pkType", Integer.valueOf(uob.i.h()));
             uob.n.u().u0(953, SCLiveMultiPkVoteEnd.class, uob.m);
             long l = m.a.a(uob.i.m(), uob.o);
             b.T(LiveMultiPkDebugLogKt.b(), "tryChangeToVoteState", "left", Long.valueOf(l), "param", uob.n.p());
             if (l - 1000 > 0) {
                b.S(LiveMultiPkDebugLogKt.b(), "changeToVoteState", "param", uob.n.p());
                uob.g.n(2);
             }
             uob.n.a(uob);
          }
       }
       this.s.a(this.o);
       return;
    }
    public void J2(){
       LiveMultiPkGameController liveMultiPkG = LiveMultiPkGameController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveMultiPkG, "6")) {
          return;
       }
       super.J2();
       LiveMultiPkGameController tm = this.m;
       Objects.requireNonNull(tm);
       if (!PatchProxy.applyVoid(objArray, tm, d.class, "4")) {
          tm.a.clear();
       }
       this.s.D(this.o);
       if (!PatchProxy.applyVoid(objArray, this, liveMultiPkG, "13")) {
          b uob = this.W2();
          Objects.requireNonNull(uob);
          if (!PatchProxy.applyVoid(objArray, uob, b.class, "5")) {
             b.S(LiveMultiPkDebugLogKt.b(), "destroy", "param", uob.n.p());
             uob.n.u().o(953, uob.m);
             b9.a(uob.k);
             b9.a(uob.l);
             uob.n.D(uob);
             uob.g.l();
             uob.h.clear();
          }
       }
       return;
    }
    public final a X2(){
       LiveMultiPkGameController obj = PatchProxy.apply(null, this, LiveMultiPkGameController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj == null) {
          a.S("containerLayoutVC");
       }
       return obj;
    }
    public void Y0(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkGameController.class, "7")) {
          return;
       }
       b.d(this);
       LiveMultiPkGameController tv = this.v;
       tv.b().setValue(i.b(this.s));
       tv.d().setValue(Boolean.FALSE);
       return;
    }
    public final b Y2(){
       return this.s;
    }
    public void Z1(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkGameController.class, "9")) {
          return;
       }
       LiveMultiPkGameController tv = this.v;
       tv.b().setValue(null);
       tv.d().setValue(Boolean.FALSE);
       tv = this.p;
       if (tv != null) {
          this.O2(tv);
          this.p = null;
       }
       return;
    }
    public final a Z2(){
       return this.w;
    }
    public final c a3(){
       return this.v;
    }
    public void b3(){
       ViewGroup viewGroup;
       f value;
       LiveMultiPkGameController tu;
       LiveMultiPkGameController tk;
       LiveMultiPkGameController obj;
       boolean b;
       b uob2;
       LiveMultiPkGameController tu1;
       ViewGroup obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveMultiPkGameController liveMultiPkG = LiveMultiPkGameController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveMultiPkG, "5")) {
          return;
       }
       LiveData liveData = Transformations.map(this.s.l(), new LiveMultiPkGameController$a(this));
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       liveData = Transformations.distinctUntilChanged(liveData);
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       String str = "containerLayoutVC";
       int i = 0;
       LiveMultiPkGameController liveMultiPkG1 = 1;
       if (!PatchProxy.applyVoidOneRefs(liveData, this, liveMultiPkG, "15")) {
          obj = this.s;
          Object obj2 = PatchProxy.applyOneRefs(obj, objArray, m.class, "11");
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else {
             a.p(obj, "liveMultiPkCoreModel");
             value = obj.l().getValue();
             b = (value != null && value.h() == liveMultiPkG1)? true: false;
          }
          this.k = new a(b, m.s(this.s), liveData);
          View view = this.P2();
          Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
          tu = this.k;
          if (tu == null) {
             a.S(str);
          }
          this.y2(view, tu);
       }
       if (!PatchProxy.applyVoid(objArray, this, liveMultiPkG, "19")) {
          obj1 = this.A2(R.id.live_multi_game_anim_container);
          if (obj1 != null) {
             this.y2(obj1, new LiveMultiPkGameAnimVC(this.m, this.x));
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, liveMultiPkG, "16")) {
          obj = PatchProxy.apply(objArray, this, liveMultiPkG, "22");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(!m.s(this.s) && !m.a.i(this.s)){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             obj = this.l;
             uob2 = this.W2();
             tu1 = this.u;
             tk = this.m;
             LiveMultiPkGameController tk1 = this.k;
             if (tk1 == null) {
                a.S(str);
             }
             g og = new g(uob2, tu1, tk, tk1, this.x);
             obj.V2(liveMultiPkG1, v14);
          }
          obj1 = PatchProxy.apply(objArray, this, liveMultiPkG, "23");
          boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): m.a.i(this.s);
          if (b1) {
             LiveMultiPkGameController tl = this.l;
             b = 3;
             tu = this.s;
             uob2 = this.W2();
             tu1 = this.k;
             if (tu1 == null) {
                a.S(str);
             }
             tl.V2(b, new c(tu, uob2, tu1));
          }
          this.z2(this.l);
       }
       if (!PatchProxy.applyVoidOneRefs(liveData, this, liveMultiPkG, "20")) {
          liveData.observe(this, new c(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, liveMultiPkG, "17")) {
          tu = this.u;
          LiveMultiPkGameController ts1 = this.s;
          b uob1 = this.W2();
          tk = this.k;
          if (tk == null) {
             a.S(str);
          }
          LiveMultiPkBangsVC liveMultiPkB = new LiveMultiPkBangsVC(tu, ts1, uob1, tk, this.t, this.w);
          this.z2(patchProxyRe);
       }
       if (!PatchProxy.applyVoid(objArray, this, liveMultiPkG, "18") && this.s.w().f()) {
          viewGroup = this.A2(R.id.live_multi_pk_mvp_container);
          if (viewGroup != null) {
             viewGroup.setVisibility(i);
             this.y2(viewGroup, new LiveMultiPkMvpVC(this.s, this.W2(), this.t, this.x));
             this.t.i1();
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, liveMultiPkG, "21") && m.a.i(this.s)) {
          viewGroup = this.A2(R.id.live_multi_pk_cohesion_container);
          if (viewGroup != null) {
             LiveMultiPkGameController ts = this.s;
             value = ts.l().getValue();
             if (value != null) {
                objArray = value.c();
             }
             b uob = new b(ts, objArray, this.t);
             this.r = uob;
             this.y2(viewGroup, uob);
          }
       }
       return;
    }
    public void e2(a p0){
       LiveMultiPkGameController liveMultiPkG = LiveMultiPkGameController.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveMultiPkG, "8")) {
          return;
       }
       a.p(p0, "gameInfo");
       LiveMultiPkGameController tv = this.v;
       tv.b().setValue(i.a(this.s));
       tv.d().setValue(Boolean.TRUE);
       p0 = p0.j;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveMultiPkG, "14") || (p0 == null || (!TextUtils.isEmpty(p0.displayText) && p0.displayMs > 0))) {
          this.p = new LiveMultiPkScoreLimitMvpNoticeViewController(p0);
          liveMultiPkG = this.p;
          a.m(liveMultiPkG);
          this.y2(this.A2(R.id.live_pk_score_limit_bar_container), liveMultiPkG);
       }
    label_005e :
       this.O2(this.l);
       return;
    }
}
