package com.yxcorp.gifshow.music.radio.MusicRadioPlayStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MusicRadioPlayStatus extends Enum	// class@00206d
{
    public static final MusicRadioPlayStatus[] $VALUES;
    public static final MusicRadioPlayStatus PAUSE;
    public static final MusicRadioPlayStatus PLAY;

    static {
       MusicRadioPlayStatus musicRadioPl1;
       MusicRadioPlayStatus[] musicRadioPl = new MusicRadioPlayStatus[]{musicRadioPl1,musicRadioPl1};
       musicRadioPl1 = new MusicRadioPlayStatus("PLAY", 0);
       MusicRadioPlayStatus.PLAY = musicRadioPl1;
       musicRadioPl1 = new MusicRadioPlayStatus("PAUSE", 1);
       MusicRadioPlayStatus.PAUSE = musicRadioPl1;
       MusicRadioPlayStatus.$VALUES = musicRadioPl;
    }
    public void MusicRadioPlayStatus(String p0,int p1){
       super(p0, p1);
    }
    public static MusicRadioPlayStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicRadioPlayStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MusicRadioPlayStatus.class, p0);
    }
    public static MusicRadioPlayStatus[] values(){
       Object obj = PatchProxy.apply(null, null, MusicRadioPlayStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicRadioPlayStatus.$VALUES.clone();
    }
}
