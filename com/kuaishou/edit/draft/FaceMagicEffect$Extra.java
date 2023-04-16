package com.kuaishou.edit.draft.FaceMagicEffect$Extra;
import com.kuaishou.edit.draft.FaceMagicEffect$c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra$a;
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
import com.kuaishou.edit.draft.FaceMagicEffect$Extra$CheckMd5$a;
import java.lang.Object;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra$CheckMd5;
import java.util.Objects;
import com.kuaishou.edit.draft.Url$b;
import com.kuaishou.edit.draft.Url;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.edit.draft.FaceMagicEffect$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra$b;
import z30.p2;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra$PassThroughParams;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra$PassThroughParams$a;

public final class FaceMagicEffect$Extra extends GeneratedMessageLite implements FaceMagicEffect$c	// class@001798
{
    public Internal$ProtobufList checkMd5_;
    public long checkSum_;
    public String id_;
    public Internal$ProtobufList image_;
    public String name_;
    public FaceMagicEffect$Extra$PassThroughParams passThroughParams_;
    public int resourceType_;
    public Internal$ProtobufList resource_;
    public String tag_;
    public String topic_;
    public int version_;
    public static final FaceMagicEffect$Extra DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       FaceMagicEffect$Extra uExtra = new FaceMagicEffect$Extra();
       FaceMagicEffect$Extra.DEFAULT_INSTANCE = uExtra;
       GeneratedMessageLite.registerDefaultInstance(FaceMagicEffect$Extra.class, uExtra);
    }
    public void FaceMagicEffect$Extra(){
       super();
       this.id_ = "";
       this.tag_ = "";
       this.resource_ = GeneratedMessageLite.emptyProtobufList();
       this.checkMd5_ = GeneratedMessageLite.emptyProtobufList();
       this.image_ = GeneratedMessageLite.emptyProtobufList();
       this.topic_ = "";
       this.name_ = "";
    }
    public static FaceMagicEffect$Extra getDefaultInstance(){
       return FaceMagicEffect$Extra.DEFAULT_INSTANCE;
    }
    public static FaceMagicEffect$Extra$a newBuilder(){
       return FaceMagicEffect$Extra.DEFAULT_INSTANCE.createBuilder();
    }
    public static FaceMagicEffect$Extra$a newBuilder(FaceMagicEffect$Extra p0){
       return FaceMagicEffect$Extra.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static FaceMagicEffect$Extra parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(FaceMagicEffect$Extra.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect$Extra parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(FaceMagicEffect$Extra.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceMagicEffect$Extra parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect$Extra parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceMagicEffect$Extra parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect$Extra parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceMagicEffect$Extra parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect$Extra parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceMagicEffect$Extra parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect$Extra parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceMagicEffect$Extra parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect$Extra parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return FaceMagicEffect$Extra.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllCheckMd5(Iterable p0){
       this.ensureCheckMd5IsMutable();
       AbstractMessageLite.addAll(p0, this.checkMd5_);
    }
    public void addAllImage(Iterable p0){
       this.ensureImageIsMutable();
       AbstractMessageLite.addAll(p0, this.image_);
    }
    public void addAllResource(Iterable p0){
       this.ensureResourceIsMutable();
       AbstractMessageLite.addAll(p0, this.resource_);
    }
    public void addCheckMd5(int p0,FaceMagicEffect$Extra$CheckMd5$a p1){
       this.ensureCheckMd5IsMutable();
       this.checkMd5_.add(p0, p1.build());
    }
    public void addCheckMd5(int p0,FaceMagicEffect$Extra$CheckMd5 p1){
       Objects.requireNonNull(p1);
       this.ensureCheckMd5IsMutable();
       this.checkMd5_.add(p0, p1);
    }
    public void addCheckMd5(FaceMagicEffect$Extra$CheckMd5$a p0){
       this.ensureCheckMd5IsMutable();
       this.checkMd5_.add(p0.build());
    }
    public void addCheckMd5(FaceMagicEffect$Extra$CheckMd5 p0){
       Objects.requireNonNull(p0);
       this.ensureCheckMd5IsMutable();
       this.checkMd5_.add(p0);
    }
    public void addImage(int p0,Url$b p1){
       this.ensureImageIsMutable();
       this.image_.add(p0, p1.build());
    }
    public void addImage(int p0,Url p1){
       Objects.requireNonNull(p1);
       this.ensureImageIsMutable();
       this.image_.add(p0, p1);
    }
    public void addImage(Url$b p0){
       this.ensureImageIsMutable();
       this.image_.add(p0.build());
    }
    public void addImage(Url p0){
       Objects.requireNonNull(p0);
       this.ensureImageIsMutable();
       this.image_.add(p0);
    }
    public void addResource(int p0,Url$b p1){
       this.ensureResourceIsMutable();
       this.resource_.add(p0, p1.build());
    }
    public void addResource(int p0,Url p1){
       Objects.requireNonNull(p1);
       this.ensureResourceIsMutable();
       this.resource_.add(p0, p1);
    }
    public void addResource(Url$b p0){
       this.ensureResourceIsMutable();
       this.resource_.add(p0.build());
    }
    public void addResource(Url p0){
       Objects.requireNonNull(p0);
       this.ensureResourceIsMutable();
       this.resource_.add(p0);
    }
    public void clearCheckMd5(){
       this.checkMd5_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearCheckSum(){
       this.checkSum_ = 0;
    }
    public void clearId(){
       this.id_ = FaceMagicEffect$Extra.getDefaultInstance().getId();
    }
    public void clearImage(){
       this.image_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearName(){
       this.name_ = FaceMagicEffect$Extra.getDefaultInstance().getName();
    }
    public void clearPassThroughParams(){
       this.passThroughParams_ = null;
    }
    public void clearResource(){
       this.resource_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearResourceType(){
       this.resourceType_ = 0;
    }
    public void clearTag(){
       this.tag_ = FaceMagicEffect$Extra.getDefaultInstance().getTag();
    }
    public void clearTopic(){
       this.topic_ = FaceMagicEffect$Extra.getDefaultInstance().getTopic();
    }
    public void clearVersion(){
       this.version_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = Url.class;
       int i = 1;
       FaceMagicEffect$a uoa = null;
       switch (FaceMagicEffect$a.a[p0.ordinal()]){
           case 1:
             return new FaceMagicEffect$Extra();
           case 2:
             return new FaceMagicEffect$Extra$a(uoa);
           case 3:
             Object[] objArray = new Object[14];
             objArray[0] = "id_";
             objArray[i] = "tag_";
             objArray[2] = "version_";
             objArray[3] = "checkSum_";
             objArray[4] = "resourceType_";
             objArray[5] = "resource_";
             objArray[6] = p1;
             objArray[7] = "checkMd5_";
             objArray[8] = FaceMagicEffect$Extra$CheckMd5.class;
             objArray[9] = "passThroughParams_";
             objArray[10] = "image_";
             objArray[11] = p1;
             objArray[12] = "topic_";
             objArray[13] = "name_";
             return GeneratedMessageLite.newMessageInfo(FaceMagicEffect$Extra.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x0b\xff\x02\xff\x02\xff\x02\xff\x02\x01\x0b\x0b\xff\x02\xff\x02\x03\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x04\x04\x02\x05\x04\x06\x1b\x07\x1b\b\t\t\x1b\n\x02\x02\x0b\x02\x02\x00", objArray);
           case 4:
             return FaceMagicEffect$Extra.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = FaceMagicEffect$Extra.PARSER;
             if (pARSER == null) {
                _monitor_enter(FaceMagicEffect$Extra.class);
                pARSER = FaceMagicEffect$Extra.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(FaceMagicEffect$Extra.DEFAULT_INSTANCE);
                   FaceMagicEffect$Extra.PARSER = pARSER;
                }
                _monitor_exit(FaceMagicEffect$Extra.class);
             }
             return pARSER;
             break;
           case 6:
             return Byte.valueOf(i);
           case 7:
             return uoa;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final void ensureCheckMd5IsMutable(){
       if (!this.checkMd5_.isModifiable()) {
          this.checkMd5_ = GeneratedMessageLite.mutableCopy(this.checkMd5_);
       }
       return;
    }
    public final void ensureImageIsMutable(){
       if (!this.image_.isModifiable()) {
          this.image_ = GeneratedMessageLite.mutableCopy(this.image_);
       }
       return;
    }
    public final void ensureResourceIsMutable(){
       if (!this.resource_.isModifiable()) {
          this.resource_ = GeneratedMessageLite.mutableCopy(this.resource_);
       }
       return;
    }
    public FaceMagicEffect$Extra$CheckMd5 getCheckMd5(int p0){
       return this.checkMd5_.get(p0);
    }
    public int getCheckMd5Count(){
       return this.checkMd5_.size();
    }
    public List getCheckMd5List(){
       return this.checkMd5_;
    }
    public FaceMagicEffect$Extra$b getCheckMd5OrBuilder(int p0){
       return this.checkMd5_.get(p0);
    }
    public List getCheckMd5OrBuilderList(){
       return this.checkMd5_;
    }
    public long getCheckSum(){
       return this.checkSum_;
    }
    public String getId(){
       return this.id_;
    }
    public ByteString getIdBytes(){
       return ByteString.copyFromUtf8(this.id_);
    }
    public Url getImage(int p0){
       return this.image_.get(p0);
    }
    public int getImageCount(){
       return this.image_.size();
    }
    public List getImageList(){
       return this.image_;
    }
    public p2 getImageOrBuilder(int p0){
       return this.image_.get(p0);
    }
    public List getImageOrBuilderList(){
       return this.image_;
    }
    public String getName(){
       return this.name_;
    }
    public ByteString getNameBytes(){
       return ByteString.copyFromUtf8(this.name_);
    }
    public FaceMagicEffect$Extra$PassThroughParams getPassThroughParams(){
       FaceMagicEffect$Extra tpassThrough = this.passThroughParams_;
       if (tpassThrough == null) {
          tpassThrough = FaceMagicEffect$Extra$PassThroughParams.getDefaultInstance();
       }
       return tpassThrough;
    }
    public Url getResource(int p0){
       return this.resource_.get(p0);
    }
    public int getResourceCount(){
       return this.resource_.size();
    }
    public List getResourceList(){
       return this.resource_;
    }
    public p2 getResourceOrBuilder(int p0){
       return this.resource_.get(p0);
    }
    public List getResourceOrBuilderList(){
       return this.resource_;
    }
    public int getResourceType(){
       return this.resourceType_;
    }
    public String getTag(){
       return this.tag_;
    }
    public ByteString getTagBytes(){
       return ByteString.copyFromUtf8(this.tag_);
    }
    public String getTopic(){
       return this.topic_;
    }
    public ByteString getTopicBytes(){
       return ByteString.copyFromUtf8(this.topic_);
    }
    public int getVersion(){
       return this.version_;
    }
    public boolean hasPassThroughParams(){
       boolean b = (this.passThroughParams_ != null)? true: false;
       return b;
    }
    public void mergePassThroughParams(FaceMagicEffect$Extra$PassThroughParams p0){
       Objects.requireNonNull(p0);
       FaceMagicEffect$Extra tpassThrough = this.passThroughParams_;
       this.passThroughParams_ = (tpassThrough != null && tpassThrough != FaceMagicEffect$Extra$PassThroughParams.getDefaultInstance())? FaceMagicEffect$Extra$PassThroughParams.newBuilder(this.passThroughParams_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void removeCheckMd5(int p0){
       this.ensureCheckMd5IsMutable();
       this.checkMd5_.remove(p0);
    }
    public void removeImage(int p0){
       this.ensureImageIsMutable();
       this.image_.remove(p0);
    }
    public void removeResource(int p0){
       this.ensureResourceIsMutable();
       this.resource_.remove(p0);
    }
    public void setCheckMd5(int p0,FaceMagicEffect$Extra$CheckMd5$a p1){
       this.ensureCheckMd5IsMutable();
       this.checkMd5_.set(p0, p1.build());
    }
    public void setCheckMd5(int p0,FaceMagicEffect$Extra$CheckMd5 p1){
       Objects.requireNonNull(p1);
       this.ensureCheckMd5IsMutable();
       this.checkMd5_.set(p0, p1);
    }
    public void setCheckSum(long p0){
       this.checkSum_ = p0;
    }
    public void setId(String p0){
       Objects.requireNonNull(p0);
       this.id_ = p0;
    }
    public void setIdBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.id_ = p0.toStringUtf8();
    }
    public void setImage(int p0,Url$b p1){
       this.ensureImageIsMutable();
       this.image_.set(p0, p1.build());
    }
    public void setImage(int p0,Url p1){
       Objects.requireNonNull(p1);
       this.ensureImageIsMutable();
       this.image_.set(p0, p1);
    }
    public void setName(String p0){
       Objects.requireNonNull(p0);
       this.name_ = p0;
    }
    public void setNameBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.name_ = p0.toStringUtf8();
    }
    public void setPassThroughParams(FaceMagicEffect$Extra$PassThroughParams$a p0){
       this.passThroughParams_ = p0.build();
    }
    public void setPassThroughParams(FaceMagicEffect$Extra$PassThroughParams p0){
       Objects.requireNonNull(p0);
       this.passThroughParams_ = p0;
    }
    public void setResource(int p0,Url$b p1){
       this.ensureResourceIsMutable();
       this.resource_.set(p0, p1.build());
    }
    public void setResource(int p0,Url p1){
       Objects.requireNonNull(p1);
       this.ensureResourceIsMutable();
       this.resource_.set(p0, p1);
    }
    public void setResourceType(int p0){
       this.resourceType_ = p0;
    }
    public void setTag(String p0){
       Objects.requireNonNull(p0);
       this.tag_ = p0;
    }
    public void setTagBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.tag_ = p0.toStringUtf8();
    }
    public void setTopic(String p0){
       Objects.requireNonNull(p0);
       this.topic_ = p0;
    }
    public void setTopicBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.topic_ = p0.toStringUtf8();
    }
    public void setVersion(int p0){
       this.version_ = p0;
    }
}
