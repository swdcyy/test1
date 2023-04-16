package com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResultDetail;
import hr4.k;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResultDetail$a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.AbstractMessageLite;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$WordDetail;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import hr4.a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import hr4.r;

public final class StentorMMU$RtSpeechRecognitionResultDetail extends GeneratedMessageLite implements k	// class@000da9
{
    public float endTime_;
    public String fixedResult_;
    public float startTime_;
    public Internal$ProtobufList words_;
    public static final StentorMMU$RtSpeechRecognitionResultDetail DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StentorMMU$RtSpeechRecognitionResultDetail rtSpeechReco = new StentorMMU$RtSpeechRecognitionResultDetail();
       StentorMMU$RtSpeechRecognitionResultDetail.DEFAULT_INSTANCE = rtSpeechReco;
       GeneratedMessageLite.registerDefaultInstance(StentorMMU$RtSpeechRecognitionResultDetail.class, rtSpeechReco);
    }
    public void StentorMMU$RtSpeechRecognitionResultDetail(){
       super();
       this.fixedResult_ = "";
       this.words_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static StentorMMU$RtSpeechRecognitionResultDetail getDefaultInstance(){
       return StentorMMU$RtSpeechRecognitionResultDetail.DEFAULT_INSTANCE;
    }
    public static StentorMMU$RtSpeechRecognitionResultDetail$a newBuilder(){
       return StentorMMU$RtSpeechRecognitionResultDetail.DEFAULT_INSTANCE.createBuilder();
    }
    public static StentorMMU$RtSpeechRecognitionResultDetail$a newBuilder(StentorMMU$RtSpeechRecognitionResultDetail p0){
       return StentorMMU$RtSpeechRecognitionResultDetail.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StentorMMU$RtSpeechRecognitionResultDetail parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$RtSpeechRecognitionResultDetail.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtSpeechRecognitionResultDetail parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$RtSpeechRecognitionResultDetail.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtSpeechRecognitionResultDetail parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionResultDetail.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtSpeechRecognitionResultDetail parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionResultDetail.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtSpeechRecognitionResultDetail parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionResultDetail.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtSpeechRecognitionResultDetail parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionResultDetail.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtSpeechRecognitionResultDetail parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionResultDetail.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtSpeechRecognitionResultDetail parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionResultDetail.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtSpeechRecognitionResultDetail parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionResultDetail.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtSpeechRecognitionResultDetail parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionResultDetail.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtSpeechRecognitionResultDetail parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionResultDetail.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtSpeechRecognitionResultDetail parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionResultDetail.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StentorMMU$RtSpeechRecognitionResultDetail.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllWords(Iterable p0){
       this.ensureWordsIsMutable();
       AbstractMessageLite.addAll(p0, this.words_);
    }
    public void addWords(int p0,StentorMMU$WordDetail p1){
       Objects.requireNonNull(p1);
       this.ensureWordsIsMutable();
       this.words_.add(p0, p1);
    }
    public void addWords(StentorMMU$WordDetail p0){
       Objects.requireNonNull(p0);
       this.ensureWordsIsMutable();
       this.words_.add(p0);
    }
    public void clearEndTime(){
       this.endTime_ = 0;
    }
    public void clearFixedResult(){
       this.fixedResult_ = StentorMMU$RtSpeechRecognitionResultDetail.getDefaultInstance().getFixedResult();
    }
    public void clearStartTime(){
       this.startTime_ = 0;
    }
    public void clearWords(){
       this.words_ = GeneratedMessageLite.emptyProtobufList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new StentorMMU$RtSpeechRecognitionResultDetail();
           case 2:
             return new StentorMMU$RtSpeechRecognitionResultDetail$a(p2);
           case 3:
             Object[] objArray = new Object[]{"fixedResult_","startTime_","endTime_","words_",StentorMMU$WordDetail.class};
             return GeneratedMessageLite.newMessageInfo(StentorMMU$RtSpeechRecognitionResultDetail.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\x01\x03\x01\x04\x1b\x00", objArray);
           case 4:
             return StentorMMU$RtSpeechRecognitionResultDetail.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StentorMMU$RtSpeechRecognitionResultDetail.PARSER;
             if (pARSER == null) {
                _monitor_enter(StentorMMU$RtSpeechRecognitionResultDetail.class);
                pARSER = StentorMMU$RtSpeechRecognitionResultDetail.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StentorMMU$RtSpeechRecognitionResultDetail.DEFAULT_INSTANCE);
                   StentorMMU$RtSpeechRecognitionResultDetail.PARSER = pARSER;
                }
                _monitor_exit(StentorMMU$RtSpeechRecognitionResultDetail.class);
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
    public final void ensureWordsIsMutable(){
       if (!this.words_.isModifiable()) {
          this.words_ = GeneratedMessageLite.mutableCopy(this.words_);
       }
       return;
    }
    public float getEndTime(){
       return this.endTime_;
    }
    public String getFixedResult(){
       return this.fixedResult_;
    }
    public ByteString getFixedResultBytes(){
       return ByteString.copyFromUtf8(this.fixedResult_);
    }
    public float getStartTime(){
       return this.startTime_;
    }
    public StentorMMU$WordDetail getWords(int p0){
       return this.words_.get(p0);
    }
    public int getWordsCount(){
       return this.words_.size();
    }
    public List getWordsList(){
       return this.words_;
    }
    public r getWordsOrBuilder(int p0){
       return this.words_.get(p0);
    }
    public List getWordsOrBuilderList(){
       return this.words_;
    }
    public void removeWords(int p0){
       this.ensureWordsIsMutable();
       this.words_.remove(p0);
    }
    public void setEndTime(float p0){
       this.endTime_ = p0;
    }
    public void setFixedResult(String p0){
       Objects.requireNonNull(p0);
       this.fixedResult_ = p0;
    }
    public void setFixedResultBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.fixedResult_ = p0.toStringUtf8();
    }
    public void setStartTime(float p0){
       this.startTime_ = p0;
    }
    public void setWords(int p0,StentorMMU$WordDetail p1){
       Objects.requireNonNull(p1);
       this.ensureWordsIsMutable();
       this.words_.set(p0, p1);
    }
}
