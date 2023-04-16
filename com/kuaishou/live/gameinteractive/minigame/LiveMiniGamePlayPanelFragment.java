package com.kuaishou.live.gameinteractive.minigame.LiveMiniGamePlayPanelFragment;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import k43.l;
import com.kuaishou.live.gameinteractive.minigame.LiveMiniGamePlayPanelFragment$a;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import com.yxcorp.utility.n;
import android.app.Application;
import o56.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import rib.f;
import t02.a0;
import mq5.h;
import mq5.b;
import f43.c;
import com.kuaishou.live.gameinteractive.minigame.data.LiveMiniGameInfo;
import crd.b;
import lnc.b9;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import l43.b;
import android.widget.ImageView;
import android.widget.FrameLayout;
import k43.m;
import android.view.View$OnClickListener;
import tkd.b;
import tkd.d;
import oib.b;
import rib.e;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.feature.api.live.base.model.LivePassThruParamExtraInfo;
import com.kwai.feature.api.live.base.model.LivePassThruParamExtraInfo$LiveGameExtraInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import rib.c;
import l43.h;
import v43.a;
import rib.b;
import l43.w;
import l43.u;
import l43.s;
import l43.n;
import l43.y;
import l43.o;
import l43.m;
import l43.a0;
import l43.j;
import l43.e;
import l43.q;
import android.app.Activity;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import brd.t;

public class LiveMiniGamePlayPanelFragment extends LiveDialogContainerFragment	// class@001bda
{
    public FrameLayout A;
    public ImageView B;
    public b C;
    public a0 D;
    public LiveMiniGameInfo E;
    public b F;
    public final h G;
    public f H;
    public final c I;
    public static final int J;

    public void LiveMiniGamePlayPanelFragment(){
       super();
       this.G = new l(this);
       this.I = new LiveMiniGamePlayPanelFragment$a(this);
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMiniGamePlayPanelFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (this.getActivity() != null) {
          int i = n.z(this.getActivity());
          if (!i) {
             this.Bh(0, n.c(a.b(), 546.00f));
          }else {
             this.Bh(0, (int)((float)i * 0x3f924925));
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveMiniGamePlayPanelFragment.class, "2");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       return a.g(p0, 0x7f0d0ca0, null, false);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveMiniGamePlayPanelFragment.class, "10")) {
          return;
       }
       super.onDestroy();
       LiveMiniGamePlayPanelFragment tC = this.C;
       if (tC != null) {
          tC.destroy();
       }
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMiniGamePlayPanelFragment.class, "9")) {
          return;
       }
       super.onDestroyView();
       LiveMiniGamePlayPanelFragment tC = this.C;
       if (tC != null) {
          tC.unbind();
       }
       tC = this.H;
       if (tC != null) {
          tC.a();
          this.H = objArray;
       }
       this.D.D2.le(this.G);
       c.c().f(this.E.appId);
       b9.a(this.F);
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, LiveMiniGamePlayPanelFragment.class, "5")) {
          return;
       }
       super.onPause();
       LiveMiniGamePlayPanelFragment tH = this.H;
       if (tH != null) {
          tH.onPause();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LiveMiniGamePlayPanelFragment.class, "4")) {
          return;
       }
       super.onResume();
       LiveMiniGamePlayPanelFragment tH = this.H;
       if (tH != null) {
          tH.onResume();
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LiveMiniGamePlayPanelFragment.class, "3")) {
          return;
       }
       super.onStart();
       if (this.getDialog() != null && this.getDialog().getWindow() != null) {
          this.getDialog().getWindow().setWindowAnimations(R.style.arg_RES_7f1101fe);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMiniGamePlayPanelFragment.class, "6")) {
          return;
       }
       super.onViewCreated(p0, p1);
       b uob = new b(this.E.appId);
       this.C = uob;
       uob.f(p0);
       Object[] objArray = new Object[]{this.D};
       this.C.i(objArray);
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveMiniGamePlayPanelFragment.class, "7")) {
          this.B = p0.findViewById(0x7f0a1509);
          this.A = p0.findViewById(0x7f0a094a);
          this.B.setOnClickListener(new m(this));
       }
       if (!PatchProxy.applyVoid(null, this, LiveMiniGamePlayPanelFragment.class, "8")) {
          b uob1 = d.a(0x173837f0);
          e uoe = new e();
          uoe.a = this.E.gameId;
          uoe.b = "live_minigame";
          LiveMiniGamePlayPanelFragment tD = this.D;
          if (tD != null) {
             a0 o = tD.o;
             if (o != null) {
                LiveAudienceParam mPassThruPar = o.mPassThruParamExtraInfo;
                if (mPassThruPar != null) {
                   LivePassThruParamExtraInfo mLiveGameExt = mPassThruPar.mLiveGameExtraInfo;
                   if (mLiveGameExt != null) {
                      LivePassThruParamExtraInfo$LiveGameExtraInfo mEid = mLiveGameExt.mEid;
                      if (!TextUtils.x(mEid)) {
                         uoe.c = mEid;
                      }
                      mEid = this.D.o.mPassThruParamExtraInfo.mLiveGameExtraInfo.mGameId;
                      if (!TextUtils.x(mEid)) {
                         uoe.a = mEid;
                      }
                      mEid = this.D.o.mPassThruParamExtraInfo.mLiveGameExtraInfo.mFrom;
                      if (!TextUtils.x(mEid)) {
                         uoe.b = mEid;
                      }
                   }
                }
             }
          }
          f uof = uob1.Ne(uoe);
          this.H = uof;
          if (uof != null) {
             uof.b(this.I);
             this.H.d(new h(this.C));
             this.H.d(new w(this.C));
             this.H.d(new u(this.C));
             this.H.d(new s(this.C));
             this.H.d(new n(this.C));
             this.H.d(new y(this.C));
             this.H.d(new o(this.C));
             this.H.d(new m(this.C));
             this.H.d(new a0(this.C));
             this.H.d(new j(this.C));
             this.H.d(new e(this.C));
             this.H.d(new q(this.C));
             this.H.c(this.getActivity(), this.A);
          }
       }
       this.F = c.c().g(this.getActivity(), this.E.appId, "miniGame", this.D.Z2.a()).subscribe();
       this.D.D2.Km(this.G);
       return;
    }
}
