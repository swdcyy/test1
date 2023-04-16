package com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResultCode;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResultCode$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResultCode$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class StentorMMU$RtSpeechRecognitionResultCode extends Enum implements Internal$EnumLite	// class@000da7
{
    public final int value;
    public static final StentorMMU$RtSpeechRecognitionResultCode[] $VALUES;
    public static final StentorMMU$RtSpeechRecognitionResultCode ASR_ROBOT_TAIL_END;
    public static final StentorMMU$RtSpeechRecognitionResultCode BAIDU_AUDIO_SERVICE_ERROR;
    public static final StentorMMU$RtSpeechRecognitionResultCode BLOB_STORE_ERROR;
    public static final StentorMMU$RtSpeechRecognitionResultCode ERROR;
    public static final StentorMMU$RtSpeechRecognitionResultCode FAILED;
    public static final StentorMMU$RtSpeechRecognitionResultCode ILLEGAL;
    public static final StentorMMU$RtSpeechRecognitionResultCode ILLEGAL_FACE_DETECTED;
    public static final StentorMMU$RtSpeechRecognitionResultCode INPUT_EMPTY;
    public static final StentorMMU$RtSpeechRecognitionResultCode NO_FACE_DETECTED;
    public static final StentorMMU$RtSpeechRecognitionResultCode NO_FACE_MATCHED;
    public static final StentorMMU$RtSpeechRecognitionResultCode OUTPUT_EMPTY;
    public static final StentorMMU$RtSpeechRecognitionResultCode OVER_RATE_LIMIT;
    public static final StentorMMU$RtSpeechRecognitionResultCode PARTAL_SUCCESS;
    public static final StentorMMU$RtSpeechRecognitionResultCode REJECT;
    public static final StentorMMU$RtSpeechRecognitionResultCode SUCESS;
    public static final StentorMMU$RtSpeechRecognitionResultCode UNKOWN;
    public static final StentorMMU$RtSpeechRecognitionResultCode UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       StentorMMU$RtSpeechRecognitionResultCode rtSpeechReco = new StentorMMU$RtSpeechRecognitionResultCode("UNKOWN", 0, 0);
       StentorMMU$RtSpeechRecognitionResultCode.UNKOWN = rtSpeechReco;
       StentorMMU$RtSpeechRecognitionResultCode rtSpeechReco1 = new StentorMMU$RtSpeechRecognitionResultCode("SUCESS", 1, 1);
       StentorMMU$RtSpeechRecognitionResultCode.SUCESS = rtSpeechReco1;
       StentorMMU$RtSpeechRecognitionResultCode rtSpeechReco2 = new StentorMMU$RtSpeechRecognitionResultCode("INPUT_EMPTY", 2, 2);
       StentorMMU$RtSpeechRecognitionResultCode.INPUT_EMPTY = rtSpeechReco2;
       StentorMMU$RtSpeechRecognitionResultCode rtSpeechReco3 = new StentorMMU$RtSpeechRecognitionResultCode("ERROR", 3, 3);
       StentorMMU$RtSpeechRecognitionResultCode.ERROR = rtSpeechReco3;
       StentorMMU$RtSpeechRecognitionResultCode rtSpeechReco4 = new StentorMMU$RtSpeechRecognitionResultCode("BAIDU_AUDIO_SERVICE_ERROR", 4, 4);
       StentorMMU$RtSpeechRecognitionResultCode.BAIDU_AUDIO_SERVICE_ERROR = rtSpeechReco4;
       StentorMMU$RtSpeechRecognitionResultCode rtSpeechReco5 = new StentorMMU$RtSpeechRecognitionResultCode("OUTPUT_EMPTY", 5, 5);
       StentorMMU$RtSpeechRecognitionResultCode.OUTPUT_EMPTY = rtSpeechReco5;
       StentorMMU$RtSpeechRecognitionResultCode rtSpeechReco6 = new StentorMMU$RtSpeechRecognitionResultCode("PARTAL_SUCCESS", 6, 6);
       StentorMMU$RtSpeechRecognitionResultCode.PARTAL_SUCCESS = rtSpeechReco6;
       StentorMMU$RtSpeechRecognitionResultCode rtSpeechReco7 = new StentorMMU$RtSpeechRecognitionResultCode("NO_FACE_DETECTED", 7, 7);
       StentorMMU$RtSpeechRecognitionResultCode.NO_FACE_DETECTED = rtSpeechReco7;
       StentorMMU$RtSpeechRecognitionResultCode rtSpeechReco8 = new StentorMMU$RtSpeechRecognitionResultCode("NO_FACE_MATCHED", 8, 8);
       StentorMMU$RtSpeechRecognitionResultCode.NO_FACE_MATCHED = rtSpeechReco8;
       StentorMMU$RtSpeechRecognitionResultCode rtSpeechReco9 = new StentorMMU$RtSpeechRecognitionResultCode("ILLEGAL_FACE_DETECTED", 9, 9);
       StentorMMU$RtSpeechRecognitionResultCode.ILLEGAL_FACE_DETECTED = rtSpeechReco9;
       StentorMMU$RtSpeechRecognitionResultCode rtSpeechReco10 = new StentorMMU$RtSpeechRecognitionResultCode("FAILED", 10, 10);
       StentorMMU$RtSpeechRecognitionResultCode.FAILED = rtSpeechReco10;
       StentorMMU$RtSpeechRecognitionResultCode rtSpeechReco11 = new StentorMMU$RtSpeechRecognitionResultCode("BLOB_STORE_ERROR", 11, 11);
       StentorMMU$RtSpeechRecognitionResultCode.BLOB_STORE_ERROR = rtSpeechReco11;
       StentorMMU$RtSpeechRecognitionResultCode rtSpeechReco12 = new StentorMMU$RtSpeechRecognitionResultCode("ILLEGAL", 12, 12);
       StentorMMU$RtSpeechRecognitionResultCode.ILLEGAL = rtSpeechReco12;
       StentorMMU$RtSpeechRecognitionResultCode rtSpeechReco13 = new StentorMMU$RtSpeechRecognitionResultCode("OVER_RATE_LIMIT", 13, 13);
       StentorMMU$RtSpeechRecognitionResultCode.OVER_RATE_LIMIT = rtSpeechReco13;
       StentorMMU$RtSpeechRecognitionResultCode rtSpeechReco14 = rtSpeechReco13;
       StentorMMU$RtSpeechRecognitionResultCode rtSpeechReco15 = new StentorMMU$RtSpeechRecognitionResultCode("REJECT", 14, 14);
       StentorMMU$RtSpeechRecognitionResultCode.REJECT = rtSpeechReco15;
       StentorMMU$RtSpeechRecognitionResultCode rtSpeechReco16 = rtSpeechReco15;
       StentorMMU$RtSpeechRecognitionResultCode rtSpeechReco17 = new StentorMMU$RtSpeechRecognitionResultCode("ASR_ROBOT_TAIL_END", 15, 15);
       StentorMMU$RtSpeechRecognitionResultCode.ASR_ROBOT_TAIL_END = rtSpeechReco17;
       StentorMMU$RtSpeechRecognitionResultCode rtSpeechReco18 = rtSpeechReco17;
       StentorMMU$RtSpeechRecognitionResultCode rtSpeechReco19 = rtSpeechReco12;
       rtSpeechReco13 = new StentorMMU$RtSpeechRecognitionResultCode("UNRECOGNIZED", 16, -1);
       StentorMMU$RtSpeechRecognitionResultCode.UNRECOGNIZED = rtSpeechReco13;
       StentorMMU$RtSpeechRecognitionResultCode[] rtSpeechReco20 = new StentorMMU$RtSpeechRecognitionResultCode[17];
       rtSpeechReco20[0] = rtSpeechReco;
       rtSpeechReco20[1] = rtSpeechReco1;
       rtSpeechReco20[2] = rtSpeechReco2;
       rtSpeechReco20[3] = rtSpeechReco3;
       rtSpeechReco20[4] = rtSpeechReco4;
       rtSpeechReco20[5] = rtSpeechReco5;
       rtSpeechReco20[6] = rtSpeechReco6;
       rtSpeechReco20[7] = rtSpeechReco7;
       rtSpeechReco20[8] = rtSpeechReco8;
       rtSpeechReco20[9] = rtSpeechReco9;
       rtSpeechReco20[10] = rtSpeechReco10;
       rtSpeechReco20[11] = rtSpeechReco11;
       rtSpeechReco20[12] = rtSpeechReco19;
       rtSpeechReco20[13] = rtSpeechReco14;
       rtSpeechReco20[14] = rtSpeechReco16;
       rtSpeechReco20[15] = rtSpeechReco18;
       rtSpeechReco20[16] = rtSpeechReco13;
       StentorMMU$RtSpeechRecognitionResultCode.$VALUES = rtSpeechReco20;
       StentorMMU$RtSpeechRecognitionResultCode.internalValueMap = new StentorMMU$RtSpeechRecognitionResultCode$a();
    }
    public void StentorMMU$RtSpeechRecognitionResultCode(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static StentorMMU$RtSpeechRecognitionResultCode forNumber(int p0){
       switch (p0){
           case 0:
             return StentorMMU$RtSpeechRecognitionResultCode.UNKOWN;
           case 1:
             return StentorMMU$RtSpeechRecognitionResultCode.SUCESS;
           case 2:
             return StentorMMU$RtSpeechRecognitionResultCode.INPUT_EMPTY;
           case 3:
             return StentorMMU$RtSpeechRecognitionResultCode.ERROR;
           case 4:
             return StentorMMU$RtSpeechRecognitionResultCode.BAIDU_AUDIO_SERVICE_ERROR;
           case 5:
             return StentorMMU$RtSpeechRecognitionResultCode.OUTPUT_EMPTY;
           case 6:
             return StentorMMU$RtSpeechRecognitionResultCode.PARTAL_SUCCESS;
           case 7:
             return StentorMMU$RtSpeechRecognitionResultCode.NO_FACE_DETECTED;
           case 8:
             return StentorMMU$RtSpeechRecognitionResultCode.NO_FACE_MATCHED;
           case 9:
             return StentorMMU$RtSpeechRecognitionResultCode.ILLEGAL_FACE_DETECTED;
           case 10:
             return StentorMMU$RtSpeechRecognitionResultCode.FAILED;
           case 11:
             return StentorMMU$RtSpeechRecognitionResultCode.BLOB_STORE_ERROR;
           case 12:
             return StentorMMU$RtSpeechRecognitionResultCode.ILLEGAL;
           case 13:
             return StentorMMU$RtSpeechRecognitionResultCode.OVER_RATE_LIMIT;
           case 14:
             return StentorMMU$RtSpeechRecognitionResultCode.REJECT;
           case 15:
             return StentorMMU$RtSpeechRecognitionResultCode.ASR_ROBOT_TAIL_END;
           default:
             return null;
       }
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return StentorMMU$RtSpeechRecognitionResultCode.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return StentorMMU$RtSpeechRecognitionResultCode$b.a;
    }
    public static StentorMMU$RtSpeechRecognitionResultCode valueOf(int p0){
       return StentorMMU$RtSpeechRecognitionResultCode.forNumber(p0);
    }
    public static StentorMMU$RtSpeechRecognitionResultCode valueOf(String p0){
       return Enum.valueOf(StentorMMU$RtSpeechRecognitionResultCode.class, p0);
    }
    public static StentorMMU$RtSpeechRecognitionResultCode[] values(){
       return StentorMMU$RtSpeechRecognitionResultCode.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != StentorMMU$RtSpeechRecognitionResultCode.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
