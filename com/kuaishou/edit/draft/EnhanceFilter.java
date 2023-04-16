package com.kuaishou.edit.draft.EnhanceFilter;
import z30.d0;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.EnhanceFilter$b;
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
import com.kuaishou.edit.draft.EnhanceFilter$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.Attributes$b;
import com.kuaishou.edit.draft.FeatureId$b;

public final class EnhanceFilter extends GeneratedMessageLite implements d0	// class@00178a
{
    public Attributes attributes_;
    public int dehazeFilterType_;
    public boolean enableCorrection_;
    public FeatureId featureId_;
    public int grayFilterType_;
    public Internal$ProtobufList resources_;
    public float sigmaNoiseVariance_;
    public static final EnhanceFilter DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       EnhanceFilter uEnhanceFilt = new EnhanceFilter();
       EnhanceFilter.DEFAULT_INSTANCE = uEnhanceFilt;
       GeneratedMessageLite.registerDefaultInstance(EnhanceFilter.class, uEnhanceFilt);
    }
    public void EnhanceFilter(){
       super();
       this.resources_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static EnhanceFilter getDefaultInstance(){
       return EnhanceFilter.DEFAULT_INSTANCE;
    }
    public static EnhanceFilter$b newBuilder(){
       return EnhanceFilter.DEFAULT_INSTANCE.createBuilder();
    }
    public static EnhanceFilter$b newBuilder(EnhanceFilter p0){
       return EnhanceFilter.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EnhanceFilter parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(EnhanceFilter.DEFAULT_INSTANCE, p0);
    }
    public static EnhanceFilter parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(EnhanceFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static EnhanceFilter parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(EnhanceFilter.DEFAULT_INSTANCE, p0);
    }
    public static EnhanceFilter parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EnhanceFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static EnhanceFilter parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(EnhanceFilter.DEFAULT_INSTANCE, p0);
    }
    public static EnhanceFilter parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EnhanceFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static EnhanceFilter parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(EnhanceFilter.DEFAULT_INSTANCE, p0);
    }
    public static EnhanceFilter parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EnhanceFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static EnhanceFilter parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(EnhanceFilter.DEFAULT_INSTANCE, p0);
    }
    public static EnhanceFilter parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EnhanceFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static EnhanceFilter parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(EnhanceFilter.DEFAULT_INSTANCE, p0);
    }
    public static EnhanceFilter parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EnhanceFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return EnhanceFilter.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllResources(Iterable p0){
       this.ensureResourcesIsMutable();
       AbstractMessageLite.addAll(p0, this.resources_);
    }
    public void addResources(String p0){
       Objects.requireNonNull(p0);
       this.ensureResourcesIsMutable();
       this.resources_.add(p0);
    }
    public void addResourcesBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureResourcesIsMutable();
       this.resources_.add(p0.toStringUtf8());
    }
    public void clearAttributes(){
       this.attributes_ = null;
    }
    public void clearDehazeFilterType(){
       this.dehazeFilterType_ = 0;
    }
    public void clearEnableCorrection(){
       this.enableCorrection_ = false;
    }
    public void clearFeatureId(){
       this.featureId_ = null;
    }
    public void clearGrayFilterType(){
       this.grayFilterType_ = 0;
    }
    public void clearResources(){
       this.resources_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearSigmaNoiseVariance(){
       this.sigmaNoiseVariance_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (EnhanceFilter$a.a[p0.ordinal()]){
           case 1:
             return new EnhanceFilter();
           case 2:
             return new EnhanceFilter$b(p2);
           case 3:
             Object[] objArray = new Object[]{"featureId_","attributes_","resources_","dehazeFilterType_","grayFilterType_","enableCorrection_","sigmaNoiseVariance_"};
             return GeneratedMessageLite.newMessageInfo(EnhanceFilter.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x07\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x07\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\t\x02\t\x03\x02\x02\x04\x0b\x05\x0b\x06\x07\x07\x01\x00", objArray);
           case 4:
             return EnhanceFilter.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = EnhanceFilter.PARSER;
             if (pARSER == null) {
                _monitor_enter(EnhanceFilter.class);
                pARSER = EnhanceFilter.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(EnhanceFilter.DEFAULT_INSTANCE);
                   EnhanceFilter.PARSER = pARSER;
                }
                _monitor_exit(EnhanceFilter.class);
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
    public final void ensureResourcesIsMutable(){
       if (!this.resources_.isModifiable()) {
          this.resources_ = GeneratedMessageLite.mutableCopy(this.resources_);
       }
       return;
    }
    public Attributes getAttributes(){
       EnhanceFilter tattributes_ = this.attributes_;
       if (tattributes_ == null) {
          tattributes_ = Attributes.getDefaultInstance();
       }
       return tattributes_;
    }
    public int getDehazeFilterType(){
       return this.dehazeFilterType_;
    }
    public boolean getEnableCorrection(){
       return this.enableCorrection_;
    }
    public FeatureId getFeatureId(){
       EnhanceFilter tuEnhanceFil = this.featureId_;
       if (tuEnhanceFil == null) {
          tuEnhanceFil = FeatureId.getDefaultInstance();
       }
       return tuEnhanceFil;
    }
    public int getGrayFilterType(){
       return this.grayFilterType_;
    }
    public String getResources(int p0){
       return this.resources_.get(p0);
    }
    public ByteString getResourcesBytes(int p0){
       return ByteString.copyFromUtf8(this.resources_.get(p0));
    }
    public int getResourcesCount(){
       return this.resources_.size();
    }
    public List getResourcesList(){
       return this.resources_;
    }
    public float getSigmaNoiseVariance(){
       return this.sigmaNoiseVariance_;
    }
    public boolean hasAttributes(){
       boolean b = (this.attributes_ != null)? true: false;
       return b;
    }
    public boolean hasFeatureId(){
       boolean b = (this.featureId_ != null)? true: false;
       return b;
    }
    public void mergeAttributes(Attributes p0){
       Objects.requireNonNull(p0);
       EnhanceFilter tattributes_ = this.attributes_;
       this.attributes_ = (tattributes_ != null && tattributes_ != Attributes.getDefaultInstance())? Attributes.newBuilder(this.attributes_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeFeatureId(FeatureId p0){
       Objects.requireNonNull(p0);
       EnhanceFilter tuEnhanceFil = this.featureId_;
       this.featureId_ = (tuEnhanceFil != null && tuEnhanceFil != FeatureId.getDefaultInstance())? FeatureId.newBuilder(this.featureId_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setAttributes(Attributes$b p0){
       this.attributes_ = p0.build();
    }
    public void setAttributes(Attributes p0){
       Objects.requireNonNull(p0);
       this.attributes_ = p0;
    }
    public void setDehazeFilterType(int p0){
       this.dehazeFilterType_ = p0;
    }
    public void setEnableCorrection(boolean p0){
       this.enableCorrection_ = p0;
    }
    public void setFeatureId(FeatureId$b p0){
       this.featureId_ = p0.build();
    }
    public void setFeatureId(FeatureId p0){
       Objects.requireNonNull(p0);
       this.featureId_ = p0;
    }
    public void setGrayFilterType(int p0){
       this.grayFilterType_ = p0;
    }
    public void setResources(int p0,String p1){
       Objects.requireNonNull(p1);
       this.ensureResourcesIsMutable();
       this.resources_.set(p0, p1);
    }
    public void setSigmaNoiseVariance(float p0){
       this.sigmaNoiseVariance_ = p0;
    }
}
