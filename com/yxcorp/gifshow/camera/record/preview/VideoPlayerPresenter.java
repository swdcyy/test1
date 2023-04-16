package com.yxcorp.gifshow.camera.record.preview.VideoPlayerPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import java.util.ArrayList;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import android.widget.ImageView;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import wc6.d;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.util.CacheKeyUtil;
import com.kwai.video.wayne.player.main.WaynePlayerFactory;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.framework.player.core.a;
import j8c.a;
import java.lang.Throwable;
import w46.b;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import pg9.e;
import android.view.TextureView$SurfaceTextureListener;
import android.view.TextureView;
import pg9.b;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.wayne.player.main.IPlayerListener;
import pg9.c;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import pg9.d;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import com.yxcorp.gifshow.camera.record.preview.VideoPlayerPresenter$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.utility.SystemUtil;
import android.view.Surface;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;

public class VideoPlayerPresenter extends PresenterV2	// class@000efe
{
    public TextureView p;
    public KwaiImageView q;
    public final String r;
    public int s;
    public final List t;
    public Surface u;
    public SurfaceTexture v;
    public IWaynePlayer w;
    public boolean x;

    public void VideoPlayerPresenter(String p0,String p1,int p2){
       super();
       int i = 0;
       this.s = i;
       ArrayList uArrayList = new ArrayList();
       this.t = uArrayList;
       this.x = i;
       this.r = p0;
       if (TextUtils.x(p1)) {
       }else {
          uArrayList.add(new CDNUrl("", p1));
       }
       this.s = p2;
       return;
    }
    public void F8(){
       ProgressFragment progressFrag;
       VideoPlayerPresenter videoPlayerP = VideoPlayerPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, videoPlayerP, "2")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoid(objArray, this, videoPlayerP, "4")) {
          if (this.q != null) {
             if (!q.f(this.t)) {
                this.q.setVisibility(0);
                this.q.P(this.t);
             }else {
                this.q.setVisibility(8);
             }
          }
          VideoPlayerPresenter tr = this.r;
          IWaynePlayer iWaynePlayer = PatchProxy.applyOneRefs(tr, this, videoPlayerP, "7");
          if (iWaynePlayer != patchProxyRe) {
          }else {
             d uod = new d("RecordPreview");
             WayneBuildData wayneBuildDa = uod.setBizFt(":ks-features:ft-post:record").setNormalUrl(tr, true);
             String cacheKey = CacheKeyUtil.getCacheKey(tr, 0);
             try{
                wayneBuildDa.setCacheKey(cacheKey);
                iWaynePlayer = WaynePlayerFactory.createPlayer(uod);
                a.a(iWaynePlayer.getKernelPlayer());
             }catch(java.lang.Exception e3){
                Object[] objArray1 = new Object[0];
                a.D().u("VideoPlayerPresenter", e3, objArray1);
                iWaynePlayer = objArray;
             }
          }
       }
       this.getActivity().getLifecycle().addObserver(new VideoPlayerPresenter$1(this));
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, VideoPlayerPresenter.class, "3")) {
          return;
       }
       if (SystemUtil.a(23)) {
          VideoPlayerPresenter tu = this.u;
          if (tu != null) {
             tu.release();
             this.u = null;
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoPlayerPresenter.class, "1")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a31e5);
       this.p = m1.f(p0, 0x7f0a31ff);
       return;
    }
}
