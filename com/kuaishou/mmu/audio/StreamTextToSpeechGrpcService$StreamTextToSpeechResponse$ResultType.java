package com.kuaishou.mmu.audio.StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.mmu.audio.StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.mmu.audio.StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType extends Enum implements Internal$EnumLite	// class@0009f4
{
    public final int value;
    public static final StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType[] $VALUES;
    public static final StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType FAIL;
    public static final StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType REJECT;
    public static final StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType SUCCESS;
    public static final StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType UNKNOWN;
    public static final StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType streamTextTo = new StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType("UNKNOWN", 0, 0);
       StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType.UNKNOWN = streamTextTo;
       StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType streamTextTo1 = new StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType("SUCCESS", 1, 1);
       StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType.SUCCESS = streamTextTo1;
       StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType streamTextTo2 = new StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType("FAIL", 2, 2);
       StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType.FAIL = streamTextTo2;
       StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType streamTextTo3 = new StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType("REJECT", 3, 14);
       StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType.REJECT = streamTextTo3;
       StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType streamTextTo4 = new StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType("UNRECOGNIZED", 4, -1);
       StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType.UNRECOGNIZED = streamTextTo4;
       StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType[] streamTextTo5 = new StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType[]{streamTextTo,streamTextTo1,streamTextTo2,streamTextTo3,streamTextTo4};
       StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType.$VALUES = streamTextTo5;
       StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType.internalValueMap = new StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType$a();
    }
    public void StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType forNumber(int p0){
       if (!p0) {
          return StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType.UNKNOWN;
       }
       if (p0 == 1) {
          return StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType.SUCCESS;
       }
       if (p0 == 2) {
          return StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType.FAIL;
       }
       if (p0 != 14) {
          return null;
       }
       return StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType.REJECT;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType$b.a;
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType valueOf(int p0){
       return StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType.forNumber(p0);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType valueOf(String p0){
       return Enum.valueOf(StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType.class, p0);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType[] values(){
       return StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
