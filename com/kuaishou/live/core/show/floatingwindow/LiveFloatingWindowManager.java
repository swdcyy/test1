package com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import s82.z;
import s82.o;
import com.kuaishou.live.core.show.floatingwindow.x;
import s82.n0;
import ok.x;
import y12.b;
import com.kuaishou.live.core.show.floatingwindow.p;
import s82.l0;
import s82.m0;
import s82.i0;
import z1.k;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$f;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$g;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$h;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$i;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$j;
import s82.j0;
import android.content.IntentFilter;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$7;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$k;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$e;
import hga.a;
import hga.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import java.lang.Integer;
import android.view.View;
import a2.i0;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowView;
import com.kwai.video.waynelive.LivePlayerController;
import tj3.e;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$m;
import com.kuaishou.android.live.model.LiveFloatingWindowType;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import lnc.i9;
import oe6.e;
import hga.b;
import java.lang.StringBuilder;
import xl8.b;
import og1.a;
import k51.a;
import qb1.b;
import qb1.b$a;
import android.app.Activity;
import qb1.b$b;
import s82.c0;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import s82.y;
import o02.e;
import o02.f;
import brd.t;
import crd.b;
import org.greenrobot.eventbus.a;
import vs5.l;
import s82.h0;
import erd.g;
import eoc.f;
import bo2.a;
import s82.g0;
import tj3.i;
import tj3.d;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import s82.f0;
import java.lang.Throwable;
import k2b.u1;
import com.kuaishou.live.core.show.floatingwindow.q;
import pp.c;
import com.kuaishou.android.live.log.b;
import s82.k0;
import java.lang.Runnable;
import ekd.k1;
import wp5.d;
import s82.r0;
import java.util.Set;
import com.yxcorp.gifshow.activity.GifshowActivity;
import tkd.b;
import tkd.d;
import os5.e;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam$b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.List;
import java.util.Arrays;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;
import je5.d;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import java.lang.IllegalArgumentException;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import r12.g;
import android.content.Intent;
import android.os.Parcelable;
import org.parceler.b;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowCloseType;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import com.yxcorp.gifshow.detail.slideplay.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import yp.x;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import kp.r1;
import z12.r;
import java.util.Iterator;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import android.widget.FrameLayout;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import com.kwai.video.waynelive.listeners.LivePlayerBufferListener;
import com.kwai.video.waynelive.listeners.LivePlayerErrorListener;
import android.content.BroadcastReceiver;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import android.app.Application$ActivityLifecycleCallbacks;
import java.util.Objects;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import io7.c;
import java.util.Map;
import lj3.b;
import sj3.l;
import pj3.b;
import lnc.b9;
import com.kuaishou.live.core.show.floatingwindow.s;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kwai.video.waynelive.LiveRestartReason;
import va1.d0;
import zb6.a;
import com.yxcorp.gifshow.exception.ServerException;
import e17.i;
import com.kuaishou.live.longconnection.exception.ChannelException;
import com.kuaishou.live.longconnection.exception.ClientException;
import d61.m;
import pp.a;
import q87.c;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFloatingWindowConfig;
import java.lang.reflect.Type;
import wg3.a;
import jj3.e;
import s82.e0;
import sj3.j;
import sj3.b;
import com.kwai.video.waynelive.datasource.LiveDataSourceFetcher;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$l;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$a;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$b;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowView$c;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import m56.f;
import m56.g;
import z12.x;
import tj3.l;
import oj3.a;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$d;
import h91.a;
import com.kuaishou.live.common.core.component.audioconflict.LivePlayPhoneCallStateManager;
import s82.a0;
import com.kuaishou.live.common.core.component.audioconflict.LivePlayPhoneCallStateManager$a;
import s82.b0;
import com.kuaishou.live.common.core.component.audioconflict.LivePlayPhoneCallStateManager$b;
import com.yxcorp.gifshow.util.hardware.HeadsetPlugMonitor;
import s92.e;
import s82.d0;
import s92.e$a;
import erd.o;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$c;

