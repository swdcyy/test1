package com.kuaishou.mmu.audio.VoiceConversionGrpcService$RtVoiceConversionResponse$Type;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.mmu.audio.VoiceConversionGrpcService$RtVoiceConversionResponse$Type$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.mmu.audio.VoiceConversionGrpcService$RtVoiceConversionResponse$Type$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class VoiceConversionGrpcService$RtVoiceConversionResponse$Type extends Enum implements Internal$EnumLite	// class@000a01
{
    public final int value;
    public static final VoiceConversionGrpcService$RtVoiceConversionResponse$Type[] $VALUES;
    public static final VoiceConversionGrpcService$RtVoiceConversionResponse$Type CLEAR_CACHE;
    public static final VoiceConversionGrpcService$RtVoiceConversionResponse$Type MODIFY;
    public static final VoiceConversionGrpcService$RtVoiceConversionResponse$Type NORMAL;
    public static final VoiceConversionGrpcService$RtVoiceConversionResponse$Type UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       VoiceConversionGrpcService$RtVoiceConversionResponse$Type rtVoiceConve = new VoiceConversionGrpcService$RtVoiceConversionResponse$Type("NORMAL", 0, 0);
       VoiceConversionGrpcService$RtVoiceConversionResponse$Type.NORMAL = rtVoiceConve;
       VoiceConversionGrpcService$RtVoiceConversionResponse$Type rtVoiceConve1 = new VoiceConversionGrpcService$RtVoiceConversionResponse$Type("CLEAR_CACHE", 1, 1);
       VoiceConversionGrpcService$RtVoiceConversionResponse$Type.CLEAR_CACHE = rtVoiceConve1;
       VoiceConversionGrpcService$RtVoiceConversionResponse$Type rtVoiceConve2 = new VoiceConversionGrpcService$RtVoiceConversionResponse$Type("MODIFY", 2, 2);
       VoiceConversionGrpcService$RtVoiceConversionResponse$Type.MODIFY = rtVoiceConve2;
       VoiceConversionGrpcService$RtVoiceConversionResponse$Type rtVoiceConve3 = new VoiceConversionGrpcService$RtVoiceConversionResponse$Type("UNRECOGNIZED", 3, -1);
       VoiceConversionGrpcService$RtVoiceConversionResponse$Type.UNRECOGNIZED = rtVoiceConve3;
       VoiceConversionGrpcService$RtVoiceConversionResponse$Type[] rtVoiceConve4 = new VoiceConversionGrpcService$RtVoiceConversionResponse$Type[]{rtVoiceConve,rtVoiceConve1,rtVoiceConve2,rtVoiceConve3};
       VoiceConversionGrpcService$RtVoiceConversionResponse$Type.$VALUES = rtVoiceConve4;
       VoiceConversionGrpcService$RtVoiceConversionResponse$Type.internalValueMap = new VoiceConversionGrpcService$RtVoiceConversionResponse$Type$a();
    }
    public void VoiceConversionGrpcService$RtVoiceConversionResponse$Type(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static VoiceConversionGrpcService$RtVoiceConversionResponse$Type forNumber(int p0){
       if (!p0) {
          return VoiceConversionGrpcService$RtVoiceConversionResponse$Type.NORMAL;
       }
       if (p0 == 1) {
          return VoiceConversionGrpcService$RtVoiceConversionResponse$Type.CLEAR_CACHE;
       }
       if (p0 != 2) {
          return null;
       }
       return VoiceConversionGrpcService$RtVoiceConversionResponse$Type.MODIFY;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return VoiceConversionGrpcService$RtVoiceConversionResponse$Type.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return VoiceConversionGrpcService$RtVoiceConversionResponse$Type$b.a;
    }
    public static VoiceConversionGrpcService$RtVoiceConversionResponse$Type valueOf(int p0){
       return VoiceConversionGrpcService$RtVoiceConversionResponse$Type.forNumber(p0);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionResponse$Type valueOf(String p0){
       return Enum.valueOf(VoiceConversionGrpcService$RtVoiceConversionResponse$Type.class, p0);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionResponse$Type[] values(){
       return VoiceConversionGrpcService$RtVoiceConversionResponse$Type.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != VoiceConversionGrpcService$RtVoiceConversionResponse$Type.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
