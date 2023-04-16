package com.kuaishou.edit.draft.CaptionTopic;
import com.kuaishou.edit.draft.e;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.CaptionTopic$b;
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
import com.kuaishou.edit.draft.CaptionTopic$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.edit.draft.CaptionTopic$TopicFrom;
import com.kuaishou.edit.draft.CaptionTopic$TopicType;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class CaptionTopic extends GeneratedMessageLite implements e	// class@00174a
{
    public String expTag_;
    public String extraInfo_;
    public long topicClassifyId_;
    public int topicFrom_;
    public long topicId_;
    public String topicName_;
    public int topicType_;
    public static final CaptionTopic DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       CaptionTopic uCaptionTopi = new CaptionTopic();
       CaptionTopic.DEFAULT_INSTANCE = uCaptionTopi;
       GeneratedMessageLite.registerDefaultInstance(CaptionTopic.class, uCaptionTopi);
    }
    public void CaptionTopic(){
       super();
       this.topicName_ = "";
       this.expTag_ = "";
       this.extraInfo_ = "";
    }
    public static CaptionTopic getDefaultInstance(){
       return CaptionTopic.DEFAULT_INSTANCE;
    }
    public static CaptionTopic$b newBuilder(){
       return CaptionTopic.DEFAULT_INSTANCE.createBuilder();
    }
    public static CaptionTopic$b newBuilder(CaptionTopic p0){
       return CaptionTopic.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static CaptionTopic parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(CaptionTopic.DEFAULT_INSTANCE, p0);
    }
    public static CaptionTopic parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(CaptionTopic.DEFAULT_INSTANCE, p0, p1);
    }
    public static CaptionTopic parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(CaptionTopic.DEFAULT_INSTANCE, p0);
    }
    public static CaptionTopic parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CaptionTopic.DEFAULT_INSTANCE, p0, p1);
    }
    public static CaptionTopic parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(CaptionTopic.DEFAULT_INSTANCE, p0);
    }
    public static CaptionTopic parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CaptionTopic.DEFAULT_INSTANCE, p0, p1);
    }
    public static CaptionTopic parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(CaptionTopic.DEFAULT_INSTANCE, p0);
    }
    public static CaptionTopic parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CaptionTopic.DEFAULT_INSTANCE, p0, p1);
    }
    public static CaptionTopic parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(CaptionTopic.DEFAULT_INSTANCE, p0);
    }
    public static CaptionTopic parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CaptionTopic.DEFAULT_INSTANCE, p0, p1);
    }
    public static CaptionTopic parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(CaptionTopic.DEFAULT_INSTANCE, p0);
    }
    public static CaptionTopic parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CaptionTopic.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return CaptionTopic.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearExpTag(){
       this.expTag_ = CaptionTopic.getDefaultInstance().getExpTag();
    }
    public void clearExtraInfo(){
       this.extraInfo_ = CaptionTopic.getDefaultInstance().getExtraInfo();
    }
    public void clearTopicClassifyId(){
       this.topicClassifyId_ = 0;
    }
    public void clearTopicFrom(){
       this.topicFrom_ = 0;
    }
    public void clearTopicId(){
       this.topicId_ = 0;
    }
    public void clearTopicName(){
       this.topicName_ = CaptionTopic.getDefaultInstance().getTopicName();
    }
    public void clearTopicType(){
       this.topicType_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (CaptionTopic$a.a[p0.ordinal()]){
           case 1:
             return new CaptionTopic();
           case 2:
             return new CaptionTopic$b(p2);
           case 3:
             Object[] objArray = new Object[]{"topicId_","topicName_","expTag_","topicClassifyId_","topicFrom_","topicType_","extraInfo_"};
             return GeneratedMessageLite.newMessageInfo(CaptionTopic.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x07\xff\x02\xff\x02\xff\x02\xff\x02\x01\b\x07\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x04\x02\x02\x05\x02\x06\f\x07\f\b\x02\x02\x00", objArray);
           case 4:
             return CaptionTopic.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = CaptionTopic.PARSER;
             if (pARSER == null) {
                _monitor_enter(CaptionTopic.class);
                pARSER = CaptionTopic.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(CaptionTopic.DEFAULT_INSTANCE);
                   CaptionTopic.PARSER = pARSER;
                }
                _monitor_exit(CaptionTopic.class);
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
    public String getExpTag(){
       return this.expTag_;
    }
    public ByteString getExpTagBytes(){
       return ByteString.copyFromUtf8(this.expTag_);
    }
    public String getExtraInfo(){
       return this.extraInfo_;
    }
    public ByteString getExtraInfoBytes(){
       return ByteString.copyFromUtf8(this.extraInfo_);
    }
    public long getTopicClassifyId(){
       return this.topicClassifyId_;
    }
    public CaptionTopic$TopicFrom getTopicFrom(){
       CaptionTopic$TopicFrom topicFrom = CaptionTopic$TopicFrom.forNumber(this.topicFrom_);
       if (topicFrom == null) {
          topicFrom = CaptionTopic$TopicFrom.UNRECOGNIZED;
       }
       return topicFrom;
    }
    public int getTopicFromValue(){
       return this.topicFrom_;
    }
    public long getTopicId(){
       return this.topicId_;
    }
    public String getTopicName(){
       return this.topicName_;
    }
    public ByteString getTopicNameBytes(){
       return ByteString.copyFromUtf8(this.topicName_);
    }
    public CaptionTopic$TopicType getTopicType(){
       CaptionTopic$TopicType topicType = CaptionTopic$TopicType.forNumber(this.topicType_);
       if (topicType == null) {
          topicType = CaptionTopic$TopicType.UNRECOGNIZED;
       }
       return topicType;
    }
    public int getTopicTypeValue(){
       return this.topicType_;
    }
    public void setExpTag(String p0){
       Objects.requireNonNull(p0);
       this.expTag_ = p0;
    }
    public void setExpTagBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.expTag_ = p0.toStringUtf8();
    }
    public void setExtraInfo(String p0){
       Objects.requireNonNull(p0);
       this.extraInfo_ = p0;
    }
    public void setExtraInfoBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.extraInfo_ = p0.toStringUtf8();
    }
    public void setTopicClassifyId(long p0){
       this.topicClassifyId_ = p0;
    }
    public void setTopicFrom(CaptionTopic$TopicFrom p0){
       Objects.requireNonNull(p0);
       this.topicFrom_ = p0.getNumber();
    }
    public void setTopicFromValue(int p0){
       this.topicFrom_ = p0;
    }
    public void setTopicId(long p0){
       this.topicId_ = p0;
    }
    public void setTopicName(String p0){
       Objects.requireNonNull(p0);
       this.topicName_ = p0;
    }
    public void setTopicNameBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.topicName_ = p0.toStringUtf8();
    }
    public void setTopicType(CaptionTopic$TopicType p0){
       Objects.requireNonNull(p0);
       this.topicType_ = p0.getNumber();
    }
    public void setTopicTypeValue(int p0){
       this.topicType_ = p0;
    }
}