public class LiveFloatingWindowManager	// class@000b6e
{
    public b A;
    public boolean B;
    public LivePlayPhoneCallStateManager C;
    public o D;
    public int E;
    public final x F;
    public int G;
    public LiveSlidePlayEnterParam H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public final b O;
    public final LiveFloatingWindowManager$m P;
    public final Map Q;
    public final Set R;
    public final Runnable S;
    public final Runnable T;
    public b U;
    public final Runnable V;
    public Runnable W;
    public b X;
    public boolean Y;
    public boolean Z;
    public final AtomicInteger a;
    public final IntentFilter a0;
    public LiveFloatingWindowView b;
    public final BroadcastReceiver b0;
    public LivePlayerController c;
    public final b$b c0;
    public e d;
    public String e;
    public b f;
    public b g;
    public l h;
    public LiveFloatingWindowManager$l i;
    public IMediaPlayer$OnVideoSizeChangedListener j;
    public LivePlayerBufferListener k;
    public LivePlayerErrorListener l;
    public LiveFloatingWindowManager$m m;
    public final a n;
    public LiveFloatingWindowManager$m o;
    public int p;
    public int q;
    public d r;
    public boolean s;
    public long t;
    public long u;
    public boolean v;
    public boolean w;
    public LiveStreamFeedWrapper x;
    public b y;
    public b z;
    public static final boolean d0;

