package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer;
import java.lang.String;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$j;
import sw2.a;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$a;
import yc6.b;
import qc6.k;
import sw2.b;
import wc6.d;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.builder.PlayerCommonBuildData;
import wc6.b;
import com.kwai.framework.player.multisource.PlaySourceSwitcher;
import com.kwai.framework.player.multisource.b;
import com.kwai.framework.player.multisource.d;
import java.util.List;
import qc6.b$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import com.yxcorp.gifshow.model.CDNUrl;
import qc6.b;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import java.lang.Float;
import com.kwai.framework.player.core.b;
import msd.l;
import com.kwai.framework.player.multisource.PlaySourceSwitcher$a;
import elb.e;
import java.util.Objects;
import c0d.d;
import msd.p;
import java.lang.Boolean;
import java.lang.Number;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.graphics.Point;
import com.kwai.video.player.IMediaPlayer;
import yw2.k;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder$Callback;
import android.view.Surface;
import com.kwai.video.player.KsMediaPlayer$OnAudioProcessPCMListener;
import ht.c;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import jw4.a;
import i91.m;
import kt.c;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$g;
import lt.b;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$h;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$i;
import java.lang.Runnable;
import ekd.k1;
import java.lang.System;
import android.os.SystemClock;
import k2b.i3;
import java.lang.Double;
import nc6.d;
import sw2.d;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoStatEvent;
import java.lang.Long;
import com.yxcorp.utility.TextUtils;
import java.lang.Math;
import nc6.b;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import k2b.u1;
import crd.b;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$b;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$c;
import com.kwai.framework.player.multisource.e;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$playerAddCallback$3;
import yw2.r;
import com.kwai.framework.player.core.b$b;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$d;
import com.kwai.video.player.IMediaPlayer$OnSeekCompleteListener;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$e;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$f;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import pc6.a;
import ec6.g;
import java.util.concurrent.TimeUnit;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import yw2.p;
import yw2.q;
import erd.g;
import nc6.a;
import ci7.a;

public final class VodTheaterPlayer implements TheaterPlayer	// class@0019d2
{
    public final String a;
    public final d b;
    public String c;
    public c d;
    public SurfaceHolder e;
    public final b f;
    public boolean g;
    public final SurfaceHolder$Callback h;
    public l i;
    public l j;
    public p k;
    public final a l;
    public b m;
    public boolean n;
    public long o;

