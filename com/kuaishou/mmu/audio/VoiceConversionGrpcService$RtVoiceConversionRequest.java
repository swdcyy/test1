package com.kuaishou.mmu.audio.VoiceConversionGrpcService$RtVoiceConversionRequest;
import com.kuaishou.mmu.audio.b;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.ByteString;
import com.kuaishou.mmu.audio.VoiceConversionGrpcService$RtVoiceConversionRequest$a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.util.LinkedHashMap;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import fn4.c;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.kuaishou.mmu.audio.VoiceConversionGrpcService$RtVoiceConversionRequest$b;
import com.google.protobuf.MessageLite;
import java.util.Map;
import java.util.Collections;
import com.kuaishou.mmu.audio.VoiceConversionGrpcService$ParamValue;
import java.util.HashMap;
import java.lang.IllegalArgumentException;
import com.kuaishou.mmu.audio.VoiceConversionGrpcService$RtVoiceConversionRequest$Type;
import com.google.protobuf.AbstractMessageLite;

public final class VoiceConversionGrpcService$RtVoiceConversionRequest extends GeneratedMessageLite implements b	// class@0009fe
{
    public ByteString audio_;
    public MapFieldLite extentInfo_;
    public int inputChannel_;
    public String inputFormat_;
    public int inputSampleRate_;
    public int outputAudioObjectType_;
    public int outputBitRateMode_;
    public int outputBitRate_;
    public int outputChannel_;
    public int outputFormat_;
    public int outputPacketDur_;
    public int outputPitch_;
    public int outputSampleRate_;
    public int outputSpeed_;
    public int outputVolume_;
    public String reqid_;
    public long serialNo_;
    public int speakerId_;
    public int type_;
    public String userid_;
    public static final VoiceConversionGrpcService$RtVoiceConversionRequest DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       VoiceConversionGrpcService$RtVoiceConversionRequest rtVoiceConve = new VoiceConversionGrpcService$RtVoiceConversionRequest();
       VoiceConversionGrpcService$RtVoiceConversionRequest.DEFAULT_INSTANCE = rtVoiceConve;
       GeneratedMessageLite.registerDefaultInstance(VoiceConversionGrpcService$RtVoiceConversionRequest.class, rtVoiceConve);
    }
    public void VoiceConversionGrpcService$RtVoiceConversionRequest(){
       super();
       this.extentInfo_ = MapFieldLite.emptyMapField();
       this.reqid_ = "";
       this.audio_ = ByteString.EMPTY;
       this.userid_ = "";
       this.inputFormat_ = "";
    }
    public static VoiceConversionGrpcService$RtVoiceConversionRequest getDefaultInstance(){
       return VoiceConversionGrpcService$RtVoiceConversionRequest.DEFAULT_INSTANCE;
    }
    public static VoiceConversionGrpcService$RtVoiceConversionRequest$a newBuilder(){
       return VoiceConversionGrpcService$RtVoiceConversionRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static VoiceConversionGrpcService$RtVoiceConversionRequest$a newBuilder(VoiceConversionGrpcService$RtVoiceConversionRequest p0){
       return VoiceConversionGrpcService$RtVoiceConversionRequest.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionRequest parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(VoiceConversionGrpcService$RtVoiceConversionRequest.DEFAULT_INSTANCE, p0);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionRequest parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(VoiceConversionGrpcService$RtVoiceConversionRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionRequest parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$RtVoiceConversionRequest.DEFAULT_INSTANCE, p0);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionRequest parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$RtVoiceConversionRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionRequest parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$RtVoiceConversionRequest.DEFAULT_INSTANCE, p0);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionRequest parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$RtVoiceConversionRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionRequest parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$RtVoiceConversionRequest.DEFAULT_INSTANCE, p0);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionRequest parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$RtVoiceConversionRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionRequest parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$RtVoiceConversionRequest.DEFAULT_INSTANCE, p0);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionRequest parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$RtVoiceConversionRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionRequest parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$RtVoiceConversionRequest.DEFAULT_INSTANCE, p0);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionRequest parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$RtVoiceConversionRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return VoiceConversionGrpcService$RtVoiceConversionRequest.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAudio(){
       this.audio_ = VoiceConversionGrpcService$RtVoiceConversionRequest.getDefaultInstance().getAudio();
    }
    public void clearInputChannel(){
       this.inputChannel_ = 0;
    }
    public void clearInputFormat(){
       this.inputFormat_ = VoiceConversionGrpcService$RtVoiceConversionRequest.getDefaultInstance().getInputFormat();
    }
    public void clearInputSampleRate(){
       this.inputSampleRate_ = 0;
    }
    public void clearOutputAudioObjectType(){
       this.outputAudioObjectType_ = 0;
    }
    public void clearOutputBitRate(){
       this.outputBitRate_ = 0;
    }
    public void clearOutputBitRateMode(){
       this.outputBitRateMode_ = 0;
    }
    public void clearOutputChannel(){
       this.outputChannel_ = 0;
    }
    public void clearOutputFormat(){
       this.outputFormat_ = 0;
    }
    public void clearOutputPacketDur(){
       this.outputPacketDur_ = 0;
    }
    public void clearOutputPitch(){
       this.outputPitch_ = 0;
    }
    public void clearOutputSampleRate(){
       this.outputSampleRate_ = 0;
    }
    public void clearOutputSpeed(){
       this.outputSpeed_ = 0;
    }
    public void clearOutputVolume(){
       this.outputVolume_ = 0;
    }
    public void clearReqid(){
       this.reqid_ = VoiceConversionGrpcService$RtVoiceConversionRequest.getDefaultInstance().getReqid();
    }
    public void clearSerialNo(){
       this.serialNo_ = 0;
    }
    public void clearSpeakerId(){
       this.speakerId_ = 0;
    }
    public void clearType(){
       this.type_ = 0;
    }
    public void clearUserid(){
       this.userid_ = VoiceConversionGrpcService$RtVoiceConversionRequest.getDefaultInstance().getUserid();
    }
    public boolean containsExtentInfo(String p0){
       Objects.requireNonNull(p0);
       return this.internalGetExtentInfo().containsKey(p0);
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (c.a[p0.ordinal()]){
           case 1:
             return new VoiceConversionGrpcService$RtVoiceConversionRequest();
           case 2:
             return new VoiceConversionGrpcService$RtVoiceConversionRequest$a(p2);
           case 3:
             Object[] objArray = new Object[21];
             objArray[0] = "reqid_";
             objArray[i] = "type_";
             objArray[2] = "serialNo_";
             objArray[3] = "audio_";
             objArray[4] = "userid_";
             objArray[5] = "speakerId_";
             objArray[6] = "inputFormat_";
             objArray[7] = "inputChannel_";
             objArray[8] = "inputSampleRate_";
             objArray[9] = "outputAudioObjectType_";
             objArray[10] = "outputFormat_";
             objArray[11] = "outputChannel_";
             objArray[12] = "outputBitRateMode_";
             objArray[13] = "outputSampleRate_";
             objArray[14] = "outputVolume_";
             objArray[15] = "outputSpeed_";
             objArray[16] = "outputPitch_";
             objArray[17] = "outputBitRate_";
             objArray[18] = "outputPacketDur_";
             objArray[19] = "extentInfo_";
             objArray[20] = VoiceConversionGrpcService$RtVoiceConversionRequest$b.a;
             return GeneratedMessageLite.newMessageInfo(VoiceConversionGrpcService$RtVoiceConversionRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x14\xff\x02\xff\x02\xff\x02\xff\x02\x01\x14\x14\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\f\x03\x02\x04\n\x05\x02\x02\x06\x04\x07\x02\x02\b\x04\t\x04\n\x04\x0b\x04\f\x04\r\x04\x0e\x04\x0f\x04\x10\x04\x11\x04\x12\x04\x13\x04\x142\x00", objArray);
           case 4:
             return VoiceConversionGrpcService$RtVoiceConversionRequest.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = VoiceConversionGrpcService$RtVoiceConversionRequest.PARSER;
             if (pARSER == null) {
                _monitor_enter(VoiceConversionGrpcService$RtVoiceConversionRequest.class);
                pARSER = VoiceConversionGrpcService$RtVoiceConversionRequest.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(VoiceConversionGrpcService$RtVoiceConversionRequest.DEFAULT_INSTANCE);
                   VoiceConversionGrpcService$RtVoiceConversionRequest.PARSER = pARSER;
                }
                _monitor_exit(VoiceConversionGrpcService$RtVoiceConversionRequest.class);
             }
             return pARSER;
             break;
           case 6:
             return Byte.valueOf(i);
           case 7:
             return p2;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public ByteString getAudio(){
       return this.audio_;
    }
    public Map getExtentInfo(){
       return this.getExtentInfoMap();
    }
    public int getExtentInfoCount(){
       return this.internalGetExtentInfo().size();
    }
    public Map getExtentInfoMap(){
       return Collections.unmodifiableMap(this.internalGetExtentInfo());
    }
    public VoiceConversionGrpcService$ParamValue getExtentInfoOrDefault(String p0,VoiceConversionGrpcService$ParamValue p1){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetExtentInfo();
       if (mapFieldLite.containsKey(p0)) {
          p1 = mapFieldLite.get(p0);
       }
       return p1;
    }
    public VoiceConversionGrpcService$ParamValue getExtentInfoOrThrow(String p0){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetExtentInfo();
       if (mapFieldLite.containsKey(p0)) {
          return mapFieldLite.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public int getInputChannel(){
       return this.inputChannel_;
    }
    public String getInputFormat(){
       return this.inputFormat_;
    }
    public ByteString getInputFormatBytes(){
       return ByteString.copyFromUtf8(this.inputFormat_);
    }
    public int getInputSampleRate(){
       return this.inputSampleRate_;
    }
    public Map getMutableExtentInfoMap(){
       return this.internalGetMutableExtentInfo();
    }
    public int getOutputAudioObjectType(){
       return this.outputAudioObjectType_;
    }
    public int getOutputBitRate(){
       return this.outputBitRate_;
    }
    public int getOutputBitRateMode(){
       return this.outputBitRateMode_;
    }
    public int getOutputChannel(){
       return this.outputChannel_;
    }
    public int getOutputFormat(){
       return this.outputFormat_;
    }
    public int getOutputPacketDur(){
       return this.outputPacketDur_;
    }
    public int getOutputPitch(){
       return this.outputPitch_;
    }
    public int getOutputSampleRate(){
       return this.outputSampleRate_;
    }
    public int getOutputSpeed(){
       return this.outputSpeed_;
    }
    public int getOutputVolume(){
       return this.outputVolume_;
    }
    public String getReqid(){
       return this.reqid_;
    }
    public ByteString getReqidBytes(){
       return ByteString.copyFromUtf8(this.reqid_);
    }
    public long getSerialNo(){
       return this.serialNo_;
    }
    public int getSpeakerId(){
       return this.speakerId_;
    }
    public VoiceConversionGrpcService$RtVoiceConversionRequest$Type getType(){
       VoiceConversionGrpcService$RtVoiceConversionRequest$Type rtVoiceConve = VoiceConversionGrpcService$RtVoiceConversionRequest$Type.forNumber(this.type_);
       if (rtVoiceConve == null) {
          rtVoiceConve = VoiceConversionGrpcService$RtVoiceConversionRequest$Type.UNRECOGNIZED;
       }
       return rtVoiceConve;
    }
    public int getTypeValue(){
       return this.type_;
    }
    public String getUserid(){
       return this.userid_;
    }
    public ByteString getUseridBytes(){
       return ByteString.copyFromUtf8(this.userid_);
    }
    public final MapFieldLite internalGetExtentInfo(){
       return this.extentInfo_;
    }
    public final MapFieldLite internalGetMutableExtentInfo(){
       if (!this.extentInfo_.isMutable()) {
          this.extentInfo_ = this.extentInfo_.mutableCopy();
       }
       return this.extentInfo_;
    }
    public void setAudio(ByteString p0){
       Objects.requireNonNull(p0);
       this.audio_ = p0;
    }
    public void setInputChannel(int p0){
       this.inputChannel_ = p0;
    }
    public void setInputFormat(String p0){
       Objects.requireNonNull(p0);
       this.inputFormat_ = p0;
    }
    public void setInputFormatBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.inputFormat_ = p0.toStringUtf8();
    }
    public void setInputSampleRate(int p0){
       this.inputSampleRate_ = p0;
    }
    public void setOutputAudioObjectType(int p0){
       this.outputAudioObjectType_ = p0;
    }
    public void setOutputBitRate(int p0){
       this.outputBitRate_ = p0;
    }
    public void setOutputBitRateMode(int p0){
       this.outputBitRateMode_ = p0;
    }
    public void setOutputChannel(int p0){
       this.outputChannel_ = p0;
    }
    public void setOutputFormat(int p0){
       this.outputFormat_ = p0;
    }
    public void setOutputPacketDur(int p0){
       this.outputPacketDur_ = p0;
    }
    public void setOutputPitch(int p0){
       this.outputPitch_ = p0;
    }
    public void setOutputSampleRate(int p0){
       this.outputSampleRate_ = p0;
    }
    public void setOutputSpeed(int p0){
       this.outputSpeed_ = p0;
    }
    public void setOutputVolume(int p0){
       this.outputVolume_ = p0;
    }
    public void setReqid(String p0){
       Objects.requireNonNull(p0);
       this.reqid_ = p0;
    }
    public void setReqidBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.reqid_ = p0.toStringUtf8();
    }
    public void setSerialNo(long p0){
       this.serialNo_ = p0;
    }
    public void setSpeakerId(int p0){
       this.speakerId_ = p0;
    }
    public void setType(VoiceConversionGrpcService$RtVoiceConversionRequest$Type p0){
       this.type_ = p0.getNumber();
    }
    public void setTypeValue(int p0){
       this.type_ = p0;
    }
    public void setUserid(String p0){
       Objects.requireNonNull(p0);
       this.userid_ = p0;
    }
    public void setUseridBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.userid_ = p0.toStringUtf8();
    }
}
