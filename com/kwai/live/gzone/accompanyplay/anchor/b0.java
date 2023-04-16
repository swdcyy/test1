package com.kwai.live.gzone.accompanyplay.anchor.b0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kwai.live.gzone.accompanyplay.anchor.LiveGzoneAnchorAccompanyFleetStateFragment;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetInfo;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import h37.n0;
import crd.b;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import com.kwai.live.gzone.accompanyplay.anchor.d0;
import erd.g;
import f37.a;
import android.content.SharedPreferences;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import lnc.a1;
import e17.i;
import androidx.constraintlayout.widget.Group;
import android.widget.CheckBox;
import android.text.SpannableStringBuilder;
import io.reactivex.android.schedulers.a;
import com.kwai.live.gzone.accompanyplay.anchor.c0;
import bjd.d;
import bb6.c;
import com.kwai.framework.network.cdn.CdnHostGroupType;
import java.util.Map;
import java.util.Collections;
import com.kwai.live.gzone.accompanyplay.anchor.b0$c;
import android.widget.CompoundButton$OnCheckedChangeListener;
import com.kwai.live.gzone.accompanyplay.anchor.b0$d;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.anchor.b0$e;
import com.kwai.library.widget.popup.common.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.System;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import j37.b;
import j37.a;
import com.yxcorp.gifshow.fragment.ObservableBox;
import android.app.Activity;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import gr8.b;
import brd.x;
import com.kwai.live.gzone.accompanyplay.anchor.b0$a;
import sfc.a;
import com.kwai.live.gzone.accompanyplay.anchor.b0$f;
import java.util.Iterator;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyMemberInfo;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.live.gzone.accompanyplay.anchor.b0$b;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import d61.f0;

public class b0 extends PresenterV2	// class@000afe
{
    public c A;
    public Group B;
    public CheckBox C;
    public TextView D;
    public TextView E;
    public TextView F;
    public KwaiImageView G;
    public boolean H;
    public int I;
    public ViewGroup J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public KwaiBindableImageView P;
    public TextView p;
    public TextView q;
    public TextView r;
    public b s;
    public b t;
    public LiveGzoneAnchorAccompanyFleetStateFragment u;
    public LiveGzoneAccompanyFleetInfo v;
    public String w;
    public String x;
    public String y;
    public c z;

