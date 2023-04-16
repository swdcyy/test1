package com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ActivityEvent extends Enum	// class@000fde
{
    public static final ActivityEvent[] $VALUES;
    public static final ActivityEvent CREATE;
    public static final ActivityEvent DESTROY;
    public static final ActivityEvent PAUSE;
    public static final ActivityEvent RESUME;
    public static final ActivityEvent START;
    public static final ActivityEvent STOP;

    static {
       ActivityEvent uActivityEve = new ActivityEvent("CREATE", 0);
       ActivityEvent.CREATE = uActivityEve;
       ActivityEvent uActivityEve1 = new ActivityEvent("START", 1);
       ActivityEvent.START = uActivityEve1;
       ActivityEvent uActivityEve2 = new ActivityEvent("RESUME", 2);
       ActivityEvent.RESUME = uActivityEve2;
       ActivityEvent uActivityEve3 = new ActivityEvent("PAUSE", 3);
       ActivityEvent.PAUSE = uActivityEve3;
       ActivityEvent uActivityEve4 = new ActivityEvent("STOP", 4);
       ActivityEvent.STOP = uActivityEve4;
       ActivityEvent uActivityEve5 = new ActivityEvent("DESTROY", 5);
       ActivityEvent.DESTROY = uActivityEve5;
       ActivityEvent[] uActivityEve6 = new ActivityEvent[]{uActivityEve,uActivityEve1,uActivityEve2,uActivityEve3,uActivityEve4,uActivityEve5};
       ActivityEvent.$VALUES = uActivityEve6;
    }
    public void ActivityEvent(String p0,int p1){
       super(p0, p1);
    }
    public static ActivityEvent valueOf(String p0){
       return Enum.valueOf(ActivityEvent.class, p0);
    }
    public static ActivityEvent[] values(){
       return ActivityEvent.$VALUES.clone();
    }
}
