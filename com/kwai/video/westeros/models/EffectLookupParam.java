package com.kwai.video.westeros.models.EffectLookupParam;
import com.kwai.video.westeros.models.EffectLookupParamOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.EffectLookupParam$Builder;
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
import com.kwai.video.westeros.models.EffectLookupParam$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kwai.video.westeros.models.EffectResource;
import com.kwai.video.westeros.models.EffectLookupResType;
import java.util.Objects;
import com.kwai.video.westeros.models.EffectResource$Builder;
import com.google.protobuf.AbstractMessageLite;

public final class EffectLookupParam extends GeneratedMessageLite implements EffectLookupParamOrBuilder	// class@000f28
{
    public int dimension_;
    public EffectResource effectRes_;
    public float intensity_;
    public String path_;
    public int resType_;
    public int type_;
    public static final EffectLookupParam DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       EffectLookupParam uEffectLooku = new EffectLookupParam();
       EffectLookupParam.DEFAULT_INSTANCE = uEffectLooku;
       GeneratedMessageLite.registerDefaultInstance(EffectLookupParam.class, uEffectLooku);
    }
    public void EffectLookupParam(){
       super();
       this.path_ = "";
    }
    public static EffectLookupParam getDefaultInstance(){
       return EffectLookupParam.DEFAULT_INSTANCE;
    }
    public static EffectLookupParam$Builder newBuilder(){
       return EffectLookupParam.DEFAULT_INSTANCE.createBuilder();
    }
    public static EffectLookupParam$Builder newBuilder(EffectLookupParam p0){
       return EffectLookupParam.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EffectLookupParam parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(EffectLookupParam.DEFAULT_INSTANCE, p0);
    }
    public static EffectLookupParam parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(EffectLookupParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectLookupParam parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(EffectLookupParam.DEFAULT_INSTANCE, p0);
    }
    public static EffectLookupParam parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectLookupParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectLookupParam parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(EffectLookupParam.DEFAULT_INSTANCE, p0);
    }
    public static EffectLookupParam parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectLookupParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectLookupParam parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(EffectLookupParam.DEFAULT_INSTANCE, p0);
    }
    public static EffectLookupParam parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectLookupParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectLookupParam parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(EffectLookupParam.DEFAULT_INSTANCE, p0);
    }
    public static EffectLookupParam parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectLookupParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectLookupParam parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(EffectLookupParam.DEFAULT_INSTANCE, p0);
    }
    public static EffectLookupParam parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectLookupParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return EffectLookupParam.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearDimension(){
       this.dimension_ = 0;
    }
    public void clearEffectRes(){
       this.effectRes_ = null;
    }
    public void clearIntensity(){
       this.intensity_ = 0;
    }
    public void clearPath(){
       this.path_ = EffectLookupParam.getDefaultInstance().getPath();
    }
    public void clearResType(){
       this.resType_ = 0;
    }
    public void clearType(){
       this.type_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (EffectLookupParam$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new EffectLookupParam();
           case 2:
             return new EffectLookupParam$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"resType_","intensity_","path_","type_","dimension_","effectRes_"};
             return GeneratedMessageLite.newMessageInfo(EffectLookupParam.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\x01\x03\x02\x02\x04\x04\x05\x04\x06\t\x00", objArray);
           case 4:
             return EffectLookupParam.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = EffectLookupParam.PARSER;
             if (pARSER == null) {
                _monitor_enter(EffectLookupParam.class);
                pARSER = EffectLookupParam.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(EffectLookupParam.DEFAULT_INSTANCE);
                   EffectLookupParam.PARSER = pARSER;
                }
                _monitor_exit(EffectLookupParam.class);
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
    public int getDimension(){
       return this.dimension_;
    }
    public EffectResource getEffectRes(){
       EffectLookupParam teffectRes_ = this.effectRes_;
       if (teffectRes_ == null) {
          teffectRes_ = EffectResource.getDefaultInstance();
       }
       return teffectRes_;
    }
    public float getIntensity(){
       return this.intensity_;
    }
    public String getPath(){
       return this.path_;
    }
    public ByteString getPathBytes(){
       return ByteString.copyFromUtf8(this.path_);
    }
    public EffectLookupResType getResType(){
       EffectLookupResType uEffectLooku = EffectLookupResType.forNumber(this.resType_);
       if (uEffectLooku == null) {
          uEffectLooku = EffectLookupResType.UNRECOGNIZED;
       }
       return uEffectLooku;
    }
    public int getResTypeValue(){
       return this.resType_;
    }
    public int getType(){
       return this.type_;
    }
    public boolean hasEffectRes(){
       boolean b = (this.effectRes_ != null)? true: false;
       return b;
    }
    public void mergeEffectRes(EffectResource p0){
       Objects.requireNonNull(p0);
       EffectLookupParam teffectRes_ = this.effectRes_;
       this.effectRes_ = (teffectRes_ != null && teffectRes_ != EffectResource.getDefaultInstance())? EffectResource.newBuilder(this.effectRes_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setDimension(int p0){
       this.dimension_ = p0;
    }
    public void setEffectRes(EffectResource$Builder p0){
       this.effectRes_ = p0.build();
    }
    public void setEffectRes(EffectResource p0){
       Objects.requireNonNull(p0);
       this.effectRes_ = p0;
    }
    public void setIntensity(float p0){
       this.intensity_ = p0;
    }
    public void setPath(String p0){
       Objects.requireNonNull(p0);
       this.path_ = p0;
    }
    public void setPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.path_ = p0.toStringUtf8();
    }
    public void setResType(EffectLookupResType p0){
       Objects.requireNonNull(p0);
       this.resType_ = p0.getNumber();
    }
    public void setResTypeValue(int p0){
       this.resType_ = p0;
    }
    public void setType(int p0){
       this.type_ = p0;
    }
}
