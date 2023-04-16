package com.kuaishou.mmu.audio.StreamTextToSpeechGrpcService$StreamTextToSpeechRequest;
import fn4.b;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.mmu.audio.StreamTextToSpeechGrpcService$StreamTextToSpeechRequest$a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import fn4.a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class StreamTextToSpeechGrpcService$StreamTextToSpeechRequest extends GeneratedMessageLite implements b	// class@0009f1
{
    public int aot_;
    public int audioBitRate_;
    public int audioFormat_;
    public int bitRateMode_;
    public String content_;
    public int ichs_;
    public int inputType_;
    public int langType_;
    public int pitch_;
    public String reqId_;
    public int sampleRate_;
    public float semitone_;
    public long serialNo_;
    public int speakerId_;
    public int speed_;
    public int streamPacketDur_;
    public float timbre_;
    public String userid_;
    public String voiceName_;
    public int volume_;
    public static final StreamTextToSpeechGrpcService$StreamTextToSpeechRequest DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StreamTextToSpeechGrpcService$StreamTextToSpeechRequest streamTextTo = new StreamTextToSpeechGrpcService$StreamTextToSpeechRequest();
       StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.DEFAULT_INSTANCE = streamTextTo;
       GeneratedMessageLite.registerDefaultInstance(StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.class, streamTextTo);
    }
    public void StreamTextToSpeechGrpcService$StreamTextToSpeechRequest(){
       super();
       this.voiceName_ = "";
       this.content_ = "";
       this.reqId_ = "";
       this.userid_ = "";
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechRequest getDefaultInstance(){
       return StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.DEFAULT_INSTANCE;
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechRequest$a newBuilder(){
       return StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechRequest$a newBuilder(StreamTextToSpeechGrpcService$StreamTextToSpeechRequest p0){
       return StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechRequest parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.DEFAULT_INSTANCE, p0);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechRequest parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechRequest parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.DEFAULT_INSTANCE, p0);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechRequest parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechRequest parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.DEFAULT_INSTANCE, p0);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechRequest parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechRequest parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.DEFAULT_INSTANCE, p0);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechRequest parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechRequest parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.DEFAULT_INSTANCE, p0);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechRequest parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechRequest parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.DEFAULT_INSTANCE, p0);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechRequest parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAot(){
       this.aot_ = 0;
    }
    public void clearAudioBitRate(){
       this.audioBitRate_ = 0;
    }
    public void clearAudioFormat(){
       this.audioFormat_ = 0;
    }
    public void clearBitRateMode(){
       this.bitRateMode_ = 0;
    }
    public void clearContent(){
       this.content_ = StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.getDefaultInstance().getContent();
    }
    public void clearIchs(){
       this.ichs_ = 0;
    }
    public void clearInputType(){
       this.inputType_ = 0;
    }
    public void clearLangType(){
       this.langType_ = 0;
    }
    public void clearPitch(){
       this.pitch_ = 0;
    }
    public void clearReqId(){
       this.reqId_ = StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.getDefaultInstance().getReqId();
    }
    public void clearSampleRate(){
       this.sampleRate_ = 0;
    }
    public void clearSemitone(){
       this.semitone_ = 0;
    }
    public void clearSerialNo(){
       this.serialNo_ = 0;
    }
    public void clearSpeakerId(){
       this.speakerId_ = 0;
    }
    public void clearSpeed(){
       this.speed_ = 0;
    }
    public void clearStreamPacketDur(){
       this.streamPacketDur_ = 0;
    }
    public void clearTimbre(){
       this.timbre_ = 0;
    }
    public void clearUserid(){
       this.userid_ = StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.getDefaultInstance().getUserid();
    }
    public void clearVoiceName(){
       this.voiceName_ = StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.getDefaultInstance().getVoiceName();
    }
    public void clearVolume(){
       this.volume_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new StreamTextToSpeechGrpcService$StreamTextToSpeechRequest();
           case 2:
             return new StreamTextToSpeechGrpcService$StreamTextToSpeechRequest$a(p2);
           case 3:
             Object[] objArray = new Object[20];
             objArray[0] = "voiceName_";
             objArray[i] = "sampleRate_";
             objArray[2] = "speed_";
             objArray[3] = "volume_";
             objArray[4] = "pitch_";
             objArray[5] = "content_";
             objArray[6] = "semitone_";
             objArray[7] = "timbre_";
             objArray[8] = "reqId_";
             objArray[9] = "serialNo_";
             objArray[10] = "langType_";
             objArray[11] = "speakerId_";
             objArray[12] = "streamPacketDur_";
             objArray[13] = "audioFormat_";
             objArray[14] = "audioBitRate_";
             objArray[15] = "userid_";
             objArray[16] = "inputType_";
             objArray[17] = "aot_";
             objArray[18] = "ichs_";
             objArray[19] = "bitRateMode_";
             return GeneratedMessageLite.newMessageInfo(StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x14\xff\x02\xff\x02\xff\x02\xff\x02\x01\x14\x14\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x0b\x03\x0b\x04\x0b\x05\x0b\x06\x02\x02\x07\x01\b\x01\t\x02\x02\n\x02\x0b\x04\f\x04\r\x04\x0e\x04\x0f\x04\x10\x02\x02\x11\x04\x12\x04\x13\x04\x14\x04\x00", objArray);
           case 4:
             return StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.PARSER;
             if (pARSER == null) {
                _monitor_enter(StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.class);
                pARSER = StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.DEFAULT_INSTANCE);
                   StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.PARSER = pARSER;
                }
                _monitor_exit(StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.class);
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
    public int getAot(){
       return this.aot_;
    }
    public int getAudioBitRate(){
       return this.audioBitRate_;
    }
    public int getAudioFormat(){
       return this.audioFormat_;
    }
    public int getBitRateMode(){
       return this.bitRateMode_;
    }
    public String getContent(){
       return this.content_;
    }
    public ByteString getContentBytes(){
       return ByteString.copyFromUtf8(this.content_);
    }
    public int getIchs(){
       return this.ichs_;
    }
    public int getInputType(){
       return this.inputType_;
    }
    public int getLangType(){
       return this.langType_;
    }
    public int getPitch(){
       return this.pitch_;
    }
    public String getReqId(){
       return this.reqId_;
    }
    public ByteString getReqIdBytes(){
       return ByteString.copyFromUtf8(this.reqId_);
    }
    public int getSampleRate(){
       return this.sampleRate_;
    }
    public float getSemitone(){
       return this.semitone_;
    }
    public long getSerialNo(){
       return this.serialNo_;
    }
    public int getSpeakerId(){
       return this.speakerId_;
    }
    public int getSpeed(){
       return this.speed_;
    }
    public int getStreamPacketDur(){
       return this.streamPacketDur_;
    }
    public float getTimbre(){
       return this.timbre_;
    }
    public String getUserid(){
       return this.userid_;
    }
    public ByteString getUseridBytes(){
       return ByteString.copyFromUtf8(this.userid_);
    }
    public String getVoiceName(){
       return this.voiceName_;
    }
    public ByteString getVoiceNameBytes(){
       return ByteString.copyFromUtf8(this.voiceName_);
    }
    public int getVolume(){
       return this.volume_;
    }
    public void setAot(int p0){
       this.aot_ = p0;
    }
    public void setAudioBitRate(int p0){
       this.audioBitRate_ = p0;
    }
    public void setAudioFormat(int p0){
       this.audioFormat_ = p0;
    }
    public void setBitRateMode(int p0){
       this.bitRateMode_ = p0;
    }
    public void setContent(String p0){
       Objects.requireNonNull(p0);
       this.content_ = p0;
    }
    public void setContentBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.content_ = p0.toStringUtf8();
    }
    public void setIchs(int p0){
       this.ichs_ = p0;
    }
    public void setInputType(int p0){
       this.inputType_ = p0;
    }
    public void setLangType(int p0){
       this.langType_ = p0;
    }
    public void setPitch(int p0){
       this.pitch_ = p0;
    }
    public void setReqId(String p0){
       Objects.requireNonNull(p0);
       this.reqId_ = p0;
    }
    public void setReqIdBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.reqId_ = p0.toStringUtf8();
    }
    public void setSampleRate(int p0){
       this.sampleRate_ = p0;
    }
    public void setSemitone(float p0){
       this.semitone_ = p0;
    }
    public void setSerialNo(long p0){
       this.serialNo_ = p0;
    }
    public void setSpeakerId(int p0){
       this.speakerId_ = p0;
    }
    public void setSpeed(int p0){
       this.speed_ = p0;
    }
    public void setStreamPacketDur(int p0){
       this.streamPacketDur_ = p0;
    }
    public void setTimbre(float p0){
       this.timbre_ = p0;
    }
    public void setUserid(String p0){
       Objects.requireNonNull(p0);
       this.userid_ = p0;
    }
    public void setUseridBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.userid_ = p0.toStringUtf8();
    }
    public void setVoiceName(String p0){
       Objects.requireNonNull(p0);
       this.voiceName_ = p0;
    }
    public void setVoiceNameBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.voiceName_ = p0.toStringUtf8();
    }
    public void setVolume(int p0){
       this.volume_ = p0;
    }
}
