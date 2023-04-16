package com.kuaishou.mmu.audio.VoiceConversionGrpcService$RtVoiceConversionRequest$a;
import com.kuaishou.mmu.audio.b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.mmu.audio.VoiceConversionGrpcService$RtVoiceConversionRequest;
import com.google.protobuf.GeneratedMessageLite;
import fn4.c;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.util.Map;
import com.google.protobuf.ByteString;
import java.util.Collections;
import com.kuaishou.mmu.audio.VoiceConversionGrpcService$ParamValue;
import java.lang.IllegalArgumentException;
import com.kuaishou.mmu.audio.VoiceConversionGrpcService$RtVoiceConversionRequest$Type;

public final class VoiceConversionGrpcService$RtVoiceConversionRequest$a extends GeneratedMessageLite$Builder implements b	// class@0009fc
{

    public void VoiceConversionGrpcService$RtVoiceConversionRequest$a(){
       super(VoiceConversionGrpcService$RtVoiceConversionRequest.DEFAULT_INSTANCE);
    }
    public void VoiceConversionGrpcService$RtVoiceConversionRequest$a(c p0){
       super(VoiceConversionGrpcService$RtVoiceConversionRequest.DEFAULT_INSTANCE);
    }
    public boolean containsExtentInfo(String p0){
       Objects.requireNonNull(p0);
       return this.instance.getExtentInfoMap().containsKey(p0);
    }
    public ByteString getAudio(){
       return this.instance.getAudio();
    }
    public Map getExtentInfo(){
       return Collections.unmodifiableMap(this.instance.getExtentInfoMap());
    }
    public int getExtentInfoCount(){
       return this.instance.getExtentInfoMap().size();
    }
    public Map getExtentInfoMap(){
       return Collections.unmodifiableMap(this.instance.getExtentInfoMap());
    }
    public VoiceConversionGrpcService$ParamValue getExtentInfoOrDefault(String p0,VoiceConversionGrpcService$ParamValue p1){
       Objects.requireNonNull(p0);
       Map extentInfoMa = this.instance.getExtentInfoMap();
       if (extentInfoMa.containsKey(p0)) {
          p1 = extentInfoMa.get(p0);
       }
       return p1;
    }
    public VoiceConversionGrpcService$ParamValue getExtentInfoOrThrow(String p0){
       Objects.requireNonNull(p0);
       Map extentInfoMa = this.instance.getExtentInfoMap();
       if (extentInfoMa.containsKey(p0)) {
          return extentInfoMa.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public int getInputChannel(){
       return this.instance.getInputChannel();
    }
    public String getInputFormat(){
       return this.instance.getInputFormat();
    }
    public ByteString getInputFormatBytes(){
       return this.instance.getInputFormatBytes();
    }
    public int getInputSampleRate(){
       return this.instance.getInputSampleRate();
    }
    public int getOutputAudioObjectType(){
       return this.instance.getOutputAudioObjectType();
    }
    public int getOutputBitRate(){
       return this.instance.getOutputBitRate();
    }
    public int getOutputBitRateMode(){
       return this.instance.getOutputBitRateMode();
    }
    public int getOutputChannel(){
       return this.instance.getOutputChannel();
    }
    public int getOutputFormat(){
       return this.instance.getOutputFormat();
    }
    public int getOutputPacketDur(){
       return this.instance.getOutputPacketDur();
    }
    public int getOutputPitch(){
       return this.instance.getOutputPitch();
    }
    public int getOutputSampleRate(){
       return this.instance.getOutputSampleRate();
    }
    public int getOutputSpeed(){
       return this.instance.getOutputSpeed();
    }
    public int getOutputVolume(){
       return this.instance.getOutputVolume();
    }
    public String getReqid(){
       return this.instance.getReqid();
    }
    public ByteString getReqidBytes(){
       return this.instance.getReqidBytes();
    }
    public long getSerialNo(){
       return this.instance.getSerialNo();
    }
    public int getSpeakerId(){
       return this.instance.getSpeakerId();
    }
    public VoiceConversionGrpcService$RtVoiceConversionRequest$Type getType(){
       return this.instance.getType();
    }
    public int getTypeValue(){
       return this.instance.getTypeValue();
    }
    public String getUserid(){
       return this.instance.getUserid();
    }
    public ByteString getUseridBytes(){
       return this.instance.getUseridBytes();
    }
}
