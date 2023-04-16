package com.yxcorp.gifshow.player.KsAudioPlayerState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KsAudioPlayerState extends Enum	// class@000fb5
{
    public int mIndex;
    public static final KsAudioPlayerState[] $VALUES;
    public static final KsAudioPlayerState IDLE;
    public static final KsAudioPlayerState INITIALIZED;
    public static final KsAudioPlayerState PAUSED;
    public static final KsAudioPlayerState RELEASED;
    public static final KsAudioPlayerState STARTED;

    static {
       KsAudioPlayerState ksAudioPlaye = new KsAudioPlayerState("IDLE", 0, 0);
       KsAudioPlayerState.IDLE = ksAudioPlaye;
       KsAudioPlayerState ksAudioPlaye1 = new KsAudioPlayerState("INITIALIZED", 1, 1);
       KsAudioPlayerState.INITIALIZED = ksAudioPlaye1;
       KsAudioPlayerState ksAudioPlaye2 = new KsAudioPlayerState("STARTED", 2, 2);
       KsAudioPlayerState.STARTED = ksAudioPlaye2;
       KsAudioPlayerState ksAudioPlaye3 = new KsAudioPlayerState("PAUSED", 3, 3);
       KsAudioPlayerState.PAUSED = ksAudioPlaye3;
       KsAudioPlayerState ksAudioPlaye4 = new KsAudioPlayerState("RELEASED", 4, 4);
       KsAudioPlayerState.RELEASED = ksAudioPlaye4;
       KsAudioPlayerState[] ksAudioPlaye5 = new KsAudioPlayerState[]{ksAudioPlaye,ksAudioPlaye1,ksAudioPlaye2,ksAudioPlaye3,ksAudioPlaye4};
       KsAudioPlayerState.$VALUES = ksAudioPlaye5;
    }
    public void KsAudioPlayerState(String p0,int p1,int p2){
       super(p0, p1);
       this.mIndex = p2;
    }
    public static KsAudioPlayerState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsAudioPlayerState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsAudioPlayerState.class, p0);
    }
    public static KsAudioPlayerState[] values(){
       Object obj = PatchProxy.apply(null, null, KsAudioPlayerState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsAudioPlayerState.$VALUES.clone();
    }
    public int index(){
       return this.mIndex;
    }
}
