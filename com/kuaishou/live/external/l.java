package com.kuaishou.live.external.l;
import os5.l;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.kuaishou.live.core.show.coverandbackground.cover.b;
import gw1.a;
import ed2.g;
import ed2.f;
import java.lang.Runnable;
import t45.c;
import com.kuaishou.live.longconnection.connector.b;
import java.util.Iterator;
import java.util.List;
import java.lang.StringBuilder;
import com.kuaishou.live.longconnection.connector.l;
import com.kuaishou.live.longconnection.connector.l$c;
import mf3.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import ph3.a;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.basic.userlayer.LiveUserLayerManager;
import com.kuaishou.live.basic.userlayer.LiveUserLayerManager$UserLayer;
import c61.b;
import brd.t;
import t45.d;
import brd.z;
import g33.c;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kuaishou.live.core.basic.utils.e;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import android.app.Activity;
import d61.y;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.live.external.LiveSettingsActivity;
import android.content.Intent;
import android.content.Context;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kuaishou.live.external.h;
import com.kuaishou.live.external.i;
import com.kuaishou.live.external.j;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import joc.z;
import kp3.e;
import pm8.a;
import w51.a;
import java.lang.Integer;
import dq3.a;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kwai.video.waynelive.LivePlayerParam$Builder;
import com.kwai.video.waynelive.LivePlayerParam;
import com.kwai.video.waynelive.datasource.LiveDataSource;
import uj3.b;
import com.kwai.video.waynelive.LivePlayerController;
import hj3.d;
import jj3.e;
import rj3.a$a;
import rj3.a;
import rj3.c;
import com.yxcorp.utility.Log;
import o02.j;
import o02.i;
import cjd.e;
import erd.o;
import com.kuaishou.live.external.k;
import us5.a;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$LayoutConfig;
import com.yxcorp.gifshow.entity.QPreInfo;
import dq3.b;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import java.lang.System;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.SearchParams;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import ps5.b;
import com.kuaishou.live.core.show.subscribe.dosubscribe.j;
import fg6.a;
import xk2.a;
import com.google.gson.Gson;
import rk2.u;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import java.util.Objects;
import xl8.b;
import og1.a;
import java.lang.Number;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import tkd.b;
import tkd.d;
import gx5.f;
import com.kuaishou.live.core.show.subscribe.profile.c;
import dx5.h;
import java.lang.RuntimeException;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.core.show.liveexplore.LiveExploreFragment;
import com.kuaishou.live.core.basic.config.LiveCommonConfigFetcher;
import com.kuaishou.live.core.show.floatingwindow.m;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowCloseType;
import java.util.Map;
import com.yxcorp.gifshow.log.h;
import k2b.k2;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.live.core.voiceparty.feed.VoicePartyFeedActivity;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import android.net.Uri;
import java.util.LinkedHashMap;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.basic.liveslide.a;
import com.kuaishou.live.core.basic.liveslide.a$a;
import com.kuaishou.live.core.basic.liveslide.b$a;
import wg3.b;
import qvb.i;
import d12.p;
import e12.c;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import yp.x;
import k2b.u1;
import b51.d;
import com.kuaishou.live.core.basic.liveslide.b;
import c51.d;
import c51.i;
import c51.h;
import com.kuaishou.live.basic.liveslide.a;
import cw6.b;
import com.kwai.feature.api.live.service.basic.model.LiveStreamStatus;
import d61.z;
import com.kuaishou.live.common.core.component.admin.user.LiveUserListFragment;
import wp5.c;
import java.util.Collection;
import pw6.d;
import f12.o;
import r12.g;
import qj3.b;
import com.kwai.plugin.dva.Dva;
import qj3.a;
import com.yxcorp.utility.SystemUtil;
import java.lang.IllegalArgumentException;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam$b;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;
import os5.e;
import lnc.i3;
import com.yxcorp.gifshow.log.c0;
import com.yxcorp.gifshow.log.d0;
import com.kuaishou.live.effect.resource.download.switc.LiveEffectDownloadSwitchInfo;
import com.kuaishou.live.effect.resource.download.switc.LiveEffectDownloadSwitchContainer;
import wz2.a$a;
import wz2.a;
import com.kuaishou.live.effect.resource.download.common.e;
import vz2.a;
import n12.b;
import o56.a;
import android.app.Application;
import n12.a;
import android.app.Application$ActivityLifecycleCallbacks;
import cm1.a;
import com.kuaishou.live.core.basic.activity.LiveSlideActivity;
import en1.d;
import android.widget.FrameLayout;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowView;
import android.view.WindowManager$LayoutParams;
import java.lang.Math;
import ia1.j;
import uo3.l;
import we3.h;

