package com.kwai.live.gzone.accompanyplay.anchor.e0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kwai.live.gzone.accompanyplay.anchor.LiveGzoneAnchorAccompanyFleetStateFragment;
import brd.t;
import com.kwai.live.gzone.accompanyplay.anchor.m$a;
import com.kwai.live.gzone.accompanyplay.anchor.e0$a;
import erd.g;
import crd.b;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetInfo;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanySdkPlatformConfig;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import h37.n0;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import k37.p1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.util.Collection;
import ekd.q;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewGroup;
import java.util.List;
import lnc.a1;
import e17.i;
import bjd.d;
import bb6.c;
import com.kwai.framework.network.cdn.CdnHostGroupType;
import java.util.Map;
import java.util.Collections;
import com.kwai.live.gzone.accompanyplay.anchor.e0$b;
import android.view.View$OnClickListener;
import com.kwai.library.widget.popup.common.c;
import lnc.b9;
import j37.b;
import j37.a;
import cjd.e;
import erd.o;
import com.kwai.live.gzone.accompanyplay.anchor.e0$c;
import android.app.Activity;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import gr8.b;
import brd.x;
import h37.k0;
import sfc.a;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import d61.f0;
import g37.d;

public class e0 extends PresenterV2	// class@000b08
{
    public c A;
    public ViewGroup B;
    public TextView C;
    public TextView D;
    public KwaiImageView E;
    public b F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public KwaiImageView L;
    public TextView p;
    public TextView q;
    public LiveGzoneAnchorAccompanyFleetStateFragment r;
    public d s;
    public m$a t;
    public LiveGzoneAccompanyFleetInfo u;
    public p1 v;
    public String w;
    public String x;
    public String y;
    public c z;

