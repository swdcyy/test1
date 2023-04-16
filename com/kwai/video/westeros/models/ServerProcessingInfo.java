package com.kwai.video.westeros.models.ServerProcessingInfo;
import com.kwai.video.westeros.models.ServerProcessingInfoOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.ServerProcessingInfo$Builder;
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
import com.kwai.video.westeros.models.ServerProcessingInfo$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class ServerProcessingInfo extends GeneratedMessageLite implements ServerProcessingInfoOrBuilder	// class@00103f
{
    public boolean disableCache_;
    public String returnMediaType_;
    public String serviceType_;
    public static final ServerProcessingInfo DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       ServerProcessingInfo serverProces = new ServerProcessingInfo();
       ServerProcessingInfo.DEFAULT_INSTANCE = serverProces;
       GeneratedMessageLite.registerDefaultInstance(ServerProcessingInfo.class, serverProces);
    }
    public void ServerProcessingInfo(){
       super();
       this.serviceType_ = "";
       this.returnMediaType_ = "";
    }
    public static ServerProcessingInfo getDefaultInstance(){
       return ServerProcessingInfo.DEFAULT_INSTANCE;
    }
    public static ServerProcessingInfo$Builder newBuilder(){
       return ServerProcessingInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static ServerProcessingInfo$Builder newBuilder(ServerProcessingInfo p0){
       return ServerProcessingInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static ServerProcessingInfo parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(ServerProcessingInfo.DEFAULT_INSTANCE, p0);
    }
    public static ServerProcessingInfo parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(ServerProcessingInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static ServerProcessingInfo parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(ServerProcessingInfo.DEFAULT_INSTANCE, p0);
    }
    public static ServerProcessingInfo parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ServerProcessingInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static ServerProcessingInfo parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(ServerProcessingInfo.DEFAULT_INSTANCE, p0);
    }
    public static ServerProcessingInfo parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ServerProcessingInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static ServerProcessingInfo parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(ServerProcessingInfo.DEFAULT_INSTANCE, p0);
    }
    public static ServerProcessingInfo parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ServerProcessingInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static ServerProcessingInfo parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(ServerProcessingInfo.DEFAULT_INSTANCE, p0);
    }
    public static ServerProcessingInfo parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ServerProcessingInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static ServerProcessingInfo parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(ServerProcessingInfo.DEFAULT_INSTANCE, p0);
    }
    public static ServerProcessingInfo parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ServerProcessingInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return ServerProcessingInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearDisableCache(){
       this.disableCache_ = false;
    }
    public void clearReturnMediaType(){
       this.returnMediaType_ = ServerProcessingInfo.getDefaultInstance().getReturnMediaType();
    }
    public void clearServiceType(){
       this.serviceType_ = ServerProcessingInfo.getDefaultInstance().getServiceType();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (ServerProcessingInfo$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new ServerProcessingInfo();
           case 2:
             return new ServerProcessingInfo$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"serviceType_","returnMediaType_","disableCache_"};
             return GeneratedMessageLite.newMessageInfo(ServerProcessingInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x07\x00", objArray);
           case 4:
             return ServerProcessingInfo.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = ServerProcessingInfo.PARSER;
             if (pARSER == null) {
                _monitor_enter(ServerProcessingInfo.class);
                pARSER = ServerProcessingInfo.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(ServerProcessingInfo.DEFAULT_INSTANCE);
                   ServerProcessingInfo.PARSER = pARSER;
                }
                _monitor_exit(ServerProcessingInfo.class);
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
    public boolean getDisableCache(){
       return this.disableCache_;
    }
    public String getReturnMediaType(){
       return this.returnMediaType_;
    }
    public ByteString getReturnMediaTypeBytes(){
       return ByteString.copyFromUtf8(this.returnMediaType_);
    }
    public String getServiceType(){
       return this.serviceType_;
    }
    public ByteString getServiceTypeBytes(){
       return ByteString.copyFromUtf8(this.serviceType_);
    }
    public void setDisableCache(boolean p0){
       this.disableCache_ = p0;
    }
    public void setReturnMediaType(String p0){
       Objects.requireNonNull(p0);
       this.returnMediaType_ = p0;
    }
    public void setReturnMediaTypeBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.returnMediaType_ = p0.toStringUtf8();
    }
    public void setServiceType(String p0){
       Objects.requireNonNull(p0);
       this.serviceType_ = p0;
    }
    public void setServiceTypeBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.serviceType_ = p0.toStringUtf8();
    }
}
