package com.kwai.live.gzone.guess.kshell.q;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import io.reactivex.subjects.PublishSubject;
import com.kwai.live.gzone.guess.kshell.q$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import android.view.View;
import brd.t;
import bn.a;
import java.util.concurrent.TimeUnit;
import p57.q;
import com.kwai.live.gzone.guess.kshell.n;
import erd.g;
import crd.b;
import p57.j;
import com.kwai.live.gzone.guess.kshell.o;
import com.kwai.live.gzone.guess.kshell.r;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.guess.kshell.m;
import android.app.Activity;
import g9c.d;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p57.o;
import com.kwai.live.gzone.guess.kshell.m$a;
import com.kwai.live.gzone.guess.kshell.m$b;
import n57.b;
import p57.m;
import p57.v0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import y8c.g;
import p57.p1;
import p57.r;
import p57.p;
import erd.a;
import p57.l;
import com.kwai.live.gzone.guess.kshell.q$c;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import c77.a$a;
import c77.a;
import lnc.a1;
import com.kwai.framework.model.user.QCurrentUser;
import mkc.b;
import mkc.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import p57.i;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import p57.u;
import mrd.c;
import p57.k;
import x57.e;
import x57.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import j47.c;
import q57.a;
import com.kwai.library.widget.popup.common.c;
import java.lang.Integer;
import ekd.k1;
import androidx.fragment.app.Fragment;
import com.kwai.live.gzone.guess.kshell.LiveGzoneAudienceGuessInputDialog;
import java.lang.Boolean;
import d61.y;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import com.kwai.live.gzone.guess.bean.LiveGzoneAudienceGuessQuestion;
import androidx.fragment.app.KwaiDialogFragment;
import java.util.List;
import com.kwai.live.gzone.guess.bean.BetOptionInfo;
import com.kwai.live.gzone.guess.kshell.p;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import com.kwai.live.gzone.widget.f$b;
import com.kwai.live.gzone.guess.kshell.q$d;
import com.kwai.live.gzone.guess.kshell.q$e;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.live.gzone.widget.e;
import com.kwai.live.gzone.guess.bean.KShellGuessPaperResponse;
import com.kwai.live.gzone.guess.kshell.KShellGuessQuestionStatus;
import com.kwai.live.gzone.guess.kshell.q$f;
import java.lang.Enum;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ScreenPackage;
import k2b.u1;
import ekd.m1;
import com.kwai.library.widget.specific.misc.LoadingView;
import com.kwai.live.gzone.guess.kshell.q$a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.guess.kshell.t;
import java.util.Map;
import java.util.HashMap;
import lp3.e;

public class q extends PresenterV2 implements g	// class@000d64
{
    public View A;
    public View B;
    public View C;
    public View D;
    public View E;
    public View F;
    public boolean G;
    public b H;
    public e I;
    public c J;
    public b K;
    public p1 L;
    public d M;
    public final q$g N;
    public a O;
    public PagerSlidingTabStrip$d P;
    public KShellGuessConfig Q;
    public KShellGuessPaperResponse R;
    public LiveGzoneAudienceGuessInputDialog S;
    public a$a T;
    public f p;
    public m q;
    public RecyclerView r;
    public LoadingView s;
    public TextView t;
    public TextView u;
    public final PublishSubject v;
    public View w;
    public View x;
    public View y;
    public View z;

