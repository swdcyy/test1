package com.kuaishou.edit.draft.AEEffect;
import com.kuaishou.edit.draft.a;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.AEEffect$b;
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
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.edit.draft.AEEffect$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.edit.draft.AEEffect$AttachType;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.TimeRange;
import com.kuaishou.edit.draft.Attributes$b;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.TimeRange$b;

public final class AEEffect extends GeneratedMessageLite implements a	// class@0016f6
{
    public String aeAssetDir_;
    public int attachType_;
    public Attributes attributes_;
    public FeatureId featureId_;
    public int fillingMode_;
    public String templateId_;
    public Internal$ProtobufList textPicturePath_;
    public Internal$ProtobufList texts_;
    public TimeRange timeRange_;
    public int zIndex_;
    public static final AEEffect DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       AEEffect uAEEffect = new AEEffect();
       AEEffect.DEFAULT_INSTANCE = uAEEffect;
       GeneratedMessageLite.registerDefaultInstance(AEEffect.class, uAEEffect);
    }
    public void AEEffect(){
       super();
       this.aeAssetDir_ = "";
       this.textPicturePath_ = GeneratedMessageLite.emptyProtobufList();
       this.templateId_ = "";
       this.texts_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static AEEffect getDefaultInstance(){
       return AEEffect.DEFAULT_INSTANCE;
    }
    public static AEEffect$b newBuilder(){
       return AEEffect.DEFAULT_INSTANCE.createBuilder();
    }
    public static AEEffect$b newBuilder(AEEffect p0){
       return AEEffect.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static AEEffect parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(AEEffect.DEFAULT_INSTANCE, p0);
    }
    public static AEEffect parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(AEEffect.DEFAULT_INSTANCE, p0, p1);
    }
    public static AEEffect parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(AEEffect.DEFAULT_INSTANCE, p0);
    }
    public static AEEffect parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AEEffect.DEFAULT_INSTANCE, p0, p1);
    }
    public static AEEffect parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(AEEffect.DEFAULT_INSTANCE, p0);
    }
    public static AEEffect parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AEEffect.DEFAULT_INSTANCE, p0, p1);
    }
    public static AEEffect parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(AEEffect.DEFAULT_INSTANCE, p0);
    }
    public static AEEffect parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AEEffect.DEFAULT_INSTANCE, p0, p1);
    }
    public static AEEffect parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(AEEffect.DEFAULT_INSTANCE, p0);
    }
    public static AEEffect parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AEEffect.DEFAULT_INSTANCE, p0, p1);
    }
    public static AEEffect parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(AEEffect.DEFAULT_INSTANCE, p0);
    }
    public static AEEffect parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AEEffect.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return AEEffect.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllTextPicturePath(Iterable p0){
       this.ensureTextPicturePathIsMutable();
       AbstractMessageLite.addAll(p0, this.textPicturePath_);
    }
    public void addAllTexts(Iterable p0){
       this.ensureTextsIsMutable();
       AbstractMessageLite.addAll(p0, this.texts_);
    }
    public void addTextPicturePath(String p0){
       Objects.requireNonNull(p0);
       this.ensureTextPicturePathIsMutable();
       this.textPicturePath_.add(p0);
    }
    public void addTextPicturePathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureTextPicturePathIsMutable();
       this.textPicturePath_.add(p0.toStringUtf8());
    }
    public void addTexts(String p0){
       Objects.requireNonNull(p0);
       this.ensureTextsIsMutable();
       this.texts_.add(p0);
    }
    public void addTextsBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureTextsIsMutable();
       this.texts_.add(p0.toStringUtf8());
    }
    public void clearAeAssetDir(){
       this.aeAssetDir_ = AEEffect.getDefaultInstance().getAeAssetDir();
    }
    public void clearAttachType(){
       this.attachType_ = 0;
    }
    public void clearAttributes(){
       this.attributes_ = null;
    }
    public void clearFeatureId(){
       this.featureId_ = null;
    }
    public void clearFillingMode(){
       this.fillingMode_ = 0;
    }
    public void clearTemplateId(){
       this.templateId_ = AEEffect.getDefaultInstance().getTemplateId();
    }
    public void clearTextPicturePath(){
       this.textPicturePath_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearTexts(){
       this.texts_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearTimeRange(){
       this.timeRange_ = null;
    }
    public void clearZIndex(){
       this.zIndex_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (AEEffect$a.a[p0.ordinal()]){
           case 1:
             return new AEEffect();
           case 2:
             return new AEEffect$b(p2);
           case 3:
             Object[] objArray = new Object[10];
             objArray[0] = "featureId_";
             objArray[i] = "attributes_";
             objArray[2] = "timeRange_";
             objArray[3] = "aeAssetDir_";
             objArray[4] = "textPicturePath_";
             objArray[5] = "attachType_";
             objArray[6] = "zIndex_";
             objArray[7] = "fillingMode_";
             objArray[8] = "templateId_";
             objArray[9] = "texts_";
             return GeneratedMessageLite.newMessageInfo(AEEffect.DEFAULT_INSTANCE, "\xff\x02\xff\x02\n\xff\x02\xff\x02\xff\x02\xff\x02\x01\n\n\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\t\x02\t\x03\t\x04\x02\x02\x05\x02\x02\x06\f\x07\x0b\b\x0b\t\x02\x02\n\x02\x02\x00", objArray);
           case 4:
             return AEEffect.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = AEEffect.PARSER;
             if (pARSER == null) {
                _monitor_enter(AEEffect.class);
                pARSER = AEEffect.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(AEEffect.DEFAULT_INSTANCE);
                   AEEffect.PARSER = pARSER;
                }
                _monitor_exit(AEEffect.class);
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
    public final void ensureTextPicturePathIsMutable(){
       if (!this.textPicturePath_.isModifiable()) {
          this.textPicturePath_ = GeneratedMessageLite.mutableCopy(this.textPicturePath_);
       }
       return;
    }
    public final void ensureTextsIsMutable(){
       if (!this.texts_.isModifiable()) {
          this.texts_ = GeneratedMessageLite.mutableCopy(this.texts_);
       }
       return;
    }
    public String getAeAssetDir(){
       return this.aeAssetDir_;
    }
    public ByteString getAeAssetDirBytes(){
       return ByteString.copyFromUtf8(this.aeAssetDir_);
    }
    public AEEffect$AttachType getAttachType(){
       AEEffect$AttachType uAttachType = AEEffect$AttachType.forNumber(this.attachType_);
       if (uAttachType == null) {
          uAttachType = AEEffect$AttachType.UNRECOGNIZED;
       }
       return uAttachType;
    }
    public int getAttachTypeValue(){
       return this.attachType_;
    }
    public Attributes getAttributes(){
       AEEffect tattributes_ = this.attributes_;
       if (tattributes_ == null) {
          tattributes_ = Attributes.getDefaultInstance();
       }
       return tattributes_;
    }
    public FeatureId getFeatureId(){
       AEEffect tuAEEffect = this.featureId_;
       if (tuAEEffect == null) {
          tuAEEffect = FeatureId.getDefaultInstance();
       }
       return tuAEEffect;
    }
    public int getFillingMode(){
       return this.fillingMode_;
    }
    public String getTemplateId(){
       return this.templateId_;
    }
    public ByteString getTemplateIdBytes(){
       return ByteString.copyFromUtf8(this.templateId_);
    }
    public String getTextPicturePath(int p0){
       return this.textPicturePath_.get(p0);
    }
    public ByteString getTextPicturePathBytes(int p0){
       return ByteString.copyFromUtf8(this.textPicturePath_.get(p0));
    }
    public int getTextPicturePathCount(){
       return this.textPicturePath_.size();
    }
    public List getTextPicturePathList(){
       return this.textPicturePath_;
    }
    public String getTexts(int p0){
       return this.texts_.get(p0);
    }
    public ByteString getTextsBytes(int p0){
       return ByteString.copyFromUtf8(this.texts_.get(p0));
    }
    public int getTextsCount(){
       return this.texts_.size();
    }
    public List getTextsList(){
       return this.texts_;
    }
    public TimeRange getTimeRange(){
       AEEffect ttimeRange_ = this.timeRange_;
       if (ttimeRange_ == null) {
          ttimeRange_ = TimeRange.getDefaultInstance();
       }
       return ttimeRange_;
    }
    public int getZIndex(){
       return this.zIndex_;
    }
    public boolean hasAttributes(){
       boolean b = (this.attributes_ != null)? true: false;
       return b;
    }
    public boolean hasFeatureId(){
       boolean b = (this.featureId_ != null)? true: false;
       return b;
    }
    public boolean hasTimeRange(){
       boolean b = (this.timeRange_ != null)? true: false;
       return b;
    }
    public void mergeAttributes(Attributes p0){
       Objects.requireNonNull(p0);
       AEEffect tattributes_ = this.attributes_;
       this.attributes_ = (tattributes_ != null && tattributes_ != Attributes.getDefaultInstance())? Attributes.newBuilder(this.attributes_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeFeatureId(FeatureId p0){
       Objects.requireNonNull(p0);
       AEEffect tuAEEffect = this.featureId_;
       this.featureId_ = (tuAEEffect != null && tuAEEffect != FeatureId.getDefaultInstance())? FeatureId.newBuilder(this.featureId_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeTimeRange(TimeRange p0){
       Objects.requireNonNull(p0);
       AEEffect ttimeRange_ = this.timeRange_;
       this.timeRange_ = (ttimeRange_ != null && ttimeRange_ != TimeRange.getDefaultInstance())? TimeRange.newBuilder(this.timeRange_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setAeAssetDir(String p0){
       Objects.requireNonNull(p0);
       this.aeAssetDir_ = p0;
    }
    public void setAeAssetDirBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.aeAssetDir_ = p0.toStringUtf8();
    }
    public void setAttachType(AEEffect$AttachType p0){
       Objects.requireNonNull(p0);
       this.attachType_ = p0.getNumber();
    }
    public void setAttachTypeValue(int p0){
       this.attachType_ = p0;
    }
    public void setAttributes(Attributes$b p0){
       this.attributes_ = p0.build();
    }
    public void setAttributes(Attributes p0){
       Objects.requireNonNull(p0);
       this.attributes_ = p0;
    }
    public void setFeatureId(FeatureId$b p0){
       this.featureId_ = p0.build();
    }
    public void setFeatureId(FeatureId p0){
       Objects.requireNonNull(p0);
       this.featureId_ = p0;
    }
    public void setFillingMode(int p0){
       this.fillingMode_ = p0;
    }
    public void setTemplateId(String p0){
       Objects.requireNonNull(p0);
       this.templateId_ = p0;
    }
    public void setTemplateIdBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.templateId_ = p0.toStringUtf8();
    }
    public void setTextPicturePath(int p0,String p1){
       Objects.requireNonNull(p1);
       this.ensureTextPicturePathIsMutable();
       this.textPicturePath_.set(p0, p1);
    }
    public void setTexts(int p0,String p1){
       Objects.requireNonNull(p1);
       this.ensureTextsIsMutable();
       this.texts_.set(p0, p1);
    }
    public void setTimeRange(TimeRange$b p0){
       this.timeRange_ = p0.build();
    }
    public void setTimeRange(TimeRange p0){
       Objects.requireNonNull(p0);
       this.timeRange_ = p0;
    }
    public void setZIndex(int p0){
       this.zIndex_ = p0;
    }
}
