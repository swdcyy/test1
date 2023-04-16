package com.kwai.library.widget.map.IMarkerOptions$IMarkerAnimateType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class IMarkerOptions$IMarkerAnimateType extends Enum	// class@000961
{
    public static final IMarkerOptions$IMarkerAnimateType[] $VALUES;
    public static final IMarkerOptions$IMarkerAnimateType drop;
    public static final IMarkerOptions$IMarkerAnimateType grow;
    public static final IMarkerOptions$IMarkerAnimateType jump;
    public static final IMarkerOptions$IMarkerAnimateType none;

    static {
       IMarkerOptions$IMarkerAnimateType iMarkerAnima = new IMarkerOptions$IMarkerAnimateType("none", 0);
       IMarkerOptions$IMarkerAnimateType.none = iMarkerAnima;
       IMarkerOptions$IMarkerAnimateType iMarkerAnima1 = new IMarkerOptions$IMarkerAnimateType("drop", 1);
       IMarkerOptions$IMarkerAnimateType.drop = iMarkerAnima1;
       IMarkerOptions$IMarkerAnimateType iMarkerAnima2 = new IMarkerOptions$IMarkerAnimateType("grow", 2);
       IMarkerOptions$IMarkerAnimateType.grow = iMarkerAnima2;
       IMarkerOptions$IMarkerAnimateType iMarkerAnima3 = new IMarkerOptions$IMarkerAnimateType("jump", 3);
       IMarkerOptions$IMarkerAnimateType.jump = iMarkerAnima3;
       IMarkerOptions$IMarkerAnimateType[] iMarkerAnima4 = new IMarkerOptions$IMarkerAnimateType[]{iMarkerAnima,iMarkerAnima1,iMarkerAnima2,iMarkerAnima3};
       IMarkerOptions$IMarkerAnimateType.$VALUES = iMarkerAnima4;
    }
    public void IMarkerOptions$IMarkerAnimateType(String p0,int p1){
       super(p0, p1);
    }
    public static IMarkerOptions$IMarkerAnimateType valueOf(String p0){
       return Enum.valueOf(IMarkerOptions$IMarkerAnimateType.class, p0);
    }
    public static IMarkerOptions$IMarkerAnimateType[] values(){
       return IMarkerOptions$IMarkerAnimateType.$VALUES.clone();
    }
}
