package com.kuaishou.mmu.audio.VoiceConversionGrpcService$RtVoiceConversionRequest$Type;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.mmu.audio.VoiceConversionGrpcService$RtVoiceConversionRequest$Type$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.mmu.audio.VoiceConversionGrpcService$RtVoiceConversionRequest$Type$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class VoiceConversionGrpcService$RtVoiceConversionRequest$Type extends Enum implements Internal$EnumLite	// class@0009fb
{
    public final int value;
    public static final VoiceConversionGrpcService$RtVoiceConversionRequest$Type[] $VALUES;
    public static final VoiceConversionGrpcService$RtVoiceConversionRequest$Type APPEND;
    public static final VoiceConversionGrpcService$RtVoiceConversionRequest$Type CLEAR_CACHE;
    public static final VoiceConversionGrpcService$RtVoiceConversionRequest$Type CLOSE;
    public static final VoiceConversionGrpcService$RtVoiceConversionRequest$Type MODIFY;
    public static final VoiceConversionGrpcService$RtVoiceConversionRequest$Type NEW;
    public static final VoiceConversionGrpcService$RtVoiceConversionRequest$Type UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       VoiceConversionGrpcService$RtVoiceConversionRequest$Type rtVoiceConve = new VoiceConversionGrpcService$RtVoiceConversionRequest$Type("NEW", 0, 0);
       VoiceConversionGrpcService$RtVoiceConversionRequest$Type.NEW = rtVoiceConve;
       VoiceConversionGrpcService$RtVoiceConversionRequest$Type rtVoiceConve1 = new VoiceConversionGrpcService$RtVoiceConversionRequest$Type("APPEND", 1, 1);
       VoiceConversionGrpcService$RtVoiceConversionRequest$Type.APPEND = rtVoiceConve1;
       VoiceConversionGrpcService$RtVoiceConversionRequest$Type rtVoiceConve2 = new VoiceConversionGrpcService$RtVoiceConversionRequest$Type("CLOSE", 2, 2);
       VoiceConversionGrpcService$RtVoiceConversionRequest$Type.CLOSE = rtVoiceConve2;
       VoiceConversionGrpcService$RtVoiceConversionRequest$Type rtVoiceConve3 = new VoiceConversionGrpcService$RtVoiceConversionRequest$Type("MODIFY", 3, 3);
       VoiceConversionGrpcService$RtVoiceConversionRequest$Type.MODIFY = rtVoiceConve3;
       VoiceConversionGrpcService$RtVoiceConversionRequest$Type rtVoiceConve4 = new VoiceConversionGrpcService$RtVoiceConversionRequest$Type("CLEAR_CACHE", 4, 4);
       VoiceConversionGrpcService$RtVoiceConversionRequest$Type.CLEAR_CACHE = rtVoiceConve4;
       VoiceConversionGrpcService$RtVoiceConversionRequest$Type rtVoiceConve5 = new VoiceConversionGrpcService$RtVoiceConversionRequest$Type("UNRECOGNIZED", 5, -1);
       VoiceConversionGrpcService$RtVoiceConversionRequest$Type.UNRECOGNIZED = rtVoiceConve5;
       VoiceConversionGrpcService$RtVoiceConversionRequest$Type[] rtVoiceConve6 = new VoiceConversionGrpcService$RtVoiceConversionRequest$Type[]{rtVoiceConve,rtVoiceConve1,rtVoiceConve2,rtVoiceConve3,rtVoiceConve4,rtVoiceConve5};
       VoiceConversionGrpcService$RtVoiceConversionRequest$Type.$VALUES = rtVoiceConve6;
       VoiceConversionGrpcService$RtVoiceConversionRequest$Type.internalValueMap = new VoiceConversionGrpcService$RtVoiceConversionRequest$Type$a();
    }
    public void VoiceConversionGrpcService$RtVoiceConversionRequest$Type(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static VoiceConversionGrpcService$RtVoiceConversionRequest$Type forNumber(int p0){
       if (!p0) {
          return VoiceConversionGrpcService$RtVoiceConversionRequest$Type.NEW;
       }
       if (p0 == 1) {
          return VoiceConversionGrpcService$RtVoiceConversionRequest$Type.APPEND;
       }
       if (p0 == 2) {
          return VoiceConversionGrpcService$RtVoiceConversionRequest$Type.CLOSE;
       }
       if (p0 == 3) {
          return VoiceConversionGrpcService$RtVoiceConversionRequest$Type.MODIFY;
       }
       if (p0 != 4) {
          return null;
       }
       return VoiceConversionGrpcService$RtVoiceConversionRequest$Type.CLEAR_CACHE;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return VoiceConversionGrpcService$RtVoiceConversionRequest$Type.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return VoiceConversionGrpcService$RtVoiceConversionRequest$Type$b.a;
    }
    public static VoiceConversionGrpcService$RtVoiceConversionRequest$Type valueOf(int p0){
       return VoiceConversionGrpcService$RtVoiceConversionRequest$Type.forNumber(p0);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionRequest$Type valueOf(String p0){
       return Enum.valueOf(VoiceConversionGrpcService$RtVoiceConversionRequest$Type.class, p0);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionRequest$Type[] values(){
       return VoiceConversionGrpcService$RtVoiceConversionRequest$Type.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != VoiceConversionGrpcService$RtVoiceConversionRequest$Type.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
