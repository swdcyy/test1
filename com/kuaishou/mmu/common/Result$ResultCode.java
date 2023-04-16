package com.kuaishou.mmu.common.Result$ResultCode;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.mmu.common.Result$ResultCode$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.mmu.common.Result$ResultCode$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class Result$ResultCode extends Enum implements Internal$EnumLite	// class@000a0b
{
    public final int value;
    public static final Result$ResultCode[] $VALUES;
    public static final Result$ResultCode ASR_FAILED;
    public static final Result$ResultCode ASR_ROBOT_TAIL_END;
    public static final Result$ResultCode ASR_SLIENT;
    public static final Result$ResultCode BAD_ANGLE;
    public static final Result$ResultCode BAD_CLARITY;
    public static final Result$ResultCode BAIDU_AUDIO_SERVICE_ERROR;
    public static final Result$ResultCode BLOB_STORE_ERROR;
    public static final Result$ResultCode ERROR;
    public static final Result$ResultCode FAILED;
    public static final Result$ResultCode GET_DATA_FAILED;
    public static final Result$ResultCode ILLEGAL;
    public static final Result$ResultCode ILLEGAL_FACE_DETECTED;
    public static final Result$ResultCode INPUT_EMPTY;
    public static final Result$ResultCode KEY_FRAME_FAILED;
    public static final Result$ResultCode NO_FACE_DETECTED;
    public static final Result$ResultCode NO_FACE_MATCHED;
    public static final Result$ResultCode OUTPUT_EMPTY;
    public static final Result$ResultCode OVER_RATE_LIMIT;
    public static final Result$ResultCode PARAM_ERROR;
    public static final Result$ResultCode PARTAL_SUCCESS;
    public static final Result$ResultCode PROCESSING;
    public static final Result$ResultCode REDIS_KEY_NO_EXIST;
    public static final Result$ResultCode REJECT;
    public static final Result$ResultCode SPEECH_RECOGNITION_FAILED;
    public static final Result$ResultCode SPEECH_RECOGNITION_TIMEOUT;
    public static final Result$ResultCode SUCESS;
    public static final Result$ResultCode TIMEOUT;
    public static final Result$ResultCode TRANSCODING_FAILED;
    public static final Result$ResultCode UNKOWN;
    public static final Result$ResultCode UNRECOGNIZED;
    public static final Result$ResultCode VAD_EMPTY;
    public static final Result$ResultCode VAD_TIMEOUT;
    public static final Result$ResultCode VC_FAILED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       Result$ResultCode resultCode = new Result$ResultCode("UNKOWN", 0, 0);
       Result$ResultCode.UNKOWN = resultCode;
       Result$ResultCode resultCode1 = new Result$ResultCode("SUCESS", 1, 1);
       Result$ResultCode.SUCESS = resultCode1;
       Result$ResultCode resultCode2 = new Result$ResultCode("INPUT_EMPTY", 2, 2);
       Result$ResultCode.INPUT_EMPTY = resultCode2;
       Result$ResultCode resultCode3 = new Result$ResultCode("ERROR", 3, 3);
       Result$ResultCode.ERROR = resultCode3;
       Result$ResultCode resultCode4 = new Result$ResultCode("BAIDU_AUDIO_SERVICE_ERROR", 4, 4);
       Result$ResultCode.BAIDU_AUDIO_SERVICE_ERROR = resultCode4;
       Result$ResultCode resultCode5 = new Result$ResultCode("OUTPUT_EMPTY", 5, 5);
       Result$ResultCode.OUTPUT_EMPTY = resultCode5;
       Result$ResultCode resultCode6 = new Result$ResultCode("PARTAL_SUCCESS", 6, 6);
       Result$ResultCode.PARTAL_SUCCESS = resultCode6;
       Result$ResultCode resultCode7 = new Result$ResultCode("NO_FACE_DETECTED", 7, 7);
       Result$ResultCode.NO_FACE_DETECTED = resultCode7;
       Result$ResultCode resultCode8 = new Result$ResultCode("NO_FACE_MATCHED", 8, 8);
       Result$ResultCode.NO_FACE_MATCHED = resultCode8;
       Result$ResultCode resultCode9 = new Result$ResultCode("ILLEGAL_FACE_DETECTED", 9, 9);
       Result$ResultCode.ILLEGAL_FACE_DETECTED = resultCode9;
       Result$ResultCode resultCode10 = new Result$ResultCode("FAILED", 10, 10);
       Result$ResultCode.FAILED = resultCode10;
       Result$ResultCode resultCode11 = new Result$ResultCode("BLOB_STORE_ERROR", 11, 11);
       Result$ResultCode.BLOB_STORE_ERROR = resultCode11;
       Result$ResultCode resultCode12 = new Result$ResultCode("ILLEGAL", 12, 12);
       Result$ResultCode.ILLEGAL = resultCode12;
       Result$ResultCode resultCode13 = new Result$ResultCode("OVER_RATE_LIMIT", 13, 13);
       Result$ResultCode.OVER_RATE_LIMIT = resultCode13;
       Result$ResultCode resultCode14 = resultCode13;
       Result$ResultCode resultCode15 = new Result$ResultCode("REJECT", 14, 14);
       Result$ResultCode.REJECT = resultCode15;
       Result$ResultCode resultCode16 = resultCode15;
       Result$ResultCode resultCode17 = new Result$ResultCode("ASR_ROBOT_TAIL_END", 15, 15);
       Result$ResultCode.ASR_ROBOT_TAIL_END = resultCode17;
       Result$ResultCode resultCode18 = resultCode17;
       resultCode13 = new Result$ResultCode("BAD_ANGLE", 16, 16);
       Result$ResultCode.BAD_ANGLE = resultCode13;
       Result$ResultCode resultCode19 = resultCode13;
       resultCode15 = new Result$ResultCode("BAD_CLARITY", 17, 17);
       Result$ResultCode.BAD_CLARITY = resultCode15;
       Result$ResultCode resultCode20 = resultCode15;
       resultCode17 = new Result$ResultCode("TIMEOUT", 18, 18);
       Result$ResultCode.TIMEOUT = resultCode17;
       Result$ResultCode resultCode21 = resultCode17;
       resultCode13 = new Result$ResultCode("PARAM_ERROR", 19, 19);
       Result$ResultCode.PARAM_ERROR = resultCode13;
       Result$ResultCode resultCode22 = resultCode13;
       resultCode15 = new Result$ResultCode("PROCESSING", 20, 20);
       Result$ResultCode.PROCESSING = resultCode15;
       Result$ResultCode resultCode23 = resultCode15;
       resultCode17 = new Result$ResultCode("TRANSCODING_FAILED", 21, 21);
       Result$ResultCode.TRANSCODING_FAILED = resultCode17;
       Result$ResultCode resultCode24 = resultCode17;
       Result$ResultCode resultCode25 = resultCode12;
       resultCode13 = new Result$ResultCode("SPEECH_RECOGNITION_FAILED", 22, 22);
       Result$ResultCode.SPEECH_RECOGNITION_FAILED = resultCode13;
       Result$ResultCode resultCode26 = resultCode13;
       resultCode17 = new Result$ResultCode("VAD_EMPTY", 23, 23);
       Result$ResultCode.VAD_EMPTY = resultCode17;
       Result$ResultCode resultCode27 = resultCode17;
       resultCode15 = new Result$ResultCode("VAD_TIMEOUT", 24, 24);
       Result$ResultCode.VAD_TIMEOUT = resultCode15;
       Result$ResultCode resultCode28 = resultCode15;
       resultCode17 = new Result$ResultCode("SPEECH_RECOGNITION_TIMEOUT", 25, 25);
       Result$ResultCode.SPEECH_RECOGNITION_TIMEOUT = resultCode17;
       Result$ResultCode resultCode29 = resultCode17;
       resultCode15 = new Result$ResultCode("GET_DATA_FAILED", 26, 26);
       Result$ResultCode.GET_DATA_FAILED = resultCode15;
       Result$ResultCode resultCode30 = resultCode15;
       resultCode17 = new Result$ResultCode("KEY_FRAME_FAILED", 27, 27);
       Result$ResultCode.KEY_FRAME_FAILED = resultCode17;
       Result$ResultCode resultCode31 = resultCode17;
       resultCode15 = new Result$ResultCode("REDIS_KEY_NO_EXIST", 28, 28);
       Result$ResultCode.REDIS_KEY_NO_EXIST = resultCode15;
       Result$ResultCode resultCode32 = resultCode15;
       resultCode17 = new Result$ResultCode("ASR_FAILED", 29, 29);
       Result$ResultCode.ASR_FAILED = resultCode17;
       Result$ResultCode resultCode33 = resultCode17;
       resultCode15 = new Result$ResultCode("VC_FAILED", 30, 30);
       Result$ResultCode.VC_FAILED = resultCode15;
       Result$ResultCode resultCode34 = resultCode15;
       resultCode17 = new Result$ResultCode("ASR_SLIENT", 31, 31);
       Result$ResultCode.ASR_SLIENT = resultCode17;
       Result$ResultCode resultCode35 = resultCode17;
       resultCode15 = new Result$ResultCode("UNRECOGNIZED", 32, -1);
       Result$ResultCode.UNRECOGNIZED = resultCode15;
       Result$ResultCode[] resultCodeAr = new Result$ResultCode[33];
       resultCodeAr[0] = resultCode;
       resultCodeAr[1] = resultCode1;
       resultCodeAr[2] = resultCode2;
       resultCodeAr[3] = resultCode3;
       resultCodeAr[4] = resultCode4;
       resultCodeAr[5] = resultCode5;
       resultCodeAr[6] = resultCode6;
       resultCodeAr[7] = resultCode7;
       resultCodeAr[8] = resultCode8;
       resultCodeAr[9] = resultCode9;
       resultCodeAr[10] = resultCode10;
       resultCodeAr[11] = resultCode11;
       resultCodeAr[12] = resultCode25;
       resultCodeAr[13] = resultCode14;
       resultCodeAr[14] = resultCode16;
       resultCodeAr[15] = resultCode18;
       resultCodeAr[16] = resultCode19;
       resultCodeAr[17] = resultCode20;
       resultCodeAr[18] = resultCode21;
       resultCodeAr[19] = resultCode22;
       resultCodeAr[20] = resultCode23;
       resultCodeAr[21] = resultCode24;
       resultCodeAr[22] = resultCode26;
       resultCodeAr[23] = resultCode27;
       resultCodeAr[24] = resultCode28;
       resultCodeAr[25] = resultCode29;
       resultCodeAr[26] = resultCode30;
       resultCodeAr[27] = resultCode31;
       resultCodeAr[28] = resultCode32;
       resultCodeAr[29] = resultCode33;
       resultCodeAr[30] = resultCode34;
       resultCodeAr[31] = resultCode35;
       resultCodeAr[32] = resultCode15;
       Result$ResultCode.$VALUES = resultCodeAr;
       Result$ResultCode.internalValueMap = new Result$ResultCode$a();
    }
    public void Result$ResultCode(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static Result$ResultCode forNumber(int p0){
       switch (p0){
           case 0:
             return Result$ResultCode.UNKOWN;
           case 1:
             return Result$ResultCode.SUCESS;
           case 2:
             return Result$ResultCode.INPUT_EMPTY;
           case 3:
             return Result$ResultCode.ERROR;
           case 4:
             return Result$ResultCode.BAIDU_AUDIO_SERVICE_ERROR;
           case 5:
             return Result$ResultCode.OUTPUT_EMPTY;
           case 6:
             return Result$ResultCode.PARTAL_SUCCESS;
           case 7:
             return Result$ResultCode.NO_FACE_DETECTED;
           case 8:
             return Result$ResultCode.NO_FACE_MATCHED;
           case 9:
             return Result$ResultCode.ILLEGAL_FACE_DETECTED;
           case 10:
             return Result$ResultCode.FAILED;
           case 11:
             return Result$ResultCode.BLOB_STORE_ERROR;
           case 12:
             return Result$ResultCode.ILLEGAL;
           case 13:
             return Result$ResultCode.OVER_RATE_LIMIT;
           case 14:
             return Result$ResultCode.REJECT;
           case 15:
             return Result$ResultCode.ASR_ROBOT_TAIL_END;
           case 16:
             return Result$ResultCode.BAD_ANGLE;
           case 17:
             return Result$ResultCode.BAD_CLARITY;
           case 18:
             return Result$ResultCode.TIMEOUT;
           case 19:
             return Result$ResultCode.PARAM_ERROR;
           case 20:
             return Result$ResultCode.PROCESSING;
           case 21:
             return Result$ResultCode.TRANSCODING_FAILED;
           case 22:
             return Result$ResultCode.SPEECH_RECOGNITION_FAILED;
           case 23:
             return Result$ResultCode.VAD_EMPTY;
           case 24:
             return Result$ResultCode.VAD_TIMEOUT;
           case 25:
             return Result$ResultCode.SPEECH_RECOGNITION_TIMEOUT;
           case 26:
             return Result$ResultCode.GET_DATA_FAILED;
           case 27:
             return Result$ResultCode.KEY_FRAME_FAILED;
           case 28:
             return Result$ResultCode.REDIS_KEY_NO_EXIST;
           case 29:
             return Result$ResultCode.ASR_FAILED;
           case 30:
             return Result$ResultCode.VC_FAILED;
           case 31:
             return Result$ResultCode.ASR_SLIENT;
           default:
             return null;
       }
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return Result$ResultCode.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return Result$ResultCode$b.a;
    }
    public static Result$ResultCode valueOf(int p0){
       return Result$ResultCode.forNumber(p0);
    }
    public static Result$ResultCode valueOf(String p0){
       return Enum.valueOf(Result$ResultCode.class, p0);
    }
    public static Result$ResultCode[] values(){
       return Result$ResultCode.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != Result$ResultCode.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
