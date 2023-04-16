package com.kuaishou.edit.draft.CameraMovementParams;
import z30.n;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.CameraMovementParams$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kuaishou.edit.draft.CameraMovementParams$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class CameraMovementParams extends GeneratedMessageLite implements n	// class@001741
{
    public float startBoxH_;
    public float startBoxW_;
    public float startX_;
    public float startY_;
    public float targetBoxH_;
    public float targetBoxW_;
    public float targetX_;
    public float targetY_;
    public static final CameraMovementParams DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       CameraMovementParams uCameraMovem = new CameraMovementParams();
       CameraMovementParams.DEFAULT_INSTANCE = uCameraMovem;
       GeneratedMessageLite.registerDefaultInstance(CameraMovementParams.class, uCameraMovem);
    }
    public void CameraMovementParams(){
       super();
    }
    public static CameraMovementParams getDefaultInstance(){
       return CameraMovementParams.DEFAULT_INSTANCE;
    }
    public static CameraMovementParams$b newBuilder(){
       return CameraMovementParams.DEFAULT_INSTANCE.createBuilder();
    }
    public static CameraMovementParams$b newBuilder(CameraMovementParams p0){
       return CameraMovementParams.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static CameraMovementParams parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(CameraMovementParams.DEFAULT_INSTANCE, p0);
    }
    public static CameraMovementParams parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(CameraMovementParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static CameraMovementParams parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(CameraMovementParams.DEFAULT_INSTANCE, p0);
    }
    public static CameraMovementParams parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CameraMovementParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static CameraMovementParams parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(CameraMovementParams.DEFAULT_INSTANCE, p0);
    }
    public static CameraMovementParams parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CameraMovementParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static CameraMovementParams parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(CameraMovementParams.DEFAULT_INSTANCE, p0);
    }
    public static CameraMovementParams parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CameraMovementParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static CameraMovementParams parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(CameraMovementParams.DEFAULT_INSTANCE, p0);
    }
    public static CameraMovementParams parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CameraMovementParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static CameraMovementParams parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(CameraMovementParams.DEFAULT_INSTANCE, p0);
    }
    public static CameraMovementParams parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CameraMovementParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return CameraMovementParams.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearStartBoxH(){
       this.startBoxH_ = 0;
    }
    public void clearStartBoxW(){
       this.startBoxW_ = 0;
    }
    public void clearStartX(){
       this.startX_ = 0;
    }
    public void clearStartY(){
       this.startY_ = 0;
    }
    public void clearTargetBoxH(){
       this.targetBoxH_ = 0;
    }
    public void clearTargetBoxW(){
       this.targetBoxW_ = 0;
    }
    public void clearTargetX(){
       this.targetX_ = 0;
    }
    public void clearTargetY(){
       this.targetY_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (CameraMovementParams$a.a[p0.ordinal()]){
           case 1:
             return new CameraMovementParams();
           case 2:
             return new CameraMovementParams$b(p2);
           case 3:
             Object[] objArray = new Object[]{"startX_","startY_","startBoxW_","startBoxH_","targetX_","targetY_","targetBoxW_","targetBoxH_"};
             return GeneratedMessageLite.newMessageInfo(CameraMovementParams.DEFAULT_INSTANCE, "\xff\x02\xff\x02\b\xff\x02\xff\x02\xff\x02\xff\x02\x01\b\b\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x01\x03\x01\x04\x01\x05\x01\x06\x01\x07\x01\b\x01\x00", objArray);
           case 4:
             return CameraMovementParams.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = CameraMovementParams.PARSER;
             if (pARSER == null) {
                _monitor_enter(CameraMovementParams.class);
                pARSER = CameraMovementParams.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(CameraMovementParams.DEFAULT_INSTANCE);
                   CameraMovementParams.PARSER = pARSER;
                }
                _monitor_exit(CameraMovementParams.class);
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
    public float getStartBoxH(){
       return this.startBoxH_;
    }
    public float getStartBoxW(){
       return this.startBoxW_;
    }
    public float getStartX(){
       return this.startX_;
    }
    public float getStartY(){
       return this.startY_;
    }
    public float getTargetBoxH(){
       return this.targetBoxH_;
    }
    public float getTargetBoxW(){
       return this.targetBoxW_;
    }
    public float getTargetX(){
       return this.targetX_;
    }
    public float getTargetY(){
       return this.targetY_;
    }
    public void setStartBoxH(float p0){
       this.startBoxH_ = p0;
    }
    public void setStartBoxW(float p0){
       this.startBoxW_ = p0;
    }
    public void setStartX(float p0){
       this.startX_ = p0;
    }
    public void setStartY(float p0){
       this.startY_ = p0;
    }
    public void setTargetBoxH(float p0){
       this.targetBoxH_ = p0;
    }
    public void setTargetBoxW(float p0){
       this.targetBoxW_ = p0;
    }
    public void setTargetX(float p0){
       this.targetX_ = p0;
    }
    public void setTargetY(float p0){
       this.targetY_ = p0;
    }
}
