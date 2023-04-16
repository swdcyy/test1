package com.kwai.library.widget.gray.inter.KwaiGrayLogEvent;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class KwaiGrayLogEvent extends Enum	// class@000941
{
    public static final KwaiGrayLogEvent[] $VALUES;
    public static final KwaiGrayLogEvent ENTER;
    public static final KwaiGrayLogEvent GRAY_START;
    public static final KwaiGrayLogEvent GRAY_SUCCESS;

    static {
       KwaiGrayLogEvent kwaiGrayLogE1;
       KwaiGrayLogEvent[] kwaiGrayLogE = new KwaiGrayLogEvent[]{kwaiGrayLogE1,kwaiGrayLogE1,kwaiGrayLogE1};
       kwaiGrayLogE1 = new KwaiGrayLogEvent("ENTER", 0);
       KwaiGrayLogEvent.ENTER = kwaiGrayLogE1;
       kwaiGrayLogE1 = new KwaiGrayLogEvent("GRAY_START", 1);
       KwaiGrayLogEvent.GRAY_START = kwaiGrayLogE1;
       kwaiGrayLogE1 = new KwaiGrayLogEvent("GRAY_SUCCESS", 2);
       KwaiGrayLogEvent.GRAY_SUCCESS = kwaiGrayLogE1;
       KwaiGrayLogEvent.$VALUES = kwaiGrayLogE;
    }
    public void KwaiGrayLogEvent(String p0,int p1){
       super(p0, p1);
    }
    public static KwaiGrayLogEvent valueOf(String p0){
       return Enum.valueOf(KwaiGrayLogEvent.class, p0);
    }
    public static KwaiGrayLogEvent[] values(){
       return KwaiGrayLogEvent.$VALUES.clone();
    }
}
