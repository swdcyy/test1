package com.kwai.video.westeros.models.YCNNModelInConfig;
import com.kwai.video.westeros.models.YCNNModelInConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.YCNNModelInConfig$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.YCNNModelInConfig$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class YCNNModelInConfig extends GeneratedMessageLite implements YCNNModelInConfigOrBuilder	// class@001096
{
    public int rotate_;
    public int useRobust3D_;
    public static final YCNNModelInConfig DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       YCNNModelInConfig yCNNModelInC = new YCNNModelInConfig();
       YCNNModelInConfig.DEFAULT_INSTANCE = yCNNModelInC;
       GeneratedMessageLite.registerDefaultInstance(YCNNModelInConfig.class, yCNNModelInC);
    }
    public void YCNNModelInConfig(){
       super();
    }
    public static YCNNModelInConfig getDefaultInstance(){
       return YCNNModelInConfig.DEFAULT_INSTANCE;
    }
    public static YCNNModelInConfig$Builder newBuilder(){
       return YCNNModelInConfig.DEFAULT_INSTANCE.createBuilder();
    }
    public static YCNNModelInConfig$Builder newBuilder(YCNNModelInConfig p0){
       return YCNNModelInConfig.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static YCNNModelInConfig parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(YCNNModelInConfig.DEFAULT_INSTANCE, p0);
    }
    public static YCNNModelInConfig parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(YCNNModelInConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNModelInConfig parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(YCNNModelInConfig.DEFAULT_INSTANCE, p0);
    }
    public static YCNNModelInConfig parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNModelInConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNModelInConfig parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(YCNNModelInConfig.DEFAULT_INSTANCE, p0);
    }
    public static YCNNModelInConfig parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNModelInConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNModelInConfig parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(YCNNModelInConfig.DEFAULT_INSTANCE, p0);
    }
    public static YCNNModelInConfig parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNModelInConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNModelInConfig parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(YCNNModelInConfig.DEFAULT_INSTANCE, p0);
    }
    public static YCNNModelInConfig parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNModelInConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNModelInConfig parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(YCNNModelInConfig.DEFAULT_INSTANCE, p0);
    }
    public static YCNNModelInConfig parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNModelInConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return YCNNModelInConfig.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearRotate(){
       this.rotate_ = 0;
    }
    public void clearUseRobust3D(){
       this.useRobust3D_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (YCNNModelInConfig$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new YCNNModelInConfig();
           case 2:
             return new YCNNModelInConfig$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"rotate_","useRobust3D_"};
             return GeneratedMessageLite.newMessageInfo(YCNNModelInConfig.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x02\x04\x00", objArray);
           case 4:
             return YCNNModelInConfig.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = YCNNModelInConfig.PARSER;
             if (pARSER == null) {
                _monitor_enter(YCNNModelInConfig.class);
                pARSER = YCNNModelInConfig.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(YCNNModelInConfig.DEFAULT_INSTANCE);
                   YCNNModelInConfig.PARSER = pARSER;
                }
                _monitor_exit(YCNNModelInConfig.class);
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
    public int getRotate(){
       return this.rotate_;
    }
    public int getUseRobust3D(){
       return this.useRobust3D_;
    }
    public void setRotate(int p0){
       this.rotate_ = p0;
    }
    public void setUseRobust3D(int p0){
       this.useRobust3D_ = p0;
    }
}
