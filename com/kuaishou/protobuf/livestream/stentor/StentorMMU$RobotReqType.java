package com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotReqType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotReqType$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotReqType$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class StentorMMU$RobotReqType extends Enum implements Internal$EnumLite	// class@000d9b
{
    public final int value;
    public static final StentorMMU$RobotReqType[] $VALUES;
    public static final StentorMMU$RobotReqType REQ_TYPE_ASR;
    public static final StentorMMU$RobotReqType REQ_TYPE_NLU;
    public static final StentorMMU$RobotReqType REQ_TYPE_TTS;
    public static final StentorMMU$RobotReqType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       StentorMMU$RobotReqType robotReqType = new StentorMMU$RobotReqType("REQ_TYPE_ASR", 0, 0);
       StentorMMU$RobotReqType.REQ_TYPE_ASR = robotReqType;
       StentorMMU$RobotReqType robotReqType1 = new StentorMMU$RobotReqType("REQ_TYPE_NLU", 1, 1);
       StentorMMU$RobotReqType.REQ_TYPE_NLU = robotReqType1;
       StentorMMU$RobotReqType robotReqType2 = new StentorMMU$RobotReqType("REQ_TYPE_TTS", 2, 2);
       StentorMMU$RobotReqType.REQ_TYPE_TTS = robotReqType2;
       StentorMMU$RobotReqType robotReqType3 = new StentorMMU$RobotReqType("UNRECOGNIZED", 3, -1);
       StentorMMU$RobotReqType.UNRECOGNIZED = robotReqType3;
       StentorMMU$RobotReqType[] robotReqType4 = new StentorMMU$RobotReqType[]{robotReqType,robotReqType1,robotReqType2,robotReqType3};
       StentorMMU$RobotReqType.$VALUES = robotReqType4;
       StentorMMU$RobotReqType.internalValueMap = new StentorMMU$RobotReqType$a();
    }
    public void StentorMMU$RobotReqType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static StentorMMU$RobotReqType forNumber(int p0){
       if (!p0) {
          return StentorMMU$RobotReqType.REQ_TYPE_ASR;
       }
       if (p0 == 1) {
          return StentorMMU$RobotReqType.REQ_TYPE_NLU;
       }
       if (p0 != 2) {
          return null;
       }
       return StentorMMU$RobotReqType.REQ_TYPE_TTS;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return StentorMMU$RobotReqType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return StentorMMU$RobotReqType$b.a;
    }
    public static StentorMMU$RobotReqType valueOf(int p0){
       return StentorMMU$RobotReqType.forNumber(p0);
    }
    public static StentorMMU$RobotReqType valueOf(String p0){
       return Enum.valueOf(StentorMMU$RobotReqType.class, p0);
    }
    public static StentorMMU$RobotReqType[] values(){
       return StentorMMU$RobotReqType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != StentorMMU$RobotReqType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