public class l implements l	// class@001b9a
{
    public static final int b;

    static {
       PluginDownloadExtension.k.a("live_audience_plugin");
    }
    public void l(){
       super();
    }
    public void A9(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "26")) {
          return;
       }
       b.a(-1057460702).h(p0);
       return;
    }
    public void AE(){
       if (PatchProxy.applyVoid(null, this, l.class, "40")) {
          return;
       }
       if (a.c()) {
          _monitor_enter(g.class);
          if (PatchProxy.applyVoid(null, null, g.class, "1")) {
             _monitor_exit(g.class);
          }else if(g.a){
             _monitor_exit(g.class);
          }else {
             g.a = true;
             c.a(f.b);
             _monitor_exit(g.class);
          }
       }
       return;
    }
    public void BC(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l.class, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, b.class, "1")) {
          Iterator iterator = b.g.iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             if (uob != null) {
                Object[] objArray1 = new Object[]{"params: "+uob.j(),"server: "+uob.g()};
                b.a("LiveFeedConnection", "close_one_by_one", objArray1);
                uob.e();
             }
             iterator.remove();
          }
       }
       return;
    }
    public PresenterV2 BU(){
       Object obj = PatchProxy.applyWithListener(null, this, l.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(l.class, "31");
       return new a();
    }
    public void Ds(boolean p0,boolean p1,RequestTiming p2,boolean p3){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, Boolean.valueOf(p3), this, l.class, "28")) {
          return;
       }
       if (!QCurrentUser.me().isLogined()) {
          return;
       }
       LiveUserLayerManager$UserLayer userLayer = PatchProxy.apply(null, null, LiveUserLayerManager.class, "1");
       if (userLayer != PatchProxyResult.class) {
       }else if(LiveUserLayerManager.d.b()){
          userLayer = LiveUserLayerManager$UserLayer.UNSET;
       }else {
          userLayer = LiveUserLayerManager.b.a();
       }
       if (userLayer == LiveUserLayerManager$UserLayer.UNSET) {
          LiveUserLayerManager.a().observeOn(d.c).subscribe(new c(this, p2), Functions.d());
       }else {
          this.n(p2, userLayer);
       }
       return;
    }
    public boolean Du(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, l.class, "56");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, e.class, "39");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): a.t().u("SOURCE_LIVE").d("disableHomeLiveTabPlayerPreload", false);
       return b;
    }
    public boolean E(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return y.d(p0);
    }
    public void EQ(GifshowActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "16")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, LiveSettingsActivity.class, "1")) {
          p0.startActivity(new Intent(p0, LiveSettingsActivity.class));
       }
       return;
    }
    public final String F(LiveAudienceParam p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "71");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return k0.c(p0, h.a, i.a, j.a).orNull();
    }
    public z F6(){
       Object obj = PatchProxy.apply(null, this, l.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e();
    }
    public boolean F7(){
       Object obj = PatchProxy.apply(null, this, l.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (a.K() || a.t())? true: false;
       return b;
    }
    public boolean F9(int p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ol, "44");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return a.b(p0);
    }
    public void Fv(LiveBizParam p0,LiveStreamFeed p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "58")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, null, e.class, "40") && TextUtils.x(p0.mPlayerReuseToken)) {
          LiveStreamFeedWrapper liveStreamFe = new LiveStreamFeedWrapper(p1);
          QLivePlayConfig livePlayConf = liveStreamFe.getLivePlayConfig();
          if (livePlayConf != null) {
             LivePlayerController livePlayerCo = d.a(b.a(p1.mConfig), e.b(liveStreamFe, livePlayConf).setEnableDummySurface(true).enableReusePlayerOptimize(false).setBizFt(":ks-features:ft-live:live").setBizType(String.valueOf(2)).build(), 2);
             e.c(livePlayerCo);
             livePlayerCo.unMute();
             livePlayerCo.startPlay();
             String str = c.a(p1);
             p0.mPlayerReuseToken = str;
             b.a(0x59ca4ae1).b(str, new a$a(livePlayerCo).a());
             Log.g("LivePlayUtil", "live player preload");
          }
       }
       return;
    }
    public t Fy(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, l.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return i.a().a(p0, p1, p2).map(new e()).map(k.b).subscribeOn(d.b).observeOn(d.a);
    }
    public void G1(){
       PatchProxy.applyVoid(null, this, l.class, "11");
    }
    public a H60(){
       Object obj = PatchProxy.apply(null, this, l.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
    public LiveStageProto$LayoutConfig HB(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(l.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, l.class, "66");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       return null;
    }
    public LiveAudienceParam HL(GifshowActivity p0,LiveStreamFeed p1,int p2,QPreInfo p3,int p4,String p5,String p6){
       if (PatchProxy.isSupport(l.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,Integer.valueOf(p4),p5,p6};
          p0 = PatchProxy.apply(objArray, this, l.class, "8");
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
       Object obj = PatchProxy.apply(null, this, l.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.o();
    }
    public void IF(String p0,RxFragmentActivity p1,b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, l.class, "39")) {
          return;
       }
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, j.class, "19")) {
          a uoa = a.a.h(p0, a.class);
          if (uoa == null || TextUtils.x(uoa.mSubscribeId)) {
             if (p2 != null) {
                p2.accept(Boolean.FALSE);
             }
          }else {
             j.p(uoa, p1).subscribe(new u(p2));
          }
       }
       return;
    }
    public t Jy(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveFloatingWindowManager obj = PatchProxy.apply(null, this, l.class, "36");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = b.a(0x432c5e03);
       Objects.requireNonNull(obj);
       t ot = PatchProxy.apply(null, obj, LiveFloatingWindowManager.class, "3");
       if (ot != patchProxyRe) {
       }else {
          ot = a.a().b();
       }
       return ot;
    }
    public int KL(int p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ol, "19");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return 0;
    }
    public void Ke(){
       if (PatchProxy.applyVoid(null, this, l.class, "37")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_SUBSCRIBE_PROFILE, "registerProfileCardInterceptor， v2");
       d.a(-773683726).hz(new c());
       return;
    }
    public boolean L1(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.s(p0);
    }
    public void LF(String p0,RxFragmentActivity p1,b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, l.class, "38")) {
          return;
       }
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, j.class, "15")) {
          j.o(a.a.h(p0, a.class), p1, p2, true);
       }
       return;
    }
    public String Lc(){
       Object obj = PatchProxy.apply(null, this, l.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
    public void MC(){
       if (PatchProxy.applyVoid(null, this, l.class, "53")) {
          return;
       }
       throw new RuntimeException("已在LivePluginImplWrapper中实现，不应该直接访问此方法");
    }
    public BaseFragment Mg(){
       Object obj = PatchProxy.apply(null, this, l.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveExploreFragment();
    }
    public void N00(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "13")) {
          return;
       }
       LiveCommonConfigFetcher.fetch(p0);
       return;
    }
    public void N50(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "14")) {
          return;
       }
       throw new RuntimeException("已在LivePluginImplWrapper中实现，不应该直接访问此方法");
    }
    public void Q1(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "24")) {
          return;
       }
       m om = b.a(-226225736);
       Objects.requireNonNull(om);
       m om1 = m.class;
       if (!PatchProxy.isSupport(om1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), om, om1, "4")) {
          om.a(LiveFloatingWindowCloseType.EXTERNAL_CLOSE, p0);
       }
       return;
    }
    public Map Rf(){
       Object obj = PatchProxy.apply(null, this, l.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
    public void SC(Activity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "4")) {
          return;
       }
       if (TextUtils.x(p1)) {
          int i = 0x4b316083;
          if (b.a(i) == null || b.a(i).f() == null) {
             VoicePartyFeedActivity.u3(p0, "unknown");
             return;
          }else {
             k2 c = b.a(i).f().c;
             if (c != 13) {
                if (c != 15) {
                   if (c != 0x75d3) {
                      VoicePartyFeedActivity.u3(p0, "unknown");
                   }else {
                      VoicePartyFeedActivity.u3(p0, "nearby_top_bar_live_aggregation");
                   }
                }else {
                   VoicePartyFeedActivity.u3(p0, "nearby");
                }
             }else {
                VoicePartyFeedActivity.u3(p0, "chat_room_live");
             }
          }
       }else {
          VoicePartyFeedActivity.u3(p0, p1);
       }
       return;
    }
    public boolean Ur(Context p0){
       return p0 instanceof LivePlayActivity;
    }
    public void Vp(){
       if (PatchProxy.applyVoid(null, this, l.class, "27")) {
          return;
       }
       b.a(-1057460702).a();
       return;
    }
    public boolean X6(Uri p0){
       p0 = PatchProxy.applyOneRefs(p0, this, l.class, "74");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       return false;
    }
    public void Xb(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "25")) {
          return;
       }
       m om = b.a(-226225736);
       Objects.requireNonNull(om);
       if (!PatchProxy.applyVoidOneRefs(p0, om, m.class, "6")) {
          om.q.remove(p0);
       }
       return;
    }
    public void Xu(Fragment p0,LiveStreamFeed p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "68")) {
          return;
       }
       if (p1 == null) {
          a.n(p0.getActivity()).j().d();
       }else {
          a$a uoa = a.n(p0.getActivity()).j();
          uoa.f(uoa.c(p1), p1);
       }
       return;
    }
    public i Y10(i p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "59");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = null;
       obj = PatchProxy.applyOneRefs(p0, obj1, p.class, "2");
       if (obj != patchProxyRe) {
          obj1 = obj;
       }else if(p0 instanceof c){
          c uoc = p.a(p0);
          if (uoc instanceof i) {
             obj1 = uoc;
          }
       }
       return obj1;
    }
    public PresenterV2 YA(){
       Object obj = PatchProxy.applyWithListener(null, this, l.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(l.class, "47");
       throw new RuntimeException("已在LivePluginImplWrapper中实现，不应该直接访问此方法");
    }
    public boolean Yb(Fragment p0){
       return p0 instanceof LivePlayFragment;
    }
    public boolean Z9(int p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ol, "64");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return false;
    }
    public void Zj(LiveStreamFeed p0,int p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ol, "41")) {
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "67")) {
          return;
       }
       if (p1 == null) {
          a.n(p0.getActivity()).j().d();
       }else {
          a$a uoa = a.n(p0.getActivity()).j();
          int i = uoa.c(p1);
          b$a uoa1 = b$a.class;
          if (PatchProxy.isSupport(uoa1)) {
             Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(i), p1, uoa, uoa1, "8");
             if (obj != PatchProxyResult.class) {
                obj.booleanValue();
             }
          }
          if (i >= 0 && uoa.a.e().p().f() > i) {
             d uod = uoa.a.e();
             Objects.requireNonNull(uod);
             d uod1 = d.class;
             if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), p1, uod, uod1, "15")) {
                i oi = uod.p();
                Objects.requireNonNull(oi);
                i oi1 = i.class;
                if (!PatchProxy.isSupport(oi1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), p1, oi, oi1, "20")) {
                   oi.b.p0(i, p1);
                }
                uod.o().F0(false);
                uod.o().q();
             }
          }
       }
    label_00af :
       return;
    }
    public LiveStreamStatus c20(){
       Object obj = PatchProxy.apply(null, this, l.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return z.a();
    }
    public boolean er(){
       Object obj = PatchProxy.apply(null, this, l.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public t f9(List p0,int p1){
       if (PatchProxy.isSupport(l.class)) {
          p0 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, l.class, "62");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       return null;
    }
    public Fragment gm(){
       Object obj = PatchProxy.apply(null, this, l.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveUserListFragment.Ih(2, QCurrentUser.me().getId(), null, true, "", "", false);
    }
    public boolean h1(){
       Boolean uBoolean = PatchProxy.apply(null, this, l.class, "35");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          uBoolean = b.a(0x432c5e03).o();
       }
       return uBoolean.booleanValue();
    }
    public void hm(){
    }
    public boolean isAvailable(){
       return true;
    }
    public void j0(Activity p0,LiveStreamFeed p1,String p2,c p3,Collection p4){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, ol, "22")) {
             return;
          }
       }
       b.a(-226225736).f(p0, p1, p2, p3, p4, true);
       return;
    }
    public void k1(Activity p0,LiveStreamFeed p1,String p2,c p3,Collection p4){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, ol, "21")) {
             return;
          }
       }
       b.a(-226225736).f(p0, p1, p2, p3, p4, false);
       return;
    }
    public boolean kA(int p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ol, "65");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return false;
    }
    public d kV(){
       o obj = PatchProxy.apply(null, this, l.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new o(LivePlayFragment.zh(), 0);
       g.i(obj.g0().hashCode());
       return obj;
    }
    public int l2(){
       Object obj = PatchProxy.apply(null, this, l.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("liveAutoPlayLowQualityLevel", 0);
    }
    public void lv(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l.class, "51")) {
          return;
       }
       b uob = b.a();
       _monitor_enter(uob);
       if (PatchProxy.applyVoid(objArray, uob, b.class, "3")) {
          _monitor_exit(uob);
       }else if(uob.a != null){
          _monitor_exit(uob);
       }else {
          b = Dva.instance().isLoaded("klp_so");
          if (b) {
             uob.a = true;
          }
          if (!b && uob.c == null) {
             uob.c = true;
             c.a(new a(uob));
          }
          _monitor_exit(uob);
       }
       return;
    }
    public void ly(String p0,int p1){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, l.class, "54")) {
          return;
       }
       throw new RuntimeException("已在LivePluginImplWrapper中实现，不应该直接访问此方法");
    }
    public void m1(Activity p0,LiveAudienceParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "2")) {
          return;
       }
       if (SystemUtil.I() && p1.mLiveSourceType <= null) {
          throw new IllegalArgumentException("use valid source type!");
       }
       LiveSlidePlayEnterParam$b uob = new LiveSlidePlayEnterParam$b();
       uob.o(p1.mLiveSourceType);
       uob.m(p1);
       uob.G(true);
       LiveSlidePlayEnterParam liveSlidePla = uob.a();
       String str = this.F(p1);
       if (!TextUtils.x(str)) {
          liveSlidePla.mLiveInternalJumpUrlMap.put(str, p1.mInternalJumpSchema);
       }
       d.a(-1835681758).b1(p0, liveSlidePla);
       return;
    }
    public void mK(BaseFeed p0,i3 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "42")) {
          return;
       }
       d0 uod0 = a.a(p0);
       uod0.c(p1.e());
       c0.q().n(uod0);
       return;
    }
    public final void n(RequestTiming p0,LiveUserLayerManager$UserLayer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "29")) {
          return;
       }
       if (p1 != LiveUserLayerManager$UserLayer.SILENT) {
          a$a uoa = new a$a();
          uoa.e(1);
          uoa.f((LiveEffectDownloadSwitchContainer.getMatchedSwitchInfo().enablePreDownloadOnColdStart ^ 1));
          uoa.j(p0);
          uoa.c(2);
          a uoa1 = uoa.a();
          e.b().he().f(null, false, uoa1);
       }
       return;
    }
    public void nN(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l.class, "49")) {
          return;
       }
       if (PatchProxy.applyVoid(objArray, objArray, b.class, "1") || (SystemUtil.L(a.B) && (a.d() || a.b()))) {
          a.b().registerActivityLifecycleCallbacks(new a());
       }
    label_003a :
       return;
    }
    public void na(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       a.f(p0);
       return;
    }
    public boolean oW(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, l.class, "52");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       throw new RuntimeException("已在LivePluginImplWrapper中实现，不应该直接访问此方法");
    }
    public boolean q50(Context p0){
       return p0 instanceof LiveSlideActivity;
    }
    public void qP(Activity p0,String p1,int p2){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, l.class, "72")) {
          return;
       }
       d.a(p0, p1, p2);
       return;
    }
    public void qf(LiveStreamStatus p0){
       PatchProxy.applyVoidOneRefs(p0, this, l.class, "18");
    }
    public void rE(int p0,int p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ol, "20")) {
          return;
       }
       LiveFloatingWindowManager liveFloating = b.a(0x432c5e03);
       Objects.requireNonNull(liveFloating);
       LiveFloatingWindowManager liveFloating1 = LiveFloatingWindowManager.class;
       if (!PatchProxy.isSupport(liveFloating1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), liveFloating, liveFloating1, "8")) {
          liveFloating1 = liveFloating.b;
          if (liveFloating1 != null && liveFloating1.isShown()) {
             liveFloating = liveFloating.b;
             Objects.requireNonNull(liveFloating);
             if (!PatchProxy.isSupport(LiveFloatingWindowView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), liveFloating, LiveFloatingWindowView.class, "13")) {
                LiveFloatingWindowView u = liveFloating.u;
                liveFloating.l(u.x, u.y, Math.max(0, Math.min(p0, (liveFloating.k - liveFloating.u.width))), Math.max(liveFloating.getMinY(), Math.min(p1, liveFloating.getMaxY())));
             }
          }
       }
       return;
    }
    public void rW(){
       if (PatchProxy.applyVoid(null, this, l.class, "12")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, null, j.class, "5")) {
          j.d().b();
          j.b().b();
          j.c().b();
       }
       return;
    }
    public PresenterV2 s60(){
       return null;
    }
    public void tP(GifshowActivity p0,String p1,int p2,LiveStreamFeed p3){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, l.class, "30")) {
          return;
       }
       LiveAudienceParam$a uoa = new LiveAudienceParam$a();
       uoa.j(p3);
       LiveAudienceParam liveAudience = uoa.a();
       liveAudience.mLiveSourceUrl = p1;
       liveAudience.mLiveSourceType = p2;
       this.m1(p0, liveAudience);
       b.Z(LiveLogTag.LIVE_QUIZ, "openLiveQuizRoom");
       return;
    }
    public String th(){
       Object obj = PatchProxy.apply(null, this, l.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
    public PresenterV2 tk(boolean p0){
       if (PatchProxy.isSupport2(l.class, "70")) {
          Object obj = PatchProxy.applyOneRefsWithListener(Boolean.valueOf(p0), this, l.class, "70");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       PatchProxy.onMethodExit(l.class, "70");
       return new h(p0);
    }
    public String uP(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, l.class, "69");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new RuntimeException("已在LivePluginImplWrapper中实现，不应该直接访问此方法");
    }
    public String v0(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, l.class, "50");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return "";
    }
    public Fragment vz(){
       LivePlayFragment obj = PatchProxy.apply(null, this, l.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LivePlayFragment.zh();
       g.i(obj.hashCode());
       return obj;
    }
    public void wV(GifshowActivity p0,LiveAudienceParam p1,int p2){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, l.class, "3")) {
          return;
       }
       if (SystemUtil.I() && p1.mLiveSourceType <= null) {
          throw new IllegalArgumentException("use valid source type!");
       }
       LiveSlidePlayEnterParam$b uob = new LiveSlidePlayEnterParam$b();
       uob.o(p1.mLiveSourceType);
       uob.m(p1);
       uob.G(true);
       LiveSlidePlayEnterParam liveSlidePla = uob.a();
       String str = this.F(p1);
       if (!TextUtils.x(str)) {
          liveSlidePla.mLiveInternalJumpUrlMap.put(str, p1.mInternalJumpSchema);
       }
       d.a(-1835681758).eO(p0, liveSlidePla, p2);
       return;
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, l.class, "23")) {
          return;
       }
       this.Q1(true);
       return;
    }
    public boolean yM(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, l.class, "57");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, e.class, "38");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): a.t().u("SOURCE_LIVE").d("enableLivePlayerReuseOpt", false);
       return b;
    }
    public boolean zC(){
       Object obj = PatchProxy.apply(null, this, l.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
}
