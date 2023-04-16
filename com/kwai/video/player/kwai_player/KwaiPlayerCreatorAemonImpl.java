package com.kwai.video.player.kwai_player.KwaiPlayerCreatorAemonImpl;
import com.kwai.video.player.kwai_player.KwaiPlayerCreator;
import com.kwai.video.player.KsPlayerCore;
import ai7.d;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$StaticMethod;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter;
import java.lang.String;
import com.kwai.video.player.kwai_player.KwaiPlayerCreator$InternalKwaiPlayer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.player.kwai_player.KwaiPlayerCreatorAemonImpl$InternalKwaiPlayerImpl;

public class KwaiPlayerCreatorAemonImpl extends KwaiPlayerCreator	// class@000b41
{
    public final KsPlayerCore core;
    public final boolean isLive;
    public final d provider;

    public void KwaiPlayerCreatorAemonImpl(KsPlayerCore p0,d p1,boolean p2){
       super();
       this.provider = p1;
       this.isLive = p2;
       this.core = p0;
       if (p1 != null) {
          AemonMediaPlayerAdapter.getStaticMethod(p0).setGlobalSwitch(p1.getJSON("aemonPlayerGlobalParams", ""));
       }
       return;
    }
    public KwaiPlayerCreator$InternalKwaiPlayer create(){
       Object obj = PatchProxy.apply(null, this, KwaiPlayerCreatorAemonImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KwaiPlayerCreatorAemonImpl$InternalKwaiPlayerImpl(this.core, this.provider, this.isLive);
    }
}
