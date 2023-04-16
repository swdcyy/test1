package com.horcrux.svg.RNSVGMarkerType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class RNSVGMarkerType extends Enum	// class@0005b9
{
    public static final RNSVGMarkerType[] $VALUES;
    public static final RNSVGMarkerType kEndMarker;
    public static final RNSVGMarkerType kMidMarker;
    public static final RNSVGMarkerType kStartMarker;

    static {
       RNSVGMarkerType rNSVGMarkerT = new RNSVGMarkerType("kStartMarker", 0);
       RNSVGMarkerType.kStartMarker = rNSVGMarkerT;
       RNSVGMarkerType rNSVGMarkerT1 = new RNSVGMarkerType("kMidMarker", 1);
       RNSVGMarkerType.kMidMarker = rNSVGMarkerT1;
       RNSVGMarkerType rNSVGMarkerT2 = new RNSVGMarkerType("kEndMarker", 2);
       RNSVGMarkerType.kEndMarker = rNSVGMarkerT2;
       RNSVGMarkerType[] rNSVGMarkerT3 = new RNSVGMarkerType[]{rNSVGMarkerT,rNSVGMarkerT1,rNSVGMarkerT2};
       RNSVGMarkerType.$VALUES = rNSVGMarkerT3;
    }
    public void RNSVGMarkerType(String p0,int p1){
       super(p0, p1);
    }
    public static RNSVGMarkerType valueOf(String p0){
       return Enum.valueOf(RNSVGMarkerType.class, p0);
    }
    public static RNSVGMarkerType[] values(){
       return RNSVGMarkerType.$VALUES.clone();
    }
}
