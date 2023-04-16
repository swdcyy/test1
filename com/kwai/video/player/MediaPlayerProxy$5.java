package com.kwai.video.player.MediaPlayerProxy$5;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.player.MediaPlayerProxy;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class MediaPlayerProxy$5 implements IMediaPlayer$OnVideoSizeChangedListener	// class@000afa
{
    public final MediaPlayerProxy this$0;
    public final IMediaPlayer$OnVideoSizeChangedListener val$finalListener;

    public void MediaPlayerProxy$5(MediaPlayerProxy p0,IMediaPlayer$OnVideoSizeChangedListener p1){
       this.this$0 = p0;
       this.val$finalListener = p1;
       super();
    }
    public void onVideoSizeChanged(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       MediaPlayerProxy$5 u5 = MediaPlayerProxy$5.class;
       if (PatchProxy.isSupport(u5)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, u5, "1")) {
             return;
          }
       }
       this.val$finalListener.onVideoSizeChanged(this.this$0, p1, p2, p3, p4);
       return;
    }
}
