package com.kwai.video.westeros.models.AdjustIntensityConfig;
import com.kwai.video.westeros.models.AdjustIntensityConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.AdjustIntensityConfig$Builder;
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
import com.kwai.video.westeros.models.AdjustIntensityConfig$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;

public final class AdjustIntensityConfig extends GeneratedMessageLite implements AdjustIntensityConfigOrBuilder	// class@000e99
{
    public float defaultIntensity_;
    public float defaultLookupIntensity_;
    public boolean defaultMaleMakeupIntenistyEnabled_;
    public float defaultMaleMakeupIntensity_;
    public Internal$ProtobufList effectTypes_;
    public boolean enabled_;
    public static final AdjustIntensityConfig DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       AdjustIntensityConfig uAdjustInten = new AdjustIntensityConfig();
       AdjustIntensityConfig.DEFAULT_INSTANCE = uAdjustInten;
       GeneratedMessageLite.registerDefaultInstance(AdjustIntensityConfig.class, uAdjustInten);
    }
    public void AdjustIntensityConfig(){
       super();
       this.effectTypes_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static AdjustIntensityConfig getDefaultInstance(){
       return AdjustIntensityConfig.DEFAULT_INSTANCE;
    }
    public static AdjustIntensityConfig$Builder newBuilder(){
       return AdjustIntensityConfig.DEFAULT_INSTANCE.createBuilder();
    }
    public static AdjustIntensityConfig$Builder newBuilder(AdjustIntensityConfig p0){
       return AdjustIntensityConfig.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static AdjustIntensityConfig parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(AdjustIntensityConfig.DEFAULT_INSTANCE, p0);
    }
    public static AdjustIntensityConfig parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(AdjustIntensityConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static AdjustIntensityConfig parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(AdjustIntensityConfig.DEFAULT_INSTANCE, p0);
    }
    public static AdjustIntensityConfig parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AdjustIntensityConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static AdjustIntensityConfig parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(AdjustIntensityConfig.DEFAULT_INSTANCE, p0);
    }
    public static AdjustIntensityConfig parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AdjustIntensityConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static AdjustIntensityConfig parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(AdjustIntensityConfig.DEFAULT_INSTANCE, p0);
    }
    public static AdjustIntensityConfig parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AdjustIntensityConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static AdjustIntensityConfig parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(AdjustIntensityConfig.DEFAULT_INSTANCE, p0);
    }
    public static AdjustIntensityConfig parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AdjustIntensityConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static AdjustIntensityConfig parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(AdjustIntensityConfig.DEFAULT_INSTANCE, p0);
    }
    public static AdjustIntensityConfig parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AdjustIntensityConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return AdjustIntensityConfig.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllEffectTypes(Iterable p0){
       this.ensureEffectTypesIsMutable();
       AbstractMessageLite.addAll(p0, this.effectTypes_);
    }
    public void addEffectTypes(String p0){
       Objects.requireNonNull(p0);
       this.ensureEffectTypesIsMutable();
       this.effectTypes_.add(p0);
    }
    public void addEffectTypesBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureEffectTypesIsMutable();
       this.effectTypes_.add(p0.toStringUtf8());
    }
    public void clearDefaultIntensity(){
       this.defaultIntensity_ = 0;
    }
    public void clearDefaultLookupIntensity(){
       this.defaultLookupIntensity_ = 0;
    }
    public void clearDefaultMaleMakeupIntenistyEnabled(){
       this.defaultMaleMakeupIntenistyEnabled_ = false;
    }
    public void clearDefaultMaleMakeupIntensity(){
       this.defaultMaleMakeupIntensity_ = 0;
    }
    public void clearEffectTypes(){
       this.effectTypes_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearEnabled(){
       this.enabled_ = false;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (AdjustIntensityConfig$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new AdjustIntensityConfig();
           case 2:
             return new AdjustIntensityConfig$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"enabled_","defaultIntensity_","effectTypes_","defaultLookupIntensity_","defaultMaleMakeupIntenistyEnabled_","defaultMaleMakeupIntensity_"};
             return GeneratedMessageLite.newMessageInfo(AdjustIntensityConfig.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x07\x02\x01\x03\x02\x02\x04\x01\x05\x07\x06\x01\x00", objArray);
           case 4:
             return AdjustIntensityConfig.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = AdjustIntensityConfig.PARSER;
             if (pARSER == null) {
                _monitor_enter(AdjustIntensityConfig.class);
                pARSER = AdjustIntensityConfig.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(AdjustIntensityConfig.DEFAULT_INSTANCE);
                   AdjustIntensityConfig.PARSER = pARSER;
                }
                _monitor_exit(AdjustIntensityConfig.class);
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
    public final void ensureEffectTypesIsMutable(){
       if (!this.effectTypes_.isModifiable()) {
          this.effectTypes_ = GeneratedMessageLite.mutableCopy(this.effectTypes_);
       }
       return;
    }
    public float getDefaultIntensity(){
       return this.defaultIntensity_;
    }
    public float getDefaultLookupIntensity(){
       return this.defaultLookupIntensity_;
    }
    public boolean getDefaultMaleMakeupIntenistyEnabled(){
       return this.defaultMaleMakeupIntenistyEnabled_;
    }
    public float getDefaultMaleMakeupIntensity(){
       return this.defaultMaleMakeupIntensity_;
    }
    public String getEffectTypes(int p0){
       return this.effectTypes_.get(p0);
    }
    public ByteString getEffectTypesBytes(int p0){
       return ByteString.copyFromUtf8(this.effectTypes_.get(p0));
    }
    public int getEffectTypesCount(){
       return this.effectTypes_.size();
    }
    public List getEffectTypesList(){
       return this.effectTypes_;
    }
    public boolean getEnabled(){
       return this.enabled_;
    }
    public void setDefaultIntensity(float p0){
       this.defaultIntensity_ = p0;
    }
    public void setDefaultLookupIntensity(float p0){
       this.defaultLookupIntensity_ = p0;
    }
    public void setDefaultMaleMakeupIntenistyEnabled(boolean p0){
       this.defaultMaleMakeupIntenistyEnabled_ = p0;
    }
    public void setDefaultMaleMakeupIntensity(float p0){
       this.defaultMaleMakeupIntensity_ = p0;
    }
    public void setEffectTypes(int p0,String p1){
       Objects.requireNonNull(p1);
       this.ensureEffectTypesIsMutable();
       this.effectTypes_.set(p0, p1);
    }
    public void setEnabled(boolean p0){
       this.enabled_ = p0;
    }
}
