package com.kuaishou.live.external.p;
import os5.l;
import com.kuaishou.live.external.p$d;
import mf3.b;
import com.kuaishou.live.external.p$e;
import hj3.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.debug.DebugLog$LogInterface;
import com.kwai.video.waynelive.LivePlayerInitModule;
import com.kuaishou.live.external.p$f;
import qp.a;
import pp.e;
import com.kuaishou.live.external.p$g;
import rp.a;
import com.smile.gifshow.annotation.plugin.a;
import com.smile.gifshow.annotation.plugin.Factory;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import com.kuaishou.live.external.p$k;
import qs5.e;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.external.p$a;
import java.lang.Boolean;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import g33.f;
import android.content.Context;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.activity.LiveShellActivity;
import joc.z;
import kp3.e;
import java.lang.Integer;
import dq3.a;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import brd.t;
import o02.j;
import o02.i;
import cjd.e;
import erd.o;
import com.kuaishou.live.external.o;
import t45.d;
import brd.z;
import com.kuaishou.live.common.core.basic.arya.AryaInitializer;
import us5.a;
import wkd.b;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$LayoutConfig;
import z12.w;
import com.yxcorp.gifshow.entity.QPreInfo;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import dq3.b;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import java.lang.System;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.SearchParams;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import ps5.b;
import com.kwai.feature.api.live.plugin.dva.LoadPolicy;
import brd.a0;
import g33.k;
import g33.m;
import erd.g;
import crd.b;
import y3.f;
import g33.d;
import io.reactivex.g;
import io.reactivex.android.schedulers.a;
import g33.i;
import erd.a;
import java.lang.Number;
import tkd.b;
import tkd.d;
import gx5.f;
import com.kuaishou.live.external.t;
import dx5.h;
import g33.j;
import g33.l;
import com.kuaishou.live.common.core.basic.arya.LiveSnowManager;
import com.kuaishou.live.common.core.basic.arya.b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import xf6.l;
import qs5.d;
import com.kuaishou.live.external.n;
import com.kuaishou.live.external.m;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import g33.a;
import com.kuaishou.live.fragment.LivePluginExploreFragment;
import com.kuaishou.live.external.p$j;
import s02.d;
import com.kuaishou.live.core.basic.config.e;
import com.kuaishou.live.core.basic.config.d;
import java.util.Map;
import lg2.m;
import g33.e;
import com.kuaishou.live.external.p$l;
import android.net.Uri;
import lg2.e;
import androidx.fragment.app.Fragment;
import qvb.i;
import de3.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import yp.x;
import k2b.u1;
import com.kwai.feature.api.live.service.basic.model.LiveStreamStatus;
import d61.z;
import bp3.b;
import bp3.a;
import com.yxcorp.gifshow.entity.QPhoto;
import bp3.k;
import com.kwai.sdk.switchconfig.a;
import com.kwai.sdk.switchconfig.ConfigPriority;
import wp5.c;
import java.util.Collection;
import pw6.d;
import com.kuaishou.live.fragment.LivePluginGrootPlayFragment;
import com.kuaishou.live.external.p$c;
import lnc.i3;
import g33.n;
import com.yxcorp.gifshow.log.c0;
import com.yxcorp.gifshow.log.d0;
import com.kuaishou.live.external.p$b;
import com.kuaishou.live.external.p$h;
import java.lang.Enum;
import oe6.e;
import com.kuaishou.live.external.p$i;
import com.kuaishou.live.rerank.f;
import g33.h;
import java.util.Objects;
import we3.h;
import d61.c0;
import o56.a;
import com.kuaishou.live.fragment.LivePluginLoadingFragment;
import java.lang.RuntimeException;
import g33.g;

public class p implements l	// class@001bb8
{
    public final l b;
    public static final int c;

