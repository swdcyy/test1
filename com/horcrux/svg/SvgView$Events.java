package com.horcrux.svg.SvgView$Events;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class SvgView$Events extends Enum	// class@0005f5
{
    public final String mName;
    public static final SvgView$Events[] $VALUES;
    public static final SvgView$Events EVENT_DATA_URL;

    static {
       SvgView$Events uEvents = new SvgView$Events("EVENT_DATA_URL", 0, "onDataURL");
       SvgView$Events.EVENT_DATA_URL = uEvents;
       SvgView$Events[] uEventsArray = new SvgView$Events[]{uEvents};
       SvgView$Events.$VALUES = uEventsArray;
    }
    public void SvgView$Events(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static SvgView$Events valueOf(String p0){
       return Enum.valueOf(SvgView$Events.class, p0);
    }
    public static SvgView$Events[] values(){
       return SvgView$Events.$VALUES.clone();
    }
    public String toString(){
       return this.mName;
    }
}
