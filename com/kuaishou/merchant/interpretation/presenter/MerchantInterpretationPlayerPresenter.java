package com.kuaishou.merchant.interpretation.presenter.MerchantInterpretationPlayerPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.interpretation.presenter.d;
import com.kuaishou.merchant.interpretation.presenter.MerchantInterpretationPlayerPresenter$a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import h04.c;
import q87.c;
import android.view.ViewGroup;
import com.kwai.framework.player.core.b;
import ot3.y;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.Math;
import i04.a;
import java.lang.System;
import android.os.SystemClock;
import com.kuaishou.merchant.interpretation.model.MerchantInterpretationInfo;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.krn.event.a;
import oj0.a;
import nc6.a;
import h04.a;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoStatEvent;
import java.lang.Number;
import nc6.b;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import com.kuaishou.merchant.interpretation.MerchantInterpretationPlayerFragment;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import wkd.b;
import com.yxcorp.gifshow.log.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import ekd.k1;
import com.kwai.video.player.IKwaiMediaPlayer;
import java.lang.Float;
import java.lang.Double;
import ekd.y0;
import m04.t;
import java.lang.Runnable;
import com.kuaishou.merchant.interpretation.presenter.MerchantInterpretationPlayerPresenter$VideoLifecycleObserver;
import java.lang.ref.WeakReference;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.util.t0;
import com.kuaishou.merchant.interpretation.presenter.MerchantInterpretationPlayerPresenter$b;
import com.yxcorp.gifshow.util.t0$a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.CDNUrl;
import wc6.d;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.util.CacheKeyUtil;
import com.kwai.framework.player.core.c;
import nc6.d;
import com.kuaishou.merchant.api.core.model.Commodity;
import ci7.a;
import com.kuaishou.merchant.interpretation.presenter.f;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kuaishou.merchant.interpretation.presenter.g;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kuaishou.merchant.interpretation.presenter.e;
import com.kwai.framework.player.core.b$b;
import m04.q;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kuaishou.merchant.interpretation.presenter.MerchantInterpretationPlayerPresenter$d;
import com.kwai.video.player.IMediaPlayer$OnSeekCompleteListener;
import j04.a;
import gc6.b;
import android.view.Surface;
import java.lang.Exception;
import java.util.Locale;
import android.view.TextureView;
import android.view.TextureView$SurfaceTextureListener;
import com.kuaishou.merchant.interpretation.presenter.MerchantInterpretationPlayerPresenter$c;
import android.widget.SeekBar$OnSeekBarChangeListener;
import k2b.i3;
import com.yxcorp.utility.SystemUtil;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.FrameLayout;
import com.kwai.library.widget.surface.SafeTextureView;
import com.kuaishou.merchant.basic.MerchantLottieAnimationView;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import com.kuaishou.merchant.interpretation.presenter.c;
import android.view.View$OnClickListener;
import m04.p;

public class MerchantInterpretationPlayerPresenter extends PresenterV2	// class@001851
{
    public MerchantInterpretationPlayerFragment A;
    public List B;
    public final a C;
    public b D;
    public Surface E;
    public y0 F;
    public y G;
    public t0 H;
    public DefaultLifecycleObserver I;
    public String J;
    public int K;
    public long L;
    public boolean M;
    public a N;
    public String O;
    public a P;
    public TextureView$SurfaceTextureListener Q;
    public String p;
    public KwaiImageView q;
    public FrameLayout r;
    public SafeTextureView s;
    public ImageView t;
    public SeekBar u;
    public TextView v;
    public TextView w;
    public ViewGroup x;
    public MerchantLottieAnimationView y;
    public MerchantInterpretationInfo z;

