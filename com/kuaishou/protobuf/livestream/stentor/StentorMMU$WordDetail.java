package com.kuaishou.protobuf.livestream.stentor.StentorMMU$WordDetail;
import hr4.r;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$WordDetail$a;
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
import hr4.a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class StentorMMU$WordDetail extends GeneratedMessageLite implements r	// class@000dc9
{
    public float confidence_;
    public float endTime_;
    public String fixedResult_;
    public float startTime_;
    public static final StentorMMU$WordDetail DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StentorMMU$WordDetail wordDetail = new StentorMMU$WordDetail();
       StentorMMU$WordDetail.DEFAULT_INSTANCE = wordDetail;
       GeneratedMessageLite.registerDefaultInstance(StentorMMU$WordDetail.class, wordDetail);
    }
    public void StentorMMU$WordDetail(){
       super();
       this.fixedResult_ = "";
    }
    public static StentorMMU$WordDetail getDefaultInstance(){
       return StentorMMU$WordDetail.DEFAULT_INSTANCE;
    }
    public static StentorMMU$WordDetail$a newBuilder(){
       return StentorMMU$WordDetail.DEFAULT_INSTANCE.createBuilder();
    }
    public static StentorMMU$WordDetail$a newBuilder(StentorMMU$WordDetail p0){
       return StentorMMU$WordDetail.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StentorMMU$WordDetail parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$WordDetail.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$WordDetail parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$WordDetail.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$WordDetail parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$WordDetail.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$WordDetail parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$WordDetail.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$WordDetail parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$WordDetail.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$WordDetail parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$WordDetail.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$WordDetail parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$WordDetail.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$WordDetail parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$WordDetail.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$WordDetail parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$WordDetail.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$WordDetail parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$WordDetail.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$WordDetail parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$WordDetail.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$WordDetail parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$WordDetail.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StentorMMU$WordDetail.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearConfidence(){
       this.confidence_ = 0;
    }
    public void clearEndTime(){
       this.endTime_ = 0;
    }
    public void clearFixedResult(){
       this.fixedResult_ = StentorMMU$WordDetail.getDefaultInstance().getFixedResult();
    }
    public void clearStartTime(){
       this.startTime_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new StentorMMU$WordDetail();
           case 2:
             return new StentorMMU$WordDetail$a(p2);
           case 3:
             Object[] objArray = new Object[]{"fixedResult_","startTime_","endTime_","confidence_"};
             return GeneratedMessageLite.newMessageInfo(StentorMMU$WordDetail.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x01\x03\x01\x04\x01\x00", objArray);
           case 4:
             return StentorMMU$WordDetail.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StentorMMU$WordDetail.PARSER;
             if (pARSER == null) {
                _monitor_enter(StentorMMU$WordDetail.class);
                pARSER = StentorMMU$WordDetail.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StentorMMU$WordDetail.DEFAULT_INSTANCE);
                   StentorMMU$WordDetail.PARSER = pARSER;
                }
                _monitor_exit(StentorMMU$WordDetail.class);
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
    public float getConfidence(){
       return this.confidence_;
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
    public void setConfidence(float p0){
       this.confidence_ = p0;
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
}
