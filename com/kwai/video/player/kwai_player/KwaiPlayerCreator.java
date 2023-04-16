package com.kwai.video.player.kwai_player.KwaiPlayerCreator;
import java.lang.Object;
import com.kwai.video.player.PlayerLibraryLoader$FindBestParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.player.KsPlayerCore;
import com.kwai.video.player.PlayerLibraryLoader;
import com.kwai.video.player.kwai_player.KwaiPlayerCreatorAemonImpl;
import ai7.d;
import com.kwai.video.player.kwai_player.KwaiPlayerCreatorDefaultImpl;
import com.kwai.video.player.kwai_player.KwaiPlayerCreator$InternalKwaiPlayer;

public abstract class KwaiPlayerCreator	// class@000b3f
{

    public void KwaiPlayerCreator(){
       super();
    }
    public static KwaiPlayerCreator newCreator(PlayerLibraryLoader$FindBestParam p0){
       KsPlayerCore obj = PatchProxy.applyOneRefs(p0, null, KwaiPlayerCreator.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PlayerLibraryLoader.findCore(p0);
       KwaiPlayerCreatorAemonImpl kwaiPlayerCr = (KsPlayerCore.isKindOfAemon(obj))? new KwaiPlayerCreatorAemonImpl(obj, p0.mProvider, p0.mIsLive): new KwaiPlayerCreatorDefaultImpl();
       return kwaiPlayerCr;
    }
    public abstract KwaiPlayerCreator$InternalKwaiPlayer create();
}
