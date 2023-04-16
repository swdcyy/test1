package com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotInfoStatus;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotInfoStatus$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotInfoStatus$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class StentorMMU$SpeechRobotInfoStatus extends Enum implements Internal$EnumLite	// class@000dc0
{
    public final int value;
    public static final StentorMMU$SpeechRobotInfoStatus[] $VALUES;
    public static final StentorMMU$SpeechRobotInfoStatus FINISH;
    public static final StentorMMU$SpeechRobotInfoStatus RESULT_NOT_CLEAR;
    public static final StentorMMU$SpeechRobotInfoStatus RESULT_NO_RESOURCE;
    public static final StentorMMU$SpeechRobotInfoStatus ROBOT_ERROR;
    public static final StentorMMU$SpeechRobotInfoStatus SEND_CONTINUE;
    public static final StentorMMU$SpeechRobotInfoStatus SEND_STOP;
    public static final StentorMMU$SpeechRobotInfoStatus UNEXPECTED_RESULT;
    public static final StentorMMU$SpeechRobotInfoStatus UNRECOGNIZED;
    public static final StentorMMU$SpeechRobotInfoStatus WAKEUP_FALSE;
    public static final StentorMMU$SpeechRobotInfoStatus WAKEUP_TRUE;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       StentorMMU$SpeechRobotInfoStatus speechRobotI = new StentorMMU$SpeechRobotInfoStatus("ROBOT_ERROR", 0, 0);
       StentorMMU$SpeechRobotInfoStatus.ROBOT_ERROR = speechRobotI;
       StentorMMU$SpeechRobotInfoStatus speechRobotI1 = new StentorMMU$SpeechRobotInfoStatus("SEND_CONTINUE", 1, 1);
       StentorMMU$SpeechRobotInfoStatus.SEND_CONTINUE = speechRobotI1;
       StentorMMU$SpeechRobotInfoStatus speechRobotI2 = new StentorMMU$SpeechRobotInfoStatus("SEND_STOP", 2, 2);
       StentorMMU$SpeechRobotInfoStatus.SEND_STOP = speechRobotI2;
       StentorMMU$SpeechRobotInfoStatus speechRobotI3 = new StentorMMU$SpeechRobotInfoStatus("FINISH", 3, 3);
       StentorMMU$SpeechRobotInfoStatus.FINISH = speechRobotI3;
       StentorMMU$SpeechRobotInfoStatus speechRobotI4 = new StentorMMU$SpeechRobotInfoStatus("WAKEUP_TRUE", 4, 4);
       StentorMMU$SpeechRobotInfoStatus.WAKEUP_TRUE = speechRobotI4;
       StentorMMU$SpeechRobotInfoStatus speechRobotI5 = new StentorMMU$SpeechRobotInfoStatus("WAKEUP_FALSE", 5, 5);
       StentorMMU$SpeechRobotInfoStatus.WAKEUP_FALSE = speechRobotI5;
       StentorMMU$SpeechRobotInfoStatus speechRobotI6 = new StentorMMU$SpeechRobotInfoStatus("RESULT_NOT_CLEAR", 6, 6);
       StentorMMU$SpeechRobotInfoStatus.RESULT_NOT_CLEAR = speechRobotI6;
       StentorMMU$SpeechRobotInfoStatus speechRobotI7 = new StentorMMU$SpeechRobotInfoStatus("UNEXPECTED_RESULT", 7, 7);
       StentorMMU$SpeechRobotInfoStatus.UNEXPECTED_RESULT = speechRobotI7;
       StentorMMU$SpeechRobotInfoStatus speechRobotI8 = new StentorMMU$SpeechRobotInfoStatus("RESULT_NO_RESOURCE", 8, 8);
       StentorMMU$SpeechRobotInfoStatus.RESULT_NO_RESOURCE = speechRobotI8;
       StentorMMU$SpeechRobotInfoStatus speechRobotI9 = new StentorMMU$SpeechRobotInfoStatus("UNRECOGNIZED", 9, -1);
       StentorMMU$SpeechRobotInfoStatus.UNRECOGNIZED = speechRobotI9;
       StentorMMU$SpeechRobotInfoStatus[] speechRobotI10 = new StentorMMU$SpeechRobotInfoStatus[10];
       speechRobotI10[0] = speechRobotI;
       speechRobotI10[1] = speechRobotI1;
       speechRobotI10[2] = speechRobotI2;
       speechRobotI10[3] = speechRobotI3;
       speechRobotI10[4] = speechRobotI4;
       speechRobotI10[5] = speechRobotI5;
       speechRobotI10[6] = speechRobotI6;
       speechRobotI10[7] = speechRobotI7;
       speechRobotI10[8] = speechRobotI8;
       speechRobotI10[9] = speechRobotI9;
       StentorMMU$SpeechRobotInfoStatus.$VALUES = speechRobotI10;
       StentorMMU$SpeechRobotInfoStatus.internalValueMap = new StentorMMU$SpeechRobotInfoStatus$a();
    }
    public void StentorMMU$SpeechRobotInfoStatus(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static StentorMMU$SpeechRobotInfoStatus forNumber(int p0){
       switch (p0){
           case 0:
             return StentorMMU$SpeechRobotInfoStatus.ROBOT_ERROR;
           case 1:
             return StentorMMU$SpeechRobotInfoStatus.SEND_CONTINUE;
           case 2:
             return StentorMMU$SpeechRobotInfoStatus.SEND_STOP;
           case 3:
             return StentorMMU$SpeechRobotInfoStatus.FINISH;
           case 4:
             return StentorMMU$SpeechRobotInfoStatus.WAKEUP_TRUE;
           case 5:
             return StentorMMU$SpeechRobotInfoStatus.WAKEUP_FALSE;
           case 6:
             return StentorMMU$SpeechRobotInfoStatus.RESULT_NOT_CLEAR;
           case 7:
             return StentorMMU$SpeechRobotInfoStatus.UNEXPECTED_RESULT;
           case 8:
             return StentorMMU$SpeechRobotInfoStatus.RESULT_NO_RESOURCE;
           default:
             return null;
       }
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return StentorMMU$SpeechRobotInfoStatus.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return StentorMMU$SpeechRobotInfoStatus$b.a;
    }
    public static StentorMMU$SpeechRobotInfoStatus valueOf(int p0){
       return StentorMMU$SpeechRobotInfoStatus.forNumber(p0);
    }
    public static StentorMMU$SpeechRobotInfoStatus valueOf(String p0){
       return Enum.valueOf(StentorMMU$SpeechRobotInfoStatus.class, p0);
    }
    public static StentorMMU$SpeechRobotInfoStatus[] values(){
       return StentorMMU$SpeechRobotInfoStatus.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != StentorMMU$SpeechRobotInfoStatus.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
