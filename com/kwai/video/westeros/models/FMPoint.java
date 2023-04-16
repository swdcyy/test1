package com.kwai.video.westeros.models.FMPoint;
import com.kwai.video.westeros.models.FMPointOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.FMPoint$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.FMPoint$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class FMPoint extends GeneratedMessageLite implements FMPointOrBuilder	// class@000f52
{
    public float x_;
    public float y_;
    public static final FMPoint DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       FMPoint uFMPoint = new FMPoint();
       FMPoint.DEFAULT_INSTANCE = uFMPoint;
       GeneratedMessageLite.registerDefaultInstance(FMPoint.class, uFMPoint);
    }
    public void FMPoint(){
       super();
    }
    public static FMPoint getDefaultInstance(){
       return FMPoint.DEFAULT_INSTANCE;
    }
    public static FMPoint$Builder newBuilder(){
       return FMPoint.DEFAULT_INSTANCE.createBuilder();
    }
    public static FMPoint$Builder newBuilder(FMPoint p0){
       return FMPoint.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static FMPoint parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(FMPoint.DEFAULT_INSTANCE, p0);
    }
    public static FMPoint parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(FMPoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static FMPoint parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(FMPoint.DEFAULT_INSTANCE, p0);
    }
    public static FMPoint parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FMPoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static FMPoint parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(FMPoint.DEFAULT_INSTANCE, p0);
    }
    public static FMPoint parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FMPoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static FMPoint parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(FMPoint.DEFAULT_INSTANCE, p0);
    }
    public static FMPoint parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FMPoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static FMPoint parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(FMPoint.DEFAULT_INSTANCE, p0);
    }
    public static FMPoint parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FMPoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static FMPoint parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(FMPoint.DEFAULT_INSTANCE, p0);
    }
    public static FMPoint parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FMPoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return FMPoint.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearX(){
       this.x_ = 0;
    }
    public void clearY(){
       this.y_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (FMPoint$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new FMPoint();
           case 2:
             return new FMPoint$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"x_","y_"};
             return GeneratedMessageLite.newMessageInfo(FMPoint.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x01\x00", objArray);
           case 4:
             return FMPoint.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = FMPoint.PARSER;
             if (pARSER == null) {
                _monitor_enter(FMPoint.class);
                pARSER = FMPoint.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(FMPoint.DEFAULT_INSTANCE);
                   FMPoint.PARSER = pARSER;
                }
                _monitor_exit(FMPoint.class);
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
    public float getX(){
       return this.x_;
    }
    public float getY(){
       return this.y_;
    }
    public void setX(float p0){
       this.x_ = p0;
    }
    public void setY(float p0){
       this.y_ = p0;
    }
}
