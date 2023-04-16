package com.yxcorp.gifshow.numberfour.NumberFourEventType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class NumberFourEventType extends Enum	// class@0021ce
{
    public byte type;
    public static final NumberFourEventType[] $VALUES;
    public static final NumberFourEventType CLICK_EVENT;
    public static final NumberFourEventType ELEMENT_SHOW;
    public static final NumberFourEventType PAGE_SHOW;

    static {
       NumberFourEventType numberFourEv = new NumberFourEventType("PAGE_SHOW", 0, 1);
       NumberFourEventType.PAGE_SHOW = numberFourEv;
       NumberFourEventType numberFourEv1 = new NumberFourEventType("ELEMENT_SHOW", 1, 2);
       NumberFourEventType.ELEMENT_SHOW = numberFourEv1;
       NumberFourEventType numberFourEv2 = new NumberFourEventType("CLICK_EVENT", 2, 3);
       NumberFourEventType.CLICK_EVENT = numberFourEv2;
       NumberFourEventType[] numberFourEv3 = new NumberFourEventType[]{numberFourEv,numberFourEv1,numberFourEv2};
       NumberFourEventType.$VALUES = numberFourEv3;
    }
    public void NumberFourEventType(String p0,int p1,byte p2){
       super(p0, p1);
       this.type = p2;
    }
    public static NumberFourEventType valueOf(String p0){
       return Enum.valueOf(NumberFourEventType.class, p0);
    }
    public static NumberFourEventType[] values(){
       return NumberFourEventType.$VALUES.clone();
    }
    public byte getType(){
       return this.type;
    }
}
