package com.kuaishou.mmu.audio.a;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.ByteString;
import java.lang.String;
import com.kuaishou.mmu.audio.StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType;

public interface abstract a implements MessageLiteOrBuilder	// class@000a04
{

    ByteString getAudio();
    String getContent();
    ByteString getContentBytes();
    long getPlayDuration();
    String getReqId();
    ByteString getReqIdBytes();
    boolean getRequestContinue();
    StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType getResult();
    int getResultValue();
    long getSerialNo();
    String getUserid();
    ByteString getUseridBytes();
}
