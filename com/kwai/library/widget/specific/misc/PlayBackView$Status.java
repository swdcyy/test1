package com.kwai.library.widget.specific.misc.PlayBackView$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class PlayBackView$Status extends Enum	// class@000a16
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
       return Enum.valueOf(PlayBackView$Status.class, p0);
    }
    public static PlayBackView$Status[] values(){
       return PlayBackView$Status.$VALUES.clone();
    }
}
