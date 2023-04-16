package com.kwai.video.westeros.models.FaceRect;
import com.kwai.video.westeros.models.FaceRectOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.FaceRect$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.FaceRect$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class FaceRect extends GeneratedMessageLite implements FaceRectOrBuilder	// class@000f6a
{
    public float bottom_;
    public float left_;
    public float right_;
    public float top_;
    public static final FaceRect DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       FaceRect uFaceRect = new FaceRect();
       FaceRect.DEFAULT_INSTANCE = uFaceRect;
       GeneratedMessageLite.registerDefaultInstance(FaceRect.class, uFaceRect);
    }
    public void FaceRect(){
       super();
    }
    public static FaceRect getDefaultInstance(){
       return FaceRect.DEFAULT_INSTANCE;
    }
    public static FaceRect$Builder newBuilder(){
       return FaceRect.DEFAULT_INSTANCE.createBuilder();
    }
    public static FaceRect$Builder newBuilder(FaceRect p0){
       return FaceRect.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static FaceRect parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(FaceRect.DEFAULT_INSTANCE, p0);
    }
    public static FaceRect parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(FaceRect.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceRect parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(FaceRect.DEFAULT_INSTANCE, p0);
    }
    public static FaceRect parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceRect.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceRect parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(FaceRect.DEFAULT_INSTANCE, p0);
    }
    public static FaceRect parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceRect.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceRect parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(FaceRect.DEFAULT_INSTANCE, p0);
    }
    public static FaceRect parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceRect.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceRect parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(FaceRect.DEFAULT_INSTANCE, p0);
    }
    public static FaceRect parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceRect.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceRect parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(FaceRect.DEFAULT_INSTANCE, p0);
    }
    public static FaceRect parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceRect.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return FaceRect.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearBottom(){
       this.bottom_ = 0;
    }
    public void clearLeft(){
       this.left_ = 0;
    }
    public void clearRight(){
       this.right_ = 0;
    }
    public void clearTop(){
       this.top_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (FaceRect$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new FaceRect();
           case 2:
             return new FaceRect$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"left_","top_","right_","bottom_"};
             return GeneratedMessageLite.newMessageInfo(FaceRect.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x01\x03\x01\x04\x01\x00", objArray);
           case 4:
             return FaceRect.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = FaceRect.PARSER;
             if (pARSER == null) {
                _monitor_enter(FaceRect.class);
                pARSER = FaceRect.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(FaceRect.DEFAULT_INSTANCE);
                   FaceRect.PARSER = pARSER;
                }
                _monitor_exit(FaceRect.class);
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
    public float getBottom(){
       return this.bottom_;
    }
    public float getLeft(){
       return this.left_;
    }
    public float getRight(){
       return this.right_;
    }
    public float getTop(){
       return this.top_;
    }
    public void setBottom(float p0){
       this.bottom_ = p0;
    }
    public void setLeft(float p0){
       this.left_ = p0;
    }
    public void setRight(float p0){
       this.right_ = p0;
    }
    public void setTop(float p0){
       this.top_ = p0;
    }
}
