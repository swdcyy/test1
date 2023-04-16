package com.kwai.video.player.MediaPlayerProxy$1;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.player.MediaPlayerProxy;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class MediaPlayerProxy$1 implements IMediaPlayer$OnPreparedListener	// class@000af6
{
    public final MediaPlayerProxy this$0;
    public final IMediaPlayer$OnPreparedListener val$finalListener;

    public void MediaPlayerProxy$1(MediaPlayerProxy p0,IMediaPlayer$OnPreparedListener p1){
       this.this$0 = p0;
       this.val$finalListener = p1;
       super();
    }
    public void onPrepared(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPlayerProxy$1.class, "1")) {
          return;
       }
       this.val$finalListener.onPrepared(this.this$0);
       return;
    }
}
