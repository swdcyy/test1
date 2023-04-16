package com.kwai.video.player.MediaPlayerProxy$2;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import com.kwai.video.player.MediaPlayerProxy;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class MediaPlayerProxy$2 implements IMediaPlayer$OnCompletionListener	// class@000af7
{
    public final MediaPlayerProxy this$0;
    public final IMediaPlayer$OnCompletionListener val$finalListener;

    public void MediaPlayerProxy$2(MediaPlayerProxy p0,IMediaPlayer$OnCompletionListener p1){
       this.this$0 = p0;
       this.val$finalListener = p1;
       super();
    }
    public void onCompletion(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPlayerProxy$2.class, "1")) {
          return;
       }
       this.val$finalListener.onCompletion(this.this$0);
       return;
    }
}
