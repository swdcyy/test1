package com.kuaishou.edit.draft.EnhanceColorFilter;
import z30.b0;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.EnhanceColorFilter$b;
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
import com.kuaishou.edit.draft.EnhanceColorFilter$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.Attributes$b;
import com.kuaishou.edit.draft.FeatureId$b;

public final class EnhanceColorFilter extends GeneratedMessageLite implements b0	// class@001784
{
    public Attributes attributes_;
    public FeatureId featureId_;
    public double intensity_;
    public Internal$ProtobufList resources_;
    public int sdkType_;
    public static final EnhanceColorFilter DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       EnhanceColorFilter uEnhanceColo = new EnhanceColorFilter();
       EnhanceColorFilter.DEFAULT_INSTANCE = uEnhanceColo;
       GeneratedMessageLite.registerDefaultInstance(EnhanceColorFilter.class, uEnhanceColo);
    }
    public void EnhanceColorFilter(){
       super();
       this.resources_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static EnhanceColorFilter getDefaultInstance(){
       return EnhanceColorFilter.DEFAULT_INSTANCE;
    }
    public static EnhanceColorFilter$b newBuilder(){
       return EnhanceColorFilter.DEFAULT_INSTANCE.createBuilder();
    }
    public static EnhanceColorFilter$b newBuilder(EnhanceColorFilter p0){
       return EnhanceColorFilter.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EnhanceColorFilter parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(EnhanceColorFilter.DEFAULT_INSTANCE, p0);
    }
    public static EnhanceColorFilter parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(EnhanceColorFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static EnhanceColorFilter parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(EnhanceColorFilter.DEFAULT_INSTANCE, p0);
    }
    public static EnhanceColorFilter parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EnhanceColorFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static EnhanceColorFilter parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(EnhanceColorFilter.DEFAULT_INSTANCE, p0);
    }
    public static EnhanceColorFilter parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EnhanceColorFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static EnhanceColorFilter parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(EnhanceColorFilter.DEFAULT_INSTANCE, p0);
    }
    public static EnhanceColorFilter parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EnhanceColorFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static EnhanceColorFilter parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(EnhanceColorFilter.DEFAULT_INSTANCE, p0);
    }
    public static EnhanceColorFilter parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EnhanceColorFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static EnhanceColorFilter parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(EnhanceColorFilter.DEFAULT_INSTANCE, p0);
    }
    public static EnhanceColorFilter parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EnhanceColorFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return EnhanceColorFilter.DEFAULT_INSTANCE.getParserForType();
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
    public void clearFeatureId(){
       this.featureId_ = null;
    }
    public void clearIntensity(){
       this.intensity_ = 0;
    }
    public void clearResources(){
       this.resources_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearSdkType(){
       this.sdkType_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (EnhanceColorFilter$a.a[p0.ordinal()]){
           case 1:
             return new EnhanceColorFilter();
           case 2:
             return new EnhanceColorFilter$b(p2);
           case 3:
             Object[] objArray = new Object[]{"featureId_","attributes_","sdkType_","intensity_","resources_"};
             return GeneratedMessageLite.newMessageInfo(EnhanceColorFilter.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\t\x02\t\x03\x0b\x04\xff\x02\xff\x02\x05\x02\x02\x00", objArray);
           case 4:
             return EnhanceColorFilter.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = EnhanceColorFilter.PARSER;
             if (pARSER == null) {
                _monitor_enter(EnhanceColorFilter.class);
                pARSER = EnhanceColorFilter.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(EnhanceColorFilter.DEFAULT_INSTANCE);
                   EnhanceColorFilter.PARSER = pARSER;
                }
                _monitor_exit(EnhanceColorFilter.class);
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
       EnhanceColorFilter tattributes_ = this.attributes_;
       if (tattributes_ == null) {
          tattributes_ = Attributes.getDefaultInstance();
       }
       return tattributes_;
    }
    public FeatureId getFeatureId(){
       EnhanceColorFilter tuEnhanceCol = this.featureId_;
       if (tuEnhanceCol == null) {
          tuEnhanceCol = FeatureId.getDefaultInstance();
       }
       return tuEnhanceCol;
    }
    public double getIntensity(){
       return this.intensity_;
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
    public int getSdkType(){
       return this.sdkType_;
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
       EnhanceColorFilter tattributes_ = this.attributes_;
       this.attributes_ = (tattributes_ != null && tattributes_ != Attributes.getDefaultInstance())? Attributes.newBuilder(this.attributes_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeFeatureId(FeatureId p0){
       Objects.requireNonNull(p0);
       EnhanceColorFilter tuEnhanceCol = this.featureId_;
       this.featureId_ = (tuEnhanceCol != null && tuEnhanceCol != FeatureId.getDefaultInstance())? FeatureId.newBuilder(this.featureId_).mergeFrom(p0).buildPartial(): p0;
       return;
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
    public void setIntensity(double p0){
       this.intensity_ = p0;
    }
    public void setResources(int p0,String p1){
       Objects.requireNonNull(p1);
       this.ensureResourcesIsMutable();
       this.resources_.set(p0, p1);
    }
    public void setSdkType(int p0){
       this.sdkType_ = p0;
    }
}
