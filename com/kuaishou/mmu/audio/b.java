package com.kuaishou.mmu.audio.b;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.Map;
import com.kuaishou.mmu.audio.VoiceConversionGrpcService$ParamValue;
import com.kuaishou.mmu.audio.VoiceConversionGrpcService$RtVoiceConversionRequest$Type;

public interface abstract b implements MessageLiteOrBuilder	// class@000a05
{

    boolean containsExtentInfo(String p0);
    ByteString getAudio();
    Map getExtentInfo();
    int getExtentInfoCount();
    Map getExtentInfoMap();
    VoiceConversionGrpcService$ParamValue getExtentInfoOrDefault(String p0,VoiceConversionGrpcService$ParamValue p1);
    VoiceConversionGrpcService$ParamValue getExtentInfoOrThrow(String p0);
    int getInputChannel();
    String getInputFormat();
    ByteString getInputFormatBytes();
    int getInputSampleRate();
    int getOutputAudioObjectType();
    int getOutputBitRate();
    int getOutputBitRateMode();
    int getOutputChannel();
    int getOutputFormat();
    int getOutputPacketDur();
    int getOutputPitch();
    int getOutputSampleRate();
    int getOutputSpeed();
    int getOutputVolume();
    String getReqid();
    ByteString getReqidBytes();
    long getSerialNo();
    int getSpeakerId();
    VoiceConversionGrpcService$RtVoiceConversionRequest$Type getType();
    int getTypeValue();
    String getUserid();
    ByteString getUseridBytes();
}
