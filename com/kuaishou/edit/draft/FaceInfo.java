package com.kuaishou.edit.draft.FaceInfo;
import z30.f0;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.FaceInfo$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kuaishou.edit.draft.FaceInfo$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class FaceInfo extends GeneratedMessageLite implements f0	// class@001790
{
    public float confidence_;
    public float faceId_;
    public static final FaceInfo DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       FaceInfo uFaceInfo = new FaceInfo();
       FaceInfo.DEFAULT_INSTANCE = uFaceInfo;
       GeneratedMessageLite.registerDefaultInstance(FaceInfo.class, uFaceInfo);
    }
    public void FaceInfo(){
       super();
    }
    public static FaceInfo getDefaultInstance(){
       return FaceInfo.DEFAULT_INSTANCE;
    }
    public static FaceInfo$b newBuilder(){
       return FaceInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static FaceInfo$b newBuilder(FaceInfo p0){
       return FaceInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static FaceInfo parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(FaceInfo.DEFAULT_INSTANCE, p0);
    }
    public static FaceInfo parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(FaceInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceInfo parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(FaceInfo.DEFAULT_INSTANCE, p0);
    }
    public static FaceInfo parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceInfo parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(FaceInfo.DEFAULT_INSTANCE, p0);
    }
    public static FaceInfo parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceInfo parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(FaceInfo.DEFAULT_INSTANCE, p0);
    }
    public static FaceInfo parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceInfo parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(FaceInfo.DEFAULT_INSTANCE, p0);
    }
    public static FaceInfo parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceInfo parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(FaceInfo.DEFAULT_INSTANCE, p0);
    }
    public static FaceInfo parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return FaceInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearConfidence(){
       this.confidence_ = 0;
    }
    public void clearFaceId(){
       this.faceId_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (FaceInfo$a.a[p0.ordinal()]){
           case 1:
             return new FaceInfo();
           case 2:
             return new FaceInfo$b(p2);
           case 3:
             Object[] objArray = new Object[]{"faceId_","confidence_"};
             return GeneratedMessageLite.newMessageInfo(FaceInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x01\x00", objArray);
           case 4:
             return FaceInfo.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = FaceInfo.PARSER;
             if (pARSER == null) {
                _monitor_enter(FaceInfo.class);
                pARSER = FaceInfo.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(FaceInfo.DEFAULT_INSTANCE);
                   FaceInfo.PARSER = pARSER;
                }
                _monitor_exit(FaceInfo.class);
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
    public float getConfidence(){
       return this.confidence_;
    }
    public float getFaceId(){
       return this.faceId_;
    }
    public void setConfidence(float p0){
       this.confidence_ = p0;
    }
    public void setFaceId(float p0){
       this.faceId_ = p0;
    }
}
