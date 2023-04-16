package com.kwai.video.player.MediaPlayerProxy$3;
import com.kwai.video.player.IMediaPlayer$OnBufferingUpdateListener;
import com.kwai.video.player.MediaPlayerProxy;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class MediaPlayerProxy$3 implements IMediaPlayer$OnBufferingUpdateListener	// class@000af8
{
    public final MediaPlayerProxy this$0;
    public final IMediaPlayer$OnBufferingUpdateListener val$finalListener;

    public void MediaPlayerProxy$3(MediaPlayerProxy p0,IMediaPlayer$OnBufferingUpdateListener p1){
       this.this$0 = p0;
       this.val$finalListener = p1;
       super();
    }
    public void onBufferingUpdate(IMediaPlayer p0,int p1){
       MediaPlayerProxy$3 u3 = MediaPlayerProxy$3.class;
       if (PatchProxy.isSupport(u3) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, u3, "1")) {
          return;
       }
       this.val$finalListener.onBufferingUpdate(this.this$0, p1);
       return;
    }
}
