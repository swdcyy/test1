package com.kwai.video.westeros.models.FMSize;
import com.kwai.video.westeros.models.FMSizeOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.FMSize$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.FMSize$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class FMSize extends GeneratedMessageLite implements FMSizeOrBuilder	// class@000f56
{
    public float height_;
    public float width_;
    public static final FMSize DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       FMSize uFMSize = new FMSize();
       FMSize.DEFAULT_INSTANCE = uFMSize;
       GeneratedMessageLite.registerDefaultInstance(FMSize.class, uFMSize);
    }
    public void FMSize(){
       super();
    }
    public static FMSize getDefaultInstance(){
       return FMSize.DEFAULT_INSTANCE;
    }
    public static FMSize$Builder newBuilder(){
       return FMSize.DEFAULT_INSTANCE.createBuilder();
    }
    public static FMSize$Builder newBuilder(FMSize p0){
       return FMSize.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static FMSize parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(FMSize.DEFAULT_INSTANCE, p0);
    }
    public static FMSize parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(FMSize.DEFAULT_INSTANCE, p0, p1);
    }
    public static FMSize parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(FMSize.DEFAULT_INSTANCE, p0);
    }
    public static FMSize parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FMSize.DEFAULT_INSTANCE, p0, p1);
    }
    public static FMSize parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(FMSize.DEFAULT_INSTANCE, p0);
    }
    public static FMSize parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FMSize.DEFAULT_INSTANCE, p0, p1);
    }
    public static FMSize parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(FMSize.DEFAULT_INSTANCE, p0);
    }
    public static FMSize parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FMSize.DEFAULT_INSTANCE, p0, p1);
    }
    public static FMSize parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(FMSize.DEFAULT_INSTANCE, p0);
    }
    public static FMSize parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FMSize.DEFAULT_INSTANCE, p0, p1);
    }
    public static FMSize parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(FMSize.DEFAULT_INSTANCE, p0);
    }
    public static FMSize parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FMSize.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return FMSize.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearHeight(){
       this.height_ = 0;
    }
    public void clearWidth(){
       this.width_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (FMSize$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new FMSize();
           case 2:
             return new FMSize$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"width_","height_"};
             return GeneratedMessageLite.newMessageInfo(FMSize.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x01\x00", objArray);
           case 4:
             return FMSize.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = FMSize.PARSER;
             if (pARSER == null) {
                _monitor_enter(FMSize.class);
                pARSER = FMSize.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(FMSize.DEFAULT_INSTANCE);
                   FMSize.PARSER = pARSER;
                }
                _monitor_exit(FMSize.class);
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
    public float getHeight(){
       return this.height_;
    }
    public float getWidth(){
       return this.width_;
    }
    public void setHeight(float p0){
       this.height_ = p0;
    }
    public void setWidth(float p0){
       this.width_ = p0;
    }
}
