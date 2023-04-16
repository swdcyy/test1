package com.kwai.video.player.KsMediaPlayerAemonImpl$16;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$OnControlMessageListener;
import com.kwai.video.player.KsMediaPlayerAemonImpl;
import com.kwai.video.player.KsMediaPlayer$OnControlMessageListener;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;

public class KsMediaPlayerAemonImpl$16 implements AemonMediaPlayerAdapter$OnControlMessageListener	// class@000ae1
{
    public final KsMediaPlayerAemonImpl this$0;
    public final KsMediaPlayer$OnControlMessageListener val$listener;

    public void KsMediaPlayerAemonImpl$16(KsMediaPlayerAemonImpl p0,KsMediaPlayer$OnControlMessageListener p1){
       this.this$0 = p0;
       this.val$listener = p1;
       super();
    }
    public String onControlResolveSegmentUrl(int p0){
       KsMediaPlayerAemonImpl$16 u16 = KsMediaPlayerAemonImpl$16.class;
       if (PatchProxy.isSupport(u16)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, u16, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       u16 = this.val$listener;
       if (u16 != null) {
          return u16.onControlResolveSegmentUrl(p0);
       }else {
          return "";
       }
    }
}
