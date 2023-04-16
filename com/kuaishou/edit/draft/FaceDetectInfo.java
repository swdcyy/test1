package com.kuaishou.edit.draft.FaceDetectInfo;
import z30.e0;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.FaceDetectInfo$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kuaishou.edit.draft.FaceDetectInfo$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class FaceDetectInfo extends GeneratedMessageLite implements e0	// class@00178d
{
    public float height_;
    public float left_;
    public float top_;
    public float width_;
    public static final FaceDetectInfo DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       FaceDetectInfo uFaceDetectI = new FaceDetectInfo();
       FaceDetectInfo.DEFAULT_INSTANCE = uFaceDetectI;
       GeneratedMessageLite.registerDefaultInstance(FaceDetectInfo.class, uFaceDetectI);
    }
    public void FaceDetectInfo(){
       super();
    }
    public static FaceDetectInfo getDefaultInstance(){
       return FaceDetectInfo.DEFAULT_INSTANCE;
    }
    public static FaceDetectInfo$b newBuilder(){
       return FaceDetectInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static FaceDetectInfo$b newBuilder(FaceDetectInfo p0){
       return FaceDetectInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static FaceDetectInfo parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(FaceDetectInfo.DEFAULT_INSTANCE, p0);
    }
    public static FaceDetectInfo parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(FaceDetectInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceDetectInfo parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(FaceDetectInfo.DEFAULT_INSTANCE, p0);
    }
    public static FaceDetectInfo parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceDetectInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceDetectInfo parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(FaceDetectInfo.DEFAULT_INSTANCE, p0);
    }
    public static FaceDetectInfo parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceDetectInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceDetectInfo parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(FaceDetectInfo.DEFAULT_INSTANCE, p0);
    }
    public static FaceDetectInfo parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceDetectInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceDetectInfo parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(FaceDetectInfo.DEFAULT_INSTANCE, p0);
    }
    public static FaceDetectInfo parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceDetectInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceDetectInfo parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(FaceDetectInfo.DEFAULT_INSTANCE, p0);
    }
    public static FaceDetectInfo parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceDetectInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return FaceDetectInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearHeight(){
       this.height_ = 0;
    }
    public void clearLeft(){
       this.left_ = 0;
    }
    public void clearTop(){
       this.top_ = 0;
    }
    public void clearWidth(){
       this.width_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (FaceDetectInfo$a.a[p0.ordinal()]){
           case 1:
             return new FaceDetectInfo();
           case 2:
             return new FaceDetectInfo$b(p2);
           case 3:
             Object[] objArray = new Object[]{"left_","top_","width_","height_"};
             return GeneratedMessageLite.newMessageInfo(FaceDetectInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x01\x03\x01\x04\x01\x00", objArray);
           case 4:
             return FaceDetectInfo.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = FaceDetectInfo.PARSER;
             if (pARSER == null) {
                _monitor_enter(FaceDetectInfo.class);
                pARSER = FaceDetectInfo.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(FaceDetectInfo.DEFAULT_INSTANCE);
                   FaceDetectInfo.PARSER = pARSER;
                }
                _monitor_exit(FaceDetectInfo.class);
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
    public float getLeft(){
       return this.left_;
    }
    public float getTop(){
       return this.top_;
    }
    public float getWidth(){
       return this.width_;
    }
    public void setHeight(float p0){
       this.height_ = p0;
    }
    public void setLeft(float p0){
       this.left_ = p0;
    }
    public void setTop(float p0){
       this.top_ = p0;
    }
    public void setWidth(float p0){
       this.width_ = p0;
    }
}
