package com.kuaishou.live.core.show.profilecard.LiveProfileFragmentV2;
import ne2.b;
import com.kuaishou.live.dialog.base.LiveBottomSheetFragment;
import t02.a0;
import t02.r1;
import wj2.r;
import gy2.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gy2.i;
import java.lang.Number;
import com.kuaishou.live.core.show.profilecard.LiveProfileMode;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import d61.y;
import sf2.o;
import wj2.o0;
import tx1.d;
import wj2.n0;
import bb1.a;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import androidx.fragment.app.DialogFragment;
import com.kuaishou.live.core.show.profilecard.statistics.LiveAnchorStatisticInfo;
import android.os.Bundle;
import android.app.Dialog;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import android.view.Window;
import android.view.View;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import ia2.a;
import android.content.res.Resources;
import cw9.c;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.core.basic.utils.e;
import ne2.n;
import java.lang.Runnable;
import ne2.l;
import android.view.View$OnTouchListener;
import android.content.Context;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import ne2.m;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kwai.framework.model.user.User;
import qa6.b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import android.content.res.Configuration;
import tkd.b;
import tkd.d;
import ym5.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import ag6.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Integer;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import ef2.d;
import com.kuaishou.live.core.show.profilecard.contentarea.a;
import com.kuaishou.live.core.show.profilecard.lefttoparea.LiveProfileLeftTopAreaPresenter;
import df2.m0;
import rf2.h;
import rf2.c;
import pe2.c;
import qe2.u;
import qe2.l;
import ze2.a;
import androidx.lifecycle.LifecycleOwner;
import qf2.b;
import se2.d;
import com.kuaishou.live.core.show.profilecard.photo.j;
import pf2.e;
import qf2.f;
import ye2.e;
import mf2.d;
import tf2.d;
import com.kuaishou.live.core.show.profilecard.statistics.g;
import nf2.c;
import xe2.c;
import of2.b;
import kf2.b;
import fs3.g;
import tg3.c;
import tg3.b;
import com.kuaishou.live.core.show.profilecard.statistics.LiveProfileAnchorViewAudienceInfoPresenter;
import com.kwai.sdk.switchconfig.a;
import we2.a;
import re2.a;
import jf2.a;
import if2.t;
import hf2.l;
import ue2.b;
import wkd.b;
import com.kuaishou.live.common.core.component.authority.c;
import com.kuaishou.live.common.core.component.authority.AnchorInfoAreaConfig;
import qe2.c;
import com.kuaishou.live.core.show.profilecard.statistics.f;
import com.kuaishou.live.core.show.profilecard.statistics.a;
import xe2.b;
import java.util.Objects;
import ne2.k;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;

public class LiveProfileFragmentV2 extends LiveBottomSheetFragment implements b	// class@000db7
{
    public final r B;
    public PresenterV2 C;
    public int D;
    public static final int E;

