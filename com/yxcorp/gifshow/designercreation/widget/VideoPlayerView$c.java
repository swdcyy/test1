package com.yxcorp.gifshow.designercreation.widget.VideoPlayerView$c;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.yxcorp.gifshow.designercreation.widget.VideoPlayerView;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hw9.a;
import hw9.a$a;
import java.lang.StringBuilder;
import q87.c;
import kotlin.jvm.internal.a;
import pw9.a;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;

public final class VideoPlayerView$c implements IMediaPlayer$OnPreparedListener	// class@00131e
{
    public final VideoPlayerView b;

    public void VideoPlayerView$c(VideoPlayerView p0){
       this.b = p0;
       super();
    }
    public final void onPrepared(IMediaPlayer p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoPlayerView$c.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.c.a().s("VideoPlayerView", "onPrepared\(\) called with: mp = ["+p0+']', objArray);
       VideoPlayerView f = this.b.f;
       if (f != null) {
          a.m(f);
          if (f.b()) {
             f = this.b.f;
             if (f != null && !PatchProxy.applyVoid(null, f, a.class, "4")) {
                a = f.a;
                if (a == null) {
                   i1.c(new RuntimeException("KwaiMediaPlayer stepFrame\(\) called, player is released"));
                }else if(a.isPlaying()){
                   a.stepFrame();
                }
             }
          }
       }
       VideoPlayerView$c tb = this.b;
       tb.g = true;
       if (tb.i != null && tb.k != null) {
          f = tb.f;
          if (f != null) {
             f.d();
          }
       }
       f.j = true;
       return;
    }
}
