package com.kwai.video.player.kwai_player.KwaiPlayerCreatorAemonImpl$InternalKwaiPlayerImpl;
import com.kwai.video.player.kwai_player.KwaiPlayerCreator$InternalKwaiPlayer;
import com.kwai.video.player.KsPlayerCore;
import ai7.d;
import java.lang.Object;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter;
import com.kwai.video.player.kwai_player.IBuildKwaiPlayer;
import com.kwai.video.player.IKwaiMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;

public class KwaiPlayerCreatorAemonImpl$InternalKwaiPlayerImpl implements KwaiPlayerCreator$InternalKwaiPlayer	// class@000b40
{
    public final AemonMediaPlayerAdapter mediaPlayer;

    public void KwaiPlayerCreatorAemonImpl$InternalKwaiPlayerImpl(KsPlayerCore p0,d p1,boolean p2){
       super();
       this.mediaPlayer = new AemonMediaPlayerAdapter(p0);
       if (p1 != null) {
          this.setupSwitch(p1, p2);
       }
       return;
    }
    public IBuildKwaiPlayer getBuildKwaiPlayer(){
       return this.mediaPlayer;
    }
    public IKwaiMediaPlayer getIKwaiMediaPlayer(){
       return this.mediaPlayer;
    }
    public final void setupSwitch(d p0,boolean p1){
       KwaiPlayerCreatorAemonImpl$InternalKwaiPlayerImpl internalKwai = KwaiPlayerCreatorAemonImpl$InternalKwaiPlayerImpl.class;
       if (PatchProxy.isSupport(internalKwai) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, internalKwai, "1")) {
          return;
       }
       this.mediaPlayer.setOption(4, "buffer-config-json", p0.getJSON("aemonPlayerBufferParams", ""));
       this.mediaPlayer.setOption(4, "render-config-json", p0.getJSON("aemonPlayerRenderParams", ""));
       this.mediaPlayer.setOption(4, "player-config-json", p0.getJSON("aemonPlayerInstanceParams", ""));
       this.mediaPlayer.setOption(4, "chase-config-json", p0.getJSON("aemonPlayerChaseParams", ""));
       this.mediaPlayer.setOption(4, "source-config-json", p0.getJSON("aemonPlayerSourceParams", ""));
       this.mediaPlayer.setOption(4, "decode-config-json", p0.getJSON("aemonPlayerDecodeParams", ""));
       if (p1) {
          this.mediaPlayer.setOption(4, "exp-config-json", p0.getJSON("aemonPlayerExpParamsLive", ""));
       }else {
          this.mediaPlayer.setOption(4, "exp-config-json", p0.getJSON("aemonPlayerExpParamsVod", ""));
       }
       return;
    }
}
