package com.kwai.video.player.MediaPlayerProxy$7;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.player.MediaPlayerProxy;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class MediaPlayerProxy$7 implements IMediaPlayer$OnInfoListener	// class@000afc
{
    public final MediaPlayerProxy this$0;
    public final IMediaPlayer$OnInfoListener val$finalListener;

    public void MediaPlayerProxy$7(MediaPlayerProxy p0,IMediaPlayer$OnInfoListener p1){
       this.this$0 = p0;
       this.val$finalListener = p1;
       super();
    }
    public boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(MediaPlayerProxy$7.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, MediaPlayerProxy$7.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       return this.val$finalListener.onInfo(this.this$0, p1, p2);
    }
}
