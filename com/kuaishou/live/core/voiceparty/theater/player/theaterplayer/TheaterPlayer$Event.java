package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer$Event;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TheaterPlayer$Event extends Enum	// class@0019c3
{
    public static final TheaterPlayer$Event[] $VALUES;
    public static final TheaterPlayer$Event BEGIN_BUFFER;
    public static final TheaterPlayer$Event CONNECTION_BROKEN;
    public static final TheaterPlayer$Event END_BUFFER;
    public static final TheaterPlayer$Event SEEK_COMPLETED;
    public static final TheaterPlayer$Event START_RENDERING;
    public static final TheaterPlayer$Event VIDEO_SIZE_CHANGE;

    static {
       TheaterPlayer$Event uEvent;
       TheaterPlayer$Event[] uEventArray = new TheaterPlayer$Event[]{uEvent,uEvent,uEvent,uEvent,uEvent,uEvent};
       uEvent = new TheaterPlayer$Event("START_RENDERING", 0);
       TheaterPlayer$Event.START_RENDERING = uEvent;
       uEvent = new TheaterPlayer$Event("BEGIN_BUFFER", 1);
       TheaterPlayer$Event.BEGIN_BUFFER = uEvent;
       uEvent = new TheaterPlayer$Event("END_BUFFER", 2);
       TheaterPlayer$Event.END_BUFFER = uEvent;
       uEvent = new TheaterPlayer$Event("VIDEO_SIZE_CHANGE", 3);
       TheaterPlayer$Event.VIDEO_SIZE_CHANGE = uEvent;
       uEvent = new TheaterPlayer$Event("SEEK_COMPLETED", 4);
       TheaterPlayer$Event.SEEK_COMPLETED = uEvent;
       uEvent = new TheaterPlayer$Event("CONNECTION_BROKEN", 5);
       TheaterPlayer$Event.CONNECTION_BROKEN = uEvent;
       TheaterPlayer$Event.$VALUES = uEventArray;
    }
    public void TheaterPlayer$Event(String p0,int p1){
       super(p0, p1);
    }
    public static TheaterPlayer$Event valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TheaterPlayer$Event.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TheaterPlayer$Event.class, p0);
    }
    public static TheaterPlayer$Event[] values(){
       Object obj = PatchProxy.apply(null, null, TheaterPlayer$Event.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TheaterPlayer$Event.$VALUES.clone();
    }
}