    public void e0(){
       super();
       this.G = false;
       this.H = false;
       this.I = false;
       this.J = false;
       this.K = false;
    }
    public void E8(){
       e0 uoe0 = e0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe0, "3")) {
          return;
       }
       if (this.r == null) {
          return;
       }
       e0 tx = this.x;
       if (tx != null) {
          this.D.setText(tx);
       }
       LiveGzoneAnchorAccompanyFleetStateFragment i = this.r.I;
       this.u = i;
       int i1 = 8;
       if (i == null) {
          this.p.setVisibility(i1);
          return;
       }else {
          this.X7(this.t.a().subscribe(new e0$a(this)));
          this.t.b(this.u.mAccompanySdkPlatformConfig);
          if (!j.h(this.u.mBackground)) {
             this.L.U(this.u.mBackground);
          }
          tx = this.u;
          LiveGzoneAccompanyFleetInfo mAccompanySt = tx.mAccompanyStatus;
          String str = 11;
          if (mAccompanySt == 2 && this.G == null) {
             n0.e(this.w, this.y, tx.mGameId, tx.mGameName);
             this.G = true;
          }else if(mAccompanySt == 3 && this.H == null){
             n0.h(this.y);
             this.H = true;
          }else if(mAccompanySt == 4 && this.I == null){
             n0.g(this.y);
             this.I = true;
          }else if(mAccompanySt == 5 || (mAccompanySt == true && tx.mRoundStatus == str)){
             if (this.K == null) {
                LiveGzoneAccompanyGameInfo liveGzoneAcc = new LiveGzoneAccompanyGameInfo();
                e0 tu = this.u;
                liveGzoneAcc.mGameId = tu.mGameId;
                liveGzoneAcc.mGameName = tu.mGameName;
                liveGzoneAcc.mEnableOneClick = tu.mEnableOneClick;
                ClientContent$LiveStreamPackage liveStreamPa = this.v.a.a();
                if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, liveGzoneAcc, objArray, n0.class, "9")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "CANCEL_ORDER_PANEL";
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   liveStreamPa.gameName = liveGzoneAcc.mGameName;
                   liveStreamPa.gameId = liveGzoneAcc.mGameId;
                   uContentPack.liveStreamPackage = liveStreamPa;
                   u1.u0(10, uElementPack, uContentPack);
                }
                this.K = true;
             }else if(this.J == null){
                n0.f(this.y);
                this.J = true;
             }
          }
          if (this.u.mAccompanyStatus == 4) {
             this.H = false;
             this.J = false;
             this.K = false;
          }
          this.p.setVisibility(false);
          if (!PatchProxy.applyVoid(objArray, this, uoe0, "6")) {
             LiveGzoneAccompanyFleetInfo mAccompanySt2 = this.u.mAccompanyStatus;
             if (mAccompanySt2 != true) {
                if (mAccompanySt2 != 2 && mAccompanySt2 != 3) {
                   if (mAccompanySt2 != 4) {
                      if (mAccompanySt2 == 5) {
                      }
                   }else {
                      this.p.setVisibility(i1);
                      this.q.setVisibility(false);
                      this.q.setText(R.string.arg_RES_7f102398);
                   }
                }else {
                   this.p.setVisibility(i1);
                   this.q.setVisibility(false);
                   if (q.f(this.u.mOnBoardMembers)) {
                      this.q.setText(R.string.arg_RES_7f10231c);
                   }else {
                      this.q.setText(R.string.arg_RES_7f102348);
                   }
                }
             }else {
             }
          }
       label_016b :
          RecyclerView recyclerView = this.r.h0();
          LiveGzoneAccompanyFleetInfo mAccompanySt1 = this.u.mAccompanyStatus;
          if (mAccompanySt1 == 5 || mAccompanySt1 == true) {
             recyclerView.setVisibility(i1);
             this.G = false;
             this.I = false;
             if (this.u.mRoundStatus == str) {
                this.C.setText(R.string.arg_RES_7f102388);
                this.E.L(c.a().h(CdnHostGroupType.GAME.getTypeName(), "udata/pkg/kwai-client-image/gzone/accompany/live_gzone_anchor_accompany_cancel.webp", Collections.emptyMap()));
             }else {
                this.C.setText(R.string.arg_RES_7f102389);
                this.E.L(c.a().h(CdnHostGroupType.GAME.getTypeName(), "udata/pkg/kwai-client-image/gzone/accompany/live_gzone_anchor_accompany_finish.webp", Collections.emptyMap()));
             }
             this.B.setVisibility(false);
          }else if(recyclerView.getVisibility() == i1){
             mAccompanySt1 = this.u.mOnBoardMembers;
             int i2 = (mAccompanySt1 == null)? 0: mAccompanySt1.size();
             if (i2 > 0) {
                i.d(R.style.arg_RES_7f11066a, a1.r(R.string.arg_RES_7f10234f, String.valueOf(i2)));
             }
          }
          recyclerView.setVisibility(false);
          this.B.setVisibility(i1);
          this.p.setOnClickListener(new e0$b(this));
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "4")) {
          return;
       }
       e0 tz = this.z;
       if (tz != null) {
          tz.o();
          this.z = null;
       }
       tz = this.A;
       if (tz != null) {
          tz.o();
          this.A = null;
       }
       this.G = false;
       this.H = false;
       this.I = false;
       this.J = false;
       this.K = false;
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "7")) {
          return;
       }
       b9.a(this.F);
       e0 tw = this.w;
       e0 tu = this.u;
       LiveGzoneAccompanyFleetInfo mRoundId = tu.mRoundId;
       LiveGzoneAccompanyFleetInfo mWaitingMemb = tu.mWaitingMemberCount;
       LiveGzoneAccompanyFleetInfo mOnBoardMemb = tu.mOnBoardMembers;
       int i = (mOnBoardMemb == null)? 0: mOnBoardMemb.size();
       tu = this.u;
       n0.d(tw, mRoundId, mWaitingMemb, i, this.y, tu.mGameId, tu.mGameName);
       this.F = a.b().l("0", this.y).map(new e()).flatMap(new e0$c(this)).compose(this.getActivity().ge()).subscribe(new k0(this), new a());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "2")) {
          return;
       }
       this.p = p0.findViewById(0x7f0a0f0a);
       this.q = p0.findViewById(0x7f0a0f04);
       this.B = p0.findViewById(0x7f0a0069);
       this.E = p0.findViewById(0x7f0a0068);
       this.C = p0.findViewById(0x7f0a2dc5);
       this.D = p0.findViewById(0x7f0a006c);
       this.L = p0.findViewById(0x7f0a1ddf);
       e0 tC = this.C;
       f0.i(tC, tC.getContext());
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "1")) {
          return;
       }
       this.r = this.s8(LiveGzoneAnchorAccompanyFleetStateFragment.class);
       this.w = this.t8("LIVE_GZONE_ANCHOR_ACCOMPANY_ID");
       this.x = this.t8("LIVE_GZONE_ANCHOR_ACCOMPANY_FLEET_TITLE");
       this.y = this.t8("LIVE_GZONE_ANCHOR_ACCOMPANY_LIVE_STREAM_ID");
       this.s = this.r8("LIVE_GZONE_ANCHOR_ACCOMPANY_SDK_SERVICE");
       this.t = this.q8(m$a.class);
       this.v = this.q8(p1.class);
       return;
    }
}
