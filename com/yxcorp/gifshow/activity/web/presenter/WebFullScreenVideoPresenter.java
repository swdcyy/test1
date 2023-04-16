package com.yxcorp.gifshow.activity.web.presenter.WebFullScreenVideoPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.model.WebVideoParam;
import com.yxcorp.gifshow.activity.web.presenter.WebFullScreenVideoPresenter$a;
import mx8.h;
import mx8.j;
import mx8.i;
import mx8.m;
import com.yxcorp.gifshow.activity.web.presenter.WebFullScreenVideoPresenter$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nc6.a;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import te6.b;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.TextureView$SurfaceTextureListener;
import android.view.TextureView;
import mx8.g;
import android.view.View$OnClickListener;
import com.kwai.library.widget.emptyview.KwaiPlayerFailedStateView;
import android.view.View$OnLayoutChangeListener;
import android.view.View;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import android.view.ViewParent;
import android.view.ViewGroup;
import kx8.u;
import tra.b;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.activity.web.presenter.d;
import ai7.e;
import com.kwai.framework.player.core.b$b;
import com.kwai.robust.PatchProxyResult;
import wc6.d;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.util.CacheKeyUtil;
import com.kwai.video.wayne.player.builder.PlayerCommonBuildData;
import com.kwai.framework.player.core.c;
import java.lang.Throwable;
import nc6.d;
import mx8.l;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import mx8.k;
import java.lang.Boolean;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import android.widget.FrameLayout;
import android.view.Surface;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import mx8.f;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class WebFullScreenVideoPresenter extends PresenterV2	// class@0014c3
{
    public String A;
    public boolean B;
    public boolean C;
    public long D;
    public final TextureView$SurfaceTextureListener E;
    public final View$OnLayoutChangeListener F;
    public final IMediaPlayer$OnErrorListener G;
    public final b$b H;
    public final a I;
    public IMediaPlayer$OnInfoListener J;
    public final LifecycleObserver K;
    public final WebVideoParam p;
    public View q;
    public PathLoadingView r;
    public KwaiPlayerFailedStateView s;
    public TextureView t;
    public KwaiImageView u;
    public View v;
    public Surface w;
    public b x;
    public boolean y;
    public boolean z;

    public void WebFullScreenVideoPresenter(WebVideoParam p0){
       super();
       this.E = new WebFullScreenVideoPresenter$a(this);
       this.F = new h(this);
       this.G = new j(this);
       this.H = new i(this);
       this.I = new m(this);
       this.K = new WebFullScreenVideoPresenter$2(this);
       this.p = p0;
    }
    public void E8(){
       WebFullScreenVideoPresenter webFullScree = WebFullScreenVideoPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, webFullScree, "2")) {
          return;
       }
       this.A = a.a();
       WebFullScreenVideoPresenter tp = this.p;
       if (tp.mPlayIfWarmUpFailed != null && (!j.h(tp.mVideoUrl) && !TextUtils.x(this.p.mVideoUrl[0].mUrl))) {
          this.C = b.a(-1427269270).t(this.p.mVideoUrl[0].mUrl) ^ 1;
       }
    label_0048 :
       if (!PatchProxy.applyVoid(objArray, this, webFullScree, "4")) {
          if (!j.h(this.p.mCoverUrl)) {
             this.u.setVisibility(0);
             this.u.U(this.p.mCoverUrl);
          }else {
             this.u.setVisibility(8);
          }
       }
       this.S8();
       this.t.setSurfaceTextureListener(this.E);
       if (!PatchProxy.applyVoid(objArray, this, webFullScree, "15") && this.V8()) {
          this.s.f(new g(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, webFullScree, "12") && this.B == null) {
          this.B = true;
          this.q.addOnLayoutChangeListener(this.F);
       }
       this.getActivity().F2(this.I);
       this.getActivity().getLifecycle().addObserver(this.K);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, WebFullScreenVideoPresenter.class, "3")) {
          return;
       }
       WebFullScreenVideoPresenter tJ = this.J;
       if (tJ != null) {
          WebFullScreenVideoPresenter tx = this.x;
          if (tx != null) {
             tx.removeOnInfoListener(tJ);
          }
       }
       tJ = this.q;
       if (tJ != null) {
          tJ.removeOnLayoutChangeListener(this.F);
       }
       this.getActivity().l3(this.I);
       this.getActivity().getLifecycle().removeObserver(this.K);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, WebFullScreenVideoPresenter.class, "13")) {
          return;
       }
       WebFullScreenVideoPresenter tt = this.t;
       WebFullScreenVideoPresenter tp = this.p;
       u.a(tt, tt.getParent(), tp.mVideoHeight, tp.mVideoWidth);
       tt = this.u;
       tp = this.p;
       u.a(tt, tt.getParent(), tp.mVideoHeight, tp.mVideoWidth);
       return;
    }
    public final void R8(String p0){
       WebFullScreenVideoPresenter webFullScree = WebFullScreenVideoPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, webFullScree, "7")) {
          return;
       }
       if (this.z != null) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("WebFullScreenVideoPresenter", "displayFinish cause:"+p0, objArray);
       this.z = true;
       if (!PatchProxy.applyVoid(null, this, webFullScree, "8")) {
          WebFullScreenVideoPresenter tx = this.x;
          if (tx != null) {
             this.x.releaseAsync(new d(this, tx.getDuration()));
             this.x.O(this.H);
          }
       }
       this.getActivity().finish();
       return;
    }
    public final void S8(){
       Object[] objArray2;
       k ok;
       WebFullScreenVideoPresenter webFullScree = WebFullScreenVideoPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, webFullScree, "5")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       b.C().w("WebFullScreenVideoPresenter", "initPlayer", objArray1);
       b uob = PatchProxy.apply(objArray, this, webFullScree, "6");
       int i = 1;
       if (uob != PatchProxyResult.class) {
       }else {
          WebFullScreenVideoPresenter tp = this.p;
          CDNUrl mUrl = tp.mVideoUrl[0].mUrl;
          String str = (TextUtils.x(tp.mBizType))? "WebSplash": this.p.mBizType;
          d uod = new d(str);
          WayneBuildData wayneBuildDa = uod.setBizFt(":ks-features:ft-feed:activity").setNormalUrl(mUrl, i).setCacheKey(CacheKeyUtil.getCacheKey(mUrl, 0));
          int i1 = (this.p.mUseHardwareDecoding != null)? 1: 2;
          try{
             wayneBuildDa.setMediaCodecPolicy(i1);
             uob = c.a(uod);
          }catch(java.lang.Exception e2){
             b.C().e("WebFullScreenVideoPresenter", "KpMidVodHlsBuilder.createPlayer, bizType:WebSplash", e2);
             uob = objArray;
          }
       }
    }
    public final boolean V8(){
       boolean b = (this.p.mPlayIfWarmUpFailed != null && this.C != null)? true: false;
       return b;
    }
    public final boolean W8(){
       boolean b = (this.p.mPlayIfWarmUpFailed != null && this.C != null)? true: false;
       return b;
    }
    public final void X8(boolean p0){
       WebFullScreenVideoPresenter webFullScree = WebFullScreenVideoPresenter.class;
       if (PatchProxy.isSupport(webFullScree) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, webFullScree, "18")) {
          return;
       }
       if (p0) {
          this.r.setVisibility(0);
          this.r.k();
       }else {
          this.r.setVisibility(8);
          this.r.a();
       }
       this.s.setVisibility(8);
       return;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, WebFullScreenVideoPresenter.class, "11")) {
          return;
       }
       WebFullScreenVideoPresenter tx = this.x;
       if (tx != null) {
          tx.setSurface(null);
          tx = this.w;
          if (tx != null) {
             tx.release();
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebFullScreenVideoPresenter.class, "1")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a456b);
       this.u = m1.f(p0, 0x7f0a456a);
       this.t = m1.f(p0, 0x7f0a456c);
       this.v = m1.f(p0, 0x7f0a3aff);
       this.r = m1.f(p0, 0x7f0a304d);
       this.s = m1.f(p0, 0x7f0a35e3);
       this.v.setOnClickListener(new f(this));
       ViewGroup$MarginLayoutParams layoutParams = this.v.getLayoutParams();
       layoutParams.topMargin = n.A(this.getActivity());
       this.v.setLayoutParams(layoutParams);
       return;
    }
}
