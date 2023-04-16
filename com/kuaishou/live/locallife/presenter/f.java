package com.kuaishou.live.locallife.presenter.f;
import im8.g;
import c12.f;
import com.kuaishou.live.locallife.presenter.f$b;
import com.kuaishou.live.locallife.stat.LocalLifeStatLogger;
import com.kuaishou.live.locallife.presenter.d;
import java.util.concurrent.ConcurrentLinkedQueue;
import ff3.m;
import com.kuaishou.live.locallife.presenter.f$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import crd.b;
import lnc.b9;
import ye3.h;
import java.util.Objects;
import x61.c;
import lp3.c;
import lp3.e;
import t02.a0;
import mq5.h;
import mq5.b;
import hf3.a;
import p91.m;
import lf3.g;
import java.lang.Integer;
import java.util.Queue;
import com.kuaishou.live.locallife.model.LocalLifeLiveIconMessage;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.locallife.presenter.b;
import ff3.l;
import android.view.View$OnClickListener;
import a71.c;
import gf3.b;
import java.util.Map;
import com.kuaishou.locallife.log.biz.LocalLifeLiveLogBiz;
import mr3.b;
import java.lang.Throwable;
import lr3.d;
import ff3.r;
import java.util.HashMap;
import lr3.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import z12.x;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import xe3.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.live.locallife.model.MessageButton;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.model.CDNUrl;
import tkd.b;
import tkd.d;
import nl9.r;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.tuna.button.TunaButtonModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ju5.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import tj3.e;
import vq5.d;
import z77.c;
import nl8.m;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import a87.c;
import mrd.a;
import com.kuaishou.live.locallife.presenter.e;
import brd.w;
import erd.c;
import brd.t;
import t45.d;
import brd.z;
import ff3.o;
import erd.g;
import io.reactivex.internal.functions.Functions;
import tj3.k;
import java.lang.System;
import com.kuaishou.livestream.message.nano.LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;

public class f extends f implements g	// class@000c50
{
    public m K;
    public a0 L;
    public d M;
    public c N;
    public e O;
    public BaseFeed P;
    public GifshowActivity Q;
    public LocalLifeLiveIconMessage R;
    public LocalLifeLiveIconMessage S;
    public int T;
    public TunaButtonModel U;
    public b U0;
    public h V;
    public final f$b V0;
    public boolean W;
    public LocalLifeStatLogger W0;
    public boolean X;
    public final g X0;
    public boolean Y;
    public final Queue Y0;
    public int Z;
    public final h Z0;
    public a a1;
    public static boolean b1 = false;
    public static String sLivePresenterClassName;

