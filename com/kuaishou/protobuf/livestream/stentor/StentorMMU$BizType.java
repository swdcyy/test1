package com.kuaishou.protobuf.livestream.stentor.StentorMMU$BizType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$BizType$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$BizType$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class StentorMMU$BizType extends Enum implements Internal$EnumLite	// class@000d86
{
    public final int value;
    public static final StentorMMU$BizType[] $VALUES;
    public static final StentorMMU$BizType LIVE_ROBOT;
    public static final StentorMMU$BizType UNKNOWN;
    public static final StentorMMU$BizType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       StentorMMU$BizType uBizType = new StentorMMU$BizType("UNKNOWN", 0, 0);
       StentorMMU$BizType.UNKNOWN = uBizType;
       StentorMMU$BizType uBizType1 = new StentorMMU$BizType("LIVE_ROBOT", 1, 1);
       StentorMMU$BizType.LIVE_ROBOT = uBizType1;
       StentorMMU$BizType uBizType2 = new StentorMMU$BizType("UNRECOGNIZED", 2, -1);
       StentorMMU$BizType.UNRECOGNIZED = uBizType2;
       StentorMMU$BizType[] uBizTypeArra = new StentorMMU$BizType[]{uBizType,uBizType1,uBizType2};
       StentorMMU$BizType.$VALUES = uBizTypeArra;
       StentorMMU$BizType.internalValueMap = new StentorMMU$BizType$a();
    }
    public void StentorMMU$BizType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static StentorMMU$BizType forNumber(int p0){
       if (!p0) {
          return StentorMMU$BizType.UNKNOWN;
       }
       if (p0 != 1) {
          return null;
       }
       return StentorMMU$BizType.LIVE_ROBOT;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return StentorMMU$BizType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return StentorMMU$BizType$b.a;
    }
    public static StentorMMU$BizType valueOf(int p0){
       return StentorMMU$BizType.forNumber(p0);
    }
    public static StentorMMU$BizType valueOf(String p0){
       return Enum.valueOf(StentorMMU$BizType.class, p0);
    }
    public static StentorMMU$BizType[] values(){
       return StentorMMU$BizType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != StentorMMU$BizType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
