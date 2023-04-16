package com.kwai.video.westeros.models.RelightingConfig;
import com.kwai.video.westeros.models.RelightingConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.RelightingConfig$Builder;
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
import com.kwai.video.westeros.models.RelightingConfig$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class RelightingConfig extends GeneratedMessageLite implements RelightingConfigOrBuilder	// class@001028
{
    public String face3DLightContent_;
    public String materialPath_;
    public static final RelightingConfig DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       RelightingConfig relightingCo = new RelightingConfig();
       RelightingConfig.DEFAULT_INSTANCE = relightingCo;
       GeneratedMessageLite.registerDefaultInstance(RelightingConfig.class, relightingCo);
    }
    public void RelightingConfig(){
       super();
       this.materialPath_ = "";
       this.face3DLightContent_ = "";
    }
    public static RelightingConfig getDefaultInstance(){
       return RelightingConfig.DEFAULT_INSTANCE;
    }
    public static RelightingConfig$Builder newBuilder(){
       return RelightingConfig.DEFAULT_INSTANCE.createBuilder();
    }
    public static RelightingConfig$Builder newBuilder(RelightingConfig p0){
       return RelightingConfig.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static RelightingConfig parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(RelightingConfig.DEFAULT_INSTANCE, p0);
    }
    public static RelightingConfig parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(RelightingConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static RelightingConfig parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(RelightingConfig.DEFAULT_INSTANCE, p0);
    }
    public static RelightingConfig parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(RelightingConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static RelightingConfig parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(RelightingConfig.DEFAULT_INSTANCE, p0);
    }
    public static RelightingConfig parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(RelightingConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static RelightingConfig parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(RelightingConfig.DEFAULT_INSTANCE, p0);
    }
    public static RelightingConfig parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(RelightingConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static RelightingConfig parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(RelightingConfig.DEFAULT_INSTANCE, p0);
    }
    public static RelightingConfig parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(RelightingConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static RelightingConfig parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(RelightingConfig.DEFAULT_INSTANCE, p0);
    }
    public static RelightingConfig parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(RelightingConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return RelightingConfig.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearFace3DLightContent(){
       this.face3DLightContent_ = RelightingConfig.getDefaultInstance().getFace3DLightContent();
    }
    public void clearMaterialPath(){
       this.materialPath_ = RelightingConfig.getDefaultInstance().getMaterialPath();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (RelightingConfig$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new RelightingConfig();
           case 2:
             return new RelightingConfig$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"materialPath_","face3DLightContent_"};
             return GeneratedMessageLite.newMessageInfo(RelightingConfig.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x00", objArray);
           case 4:
             return RelightingConfig.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = RelightingConfig.PARSER;
             if (pARSER == null) {
                _monitor_enter(RelightingConfig.class);
                pARSER = RelightingConfig.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(RelightingConfig.DEFAULT_INSTANCE);
                   RelightingConfig.PARSER = pARSER;
                }
                _monitor_exit(RelightingConfig.class);
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
    public String getFace3DLightContent(){
       return this.face3DLightContent_;
    }
    public ByteString getFace3DLightContentBytes(){
       return ByteString.copyFromUtf8(this.face3DLightContent_);
    }
    public String getMaterialPath(){
       return this.materialPath_;
    }
    public ByteString getMaterialPathBytes(){
       return ByteString.copyFromUtf8(this.materialPath_);
    }
    public void setFace3DLightContent(String p0){
       Objects.requireNonNull(p0);
       this.face3DLightContent_ = p0;
    }
    public void setFace3DLightContentBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.face3DLightContent_ = p0.toStringUtf8();
    }
    public void setMaterialPath(String p0){
       Objects.requireNonNull(p0);
       this.materialPath_ = p0;
    }
    public void setMaterialPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.materialPath_ = p0.toStringUtf8();
    }
}
