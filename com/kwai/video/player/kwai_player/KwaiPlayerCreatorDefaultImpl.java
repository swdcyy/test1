package com.kwai.video.player.kwai_player.KwaiPlayerCreatorDefaultImpl;
import com.kwai.video.player.kwai_player.KwaiPlayerCreator;
import com.kwai.video.player.kwai_player.KwaiPlayerCreator$InternalKwaiPlayer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.player.kwai_player.KwaiPlayerCreatorDefaultImpl$1;

public class KwaiPlayerCreatorDefaultImpl extends KwaiPlayerCreator	// class@000b43
{

    public void KwaiPlayerCreatorDefaultImpl(){
       super();
    }
    public KwaiPlayerCreator$InternalKwaiPlayer create(){
       Object obj = PatchProxy.apply(null, this, KwaiPlayerCreatorDefaultImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KwaiPlayerCreatorDefaultImpl$1(this);
    }
}