    public void VodTheaterPlayer(String p0,KwaiManifest p1,String p2){
       a.p(p0, "photoId");
       a.p(p1, "hlsManifest");
       a.p(p2, "signId");
       super();
       this.h = new VodTheaterPlayer$j(this);
       this.l = new a();
       this.o = -1;
       this.a = p0;
       this.c = p2;
       this.f = new b();
       d uod = new d("VoicePartyTheaterHls");
       uod.setBizFt(":ks-features:ft-live:live");
       uod.setStartPlayType(1);
       this.b = this.u(new b(p1, new VodTheaterPlayer$a(p1)), new b(uod));
       this.t();
    }
    public void VodTheaterPlayer(String p0,List p1,String p2){
       a.p(p0, "photoId");
       a.p(p1, "urls");
       a.p(p2, "signId");
       super();
       this.h = new VodTheaterPlayer$j(this);
       this.l = new a();
       this.o = -1;
       this.a = p0;
       this.c = p2;
       b$b uob = new b$b();
       p2 = PatchProxy.applyOneRefs(p1, uob, b$b.class, "1");
       if (p2 != PatchProxyResult.class) {
          uob = p2;
       }else {
          CDNUrl[] uCDNUrlArray = new CDNUrl[p1.size()];
          uob.d(p1.toArray(uCDNUrlArray));
       }
       uob.b(p1.get(0));
       uob.c(true);
       b uob1 = uob.a();
       this.f = new b();
       d uod = new d("VoicePartyTheaterHls");
       uod.setStartPlayType(true);
       uod.setBizFt(":ks-features:ft-live:live");
       a.o(uob1, "playSourceSwitcher");
       this.b = this.u(uob1, new b(uod));
       this.t();
       return;
    }
    public IKwaiMediaPlayer a(){
       Object obj = PatchProxy.apply(null, this, VodTheaterPlayer.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s();
    }
    public void b(LiveQualityItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VodTheaterPlayer.class, "17")) {
          return;
       }
       a.p(p0, "qualityItem");
       return;
    }
    public void c(float p0){
       VodTheaterPlayer vodTheaterPl = VodTheaterPlayer.class;
       if (PatchProxy.isSupport(vodTheaterPl) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, vodTheaterPl, "16")) {
          return;
       }
       this.b.setVolume(p0, p0);
       return;
    }
    public void d(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VodTheaterPlayer.class, "18")) {
          return;
       }
       a.p(p0, "listener");
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, VodTheaterPlayer.class, "19")) {
          return;
       }
       PlaySourceSwitcher$a currentPlayS = this.b.getCurrentPlaySource();
       if (currentPlayS != null && currentPlayS.a() != null) {
          e uoe = currentPlayS.a();
          VodTheaterPlayer tl = this.l;
          a.m(uoe);
          uoe = uoe.c;
          Objects.requireNonNull(tl);
          if (uoe != null) {
             tl.f = uoe.b;
             tl.g = uoe.c;
             tl.h = uoe.e;
          }
          e uoe1 = currentPlayS.a();
          a.m(uoe1);
          this.l.d = uoe1.b;
       }
       this.l.e = this.a;
       if (this.b.isPrepared()) {
          this.b.start();
       }else {
          this.n = true;
       }
       return;
    }
    public void f(p p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VodTheaterPlayer.class, "33")) {
          return;
       }
       a.p(p0, "listener");
       this.k = p0;
       return;
    }
    public boolean g(){
       Object obj = PatchProxy.apply(null, this, VodTheaterPlayer.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.isPaused();
    }
    public long getCurrentPosition(){
       Object obj = PatchProxy.apply(null, this, VodTheaterPlayer.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.b.getCurrentPosition();
    }
    public long getDuration(){
       Object obj = PatchProxy.apply(null, this, VodTheaterPlayer.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.b.getDuration();
    }
    public List getQualityList(){
       Object obj = PatchProxy.apply(null, this, VodTheaterPlayer.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CollectionsKt__CollectionsKt.E();
    }
    public Point getVideoSize(){
       Object obj = PatchProxy.apply(null, this, VodTheaterPlayer.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       IKwaiMediaPlayer iKwaiMediaPl = this.s();
       int i = 0;
       int videoWidth = (iKwaiMediaPl != null)? iKwaiMediaPl.getVideoWidth(): 0;
       IKwaiMediaPlayer iKwaiMediaPl1 = this.s();
       if (iKwaiMediaPl1 != null) {
          i = iKwaiMediaPl1.getVideoHeight();
       }
       return new Point(videoWidth, i);
    }
    public void h(k p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VodTheaterPlayer.class, "24")) {
          return;
       }
       Surface surface = null;
       SurfaceHolder surfaceHolde = (p0 != null)? p0.b(): surface;
       VodTheaterPlayer te = this.e;
       if (te != null) {
          te.removeCallback(this.h);
       }
       this.w(surface);
       if (surfaceHolde != null) {
          surface = surfaceHolde.getSurface();
          if (surface != null) {
             this.w(surface);
          }
       }
       this.e = surfaceHolde;
       if (surfaceHolde != null) {
          surfaceHolde.addCallback(this.h);
       }
       if (surfaceHolde != null) {
          surfaceHolde.setKeepScreenOn(true);
       }
       return;
    }
    public boolean i(){
       Object obj = PatchProxy.apply(null, this, VodTheaterPlayer.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.isPlaying();
    }
    public void j(boolean p0){
    }
    public void k(long p0){
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, VodTheaterPlayer.class, "30")) {
          return;
       }
       IKwaiMediaPlayer iKwaiMediaPl = this.s();
       if (iKwaiMediaPl != null) {
          iKwaiMediaPl.setPlayerMute(false);
          iKwaiMediaPl.setOnAudioProcessPCMAvailableListener(null);
       }
       return;
    }
    public void m(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VodTheaterPlayer.class, "32")) {
          return;
       }
       a.p(p0, "listener");
       this.j = p0;
       return;
    }
    public void n(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VodTheaterPlayer.class, "31")) {
          return;
       }
       a.p(p0, "listener");
       this.i = p0;
       return;
    }
    public LiveQualityItem o(){
       return null;
    }
    public c p(String p0){
       boolean b;
       IKwaiMediaPlayer obj = PatchProxy.applyOneRefs(p0, this, VodTheaterPlayer.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "signId");
       obj = this.s();
       if (obj == null) {
          b.Z(LiveVoicePartyLogTag.THEATER, " redirectAudioToArya but media player is null  ");
          return null;
       }else if(this.d == null){
          this.d = m.a(p0).d(c.d(), new VodTheaterPlayer$g(this));
       }
       obj.setOnAudioProcessPCMAvailableListener(new VodTheaterPlayer$h(this));
       b = true;
       obj.setPlayerMute(b);
       VodTheaterPlayer td = this.d;
       if (td != null) {
          td.c(0.20f);
       }
       this.g = b;
       b.c0(LiveVoicePartyLogTag.THEATER, " start play ", "instance ", this.d);
       VodTheaterPlayer td1 = this.d;
       if (td1 != null) {
          td1.startPlay();
       }
       return this.d;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, VodTheaterPlayer.class, "22")) {
          return;
       }
       if (!this.g()) {
          this.b.pause();
          this.l.a(2);
          this.n = false;
       }
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, VodTheaterPlayer.class, "29")) {
          return;
       }
       k1.o(new VodTheaterPlayer$i(this));
       return;
    }
    public boolean r(){
       return false;
    }
    public void release(){
       String str;
       a obj;
       ClientStat$StatPackage statPackage;
       double d;
       if (PatchProxy.applyVoid(null, this, VodTheaterPlayer.class, "27")) {
          return;
       }
       VodTheaterPlayer tl = this.l;
       long l = 0;
       if (tl.o - l > 0) {
          Objects.requireNonNull(tl);
          if (!PatchProxy.applyVoid(null, tl, a.class, "5")) {
             tl.p = System.currentTimeMillis();
             long l1 = SystemClock.elapsedRealtime();
             tl.n.h(l1);
             tl.l.h(l1);
             tl.m.h(l1);
             tl.k.h(l1);
          }
          this.l.i = this.b.getVodStatJson();
          this.l.j = this.b.getBriefVodStatJson();
          IKwaiMediaPlayer iKwaiMediaPl = this.s();
          if (iKwaiMediaPl != null) {
             VodTheaterPlayer tl1 = this.l;
             float averageDispl = iKwaiMediaPl.getAverageDisplayFps();
             Objects.requireNonNull(tl1);
             if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(averageDispl), tl1, a.class, "12")) {
                d = (double)averageDispl;
                if (!Double.isNaN(d) && !Double.isInfinite(d)) {
                   tl1.u = averageDispl;
                }
             }
             this.b.x().f();
             tl = this.l;
             d uod = d.class;
             if (!PatchProxy.applyVoidOneRefs(tl, null, uod, "2")) {
                ClientStat$VideoStatEvent videoStatEve = new ClientStat$VideoStatEvent();
                videoStatEve.sessionUuid = tl.c;
                a e = tl.e;
                Long longx = PatchProxy.applyOneRefs(e, null, uod, "1");
                if (longx != PatchProxyResult.class) {
                }else {
                   try{
                      longx = Long.valueOf(Long.parseLong(e));
                   }catch(java.lang.NumberFormatException e0){
                      longx = null;
                   }
                }
             }
          }
       }
    label_015d :
       this.n = false;
       this.h(null);
       this.l();
       tl = this.m;
       if (tl != null) {
          tl.dispose();
       }
       this.b.release();
       this.v(true, "release");
       return;
    }
    public void resume(){
       if (PatchProxy.applyVoid(null, this, VodTheaterPlayer.class, "23")) {
          return;
       }
       if (this.g()) {
          this.b.start();
          this.l.c(2);
       }
       return;
    }
    public final IKwaiMediaPlayer s(){
       Object obj = PatchProxy.apply(null, this, VodTheaterPlayer.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getIKwaiMediaPlayer();
    }
    public void seekTo(long p0){
       VodTheaterPlayer vodTheaterPl = VodTheaterPlayer.class;
       if (PatchProxy.isSupport(vodTheaterPl) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, vodTheaterPl, "20")) {
          return;
       }
       if (this.b.isPrepared()) {
          this.b.seekTo(p0);
       }else {
          this.o = p0;
       }
       return;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, VodTheaterPlayer.class, "26")) {
          return;
       }
       this.b.stop();
       this.n = false;
       return;
    }
    public final void t(){
       if (PatchProxy.applyVoid(null, this, VodTheaterPlayer.class, "3")) {
          return;
       }
       this.b.addOnErrorListener(VodTheaterPlayer$b.b);
       this.b.d(new VodTheaterPlayer$c(this));
       this.b.w(new r(new VodTheaterPlayer$playerAddCallback$3(this)));
       this.b.addOnSeekCompleteListener(new VodTheaterPlayer$d(this));
       this.b.addOnInfoListener(new VodTheaterPlayer$e(this));
       this.b.addOnVideoSizeChangedListener(new VodTheaterPlayer$f(this));
       return;
    }
    public final d u(PlaySourceSwitcher p0,b p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       VodTheaterPlayer vodTheaterPl = VodTheaterPlayer.class;
       d obj = PatchProxy.applyTwoRefs(p0, p1, this, vodTheaterPl, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p1, this, vodTheaterPl, "2");
       if (obj != patchProxyRe) {
       }else {
          a uoa = new a();
          uoa.c(p1);
          uoa.b(this.f);
          obj = uoa.a();
          obj.setScreenOnWhilePlaying(true);
          obj.enableMediacodecDummy(true);
          this.m = t.interval(100, TimeUnit.MILLISECONDS).observeOn(a.c()).subscribe(new p(this, obj), q.b);
          a.o(obj, "player");
       }
       obj.l(p0, 0);
       obj.prepareAsync();
       if (!PatchProxy.applyVoidOneRefs(obj, this, vodTheaterPl, "5")) {
          p0.c = a.a();
          VodTheaterPlayer tl = this.l;
          Objects.requireNonNull(tl);
          if (!PatchProxy.applyVoid(null, tl, a.class, "1")) {
             tl.k = new i3();
             tl.l = new i3();
             tl.m = new i3();
             tl.n = new i3();
             tl.o = 0;
             tl.p = 0;
             tl.b = 0;
             tl.q = 0;
             tl.u = 0;
             tl.r = null;
             tl.d = null;
             tl.s = 0;
             tl.t = 0;
             tl.i = null;
             tl.j = null;
          }
          tl = this.l;
          Objects.requireNonNull(tl);
          if (!PatchProxy.applyVoid(null, tl, a.class, "4")) {
             tl.o = System.currentTimeMillis();
          }
          tl = this.l;
          Objects.requireNonNull(tl);
          if (!PatchProxy.applyVoid(null, tl, a.class, "11") && !tl.t) {
             tl.t = SystemClock.elapsedRealtime();
          }
          tl = this.l;
          Objects.requireNonNull(tl);
          if (!PatchProxy.applyVoidOneRefs(obj, tl, a.class, "7")) {
             IKwaiMediaPlayer iKwaiMediaPl = obj.getIKwaiMediaPlayer();
             if (iKwaiMediaPl == null) {
                tl.r = null;
             }else {
                tl.r = iKwaiMediaPl.getKwaiSign();
             }
          }
       }
       obj.x().g(this.l.c);
       return obj;
    }
    public final void v(boolean p0,String p1){
       VodTheaterPlayer vodTheaterPl = VodTheaterPlayer.class;
       if (PatchProxy.isSupport(vodTheaterPl) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, vodTheaterPl, "34")) {
          return;
       }
       vodTheaterPl = this.d;
       if (vodTheaterPl != null) {
          if (p0) {
             vodTheaterPl.stopPlay();
          }
          vodTheaterPl.release();
          b.d0(LiveVoicePartyLogTag.THEATER, " release audio player ", "releaseReason ", p1, "instance ", this.d);
          this.d = null;
       }
       return;
    }
    public final void w(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VodTheaterPlayer.class, "25")) {
          return;
       }
       this.b.setSurface(p0);
       return;
    }
}
