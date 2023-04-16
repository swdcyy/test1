package com.kuaishou.live.gzone.treasurebox.presenter.h;
import c12.f;
import k77.t$b;
import com.kuaishou.live.gzone.treasurebox.presenter.h$f;
import com.kuaishou.live.gzone.treasurebox.presenter.h$a;
import p53.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a51.c;
import java.lang.Boolean;
import com.kuaishou.live.gzone.treasurebox.k;
import qvb.q;
import qvb.a;
import crd.b;
import lnc.b9;
import mq5.h;
import mq5.b;
import com.kuaishou.live.gzone.treasurebox.presenter.TreasureBoxCommonModel;
import com.kwai.library.widget.popup.common.c;
import com.kwai.robust.PatchProxyResult;
import r53.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import com.kwai.live.gzone.widget.f$b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.live.gzone.treasurebox.presenter.h$c;
import com.kuaishou.live.gzone.treasurebox.presenter.h$d;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.live.gzone.widget.e;
import k67.b;
import brd.y;
import n53.e;
import jp3.a;
import java.lang.StringBuilder;
import qvb.n0;
import p91.m;
import oq5.a;
import j77.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import r53.a;
import com.kuaishou.live.gzone.treasurebox.presenter.h$e;
import erd.g;
import brd.t;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel;
import pm8.a;
import android.content.SharedPreferences;
import com.kuaishou.live.gzone.treasurebox.presenter.g;
import ok.h;
import m53.n;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.content.SharedPreferences$Editor;
import oe6.g;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import u07.t$a;
import p53.t;
import u07.u;
import com.kuaishou.live.gzone.treasurebox.presenter.h$b;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;
import java.util.Iterator;
import java.util.List;
import android.animation.Animator;
import pp.a;
import q87.c;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxListResponse;
import q53.d$a;
import p53.b0;
import q53.d;
import p53.c0;
import mrd.a;
import com.kuaishou.live.gzone.treasurebox.presenter.d;
import p53.y;
import p53.v;
import com.kuaishou.live.gzone.treasurebox.presenter.e;
import p53.w;
import p53.z;
import xq5.c;
import p53.r;
import p53.q1;
import p53.a0;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import p53.m;

public class h extends f	// class@001c88
{
    public List K;
    public m L;
    public a M;
    public b N;
    public b O;
    public b P;
    public boolean Q;
    public LiveSlidePlayService R;
    public b S;
    public e T;
    public b U;
    public boolean U0;
    public b V;
    public b V0;
    public final t$b W;
    public d W0;
    public List X;
    public f X0;
    public k Y;
    public final h Y0;
    public h$f Z;
    public static String sLivePresenterClassName = "LiveGzoneTreasureBoxPanelLogicPresenter";

