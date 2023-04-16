package com.kwai.live.gzone.accompanyplay.anchor.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.anchor.LiveGzoneAnchorAccompanyFleetStateFragment;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetInfo;
import android.widget.TextView;
import com.kwai.live.gzone.accompanyplay.anchor.s$a;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.anchor.s$b;
import com.kwai.library.widget.popup.common.c;
import android.app.Activity;
import java.lang.Boolean;
import j37.b;
import j37.a;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyMemberInfo;
import brd.t;
import com.yxcorp.gifshow.fragment.ObservableBox;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import gr8.b;
import brd.x;
import com.kwai.live.gzone.accompanyplay.anchor.s$e;
import sfc.a;
import erd.g;
import crd.b;
import h37.n0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveAudiencePacakge;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import lnc.a1;
import u07.t$a;
import u07.f;
import com.kwai.live.gzone.accompanyplay.anchor.s$d;
import u07.u;
import com.kwai.live.gzone.accompanyplay.anchor.s$c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c$b;
import android.view.View;
import ekd.m1;

public class s extends PresenterV2	// class@000b36
{
    public TextView p;
    public TextView q;
    public LiveGzoneAccompanyMemberInfo r;
    public String s;
    public LiveGzoneAnchorAccompanyFleetStateFragment t;
    public String u;
    public c v;

    public void s(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, s.class, "3")) {
          return;
       }
       LiveGzoneAnchorAccompanyFleetStateFragment i = this.t.I;
       if (i == null || i.mAccompanyStatus != 3) {
          this.p.setVisibility(8);
          this.q.setVisibility(8);
          return;
       }else {
          this.p.setVisibility(0);
          this.q.setVisibility(0);
          this.q.setOnClickListener(new s$a(this));
          this.p.setOnClickListener(new s$b(this));
          this.R8();
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, s.class, "4")) {
          return;
       }
       s tv = this.v;
       if (tv != null) {
          tv.o();
          this.v = null;
       }
       return;
    }
    public void P8(Activity p0,boolean p1){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, os, "6")) {
          return;
       }
       ObservableBox.a(a.b().p(this.s, this.t.I.mRoundId, this.r.mUserId, p1)).compose(p0.ge()).subscribe(new s$e(this, p1), new a());
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, s.class, "7")) {
          return;
       }
       if (("5").equals(this.r.mConfirmStatus)) {
          if (this.r.mHasEnterGame != null) {
             this.p.setSelected(true);
             this.q.setSelected(false);
          }else {
             this.p.setSelected(false);
             this.q.setSelected(true);
          }
       }else {
          this.p.setSelected(false);
          this.q.setSelected(false);
       }
       return;
    }
    public void S8(boolean p0){
       s os = s.class;
       String str = "5";
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, os, str)) {
          return;
       }
       LiveGzoneAccompanyFleetInfo mRoundId = this.t.I.mRoundId;
       s ts = this.s;
       String str1 = String.valueOf(this.r.mUserId);
       s tu = this.u;
       s tr = this.r;
       n0 on0 = n0.class;
       if (PatchProxy.isSupport(on0)) {
          Object[] objArray = new Object[]{mRoundId,ts,str1,tu,tr,Boolean.valueOf(p0)};
          if (PatchProxy.applyVoid(objArray, null, on0, "22")) {
          label_00b3 :
             Activity activity = this.getActivity();
             if (a1.i(activity)) {
                if (!p0) {
                   t$a uoa = f.e(new t$a(activity));
                   uoa.W0(R.string.arg_RES_7f102369);
                   uoa.Q0(R.string.cancel);
                   uoa.S0(R.string.arg_RES_7f103a83);
                   uoa.u0(new s$d(this, activity));
                   this.v = uoa.Y(new s$c(this));
                }else {
                   this.P8(activity, 1);
                }
             }
             return;
          }
       }
       String str2 = "2";
       if ((tr.mConfirmStatus).equals(str)) {
          str = (tr.mHasEnterGame != null)? str2: "1";
       }else {
          str = "0";
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "ONBOARD_STATUS_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("audience_status", str);
       if (!p0) {
          str2 = "1";
       }
       oi3.d("onboard_button_option", str2);
       oi3.d("round_id", mRoundId);
       oi3.d("accompany_id", ts);
       uElementPack.params = oi3.e();
       ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
       liveStreamPa.liveStreamId = tu;
       ClientContent$LiveAudiencePacakge liveAudience = new ClientContent$LiveAudiencePacakge();
       liveAudience.identity = TextUtils.k(str1);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       uContentPack.liveAudiencePackage = liveAudience;
       u1.u(1, uElementPack, uContentPack);
       goto label_00b3 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a0f08);
       this.p = m1.f(p0, 0x7f0a0f09);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       this.r = this.q8(LiveGzoneAccompanyMemberInfo.class);
       this.s = this.r8("LIVE_GZONE_ANCHOR_ACCOMPANY_ID");
       this.t = this.q8(LiveGzoneAnchorAccompanyFleetStateFragment.class);
       this.u = this.t8("LIVE_GZONE_ANCHOR_ACCOMPANY_LIVE_STREAM_ID");
       return;
    }
}
