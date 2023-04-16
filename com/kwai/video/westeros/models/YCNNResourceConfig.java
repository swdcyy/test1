package com.kwai.video.westeros.models.YCNNResourceConfig;
import com.kwai.video.westeros.models.YCNNResourceConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.YCNNResourceConfig$Builder;
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
import com.kwai.video.westeros.models.YCNNResourceConfig$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kwai.video.westeros.models.YCNNModelInConfig;
import java.util.Objects;
import com.kwai.video.westeros.models.YCNNModelInConfig$Builder;
import com.google.protobuf.AbstractMessageLite;

public final class YCNNResourceConfig extends GeneratedMessageLite implements YCNNResourceConfigOrBuilder	// class@0010a2
{
    public boolean isBuiltin_;
    public String mmuModelPath_;
    public YCNNModelInConfig modelinConfig_;
    public String resourcePath_;
    public String ycnnModelPath_;
    public static final YCNNResourceConfig DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       YCNNResourceConfig yCNNResource = new YCNNResourceConfig();
       YCNNResourceConfig.DEFAULT_INSTANCE = yCNNResource;
       GeneratedMessageLite.registerDefaultInstance(YCNNResourceConfig.class, yCNNResource);
    }
    public void YCNNResourceConfig(){
       super();
       this.ycnnModelPath_ = "";
       this.mmuModelPath_ = "";
       this.resourcePath_ = "";
    }
    public static YCNNResourceConfig getDefaultInstance(){
       return YCNNResourceConfig.DEFAULT_INSTANCE;
    }
    public static YCNNResourceConfig$Builder newBuilder(){
       return YCNNResourceConfig.DEFAULT_INSTANCE.createBuilder();
    }
    public static YCNNResourceConfig$Builder newBuilder(YCNNResourceConfig p0){
       return YCNNResourceConfig.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static YCNNResourceConfig parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(YCNNResourceConfig.DEFAULT_INSTANCE, p0);
    }
    public static YCNNResourceConfig parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(YCNNResourceConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNResourceConfig parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(YCNNResourceConfig.DEFAULT_INSTANCE, p0);
    }
    public static YCNNResourceConfig parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNResourceConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNResourceConfig parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(YCNNResourceConfig.DEFAULT_INSTANCE, p0);
    }
    public static YCNNResourceConfig parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNResourceConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNResourceConfig parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(YCNNResourceConfig.DEFAULT_INSTANCE, p0);
    }
    public static YCNNResourceConfig parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNResourceConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNResourceConfig parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(YCNNResourceConfig.DEFAULT_INSTANCE, p0);
    }
    public static YCNNResourceConfig parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNResourceConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNResourceConfig parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(YCNNResourceConfig.DEFAULT_INSTANCE, p0);
    }
    public static YCNNResourceConfig parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNResourceConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return YCNNResourceConfig.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearIsBuiltin(){
       this.isBuiltin_ = false;
    }
    public void clearMmuModelPath(){
       this.mmuModelPath_ = YCNNResourceConfig.getDefaultInstance().getMmuModelPath();
    }
    public void clearModelinConfig(){
       this.modelinConfig_ = null;
    }
    public void clearResourcePath(){
       this.resourcePath_ = YCNNResourceConfig.getDefaultInstance().getResourcePath();
    }
    public void clearYcnnModelPath(){
       this.ycnnModelPath_ = YCNNResourceConfig.getDefaultInstance().getYcnnModelPath();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (YCNNResourceConfig$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new YCNNResourceConfig();
           case 2:
             return new YCNNResourceConfig$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"ycnnModelPath_","mmuModelPath_","resourcePath_","isBuiltin_","modelinConfig_"};
             return GeneratedMessageLite.newMessageInfo(YCNNResourceConfig.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x07\x05\t\x00", objArray);
           case 4:
             return YCNNResourceConfig.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = YCNNResourceConfig.PARSER;
             if (pARSER == null) {
                _monitor_enter(YCNNResourceConfig.class);
                pARSER = YCNNResourceConfig.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(YCNNResourceConfig.DEFAULT_INSTANCE);
                   YCNNResourceConfig.PARSER = pARSER;
                }
                _monitor_exit(YCNNResourceConfig.class);
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
    public boolean getIsBuiltin(){
       return this.isBuiltin_;
    }
    public String getMmuModelPath(){
       return this.mmuModelPath_;
    }
    public ByteString getMmuModelPathBytes(){
       return ByteString.copyFromUtf8(this.mmuModelPath_);
    }
    public YCNNModelInConfig getModelinConfig(){
       YCNNResourceConfig tmodelinConf = this.modelinConfig_;
       if (tmodelinConf == null) {
          tmodelinConf = YCNNModelInConfig.getDefaultInstance();
       }
       return tmodelinConf;
    }
    public String getResourcePath(){
       return this.resourcePath_;
    }
    public ByteString getResourcePathBytes(){
       return ByteString.copyFromUtf8(this.resourcePath_);
    }
    public String getYcnnModelPath(){
       return this.ycnnModelPath_;
    }
    public ByteString getYcnnModelPathBytes(){
       return ByteString.copyFromUtf8(this.ycnnModelPath_);
    }
    public boolean hasModelinConfig(){
       boolean b = (this.modelinConfig_ != null)? true: false;
       return b;
    }
    public void mergeModelinConfig(YCNNModelInConfig p0){
       Objects.requireNonNull(p0);
       YCNNResourceConfig tmodelinConf = this.modelinConfig_;
       this.modelinConfig_ = (tmodelinConf != null && tmodelinConf != YCNNModelInConfig.getDefaultInstance())? YCNNModelInConfig.newBuilder(this.modelinConfig_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setIsBuiltin(boolean p0){
       this.isBuiltin_ = p0;
    }
    public void setMmuModelPath(String p0){
       Objects.requireNonNull(p0);
       this.mmuModelPath_ = p0;
    }
    public void setMmuModelPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.mmuModelPath_ = p0.toStringUtf8();
    }
    public void setModelinConfig(YCNNModelInConfig$Builder p0){
       this.modelinConfig_ = p0.build();
    }
    public void setModelinConfig(YCNNModelInConfig p0){
       Objects.requireNonNull(p0);
       this.modelinConfig_ = p0;
    }
    public void setResourcePath(String p0){
       Objects.requireNonNull(p0);
       this.resourcePath_ = p0;
    }
    public void setResourcePathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.resourcePath_ = p0.toStringUtf8();
    }
    public void setYcnnModelPath(String p0){
       Objects.requireNonNull(p0);
       this.ycnnModelPath_ = p0;
    }
    public void setYcnnModelPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ycnnModelPath_ = p0.toStringUtf8();
    }
}
