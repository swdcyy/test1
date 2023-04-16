package com.kwai.video.westeros.models.SafeUIArea;
import com.kwai.video.westeros.models.SafeUIAreaOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.SafeUIArea$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.SafeUIArea$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class SafeUIArea extends GeneratedMessageLite implements SafeUIAreaOrBuilder	// class@00102f
{
    public float strongAreaHeight_;
    public float strongAreaWidth_;
    public float strongLeftBottomX_;
    public float strongLeftBottomY_;
    public float weakAreaHeight_;
    public float weakAreaWidth_;
    public float weakLeftBottomX_;
    public float weakLeftBottomY_;
    public static final SafeUIArea DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       SafeUIArea safeUIArea = new SafeUIArea();
       SafeUIArea.DEFAULT_INSTANCE = safeUIArea;
       GeneratedMessageLite.registerDefaultInstance(SafeUIArea.class, safeUIArea);
    }
    public void SafeUIArea(){
       super();
    }
    public static SafeUIArea getDefaultInstance(){
       return SafeUIArea.DEFAULT_INSTANCE;
    }
    public static SafeUIArea$Builder newBuilder(){
       return SafeUIArea.DEFAULT_INSTANCE.createBuilder();
    }
    public static SafeUIArea$Builder newBuilder(SafeUIArea p0){
       return SafeUIArea.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static SafeUIArea parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(SafeUIArea.DEFAULT_INSTANCE, p0);
    }
    public static SafeUIArea parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(SafeUIArea.DEFAULT_INSTANCE, p0, p1);
    }
    public static SafeUIArea parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(SafeUIArea.DEFAULT_INSTANCE, p0);
    }
    public static SafeUIArea parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SafeUIArea.DEFAULT_INSTANCE, p0, p1);
    }
    public static SafeUIArea parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(SafeUIArea.DEFAULT_INSTANCE, p0);
    }
    public static SafeUIArea parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SafeUIArea.DEFAULT_INSTANCE, p0, p1);
    }
    public static SafeUIArea parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(SafeUIArea.DEFAULT_INSTANCE, p0);
    }
    public static SafeUIArea parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SafeUIArea.DEFAULT_INSTANCE, p0, p1);
    }
    public static SafeUIArea parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(SafeUIArea.DEFAULT_INSTANCE, p0);
    }
    public static SafeUIArea parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SafeUIArea.DEFAULT_INSTANCE, p0, p1);
    }
    public static SafeUIArea parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(SafeUIArea.DEFAULT_INSTANCE, p0);
    }
    public static SafeUIArea parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SafeUIArea.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return SafeUIArea.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearStrongAreaHeight(){
       this.strongAreaHeight_ = 0;
    }
    public void clearStrongAreaWidth(){
       this.strongAreaWidth_ = 0;
    }
    public void clearStrongLeftBottomX(){
       this.strongLeftBottomX_ = 0;
    }
    public void clearStrongLeftBottomY(){
       this.strongLeftBottomY_ = 0;
    }
    public void clearWeakAreaHeight(){
       this.weakAreaHeight_ = 0;
    }
    public void clearWeakAreaWidth(){
       this.weakAreaWidth_ = 0;
    }
    public void clearWeakLeftBottomX(){
       this.weakLeftBottomX_ = 0;
    }
    public void clearWeakLeftBottomY(){
       this.weakLeftBottomY_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (SafeUIArea$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new SafeUIArea();
           case 2:
             return new SafeUIArea$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"weakAreaWidth_","weakAreaHeight_","weakLeftBottomX_","weakLeftBottomY_","strongAreaWidth_","strongAreaHeight_","strongLeftBottomX_","strongLeftBottomY_"};
             return GeneratedMessageLite.newMessageInfo(SafeUIArea.DEFAULT_INSTANCE, "\xff\x02\xff\x02\b\xff\x02\xff\x02\xff\x02\xff\x02\x01\b\b\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x01\x03\x01\x04\x01\x05\x01\x06\x01\x07\x01\b\x01\x00", objArray);
           case 4:
             return SafeUIArea.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = SafeUIArea.PARSER;
             if (pARSER == null) {
                _monitor_enter(SafeUIArea.class);
                pARSER = SafeUIArea.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(SafeUIArea.DEFAULT_INSTANCE);
                   SafeUIArea.PARSER = pARSER;
                }
                _monitor_exit(SafeUIArea.class);
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
    public float getStrongAreaHeight(){
       return this.strongAreaHeight_;
    }
    public float getStrongAreaWidth(){
       return this.strongAreaWidth_;
    }
    public float getStrongLeftBottomX(){
       return this.strongLeftBottomX_;
    }
    public float getStrongLeftBottomY(){
       return this.strongLeftBottomY_;
    }
    public float getWeakAreaHeight(){
       return this.weakAreaHeight_;
    }
    public float getWeakAreaWidth(){
       return this.weakAreaWidth_;
    }
    public float getWeakLeftBottomX(){
       return this.weakLeftBottomX_;
    }
    public float getWeakLeftBottomY(){
       return this.weakLeftBottomY_;
    }
    public void setStrongAreaHeight(float p0){
       this.strongAreaHeight_ = p0;
    }
    public void setStrongAreaWidth(float p0){
       this.strongAreaWidth_ = p0;
    }
    public void setStrongLeftBottomX(float p0){
       this.strongLeftBottomX_ = p0;
    }
    public void setStrongLeftBottomY(float p0){
       this.strongLeftBottomY_ = p0;
    }
    public void setWeakAreaHeight(float p0){
       this.weakAreaHeight_ = p0;
    }
    public void setWeakAreaWidth(float p0){
       this.weakAreaWidth_ = p0;
    }
    public void setWeakLeftBottomX(float p0){
       this.weakLeftBottomX_ = p0;
    }
    public void setWeakLeftBottomY(float p0){
       this.weakLeftBottomY_ = p0;
    }
}
