package com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotInfo;
import hr4.o;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotInfo$a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import hr4.a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotInstruction;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotInfoStatus;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotInstruction$a;
import com.google.protobuf.AbstractMessageLite;

public final class StentorMMU$SpeechRobotInfo extends GeneratedMessageLite implements o	// class@000dbd
{
    public StentorMMU$RobotInstruction instruction_;
    public String liveId_;
    public ByteString outputSpeech_;
    public String reqId_;
    public String speechText_;
    public ByteString speech_;
    public int status_;
    public String userId_;
    public static final StentorMMU$SpeechRobotInfo DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StentorMMU$SpeechRobotInfo speechRobotI = new StentorMMU$SpeechRobotInfo();
       StentorMMU$SpeechRobotInfo.DEFAULT_INSTANCE = speechRobotI;
       GeneratedMessageLite.registerDefaultInstance(StentorMMU$SpeechRobotInfo.class, speechRobotI);
    }
    public void StentorMMU$SpeechRobotInfo(){
       super();
       this.reqId_ = "";
       this.userId_ = "";
       this.liveId_ = "";
       ByteString eMPTY = ByteString.EMPTY;
       this.outputSpeech_ = eMPTY;
       this.speechText_ = "";
       this.speech_ = eMPTY;
    }
    public static StentorMMU$SpeechRobotInfo getDefaultInstance(){
       return StentorMMU$SpeechRobotInfo.DEFAULT_INSTANCE;
    }
    public static StentorMMU$SpeechRobotInfo$a newBuilder(){
       return StentorMMU$SpeechRobotInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static StentorMMU$SpeechRobotInfo$a newBuilder(StentorMMU$SpeechRobotInfo p0){
       return StentorMMU$SpeechRobotInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StentorMMU$SpeechRobotInfo parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$SpeechRobotInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SpeechRobotInfo parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$SpeechRobotInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$SpeechRobotInfo parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SpeechRobotInfo parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$SpeechRobotInfo parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SpeechRobotInfo parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$SpeechRobotInfo parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SpeechRobotInfo parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$SpeechRobotInfo parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SpeechRobotInfo parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$SpeechRobotInfo parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SpeechRobotInfo parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StentorMMU$SpeechRobotInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearInstruction(){
       this.instruction_ = null;
    }
    public void clearLiveId(){
       this.liveId_ = StentorMMU$SpeechRobotInfo.getDefaultInstance().getLiveId();
    }
    public void clearOutputSpeech(){
       this.outputSpeech_ = StentorMMU$SpeechRobotInfo.getDefaultInstance().getOutputSpeech();
    }
    public void clearReqId(){
       this.reqId_ = StentorMMU$SpeechRobotInfo.getDefaultInstance().getReqId();
    }
    public void clearSpeech(){
       this.speech_ = StentorMMU$SpeechRobotInfo.getDefaultInstance().getSpeech();
    }
    public void clearSpeechText(){
       this.speechText_ = StentorMMU$SpeechRobotInfo.getDefaultInstance().getSpeechText();
    }
    public void clearStatus(){
       this.status_ = 0;
    }
    public void clearUserId(){
       this.userId_ = StentorMMU$SpeechRobotInfo.getDefaultInstance().getUserId();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new StentorMMU$SpeechRobotInfo();
           case 2:
             return new StentorMMU$SpeechRobotInfo$a(p2);
           case 3:
             Object[] objArray = new Object[]{"reqId_","userId_","liveId_","outputSpeech_","status_","instruction_","speechText_","speech_"};
             return GeneratedMessageLite.newMessageInfo(StentorMMU$SpeechRobotInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\b\xff\x02\xff\x02\xff\x02\xff\x02\x01\b\b\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\n\x05\f\x06\t\x07\x02\x02\b\n\x00", objArray);
           case 4:
             return StentorMMU$SpeechRobotInfo.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StentorMMU$SpeechRobotInfo.PARSER;
             if (pARSER == null) {
                _monitor_enter(StentorMMU$SpeechRobotInfo.class);
                pARSER = StentorMMU$SpeechRobotInfo.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StentorMMU$SpeechRobotInfo.DEFAULT_INSTANCE);
                   StentorMMU$SpeechRobotInfo.PARSER = pARSER;
                }
                _monitor_exit(StentorMMU$SpeechRobotInfo.class);
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
    public StentorMMU$RobotInstruction getInstruction(){
       StentorMMU$SpeechRobotInfo tinstruction = this.instruction_;
       if (tinstruction == null) {
          tinstruction = StentorMMU$RobotInstruction.getDefaultInstance();
       }
       return tinstruction;
    }
    public String getLiveId(){
       return this.liveId_;
    }
    public ByteString getLiveIdBytes(){
       return ByteString.copyFromUtf8(this.liveId_);
    }
    public ByteString getOutputSpeech(){
       return this.outputSpeech_;
    }
    public String getReqId(){
       return this.reqId_;
    }
    public ByteString getReqIdBytes(){
       return ByteString.copyFromUtf8(this.reqId_);
    }
    public ByteString getSpeech(){
       return this.speech_;
    }
    public String getSpeechText(){
       return this.speechText_;
    }
    public ByteString getSpeechTextBytes(){
       return ByteString.copyFromUtf8(this.speechText_);
    }
    public StentorMMU$SpeechRobotInfoStatus getStatus(){
       StentorMMU$SpeechRobotInfoStatus speechRobotI = StentorMMU$SpeechRobotInfoStatus.forNumber(this.status_);
       if (speechRobotI == null) {
          speechRobotI = StentorMMU$SpeechRobotInfoStatus.UNRECOGNIZED;
       }
       return speechRobotI;
    }
    public int getStatusValue(){
       return this.status_;
    }
    public String getUserId(){
       return this.userId_;
    }
    public ByteString getUserIdBytes(){
       return ByteString.copyFromUtf8(this.userId_);
    }
    public boolean hasInstruction(){
       boolean b = (this.instruction_ != null)? true: false;
       return b;
    }
    public void mergeInstruction(StentorMMU$RobotInstruction p0){
       Objects.requireNonNull(p0);
       StentorMMU$SpeechRobotInfo tinstruction = this.instruction_;
       this.instruction_ = (tinstruction != null && tinstruction != StentorMMU$RobotInstruction.getDefaultInstance())? StentorMMU$RobotInstruction.newBuilder(this.instruction_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setInstruction(StentorMMU$RobotInstruction p0){
       Objects.requireNonNull(p0);
       this.instruction_ = p0;
    }
    public void setLiveId(String p0){
       Objects.requireNonNull(p0);
       this.liveId_ = p0;
    }
    public void setLiveIdBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.liveId_ = p0.toStringUtf8();
    }
    public void setOutputSpeech(ByteString p0){
       Objects.requireNonNull(p0);
       this.outputSpeech_ = p0;
    }
    public void setReqId(String p0){
       Objects.requireNonNull(p0);
       this.reqId_ = p0;
    }
    public void setReqIdBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.reqId_ = p0.toStringUtf8();
    }
    public void setSpeech(ByteString p0){
       Objects.requireNonNull(p0);
       this.speech_ = p0;
    }
    public void setSpeechText(String p0){
       Objects.requireNonNull(p0);
       this.speechText_ = p0;
    }
    public void setSpeechTextBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.speechText_ = p0.toStringUtf8();
    }
    public void setStatus(StentorMMU$SpeechRobotInfoStatus p0){
       this.status_ = p0.getNumber();
    }
    public void setStatusValue(int p0){
       this.status_ = p0;
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
