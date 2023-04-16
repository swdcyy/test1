package com.yxcorp.gifshow.common_music_player.utils.RnMusicPlayerState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RnMusicPlayerState extends Enum	// class@001196
{
    public static final RnMusicPlayerState[] $VALUES;
    public static final RnMusicPlayerState LOADING;
    public static final RnMusicPlayerState PLAY;
    public static final RnMusicPlayerState STOP;

    static {
       RnMusicPlayerState rnMusicPlaye1;
       RnMusicPlayerState[] rnMusicPlaye = new RnMusicPlayerState[]{rnMusicPlaye1,rnMusicPlaye1,rnMusicPlaye1};
       rnMusicPlaye1 = new RnMusicPlayerState("STOP", 0);
       RnMusicPlayerState.STOP = rnMusicPlaye1;
       rnMusicPlaye1 = new RnMusicPlayerState("PLAY", 1);
       RnMusicPlayerState.PLAY = rnMusicPlaye1;
       rnMusicPlaye1 = new RnMusicPlayerState("LOADING", 2);
       RnMusicPlayerState.LOADING = rnMusicPlaye1;
       RnMusicPlayerState.$VALUES = rnMusicPlaye;
    }
    public void RnMusicPlayerState(String p0,int p1){
       super(p0, p1);
    }
    public static RnMusicPlayerState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RnMusicPlayerState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RnMusicPlayerState.class, p0);
    }
    public static RnMusicPlayerState[] values(){
       Object obj = PatchProxy.apply(null, null, RnMusicPlayerState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RnMusicPlayerState.$VALUES.clone();
    }
}