    public void h(){
       super();
       this.W = new t$b();
       this.Z = new h$f(this, null);
       this.Y0 = new s(this);
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       super.H8();
       return;
    }
    public void Q(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "3")) {
          return;
       }
       h tY = this.Y;
       k ok = null;
       if (tY != null) {
          tY.c();
          this.Y = ok;
       }
       this.k9();
       tY = this.T;
       if (tY != null) {
          tY.f(this.Z);
          this.T = ok;
          this.Z = new h$f(this, ok);
       }
       this.e9();
       this.U0 = false;
       b9.a(this.V0);
       this.b9();
       this.N.le(this.Y0);
       return;
    }
    public void a9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "11")) {
          return;
       }
       this.c9().e(p0);
       return;
    }
    public final void b9(){
       if (PatchProxy.applyVoid(null, this, h.class, "21")) {
          return;
       }
       h tW0 = this.W0;
       if (tW0 != null && tW0.D()) {
          this.W0.o();
       }
       tW0 = this.X0;
       if (tW0 != null && tW0.K()) {
          this.X0.o();
       }
       return;
    }
    public TreasureBoxCommonModel c9(){
       Object obj = PatchProxy.apply(null, this, h.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.P.p();
    }
    public void d9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "25")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       if (!a1.i(this.getActivity())) {
          return;
       }
       f$b uob = new f$b(this.getActivity());
       uob.g0(p0);
       uob.e0(true);
       h$c uoc = new h$c(this, uob);
       this.X0 = uoc;
       uoc.i0(new h$d(this));
       this.X0.Z();
       return;
    }
    public void e9(){
       if (PatchProxy.applyVoid(null, this, h.class, "10")) {
          return;
       }
       h tS = this.S;
       if (tS != null) {
          tS.u7();
       }
       return;
    }
    public final void h9(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "16")) {
          return;
       }
       if (this.N.U0()) {
          return;
       }
       if (!this.c9().a()) {
          this.c9().d.onNext(new Object());
       }
       this.a9("¡¾refreshBoxList¡¿called");
       if (!this.c9().c()) {
          this.a9("¡¾refreshBoxList¡¿denied");
          return;
       }else if(PatchProxy.applyVoid(objArray, this, oh, "17")){
          oh = this.T;
          if (oh == null || !TextUtils.equals(oh.p, this.c9().f())) {
             oh = this.T;
             if (oh != null) {
                oh.f(this.Z);
             }
             e uoe = new e(this.c9().f());
             this.T = uoe;
             uoe.h(this.Z);
          }
       }
       String str = "¡¾refreshBoxList¡¿ #";
       if (a.b()) {
          this.a9(str+this.c9().f()+" can\'t show treasureBox");
          return;
       }else {
          oh = this.T;
          if (oh != null) {
             oh.a();
          }
          this.a9(str+this.c9().f());
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       super.j8();
       this.L = this.r8("LIVE_BASIC_CONTEXT");
       this.M = this.r8("LIVE_CONFIGURATION_SERVICE");
       this.N = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.O = this.q8(b.class);
       this.P = this.r8("LIVE_GZONE_TREASUREBOX_SERVICE");
       this.R = this.t8("LIVE_SLIDE_PLAY_SERVICE");
       this.Q = this.v8("LIVE_IS_SLIDE_CONTAINER", Boolean.class).booleanValue();
       this.P.getServiceManager().l = this.Q;
       this.P.getServiceManager().n = this.N;
       this.P.getServiceManager().o = this.M;
       this.S = this.s8(b.class);
       this.P.p().u = new h$e(this);
       this.X7(this.P.p().s.subscribe(new h$a(this)));
       return;
    }
    public final boolean j9(LiveTreasureBoxModel p0,boolean p1){
       t$a obj;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, oh, "19");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }else if(p0.isSignInBox()){
          return b;
       }else {
          SharedPreferences a = a.a;
          String str = "firstGetTreasureBoxKShell";
          if (!a.getBoolean(str, true)) {
             return b;
          }else if(!this.c9().o()){
             return b;
          }else {
             Activity activity = this.getActivity();
             if (!a1.i(activity)) {
                return b;
             }else if(p1){
                this.V0 = b9.c(this.V0, new g(this, p0));
                return true;
             }else if(PatchProxy.applyVoid(null, null, n.class, "4")){
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action = 0x7644;
                uElementPack.name = "SHOW_CHEST_FIRSTGET";
                u1.u0(4, uElementPack, n.b());
             }
             SharedPreferences$Editor uEditor = a.edit();
             uEditor.putBoolean(str, b);
             g.a(uEditor);
             Object[] objArray = new Object[true];
             objArray[b] = String.valueOf(p0.mKShell);
             obj = new t$a(activity);
             obj.X0(String.format(this.c9().B.getString(R.string.arg_RES_7f100f76), objArray));
             obj.z0(a.a().a().getResources().getString(R.string.arg_RES_7f100f73));
             obj.S0(R.string.arg_RES_7f100f75);
             obj.Q0(R.string.arg_RES_7f100f74);
             obj.u0(new t(this));
             obj.M(new h$b(this));
             j.d(obj);
             return true;
          }
       }
    }
    public void k9(){
       if (PatchProxy.applyVoid(null, this, h.class, "13")) {
          return;
       }
       h tX = this.X;
       if (tX != null) {
          Iterator iterator = tX.iterator();
          while (iterator.hasNext()) {
             Animator uAnimator = iterator.next();
             uAnimator.removeAllListeners();
             uAnimator.cancel();
          }
          Object[] objArray = new Object[0];
          a.C().s("TreasureBoxV2StyleCell-", "stopBoxReadyShakeAnimation: clear", objArray);
          this.X.clear();
          this.X = null;
       }
       return;
    }
    public void l9(LiveTreasureBoxListResponse p0,LiveTreasureBoxModel p1){
       h oh = h.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oh, "18")) {
          return;
       }
       StringBuilder str = "¡¾syncModelWithExistsData¡¿";
       String str1 = (p1 != null)? "boOpenBox": "normal";
       this.a9(str+str1);
       boolean b = this.j9(p1, true);
       if (p1 != null) {
          int position = p1.getPosition();
          if (!b && p0.mLiveTreasureBoxModels.get(position).mRewardPopupModel != null) {
             LiveTreasureBoxModel mRewardPopup = p0.mLiveTreasureBoxModels.get(position).mRewardPopupModel;
             if (!PatchProxy.applyVoidOneRefs(mRewardPopup, this, oh, "20") && a1.i(this.getActivity())) {
                d$a uoa = new d$a(this.getActivity());
                uoa.J = new b0(this);
                uoa.I = mRewardPopup;
                d uod = new d(uoa);
                this.W0 = uod;
                uod.i0(new c0(this));
                this.W0.Z();
             }
          }
          if (this.c9().r.i() != null) {
             p0.mTaskInfo = this.c9().r.i().mTaskInfo;
          }
       }
       b uob = b9.c(this.V, new d(this, p0, p1));
       this.V = uob;
       this.X7(uob);
       return;
    }
    public void x(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "2")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, oh, "5")) {
          this.X7(this.c9().b.subscribe(new y(this)));
          this.X7(this.c9().e.subscribe(new v(this)));
          this.X7(this.c9().g.subscribe(new e(this)));
          this.X7(this.c9().s.subscribe(new w(this)));
          if (!PatchProxy.applyVoid(objArray, this, oh, "8") && this.Q != null) {
             this.R.P4(new z(this));
          }
          if (!PatchProxy.applyVoid(objArray, this, oh, "12")) {
             k ok = new k(new r(this));
             this.Y = ok;
             ok.a = new a0(this);
             this.Y.b();
          }
          this.h9();
          this.N.Km(this.Y0);
          this.X7(RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new m(this)));
       }
       return;
    }
}
