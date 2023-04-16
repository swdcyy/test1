package com.google.common.collect.BoundType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class BoundType extends Enum	// class@0017a7
{
    public final boolean inclusive;
    public static final BoundType[] $VALUES;
    public static final BoundType CLOSED;
    public static final BoundType OPEN;

    static {
       BoundType uBoundType = new BoundType("OPEN", 0, 0);
       BoundType.OPEN = uBoundType;
       BoundType uBoundType1 = new BoundType("CLOSED", 1, 1);
       BoundType.CLOSED = uBoundType1;
       BoundType[] uBoundTypeAr = new BoundType[]{uBoundType,uBoundType1};
       BoundType.$VALUES = uBoundTypeAr;
    }
    public void BoundType(String p0,int p1,boolean p2){
       super(p0, p1);
       this.inclusive = p2;
    }
    public static BoundType forBoolean(boolean p0){
       BoundType cLOSED = (p0)? BoundType.CLOSED: BoundType.OPEN;
       return cLOSED;
    }
    public static BoundType valueOf(String p0){
       return Enum.valueOf(BoundType.class, p0);
    }
    public static BoundType[] values(){
       return BoundType.$VALUES.clone();
    }
    public BoundType flip(){
       return BoundType.forBoolean((this.inclusive ^ 0x01));
    }
}
