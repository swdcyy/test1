package com.kuaishou.live.core.show.vote.presenter.c;
import im8.g;
import c12.f;
import com.kuaishou.live.core.show.vote.presenter.c$e;
import dm2.g;
import com.kuaishou.live.core.show.vote.presenter.b;
import dm2.f;
import com.kuaishou.live.core.show.vote.presenter.c$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import t02.a0;
import lf3.g;
import hf3.a;
import crd.b;
import lnc.b9;
import com.kwai.library.widget.popup.common.c;
import mq5.h;
import mq5.b;
import com.kuaishou.live.core.show.vote.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import mrd.c;
import com.kwai.robust.PatchProxyResult;
import mrd.a;
import io.reactivex.subjects.PublishSubject;
import ks5.m;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService;
import android.view.View;
import k67.e$a;
import k67.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import ekd.m1;
import com.kwai.live.gzone.widget.LiveGzoneRingProgressImageView;
import com.kuaishou.live.core.show.vote.presenter.LiveVoteView;
import android.content.Context;
import android.widget.TextView;
import com.kwai.live.gzone.pendant.service.LiveGzoneAudienceFeatureEntranceItem;
import dm2.m;
import dm2.e;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.vote.presenter.c$f;
import com.kuaishou.live.core.show.vote.e$b;
import com.kuaishou.live.core.show.vote.presenter.e;
import java.util.Map;
import java.util.HashMap;
import android.app.Activity;
import lnc.a1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import am2.a;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import dm2.h;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import wh5.c;
import ad5.b;
import com.kuaishou.live.core.show.vote.response.LiveVoterResponse;
import com.kuaishou.live.core.show.vote.model.LiveVoteContext;
import yl2.a;
import o02.e;
import brd.t;
import cjd.e;
import erd.o;
import dm2.k;
import dm2.i;
import erd.g;
import java.util.List;
import com.kuaishou.live.core.show.vote.model.LiveVoteOption;
import java.util.Arrays;
import cm2.e;
import cm2.e$a;
import android.os.Bundle;
import com.kwai.library.widget.popup.common.c$b;
import com.kuaishou.live.core.show.vote.presenter.c$c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import cm2.p$b;
import cm2.k;
import gw1.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCVoteChanged;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCVoteClosed;
import com.kuaishou.live.core.show.vote.presenter.c$b;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import dm2.j;

public class c extends f implements g	// class@001245
{
    public final String K;
    public c$d L;
    public a0 M;
    public LiveTopPendantTempPlayService N;
    public LiveGzoneRingProgressImageView O;
    public TextView P;
    public e$a Q;
    public m R;
    public c S;
    public c T;
    public e U;
    public String U0;
    public e V;
    public long V0;
    public LiveVoteResultFragment W;
    public boolean W0;
    public LiveVoterResponse X;
    public String X0;
    public b Y;
    public View Y0;
    public b Z;
    public final h Z0;
    public final g a1;
    public final g b1;
    public final p$b c1;
    public static String sLivePresenterClassName = "LiveAudienceVotePresenter";

