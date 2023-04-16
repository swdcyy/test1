package com.yxcorp.gifshow.designercreation.widget.VideoPlayerView$onErrorListener$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.designercreation.widget.VideoPlayerView;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import hw9.a;
import hw9.a$a;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import q87.c;
import android.widget.ImageView;

public final class VideoPlayerView$onErrorListener$1 extends Lambda implements q	// class@001320
{
    public final VideoPlayerView this$0;

    public void VideoPlayerView$onErrorListener$1(VideoPlayerView p0){
       this.this$0 = p0;
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       return Boolean.valueOf(this.invoke(p0, p1.intValue(), p2.intValue()));
    }
    public final boolean invoke(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(VideoPlayerView$onErrorListener$1.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, VideoPlayerView$onErrorListener$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "iMediaPlayer");
       a.c.a().z("VideoPlayerView", "error", new RuntimeException(" onError\(\) called with: iMediaPlayer = ["+p0+"], i = ["+p1+"], i1 = ["+p2+']'));
       this.this$0.g();
       this.this$0.j();
       VideoPlayerView c = this.this$0.c;
       if (c != null) {
          c.setVisibility(0);
       }
       return 0;
    }
}
