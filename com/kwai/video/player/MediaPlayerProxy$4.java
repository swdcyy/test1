package com.kwai.video.player.MediaPlayerProxy$4;
import com.kwai.video.player.IMediaPlayer$OnSeekCompleteListener;
import com.kwai.video.player.MediaPlayerProxy;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class MediaPlayerProxy$4 implements IMediaPlayer$OnSeekCompleteListener	// class@000af9
{
    public final MediaPlayerProxy this$0;
    public final IMediaPlayer$OnSeekCompleteListener val$finalListener;

    public void MediaPlayerProxy$4(MediaPlayerProxy p0,IMediaPlayer$OnSeekCompleteListener p1){
       this.this$0 = p0;
       this.val$finalListener = p1;
       super();
    }
    public void onSeekComplete(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPlayerProxy$4.class, "1")) {
          return;
       }
       this.val$finalListener.onSeekComplete(this.this$0);
       return;
    }
}
