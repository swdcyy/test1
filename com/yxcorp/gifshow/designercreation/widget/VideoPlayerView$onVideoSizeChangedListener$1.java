package com.yxcorp.gifshow.designercreation.widget.VideoPlayerView$onVideoSizeChangedListener$1;
import msd.s;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.designercreation.widget.VideoPlayerView;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import hw9.a;
import hw9.a$a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Objects;
import android.view.View;

public final class VideoPlayerView$onVideoSizeChangedListener$1 extends Lambda implements s	// class@001322
{
    public final VideoPlayerView this$0;

    public void VideoPlayerView$onVideoSizeChangedListener$1(VideoPlayerView p0){
       this.this$0 = p0;
       super(5);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4){
       this.invoke(p0, p1.intValue(), p2.intValue(), p3.intValue(), p4.intValue());
       return l1.a;
    }
    public final void invoke(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(VideoPlayerView$onVideoSizeChangedListener$1.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, VideoPlayerView$onVideoSizeChangedListener$1.class, "1")) {
             return;
          }
       }
       a.p(p0, "mp");
       Object[] objArray1 = new Object[0];
       a.c.a().w("VideoPlayerView", "onVideoSizeChanged : "+p1+", "+p2, objArray1);
       VideoPlayerView$onVideoSizeChangedListener$1 tthis$0 = this.this$0;
       if (tthis$0.g != null) {
          Objects.requireNonNull(tthis$0);
          if (!PatchProxy.isSupport(VideoPlayerView.class) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), Integer.valueOf(p2), tthis$0, VideoPlayerView.class, "7") && tthis$0.j != null)) {
             VideoPlayerView b = tthis$0.b;
             if (b != null) {
                tthis$0.h(b, p1, p2);
                tthis$0.j = false;
             }
          }
       }
       return;
    }
}