    public void f(){
       super();
       this.T = 0;
       this.W = false;
       this.X = false;
       this.Y = false;
       this.Z = 0;
       this.V0 = new f$b(this);
       this.W0 = new LocalLifeStatLogger();
       this.X0 = new d(this);
       this.Y0 = new ConcurrentLinkedQueue();
       this.Z0 = new m(this);
       this.a1 = new f$a(this);
    }
    public void Q(boolean p0){
       f uof = f.class;
       String str = "3";
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, str)) {
          return;
       }
       b9.a(this.U0);
       boolean b = false;
       this.c9().setVisible(b);
       h oh = this.c9();
       Objects.requireNonNull(oh);
       if (!PatchProxy.applyVoid(null, oh, h.class, str)) {
          oh.d = b;
          oh.a.a(c.class).O0(1043);
       }
       f tL = this.L;
       if (tL != null && tL.D2 != null) {
          b = true;
       }
       if (b) {
          tL.D2.le(this.Z0);
       }
       if (!PatchProxy.applyVoid(null, this, uof, "7")) {
          this.K.u().o(1006, this.X0);
       }
       tL = this.W0;
       tL.leaveLiveTimePeriod = tL.calculatePeriodTime();
       this.W0.reportCustomLog();
       return;
    }
    public final void a9(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "11")) {
          return;
       }
       if (p0 && !this.Y0.contains(Integer.valueOf(p0))) {
          this.Y0.offer(Integer.valueOf(p0));
       }
       return;
    }
    public final LocalLifeLiveIconMessage b9(){
       if (this.T == 1) {
          return this.S;
       }
       return this.R;
    }
    public h c9(){
       Object obj = PatchProxy.apply(null, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.V == null) {
          this.V = new h(new b(this), new l(this));
       }
       return this.V;
    }
    public final void d9(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "23")) {
          return;
       }
       uof = this.V0;
       if (uof.b == null) {
          uof.b = true;
          if (p0 == 1) {
             b.b("local_life_c_live_data_source", "1");
          }else {
             b.b("local_life_c_live_data_source", "0");
          }
          b.a("local_life_c_live_buy_icon_data_finish");
       }
       return;
    }
    public final void e9(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "25")) {
          return;
       }
       if (f.b1) {
          d.a("LOCAL_LIFE_LOG_STAT_EVENT", LocalLifeLiveLogBiz.LIVE_ROOM, "LiveAudienceLocalLifeBottomBarPresenter", p0, p1, null, false, 2);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new r();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f.class, new r());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
    public final void h9(LocalLifeLiveIconMessage p0){
       boolean b2;
       boolean b = this;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, b, f.class, "8")) {
          return;
       }
       h oh = this.c9();
       f obj1 = PatchProxy.applyOneRefs(obj, b, f.class, "14");
       boolean b1 = false;
       if (obj1 != PatchProxyResult.class) {
          b2 = obj1.booleanValue();
       }else if(obj == null || (p0.getSignalType() != 1 && (!p0.getSupportType() || p0.getSupportType() == 2))){
          b2 = true;
       }else {
          b2 = false;
       }
       if (!b2) {
          oh.setVisible(b1);
          b.c(LocalLifeLiveLogBiz.LIVE_ROOM, "LiveAudienceLocalLifeBottomBarPresenter", "hide icon");
          return;
       }else if(!oh.isVisible()){
          oh.setVisible(true);
          ClientContent$LiveStreamPackage liveStreamPa = b.K.a();
          e0 uoe0 = x.l(b.L);
          FeedLogCtx uFeedLogCtx = b.L.c0();
          if (!PatchProxy.applyVoidFourRefs(liveStreamPa, p0, uoe0, uFeedLogCtx, null, d.class, "5")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LOCALLIFE_LIVE_USER_GOODS_ENTRANCE_BUTTON";
             HashMap hashMap = new HashMap();
             if (p0.getActiveButton() != null) {
                hashMap.put("button_type", String.valueOf(p0.getActiveButton().getButtonType()));
             }
             hashMap.put("statistics_info", p0.getStatisticsInfo());
             uElementPack.params = a.a.q(hashMap);
             ClientContent$KsOrderInfoPackage ksOrderInfoP = new ClientContent$KsOrderInfoPackage();
             ksOrderInfoP.ksOrderId = p0.getKsOrderId();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             uContentPack.ksOrderInfoPackage = ksOrderInfoP;
             u1.B0(new ShowMetaData().setLogPage(uoe0).setType(6).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(uFeedLogCtx));
          }
          d.a("LOCAL_LIFE_LOG_STAT_EVENT", LocalLifeLiveLogBiz.LIVE_ROOM, "LiveAudienceLocalLifeBottomBarPresenter", "AudienceTuanBottomBarBtnShow", null, null, false, 2);
          obj1 = b.W0;
          obj1.bottomIconShowTimePeriod = obj1.calculatePeriodTime();
       }
       MessageButton activeButton = p0.getActiveButton();
       int buttonType = (activeButton != null)? activeButton.getButtonType(): 1;
       buttonType = (buttonType == 2)? 0x7f0815d2: 0x7f0815d5;
       h oh1 = h.class;
       if (!PatchProxy.isSupport(oh1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(buttonType), oh, oh1, "5")) {
          oh1 = oh.b;
          oh1.mIconRes = buttonType;
          oh.c.setValue(oh1);
       }
       CDNUrl[] uCDNUrlArray = null;
       CDNUrl[] iconV2 = (activeButton != null)? activeButton.getIconV2(): uCDNUrlArray;
       if (iconV2 == null || !iconV2.length) {
          oh.l(uCDNUrlArray, p0.getLottieUrl(), p0.isDynamicIcon(), p0.getLoopCount());
       }else {
          oh.l(iconV2, p0.getLottieUrl(), p0.isDynamicIcon(), p0.getLoopCount());
       }
       try{
          d.a(0x691527a8).dT(b.P, 1, 0, 2, 0);
          if (!PatchProxy.applyVoid(uCDNUrlArray, b, f.class, "15") && b.Y == null) {
             obj1 = b.U;
             String str = (obj1 == null)? "": obj1.getJumpUrl();
             if (!TextUtils.x(str)) {
                g og = d.a(0x6ea0c3d0);
                if (og.Qt(str) || og.rM(str)) {
                   og.t9(str, "LiveAudienceTunaBizBottomBarPresenter");
                   b.Y = true;
                }
             }
          }
       label_01ac :
          if (!PatchProxy.applyVoid(uCDNUrlArray, b, f.class, "24")) {
             obj1 = b.V0;
             if (obj1.c == null) {
                obj1.c = true;
                b.a("local_life_c_live_buy_icon_show_finish");
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.r8("LIVE_BASIC_CONTEXT");
       this.L = this.q8(a0.class);
       this.O = this.r8("LIVE_LOG_REPORTER");
       this.P = this.r8("feed");
       this.M = this.t8("LIVE_ROUTER_SERVICE");
       this.N = this.s8(c.class);
       this.c9().e(this);
       return;
    }
    public void x(boolean p0){
       LiveStreamFeedWrapper mEntity;
       f uof = f.class;
       String str = "2";
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, str)) {
          return;
       }
       this.Q = this.getActivity();
       f tL = this.L;
       Map map = null;
       if (tL != null) {
          a0 c = tL.c;
          if (c != null) {
             mEntity = c.mEntity;
          label_002a :
             f.b1 = c.b(mEntity);
             this.e9("AudienceLoadPushBottomBar", map);
             if (!PatchProxy.applyVoid(map, this, uof, "18")) {
                tL = this.N;
                if (tL != null) {
                   this.U0 = t.zip(tL.a(), this.N.b(), e.a).observeOn(d.a).subscribe(new o(this), Functions.d());
                }
             }
             if (!PatchProxy.applyVoid(map, this, uof, "16")) {
                tL = this.W0;
                tL.role = "audience";
                tL.liveStreamId = this.K.getLiveStreamId();
                tL = this.W0;
                tL.messageType = "bottomIcon";
                tL.enterLiveTime = this.O.x().M();
                tL = this.W0;
                if (!tL.enterLiveTime) {
                   tL.enterLiveTime = System.currentTimeMillis();
                }
             }
             h oh = this.c9();
             Objects.requireNonNull(oh);
             if (!PatchProxy.applyVoid(map, oh, h.class, str)) {
                oh.c.setValue(oh.b);
                oh.a.a(c.class).v1(oh.c);
             }
             if (!PatchProxy.applyVoid(map, this, uof, "6")) {
                this.K.u().u0(1006, LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState.class, this.X0);
                tL = this.W0;
                tL.registerSignalTimePeriod = tL.calculatePeriodTime();
             }
             tL = this.L;
             f uof1 = (tL != null && tL.D2 != null)? 1: null;
             if (uof1) {
                tL.D2.Km(this.Z0);
             }
             if (!PatchProxy.applyVoid(map, this, uof, "22")) {
                String str1 = "1";
                String str2 = (b.a(-404437045).g())? str1: "0";
                b.b("local_life_d_is_low_phone", str2);
                b.b("local_life_jump_source", "groupBuyEntrance");
                b.b("local_life_is_first_enter", str1);
                b.b("local_life_jump_channel", "LOCALLIFE_LIVE_USER_GOODS_LIST");
                tL = this.V0;
                if (tL.a == null && f.b1) {
                   tL.a = true;
                   b.a("local_life_c_live_room_load");
                }
             }
          label_0142 :
             return;
          }
       }
       mEntity = map;
       goto label_002a ;
    }
}
