package com.yxcorp.gifshow.growth.kpop.ext.fsvideo.presenter.FSVideoPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.growth.kpop.ext.fsvideo.presenter.FSVideoPresenter$a;
import nsd.u;
import java.lang.String;
import com.yxcorp.gifshow.growth.kpop.ext.model.VideoConfig;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.kpop.ext.fsvideo.presenter.FSVideoPresenter$e;
import com.yxcorp.gifshow.growth.kpop.ext.fsvideo.presenter.FSVideoPresenter$f;
import com.yxcorp.gifshow.growth.kpop.ext.fsvideo.presenter.FSVideoPresenter$c;
import com.yxcorp.gifshow.growth.kpop.ext.fsvideo.presenter.FSVideoPresenter$g;
import com.yxcorp.gifshow.growth.kpop.ext.fsvideo.presenter.FSVideoPresenter$d;
import com.yxcorp.gifshow.growth.kpop.ext.fsvideo.presenter.FSVideoPresenter$b;
import com.yxcorp.gifshow.growth.kpop.ext.fsvideo.presenter.FSVideoPresenter$mScreenStatusReceiver$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import nc6.a;
import java.util.List;
import java.util.Collection;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import cra.w;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.player.core.b;
import wc6.d;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.util.CacheKeyUtil;
import com.kwai.video.wayne.player.builder.PlayerCommonBuildData;
import com.kwai.framework.player.core.c;
import java.lang.Throwable;
import java.lang.StringBuilder;
import nc6.d;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.framework.player.core.b$b;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import android.view.TextureView$SurfaceTextureListener;
import android.view.TextureView;
import android.view.View;
import voa.a;
import android.view.View$OnClickListener;
import android.app.Activity;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$OnLayoutChangeListener;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import lnc.u1;
import toa.b;
import java.lang.CharSequence;
import zsd.u;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import qrd.l1;
import k2b.u1;
import woa.a;
import android.view.ViewParent;
import android.view.ViewGroup;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.util.rx.RxBus;
import soa.a;
import java.lang.Integer;
import toa.a;
import voa.b;
import ai7.e;
import com.yxcorp.gifshow.growth.kpop.ext.util.KPopJsEventUtil;
import android.view.Surface;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import m56.f;

public final class FSVideoPresenter extends PresenterV2	// class@001407
{
    public final b$b A;
    public final IMediaPlayer$OnErrorListener B;
    public final TextureView$SurfaceTextureListener C;
    public final View$OnLayoutChangeListener D;
    public final a E;
    public final BroadcastReceiver F;
    public final String G;
    public final VideoConfig H;
    public View p;
    public View q;
    public View r;
    public TextureView s;
    public KwaiImageView t;
    public String u;
    public boolean v;
    public b w;
    public boolean x;
    public Surface y;
    public final IMediaPlayer$OnPreparedListener z;
    public static final FSVideoPresenter$a I;