    public void b0(){
       super();
       this.L = false;
       this.M = false;
       this.N = false;
       this.O = false;
    }
    public void E8(){
       LiveGzoneAccompanyFleetInfo liveGzoneAcc = this;
       b0 uob0 = b0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, liveGzoneAcc, uob0, "3")) {
          return;
       }
       if (liveGzoneAcc.u == null) {
          return;
       }
       b0 x = liveGzoneAcc.x;
       if (x != null) {
          liveGzoneAcc.E.setText(x);
       }
       LiveGzoneAnchorAccompanyFleetStateFragment i = liveGzoneAcc.u.I;
       liveGzoneAcc.v = i;
       int i1 = 8;
       if (i == null) {
          liveGzoneAcc.p.setVisibility(i1);
          return;
       }else if(!j.h(i.mBackground)){
          liveGzoneAcc.P.U(liveGzoneAcc.v.mBackground);
       }
       x = liveGzoneAcc.v;
       LiveGzoneAccompanyFleetInfo mAccompanySt = x.mAccompanyStatus;
       int i2 = 3;
       boolean b = true;
       if (mAccompanySt == 2 && liveGzoneAcc.L == null) {
          n0.e(liveGzoneAcc.w, liveGzoneAcc.y, x.mGameId, x.mGameName);
          liveGzoneAcc.L = b;
       }else if(mAccompanySt == i2 && liveGzoneAcc.M == null){
          n0.h(liveGzoneAcc.y);
          liveGzoneAcc.M = b;
       }else if(mAccompanySt == 4 && liveGzoneAcc.N == null){
          n0.g(liveGzoneAcc.y);
          liveGzoneAcc.N = b;
       }else if(mAccompanySt == 5 && liveGzoneAcc.O == null){
          n0.f(liveGzoneAcc.y);
          liveGzoneAcc.O = b;
       }
       if (liveGzoneAcc.v.mAccompanyStatus == 4) {
          liveGzoneAcc.M = false;
          liveGzoneAcc.O = false;
       }
       liveGzoneAcc.p.setVisibility(false);
       this.Y8();
       if (!PatchProxy.applyVoid(objArray, liveGzoneAcc, uob0, "9")) {
          b9.a(liveGzoneAcc.s);
          if (liveGzoneAcc.v.mAccompanyStatus != 4) {
             liveGzoneAcc.q.setVisibility(i1);
             liveGzoneAcc.r.setVisibility(i1);
          }else {
             liveGzoneAcc.q.setVisibility(false);
             liveGzoneAcc.r.setVisibility(false);
             liveGzoneAcc.s = t.intervalRange(0, (liveGzoneAcc.v.mAnchorCancelFrozenTime + 2), 0, 1, TimeUnit.SECONDS).observeOn(d.a).subscribe(new d0(liveGzoneAcc));
          }
       }
       liveGzoneAcc.H = a.a.getBoolean("live_gzone_anchor_accompany_auto_next_round", false);
       RecyclerView recyclerView = liveGzoneAcc.u.h0();
       LiveGzoneAccompanyFleetInfo mAccompanySt1 = liveGzoneAcc.v.mAccompanyStatus;
       if (mAccompanySt1 == 5 || mAccompanySt1 == b) {
          recyclerView.setVisibility(i1);
          if (liveGzoneAcc.B.getVisibility() == i1) {
             liveGzoneAcc.C.setChecked(liveGzoneAcc.H);
             liveGzoneAcc.F.setSelected(liveGzoneAcc.H);
             if (liveGzoneAcc.H != null) {
                if (liveGzoneAcc.I <= null) {
                   liveGzoneAcc.I = i2;
                }
                liveGzoneAcc.D.setText(liveGzoneAcc.R8(a1.r(liveGzoneAcc.S8(b), String.valueOf(liveGzoneAcc.I))));
                if (!PatchProxy.applyVoid(objArray, liveGzoneAcc, uob0, "6")) {
                   b9.a(liveGzoneAcc.t);
                   liveGzoneAcc.t = t.intervalRange(1, (long)liveGzoneAcc.I, 1, 1, TimeUnit.SECONDS).observeOn(a.c()).subscribe(new c0(liveGzoneAcc));
                }
             }else {
                liveGzoneAcc.D.setText(liveGzoneAcc.S8(false));
             }
             if (!PatchProxy.applyVoid(objArray, liveGzoneAcc, uob0, "4")) {
                if (liveGzoneAcc.v.mRoundStatus == 11) {
                   liveGzoneAcc.G.L(c.a().h(CdnHostGroupType.GAME.getTypeName(), "udata/pkg/kwai-client-image/gzone/accompany/live_gzone_anchor_accompany_cancel.webp", Collections.emptyMap()));
                }else {
                   liveGzoneAcc.G.L(c.a().h(CdnHostGroupType.GAME.getTypeName(), "udata/pkg/kwai-client-image/gzone/accompany/live_gzone_anchor_accompany_finish.webp", Collections.emptyMap()));
                }
             }
          }
          liveGzoneAcc.B.setVisibility(false);
          liveGzoneAcc.C.setOnCheckedChangeListener(new b0$c(liveGzoneAcc));
          liveGzoneAcc.F.setOnClickListener(new b0$d(liveGzoneAcc));
       }else if(recyclerView.getVisibility() == i1 && !liveGzoneAcc.B.getVisibility()){
          LiveGzoneAccompanyFleetInfo mOnBoardMemb = liveGzoneAcc.v.mOnBoardMembers;
          int i3 = (mOnBoardMemb == null)? 0: mOnBoardMemb.size();
          if (i3 > 0) {
             i.d(R.style.arg_RES_7f11066a, a1.r(R.string.arg_RES_7f10234f, String.valueOf(i3)));
          }
       }
    label_0129 :
       recyclerView.setVisibility(false);
       liveGzoneAcc.B.setVisibility(i1);
       liveGzoneAcc.p.setOnClickListener(new b0$e(liveGzoneAcc));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "7")) {
          return;
       }
       b0 tz = this.z;
       if (tz != null) {
          tz.o();
          this.z = null;
       }
       tz = this.A;
       if (tz != null) {
          tz.o();
          this.A = null;
       }
       b9.a(this.s);
       b9.a(this.t);
       return;
    }
    public boolean P8(){
       Object obj = PatchProxy.apply(null, this, b0.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b0 tv = this.v;
       if (((System.currentTimeMillis() - tv.mLocalTimeDiff) - tv.mRoundStartTimestamp) - (tv.mAnchorCancelFrozenTime * 1000) < 0) {
          return false;
       }
       return true;
    }
    public SpannableStringBuilder R8(String p0){
       SpannableStringBuilder obj = PatchProxy.applyOneRefs(p0, this, b0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SpannableStringBuilder(p0);
       int i = a1.d(R.dimen.arg_RES_7f070f74);
       int i1 = p0.indexOf(String.valueOf(this.I));
       if (i1 >= 0) {
          i = i1 + 1;
          obj.setSpan(new AbsoluteSizeSpan(i, false), i1, i, 33);
          obj.setSpan(new ForegroundColorSpan(a1.a(R.color.arg_RES_7f0613fc)), i1, i, 33);
       }
       return obj;
    }
    public int S8(boolean p0){
       if (p0) {
          if (this.v.mRoundStatus == 11) {
             return 0x7f1023c5;
          }
          return 0x7f1013bc;
       }else if(this.v.mRoundStatus == 11){
          return 0x7f102388;
       }else {
          return 0x7f102389;
       }
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "16")) {
          return;
       }
       b9.a(this.s);
       b0 tw = this.w;
       b0 tv = this.v;
       LiveGzoneAccompanyFleetInfo mRoundId = tv.mRoundId;
       LiveGzoneAccompanyFleetInfo mWaitingMemb = tv.mWaitingMemberCount;
       LiveGzoneAccompanyFleetInfo mOnBoardMemb = tv.mOnBoardMembers;
       int i = (mOnBoardMemb == null)? 0: mOnBoardMemb.size();
       tv = this.v;
       n0.d(tw, mRoundId, mWaitingMemb, i, this.y, tv.mGameId, tv.mGameName);
       a.k(this.C.isChecked());
       ObservableBox.a(a.b().j(this.C.isChecked(), this.w)).compose(this.getActivity().ge()).subscribe(new b0$a(this), new a());
       return;
    }
    public void W8(boolean p0,Activity p1){
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob0, "14")) {
          return;
       }
       ObservableBox.a(a.b().e(this.w, this.v.mRoundId)).compose(p1.ge()).subscribe(new b0$f(this, p0), new a());
       return;
    }
    public final void X8(){
       boolean b;
       b0 uob0 = b0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob0, "17")) {
          return;
       }
       ClientContent$LiveStreamPackage obj = PatchProxy.apply(objArray, this, uob0, "18");
       int i = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          Iterator iterator = this.v.mOnBoardMembers.iterator();
          while (true) {
             if (iterator.hasNext()) {
                if (!TextUtils.n("5", iterator.next().mConfirmStatus)) {
                   b = false;
                }
             }else {
                b = true;
             }
          }
          ObservableBox.a(a.b().r(this.w, this.v.mRoundId)).compose(this.getActivity().ge()).subscribe(new b0$b(this), new a());
          return;
       }
       if (!b) {
          i.a(R.style.arg_RES_7f11066a, 0x7f102384);
          return;
       }else {
          uob0 = this.w;
          b0 tv = this.v;
          LiveGzoneAccompanyFleetInfo mRoundId = tv.mRoundId;
          LiveGzoneAccompanyFleetInfo mWaitingMemb = tv.mWaitingMemberCount;
          LiveGzoneAccompanyFleetInfo mOnBoardMemb = tv.mOnBoardMembers;
          int i1 = (mOnBoardMemb == null)? 0: mOnBoardMemb.size();
          b0 ty = this.y;
          b0 tv1 = this.v;
          LiveGzoneAccompanyFleetInfo mGameId = tv1.mGameId;
          LiveGzoneAccompanyFleetInfo mGameName = tv1.mGameName;
          n0 on0 = n0.class;
          if (PatchProxy.isSupport(on0)) {
             Object[] objArray1 = new Object[]{uob0,mRoundId,Integer.valueOf(mWaitingMemb),Integer.valueOf(i1),ty,mGameId,mGameName};
             if (PatchProxy.applyVoid(objArray1, objArray, on0, "20")) {
                goto label_00d9 ;
             }
          }
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CONFIRM_DEPART_BUTTON";
          i3 oi3 = i3.f();
          oi3.c("fleet_audience_num", Integer.valueOf(i1));
          oi3.c("queue_audience_num", Integer.valueOf(mWaitingMemb));
          oi3.d("accompany_id", uob0);
          oi3.d("round_id", mRoundId);
          uElementPack.params = oi3.e();
          obj = new ClientContent$LiveStreamPackage();
          obj.liveStreamId = ty;
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = obj;
          obj.gameId = mGameId;
          obj.gameName = mGameName;
          u1.u(1, uElementPack, uContentPack);
          goto label_00d9 ;
       }
    }
    public void Y8(){
       LiveGzoneAccompanyFleetInfo obj;
       b0 uob0 = b0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob0, "10")) {
          return;
       }
       b0 tv = this.v;
       LiveGzoneAccompanyFleetInfo mAccompanySt = tv.mAccompanyStatus;
       boolean b = false;
       if (mAccompanySt != 2) {
          if (mAccompanySt != 3) {
             if (mAccompanySt != 4) {
                if (mAccompanySt == 5) {
                   this.p.setText(R.string.arg_RES_7f1023c4);
                   this.p.setSelected(true);
                }
             }else {
                this.p.setSelected(this.P8());
                this.p.setText(R.string.arg_RES_7f102395);
             }
          }else {
             this.p.setText(R.string.arg_RES_7f102334);
             tv = this.p;
             obj = PatchProxy.apply(objArray, this, uob0, "11");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                uob0 = this.v;
                if (uob0 != null) {
                   obj = uob0.mOnBoardMembers;
                   if (obj != null) {
                      Iterator iterator = obj.iterator();
                      do {
                         if (iterator.hasNext()) {
                         }else {
                            b = true;
                            break ;
                         }
                      } while (!TextUtils.n(iterator.next().mConfirmStatus, "5"));
                   }
                }
             }
             tv.setSelected(b);
          }
       }else {
          obj = tv.mOnBoardMembers;
          if (obj != null && obj.size() > 0) {
             this.p.setSelected(true);
          }else {
             this.p.setSelected(b);
          }
          this.p.setText(R.string.arg_RES_7f1023a6);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0f0a);
       this.q = m1.f(p0, 0x7f0a0066);
       this.r = m1.f(p0, 0x7f0a0067);
       this.B = m1.f(p0, 0x7f0a0069);
       this.C = m1.f(p0, 0x7f0a0325);
       this.D = m1.f(p0, 0x7f0a2dc5);
       this.E = m1.f(p0, 0x7f0a006c);
       this.F = m1.f(p0, 0x7f0a0327);
       this.G = p0.findViewById(0x7f0a0068);
       this.P = p0.findViewById(0x7f0a1ddf);
       this.J = p0.findViewById(0x7f0a1dea);
       b0 tr = this.r;
       f0.i(tr, tr.getContext());
       tr = this.D;
       f0.i(tr, tr.getContext());
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "1")) {
          return;
       }
       this.u = this.s8(LiveGzoneAnchorAccompanyFleetStateFragment.class);
       this.w = this.t8("LIVE_GZONE_ANCHOR_ACCOMPANY_ID");
       this.x = this.t8("LIVE_GZONE_ANCHOR_ACCOMPANY_FLEET_TITLE");
       this.y = this.t8("LIVE_GZONE_ANCHOR_ACCOMPANY_LIVE_STREAM_ID");
       return;
    }
}
