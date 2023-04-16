package com.kwai.feature.post.api.music.interfaces.CloudMusicHelper$PlayerEvent;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CloudMusicHelper$PlayerEvent extends Enum	// class@001418
{
    public static final CloudMusicHelper$PlayerEvent[] $VALUES;
    public static final CloudMusicHelper$PlayerEvent PAUSE;
    public static final CloudMusicHelper$PlayerEvent PLAY;
    public static final CloudMusicHelper$PlayerEvent RELEASE;
    public static final CloudMusicHelper$PlayerEvent RESET;
    public static final CloudMusicHelper$PlayerEvent STOP;

    static {
       CloudMusicHelper$PlayerEvent playerEvent = new CloudMusicHelper$PlayerEvent("PLAY", 0);
       CloudMusicHelper$PlayerEvent.PLAY = playerEvent;
       CloudMusicHelper$PlayerEvent playerEvent1 = new CloudMusicHelper$PlayerEvent("PAUSE", 1);
       CloudMusicHelper$PlayerEvent.PAUSE = playerEvent1;
       CloudMusicHelper$PlayerEvent playerEvent2 = new CloudMusicHelper$PlayerEvent("STOP", 2);
       CloudMusicHelper$PlayerEvent.STOP = playerEvent2;
       CloudMusicHelper$PlayerEvent playerEvent3 = new CloudMusicHelper$PlayerEvent("RESET", 3);
       CloudMusicHelper$PlayerEvent.RESET = playerEvent3;
       CloudMusicHelper$PlayerEvent playerEvent4 = new CloudMusicHelper$PlayerEvent("RELEASE", 4);
       CloudMusicHelper$PlayerEvent.RELEASE = playerEvent4;
       CloudMusicHelper$PlayerEvent[] playerEventA = new CloudMusicHelper$PlayerEvent[]{playerEvent,playerEvent1,playerEvent2,playerEvent3,playerEvent4};
       CloudMusicHelper$PlayerEvent.$VALUES = playerEventA;
    }
    public void CloudMusicHelper$PlayerEvent(String p0,int p1){
       super(p0, p1);
    }
    public static CloudMusicHelper$PlayerEvent valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CloudMusicHelper$PlayerEvent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CloudMusicHelper$PlayerEvent.class, p0);
    }
    public static CloudMusicHelper$PlayerEvent[] values(){
       Object obj = PatchProxy.apply(null, null, CloudMusicHelper$PlayerEvent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CloudMusicHelper$PlayerEvent.$VALUES.clone();
    }
}
