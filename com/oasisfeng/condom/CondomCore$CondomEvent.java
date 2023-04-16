package com.oasisfeng.condom.CondomCore$CondomEvent;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class CondomCore$CondomEvent extends Enum	// class@000a74
{
    public static final CondomCore$CondomEvent[] $VALUES;
    public static final CondomCore$CondomEvent BIND_PASS;
    public static final CondomCore$CondomEvent CONCERN;
    public static final CondomCore$CondomEvent FILTER_BG_SERVICE;
    public static final CondomCore$CondomEvent START_PASS;

    static {
       CondomCore$CondomEvent uCondomEvent = new CondomCore$CondomEvent("CONCERN", 0);
       CondomCore$CondomEvent.CONCERN = uCondomEvent;
       CondomCore$CondomEvent uCondomEvent1 = new CondomCore$CondomEvent("BIND_PASS", 1);
       CondomCore$CondomEvent.BIND_PASS = uCondomEvent1;
       CondomCore$CondomEvent uCondomEvent2 = new CondomCore$CondomEvent("START_PASS", 2);
       CondomCore$CondomEvent.START_PASS = uCondomEvent2;
       CondomCore$CondomEvent uCondomEvent3 = new CondomCore$CondomEvent("FILTER_BG_SERVICE", 3);
       CondomCore$CondomEvent.FILTER_BG_SERVICE = uCondomEvent3;
       CondomCore$CondomEvent[] uCondomEvent4 = new CondomCore$CondomEvent[]{uCondomEvent,uCondomEvent1,uCondomEvent2,uCondomEvent3};
       CondomCore$CondomEvent.$VALUES = uCondomEvent4;
    }
    public void CondomCore$CondomEvent(String p0,int p1){
       super(p0, p1);
    }
    public static CondomCore$CondomEvent valueOf(String p0){
       return Enum.valueOf(CondomCore$CondomEvent.class, p0);
    }
    public static CondomCore$CondomEvent[] values(){
       return CondomCore$CondomEvent.$VALUES.clone();
    }
}
