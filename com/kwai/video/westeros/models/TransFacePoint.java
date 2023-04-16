package com.kwai.video.westeros.models.TransFacePoint;
import com.kwai.video.westeros.models.TransFacePointOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.TransFacePoint$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.TransFacePoint$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class TransFacePoint extends GeneratedMessageLite implements TransFacePointOrBuilder	// class@00105f
{
    public int index_;
    public float x_;
    public float y_;
    public static final TransFacePoint DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       TransFacePoint transFacePoi = new TransFacePoint();
       TransFacePoint.DEFAULT_INSTANCE = transFacePoi;
       GeneratedMessageLite.registerDefaultInstance(TransFacePoint.class, transFacePoi);
    }
    public void TransFacePoint(){
       super();
    }
    public static TransFacePoint getDefaultInstance(){
       return TransFacePoint.DEFAULT_INSTANCE;
    }
    public static TransFacePoint$Builder newBuilder(){
       return TransFacePoint.DEFAULT_INSTANCE.createBuilder();
    }
    public static TransFacePoint$Builder newBuilder(TransFacePoint p0){
       return TransFacePoint.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static TransFacePoint parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(TransFacePoint.DEFAULT_INSTANCE, p0);
    }
    public static TransFacePoint parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(TransFacePoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static TransFacePoint parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(TransFacePoint.DEFAULT_INSTANCE, p0);
    }
    public static TransFacePoint parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TransFacePoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static TransFacePoint parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(TransFacePoint.DEFAULT_INSTANCE, p0);
    }
    public static TransFacePoint parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TransFacePoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static TransFacePoint parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(TransFacePoint.DEFAULT_INSTANCE, p0);
    }
    public static TransFacePoint parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TransFacePoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static TransFacePoint parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(TransFacePoint.DEFAULT_INSTANCE, p0);
    }
    public static TransFacePoint parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TransFacePoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static TransFacePoint parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(TransFacePoint.DEFAULT_INSTANCE, p0);
    }
    public static TransFacePoint parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TransFacePoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return TransFacePoint.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearIndex(){
       this.index_ = 0;
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
       switch (TransFacePoint$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new TransFacePoint();
           case 2:
             return new TransFacePoint$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"index_","x_","y_"};
             return GeneratedMessageLite.newMessageInfo(TransFacePoint.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x02\x01\x03\x01\x00", objArray);
           case 4:
             return TransFacePoint.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = TransFacePoint.PARSER;
             if (pARSER == null) {
                _monitor_enter(TransFacePoint.class);
                pARSER = TransFacePoint.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(TransFacePoint.DEFAULT_INSTANCE);
                   TransFacePoint.PARSER = pARSER;
                }
                _monitor_exit(TransFacePoint.class);
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
    public int getIndex(){
       return this.index_;
    }
    public float getX(){
       return this.x_;
    }
    public float getY(){
       return this.y_;
    }
    public void setIndex(int p0){
       this.index_ = p0;
    }
    public void setX(float p0){
       this.x_ = p0;
    }
    public void setY(float p0){
       this.y_ = p0;
    }
}
