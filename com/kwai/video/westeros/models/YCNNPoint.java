package com.kwai.video.westeros.models.YCNNPoint;
import com.kwai.video.westeros.models.YCNNPointOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.YCNNPoint$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.YCNNPoint$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class YCNNPoint extends GeneratedMessageLite implements YCNNPointOrBuilder	// class@00109a
{
    public float x_;
    public float y_;
    public static final YCNNPoint DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       YCNNPoint yCNNPoint = new YCNNPoint();
       YCNNPoint.DEFAULT_INSTANCE = yCNNPoint;
       GeneratedMessageLite.registerDefaultInstance(YCNNPoint.class, yCNNPoint);
    }
    public void YCNNPoint(){
       super();
    }
    public static YCNNPoint getDefaultInstance(){
       return YCNNPoint.DEFAULT_INSTANCE;
    }
    public static YCNNPoint$Builder newBuilder(){
       return YCNNPoint.DEFAULT_INSTANCE.createBuilder();
    }
    public static YCNNPoint$Builder newBuilder(YCNNPoint p0){
       return YCNNPoint.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static YCNNPoint parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(YCNNPoint.DEFAULT_INSTANCE, p0);
    }
    public static YCNNPoint parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(YCNNPoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNPoint parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(YCNNPoint.DEFAULT_INSTANCE, p0);
    }
    public static YCNNPoint parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNPoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNPoint parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(YCNNPoint.DEFAULT_INSTANCE, p0);
    }
    public static YCNNPoint parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNPoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNPoint parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(YCNNPoint.DEFAULT_INSTANCE, p0);
    }
    public static YCNNPoint parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNPoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNPoint parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(YCNNPoint.DEFAULT_INSTANCE, p0);
    }
    public static YCNNPoint parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNPoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNPoint parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(YCNNPoint.DEFAULT_INSTANCE, p0);
    }
    public static YCNNPoint parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNPoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return YCNNPoint.DEFAULT_INSTANCE.getParserForType();
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
       switch (YCNNPoint$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new YCNNPoint();
           case 2:
             return new YCNNPoint$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"x_","y_"};
             return GeneratedMessageLite.newMessageInfo(YCNNPoint.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x01\x00", objArray);
           case 4:
             return YCNNPoint.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = YCNNPoint.PARSER;
             if (pARSER == null) {
                _monitor_enter(YCNNPoint.class);
                pARSER = YCNNPoint.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(YCNNPoint.DEFAULT_INSTANCE);
                   YCNNPoint.PARSER = pARSER;
                }
                _monitor_exit(YCNNPoint.class);
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
