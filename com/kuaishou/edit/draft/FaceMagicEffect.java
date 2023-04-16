package com.kuaishou.edit.draft.FaceMagicEffect;
import com.kuaishou.edit.draft.h;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.FaceMagicEffect$b;
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
import com.kuaishou.edit.draft.FaceMagicEffect$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.TimeRange;
import com.kuaishou.edit.draft.FaceMagicEffect$Type;
import java.util.Objects;
import com.kuaishou.edit.draft.Attributes$b;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra$a;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.TimeRange$b;
import com.google.protobuf.AbstractMessageLite;

public final class FaceMagicEffect extends GeneratedMessageLite implements h	// class@00179f
{
    public String assetDir_;
    public Attributes attributes_;
    public FaceMagicEffect$Extra extra_;
    public FeatureId featureId_;
    public TimeRange range_;
    public int type_;
    public static final FaceMagicEffect DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       FaceMagicEffect uFaceMagicEf = new FaceMagicEffect();
       FaceMagicEffect.DEFAULT_INSTANCE = uFaceMagicEf;
       GeneratedMessageLite.registerDefaultInstance(FaceMagicEffect.class, uFaceMagicEf);
    }
    public void FaceMagicEffect(){
       super();
       this.assetDir_ = "";
    }
    public static FaceMagicEffect getDefaultInstance(){
       return FaceMagicEffect.DEFAULT_INSTANCE;
    }
    public static FaceMagicEffect$b newBuilder(){
       return FaceMagicEffect.DEFAULT_INSTANCE.createBuilder();
    }
    public static FaceMagicEffect$b newBuilder(FaceMagicEffect p0){
       return FaceMagicEffect.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static FaceMagicEffect parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(FaceMagicEffect.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(FaceMagicEffect.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceMagicEffect parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceMagicEffect parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceMagicEffect parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceMagicEffect parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceMagicEffect parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return FaceMagicEffect.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAssetDir(){
       this.assetDir_ = FaceMagicEffect.getDefaultInstance().getAssetDir();
    }
    public void clearAttributes(){
       this.attributes_ = null;
    }
    public void clearExtra(){
       this.extra_ = null;
    }
    public void clearFeatureId(){
       this.featureId_ = null;
    }
    public void clearRange(){
       this.range_ = null;
    }
    public void clearType(){
       this.type_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (FaceMagicEffect$a.a[p0.ordinal()]){
           case 1:
             return new FaceMagicEffect();
           case 2:
             return new FaceMagicEffect$b(p2);
           case 3:
             Object[] objArray = new Object[]{"featureId_","attributes_","assetDir_","range_","type_","extra_"};
             return GeneratedMessageLite.newMessageInfo(FaceMagicEffect.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\t\x03\x02\x02\x04\t\x05\f\x06\t\x00", objArray);
           case 4:
             return FaceMagicEffect.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = FaceMagicEffect.PARSER;
             if (pARSER == null) {
                _monitor_enter(FaceMagicEffect.class);
                pARSER = FaceMagicEffect.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(FaceMagicEffect.DEFAULT_INSTANCE);
                   FaceMagicEffect.PARSER = pARSER;
                }
                _monitor_exit(FaceMagicEffect.class);
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
    public String getAssetDir(){
       return this.assetDir_;
    }
    public ByteString getAssetDirBytes(){
       return ByteString.copyFromUtf8(this.assetDir_);
    }
    public Attributes getAttributes(){
       FaceMagicEffect tattributes_ = this.attributes_;
       if (tattributes_ == null) {
          tattributes_ = Attributes.getDefaultInstance();
       }
       return tattributes_;
    }
    public FaceMagicEffect$Extra getExtra(){
       FaceMagicEffect textra_ = this.extra_;
       if (textra_ == null) {
          textra_ = FaceMagicEffect$Extra.getDefaultInstance();
       }
       return textra_;
    }
    public FeatureId getFeatureId(){
       FaceMagicEffect tuFaceMagicE = this.featureId_;
       if (tuFaceMagicE == null) {
          tuFaceMagicE = FeatureId.getDefaultInstance();
       }
       return tuFaceMagicE;
    }
    public TimeRange getRange(){
       FaceMagicEffect trange_ = this.range_;
       if (trange_ == null) {
          trange_ = TimeRange.getDefaultInstance();
       }
       return trange_;
    }
    public FaceMagicEffect$Type getType(){
       FaceMagicEffect$Type type = FaceMagicEffect$Type.forNumber(this.type_);
       if (type == null) {
          type = FaceMagicEffect$Type.UNRECOGNIZED;
       }
       return type;
    }
    public int getTypeValue(){
       return this.type_;
    }
    public boolean hasAttributes(){
       boolean b = (this.attributes_ != null)? true: false;
       return b;
    }
    public boolean hasExtra(){
       boolean b = (this.extra_ != null)? true: false;
       return b;
    }
    public boolean hasFeatureId(){
       boolean b = (this.featureId_ != null)? true: false;
       return b;
    }
    public boolean hasRange(){
       boolean b = (this.range_ != null)? true: false;
       return b;
    }
    public void mergeAttributes(Attributes p0){
       Objects.requireNonNull(p0);
       FaceMagicEffect tattributes_ = this.attributes_;
       this.attributes_ = (tattributes_ != null && tattributes_ != Attributes.getDefaultInstance())? Attributes.newBuilder(this.attributes_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeExtra(FaceMagicEffect$Extra p0){
       Objects.requireNonNull(p0);
       FaceMagicEffect textra_ = this.extra_;
       this.extra_ = (textra_ != null && textra_ != FaceMagicEffect$Extra.getDefaultInstance())? FaceMagicEffect$Extra.newBuilder(this.extra_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeFeatureId(FeatureId p0){
       Objects.requireNonNull(p0);
       FaceMagicEffect tuFaceMagicE = this.featureId_;
       this.featureId_ = (tuFaceMagicE != null && tuFaceMagicE != FeatureId.getDefaultInstance())? FeatureId.newBuilder(this.featureId_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeRange(TimeRange p0){
       Objects.requireNonNull(p0);
       FaceMagicEffect trange_ = this.range_;
       this.range_ = (trange_ != null && trange_ != TimeRange.getDefaultInstance())? TimeRange.newBuilder(this.range_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setAssetDir(String p0){
       Objects.requireNonNull(p0);
       this.assetDir_ = p0;
    }
    public void setAssetDirBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.assetDir_ = p0.toStringUtf8();
    }
    public void setAttributes(Attributes$b p0){
       this.attributes_ = p0.build();
    }
    public void setAttributes(Attributes p0){
       Objects.requireNonNull(p0);
       this.attributes_ = p0;
    }
    public void setExtra(FaceMagicEffect$Extra$a p0){
       this.extra_ = p0.build();
    }
    public void setExtra(FaceMagicEffect$Extra p0){
       Objects.requireNonNull(p0);
       this.extra_ = p0;
    }
    public void setFeatureId(FeatureId$b p0){
       this.featureId_ = p0.build();
    }
    public void setFeatureId(FeatureId p0){
       Objects.requireNonNull(p0);
       this.featureId_ = p0;
    }
    public void setRange(TimeRange$b p0){
       this.range_ = p0.build();
    }
    public void setRange(TimeRange p0){
       Objects.requireNonNull(p0);
       this.range_ = p0;
    }
    public void setType(FaceMagicEffect$Type p0){
       Objects.requireNonNull(p0);
       this.type_ = p0.getNumber();
    }
    public void setTypeValue(int p0){
       this.type_ = p0;
    }
}
