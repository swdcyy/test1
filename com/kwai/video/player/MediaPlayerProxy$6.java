package com.kwai.video.player.MediaPlayerProxy$6;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.player.MediaPlayerProxy;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class MediaPlayerProxy$6 implements IMediaPlayer$OnErrorListener	// class@000afb
{
    public final MediaPlayerProxy this$0;
    public final IMediaPlayer$OnErrorListener val$finalListener;

    public void MediaPlayerProxy$6(MediaPlayerProxy p0,IMediaPlayer$OnErrorListener p1){
       this.this$0 = p0;
       this.val$finalListener = p1;
       super();
    }
    public boolean onError(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(MediaPlayerProxy$6.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, MediaPlayerProxy$6.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       return this.val$finalListener.onError(this.this$0, p1, p2);
    }
}
