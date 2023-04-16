package com.yxcorp.gifshow.camera.record.preview.VideoPlayerPresenter$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.camera.record.preview.VideoPlayerPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import com.yxcorp.gifshow.util.PostUtils;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import j8c.a;
import java.lang.Throwable;
import w46.b;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import q87.c;

public class VideoPlayerPresenter$1 implements LifecycleObserver	// class@000efd
{
    public final VideoPlayerPresenter b;

    public void VideoPlayerPresenter$1(VideoPlayerPresenter p0){
       this.b = p0;
       super();
    }
    public final void onDestroy(){
       String str;
       if (PatchProxy.applyVoid(null, this, VideoPlayerPresenter$1.class, "3")) {
          return;
       }
       VideoPlayerPresenter$1 tb = this.b;
       VideoPlayerPresenter s = tb.s;
       if (s != 2) {
          str = (s != 3)? "record_preview": "shop_video_preview";
       }else {
          str = "in_town_preview";
       }
       PostUtils.y(str, tb.w.getVodStatJson());
       this.b.getActivity().getLifecycle().removeObserver(this);
       tb = this.b;
       try{
          tb.P8();
          this.b.w.stop();
          this.b.w.releaseAsync();
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[0];
          a.D().u("VideoPlayerPresenter", e0, objArray);
       }
       return;
    }
    public final void onPause(){
       if (PatchProxy.applyVoid(null, this, VideoPlayerPresenter$1.class, "2")) {
          return;
       }
       VideoPlayerPresenter w = this.b.w;
       if (w != null && w.isPlaying()) {
          this.b.w.pause();
       }
       return;
    }
    public final void onResume(){
       if (PatchProxy.applyVoid(null, this, VideoPlayerPresenter$1.class, "1")) {
          return;
       }
       int i = 0;
       if (this.b.w.isMediaPlayerValid()) {
          Object[] objArray = new Object[i];
          a.D().A("VideoPlayerPresenter", "onResume mIKwaiMediaPlayer is inValid", objArray);
       }
       try{
          this.b.w.start();
       }catch(java.lang.IllegalStateException e0){
          Object[] objArray1 = new Object[i];
          a.D().u("VideoPlayerPresenter", e0, objArray1);
       }
       return;
    }
}
