package com.yxcorp.gifshow.music.radio.notification.MusicRadioNotificationStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MusicRadioNotificationStatus extends Enum	// class@002075
{
    public static final MusicRadioNotificationStatus[] $VALUES;
    public static final MusicRadioNotificationStatus CLICK;
    public static final MusicRadioNotificationStatus NEXT;
    public static final MusicRadioNotificationStatus PAUSE;
    public static final MusicRadioNotificationStatus PLAY;
    public static final MusicRadioNotificationStatus PRE;
    public static final MusicRadioNotificationStatus SEEK;

    static {
       MusicRadioNotificationStatus musicRadioNo1;
       MusicRadioNotificationStatus[] musicRadioNo = new MusicRadioNotificationStatus[]{musicRadioNo1,musicRadioNo1,musicRadioNo1,musicRadioNo1,musicRadioNo1,musicRadioNo1};
       musicRadioNo1 = new MusicRadioNotificationStatus("PLAY", 0);
       MusicRadioNotificationStatus.PLAY = musicRadioNo1;
       musicRadioNo1 = new MusicRadioNotificationStatus("PAUSE", 1);
       MusicRadioNotificationStatus.PAUSE = musicRadioNo1;
       musicRadioNo1 = new MusicRadioNotificationStatus("PRE", 2);
       MusicRadioNotificationStatus.PRE = musicRadioNo1;
       musicRadioNo1 = new MusicRadioNotificationStatus("NEXT", 3);
       MusicRadioNotificationStatus.NEXT = musicRadioNo1;
       musicRadioNo1 = new MusicRadioNotificationStatus("CLICK", 4);
       MusicRadioNotificationStatus.CLICK = musicRadioNo1;
       musicRadioNo1 = new MusicRadioNotificationStatus("SEEK", 5);
       MusicRadioNotificationStatus.SEEK = musicRadioNo1;
       MusicRadioNotificationStatus.$VALUES = musicRadioNo;
    }
    public void MusicRadioNotificationStatus(String p0,int p1){
       super(p0, p1);
    }
    public static MusicRadioNotificationStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicRadioNotificationStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MusicRadioNotificationStatus.class, p0);
    }
    public static MusicRadioNotificationStatus[] values(){
       Object obj = PatchProxy.apply(null, null, MusicRadioNotificationStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicRadioNotificationStatus.$VALUES.clone();
    }
}
