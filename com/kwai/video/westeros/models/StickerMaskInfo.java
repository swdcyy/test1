package com.kwai.video.westeros.models.StickerMaskInfo;
import com.kwai.video.westeros.models.StickerMaskInfoOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.StickerMaskInfo$Builder;
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
import com.kwai.video.westeros.models.FMPoint$Builder;
import java.lang.Object;
import com.kwai.video.westeros.models.FMPoint;
import java.util.Objects;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.StickerMaskInfo$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kwai.video.westeros.models.FMPointOrBuilder;

public final class StickerMaskInfo extends GeneratedMessageLite implements StickerMaskInfoOrBuilder	// class@00104b
{
    public boolean decodeShader_;
    public boolean disableRender_;
    public boolean isEdit_;
    public float maskFeatherRadius_;
    public String maskPath_;
    public String maskShaderPath_;
    public Internal$ProtobufList points_;
    public boolean requestUpdate_;
    public boolean reverse_;
    public boolean shaderPathBuiltin_;
    public static final StickerMaskInfo DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StickerMaskInfo stickerMaskI = new StickerMaskInfo();
       StickerMaskInfo.DEFAULT_INSTANCE = stickerMaskI;
       GeneratedMessageLite.registerDefaultInstance(StickerMaskInfo.class, stickerMaskI);
    }
    public void StickerMaskInfo(){
       super();
       this.maskPath_ = "";
       this.points_ = GeneratedMessageLite.emptyProtobufList();
       this.maskShaderPath_ = "";
    }
    public static StickerMaskInfo getDefaultInstance(){
       return StickerMaskInfo.DEFAULT_INSTANCE;
    }
    public static StickerMaskInfo$Builder newBuilder(){
       return StickerMaskInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static StickerMaskInfo$Builder newBuilder(StickerMaskInfo p0){
       return StickerMaskInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StickerMaskInfo parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StickerMaskInfo.DEFAULT_INSTANCE, p0);
    }
    public static StickerMaskInfo parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StickerMaskInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StickerMaskInfo parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StickerMaskInfo.DEFAULT_INSTANCE, p0);
    }
    public static StickerMaskInfo parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StickerMaskInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StickerMaskInfo parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StickerMaskInfo.DEFAULT_INSTANCE, p0);
    }
    public static StickerMaskInfo parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StickerMaskInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StickerMaskInfo parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StickerMaskInfo.DEFAULT_INSTANCE, p0);
    }
    public static StickerMaskInfo parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StickerMaskInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StickerMaskInfo parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StickerMaskInfo.DEFAULT_INSTANCE, p0);
    }
    public static StickerMaskInfo parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StickerMaskInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StickerMaskInfo parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StickerMaskInfo.DEFAULT_INSTANCE, p0);
    }
    public static StickerMaskInfo parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StickerMaskInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StickerMaskInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllPoints(Iterable p0){
       this.ensurePointsIsMutable();
       AbstractMessageLite.addAll(p0, this.points_);
    }
    public void addPoints(int p0,FMPoint$Builder p1){
       this.ensurePointsIsMutable();
       this.points_.add(p0, p1.build());
    }
    public void addPoints(int p0,FMPoint p1){
       Objects.requireNonNull(p1);
       this.ensurePointsIsMutable();
       this.points_.add(p0, p1);
    }
    public void addPoints(FMPoint$Builder p0){
       this.ensurePointsIsMutable();
       this.points_.add(p0.build());
    }
    public void addPoints(FMPoint p0){
       Objects.requireNonNull(p0);
       this.ensurePointsIsMutable();
       this.points_.add(p0);
    }
    public void clearDecodeShader(){
       this.decodeShader_ = false;
    }
    public void clearDisableRender(){
       this.disableRender_ = false;
    }
    public void clearIsEdit(){
       this.isEdit_ = false;
    }
    public void clearMaskFeatherRadius(){
       this.maskFeatherRadius_ = 0;
    }
    public void clearMaskPath(){
       this.maskPath_ = StickerMaskInfo.getDefaultInstance().getMaskPath();
    }
    public void clearMaskShaderPath(){
       this.maskShaderPath_ = StickerMaskInfo.getDefaultInstance().getMaskShaderPath();
    }
    public void clearPoints(){
       this.points_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearRequestUpdate(){
       this.requestUpdate_ = false;
    }
    public void clearReverse(){
       this.reverse_ = false;
    }
    public void clearShaderPathBuiltin(){
       this.shaderPathBuiltin_ = false;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (StickerMaskInfo$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new StickerMaskInfo();
           case 2:
             return new StickerMaskInfo$Builder(p2);
           case 3:
             Object[] objArray = new Object[11];
             objArray[0] = "maskPath_";
             objArray[i] = "reverse_";
             objArray[2] = "maskFeatherRadius_";
             objArray[3] = "disableRender_";
             objArray[4] = "points_";
             objArray[5] = FMPoint.class;
             objArray[6] = "maskShaderPath_";
             objArray[7] = "shaderPathBuiltin_";
             objArray[8] = "decodeShader_";
             objArray[9] = "requestUpdate_";
             objArray[10] = "isEdit_";
             return GeneratedMessageLite.newMessageInfo(StickerMaskInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\n\xff\x02\xff\x02\xff\x02\xff\x02\x01\n\n\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\x07\x03\x01\x04\x07\x05\x1b\x06\x02\x02\x07\x07\b\x07\t\x07\n\x07\x00", objArray);
           case 4:
             return StickerMaskInfo.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StickerMaskInfo.PARSER;
             if (pARSER == null) {
                _monitor_enter(StickerMaskInfo.class);
                pARSER = StickerMaskInfo.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StickerMaskInfo.DEFAULT_INSTANCE);
                   StickerMaskInfo.PARSER = pARSER;
                }
                _monitor_exit(StickerMaskInfo.class);
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
    public final void ensurePointsIsMutable(){
       if (!this.points_.isModifiable()) {
          this.points_ = GeneratedMessageLite.mutableCopy(this.points_);
       }
       return;
    }
    public boolean getDecodeShader(){
       return this.decodeShader_;
    }
    public boolean getDisableRender(){
       return this.disableRender_;
    }
    public boolean getIsEdit(){
       return this.isEdit_;
    }
    public float getMaskFeatherRadius(){
       return this.maskFeatherRadius_;
    }
    public String getMaskPath(){
       return this.maskPath_;
    }
    public ByteString getMaskPathBytes(){
       return ByteString.copyFromUtf8(this.maskPath_);
    }
    public String getMaskShaderPath(){
       return this.maskShaderPath_;
    }
    public ByteString getMaskShaderPathBytes(){
       return ByteString.copyFromUtf8(this.maskShaderPath_);
    }
    public FMPoint getPoints(int p0){
       return this.points_.get(p0);
    }
    public int getPointsCount(){
       return this.points_.size();
    }
    public List getPointsList(){
       return this.points_;
    }
    public FMPointOrBuilder getPointsOrBuilder(int p0){
       return this.points_.get(p0);
    }
    public List getPointsOrBuilderList(){
       return this.points_;
    }
    public boolean getRequestUpdate(){
       return this.requestUpdate_;
    }
    public boolean getReverse(){
       return this.reverse_;
    }
    public boolean getShaderPathBuiltin(){
       return this.shaderPathBuiltin_;
    }
    public void removePoints(int p0){
       this.ensurePointsIsMutable();
       this.points_.remove(p0);
    }
    public void setDecodeShader(boolean p0){
       this.decodeShader_ = p0;
    }
    public void setDisableRender(boolean p0){
       this.disableRender_ = p0;
    }
    public void setIsEdit(boolean p0){
       this.isEdit_ = p0;
    }
    public void setMaskFeatherRadius(float p0){
       this.maskFeatherRadius_ = p0;
    }
    public void setMaskPath(String p0){
       Objects.requireNonNull(p0);
       this.maskPath_ = p0;
    }
    public void setMaskPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.maskPath_ = p0.toStringUtf8();
    }
    public void setMaskShaderPath(String p0){
       Objects.requireNonNull(p0);
       this.maskShaderPath_ = p0;
    }
    public void setMaskShaderPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.maskShaderPath_ = p0.toStringUtf8();
    }
    public void setPoints(int p0,FMPoint$Builder p1){
       this.ensurePointsIsMutable();
       this.points_.set(p0, p1.build());
    }
    public void setPoints(int p0,FMPoint p1){
       Objects.requireNonNull(p1);
       this.ensurePointsIsMutable();
       this.points_.set(p0, p1);
    }
    public void setRequestUpdate(boolean p0){
       this.requestUpdate_ = p0;
    }
    public void setReverse(boolean p0){
       this.reverse_ = p0;
    }
    public void setShaderPathBuiltin(boolean p0){
       this.shaderPathBuiltin_ = p0;
    }
}
