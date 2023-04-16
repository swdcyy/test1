package com.yxcorp.gifshow.common_music_player.PlayBackView$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PlayBackView$Status extends Enum	// class@00118e
{
    public static final PlayBackView$Status[] $VALUES;
    public static final PlayBackView$Status LOADING;
    public static final PlayBackView$Status PAUSE;
    public static final PlayBackView$Status PLAY;

    static {
       PlayBackView$Status status = new PlayBackView$Status("PLAY", 0);
       PlayBackView$Status.PLAY = status;
       PlayBackView$Status status1 = new PlayBackView$Status("LOADING", 1);
       PlayBackView$Status.LOADING = status1;
       PlayBackView$Status status2 = new PlayBackView$Status("PAUSE", 2);
       PlayBackView$Status.PAUSE = status2;
       PlayBackView$Status[] statusArray = new PlayBackView$Status[]{status,status1,status2};
       PlayBackView$Status.$VALUES = statusArray;
    }
    public void PlayBackView$Status(String p0,int p1){
       super(p0, p1);
    }
    public static PlayBackView$Status valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PlayBackView$Status.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PlayBackView$Status.class, p0);
    }
    public static PlayBackView$Status[] values(){
       Object obj = PatchProxy.apply(null, null, PlayBackView$Status.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PlayBackView$Status.$VALUES.clone();
    }
}
