package com.kwai.library.push.model.InAppEvent$Event;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class InAppEvent$Event extends Enum	// class@0008d0
{
    public static final InAppEvent$Event[] $VALUES;
    public static final InAppEvent$Event CLICK_BTN;
    public static final InAppEvent$Event CLICK_NOTICE;
    public static final InAppEvent$Event END_NOTICE;
    public static final InAppEvent$Event IN_QUEUE;
    public static final InAppEvent$Event ON_ENTER;
    public static final InAppEvent$Event OUT_QUEUE;
    public static final InAppEvent$Event PULLUP_NOTICE;
    public static final InAppEvent$Event SHOW_NOTICE;
    public static final InAppEvent$Event UPDATE_NOTICE;

    static {
       InAppEvent$Event uEvent = new InAppEvent$Event("IN_QUEUE", 0);
       InAppEvent$Event.IN_QUEUE = uEvent;
       InAppEvent$Event uEvent1 = new InAppEvent$Event("OUT_QUEUE", 1);
       InAppEvent$Event.OUT_QUEUE = uEvent1;
       InAppEvent$Event uEvent2 = new InAppEvent$Event("ON_ENTER", 2);
       InAppEvent$Event.ON_ENTER = uEvent2;
       InAppEvent$Event uEvent3 = new InAppEvent$Event("SHOW_NOTICE", 3);
       InAppEvent$Event.SHOW_NOTICE = uEvent3;
       InAppEvent$Event uEvent4 = new InAppEvent$Event("UPDATE_NOTICE", 4);
       InAppEvent$Event.UPDATE_NOTICE = uEvent4;
       InAppEvent$Event uEvent5 = new InAppEvent$Event("CLICK_NOTICE", 5);
       InAppEvent$Event.CLICK_NOTICE = uEvent5;
       InAppEvent$Event uEvent6 = new InAppEvent$Event("CLICK_BTN", 6);
       InAppEvent$Event.CLICK_BTN = uEvent6;
       InAppEvent$Event uEvent7 = new InAppEvent$Event("PULLUP_NOTICE", 7);
       InAppEvent$Event.PULLUP_NOTICE = uEvent7;
       InAppEvent$Event uEvent8 = new InAppEvent$Event("END_NOTICE", 8);
       InAppEvent$Event.END_NOTICE = uEvent8;
       InAppEvent$Event[] uEventArray = new InAppEvent$Event[9];
       uEventArray[0] = uEvent;
       uEventArray[1] = uEvent1;
       uEventArray[2] = uEvent2;
       uEventArray[3] = uEvent3;
       uEventArray[4] = uEvent4;
       uEventArray[5] = uEvent5;
       uEventArray[6] = uEvent6;
       uEventArray[7] = uEvent7;
       uEventArray[8] = uEvent8;
       InAppEvent$Event.$VALUES = uEventArray;
    }
    public void InAppEvent$Event(String p0,int p1){
       super(p0, p1);
    }
    public static InAppEvent$Event valueOf(String p0){
       return Enum.valueOf(InAppEvent$Event.class, p0);
    }
    public static InAppEvent$Event[] values(){
       return InAppEvent$Event.$VALUES.clone();
    }
}
