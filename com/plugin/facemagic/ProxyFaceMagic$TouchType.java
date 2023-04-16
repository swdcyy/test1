package com.plugin.facemagic.ProxyFaceMagic$TouchType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ProxyFaceMagic$TouchType extends Enum	// class@000b4d
{
    public static final ProxyFaceMagic$TouchType[] $VALUES;
    public static final ProxyFaceMagic$TouchType TouchBegin;
    public static final ProxyFaceMagic$TouchType TouchEnd;
    public static final ProxyFaceMagic$TouchType TouchMove;
    public static final ProxyFaceMagic$TouchType TouchUnknown;

    static {
       ProxyFaceMagic$TouchType touchType = new ProxyFaceMagic$TouchType("TouchUnknown", 0);
       ProxyFaceMagic$TouchType.TouchUnknown = touchType;
       ProxyFaceMagic$TouchType touchType1 = new ProxyFaceMagic$TouchType("TouchBegin", 1);
       ProxyFaceMagic$TouchType.TouchBegin = touchType1;
       ProxyFaceMagic$TouchType touchType2 = new ProxyFaceMagic$TouchType("TouchMove", 2);
       ProxyFaceMagic$TouchType.TouchMove = touchType2;
       ProxyFaceMagic$TouchType touchType3 = new ProxyFaceMagic$TouchType("TouchEnd", 3);
       ProxyFaceMagic$TouchType.TouchEnd = touchType3;
       ProxyFaceMagic$TouchType[] touchTypeArr = new ProxyFaceMagic$TouchType[]{touchType,touchType1,touchType2,touchType3};
       ProxyFaceMagic$TouchType.$VALUES = touchTypeArr;
    }
    public void ProxyFaceMagic$TouchType(String p0,int p1){
       super(p0, p1);
    }
    public static ProxyFaceMagic$TouchType valueOf(String p0){
       return Enum.valueOf(ProxyFaceMagic$TouchType.class, p0);
    }
    public static ProxyFaceMagic$TouchType[] values(){
       return ProxyFaceMagic$TouchType.$VALUES.clone();
    }
}