    static {
       b.a = new p$d();
       p$e uoe = new p$e();
       if (PatchProxy.applyVoidOneRefs(uoe, null, e.class, "2")) {
       }else {
          LivePlayerInitModule.setWayneLogImpl(uoe);
       }
       e.a(new p$f());
       e.b(new p$g());
    }
    public void p(){
       super();
       this.b = new a(l.class).getInstance();
    }
    public static FeedLogCtx F(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return null;
       }
       try{
          return a.a.h(p0, FeedLogCtx.class);
       }catch(java.lang.Exception e0){
          return v1;
       }
    }
    public void A9(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "31")) {
          return;
       }
       LivePluginManager.h(true, new p$k(this, "fetchLastAuditedCover", p0));
       return;
    }
    public void AE(){
       if (PatchProxy.applyVoid(null, this, p.class, "42")) {
          return;
       }
       this.n().AE();
       return;
    }
    public void BC(){
       if (PatchProxy.applyVoid(null, this, p.class, "7")) {
          return;
       }
       this.n().BC();
       return;
    }
    public PresenterV2 BU(){
       Object obj = PatchProxy.applyWithListener(null, this, p.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(p.class, "34");
       return this.n().BU();
    }
    public void Ds(boolean p0,boolean p1,RequestTiming p2,boolean p3){
       p$a uoa = new p$a(this, "asyncDownloadMagicGift", p0, p1, p2, p3);
       LivePluginManager.h(true, v7);
    }
    public boolean Du(){
       Object obj = PatchProxy.apply(null, this, p.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.n().Du();
    }
    public boolean E(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.n().E(p0);
    }
    public void EQ(GifshowActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "21")) {
          return;
       }
       LiveShellActivity.u3(p0, new f(this, p0), "startLiveSettingActivity");
       return;
    }
    public z F6(){
       Object obj = PatchProxy.apply(null, this, p.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e();
    }
    public boolean F7(){
       Object obj = PatchProxy.apply(null, this, p.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.n().F7();
    }
    public boolean F9(int p0){
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, op, "47");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return a.b(p0);
    }
    public void Fv(LiveBizParam p0,LiveStreamFeed p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p.class, "66")) {
          return;
       }
       this.n().Fv(p0, p1);
       return;
    }
    public t Fy(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, p.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return i.a().a(p0, p1, p2).map(new e()).map(o.b).subscribeOn(d.b).observeOn(d.a);
    }
    public void G1(){
       if (PatchProxy.applyVoid(null, this, p.class, "15")) {
          return;
       }
       AryaInitializer.initialize();
       return;
    }
    public a H60(){
       Object obj = PatchProxy.apply(null, this, p.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x77edb35);
    }
    public LiveStageProto$LayoutConfig HB(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(p.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, p.class, "72");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return w.b(p0, p1, p2);
    }
    public LiveAudienceParam HL(GifshowActivity p0,LiveStreamFeed p1,int p2,QPreInfo p3,int p4,String p5,String p6){
       if (PatchProxy.isSupport(p.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,Integer.valueOf(p4),p5,p6};
          p0 = PatchProxy.apply(objArray, this, p.class, "10");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       LiveAudienceParam$a uoa = new LiveAudienceParam$a();
       uoa.j(p1);
       uoa.g(b.a(p2, p1, null, null, null));
       uoa.k(p3);
       uoa.d(p4);
       uoa.v(System.currentTimeMillis());
       uoa.h(p6);
       uoa.m(SearchParams.getSearchParams(p1));
       return uoa.a();
    }
    public boolean Hy(){
       Object obj = PatchProxy.apply(null, this, p.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.n().Hy();
    }
    public void IF(String p0,RxFragmentActivity p1,b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, p.class, "41")) {
          return;
       }
       LivePluginManager.e(l.class, LoadPolicy.SILENT, null, "unSubscribeLive").R(new k(this, p0, p1, p2), new m(p2));
       return;
    }
    public t Jy(){
       Object[] objArray = null;
       f obj = PatchProxy.apply(objArray, this, p.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (LivePluginManager.c()) {
          return this.n().Jy();
       }
       obj = new f(objArray);
       return t.create(new d(this, obj)).observeOn(a.c()).doOnDispose(new i(obj));
    }
    public int KL(int p0){
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, op, "24");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 16;
       if (p0 != -1) {
          int i1 = 2;
          if (p0 != i1) {
             if (p0 != 5) {
                if (p0 != 6) {
                   if (p0 != 8) {
                      if (p0 != 9) {
                         if (p0 != 47) {
                            if (p0 != 48) {
                               if (p0 != 70) {
                                  if (p0 != 71) {
                                     if (p0 != 82) {
                                        if (p0 != 83 && p0 != i1) {
                                           if (p0 != i) {
                                              if (p0 != 28) {
                                                 if (p0 != 54) {
                                                    if (p0 != 57) {
                                                       if (p0 != 64) {
                                                          if (p0 != 66) {
                                                             if (p0 != 88) {
                                                                if (p0 != 262) {
                                                                   if (p0 != 0x2710) {
                                                                      switch (p0){
                                                                          case '!':
                                                                            break;
                                                                          case '"':
                                                                          case '$':
                                                                          case '%':
                                                                          case '&':
                                                                          case 39:
                                                                          case '(':
                                                                          case ')':
                                                                          case '#':
                                                                            break;
                                                                          case '*':
                                                                            i = 20;
                                                                            break;
                                                                          default:
                                                                            switch (p0){
                                                                                case ']':
                                                                                  i = 60;
                                                                                  break;
                                                                                case '^':
                                                                                  i = 63;
                                                                                  break;
                                                                                case '_':
                                                                                  i = 62;
                                                                                  break;
                                                                                default:
                                                                                  i = 0;
                                                                            }
                                                                      }
                                                                   }else {
                                                                      i = 15;
                                                                   }
                                                                }else {
                                                                   i = 278;
                                                                }
                                                             }else {
                                                                i = 52;
                                                             }
                                                          }else {
                                                             i = 23;
                                                          }
                                                       }else {
                                                          i = 22;
                                                       }
                                                    }else {
                                                       i = 209;
                                                    }
                                                 }
                                              }else {
                                                 i = 14;
                                              }
                                           }else {
                                              i = 4;
                                           }
                                        }
                                     }else {
                                        i = 104;
                                     }
                                  }else {
                                     i = 10;
                                  }
                               }else {
                                  i = 9;
                               }
                            }
                            i = 8;
                         }else {
                            i = 7;
                         }
                      }else {
                         i = 6;
                      }
                   }else {
                      i = 5;
                   }
                }
                i = 13;
             }else {
                i = 24;
             }
          }
          i = 91;
       }
       return i;
    }
    public void Ke(){
       if (PatchProxy.applyVoid(null, this, p.class, "39")) {
          return;
       }
       d.a(-773683726).hz(new t());
       return;
    }
    public boolean L1(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.n().L1(p0);
    }
    public void LF(String p0,RxFragmentActivity p1,b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, p.class, "40")) {
          return;
       }
       LivePluginManager.e(l.class, LoadPolicy.SILENT, null, "subscribeLive").R(new j(this, p0, p1, p2), new l(p2));
       return;
    }
    public String Lc(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.apply(null, this, p.class, "69");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, LiveSnowManager.class, "7");
       if (obj != patchProxyRe) {
       }else {
          obj = b.b().c();
       }
       return obj;
    }
    public void MC(){
       if (PatchProxy.applyVoid(null, this, p.class, "61")) {
          return;
       }
       b.P(LiveLogTag.LIVE_PLUGIN.appendTag("LivePluginImplWrapper"), "loadLivePlugin on launch finish: ");
       if (!l.c("key_enable_plugin_preload", false)) {
          LivePluginManager.g(true);
       }
       d.a("live_anchor_plugin", 30).subscribe(n.b, m.b);
       return;
    }
    public BaseFragment Mg(){
       Object obj = PatchProxy.apply(null, this, p.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "LivePluginImplWrapper";
       if (LivePluginManager.c()) {
          b.P(LiveLogTag.LIVE_PLUGIN.appendTag(str), "createLiveExploreFragment, is Installed");
          return d.a(-1577615329).l9().Mg();
       }else {
          b.P(LiveLogTag.LIVE_PLUGIN.appendTag(str), "createLiveExploreFragment, not Installed");
          return new LivePluginExploreFragment();
       }
    }
    public void N00(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "17")) {
          return;
       }
       LivePluginManager.h(true, new p$j(this, "fetchLiveConfigOnColdStart", p0));
       return;
    }
    public void N50(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "18")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, d.class, "1")) {
          i.a().b(p0).map(new e()).observeOn(d.c).subscribe(e.b, d.b);
       }
       return;
    }
    public void Q1(boolean p0){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, op, "29")) {
          return;
       }
       this.n().Q1(p0);
       return;
    }
    public Map Rf(){
       Object obj = PatchProxy.apply(null, this, p.class, "74");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-1498019239).e();
    }
    public void SC(Activity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p.class, "6")) {
          return;
       }
       LiveShellActivity.u3(p0, new e(this, p0, p1), "startVoicePartyFeedActivity");
       return;
    }
    public boolean Ur(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.n().Ur(p0);
    }
    public void Vp(){
       if (PatchProxy.applyVoid(null, this, p.class, "32")) {
          return;
       }
       LivePluginManager.h(true, new p$l(this, "clearLastAuditedCover"));
       return;
    }
    public boolean X6(Uri p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "75");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(p0);
    }
    public void Xb(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "30")) {
          return;
       }
       this.n().Xb(p0);
       return;
    }
    public void Xu(Fragment p0,LiveStreamFeed p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p.class, "56")) {
          return;
       }
       this.n().Xu(p0, p1);
       return;
    }
    public i Y10(i p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n().Y10(p0);
    }
    public PresenterV2 YA(){
       Object obj = PatchProxy.applyWithListener(null, this, p.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(p.class, "49");
       return new e();
    }
    public boolean Yb(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.n().Yb(p0);
    }
    public boolean Z9(int p0){
       boolean b = (p0 == 2)? true: false;
       return b;
    }
    public void Zj(LiveStreamFeed p0,int p1){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, op, "43")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_ICON_TYPE";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = x.e(p0, 2);
       u1.u0(3, uElementPack, uContentPack);
       return;
    }
    public void aZ(Fragment p0,LiveStreamFeed p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p.class, "55")) {
          return;
       }
       this.n().aZ(p0, p1);
       return;
    }
    public LiveStreamStatus c20(){
       Object obj = PatchProxy.apply(null, this, p.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return z.a();
    }
    public boolean er(){
       return true;
    }
    public t f9(List p0,int p1){
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, op, "73");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return a.b().a(k.a(p0, p1, null, null)).map(new e());
    }
    public Fragment gm(){
       Object obj = PatchProxy.apply(null, this, p.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n().gm();
    }
    public boolean h1(){
       Object obj = PatchProxy.apply(null, this, p.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.n().h1();
    }
    public void hm(){
       if (PatchProxy.applyVoid(null, this, p.class, "45")) {
          return;
       }
       ConfigPriority[] uConfigPrior = new ConfigPriority[]{ConfigPriority.LOW,ConfigPriority.MIDDLE};
       a.t().q("SOURCE_LIVE", uConfigPrior);
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public void j0(Activity p0,LiveStreamFeed p1,String p2,c p3,Collection p4){
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, op, "27")) {
             return;
          }
       }
       this.n().j0(p0, p1, p2, p3, p4);
       return;
    }
    public void k1(Activity p0,LiveStreamFeed p1,String p2,c p3,Collection p4){
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, op, "26")) {
             return;
          }
       }
       this.n().k1(p0, p1, p2, p3, p4);
       return;
    }
    public boolean kA(int p0){
       boolean b = (p0 == 4)? true: false;
       return b;
    }
    public d kV(){
       Object obj = PatchProxy.apply(null, this, p.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "LivePluginImplWrapper";
       if (LivePluginManager.c()) {
          b.P(LiveLogTag.LIVE_PLUGIN.appendTag(str), "newGrootLivePlayFragment, is Installed");
          return d.a(-1577615329).l9().kV();
       }else {
          b.P(LiveLogTag.LIVE_PLUGIN.appendTag(str), "newGrootLivePlayFragment, not Installed");
          return new LivePluginGrootPlayFragment("LIVE_PLAY_PLUGIN");
       }
    }
    public int l2(){
       Object obj = PatchProxy.apply(null, this, p.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("liveAutoPlayLowQualityLevel", 0);
    }
    public void lv(){
       if (PatchProxy.applyVoid(null, this, p.class, "54")) {
          return;
       }
       LivePluginManager.h(true, new p$c(this, "asyncInstallKlpPlugin"));
       return;
    }
    public void ly(String p0,int p1){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, op, "62")) {
          return;
       }
       b.d0(LiveLogTag.LIVE_PLUGIN_LOAD_MOCK, "logLiveFeedFiltered", "delayFrom", p0, "count", Integer.valueOf(p1));
       i3 oi3 = i3.f();
       oi3.d("from", TextUtils.k(p0));
       oi3.d("count", String.valueOf(p1));
       p0 = oi3.e();
       u1.R("LIVE_PLUGIN_EXP_EVENT", p0, 3);
       return;
    }
    public void m1(Activity p0,LiveAudienceParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p.class, "4")) {
          return;
       }
       LiveShellActivity.u3(p0, new n(this, p0, p1), "startLivePlayActivity");
       return;
    }
    public void mK(BaseFeed p0,i3 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p.class, "44")) {
          return;
       }
       d0 uod0 = a.a(p0);
       uod0.c(p1.e());
       c0.q().n(uod0);
       return;
    }
    public l n(){
       p tb;
       l obj = PatchProxy.apply(null, this, p.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (LivePluginManager.c())? d.a(-1577615329).l9(): this.b;
       return obj;
    }
    public void nN(){
       if (PatchProxy.applyVoid(null, this, p.class, "52")) {
          return;
       }
       LivePluginManager.h(true, new p$b(this, "initPerformanceReport"));
       return;
    }
    public void na(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "3")) {
          return;
       }
       LivePluginManager.h(true, new p$h(this, "initGiftStore", p0));
       return;
    }
    public boolean oW(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (a.t().b("livePluginFilteredInFind", 0) - 1 && (d.c("live_audience_plugin") || ("delay_from_live_priview").equals(p0)))? true: false;
       return b;
    }
    public boolean q50(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.n().q50(p0);
    }
    public void qP(Activity p0,String p1,int p2){
       if (PatchProxy.isSupport(p.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, p.class, "68")) {
          return;
       }
       this.n().qP(p0, p1, p2);
       return;
    }
    public void qf(LiveStreamStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "23")) {
          return;
       }
       e.v0(p0.name());
       return;
    }
    public void rE(int p0,int p1){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, op, "25")) {
          return;
       }
       this.n().rE(p0, p1);
       return;
    }
    public void rW(){
       if (PatchProxy.applyVoid(null, this, p.class, "16")) {
          return;
       }
       LivePluginManager.h(true, new p$i(this, "initLiveResourcePreFetcherService"));
       return;
    }
    public PresenterV2 s60(){
       Object obj = PatchProxy.applyWithListener(null, this, p.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(p.class, "58");
       return new f();
    }
    public void tP(GifshowActivity p0,String p1,int p2,LiveStreamFeed p3){
       if (PatchProxy.isSupport(p.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, p.class, "33")) {
          return;
       }
       h oh = new h(this, p0, p1, p2, p3);
       LiveShellActivity.u3(p0, v0, "openLiveQuizRoom");
       return;
    }
    public String th(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.apply(null, this, p.class, "70");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, LiveSnowManager.class, "8");
       if (obj != patchProxyRe) {
       }else {
          Objects.requireNonNull(b.b());
          obj = "krtcengine";
       }
       return obj;
    }
    public PresenterV2 tk(boolean p0){
       if (PatchProxy.isSupport2(p.class, "59")) {
          Object obj = PatchProxy.applyOneRefsWithListener(Boolean.valueOf(p0), this, p.class, "59");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       PatchProxy.onMethodExit(p.class, "59");
       return new h(p0);
    }
    public String uP(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c0.a.b(p0);
    }
    public String v0(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveSnowManager.d(p0);
    }
    public Fragment vz(){
       Object obj = PatchProxy.apply(null, this, p.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "LivePluginImplWrapper";
       if (LivePluginManager.c()) {
          b.P(LiveLogTag.LIVE_PLUGIN.appendTag(str), "newLivePlayFragment, is Installed");
          return d.a(-1577615329).l9().vz();
       }else {
          b.P(LiveLogTag.LIVE_PLUGIN.appendTag(str), "newLivePlayFragment, not Installed");
          if (!a.d()) {
             return new LivePluginLoadingFragment();
          }
          throw new RuntimeException("newLivePlayFragment, not Installed");
       }
    }
    public void wV(GifshowActivity p0,LiveAudienceParam p1,int p2){
       if (PatchProxy.isSupport(p.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, p.class, "5")) {
          return;
       }
       LiveShellActivity.u3(p0, new g(this, p0, p1, p2), "startLivePlayActivityForResult");
       return;
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, p.class, "28")) {
          return;
       }
       this.n().y();
       return;
    }
    public boolean yM(){
       Object obj = PatchProxy.apply(null, this, p.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.n().yM();
    }
    public boolean zC(){
       Object obj = PatchProxy.apply(null, this, p.class, "71");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return LiveSnowManager.f();
    }
}
