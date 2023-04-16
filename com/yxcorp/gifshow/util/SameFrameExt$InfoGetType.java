package com.yxcorp.gifshow.util.SameFrameExt$InfoGetType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class SameFrameExt$InfoGetType extends Enum	// class@001f2b
{
    public static final SameFrameExt$InfoGetType[] $VALUES;
    public static final SameFrameExt$InfoGetType None;
    public static final SameFrameExt$InfoGetType QPhoto;
    public static final SameFrameExt$InfoGetType SameFrameInfo;

    static {
       SameFrameExt$InfoGetType infoGetType = new SameFrameExt$InfoGetType("SameFrameInfo", 0);
       SameFrameExt$InfoGetType.SameFrameInfo = infoGetType;
       SameFrameExt$InfoGetType infoGetType1 = new SameFrameExt$InfoGetType("QPhoto", 1);
       SameFrameExt$InfoGetType.QPhoto = infoGetType1;
       SameFrameExt$InfoGetType infoGetType2 = new SameFrameExt$InfoGetType("None", 2);
       SameFrameExt$InfoGetType.None = infoGetType2;
       SameFrameExt$InfoGetType[] infoGetTypeA = new SameFrameExt$InfoGetType[]{infoGetType,infoGetType1,infoGetType2};
       SameFrameExt$InfoGetType.$VALUES = infoGetTypeA;
    }
    public void SameFrameExt$InfoGetType(String p0,int p1){
       super(p0, p1);
    }
    public static SameFrameExt$InfoGetType valueOf(String p0){
       return Enum.valueOf(SameFrameExt$InfoGetType.class, p0);
    }
    public static SameFrameExt$InfoGetType[] values(){
       return SameFrameExt$InfoGetType.$VALUES.clone();
    }
}
