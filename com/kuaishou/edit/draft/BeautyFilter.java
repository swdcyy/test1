package com.kuaishou.edit.draft.BeautyFilter;
import z30.l;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.BeautyFilter$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kuaishou.edit.draft.BeautyFilter$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.EffectSource;
import com.kuaishou.edit.draft.FeatureId;
import java.util.Objects;
import com.kuaishou.edit.draft.Attributes$b;
import com.kuaishou.edit.draft.FeatureId$b;

public final class BeautyFilter extends GeneratedMessageLite implements l	// class@00173b
{
    public Attributes attributes_;
    public double bright_;
    public int effectSource_;
    public FeatureId featureId_;
    public double soft_;
    public static final BeautyFilter DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       BeautyFilter uBeautyFilte = new BeautyFilter();
       BeautyFilter.DEFAULT_INSTANCE = uBeautyFilte;
       GeneratedMessageLite.registerDefaultInstance(BeautyFilter.class, uBeautyFilte);
    }
    public void BeautyFilter(){
       super();
    }
    public static BeautyFilter getDefaultInstance(){
       return BeautyFilter.DEFAULT_INSTANCE;
    }
    public static BeautyFilter$b newBuilder(){
       return BeautyFilter.DEFAULT_INSTANCE.createBuilder();
    }
    public static BeautyFilter$b newBuilder(BeautyFilter p0){
       return BeautyFilter.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static BeautyFilter parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(BeautyFilter.DEFAULT_INSTANCE, p0);
    }
    public static BeautyFilter parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(BeautyFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static BeautyFilter parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(BeautyFilter.DEFAULT_INSTANCE, p0);
    }
    public static BeautyFilter parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BeautyFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static BeautyFilter parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(BeautyFilter.DEFAULT_INSTANCE, p0);
    }
    public static BeautyFilter parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BeautyFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static BeautyFilter parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(BeautyFilter.DEFAULT_INSTANCE, p0);
    }
    public static BeautyFilter parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BeautyFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static BeautyFilter parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(BeautyFilter.DEFAULT_INSTANCE, p0);
    }
    public static BeautyFilter parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BeautyFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static BeautyFilter parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(BeautyFilter.DEFAULT_INSTANCE, p0);
    }
    public static BeautyFilter parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BeautyFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return BeautyFilter.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAttributes(){
       this.attributes_ = null;
    }
    public void clearBright(){
       this.bright_ = 0;
    }
    public void clearEffectSource(){
       this.effectSource_ = 0;
    }
    public void clearFeatureId(){
       this.featureId_ = null;
    }
    public void clearSoft(){
       this.soft_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (BeautyFilter$a.a[p0.ordinal()]){
           case 1:
             return new BeautyFilter();
           case 2:
             return new BeautyFilter$b(p2);
           case 3:
             Object[] objArray = new Object[]{"featureId_","attributes_","soft_","bright_","effectSource_"};
             return GeneratedMessageLite.newMessageInfo(BeautyFilter.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\t\x04\xff\x02\xff\x02\x05\xff\x02\xff\x02\x06\f\x00", objArray);
           case 4:
             return BeautyFilter.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = BeautyFilter.PARSER;
             if (pARSER == null) {
                _monitor_enter(BeautyFilter.class);
                pARSER = BeautyFilter.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(BeautyFilter.DEFAULT_INSTANCE);
                   BeautyFilter.PARSER = pARSER;
                }
                _monitor_exit(BeautyFilter.class);
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
    public Attributes getAttributes(){
       BeautyFilter tattributes_ = this.attributes_;
       if (tattributes_ == null) {
          tattributes_ = Attributes.getDefaultInstance();
       }
       return tattributes_;
    }
    public double getBright(){
       return this.bright_;
    }
    public EffectSource getEffectSource(){
       EffectSource uEffectSourc = EffectSource.forNumber(this.effectSource_);
       if (uEffectSourc == null) {
          uEffectSourc = EffectSource.UNRECOGNIZED;
       }
       return uEffectSourc;
    }
    public int getEffectSourceValue(){
       return this.effectSource_;
    }
    public FeatureId getFeatureId(){
       BeautyFilter tuBeautyFilt = this.featureId_;
       if (tuBeautyFilt == null) {
          tuBeautyFilt = FeatureId.getDefaultInstance();
       }
       return tuBeautyFilt;
    }
    public double getSoft(){
       return this.soft_;
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
       BeautyFilter tattributes_ = this.attributes_;
       this.attributes_ = (tattributes_ != null && tattributes_ != Attributes.getDefaultInstance())? Attributes.newBuilder(this.attributes_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeFeatureId(FeatureId p0){
       Objects.requireNonNull(p0);
       BeautyFilter tuBeautyFilt = this.featureId_;
       this.featureId_ = (tuBeautyFilt != null && tuBeautyFilt != FeatureId.getDefaultInstance())? FeatureId.newBuilder(this.featureId_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setAttributes(Attributes$b p0){
       this.attributes_ = p0.build();
    }
    public void setAttributes(Attributes p0){
       Objects.requireNonNull(p0);
       this.attributes_ = p0;
    }
    public void setBright(double p0){
       this.bright_ = p0;
    }
    public void setEffectSource(EffectSource p0){
       Objects.requireNonNull(p0);
       this.effectSource_ = p0.getNumber();
    }
    public void setEffectSourceValue(int p0){
       this.effectSource_ = p0;
    }
    public void setFeatureId(FeatureId$b p0){
       this.featureId_ = p0.build();
    }
    public void setFeatureId(FeatureId p0){
       Objects.requireNonNull(p0);
       this.featureId_ = p0;
    }
    public void setSoft(double p0){
       this.soft_ = p0;
    }
}
