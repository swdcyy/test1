package com.kwai.feature.post.api.music.interfaces.CloudMusicHelper$MusicState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CloudMusicHelper$MusicState extends Enum	// class@001417
{
    public static final CloudMusicHelper$MusicState[] $VALUES;
    public static final CloudMusicHelper$MusicState COMPLETED;
    public static final CloudMusicHelper$MusicState ERROR;
    public static final CloudMusicHelper$MusicState IDLE;
    public static final CloudMusicHelper$MusicState NONE;
    public static final CloudMusicHelper$MusicState PAUSE;
    public static final CloudMusicHelper$MusicState PLAYING;
    public static final CloudMusicHelper$MusicState PREPARING;
    public static final CloudMusicHelper$MusicState STOP;

    static {
       CloudMusicHelper$MusicState musicState = new CloudMusicHelper$MusicState("NONE", 0);
       CloudMusicHelper$MusicState.NONE = musicState;
       CloudMusicHelper$MusicState musicState1 = new CloudMusicHelper$MusicState("IDLE", 1);
       CloudMusicHelper$MusicState.IDLE = musicState1;
       CloudMusicHelper$MusicState musicState2 = new CloudMusicHelper$MusicState("STOP", 2);
       CloudMusicHelper$MusicState.STOP = musicState2;
       CloudMusicHelper$MusicState musicState3 = new CloudMusicHelper$MusicState("PREPARING", 3);
       CloudMusicHelper$MusicState.PREPARING = musicState3;
       CloudMusicHelper$MusicState musicState4 = new CloudMusicHelper$MusicState("PLAYING", 4);
       CloudMusicHelper$MusicState.PLAYING = musicState4;
       CloudMusicHelper$MusicState musicState5 = new CloudMusicHelper$MusicState("PAUSE", 5);
       CloudMusicHelper$MusicState.PAUSE = musicState5;
       CloudMusicHelper$MusicState musicState6 = new CloudMusicHelper$MusicState("COMPLETED", 6);
       CloudMusicHelper$MusicState.COMPLETED = musicState6;
       CloudMusicHelper$MusicState musicState7 = new CloudMusicHelper$MusicState("ERROR", 7);
       CloudMusicHelper$MusicState.ERROR = musicState7;
       CloudMusicHelper$MusicState[] musicStateAr = new CloudMusicHelper$MusicState[]{musicState,musicState1,musicState2,musicState3,musicState4,musicState5,musicState6,musicState7};
       CloudMusicHelper$MusicState.$VALUES = musicStateAr;
    }
    public void CloudMusicHelper$MusicState(String p0,int p1){
       super(p0, p1);
    }
    public static CloudMusicHelper$MusicState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CloudMusicHelper$MusicState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CloudMusicHelper$MusicState.class, p0);
    }
    public static CloudMusicHelper$MusicState[] values(){
       Object obj = PatchProxy.apply(null, null, CloudMusicHelper$MusicState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CloudMusicHelper$MusicState.$VALUES.clone();
    }
    public boolean isCompleted(){
       boolean b = (this == CloudMusicHelper$MusicState.COMPLETED)? true: false;
       return b;
    }
    public boolean isError(){
       boolean b = (this == CloudMusicHelper$MusicState.ERROR)? true: false;
       return b;
    }
    public boolean isIdle(){
       boolean b = (this == CloudMusicHelper$MusicState.IDLE)? true: false;
       return b;
    }
    public boolean isNone(){
       boolean b = (this == CloudMusicHelper$MusicState.NONE)? true: false;
       return b;
    }
    public boolean isPause(){
       boolean b = (this == CloudMusicHelper$MusicState.PAUSE)? true: false;
       return b;
    }
    public boolean isPlaying(){
       boolean b = (this == CloudMusicHelper$MusicState.PLAYING)? true: false;
       return b;
    }
    public boolean isPreparing(){
       boolean b = (this == CloudMusicHelper$MusicState.PREPARING)? true: false;
       return b;
    }
    public boolean isStop(){
       boolean b = (this == CloudMusicHelper$MusicState.STOP)? true: false;
       return b;
    }
}
