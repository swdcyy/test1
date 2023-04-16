package com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtAsrStatus;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtAsrStatus$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtAsrStatus$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class StentorMMU$RtAsrStatus extends Enum implements Internal$EnumLite	// class@000d9e
{
    public final int value;
    public static final StentorMMU$RtAsrStatus[] $VALUES;
    public static final StentorMMU$RtAsrStatus ASR_RUNNING;
    public static final StentorMMU$RtAsrStatus ASR_SILENCE;
    public static final StentorMMU$RtAsrStatus ASR_STOPPED;
    public static final StentorMMU$RtAsrStatus ASR_UNKNOWN;
    public static final StentorMMU$RtAsrStatus UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       StentorMMU$RtAsrStatus rtAsrStatus = new StentorMMU$RtAsrStatus("ASR_UNKNOWN", 0, 0);
       StentorMMU$RtAsrStatus.ASR_UNKNOWN = rtAsrStatus;
       StentorMMU$RtAsrStatus rtAsrStatus1 = new StentorMMU$RtAsrStatus("ASR_RUNNING", 1, 1);
       StentorMMU$RtAsrStatus.ASR_RUNNING = rtAsrStatus1;
       StentorMMU$RtAsrStatus rtAsrStatus2 = new StentorMMU$RtAsrStatus("ASR_STOPPED", 2, 2);
       StentorMMU$RtAsrStatus.ASR_STOPPED = rtAsrStatus2;
       StentorMMU$RtAsrStatus rtAsrStatus3 = new StentorMMU$RtAsrStatus("ASR_SILENCE", 3, 3);
       StentorMMU$RtAsrStatus.ASR_SILENCE = rtAsrStatus3;
       StentorMMU$RtAsrStatus rtAsrStatus4 = new StentorMMU$RtAsrStatus("UNRECOGNIZED", 4, -1);
       StentorMMU$RtAsrStatus.UNRECOGNIZED = rtAsrStatus4;
       StentorMMU$RtAsrStatus[] rtAsrStatusA = new StentorMMU$RtAsrStatus[]{rtAsrStatus,rtAsrStatus1,rtAsrStatus2,rtAsrStatus3,rtAsrStatus4};
       StentorMMU$RtAsrStatus.$VALUES = rtAsrStatusA;
       StentorMMU$RtAsrStatus.internalValueMap = new StentorMMU$RtAsrStatus$a();
    }
    public void StentorMMU$RtAsrStatus(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static StentorMMU$RtAsrStatus forNumber(int p0){
       if (!p0) {
          return StentorMMU$RtAsrStatus.ASR_UNKNOWN;
       }
       if (p0 == 1) {
          return StentorMMU$RtAsrStatus.ASR_RUNNING;
       }
       if (p0 == 2) {
          return StentorMMU$RtAsrStatus.ASR_STOPPED;
       }
       if (p0 != 3) {
          return null;
       }
       return StentorMMU$RtAsrStatus.ASR_SILENCE;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return StentorMMU$RtAsrStatus.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return StentorMMU$RtAsrStatus$b.a;
    }
    public static StentorMMU$RtAsrStatus valueOf(int p0){
       return StentorMMU$RtAsrStatus.forNumber(p0);
    }
    public static StentorMMU$RtAsrStatus valueOf(String p0){
       return Enum.valueOf(StentorMMU$RtAsrStatus.class, p0);
    }
    public static StentorMMU$RtAsrStatus[] values(){
       return StentorMMU$RtAsrStatus.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != StentorMMU$RtAsrStatus.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
