package com.kwai.video.westeros.models.EffectHint;
import com.kwai.video.westeros.models.EffectHintOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.EffectHint$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectHint$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kwai.video.westeros.models.EffectHintType;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class EffectHint extends GeneratedMessageLite implements EffectHintOrBuilder	// class@000f21
{
    public String coverImage_;
    public String errorMessage_;
    public boolean faceImageFaceDetected_;
    public String faceImagePath_;
    public String pickMediaPath_;
    public boolean pickMediaResult_;
    public int type_;
    public static final EffectHint DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       EffectHint uEffectHint = new EffectHint();
       EffectHint.DEFAULT_INSTANCE = uEffectHint;
       GeneratedMessageLite.registerDefaultInstance(EffectHint.class, uEffectHint);
    }
    public void EffectHint(){
       super();
       this.coverImage_ = "";
       this.faceImagePath_ = "";
       this.pickMediaPath_ = "";
       this.errorMessage_ = "";
    }
    public static EffectHint getDefaultInstance(){
       return EffectHint.DEFAULT_INSTANCE;
    }
    public static EffectHint$Builder newBuilder(){
       return EffectHint.DEFAULT_INSTANCE.createBuilder();
    }
    public static EffectHint$Builder newBuilder(EffectHint p0){
       return EffectHint.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EffectHint parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(EffectHint.DEFAULT_INSTANCE, p0);
    }
    public static EffectHint parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(EffectHint.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectHint parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(EffectHint.DEFAULT_INSTANCE, p0);
    }
    public static EffectHint parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectHint.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectHint parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(EffectHint.DEFAULT_INSTANCE, p0);
    }
    public static EffectHint parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectHint.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectHint parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(EffectHint.DEFAULT_INSTANCE, p0);
    }
    public static EffectHint parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectHint.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectHint parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(EffectHint.DEFAULT_INSTANCE, p0);
    }
    public static EffectHint parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectHint.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectHint parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(EffectHint.DEFAULT_INSTANCE, p0);
    }
    public static EffectHint parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectHint.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return EffectHint.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearCoverImage(){
       this.coverImage_ = EffectHint.getDefaultInstance().getCoverImage();
    }
    public void clearErrorMessage(){
       this.errorMessage_ = EffectHint.getDefaultInstance().getErrorMessage();
    }
    public void clearFaceImageFaceDetected(){
       this.faceImageFaceDetected_ = false;
    }
    public void clearFaceImagePath(){
       this.faceImagePath_ = EffectHint.getDefaultInstance().getFaceImagePath();
    }
    public void clearPickMediaPath(){
       this.pickMediaPath_ = EffectHint.getDefaultInstance().getPickMediaPath();
    }
    public void clearPickMediaResult(){
       this.pickMediaResult_ = false;
    }
    public void clearType(){
       this.type_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (EffectHint$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new EffectHint();
           case 2:
             return new EffectHint$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"type_","coverImage_","faceImagePath_","faceImageFaceDetected_","pickMediaPath_","pickMediaResult_","errorMessage_"};
             return GeneratedMessageLite.newMessageInfo(EffectHint.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x07\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x07\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\x02\x02\x03\x02\x02\x04\x07\x05\x02\x02\x06\x07\x07\x02\x02\x00", objArray);
           case 4:
             return EffectHint.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = EffectHint.PARSER;
             if (pARSER == null) {
                _monitor_enter(EffectHint.class);
                pARSER = EffectHint.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(EffectHint.DEFAULT_INSTANCE);
                   EffectHint.PARSER = pARSER;
                }
                _monitor_exit(EffectHint.class);
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
    public String getCoverImage(){
       return this.coverImage_;
    }
    public ByteString getCoverImageBytes(){
       return ByteString.copyFromUtf8(this.coverImage_);
    }
    public String getErrorMessage(){
       return this.errorMessage_;
    }
    public ByteString getErrorMessageBytes(){
       return ByteString.copyFromUtf8(this.errorMessage_);
    }
    public boolean getFaceImageFaceDetected(){
       return this.faceImageFaceDetected_;
    }
    public String getFaceImagePath(){
       return this.faceImagePath_;
    }
    public ByteString getFaceImagePathBytes(){
       return ByteString.copyFromUtf8(this.faceImagePath_);
    }
    public String getPickMediaPath(){
       return this.pickMediaPath_;
    }
    public ByteString getPickMediaPathBytes(){
       return ByteString.copyFromUtf8(this.pickMediaPath_);
    }
    public boolean getPickMediaResult(){
       return this.pickMediaResult_;
    }
    public EffectHintType getType(){
       EffectHintType uEffectHintT = EffectHintType.forNumber(this.type_);
       if (uEffectHintT == null) {
          uEffectHintT = EffectHintType.UNRECOGNIZED;
       }
       return uEffectHintT;
    }
    public int getTypeValue(){
       return this.type_;
    }
    public void setCoverImage(String p0){
       Objects.requireNonNull(p0);
       this.coverImage_ = p0;
    }
    public void setCoverImageBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.coverImage_ = p0.toStringUtf8();
    }
    public void setErrorMessage(String p0){
       Objects.requireNonNull(p0);
       this.errorMessage_ = p0;
    }
    public void setErrorMessageBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.errorMessage_ = p0.toStringUtf8();
    }
    public void setFaceImageFaceDetected(boolean p0){
       this.faceImageFaceDetected_ = p0;
    }
    public void setFaceImagePath(String p0){
       Objects.requireNonNull(p0);
       this.faceImagePath_ = p0;
    }
    public void setFaceImagePathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.faceImagePath_ = p0.toStringUtf8();
    }
    public void setPickMediaPath(String p0){
       Objects.requireNonNull(p0);
       this.pickMediaPath_ = p0;
    }
    public void setPickMediaPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.pickMediaPath_ = p0.toStringUtf8();
    }
    public void setPickMediaResult(boolean p0){
       this.pickMediaResult_ = p0;
    }
    public void setType(EffectHintType p0){
       Objects.requireNonNull(p0);
       this.type_ = p0.getNumber();
    }
    public void setTypeValue(int p0){
       this.type_ = p0;
    }
}