    public void LiveProfileFragmentV2(a0 p0,r1 p1){
       super();
       r or = new r();
       this.B = or;
       or.w = p0;
       or.x = p1;
       if (p0 != null) {
          or.l = p0.Z2;
       }else if(p1 != null){
          or.l = p1.v;
       }
       return;
    }
    public void B4(boolean p0){
       this.B.v = p0;
    }
    public void E5(boolean p0){
       this.B.t = p0;
    }
    public e Kh(){
       Object obj = PatchProxy.apply(null, this, LiveProfileFragmentV2.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i(1);
    }
    public final int Lh(){
       int i;
       r obj = PatchProxy.apply(null, this, LiveProfileFragmentV2.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.B.m;
       if (obj == LiveProfileMode.SPECIAL_ROLE || obj == LiveProfileMode.LITE_SPECIAL_ROLE) {
          i = (y.d(this.getActivity()))? 0x7f0d0d5e: 0x7f0d0d5f;
          return i;
       }else if(obj == LiveProfileMode.ANCHOR_VIEW_SELF || obj == LiveProfileMode.ESCROW_VIEW_SELF){
          return 0x7f0d0d5c;
       }else if(y.d(this.getActivity())){
          i = 0x7f0d0d5d;
       }else {
          i = 0x7f0d0d60;
       }
       return i;
    }
    public void O4(LiveProfileMode p0){
       this.B.m = p0;
    }
    public void Q7(o p0){
       this.B.k = p0;
    }
    public void R8(o0 p0){
       this.B.h = p0;
    }
    public void U9(d p0){
       this.B.i = p0;
    }
    public void V2(n0 p0){
       this.B.g = p0;
    }
    public void b5(a p0){
       this.B.y = p0;
    }
    public void b9(LiveProfileParams p0){
       this.B.d = p0;
    }
    public int getTheme(){
       Object obj = PatchProxy.apply(null, this, LiveProfileFragmentV2.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.B.m == LiveProfileMode.ANCHOR_VIEW_SELF) {
          return 0x1030011;
       }
       return super.getTheme();
    }
    public void l9(LiveAnchorStatisticInfo p0){
       this.B.r = p0;
    }
    public void of(boolean p0){
       this.B.u = p0;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveProfileFragmentV2.class, "17")) {
          return;
       }
       Dialog dialog = this.getDialog();
       super.onActivityCreated(p0);
       Window window = (dialog == null)? null: dialog.getWindow();
       View view = this.getView();
       if (window != null) {
          if (y.d(this.getActivity())) {
             int i = n.k(this.getActivity());
             int i1 = n.j(this.getActivity());
             ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
             layoutParams.width = (a.c())? i1: c.b(this.getResources(), 0x7f070912);
             layoutParams.height = -1;
             view.setLayoutParams(layoutParams);
             if (e.x(this.B.d.getLiveBizParam())) {
                window.getDecorView().post(new n(view, window, layoutParams));
             }else {
                view.setTranslationX((float)(i - layoutParams.width));
             }
             window.setLayout(-1, i1);
             window.setGravity(53);
             window.setWindowAnimations(R.style.arg_RES_7f1103e0);
          }
          window.setDimAmount(0.20f);
          window.getDecorView().setOnTouchListener(new l(this, view));
       }
       return;
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveProfileFragmentV2.class, "1")) {
          return;
       }
       super.onAttach(p0);
       if (!PatchProxy.applyVoid(null, this, LiveProfileFragmentV2.class, "4")) {
          p0.c = this.getActivity();
          LiveProfileFragmentV2 tB = this.B;
          tB.e = this;
          tB.j = new m(this);
          r d = tB.d;
          UserInfo mId = d.getUserProfile().mProfile.mId;
          this.B.b = (d.getBaseFeed() == null || (!mId.equals(r1.U1(d.getBaseFeed())) && this.B.m != LiveProfileMode.SPECIAL_ROLE))? b.c(d.getUserProfile()): r1.T1(d.getBaseFeed());
       }
    label_006f :
       if (y.d(this.getActivity())) {
          try{
             this.D = this.getActivity().getWindow().getDecorView().getSystemUiVisibility();
          }catch(java.lang.Exception e3){
             b.I(LiveLogTag.LIVE_PROFILE, "LiveProfileFragment onAttach failed", e3);
          }
       }
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveProfileFragmentV2.class, "19")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (d.a(0x4c5dd1b8).f2()) {
          this.dismissAllowingStateLoss();
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveProfileFragmentV2.class, "5");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       boolean b = false;
       try{
          view = a.h(p0, this.Lh(), p1, b, 2);
       }catch(java.lang.Exception e0){
          view = a.c(view, this.Lh(), p1, b);
       }
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveProfileFragmentV2.class, "16")) {
          return;
       }
       super.onDestroyView();
       LiveProfileFragmentV2 tC = this.C;
       if (tC != null) {
          tC.unbind();
          this.C.destroy();
       }
       return;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, LiveProfileFragmentV2.class, "2")) {
          return;
       }
       if (y.d(this.getActivity())) {
          LiveProfileFragmentV2 tD = this.D;
          if (!PatchProxy.isSupport(LiveProfileFragmentV2.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tD), this, LiveProfileFragmentV2.class, "3")) {
             try{
                this.getActivity().getWindow().getDecorView().setSystemUiVisibility(tD);
             }catch(java.lang.Exception e0){
                b.I(LiveLogTag.LIVE_PROFILE, "resetSystemUiVisibility failed", e0);
             }
          }
       }
    }
    public void onViewCreated(View p0,Bundle p1){
       r d;
       String str2;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveProfileFragmentV2.class, "6")) {
          return;
       }
       super.onViewCreated(p0, p1);
       String str = "9";
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(null, this, LiveProfileFragmentV2.class, str);
       int i = 0;
       if (presenterV2 != PatchProxyResult.class) {
       }else {
          presenterV2 = new PresenterV2();
          r m = this.B.m;
          presenterV2.U7(new d());
          presenterV2.U7(new a());
          if (m == LiveProfileMode.ANCHOR_VIEW_SELF || m == LiveProfileMode.ESCROW_VIEW_SELF) {
             str2 = "15";
             if (!PatchProxy.applyVoidOneRefsWithListener(presenterV2, this, LiveProfileFragmentV2.class, str2)) {
                presenterV2.U7(new LiveProfileLeftTopAreaPresenter());
                AnchorInfoAreaConfig uAnchorInfoA = b.a(-416381922).f();
                presenterV2.U7(new u());
                if (uAnchorInfoA != null && uAnchorInfoA.mIsAnchorInfoNewStyle != null) {
                   presenterV2.U7(new c());
                   presenterV2.U7(new f());
                }else {
                   presenterV2.U7(new l());
                   presenterV2.U7(new a());
                }
                presenterV2.U7(new a(this));
                presenterV2.U7(new b());
                presenterV2.U7(new c());
                presenterV2.U7(new c());
                if (!y.d(this.getActivity())) {
                   presenterV2.U7(new e());
                }
                presenterV2.U7(new e());
                presenterV2.U7(new d());
                presenterV2.U7(new d());
                PatchProxy.onMethodExit(LiveProfileFragmentV2.class, str2);
             }
             PatchProxy.onMethodExit(LiveProfileFragmentV2.class, str);
          }else if(m == LiveProfileMode.SPECIAL_ROLE){
             str2 = "13";
             if (!PatchProxy.applyVoidOneRefsWithListener(presenterV2, this, LiveProfileFragmentV2.class, str2)) {
                presenterV2.U7(new LiveProfileLeftTopAreaPresenter());
                presenterV2.U7(new m0());
                presenterV2.U7(new h());
                presenterV2.U7(new c());
                PatchProxy.onMethodExit(LiveProfileFragmentV2.class, str2);
             }
             PatchProxy.onMethodExit(LiveProfileFragmentV2.class, str);
          }else if(m == LiveProfileMode.LITE_SPECIAL_ROLE){
             str2 = "14";
             if (!PatchProxy.applyVoidOneRefsWithListener(presenterV2, this, LiveProfileFragmentV2.class, str2)) {
                presenterV2.U7(new h());
                presenterV2.U7(new c());
                PatchProxy.onMethodExit(LiveProfileFragmentV2.class, str2);
             }
             PatchProxy.onMethodExit(LiveProfileFragmentV2.class, str);
          }else if(m == LiveProfileMode.LITE_AUDIENCE_VIEW_OTHERS){
             str2 = "10";
             if (!PatchProxy.applyVoidOneRefsWithListener(presenterV2, this, LiveProfileFragmentV2.class, str2)) {
                presenterV2.U7(new c());
                presenterV2.U7(new u());
                presenterV2.U7(new l());
                presenterV2.U7(new a(this));
                presenterV2.U7(new b());
                presenterV2.U7(new d());
                presenterV2.U7(new j());
                if (!y.d(this.getActivity())) {
                   presenterV2.U7(new e());
                   presenterV2.U7(new f());
                }
                presenterV2.U7(new e());
                presenterV2.U7(new d());
                presenterV2.U7(new d());
                presenterV2.U7(new g());
                presenterV2.U7(new c());
                presenterV2.U7(new c());
                presenterV2.U7(new b());
                presenterV2.U7(new b());
                PatchProxy.onMethodExit(LiveProfileFragmentV2.class, str2);
             }
             PatchProxy.onMethodExit(LiveProfileFragmentV2.class, str);
          }else {
             String str3 = "12";
             if (!PatchProxy.applyVoidTwoRefsWithListener(presenterV2, m, this, LiveProfileFragmentV2.class, str3)) {
                presenterV2.U7(new LiveProfileLeftTopAreaPresenter());
                presenterV2.U7(new u());
                presenterV2.U7(new l());
                presenterV2.U7(new a(this));
                presenterV2.U7(new b());
                presenterV2.U7(new d());
                if (!this.B.d.isCrossRoomPk() || (!this.B.d.isCrossRoomPkOpponentAnchor() && !this.B.d.isCrossRoomPkOpponentGuest())) {
                   presenterV2.U7(new m0());
                   if (d.a(-1695065466).GQ()) {
                      presenterV2.U7(new c());
                      presenterV2.U7(new b());
                   }
                }
                presenterV2.U7(new j());
                if (!y.d(this.getActivity())) {
                   presenterV2.U7(new e());
                   presenterV2.U7(new f());
                }
                presenterV2.U7(new e());
                presenterV2.U7(new d());
                presenterV2.U7(new d());
                presenterV2.U7(new LiveProfileAnchorViewAudienceInfoPresenter());
                presenterV2.U7(new g());
                presenterV2.U7(new c());
                presenterV2.U7(new c());
                presenterV2.U7(new c());
                if (a.t().d("enableGravityEffectButton", i)) {
                   presenterV2.U7(new a());
                }
                presenterV2.U7(new a());
                if (m == LiveProfileMode.AUDIENCE_VIEW_AUDIENCE || m == LiveProfileMode.AUDIENCE_VIEW_ANCHOR) {
                   presenterV2.U7(new b());
                }
                PatchProxy.onMethodExit(LiveProfileFragmentV2.class, str3);
             }
             if (!PatchProxy.applyVoidTwoRefsWithListener(presenterV2, m, this, LiveProfileFragmentV2.class, "11")) {
                if (m == LiveProfileMode.ANCHOR_VIEW_AUDIENCE || (m == LiveProfileMode.ADMIN_VIEW_AUDIENCE && this.B.d.isInVoiceParty())) {
                   presenterV2.U7(new l());
                }else if(m == LiveProfileMode.AUDIENCE_VIEW_AUDIENCE || m == LiveProfileMode.AUDIENCE_VIEW_ANCHOR){
                   presenterV2.U7(new t());
                }else if(m == LiveProfileMode.ESCROW_VIEW_AUDIENCE){
                   presenterV2.U7(new a());
                }
                if (m == LiveProfileMode.AUDIENCE_VIEW_SELF) {
                   presenterV2.U7(new b());
                }
                PatchProxy.onMethodExit(LiveProfileFragmentV2.class, "11");
             }
             PatchProxy.onMethodExit(LiveProfileFragmentV2.class, str);
          }
       }
       presenterV2.f(p0);
       Object[] objArray = new Object[]{this.B};
       presenterV2.i(objArray);
       this.C = presenterV2;
       LiveProfileFragmentV2 tB = this.B;
       r s = tB.s;
       d = tB.d;
       Objects.requireNonNull(s);
       if (!PatchProxy.applyVoidOneRefs(d, s, k.class, "1")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SHOW_LIVE_PROFILE";
          i3 oi3 = i3.f();
          oi3.c("follow_source", Integer.valueOf(d.getFollowSource()));
          String str1 = (s.d(d))? "TRUE": "FALSE";
          oi3.d("is_anchor", str1);
          uElementPack.params = oi3.e();
          u1.u0(9, uElementPack, s.a());
       }
       return;
    }
    public void pe(k p0){
       this.B.s = p0;
    }
    public void v6(LivePlayLogger p0){
       this.B.f = p0;
    }
}
