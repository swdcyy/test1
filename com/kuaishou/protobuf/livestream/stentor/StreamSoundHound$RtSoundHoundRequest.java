package com.kuaishou.protobuf.livestream.stentor.StreamSoundHound$RtSoundHoundRequest;
import hr4.t;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.livestream.stentor.StreamSoundHound$RtSoundHoundRequest$a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import hr4.s;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionType;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class StreamSoundHound$RtSoundHoundRequest extends GeneratedMessageLite implements t	// class@000dce
{
    public ByteString audioData_;
    public int channel_;
    public String format_;
    public String model_;
    public String reqId_;
    public int sampleRate_;
    public long serialNo_;
    public int type_;
    public String userId_;
    public static final StreamSoundHound$RtSoundHoundRequest DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StreamSoundHound$RtSoundHoundRequest rtSoundHound = new StreamSoundHound$RtSoundHoundRequest();
       StreamSoundHound$RtSoundHoundRequest.DEFAULT_INSTANCE = rtSoundHound;
       GeneratedMessageLite.registerDefaultInstance(StreamSoundHound$RtSoundHoundRequest.class, rtSoundHound);
    }
    public void StreamSoundHound$RtSoundHoundRequest(){
       super();
       this.reqId_ = "";
       this.audioData_ = ByteString.EMPTY;
       this.userId_ = "";
       this.model_ = "";
       this.format_ = "";
    }
    public static StreamSoundHound$RtSoundHoundRequest getDefaultInstance(){
       return StreamSoundHound$RtSoundHoundRequest.DEFAULT_INSTANCE;
    }
    public static StreamSoundHound$RtSoundHoundRequest$a newBuilder(){
       return StreamSoundHound$RtSoundHoundRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static StreamSoundHound$RtSoundHoundRequest$a newBuilder(StreamSoundHound$RtSoundHoundRequest p0){
       return StreamSoundHound$RtSoundHoundRequest.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StreamSoundHound$RtSoundHoundRequest parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StreamSoundHound$RtSoundHoundRequest.DEFAULT_INSTANCE, p0);
    }
    public static StreamSoundHound$RtSoundHoundRequest parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StreamSoundHound$RtSoundHoundRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StreamSoundHound$RtSoundHoundRequest parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StreamSoundHound$RtSoundHoundRequest.DEFAULT_INSTANCE, p0);
    }
    public static StreamSoundHound$RtSoundHoundRequest parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StreamSoundHound$RtSoundHoundRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StreamSoundHound$RtSoundHoundRequest parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StreamSoundHound$RtSoundHoundRequest.DEFAULT_INSTANCE, p0);
    }
    public static StreamSoundHound$RtSoundHoundRequest parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StreamSoundHound$RtSoundHoundRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StreamSoundHound$RtSoundHoundRequest parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StreamSoundHound$RtSoundHoundRequest.DEFAULT_INSTANCE, p0);
    }
    public static StreamSoundHound$RtSoundHoundRequest parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StreamSoundHound$RtSoundHoundRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StreamSoundHound$RtSoundHoundRequest parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StreamSoundHound$RtSoundHoundRequest.DEFAULT_INSTANCE, p0);
    }
    public static StreamSoundHound$RtSoundHoundRequest parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StreamSoundHound$RtSoundHoundRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StreamSoundHound$RtSoundHoundRequest parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StreamSoundHound$RtSoundHoundRequest.DEFAULT_INSTANCE, p0);
    }
    public static StreamSoundHound$RtSoundHoundRequest parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StreamSoundHound$RtSoundHoundRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StreamSoundHound$RtSoundHoundRequest.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAudioData(){
       this.audioData_ = StreamSoundHound$RtSoundHoundRequest.getDefaultInstance().getAudioData();
    }
    public void clearChannel(){
       this.channel_ = 0;
    }
    public void clearFormat(){
       this.format_ = StreamSoundHound$RtSoundHoundRequest.getDefaultInstance().getFormat();
    }
    public void clearModel(){
       this.model_ = StreamSoundHound$RtSoundHoundRequest.getDefaultInstance().getModel();
    }
    public void clearReqId(){
       this.reqId_ = StreamSoundHound$RtSoundHoundRequest.getDefaultInstance().getReqId();
    }
    public void clearSampleRate(){
       this.sampleRate_ = 0;
    }
    public void clearSerialNo(){
       this.serialNo_ = 0;
    }
    public void clearType(){
       this.type_ = 0;
    }
    public void clearUserId(){
       this.userId_ = StreamSoundHound$RtSoundHoundRequest.getDefaultInstance().getUserId();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (s.a[p0.ordinal()]){
           case 1:
             return new StreamSoundHound$RtSoundHoundRequest();
           case 2:
             return new StreamSoundHound$RtSoundHoundRequest$a(p2);
           case 3:
             Object[] objArray = new Object[9];
             objArray[0] = "reqId_";
             objArray[i] = "type_";
             objArray[2] = "serialNo_";
             objArray[3] = "audioData_";
             objArray[4] = "userId_";
             objArray[5] = "model_";
             objArray[6] = "format_";
             objArray[7] = "channel_";
             objArray[8] = "sampleRate_";
             return GeneratedMessageLite.newMessageInfo(StreamSoundHound$RtSoundHoundRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\t\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\t\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\f\x03\x02\x04\n\x05\x02\x02\x06\x02\x02\x07\x02\x02\b\x04\t\x04\x00", objArray);
           case 4:
             return StreamSoundHound$RtSoundHoundRequest.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StreamSoundHound$RtSoundHoundRequest.PARSER;
             if (pARSER == null) {
                _monitor_enter(StreamSoundHound$RtSoundHoundRequest.class);
                pARSER = StreamSoundHound$RtSoundHoundRequest.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StreamSoundHound$RtSoundHoundRequest.DEFAULT_INSTANCE);
                   StreamSoundHound$RtSoundHoundRequest.PARSER = pARSER;
                }
                _monitor_exit(StreamSoundHound$RtSoundHoundRequest.class);
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
    public ByteString getAudioData(){
       return this.audioData_;
    }
    public int getChannel(){
       return this.channel_;
    }
    public String getFormat(){
       return this.format_;
    }
    public ByteString getFormatBytes(){
       return ByteString.copyFromUtf8(this.format_);
    }
    public String getModel(){
       return this.model_;
    }
    public ByteString getModelBytes(){
       return ByteString.copyFromUtf8(this.model_);
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
    public long getSerialNo(){
       return this.serialNo_;
    }
    public StentorMMU$RtSpeechRecognitionType getType(){
       StentorMMU$RtSpeechRecognitionType rtSpeechReco = StentorMMU$RtSpeechRecognitionType.forNumber(this.type_);
       if (rtSpeechReco == null) {
          rtSpeechReco = StentorMMU$RtSpeechRecognitionType.UNRECOGNIZED;
       }
       return rtSpeechReco;
    }
    public int getTypeValue(){
       return this.type_;
    }
    public String getUserId(){
       return this.userId_;
    }
    public ByteString getUserIdBytes(){
       return ByteString.copyFromUtf8(this.userId_);
    }
    public void setAudioData(ByteString p0){
       Objects.requireNonNull(p0);
       this.audioData_ = p0;
    }
    public void setChannel(int p0){
       this.channel_ = p0;
    }
    public void setFormat(String p0){
       Objects.requireNonNull(p0);
       this.format_ = p0;
    }
    public void setFormatBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.format_ = p0.toStringUtf8();
    }
    public void setModel(String p0){
       Objects.requireNonNull(p0);
       this.model_ = p0;
    }
    public void setModelBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.model_ = p0.toStringUtf8();
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
    public void setSerialNo(long p0){
       this.serialNo_ = p0;
    }
    public void setType(StentorMMU$RtSpeechRecognitionType p0){
       this.type_ = p0.getNumber();
    }
    public void setTypeValue(int p0){
       this.type_ = p0;
    }
    public void setUserId(String p0){
       Objects.requireNonNull(p0);
       this.userId_ = p0;
    }
    public void setUserIdBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.userId_ = p0.toStringUtf8();
    }
}