    public void LiveFloatingWindowManager(){
       super();
       this.a = new AtomicInteger();
       this.n = new z(this);
       this.p = -1;
       this.q = -1;
       this.v = true;
       this.w = false;
       this.D = new o();
       this.F = new x(new n0(this));
       this.N = false;
       this.O = new b(p.b, new l0(this), new m0(this), new i0(this));
       this.P = new LiveFloatingWindowManager$f(this);
       this.Q = new ConcurrentHashMap();
       this.R = new CopyOnWriteArraySet();
       this.S = new LiveFloatingWindowManager$g(this);
       this.T = new LiveFloatingWindowManager$h(this);
       this.U = new LiveFloatingWindowManager$i(this);
       this.V = new LiveFloatingWindowManager$j(this);
       this.W = new j0(this);
       this.Y = true;
       this.Z = true;
       this.a0 = new IntentFilter();
       this.b0 = new LiveFloatingWindowManager$7(this);
       this.c0 = new LiveFloatingWindowManager$k(this);
       c.a(new LiveFloatingWindowManager$e(this));
    }
    public static boolean m(){
       Object obj = PatchProxy.apply(null, null, LiveFloatingWindowManager.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableFloatingWindowBackToSlide", false);
    }
    public void A(int p0){
       LiveFloatingWindowManager liveFloating = LiveFloatingWindowManager.class;
       if (PatchProxy.isSupport(liveFloating) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveFloating, "5")) {
          return;
       }
       this.G = p0;
       LiveFloatingWindowManager tb = this.b;
       if (tb != null && i0.X(tb)) {
          this.b.setFloatingWindowStyle(this.G);
          tb = this.c;
          if (tb != null) {
             this.b.m(tb.getVideoWidth(), this.c.getVideoHeight());
          }
       }
       return;
    }
    public boolean B(LivePlayerController p0,e p1,LiveStreamFeedWrapper p2,LiveFloatingWindowManager$m p3,boolean p4,boolean p5,LiveFloatingWindowType p6,String p7){
       LiveFloatingWindowManager tb;
       LiveFloatingWindowManager liveFloating = LiveFloatingWindowManager.class;
       if (PatchProxy.isSupport(liveFloating)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4),Boolean.valueOf(p5),p6,p7};
          Object obj = PatchProxy.apply(objArray, this, liveFloating, "18");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p2 == null) {
          b.a(0x4b316083).f1("live_show_floating_window", "The liveStreamFeedWrapper is null when trying to show the floating window.", 3);
          return 0;
       }else if(!i9.a(a.a().a())){
          e.i0(0);
          return 0;
       }else {
          b uob = c.c("LVIE");
          if (uob.c()) {
             b.a(0x4b316083).f1("live_show_floating_window", "Ð¡´°±»À¹½Ø ["+uob.b()+"]  "+uob.a()+"  À¹½Ø!", 3);
             return 0;
          }else {
             this.s = false;
             this.v = false;
             this.C();
             this.m = p3;
             this.e = p7;
             this.k(p0, p1, p2);
             p0.setEnableAutoUpdateViewSize(p5);
             if (i9.a(a.B)) {
                tb = this.b;
                if (tb != null) {
                   tb.h(p4);
                   a.a().d(Boolean.TRUE);
                }
             }
             Activity uActivity = null;
             if (a.e()) {
                b.g.a().a(uActivity, this.c0);
             }else {
                this.v();
             }
             this.w();
             this.x();
             if (this.b != null) {
                tb.c = new c0(this);
             }
             y.h("ENTER", p2.mEntity, QCurrentUser.me().getId(), this.e, this.f());
             y.f(p2.getLiveStreamId(), p2.getUserId(), this.f());
             this.F.d();
             String liveStreamId = p2.getLiveStreamId();
             if (!PatchProxy.applyVoidOneRefs(liveStreamId, uActivity, e.class, "25")) {
                e.a().q(liveStreamId).subscribe();
             }
             this.u();
             if (!a.d().i(this)) {
                a.d().p(this);
             }
             this.z = f.a(l.class, new h0(this));
             this.A = f.a(a.class, new g0(this));
             tb = this.d;
             if (tb != null) {
                tb.h().x(0);
                this.d.h().F(this.E);
                this.d.b().d(p6);
             }
             this.X = RxBus.f.g(n.class, RxBus$ThreadMode.MAIN).subscribe(new f0(this));
             this.E = 0;
             return 1;
          }
       }
    }
    public final void C(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingWindowManager.class, "54")) {
          return;
       }
       boolean b = this.O.c();
       boolean b1 = this.O.b();
       b.Z(q.b, "bizToken="+this.g()+", isCountDowning="+b+", hasUploadedForCurrentWatchPeriod="+b1);
       if (!b && !b1) {
          this.O.d("showFloatingWindow");
       }
       return;
    }
    public final void D(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingWindowManager.class, "45")) {
          return;
       }
       k1.o(new k0(this));
       return;
    }
    public void E(d p0){
       this.r = p0;
    }
    public void F(int p0,int p1){
       this.p = p0;
       this.q = p1;
    }
    public void a(r0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingWindowManager.class, "14")) {
          return;
       }
       this.R.add(p0);
       return;
    }
    public void b(Activity p0,int p1){
       LiveFloatingWindowManager liveFloating = LiveFloatingWindowManager.class;
       if (PatchProxy.isSupport(liveFloating) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, liveFloating, "25")) {
          return;
       }
       if (p0 instanceof GifshowActivity) {
          LiveSlidePlayEnterParam$b uob = new LiveSlidePlayEnterParam$b();
          QPhoto[] qPhotoArray = new QPhoto[]{new QPhoto(this.x.mEntity)};
          uob.w(Arrays.asList(qPhotoArray));
          uob.v("/rest/n/live/feed/common/slide/more");
          uob.d(1);
          uob.n(47);
          uob.o(p1);
          LiveSlidePlayEnterParam liveSlidePla = uob.a();
          d.a(-1835681758).eO(p0, liveSlidePla, 1025);
          this.M = true;
       }else {
          LiveFloatingWindowManager tx = this.x;
          tx.setExpTag(d.c(tx.getExpTag()));
          LiveStreamFeedWrapper mEntity = this.x.mEntity;
          LiveFloatingWindowManager tI = this.I;
          LivePlayActivity livePlayActi = LivePlayActivity.class;
          if (!PatchProxy.isSupport(livePlayActi) || !PatchProxy.applyVoidTwoRefs(mEntity, Integer.valueOf(tI), null, livePlayActi, "3")) {
             if (mEntity.mConfig == null) {
                ExceptionHandler.handleCaughtException(new IllegalArgumentException(a.a.q(mEntity)));
             }else {
                LiveAudienceParam$a uoa = new LiveAudienceParam$a();
                uoa.j(mEntity);
                uoa.g(tI);
                LiveAudienceParam liveAudience = uoa.a();
                g.g();
                Intent intent = new Intent(a.a().a(), LivePlayActivity.y3());
                intent.putExtra(LiveAudienceParam.LIVE_AUDIENCE_PARAM_KEY, b.c(liveAudience));
                intent.setFlags(0x10000000);
                a.a().a().startActivity(intent);
             }
          }
       }
       return;
    }
    public void c(LiveFloatingWindowCloseType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingWindowManager.class, "32")) {
          return;
       }
       this.d(p0, true);
       return;
    }
    public void d(LiveFloatingWindowCloseType p0,boolean p1){
       b uob;
       LiveFloatingWindowManager x;
       LiveFloatingWindowManager x1;
       LiveSlidePlayEnterParam liveSlidePla = this;
       LiveFloatingWindowManager obj = p0;
       LiveFloatingWindowManager liveFloating = LiveFloatingWindowManager.class;
       if (PatchProxy.isSupport(liveFloating) && PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(p1), liveSlidePla, liveFloating, "33")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, liveSlidePla, liveFloating, "24")) {
          x1 = liveSlidePla.H;
          if (x1 != null && !TextUtils.isEmpty(x1.mSlidePlayId)) {
             b.Z(LiveLogTag.FLOATING_WINDOW, "destroySlidePlayFetcher");
             uob = b.e(liveSlidePla.H.mSlidePlayId);
             if (uob != null) {
                uob.d();
                liveSlidePla.H = objArray;
             }
          }
       }
       if (liveSlidePla.v != null) {
          return;
       }else {
          uob = c.b("LVIE");
          int i = 3;
          if (uob.c()) {
             b.a(0x4b316083).f1("live_show_floating_window", "Ð¡´°¹Ø±Õ±»À¹½Ø ["+uob.b()+"]  "+uob.a()+"  À¹½Ø!", i);
             return;
          }else if(obj == LiveFloatingWindowCloseType.BACK_TO_SAME_LIVE || PatchProxy.applyVoid(objArray, liveSlidePla, liveFloating, "53")){
             x1 = liveSlidePla.x;
             if (x1 != null) {
                r.a(x.e(x1.mEntity, 0), 0, r1.O0(liveSlidePla.x.mEntity));
             }
          }
          liveSlidePla.O.a("close");
          k1.m(liveSlidePla.V);
          k1.m(liveSlidePla.W);
          Iterator iterator = liveSlidePla.R.iterator();
          while (iterator.hasNext()) {
             iterator.next().c(obj);
          }
          String str = String.valueOf(p0.getUploadReason());
          liveSlidePla.z("close, reason: "+str);
          x = liveSlidePla.x;
          int i1 = 2;
          if (x != null && liveSlidePla.b != null) {
             LiveStreamFeedWrapper mEntity = x.mEntity;
             String id = QCurrentUser.me().getId();
             LiveFloatingWindowManager e = liveSlidePla.e;
             int i2 = this.f();
             y oy = y.class;
             if (PatchProxy.isSupport(oy)) {
                Object[] objArray1 = new Object[]{str,mEntity,id,e,Integer.valueOf(i2)};
                if (PatchProxy.applyVoid(objArray1, objArray, oy, "3")) {
                label_016d :
                   String liveStreamId = liveSlidePla.x.getLiveStreamId();
                   if (!PatchProxy.applyVoidOneRefs(liveStreamId, objArray, e.class, "26")) {
                      e.a().L(liveStreamId).subscribe();
                   }
                }
             }
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.name = str;
             uElementPack.action = 1578;
             i3 oi3 = i3.f();
             oi3.c("type", Integer.valueOf(i2));
             oi3.d("logParams", e);
             uElementPack.params = oi3.e();
             ClientEvent$UrlPackage urlPackage = y.d();
             ClientContent$LiveStreamPackage liveStreamPa = y.c(mEntity);
             urlPackage.params = y.a(liveStreamPa.liveStreamId, liveStreamPa.anchorUserId, id);
             u1.A(urlPackage, "", 1, uElementPack, y.b(liveStreamPa));
             goto label_016d ;
          }
       label_0189 :
          LiveFloatingWindowManager d = liveSlidePla.d;
          if (d != null) {
             i oi = d.h();
             x = liveSlidePla.b;
             if (x == null) {
                oi.k(0);
                oi.p(1);
             }else {
                oi.k((x.isShown() ^ 1));
                if (liveSlidePla.b.isShown()) {
                   i1 = 1;
                }
                oi.p(i1);
             }
             oi.G(p0.getUploadReason());
             liveSlidePla.z("livePlayBizEvent, upload reason: close floating window for "+str);
             if (liveSlidePla.K != null) {
                liveSlidePla.K = false;
                liveSlidePla.d.h().A(1);
             }
             liveSlidePla.d.v(0);
             oi.F(0);
             oi.x(1);
          }
          obj = liveSlidePla.c;
          if (obj != null) {
             obj.removeOnVideoSizeChangedListener(liveSlidePla.j);
             liveSlidePla.c.removeBufferListener(liveSlidePla.k);
             liveSlidePla.c.removeLivePlayerErrorListener(liveSlidePla.l);
          }
          obj = liveSlidePla.y;
          if (obj != null) {
             obj.dispose();
             liveSlidePla.y = objArray;
          }
          if (a.e()) {
             b.g.a().b(liveSlidePla.c0);
          }else {
             this.D();
          }
          if (!PatchProxy.applyVoid(objArray, liveSlidePla, liveFloating, "36") && liveSlidePla.w != null) {
             try{
                UniversalReceiver.f(a.a().a(), liveSlidePla.b0);
                liveSlidePla.w = false;
             }catch(java.lang.Exception e0){
                b.B(LiveLogTag.FLOATING_WINDOW, "unregisterScreenOffOnReceiver"+e0);
             }
          }
       }
    }
    public o e(){
       return this.D;
    }
    public int f(){
       LiveFloatingWindowManager obj = PatchProxy.apply(null, this, LiveFloatingWindowManager.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       if (obj != null && obj.c()) {
          return 2;
       }
       return 1;
    }
    public final String g(){
       Object obj = PatchProxy.apply(null, this, LiveFloatingWindowManager.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FloatingWindow-"+k0.a(this.x, s.a).orNull();
    }
    public LiveRestartReason h(){
       LiveRestartReason obj = PatchProxy.apply(null, this, LiveFloatingWindowManager.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (a.t().u("SOURCE_LIVE").d("enableRefreshUrlUseNewProviderV2", false))? LiveRestartReason.ANCHOR_FALL_BACK: LiveRestartReason.UPDATE_FULL_CONFIG;
       return obj;
    }
    public String i(){
       Object obj = PatchProxy.apply(null, this, LiveFloatingWindowManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d0.a(this.x);
    }
    public void j(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingWindowManager.class, "22")) {
          return;
       }
       if (a.h(p0)) {
          ServerException serverExcept = a.a(p0);
          ServerException errorCode = serverExcept.errorCode;
          if (errorCode == 601) {
             this.t();
             this.z("handleServerException onAnchorEndLive");
          }else if(errorCode == 607){
             this.c(LiveFloatingWindowCloseType.LIVE_END);
          }
          errorCode = serverExcept.errorCode;
          if (errorCode >= 600 && (errorCode != 608 && !TextUtils.isEmpty(serverExcept.errorMessage))) {
             i.d(R.style.arg_RES_7f110668, serverExcept.errorMessage);
          }
       }else if(p0 instanceof ChannelException || p0 instanceof ClientException){
          m.c(a.a().a(), p0);
       }
       Object[] objArray = new Object[0];
       a.C().u("live_push_server_exception", p0, objArray);
       return;
    }
    public final void k(LivePlayerController p0,e p1,LiveStreamFeedWrapper p2){
       LiveFloatingWindowManager tb;
       LiveFloatingWindowManager tc;
       LiveFloatingWindowManager liveFloating = LiveFloatingWindowManager.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveFloatingWindowManager.class, "20")) {
          return;
       }
       this.a.incrementAndGet();
       this.d = p1;
       this.x = p2;
       this.t = a.p(LiveConfigStartupResponse$LiveFloatingWindowConfig.class).mPollStatusIntervalMs;
       if (!PatchProxy.applyVoidOneRefs(p0, this, liveFloating, "21")) {
          tb = this.c;
          if (tb != null && p0 != tb) {
             tb.stopPlay();
          }
          p0.stopAudioOnlyMode();
          this.c = p0;
          e.c(p0);
          e0 uoe0 = new e0(this);
          this.l = uoe0;
          this.c.addLivePlayerErrorListener(uoe0);
          j oj = new j(this.x.mEntity, "");
          this.h = oj;
          oj.b(this.U);
          this.c.setLiveDataSourceFetcher(this.h.a());
          this.f = new b(this.c);
          this.g = new b(this.x.mEntity, this.c);
          tc = this.d;
          if (tc != null) {
             tc.h().q(2);
             this.d.h().p(1);
          }
       }
       if (this.i == null) {
          this.i = new LiveFloatingWindowManager$l(this);
          a.a().a().registerActivityLifecycleCallbacks(this.i);
       }
       this.j = new LiveFloatingWindowManager$a(this);
       this.k = new LiveFloatingWindowManager$b(this);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, liveFloating, "23")) {
          tb = this.b;
          if (tb == null) {
             LiveFloatingWindowView$c uoc = new LiveFloatingWindowView$c(a.a().a());
             uoc.b = this.c.getVideoWidth();
             uoc.c = this.c.getVideoHeight();
             uoc.d = this.p;
             uoc.e = this.q;
             uoc.h = this.m;
             uoc.i = this.n;
             uoc.j = this.E;
             uoc.k = this.G;
             LiveFloatingWindowManager tx = this.x;
             User user = (tx != null)? tx.getUser(): objArray;
             uoc.l = user;
             tx = this.r;
             if (tx != null) {
                uoc.f = tx.b;
                uoc.g = tx.c;
             }
             LiveFloatingWindowView liveFloating1 = PatchProxy.apply(objArray, uoc, LiveFloatingWindowView$c.class, "1");
             if (liveFloating1 != PatchProxyResult.class) {
             }else {
                liveFloating1 = new LiveFloatingWindowView(uoc);
             }
             this.b = liveFloating1;
          }else {
             tb.setLiveFloatingWindowPlayListener(this.m);
          }
          tc = this.c;
          if (tc != null) {
             tc.setTextureView(this.b.b, false);
             this.c.addOnVideoSizeChangedListener(this.j);
             this.c.addBufferListener(this.k);
          }
       }
       return;
    }
    public boolean l(){
       LiveFloatingWindowManager obj = PatchProxy.apply(null, this, LiveFloatingWindowManager.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       boolean b = (obj != null)? obj.c(): false;
       return b;
    }
    public boolean n(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveFloatingWindowManager obj = PatchProxy.apply(objArray, this, LiveFloatingWindowManager.class, "9");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.b;
       boolean b = true;
       if (obj != null) {
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, LiveFloatingWindowView.class, "28");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(obj.r != null && obj.getVisibility() == 8){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
          label_0041 :
             return b;
          }
       }
       b = false;
       goto label_0041 ;
    }
    public Boolean o(){
       Object obj = PatchProxy.apply(null, this, LiveFloatingWindowManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a().a();
    }
    public void onEventMainThread(f p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingWindowManager.class, "7")) {
          return;
       }
       b.Z(LiveLogTag.FLOATING_WINDOW, "OnAppBackgroundEvent");
       b = true;
       this.L = b;
       LiveFloatingWindowManager td = this.d;
       if (td != null) {
          i oi = td.h();
          oi.p(b);
          oi.G(3);
          this.d.v(false);
          this.d.h().i();
       }
       return;
    }
    public void onEventMainThread(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingWindowManager.class, "6")) {
          return;
       }
       b.Z(LiveLogTag.FLOATING_WINDOW, "OnForegroundEvent");
       this.L = false;
       if (this.B != null) {
          this.B = false;
          if (!i9.a(a.a().a())) {
             this.c(LiveFloatingWindowCloseType.NO_FLOAT_WINDOW_PERMISSION);
          }
       }
       if (this.J == null && (!this.l() && this.d != null)) {
          int i = (x.u())? 3: 1;
          i oi = this.d.h();
          oi.p(i);
          oi.A((x.u() ^ 1));
          oi.G(4);
          this.d.v(false);
       }
    label_0060 :
       this.J = false;
       return;
    }
    public boolean p(LivePlayerController p0,LiveStreamFeedWrapper p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveFloatingWindowManager.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.s == null && (this.v != null || (this.x != null && this.c != null))) {
          if (!TextUtils.equals(p1.getLiveStreamId(), this.x.getLiveStreamId())) {
             return b;
          }else if(p0 == this.c){
             b = true;
          }
       }
       return b;
    }
    public boolean q(LivePlayerController p0){
       boolean b = (this.c == p0)? true: false;
       return b;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingWindowManager.class, "42")) {
          return;
       }
       if (this.c == null) {
          this.D();
          return;
       }else {
          b.Z(LiveLogTag.FLOATING_WINDOW, "releasePlayerResource due to a phone call");
          this.c.stopPlay();
          return;
       }
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingWindowManager.class, "43")) {
          return;
       }
       if (this.c == null) {
          this.D();
          return;
       }else {
          b.Z(LiveLogTag.FLOATING_WINDOW, "restartPlay on hang up a phone call");
          this.c.restartPlay(this.h());
          return;
       }
    }
    public void t(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingWindowManager.class, "40")) {
          return;
       }
       if (this.Y == null) {
          LiveFloatingWindowManager td = this.d;
          if (td != null) {
             l ol = td.n();
             String str = (this.Z != null)? "BRIGHT_VIEW": "DARK_VIEW";
             ol.i(str);
             ol.h(8);
             this.d.z();
          }
       }
       this.s = true;
       this.c(LiveFloatingWindowCloseType.LIVE_END);
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingWindowManager.class, "38")) {
          return;
       }
       if (a.a()) {
          b.Z(LiveLogTag.FLOATING_WINDOW, "enableQueryLiveStatusOnBufferStart, return");
          return;
       }else {
          k1.m(this.S);
          if (this.x == null) {
             return;
          }
          LiveFloatingWindowManager tt = this.t;
          if (tt - null > 0) {
             k1.r(this.S, tt);
          }
          e.c(this.x.getLiveStreamId(), new LiveFloatingWindowManager$d(this));
          return;
       }
    }
    public final void v(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingWindowManager.class, "41")) {
          return;
       }
       if (this.C == null) {
          LivePlayPhoneCallStateManager livePlayPhon = new LivePlayPhoneCallStateManager(a.a().a());
          this.C = livePlayPhon;
          livePlayPhon.c(new a0(this));
          this.C.d(new b0(this));
          this.C.b();
       }
       return;
    }
    public final void w(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingWindowManager.class, "29")) {
          return;
       }
       if (this.y == null) {
          this.y = HeadsetPlugMonitor.b(a.a().a()).switchMap(new e(new d0(this))).doOnNext(new LiveFloatingWindowManager$c(this)).subscribe();
       }
       return;
    }
    public final void x(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingWindowManager.class, "35")) {
          return;
       }
       if (this.w == null) {
          this.a0.addAction("android.intent.action.SCREEN_ON");
          this.a0.addAction("android.intent.action.SCREEN_OFF");
          LiveFloatingWindowManager ta0 = this.a0;
          String str = "android.intent.action.USER_PRESENT";
          try{
             ta0.addAction(str);
             UniversalReceiver.e(a.a().a(), this.b0, this.a0);
             this.w = true;
          }catch(java.lang.Exception e0){
             b.B(LiveLogTag.FLOATING_WINDOW, "registerScreenOffOnReceiver"+e0);
          }
       }
    }
    public void y(){
       LiveFloatingWindowManager td;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveFloatingWindowManager.class, "31")) {
          return;
       }
       if (this.v == null && i9.a(a.a().a())) {
          this.z("resume");
          if (this.b != null) {
             this.C();
             this.w();
             boolean b = false;
             if (!this.b.isShown()) {
                this.z("livePlayBizEvent, upload reason: resume");
                td = this.d;
                if (td != null) {
                   i oi = td.h();
                   oi.p(1);
                   oi.G(8);
                   oi.k((1 ^ this.b.isShown()));
                   this.d.v(b);
                }
             }
             td = this.b;
             Objects.requireNonNull(td);
             if (!PatchProxy.applyVoid(objArray, td, LiveFloatingWindowView.class, "26")) {
                td.q = b;
                if (td.r != null) {
                   td.setVisibility(b);
                }else {
                   td.h(td.x);
                }
             }
             a.a().d(Boolean.TRUE);
             td = this.x;
             if (td != null) {
                y.h("RESUME", td.mEntity, QCurrentUser.me().getId(), this.e, this.f());
             }
             td = this.c;
             if (td != null) {
                if (td.isStop()) {
                   this.c.startPlay();
                }
                this.c.unMute();
             }
          }
          this.u();
       }
       return;
    }
    public void z(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingWindowManager.class, "50")) {
          return;
       }
       LiveFloatingWindowManager tx = this.x;
       String str = (tx == null)? "mLiveStreamFeedWrapper is null": tx.getLiveStreamId();
       b.Z(LiveLogTag.FLOATING_WINDOW, p0+", "+str);
       return;
    }
}
