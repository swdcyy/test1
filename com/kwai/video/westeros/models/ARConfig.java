package com.kwai.video.westeros.models.ARConfig;
import com.kwai.video.westeros.models.ARConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.ARConfig$Builder;
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
import com.kwai.video.westeros.models.ARConfig$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class ARConfig extends GeneratedMessageLite implements ARConfigOrBuilder	// class@000e8f
{
    public String arMeshType_;
    public boolean requireDepthData_;
    public boolean requireMeshData_;
    public boolean requirePersonMask_;
    public boolean useSystemAr_;
    public static final ARConfig DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       ARConfig uARConfig = new ARConfig();
       ARConfig.DEFAULT_INSTANCE = uARConfig;
       GeneratedMessageLite.registerDefaultInstance(ARConfig.class, uARConfig);
    }
    public void ARConfig(){
       super();
       this.arMeshType_ = "";
    }
    public static ARConfig getDefaultInstance(){
       return ARConfig.DEFAULT_INSTANCE;
    }
    public static ARConfig$Builder newBuilder(){
       return ARConfig.DEFAULT_INSTANCE.createBuilder();
    }
    public static ARConfig$Builder newBuilder(ARConfig p0){
       return ARConfig.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static ARConfig parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(ARConfig.DEFAULT_INSTANCE, p0);
    }
    public static ARConfig parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(ARConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static ARConfig parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(ARConfig.DEFAULT_INSTANCE, p0);
    }
    public static ARConfig parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ARConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static ARConfig parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(ARConfig.DEFAULT_INSTANCE, p0);
    }
    public static ARConfig parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ARConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static ARConfig parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(ARConfig.DEFAULT_INSTANCE, p0);
    }
    public static ARConfig parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ARConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static ARConfig parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(ARConfig.DEFAULT_INSTANCE, p0);
    }
    public static ARConfig parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ARConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static ARConfig parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(ARConfig.DEFAULT_INSTANCE, p0);
    }
    public static ARConfig parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ARConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return ARConfig.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearArMeshType(){
       this.arMeshType_ = ARConfig.getDefaultInstance().getArMeshType();
    }
    public void clearRequireDepthData(){
       this.requireDepthData_ = false;
    }
    public void clearRequireMeshData(){
       this.requireMeshData_ = false;
    }
    public void clearRequirePersonMask(){
       this.requirePersonMask_ = false;
    }
    public void clearUseSystemAr(){
       this.useSystemAr_ = false;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (ARConfig$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new ARConfig();
           case 2:
             return new ARConfig$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"requireDepthData_","requireMeshData_","requirePersonMask_","useSystemAr_","arMeshType_"};
             return GeneratedMessageLite.newMessageInfo(ARConfig.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\x07\x03\x07\x04\x07\x05\x02\x02\x00", objArray);
           case 4:
             return ARConfig.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = ARConfig.PARSER;
             if (pARSER == null) {
                _monitor_enter(ARConfig.class);
                pARSER = ARConfig.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(ARConfig.DEFAULT_INSTANCE);
                   ARConfig.PARSER = pARSER;
                }
                _monitor_exit(ARConfig.class);
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
    public String getArMeshType(){
       return this.arMeshType_;
    }
    public ByteString getArMeshTypeBytes(){
       return ByteString.copyFromUtf8(this.arMeshType_);
    }
    public boolean getRequireDepthData(){
       return this.requireDepthData_;
    }
    public boolean getRequireMeshData(){
       return this.requireMeshData_;
    }
    public boolean getRequirePersonMask(){
       return this.requirePersonMask_;
    }
    public boolean getUseSystemAr(){
       return this.useSystemAr_;
    }
    public void setArMeshType(String p0){
       Objects.requireNonNull(p0);
       this.arMeshType_ = p0;
    }
    public void setArMeshTypeBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.arMeshType_ = p0.toStringUtf8();
    }
    public void setRequireDepthData(boolean p0){
       this.requireDepthData_ = p0;
    }
    public void setRequireMeshData(boolean p0){
       this.requireMeshData_ = p0;
    }
    public void setRequirePersonMask(boolean p0){
       this.requirePersonMask_ = p0;
    }
    public void setUseSystemAr(boolean p0){
       this.useSystemAr_ = p0;
    }
}
