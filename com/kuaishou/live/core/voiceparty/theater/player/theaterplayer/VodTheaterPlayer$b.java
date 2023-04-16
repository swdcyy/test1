package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$b;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class VodTheaterPlayer$b implements IMediaPlayer$OnErrorListener	// class@0019c7
{
    public static final VodTheaterPlayer$b b;

    static {
       VodTheaterPlayer$b.b = new VodTheaterPlayer$b();
    }
    public void VodTheaterPlayer$b(){
       super();
    }
    public final boolean onError(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(VodTheaterPlayer$b.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, VodTheaterPlayer$b.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       b.d0(LiveVoicePartyLogTag.THEATER, "onVodPlayTheaterError", "what", Integer.valueOf(p1), "extra", Integer.valueOf(p2));
       return true;
    }
}