    public void c(){
       super();
       this.K = "LiveAudienceVotePresenter";
       this.L = new c$e(this);
       this.Z0 = new g(this);
       this.a1 = new b(this);
       this.b1 = new f(this);
       this.c1 = new c$a(this);
    }
    public void Q(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "4")) {
          return;
       }
       this.M.C.o(500, this.a1);
       this.M.C.o(501, this.b1);
       if (!PatchProxy.applyVoid(null, this, uoc, "8")) {
          b9.a(this.Y);
          b9.a(this.Z);
          if (this.h9()) {
             uoc = this.V;
             if (uoc != null) {
                uoc.q(0);
             }
          }
          this.M.D2.le(this.Z0);
          this.V = null;
          this.d9();
          uoc = this.U;
          if (uoc != null) {
             uoc.c();
          }
          this.W0 = false;
          this.U0 = null;
          this.U = null;
       }
       return;
    }
    public void a9(){
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "6")) {
          return;
       }
       c tW = this.W;
       if (!PatchProxy.applyVoidOneRefs(tW, this, uoc, "7") && (tW != null && (tW.isVisible() && tW.getFragmentManager() != null))) {
          tW.dismissAllowingStateLoss();
       }
    label_0028 :
       uoc = this.V;
       if (uoc != null && uoc.K()) {
          this.V.q(0);
       }
       return;
    }
    public c b9(){
       Object obj = PatchProxy.apply(null, this, c.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.T == null) {
          this.T = a.g();
       }
       return this.T;
    }
    public c c9(){
       Object obj = PatchProxy.apply(null, this, c.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.S == null) {
          this.S = PublishSubject.g();
       }
       return this.S;
    }
    public void d9(){
       if (PatchProxy.applyVoid(null, this, c.class, "11")) {
          return;
       }
       c tR = this.R;
       if (tR != null) {
          c tN = this.N;
          if (tN != null) {
             tN.c(tR);
          }else {
          label_0018 :
             tR = this.Q;
             if (tR != null && this.M.O1 != null) {
                View view = tR.e();
                if (view != null) {
                   view.setVisibility(8);
                }
                this.M.O1.y8(this.Q, 8);
             }
          }
       }else {
          goto label_0018 ;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       if (!b.d(this)) {
          this.Y0 = m1.f(p0, 0x7f0a1fdb);
          this.O = m1.f(p0, 0x7f0a27f9);
       }else {
          LiveVoteView liveVoteView = new LiveVoteView(this.getContext());
          this.Y0 = liveVoteView;
          this.P = m1.f(liveVoteView, 0x7f0a1a5b);
       }
       return;
    }
    public final void e9(){
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "10")) {
          return;
       }
       if (!b.d(this)) {
          a0 o1 = this.M.O1;
          if (o1 != null) {
             this.Q = o1.Sc(LiveGzoneAudienceFeatureEntranceItem.VOTE, this.Y0);
             uoc = this.O;
             if (uoc != null) {
                uoc.setShowProgress(false);
             }
          }else if(this.P != null){
             c tY0 = this.Y0;
             m om = PatchProxy.applyOneRefs(tY0, this, uoc, "18");
             if (om != PatchProxyResult.class) {
             }else {
                om = new m(this, tY0);
             }
             this.R = om;
          }
       }else {
          goto label_002b ;
       }
       uoc = this.Y0;
       if (uoc != null) {
          uoc.setOnClickListener(new e(this));
       }
       this.U = new e(new c$f(this));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new e());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
    public final boolean h9(){
       c obj = PatchProxy.apply(null, this, c.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.V;
       boolean b = (obj != null && obj.K())? true: false;
       return b;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       super.j8();
       this.M = this.r8("LIVE_PLAY_CALLER_CONTEXT");
       this.N = this.s8(LiveTopPendantTempPlayService.class);
       return;
    }
    public final void j9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "13")) {
          return;
       }
       if (!a1.i(this.getActivity())) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.M.Z2.a();
       if (!PatchProxy.applyVoidOneRefs(liveStreamPa, objArray, a.class, "12")) {
          a.c("VOTE_ENTRANCE", liveStreamPa);
       }
       if (!QCurrentUser.ME.isLogined()) {
          d.a(-1712118428).ne(this.getContext(), "live_vote", "live_vote", 75, this.getContext().getString(R.string.arg_RES_7f102e9b), null, null, null, new h(this)).h();
          return;
       }else if(c.b()){
          return;
       }else if(!d.a(0x630bc993).isAvailable()){
          return;
       }else {
          this.X0 = "";
          this.k9();
          return;
       }
    }
    public void k9(){
       if (PatchProxy.applyVoid(null, this, c.class, "14")) {
          return;
       }
       c tX = this.X;
       if (tX != null) {
          LiveVoterResponse mVote = tX.mVote;
          if (mVote != null) {
             LiveVoteContext mVoteId = mVote.mVoteId;
          label_001a :
             if (tX == null) {
                return;
             }else {
                this.X7(e.p().c(tX).map(new e()).subscribe(new k(this), new i(this)));
                return;
             }
          }
       }
       tX = this.U0;
       goto label_001a ;
    }
    public void l9(LiveVoterResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "12")) {
          return;
       }
       if (!(p0.mVote.mVoteId).equals(this.X0) && this.W0 != null) {
          a.g(this.M.Z2.a());
          LiveVoterResponse mVote = p0.mVote;
          this.X0 = mVote.mVoteId;
          LiveVoteOption[] liveVoteOpti = new LiveVoteOption[mVote.mOptions.size()];
          LiveVoterResponse mVote1 = p0.mVote;
          liveVoteOpti = mVote1.mOptions.toArray(liveVoteOpti);
          if (liveVoteOpti != null) {
             int len = liveVoteOpti.length;
             int i = 0;
             int i1 = 0;
             while (i < len) {
                LiveVoteOption mCount = liveVoteOpti[i].mCount;
                if (i1 < mCount) {
                   i1 = mCount;
                }
                i = i + 1;
             }
             len = liveVoteOpti.length;
             i = 0;
             while (i < len) {
                object oobject = liveVoteOpti[i];
                oobject.isHighLight = (i1 == oobject.mCount && i1 > null)? true: false;
                i = i + 1;
             }
          }
          mVote1.mOptions = Arrays.asList(liveVoteOpti);
          c tV = this.V;
          if (tV != null && tV.K()) {
             this.V.f0();
             this.V.d0(p0);
          }else {
             this.m9();
             this.V.f0();
             this.V.b0(p0);
          }
       }
       return;
    }
    public final void m9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "16")) {
          return;
       }
       if (this.h9()) {
          c tV = this.V;
          if (tV != null) {
             tV.q(0);
          }
       }
       if (this.V == null) {
          e$a uoa = new e$a(this.getActivity());
          uoa.y(new Bundle());
          uoa.M(new c$c(this));
          uoa.d0(this.M.Z2);
          uoa.e0(this.c1);
          Object obj = PatchProxy.applyOneRefs(uoa, objArray, k.class, "1");
          if (obj != PatchProxyResult.class) {
             uoa = obj;
          }else {
             uoa.a0(a1.a(R.color.arg_RES_7f06143c));
             uoa.b0(a1.a(R.color.arg_RES_7f060c88));
             uoa.c0(a1.a(R.color.arg_RES_7f06015b));
             uoa.f0(true);
             uoa.L = true;
          }
          this.V = new e(uoa);
       }
       this.V.Z();
       return;
    }
    public void x(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "3")) {
          return;
       }
       if (!a.c()) {
          this.e9();
       }
       this.M.C.u0(500, LiveStreamMessages$SCVoteChanged.class, this.a1);
       this.M.C.u0(501, LiveStreamMessages$SCVoteClosed.class, this.b1);
       this.M.D2.Km(this.Z0);
       this.M.y2.P4(new c$b(this));
       this.X7(RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new j(this)));
       return;
    }
}
