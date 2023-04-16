package com.kuaishou.mmu.audio.c;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.ByteString;
import java.lang.String;
import com.kuaishou.mmu.common.Result$ResultStatus;
import com.kuaishou.mmu.audio.VoiceConversionGrpcService$RtVoiceConversionResponse$Type;

public interface abstract c implements MessageLiteOrBuilder	// class@000a06
{

    ByteString getAudio();
    boolean getContinue();
    String getReqid();
    ByteString getReqidBytes();
    long getSerialNo();
    Result$ResultStatus getStatus();
    VoiceConversionGrpcService$RtVoiceConversionResponse$Type getType();
    int getTypeValue();
    String getUserid();
    ByteString getUseridBytes();
    boolean hasStatus();
}
