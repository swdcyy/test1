package com.kuaishou.tk.api.view.player.TKOlympicPlayerView$e;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.player.IKwaiMediaPlayer;
import java.lang.StringBuilder;
import com.kuaishou.tk.api.view.player.a;
import kotlin.jvm.internal.a;
import wx4.a;

public final class TKOlympicPlayerView$e implements IMediaPlayer$OnInfoListener	// class@000f9f
{
    public final TKOlympicPlayerView b;

    public void TKOlympicPlayerView$e(TKOlympicPlayerView p0){
       this.b = p0;
       super();
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       TKOlympicPlayerView obj;
       if (PatchProxy.isSupport(TKOlympicPlayerView$e.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TKOlympicPlayerView$e.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p1 != 0x2711) {
          if (p1 == 0x2712 && p0 instanceof IKwaiMediaPlayer) {
             IKwaiMediaPlayer iKwaiMediaPl = p0;
             a.b("TKOlympicPlayer", "playerId:"+iKwaiMediaPl.getPlayerId()+", after MEDIA_INFO_AUDIO_RENDERING_START, player.getAudioRawLatencySeconds\(\): "+iKwaiMediaPl.getAudioRawLatencySeconds()+"s\n");
          }
       }else {
          TKOlympicPlayerView$e tb = this.b;
          tb.G = p2;
          obj = tb.B;
          if (obj != null) {
             a.m(obj);
             obj.setVideoRotation(p2);
          }
       }
       obj = this.b.Y0;
       boolean b = (obj != null)? obj.onInfo(p0, p1, p2): false;
       return b;
    }
}