    static {
       FSVideoPresenter.I = new FSVideoPresenter$a(null);
    }
    public void FSVideoPresenter(String p0,VideoConfig p1){
       a.p(p0, "kwaiBubbleId");
       a.p(p1, "mVideoConfig");
       super();
       this.G = p0;
       this.H = p1;
       this.z = new FSVideoPresenter$e(this);
       this.A = new FSVideoPresenter$f(this);
       this.B = new FSVideoPresenter$c(this);
       this.C = new FSVideoPresenter$g(this);
       this.D = new FSVideoPresenter$d(this);
       this.E = FSVideoPresenter$b.b;
       this.F = new FSVideoPresenter$mScreenStatusReceiver$1(this);
    }
    public void E8(){
       Activity activity1;
       FSVideoPresenter tH;
       FSVideoPresenter uFSVideoPres = FSVideoPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uFSVideoPres, "2")) {
          return;
       }
       this.u = a.a();
       String str = null;
       FSVideoPresenter uFSVideoPres1 = 1;
       if (!PatchProxy.applyVoid(objArray, this, uFSVideoPres, "20")) {
          tH = this.t;
          if (tH != null) {
             if (this.H.getCoverUrl().isEmpty() ^ uFSVideoPres1) {
                tH.setVisibility(str);
                tH.P(this.H.getCoverUrl());
             }else {
                tH.setVisibility(8);
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uFSVideoPres, "14")) {
          Object[] objArray1 = new Object[str];
          w.C().w("FSVideoPresenter", "initVideoPlayer", objArray1);
          b uob = PatchProxy.apply(objArray, this, uFSVideoPres, "19");
          if (uob != PatchProxyResult.class) {
          }else {
             String videoUrl = this.H.getVideoUrl();
             d uod = new d("GrowthFSVideo");
             WayneBuildData wayneBuildDa = uod.setBizFt(":ks-features:ft-feed:kwai-growth").setNormalUrl(videoUrl, uFSVideoPres1);
             WayneBuildData wayneBuildDa1 = wayneBuildDa.setCacheKey(CacheKeyUtil.getCacheKey(videoUrl, str));
             int i = (this.H.getUseHardwareDecoding())? 1: 2;
             try{
                wayneBuildDa1.setMediaCodecPolicy(i);
                uob = c.a(uod);
             }catch(java.lang.Exception e2){
                w.C().e("FSVideoPresenter", "buildVideoPlayer", e2);
                uob = objArray;
             }
          }
       }
    label_00e8 :
       if (!PatchProxy.applyVoid(objArray, this, uFSVideoPres, "11")) {
          tH = this.s;
          if (tH != null) {
             tH.setSurfaceTextureListener(this.C);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uFSVideoPres, "13")) {
          tH = this.p;
          if (tH != null) {
             if (this.H.getEnableSkip()) {
                tH.setVisibility(str);
                tH.setOnClickListener(new a(this));
                Activity activity2 = this.getActivity();
                a.m(activity2);
                ViewGroup$LayoutParams layoutParams = tH.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                layoutParams.topMargin = n.A(activity2);
                tH.setLayoutParams(layoutParams);
             }else {
                tH.setVisibility(8);
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uFSVideoPres, "10")) {
          tH = this.q;
          if (tH != null) {
             tH.addOnLayoutChangeListener(this.D);
          }
       }
       Activity activity = this.getActivity();
       str = "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity";
       Objects.requireNonNull(activity, str);
       activity.F2(this.E);
       if (!PatchProxy.applyVoid(objArray, this, uFSVideoPres, "8")) {
          IntentFilter intentFilter = new IntentFilter();
          intentFilter.addAction("android.intent.action.SCREEN_OFF");
          activity1 = this.getActivity();
          if (activity1 != null) {
             UniversalReceiver.e(activity1, this.F, intentFilter);
          }
       }
       u1.a(this);
       b b = b.b;
       activity1 = this.getActivity();
       Objects.requireNonNull(activity1, str);
       tH = this.H;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidTwoRefs(activity1, tH, b, b.class, "1")) {
          a.p(activity1, "iLogPage");
          a.p(tH, "config");
          if (!u.S1(tH.getAction2VideoStart())) {
             ShowMetaData showMetaData = new ShowMetaData();
             showMetaData.setLogPage(activity1);
             showMetaData.setType(8);
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = tH.getAction2VideoStart();
             showMetaData.setElementPackage(uElementPack);
             u1.B0(showMetaData);
          }
       }
       return;
    }
    public void J8(){
       FSVideoPresenter uFSVideoPres = FSVideoPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uFSVideoPres, "3")) {
          return;
       }
       FSVideoPresenter tq = this.q;
       if (tq != null) {
          tq.removeOnLayoutChangeListener(this.D);
       }
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       activity.l3(this.E);
       if (!PatchProxy.applyVoid(objArray, this, uFSVideoPres, "9")) {
          Activity activity1 = this.getActivity();
          if (activity1 != null) {
             UniversalReceiver.f(activity1, this.F);
          }
       }
       u1.b(this);
       this.R8("unbind");
       return;
    }
    public final void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FSVideoPresenter.class, "4")) {
          return;
       }
       if (this.H.getVideoWidth() > 0 && this.H.getVideoHeight() > 0) {
          a a = a.a;
          FSVideoPresenter ts = this.s;
          ViewParent parent = (ts != null)? ts.getParent(): objArray;
          a.a(ts, parent, this.H.getVideoHeight(), this.H.getVideoWidth());
          ts = this.t;
          if (ts != null) {
             objArray = ts.getParent();
          }
          a.a(ts, objArray, this.H.getVideoHeight(), this.H.getVideoWidth());
       }
       return;
    }
    public final void R8(String p0){
       boolean b;
       FSVideoPresenter ts;
       a a;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, FSVideoPresenter.class, "15")) {
          return;
       }
       if (this.v != null) {
          return;
       }
       b = true;
       this.v = b;
       Object[] objArray = new Object[0];
       w.C().w("FSVideoPresenter", "displayFinish reason:"+p0, objArray);
       int i = 3;
       if (TextUtils.n(p0, "complete")) {
          i = 2;
          if (!PatchProxy.applyVoid(null, this, FSVideoPresenter.class, "16")) {
             RxBus.f.b(new a(this.G));
          }
          b b1 = b.b;
          Objects.requireNonNull(b1);
          if (!PatchProxy.applyVoid(null, b1, uob, "6")) {
             a = b.a;
             if (a != null) {
                a.f(Integer.valueOf(b));
                b1.b();
             }
          }
       }else {
          b b2 = b.b;
          Objects.requireNonNull(b2);
          if (!PatchProxy.applyVoidOneRefs(p0, b2, uob, "5")) {
             a.p(p0, "errorReason");
             a = b.a;
             if (a != null) {
                a.f(Integer.valueOf(i));
                a.e(p0);
                b2.b();
             }
          }
       }
       if (!PatchProxy.applyVoid(null, this, FSVideoPresenter.class, "17")) {
          ts = this.w;
          if (ts != null) {
             ts.releaseAsync(new b(ts, this));
             ts.removeOnErrorListener(this.B);
             ts.removeOnPreparedListener(this.z);
             ts.O(this.A);
          }
       }
       if (!PatchProxy.applyVoid(null, this, FSVideoPresenter.class, "12")) {
          ts = this.s;
          if (ts != null) {
             ts.setSurfaceTextureListener(null);
          }
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          activity.finish();
       }
       KPopJsEventUtil.a.a(i);
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, FSVideoPresenter.class, "6")) {
          return;
       }
       FSVideoPresenter tw = this.w;
       if (tw != null) {
          tw.setSurface(null);
          tw = this.y;
          if (tw != null) {
             tw.release();
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FSVideoPresenter.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       this.q = m1.f(p0, 0x7f0a1031);
       this.r = m1.f(p0, 0x7f0a1030);
       this.s = m1.f(p0, 0x7f0a1032);
       this.t = m1.f(p0, 0x7f0a102e);
       this.p = m1.f(p0, 0x7f0a102f);
       return;
    }
    public final void onAppBackground(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FSVideoPresenter.class, "7")) {
          return;
       }
       a.p(p0, "event");
       this.R8("background");
       return;
    }
}
