package com.kwaishou.merchant.daccore.event.ELiveEvent;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ELiveEvent extends Enum	// class@00131b
{
    public static final ELiveEvent[] $VALUES;
    public static final ELiveEvent LIVE_BIND;
    public static final ELiveEvent LIVE_CREATE;
    public static final ELiveEvent LIVE_DESTROY;
    public static final ELiveEvent LIVE_STOP;
    public static final ELiveEvent LIVE_UNBIND;
    public static final ELiveEvent PAGE_HIDE;
    public static final ELiveEvent PAGE_SHOW;

    static {
       ELiveEvent uELiveEvent;
       ELiveEvent[] uELiveEventA = new ELiveEvent[]{uELiveEvent,uELiveEvent,uELiveEvent,uELiveEvent,uELiveEvent,uELiveEvent,uELiveEvent};
       uELiveEvent = new ELiveEvent("LIVE_CREATE", 0);
       ELiveEvent.LIVE_CREATE = uELiveEvent;
       uELiveEvent = new ELiveEvent("LIVE_BIND", 1);
       ELiveEvent.LIVE_BIND = uELiveEvent;
       uELiveEvent = new ELiveEvent("LIVE_UNBIND", 2);
       ELiveEvent.LIVE_UNBIND = uELiveEvent;
       uELiveEvent = new ELiveEvent("LIVE_DESTROY", 3);
       ELiveEvent.LIVE_DESTROY = uELiveEvent;
       uELiveEvent = new ELiveEvent("LIVE_STOP", 4);
       ELiveEvent.LIVE_STOP = uELiveEvent;
       uELiveEvent = new ELiveEvent("PAGE_SHOW", 5);
       ELiveEvent.PAGE_SHOW = uELiveEvent;
       uELiveEvent = new ELiveEvent("PAGE_HIDE", 6);
       ELiveEvent.PAGE_HIDE = uELiveEvent;
       ELiveEvent.$VALUES = uELiveEventA;
    }
    public void ELiveEvent(String p0,int p1){
       super(p0, p1);
    }
    public static ELiveEvent valueOf(String p0){
       return Enum.valueOf(ELiveEvent.class, p0);
    }
    public static ELiveEvent[] values(){
       return ELiveEvent.$VALUES.clone();
    }
}