    public void MerchantInterpretationPlayerPresenter(){
       super();
       this.C = new d(this);
       this.K = -1;
       this.L = 0;
       this.M = false;
       this.Q = new MerchantInterpretationPlayerPresenter$a(this);
    }
    public static void P8(MerchantInterpretationPlayerPresenter p0){
       Object[] objArray1;
       boolean b;
       Objects.requireNonNull(p0);
       MerchantInterpretationPlayerPresenter merchantInte = MerchantInterpretationPlayerPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, p0, merchantInte, "20")) {
       }else {
          String str = "MerchantInterpretationPlayerPresenter";
          if (p0.A.isDetached()) {
             objArray1 = new Object[0];
             c.C().A(str, "fragment is detached", objArray1);
          }else if(p0.D == null){
             objArray1 = new Object[0];
             c.C().A(str, "videoPlayer is null", objArray1);
          }else {
             MerchantInterpretationPlayerPresenter x = p0.x;
             int i = (p0.Y8())? 0: 8;
             x.setVisibility(i);
             if (p0.D.isVideoRenderingStart() || p0.Y8()) {
                x = p0.G;
                if (x != null) {
                   x.a();
                }
             }
             if (p0.D.isVideoRenderingStart()) {
                p0.q.setVisibility(8);
             }
             p0.u.setClickable(p0.D.isPrepared());
             p0.u.setEnabled(p0.D.isPrepared());
             p0.u.setFocusable(p0.D.isPrepared());
             p0.t.setSelected(p0.D.isPlaying());
             if (!p0.D.isPlaying()) {
                if (p0.Z8()) {
                   p0.j9();
                }
             }else if(!p0.Z8() && p0.D.isVideoRenderingStart()){
                p0.e9();
             }
             Object obj = PatchProxy.apply(objArray, p0, merchantInte, "22");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(p0.D.b() == 6){
                b = true;
             }else {
                b = false;
             }
             if (b) {
                p0.u.setProgress(0);
                long l = 0;
                p0.v.setText(TextUtils.K(l));
                p0.D.seekTo(l);
             }
             if (p0.D.isPrepared()) {
                p0.w.setText(TextUtils.K(Math.max(p0.D.getDuration(), 1000)));
             }
          }
       }
       return;
    }
    public void E8(){
       MerchantInterpretationPlayerPresenter merchantInte = MerchantInterpretationPlayerPresenter.class;
       Object[] objArray = null;
       String str = "4";
       if (PatchProxy.applyVoid(objArray, this, merchantInte, str)) {
          return;
       }
       MerchantInterpretationPlayerPresenter tP = this.P;
       Objects.requireNonNull(tP);
       if (!PatchProxy.applyVoid(objArray, tP, a.class, str)) {
          tP.k = System.currentTimeMillis();
       }
       MerchantInterpretationPlayerPresenter tP1 = this.P;
       Objects.requireNonNull(tP1);
       if (!PatchProxy.applyVoid(objArray, tP1, a.class, "10") && !tP1.p) {
          tP1.p = SystemClock.elapsedRealtime();
       }
       if (this.z.photoUrls.size() <= 0) {
          return;
       }else if(PatchProxy.applyVoid(objArray, this, merchantInte, "11") || q.f(this.z.coverUrls)){
          this.q.setVisibility(0);
          this.q.P(this.z.coverUrls);
       }
       this.X8();
       this.V8();
       a.b().a(this.p, this.C);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, MerchantInterpretationPlayerPresenter.class, "3")) {
          return;
       }
       this.O = a.a();
       a uoa = new a();
       this.P = uoa;
       uoa.c = this.O;
       return;
    }
    public void H8(){
       long l;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MerchantInterpretationPlayerPresenter.class, "13")) {
          return;
       }
       MerchantInterpretationPlayerPresenter tP = this.P;
       MerchantInterpretationPlayerPresenter tA = this.A;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoidTwoRefs(tP, tA, objArray, a.class, "3")) {
          ClientStat$VideoStatEvent videoStatEve = new ClientStat$VideoStatEvent();
          videoStatEve.sessionUuid = tP.c;
          videoStatEve.duration = tP.b;
          int i = 1;
          videoStatEve.playVideoType = i;
          videoStatEve.playedDuration = tP.b(3);
          videoStatEve.bufferDuration = tP.b(i);
          videoStatEve.calculateManualPauseDuration = tP.b(2);
          String str = PatchProxy.apply(objArray, tP, a.class, "6");
          if (str != patchProxyRe) {
          }else {
             str = TextUtils.I(tP.n);
          }
          videoStatEve.kwaiSignature = str;
          videoStatEve.averageFps = (double)tP.q;
          videoStatEve.playUrl = tP.d;
          videoStatEve.beginPlayTime = tP.p;
          ClientEvent$ExpTagTransList obj = PatchProxy.apply(objArray, tP, a.class, "9");
          if (obj != patchProxyRe) {
             l = obj.longValue();
          }else {
             a o = tP.o;
             if (o) {
                a p = tP.p;
                if (p) {
                   l = Math.max((o - p), 0);
                }
             }
             l = 0;
          }
          videoStatEve.clickToFirstFrameDuration = l;
          videoStatEve.stalledCount = tP.m;
          videoStatEve.leaveTime = tP.l;
          videoStatEve.enterTime = tP.k;
          videoStatEve.videoQosJson = (b.a())? TextUtils.I(tP.e): TextUtils.I(tP.f);
          ClientEvent$UrlPackage urlPackage = u1.r(tA);
          if (urlPackage == null) {
             urlPackage = new ClientEvent$UrlPackage();
             urlPackage.page2 = tA.o();
             urlPackage.category = tA.M();
             urlPackage.params = tA.getPageParams();
          }
          if (tA.I1() == null) {
             urlPackage.expTagList = b.a(0xe0ff4fb).I1();
          }else {
             obj = new ClientEvent$ExpTagTransList();
             ClientEvent$ExpTagTrans[] uExpTagTrans = new ClientEvent$ExpTagTrans[i];
             obj.expTagTrans = uExpTagTrans;
             uExpTagTrans[0] = tA.I1();
             urlPackage.expTagList = obj;
          }
          videoStatEve.urlPackage = urlPackage;
          ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
          statPackage.videoStatEvent = videoStatEve;
          u1.j0(statPackage);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MerchantInterpretationPlayerPresenter.class, "5")) {
          return;
       }
       this.S8();
       this.a9();
       this.R8();
       a.b().c(this.p, this.C);
       k1.n(this);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, MerchantInterpretationPlayerPresenter.class, "19")) {
          return;
       }
       this.L = 0;
       this.M = false;
       this.u.setClickable(false);
       this.u.setEnabled(false);
       this.u.setFocusable(false);
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, MerchantInterpretationPlayerPresenter.class, "17")) {
          return;
       }
       MerchantInterpretationPlayerPresenter tD = this.D;
       if (tD != null) {
          MerchantInterpretationPlayerPresenter tP = this.P;
          float f = (tD.getIKwaiMediaPlayer() == null)? 0: this.D.getIKwaiMediaPlayer().getAverageDisplayFps();
          Objects.requireNonNull(tP);
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), tP, a.class, "11")) {
             double d = (double)f;
             if (!Double.isNaN(d) && !Double.isInfinite(d)) {
                tP.q = f;
             }
          }
       }
    label_004d :
       return;
    }
    public final void V8(){
       MerchantInterpretationPlayerPresenter merchantInte = MerchantInterpretationPlayerPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, merchantInte, "8")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, merchantInte, "9")) {
          this.F = new y0(50, new t(this));
       }
       if (this.G == null) {
          this.G = new y(this.A);
       }
       this.G.b();
       if (this.I == null) {
          this.I = new MerchantInterpretationPlayerPresenter$VideoLifecycleObserver(new WeakReference(this));
       }
       this.getActivity().getLifecycle().addObserver(this.I);
       this.W8();
       t0 ot0 = new t0();
       this.H = ot0;
       ot0.d(new MerchantInterpretationPlayerPresenter$b(this));
       Object[] objArray1 = new Object[0];
       c.C().w("MerchantInterpretationPlayerPresenter", "requestAudioFocus  success ? "+this.H.c(), objArray1);
       return;
    }
    public final void W8(){
       MerchantInterpretationPlayerPresenter tD;
       int i1;
       CDNUrl uCDNUrl;
       MerchantInterpretationPlayerPresenter merchantInte = MerchantInterpretationPlayerPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, merchantInte, "12")) {
          return;
       }
       merchantInte = PatchProxy.apply(objArray, this, merchantInte, "14");
       boolean b = false;
       int i = 1;
       if (merchantInte != PatchProxyResult.class) {
       }else if(q.f(this.B)){
          i1 = (this.K + i) % this.z.photoUrls.size();
          this.K = i1;
          uCDNUrl = this.z.photoUrls.get(i1);
       }else {
          i1 = (this.K + i) % this.B.size();
          this.K = i1;
          uCDNUrl = this.B.get(i1);
       }
       if (uCDNUrl != null) {
          this.J = uCDNUrl.mUrl;
       }
       this.P.d = this.J;
       Object[] objArray3 = new Object[b];
       c.C().w("MerchantInterpretationPlayerPresenter", "getPlayUrl mPlayUrlIndex "+this.K, objArray3);
       merchantInte = this.J;
       d uod = new d("liveMerchantPlayback");
       uod.setBizFt(":ks-features:ft-merchant:merchant-interpretation");
       uod.setNormalUrl(merchantInte, i);
       String cacheKey = CacheKeyUtil.getCacheKey(merchantInte, b);
       try{
          uod.setCacheKey(cacheKey);
          b uob = c.a(uod);
          this.D = uob;
          uob.x().e(i);
          this.D.x().h(this.z.commodity.mId);
          this.D.x().g(this.O);
          this.D.setLooping(b);
          merchantInte = this.P;
          tD = this.D;
          Objects.requireNonNull(merchantInte);
          if (!PatchProxy.applyVoidOneRefs(tD, merchantInte, a.class, "7")) {
             IKwaiMediaPlayer iKwaiMediaPl = tD.getIKwaiMediaPlayer();
             merchantInte.n = (iKwaiMediaPl == null)? objArray: iKwaiMediaPl.getKwaiSign();
          }
       label_00df :
          this.D.addOnErrorListener(f.b);
          this.D.addOnInfoListener(new g(this));
          this.D.w(new e(this));
          this.D.addOnVideoSizeChangedListener(new q(this));
          this.D.addOnSeekCompleteListener(new MerchantInterpretationPlayerPresenter$d(this));
          a uoa = new a(this.D, 2);
          this.N = uoa;
          if (uoa instanceof b) {
             this.D.D(uoa);
          }
          merchantInte = this.E;
          if (merchantInte != null) {
             this.D.setSurface(merchantInte);
          }
          this.D.prepareAsync();
          return;
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
          Object[] objArray1 = new Object["7"];
          objArray1[PatchProxy.applyVoidOneRefs(tD, merchantInte, a.class, "7")] = merchantInte;
          Object[] objArray2 = new Object[PatchProxy.applyVoidOneRefs(tD, merchantInte, a.class, "7")];
          c.C().t("MerchantInterpretation", String.format(Locale.US, "[initVideoPlayer] KpMidVodHlsBuilder.createPlayer fail, %s", objArray1), objArray2);
          return;
       }
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, MerchantInterpretationPlayerPresenter.class, "10")) {
          return;
       }
       this.t.setSelected(false);
       this.u.setClickable(false);
       this.u.setEnabled(false);
       this.u.setFocusable(false);
       this.s.setVisibility(false);
       this.u.setMax(0x2710);
       this.s.setSurfaceTextureListener(this.Q);
       this.u.setOnSeekBarChangeListener(new MerchantInterpretationPlayerPresenter$c(this));
       return;
    }
    public final boolean Y8(){
       Object obj = PatchProxy.apply(null, this, MerchantInterpretationPlayerPresenter.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.D.b() == 7)? true: false;
       return b;
    }
    public boolean Z8(){
       MerchantInterpretationPlayerPresenter obj = PatchProxy.apply(null, this, MerchantInterpretationPlayerPresenter.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.F;
       boolean b = (obj != null && obj.c())? true: false;
       return b;
    }
    public final void a9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MerchantInterpretationPlayerPresenter.class, "18")) {
          return;
       }
       this.b9();
       MerchantInterpretationPlayerPresenter tH = this.H;
       if (tH != null) {
          tH.a();
          this.H.d(objArray);
       }
       tH = this.G;
       if (tH != null) {
          tH.a();
          this.G = objArray;
       }
       this.j9();
       this.getActivity().getLifecycle().removeObserver(this.I);
       tH = this.P;
       Objects.requireNonNull(tH);
       if (!PatchProxy.applyVoid(objArray, tH, a.class, "5")) {
          tH.l = System.currentTimeMillis();
          long l = SystemClock.elapsedRealtime();
          tH.j.h(l);
          tH.h.h(l);
          tH.i.h(l);
          tH.g.h(l);
       }
       return;
    }
    public final void b9(){
       if (PatchProxy.applyVoid(null, this, MerchantInterpretationPlayerPresenter.class, "25")) {
          return;
       }
       MerchantInterpretationPlayerPresenter tD = this.D;
       if (tD != null) {
          if (tD.getIKwaiMediaPlayer() != null) {
             this.P.e = this.D.getVodStatJson();
             this.P.f = this.D.getBriefVodStatJson();
          }
          this.D.release();
       }
       return;
    }
    public void c9(){
       if (PatchProxy.applyVoid(null, this, MerchantInterpretationPlayerPresenter.class, "16")) {
          return;
       }
       if (SystemUtil.a(23)) {
          MerchantInterpretationPlayerPresenter tE = this.E;
          if (tE != null) {
             tE.release();
             this.E = null;
          }
       }
       return;
    }
    public void d9(){
       if (PatchProxy.applyVoid(null, this, MerchantInterpretationPlayerPresenter.class, "23")) {
          return;
       }
       Object[] objArray = new Object[0];
       c.C().w("MerchantInterpretationPlayerPresenter", "startPlayer mIsManualStopVideo = "+this.M, objArray);
       MerchantInterpretationPlayerPresenter tD = this.D;
       if (tD != null) {
          tD.start();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantInterpretationPlayerPresenter.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a09d2);
       this.r = m1.f(p0, 0x7f0a3e7f);
       this.s = m1.f(p0, 0x7f0a2b3a);
       this.t = m1.f(p0, 0x7f0a30ff);
       this.u = m1.f(p0, 0x7f0a311c);
       this.v = m1.f(p0, 0x7f0a310b);
       this.w = m1.f(p0, 0x7f0a310c);
       this.x = m1.f(p0, 0x7f0a2908);
       MerchantLottieAnimationView merchantLott = m1.f(p0, R.id.back_lottie);
       this.y = merchantLott;
       merchantLott.E(R.string.arg_RES_7f10271f, 1);
       this.t.setOnClickListener(new c(this));
       m1.f(p0, R.id.retry_btn).setOnClickListener(new p(this));
       return;
    }
    public void e9(){
       if (PatchProxy.applyVoid(null, this, MerchantInterpretationPlayerPresenter.class, "29")) {
          return;
       }
       MerchantInterpretationPlayerPresenter tF = this.F;
       if (tF != null) {
          tF.d();
       }
       return;
    }
    public void h9(){
       if (PatchProxy.applyVoid(null, this, MerchantInterpretationPlayerPresenter.class, "24")) {
          return;
       }
       Object[] objArray = new Object[0];
       c.C().w("MerchantInterpretationPlayerPresenter", "stopPlayer mIsManualStopVideo = "+this.M, objArray);
       MerchantInterpretationPlayerPresenter tD = this.D;
       if (tD != null) {
          tD.pause();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MerchantInterpretationPlayerPresenter.class, "1")) {
          return;
       }
       this.z = this.q8(MerchantInterpretationInfo.class);
       this.A = this.q8(MerchantInterpretationPlayerFragment.class);
       this.p = this.r8("INTERPRETATION_PLAYER_CHANGE_PHOTO_URL_ACTION");
       return;
    }
    public void j9(){
       if (PatchProxy.applyVoid(null, this, MerchantInterpretationPlayerPresenter.class, "30")) {
          return;
       }
       MerchantInterpretationPlayerPresenter tF = this.F;
       if (tF != null) {
          tF.e();
       }
       return;
    }
}
