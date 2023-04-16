package com.kuaishou.edit.draft.DynamicStickerParam;
import z30.w;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.DynamicStickerParam$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.AbstractMessageLite;
import com.kuaishou.edit.draft.Frame$b;
import java.lang.Object;
import com.kuaishou.edit.draft.Frame;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.edit.draft.DynamicStickerParam$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import z30.i0;

public final class DynamicStickerParam extends GeneratedMessageLite implements w	// class@001772
{
    public int animatedSubAssetFileType_;
    public boolean disableRecyclePlay_;
    public double frameRate_;
    public Internal$ProtobufList frames_;
    public static final DynamicStickerParam DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       DynamicStickerParam uDynamicStic = new DynamicStickerParam();
       DynamicStickerParam.DEFAULT_INSTANCE = uDynamicStic;
       GeneratedMessageLite.registerDefaultInstance(DynamicStickerParam.class, uDynamicStic);
    }
    public void DynamicStickerParam(){
       super();
       this.frames_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static DynamicStickerParam getDefaultInstance(){
       return DynamicStickerParam.DEFAULT_INSTANCE;
    }
    public static DynamicStickerParam$b newBuilder(){
       return DynamicStickerParam.DEFAULT_INSTANCE.createBuilder();
    }
    public static DynamicStickerParam$b newBuilder(DynamicStickerParam p0){
       return DynamicStickerParam.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static DynamicStickerParam parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(DynamicStickerParam.DEFAULT_INSTANCE, p0);
    }
    public static DynamicStickerParam parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(DynamicStickerParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static DynamicStickerParam parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(DynamicStickerParam.DEFAULT_INSTANCE, p0);
    }
    public static DynamicStickerParam parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DynamicStickerParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static DynamicStickerParam parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(DynamicStickerParam.DEFAULT_INSTANCE, p0);
    }
    public static DynamicStickerParam parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DynamicStickerParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static DynamicStickerParam parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(DynamicStickerParam.DEFAULT_INSTANCE, p0);
    }
    public static DynamicStickerParam parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DynamicStickerParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static DynamicStickerParam parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(DynamicStickerParam.DEFAULT_INSTANCE, p0);
    }
    public static DynamicStickerParam parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DynamicStickerParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static DynamicStickerParam parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(DynamicStickerParam.DEFAULT_INSTANCE, p0);
    }
    public static DynamicStickerParam parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DynamicStickerParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return DynamicStickerParam.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllFrames(Iterable p0){
       this.ensureFramesIsMutable();
       AbstractMessageLite.addAll(p0, this.frames_);
    }
    public void addFrames(int p0,Frame$b p1){
       this.ensureFramesIsMutable();
       this.frames_.add(p0, p1.build());
    }
    public void addFrames(int p0,Frame p1){
       Objects.requireNonNull(p1);
       this.ensureFramesIsMutable();
       this.frames_.add(p0, p1);
    }
    public void addFrames(Frame$b p0){
       this.ensureFramesIsMutable();
       this.frames_.add(p0.build());
    }
    public void addFrames(Frame p0){
       Objects.requireNonNull(p0);
       this.ensureFramesIsMutable();
       this.frames_.add(p0);
    }
    public void clearAnimatedSubAssetFileType(){
       this.animatedSubAssetFileType_ = 0;
    }
    public void clearDisableRecyclePlay(){
       this.disableRecyclePlay_ = false;
    }
    public void clearFrameRate(){
       this.frameRate_ = 0;
    }
    public void clearFrames(){
       this.frames_ = GeneratedMessageLite.emptyProtobufList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (DynamicStickerParam$a.a[p0.ordinal()]){
           case 1:
             return new DynamicStickerParam();
           case 2:
             return new DynamicStickerParam$b(p2);
           case 3:
             Object[] objArray = new Object[]{"frameRate_","frames_",Frame.class,"animatedSubAssetFileType_","disableRecyclePlay_"};
             return GeneratedMessageLite.newMessageInfo(DynamicStickerParam.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x02\x1b\x03\x0b\x04\x07\x00", objArray);
           case 4:
             return DynamicStickerParam.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = DynamicStickerParam.PARSER;
             if (pARSER == null) {
                _monitor_enter(DynamicStickerParam.class);
                pARSER = DynamicStickerParam.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(DynamicStickerParam.DEFAULT_INSTANCE);
                   DynamicStickerParam.PARSER = pARSER;
                }
                _monitor_exit(DynamicStickerParam.class);
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
    public final void ensureFramesIsMutable(){
       if (!this.frames_.isModifiable()) {
          this.frames_ = GeneratedMessageLite.mutableCopy(this.frames_);
       }
       return;
    }
    public int getAnimatedSubAssetFileType(){
       return this.animatedSubAssetFileType_;
    }
    public boolean getDisableRecyclePlay(){
       return this.disableRecyclePlay_;
    }
    public double getFrameRate(){
       return this.frameRate_;
    }
    public Frame getFrames(int p0){
       return this.frames_.get(p0);
    }
    public int getFramesCount(){
       return this.frames_.size();
    }
    public List getFramesList(){
       return this.frames_;
    }
    public i0 getFramesOrBuilder(int p0){
       return this.frames_.get(p0);
    }
    public List getFramesOrBuilderList(){
       return this.frames_;
    }
    public void removeFrames(int p0){
       this.ensureFramesIsMutable();
       this.frames_.remove(p0);
    }
    public void setAnimatedSubAssetFileType(int p0){
       this.animatedSubAssetFileType_ = p0;
    }
    public void setDisableRecyclePlay(boolean p0){
       this.disableRecyclePlay_ = p0;
    }
    public void setFrameRate(double p0){
       this.frameRate_ = p0;
    }
    public void setFrames(int p0,Frame$b p1){
       this.ensureFramesIsMutable();
       this.frames_.set(p0, p1.build());
    }
    public void setFrames(int p0,Frame p1){
       Objects.requireNonNull(p1);
       this.ensureFramesIsMutable();
       this.frames_.set(p0, p1);
    }
}
