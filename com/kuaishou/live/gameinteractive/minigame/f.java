package com.kuaishou.live.gameinteractive.minigame.f;
import k51.c;
import k43.p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gameinteractive.minigame.a;
import com.kuaishou.live.gameinteractive.minigame.f$a;
import vq5.b;
import vq5.d;
import e43.b;
import e43.a;
import brd.t;
import k43.q;
import com.kuaishou.live.gameinteractive.minigame.d;
import erd.g;
import crd.b;
import t02.a0;
import com.kuaishou.protobuf.gamezone.gameinteractive.gameserver.nano.SCGameInteractionKsmgStatus;
import lf3.g;
import hf3.a;
import lnc.b9;
import com.kuaishou.live.gameinteractive.minigame.data.LiveMiniGameInfo;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.feature.api.live.base.model.LivePassThruParamExtraInfo;
import com.kwai.feature.api.live.base.model.LivePassThruParamExtraInfo$LiveGameExtraInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.gameinteractive.minigame.c;
import k43.o;
import com.kuaishou.live.gameinteractive.minigame.a$a;
import android.view.View$OnClickListener;
import a71.c;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Boolean;
import p91.m;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Float;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import j43.a;
import com.kuaishou.live.gameinteractive.minigame.LiveMiniGamePlayPanelFragment;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.basic.activity.x;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import fq5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.gameinteractive.minigame.LiveMiniGameOOMConfig;
import k43.s;
import java.lang.Runtime;
import android.app.Application;
import o56.a;
import e17.i;
import oib.f;
import t45.d;
import brd.z;
import k43.r;
import com.kuaishou.live.gameinteractive.minigame.e;
import jv1.b;
import oq5.b;
import android.view.View;
import nl8.m;

public class f extends c	// class@001bec
{
    public a p;
    public a0 q;
    public b r;
    public d s;
    public b t;
    public b u;
    public LiveMiniGameInfo v;
    public g w;
    public static String sLivePresenterClassName = "LiveMiniGamePresenter";

    public void f(){
       super();
       this.w = new p(this);
    }
    public void E8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "5")) {
          return;
       }
       this.R8().b();
       this.s.t5("gzoneopenminigame", new f$a(this));
       if (this.V8() && !PatchProxy.applyVoid(objArray, this, uof, "8")) {
          this.u = a.a().b().subscribe(new q(this), d.b);
       }
       this.q.C.u0(957, SCGameInteractionKsmgStatus.class, this.w);
       this.P8();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       this.R8().a();
       b9.a(this.t);
       b9.a(this.u);
       this.s.Z4("gzoneopenminigame");
       this.q.C.o(957, this.w);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, f.class, "15")) {
          return;
       }
       LiveMiniGameInfo liveMiniGame = new LiveMiniGameInfo();
       a0 o = this.q.o;
       if (o != null) {
          LiveAudienceParam mPassThruPar = o.mPassThruParamExtraInfo;
          if (mPassThruPar != null) {
             LivePassThruParamExtraInfo mLiveGameExt = mPassThruPar.mLiveGameExtraInfo;
             if (mLiveGameExt != null) {
                LivePassThruParamExtraInfo$LiveGameExtraInfo mGameId = mLiveGameExt.mGameId;
                if (!TextUtils.isEmpty(mGameId)) {
                   this.R8().setVisible(true);
                   liveMiniGame.gameId = mGameId;
                   liveMiniGame.appId = this.q.o.mPassThruParamExtraInfo.mLiveGameExtraInfo.mAppId;
                   this.Y8(liveMiniGame);
                }
             }
          }
       }
       return;
    }
    public a R8(){
       Object obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.p == null) {
          this.p = new a$a(new c(this), new o(this));
       }
       return this.p;
    }
    public final String S8(){
       i3 obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.c("feature_type", Integer.valueOf(4006));
       int i = (this.V8())? 1: 2;
       obj.c("user_type", Integer.valueOf(i));
       return obj.e();
    }
    public final boolean V8(){
       Object obj = PatchProxy.apply(null, this, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.equals(this.q.Z2.d(), QCurrentUser.ME.getId());
    }
    public final void W8(boolean p0,float p1,LiveMiniGameInfo p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Float.valueOf(p1), p2, this, f.class, "12")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.a("block", Boolean.valueOf(p0));
       oi3.c("threshold", Float.valueOf(p1));
       oi3.d("gameId", p2.gameId);
       oi3.d("gameName", p2.gameName);
       oi3.d("appId", p2.appId);
       a.b("LIVE_INTERACTION_GAME_MEMORY_BLOCK", this.q.Z2.a(), oi3.e());
       return;
    }
    public final void X8(LiveMiniGameInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "13")) {
          return;
       }
       if (p0 != null && !TextUtils.isEmpty(p0.gameId)) {
          if (!this.Z8()) {
             return;
          }else {
             f tq = this.q;
             LiveMiniGamePlayPanelFragment liveMiniGame = PatchProxy.applyTwoRefs(tq, p0, null, LiveMiniGamePlayPanelFragment.class, "11");
             if (liveMiniGame != PatchProxyResult.class) {
             }else {
                liveMiniGame = new LiveMiniGamePlayPanelFragment();
                liveMiniGame.D = tq;
                liveMiniGame.E = p0;
                p0.appId = TextUtils.k(p0.appId);
             }
             liveMiniGame.Cb(this.q.R().getChildFragmentManager(), "LiveMiniGamePlayPanelFragment");
             a.b("USER_INTERACTION_GAME_HALF_PAGE", this.q.b().a(), null);
          }
       }
       return;
    }
    public void Y8(LiveMiniGameInfo p0){
       boolean b1;
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "11")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       LiveMiniGameOOMConfig liveMiniGame = LiveMiniGameOOMConfig.get();
       boolean b = false;
       if (liveMiniGame.androidEnabled != null) {
          LiveMiniGameOOMConfig androidMinTh = liveMiniGame.androidMinThreshold;
          s os = s.class;
          if (PatchProxy.isSupport(os)) {
             Runtime obj = PatchProxy.applyOneRefs(Float.valueOf(androidMinTh), null, os, "1");
             if (obj != PatchProxyResult.class) {
                b1 = obj.booleanValue();
             }else {
             label_003c :
                obj = Runtime.getRuntime();
                long l = obj.maxMemory();
                b1 = ((l - (obj.totalMemory() - obj.freeMemory())) - (long)((float)l * androidMinTh) < 0)? true: false;
             }
          }else {
             goto label_003c ;
          }
          if (b1) {
             String str = (TextUtils.isEmpty(liveMiniGame.alert))? a.b().getString(R.string.arg_RES_7f10279e): liveMiniGame.alert;
             i.d(R.style.arg_RES_7f11066a, str);
             this.W8(true, liveMiniGame.androidMinThreshold, p0);
             return;
          }
       }
       this.W8(b, liveMiniGame.androidMinThreshold, p0);
       b9.a(this.t);
       if (f.a()) {
          this.X8(p0);
       }else {
          this.t = f.b(this.getActivity(), true).observeOn(d.a).subscribe(new r(this, p0), e.b);
       }
       return;
    }
    public final boolean Z8(){
       a0 obj = PatchProxy.apply(null, this, f.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.r.H2()) {
          obj = this.q.p1;
          if (obj != null) {
             return obj.d();
          }
       }
       return true;
    }
    public void doBindView(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, f.class, "3");
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       this.q = this.q8(a0.class);
       this.r = this.q8(b.class);
       this.s = this.r8("LIVE_ROUTER_SERVICE");
       this.R8().e(this);
       return;
    }
}
