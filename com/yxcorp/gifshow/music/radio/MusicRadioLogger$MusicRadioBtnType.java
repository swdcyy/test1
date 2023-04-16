package com.yxcorp.gifshow.music.radio.MusicRadioLogger$MusicRadioBtnType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MusicRadioLogger$MusicRadioBtnType extends Enum	// class@00206b
{
    public final String type;
    public static final MusicRadioLogger$MusicRadioBtnType[] $VALUES;
    public static final MusicRadioLogger$MusicRadioBtnType MUSIC_RADIO_CLOCK;
    public static final MusicRadioLogger$MusicRadioBtnType MUSIC_RADIO_LIST;
    public static final MusicRadioLogger$MusicRadioBtnType MUSIC_RADIO_MODEL;
    public static final MusicRadioLogger$MusicRadioBtnType MUSIC_RADIO_NEXT;
    public static final MusicRadioLogger$MusicRadioBtnType MUSIC_RADIO_PLAY;
    public static final MusicRadioLogger$MusicRadioBtnType MUSIC_RADIO_PRE;
    public static final MusicRadioLogger$MusicRadioBtnType MUSIC_RADIO_TIMER;

    static {
       MusicRadioLogger$MusicRadioBtnType musicRadioBt1;
       MusicRadioLogger$MusicRadioBtnType[] musicRadioBt = new MusicRadioLogger$MusicRadioBtnType[]{musicRadioBt1,musicRadioBt1,musicRadioBt1,musicRadioBt1,musicRadioBt1,musicRadioBt1,musicRadioBt1};
       musicRadioBt1 = new MusicRadioLogger$MusicRadioBtnType("MUSIC_RADIO_CLOCK", 0, "CLOCK");
       MusicRadioLogger$MusicRadioBtnType.MUSIC_RADIO_CLOCK = musicRadioBt1;
       musicRadioBt1 = new MusicRadioLogger$MusicRadioBtnType("MUSIC_RADIO_TIMER", 1, "TIMER");
       MusicRadioLogger$MusicRadioBtnType.MUSIC_RADIO_TIMER = musicRadioBt1;
       musicRadioBt1 = new MusicRadioLogger$MusicRadioBtnType("MUSIC_RADIO_NEXT", 2, "NEXT");
       MusicRadioLogger$MusicRadioBtnType.MUSIC_RADIO_NEXT = musicRadioBt1;
       musicRadioBt1 = new MusicRadioLogger$MusicRadioBtnType("MUSIC_RADIO_PRE", 3, "PREVIOUS");
       MusicRadioLogger$MusicRadioBtnType.MUSIC_RADIO_PRE = musicRadioBt1;
       musicRadioBt1 = new MusicRadioLogger$MusicRadioBtnType("MUSIC_RADIO_PLAY", 4, "PLAY");
       MusicRadioLogger$MusicRadioBtnType.MUSIC_RADIO_PLAY = musicRadioBt1;
       musicRadioBt1 = new MusicRadioLogger$MusicRadioBtnType("MUSIC_RADIO_MODEL", 5, "MODE");
       MusicRadioLogger$MusicRadioBtnType.MUSIC_RADIO_MODEL = musicRadioBt1;
       musicRadioBt1 = new MusicRadioLogger$MusicRadioBtnType("MUSIC_RADIO_LIST", 6, "LIST");
       MusicRadioLogger$MusicRadioBtnType.MUSIC_RADIO_LIST = musicRadioBt1;
       MusicRadioLogger$MusicRadioBtnType.$VALUES = musicRadioBt;
    }
    public void MusicRadioLogger$MusicRadioBtnType(String p0,int p1,String p2){
       super(p0, p1);
       this.type = p2;
    }
    public static MusicRadioLogger$MusicRadioBtnType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicRadioLogger$MusicRadioBtnType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MusicRadioLogger$MusicRadioBtnType.class, p0);
    }
    public static MusicRadioLogger$MusicRadioBtnType[] values(){
       Object obj = PatchProxy.apply(null, null, MusicRadioLogger$MusicRadioBtnType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicRadioLogger$MusicRadioBtnType.$VALUES.clone();
    }
    public final String getType(){
       return this.type;
    }
}
