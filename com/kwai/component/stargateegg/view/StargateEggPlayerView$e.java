package com.kwai.component.stargateegg.view.StargateEggPlayerView$e;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.component.stargateegg.view.StargateEggPlayerView;
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
import ug5.b;
import xx6.k;
import kotlin.jvm.internal.a;
import wx4.a;

public final class StargateEggPlayerView$e implements IMediaPlayer$OnInfoListener	// class@000b55
{
    public final StargateEggPlayerView b;

    public void StargateEggPlayerView$e(StargateEggPlayerView p0){
       this.b = p0;
       super();
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       StargateEggPlayerView obj;
       boolean b;
       if (PatchProxy.isSupport(StargateEggPlayerView$e.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, StargateEggPlayerView$e.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p1 != 0x2711) {
          if (p1 == 0x2712) {
             if (p0 instanceof IKwaiMediaPlayer) {
                IKwaiMediaPlayer iKwaiMediaPl = p0;
                b.b("TKOlympicPlayer", this.b.P+"  playerId:"+iKwaiMediaPl.getPlayerId()+", after"+" MEDIA_INFO_AUDIO_RENDERING_START, player.getAudioRawLatencySeconds\(\): "+iKwaiMediaPl.getAudioRawLatencySeconds()+"s\n");
             }
             this.b.N.c();
          }
       }else {
          StargateEggPlayerView$e tb = this.b;
          tb.G = p2;
          obj = tb.B;
          if (obj != null) {
             a.m(obj);
             obj.setVideoRotation(p2);
          }
       }
       this.b.a();
       obj = this.b.Y0;
       b = (obj != null)? obj.onInfo(p0, p1, p2): false;
       return b;
    }
}