    public void q(){
       super();
       this.v = PublishSubject.g();
       this.G = false;
       this.N = new q$b(this);
    }
    public void E8(){
       q tK;
       q oq = q.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oq, "3")) {
          return;
       }
       this.s.getTitleView().setTextColor(-1);
       this.u.setVisibility(4);
       if (!PatchProxy.applyVoid(objArray, this, oq, "9")) {
          tK = this.z;
          if (tK != null) {
             a.b(tK).throttleFirst((long)2, TimeUnit.SECONDS).subscribe(new q(this), n.b);
          }
          a.b(this.y).throttleFirst((long)2, TimeUnit.SECONDS).subscribe(new j(this), o.b);
          tK = this.x;
          if (tK != null) {
             tK.setOnClickListener(new r(this));
          }
       }
       m om = new m(this.getActivity());
       this.q = om;
       this.M = new d(om);
       this.r.setLayoutManager(new LinearLayoutManager(this.getContext()));
       this.r.setAdapter(this.M);
       this.q.s1(new o(this));
       om = this.q.x;
       om.j = this.H;
       om.k = this.J;
       tK = this.K;
       if (tK == null) {
          return;
       }else {
          this.X7(tK.b().subscribe(new m(this)));
          this.X7(this.v.subscribe(new v0(this.getActivity(), this.r, this.q, this.H.a())));
          this.X7(this.L.a().doOnSubscribe(new r(this)).doFinally(new p(this)).subscribe(new l(this)));
          if (this.O != null) {
             tK = this.P;
             if (tK != null) {
                q$c uoc = new q$c(this, tK.c());
                this.T = uoc;
                this.O.e(uoc);
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, oq, "5")) {
             this.t.setTextColor(a1.a(R.color.arg_RES_7f061428));
             this.u.setTextColor(a1.a(R.color.arg_RES_7f061429));
          }
          if (!QCurrentUser.me().isLogined() && !PatchProxy.applyVoid(objArray, this, oq, "6")) {
             this.A.setVisibility(8);
             this.s.setVisibility(8);
             KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
             uoa.b();
             uoa.k(R.drawable.arg_RES_7f080609);
             uoa.j(2);
             uoa.h(R.string.arg_RES_7f1030ae);
             uoa.e(R.string.arg_RES_7f103059);
             uoa.p(new i(this));
             uoa.a(c.h(this.r, b.g));
          }
          this.X7(RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new u(this)));
          this.X7(this.K.d().subscribe(new k(this)));
          if (TextUtils.x(a.a().f())) {
             this.B.setVisibility(8);
          }else {
             this.B.setVisibility(0);
             a.f(this.H.a(), "1", this.J.T2());
          }
          oq = this.C;
          if (oq != null) {
             oq.setVisibility(this.B.getVisibility());
          }
          return;
       }
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, q.class, "25")) {
          return;
       }
       if (this.r == null) {
          return;
       }
       q tp = this.p;
       if (tp != null) {
          tp.o();
          this.p = objArray;
       }
       this.P8();
       tp = this.q;
       if (tp != null) {
          tp.s1(objArray);
          this.q.z0(this.r);
       }
       this.r.setAdapter(objArray);
       if (this.R != null) {
          this.J.t3();
       }
       this.v.onNext(Integer.valueOf(5));
       k1.n(this);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, q.class, "27")) {
          return;
       }
       q tS = this.S;
       if (tS != null && tS.isVisible()) {
          this.S.dismiss();
          this.S = null;
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, q.class, "11")) {
          return;
       }
       q tK = this.K;
       if (tK != null) {
          tK.k();
       }
       return;
    }
    public final void S8(boolean p0){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oq, "29")) {
          return;
       }
       oq = this.D;
       if (oq == null || (this.E != null && this.F != null)) {
          if (p0) {
             oq.setVisibility(0);
             this.E.setVisibility(0);
             this.F.setVisibility(8);
          }else {
             oq.setVisibility(8);
             this.E.setVisibility(8);
             this.F.setVisibility(0);
          }
       }
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, q.class, "18")) {
          return;
       }
       a.k(this.H.a(), y.d(this.getActivity()));
       this.X8(WebEntryUrls.o0);
       return;
    }
    public final void W8(LiveGzoneAudienceGuessQuestion p0,int p1){
       if (PatchProxy.isSupport(q.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, q.class, "26")) {
          return;
       }
       LiveGzoneAudienceGuessInputDialog liveGzoneAud = new LiveGzoneAudienceGuessInputDialog();
       this.S = liveGzoneAud;
       liveGzoneAud.mh("ARG_NEW_STYLE", true);
       q tS = this.S;
       tS.Y = this.Q;
       tS.U = p0;
       tS.V = p0.mBetOptionInfos.get(p1);
       this.S.Fh(a.a().c("KShellQuestionPresenter", this.H.getLiveStreamId()));
       if (!PatchProxy.applyVoid(null, this, q.class, "7")) {
          p0.Q = new p(this);
       }
       p0.W0 = this.J.T2();
       q tS1 = this.S;
       tS1.V0 = this.H;
       tS1.y = this.J;
       tS1.X0 = this.I;
       tS1.Cb(this.getActivity().getSupportFragmentManager(), "KShellQuestionPresenter");
       return;
    }
    public final void X8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "28")) {
          return;
       }
       f$b uob = new f$b(this.getActivity());
       uob.g0(p0);
       uob.e0(false);
       q$d uod = new q$d(this, uob);
       this.p = uod;
       uod.i0(new q$e(this));
       this.p.Z();
       return;
    }
    public void Y8(){
       int i4;
       String str;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, q.class, "13")) {
          return;
       }
       q tO = this.O;
       if (tO != null) {
          q tP = this.P;
          if (tP != null && !tO.a(tP.c())) {
             return;
          }
       }
       if (this.R == null) {
          return;
       }else {
          int i = 0;
          boolean b = true;
          KShellGuessQuestionStatus kShellGuessQ = (!this.u.getVisibility())? 1: null;
          KShellGuessQuestionStatus kShellGuessQ1 = KShellGuessQuestionStatus.fromStatus(this.R.mBets.get(i).mStatus);
          if (this.G != null) {
             if (kShellGuessQ1 == KShellGuessQuestionStatus.PAPER_STOPPED) {
                this.G = i;
             }
             return;
          }else {
             this.G = b;
             int i1 = q$f.a[kShellGuessQ1.ordinal()];
             int i2 = 5;
             int i3 = 3;
             if (i1 != b) {
                if (i1 != 2) {
                   i4 = (i1 != i3)? 4: 5;
                }else {
                   i4 = 3;
                }
             }else if(kShellGuessQ != null){
                i4 = 1;
             }else {
                i4 = 2;
             }
             ClientContent$LiveStreamPackage liveStreamPa = this.H.a();
             int i5 = this.R.mBets.size();
             int i6 = this.R.mUserBetInfos.size();
             boolean b1 = y.d(this.getActivity());
             if (PatchProxy.isSupport(a.class)) {
                Object[] objArray1 = new Object[]{liveStreamPa,Boolean.TRUE,Integer.valueOf(i5),Integer.valueOf(i6),Integer.valueOf(i4),Boolean.valueOf(b1)};
                if (PatchProxy.applyVoid(objArray1, objArray, a.class, "16")) {
                label_0124 :
                   return;
                }
             }
             if (i4 != b && i4 != 2) {
                str = (i4 != i3)? a1.p(R.string.arg_RES_7f101437): a1.p(R.string.arg_RES_7f10143a);
             }else {
                str = a1.p(R.string.arg_RES_7f101438);
             }
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "GUESS_HALF_PAGE";
             i3 oi3 = i3.f();
             oi3.c("ui_type", Integer.valueOf(2));
             oi3.c("total_issue_num", Integer.valueOf(i5));
             oi3.c("guessed_issue_num", Integer.valueOf(i6));
             oi3.d("pendent_type", str);
             oi3.c("guess_type", Integer.valueOf(i4));
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             uContentPack.screenPackage = a.a(b1);
             u1.u0(4, uElementPack, uContentPack);
             goto label_0124 ;
          }
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "2")) {
          return;
       }
       this.D = m1.f(p0, 0x7f0a171e);
       this.E = m1.f(p0, 0x7f0a364f);
       this.F = m1.f(p0, 0x7f0a115b);
       this.t = m1.f(p0, 0x7f0a162a);
       this.r = m1.f(p0, 0x7f0a33a7);
       this.s = m1.f(p0, 0x7f0a2921);
       this.y = m1.f(p0, 0x7f0a162e);
       this.x = m1.f(p0, 0x7f0a2bfc);
       this.z = m1.f(p0, 0x7f0a3668);
       this.u = m1.f(p0, 0x7f0a3ef1);
       this.w = m1.f(p0, 0x7f0a33a5);
       this.A = m1.f(p0, 0x7f0a1631);
       this.B = m1.f(p0, 0x7f0a108d);
       this.C = m1.f(p0, 0x7f0a108e);
       this.B.setOnClickListener(new q$a(this));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new t();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, q.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(q.class, new t());
       }else {
          obj.put(q.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.O = this.s8(a.class);
       this.P = this.t8("LIVE_GZONE_TAB");
       this.H = this.r8("LIVE_BASIC_CONTEXT");
       this.I = this.r8("KEY_LIVE_GZONE_SERVICE_MANAGER");
       this.J = this.q8(c.class);
       this.K = this.s8(b.class);
       this.L = this.r8("LIVE_GUESS_INNER_SERVICE");
       return;
    }
}
