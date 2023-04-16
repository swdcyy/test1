package com.kwai.stentor.voicechange.VCResultType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class VCResultType extends Enum	// class@00190d
{
    public int value;
    public static final VCResultType[] $VALUES;
    public static final VCResultType VCResultTypeFull;
    public static final VCResultType VCResultTypeSegment;
    public static final VCResultType VCResultTypeUnknown;

    static {
       VCResultType vCResultType = new VCResultType("VCResultTypeSegment", 0, 0);
       VCResultType.VCResultTypeSegment = vCResultType;
       VCResultType vCResultType1 = new VCResultType("VCResultTypeFull", 1, 1);
       VCResultType.VCResultTypeFull = vCResultType1;
       VCResultType vCResultType2 = new VCResultType("VCResultTypeUnknown", 2, -1);
       VCResultType.VCResultTypeUnknown = vCResultType2;
       VCResultType[] vCResultType3 = new VCResultType[]{vCResultType,vCResultType1,vCResultType2};
       VCResultType.$VALUES = vCResultType3;
    }
    public void VCResultType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static VCResultType valueOf(String p0){
       return Enum.valueOf(VCResultType.class, p0);
    }
    public static VCResultType[] values(){
       return VCResultType.$VALUES.clone();
    }
    public VCResultType fromValue(int p0){
       if (!p0) {
          return VCResultType.VCResultTypeSegment;
       }
       if (p0 != 1) {
          return VCResultType.VCResultTypeUnknown;
       }
       return VCResultType.VCResultTypeFull;
    }
    public int value(){
       return this.value;
    }
}
