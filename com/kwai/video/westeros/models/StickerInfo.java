package com.kwai.video.westeros.models.StickerInfo;
import com.kwai.video.westeros.models.StickerInfoOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.StickerInfo$Builder;
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
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.kwai.video.westeros.models.FMPoint$Builder;
import com.kwai.video.westeros.models.FMPoint;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.StickerInfo$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kwai.video.westeros.models.StickerMaskInfo;
import com.kwai.video.westeros.models.FMPointOrBuilder;
import com.kwai.video.westeros.models.StickerMaskInfo$Builder;

public final class StickerInfo extends GeneratedMessageLite implements StickerInfoOrBuilder	// class@001047
{
    public boolean alphaEnable_;
    public float alpha_;
    public float animFrameFps_;
    public int blendMode_;
    public String blendName_;
    public boolean enableFrameAnim_;
    public boolean flipX_;
    public boolean flipY_;
    public Internal$ProtobufList framePaths_;
    public boolean loadImgFromCb_;
    public StickerMaskInfo maskInfo_;
    public String path_;
    public Internal$ProtobufList points_;
    public boolean requireUpateImg_;
    public String stickerId_;
    public static final StickerInfo DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StickerInfo stickerInfo = new StickerInfo();
       StickerInfo.DEFAULT_INSTANCE = stickerInfo;
       GeneratedMessageLite.registerDefaultInstance(StickerInfo.class, stickerInfo);
    }
    public void StickerInfo(){
       super();
       this.stickerId_ = "";
       this.path_ = "";
       this.framePaths_ = GeneratedMessageLite.emptyProtobufList();
       this.blendName_ = "";
       this.points_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static StickerInfo getDefaultInstance(){
       return StickerInfo.DEFAULT_INSTANCE;
    }
    public static StickerInfo$Builder newBuilder(){
       return StickerInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static StickerInfo$Builder newBuilder(StickerInfo p0){
       return StickerInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StickerInfo parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StickerInfo.DEFAULT_INSTANCE, p0);
    }
    public static StickerInfo parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StickerInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StickerInfo parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StickerInfo.DEFAULT_INSTANCE, p0);
    }
    public static StickerInfo parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StickerInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StickerInfo parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StickerInfo.DEFAULT_INSTANCE, p0);
    }
    public static StickerInfo parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StickerInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StickerInfo parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StickerInfo.DEFAULT_INSTANCE, p0);
    }
    public static StickerInfo parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StickerInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StickerInfo parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StickerInfo.DEFAULT_INSTANCE, p0);
    }
    public static StickerInfo parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StickerInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StickerInfo parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StickerInfo.DEFAULT_INSTANCE, p0);
    }
    public static StickerInfo parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StickerInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StickerInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllFramePaths(Iterable p0){
       this.ensureFramePathsIsMutable();
       AbstractMessageLite.addAll(p0, this.framePaths_);
    }
    public void addAllPoints(Iterable p0){
       this.ensurePointsIsMutable();
       AbstractMessageLite.addAll(p0, this.points_);
    }
    public void addFramePaths(String p0){
       Objects.requireNonNull(p0);
       this.ensureFramePathsIsMutable();
       this.framePaths_.add(p0);
    }
    public void addFramePathsBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureFramePathsIsMutable();
       this.framePaths_.add(p0.toStringUtf8());
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
    public void clearAlpha(){
       this.alpha_ = 0;
    }
    public void clearAlphaEnable(){
       this.alphaEnable_ = false;
    }
    public void clearAnimFrameFps(){
       this.animFrameFps_ = 0;
    }
    public void clearBlendMode(){
       this.blendMode_ = 0;
    }
    public void clearBlendName(){
       this.blendName_ = StickerInfo.getDefaultInstance().getBlendName();
    }
    public void clearEnableFrameAnim(){
       this.enableFrameAnim_ = false;
    }
    public void clearFlipX(){
       this.flipX_ = false;
    }
    public void clearFlipY(){
       this.flipY_ = false;
    }
    public void clearFramePaths(){
       this.framePaths_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearLoadImgFromCb(){
       this.loadImgFromCb_ = false;
    }
    public void clearMaskInfo(){
       this.maskInfo_ = null;
    }
    public void clearPath(){
       this.path_ = StickerInfo.getDefaultInstance().getPath();
    }
    public void clearPoints(){
       this.points_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearRequireUpateImg(){
       this.requireUpateImg_ = false;
    }
    public void clearStickerId(){
       this.stickerId_ = StickerInfo.getDefaultInstance().getStickerId();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (StickerInfo$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new StickerInfo();
           case 2:
             return new StickerInfo$Builder(p2);
           case 3:
             Object[] objArray = new Object[16];
             objArray[0] = "stickerId_";
             objArray[i] = "path_";
             objArray[2] = "framePaths_";
             objArray[3] = "blendMode_";
             objArray[4] = "blendName_";
             objArray[5] = "alphaEnable_";
             objArray[6] = "points_";
             objArray[7] = FMPoint.class;
             objArray[8] = "alpha_";
             objArray[9] = "enableFrameAnim_";
             objArray[10] = "requireUpateImg_";
             objArray[11] = "loadImgFromCb_";
             objArray[12] = "animFrameFps_";
             objArray[13] = "maskInfo_";
             objArray[14] = "flipX_";
             objArray[15] = "flipY_";
             return GeneratedMessageLite.newMessageInfo(StickerInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x0f\xff\x02\xff\x02\xff\x02\xff\x02\x01\x0f\x0f\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x04\x05\x02\x02\x06\x07\x07\x1b\b\x01\t\x07\n\x07\x0b\x07\f\x01\r\t\x0e\x07\x0f\x07\x00", objArray);
           case 4:
             return StickerInfo.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StickerInfo.PARSER;
             if (pARSER == null) {
                _monitor_enter(StickerInfo.class);
                pARSER = StickerInfo.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StickerInfo.DEFAULT_INSTANCE);
                   StickerInfo.PARSER = pARSER;
                }
                _monitor_exit(StickerInfo.class);
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
    public final void ensureFramePathsIsMutable(){
       if (!this.framePaths_.isModifiable()) {
          this.framePaths_ = GeneratedMessageLite.mutableCopy(this.framePaths_);
       }
       return;
    }
    public final void ensurePointsIsMutable(){
       if (!this.points_.isModifiable()) {
          this.points_ = GeneratedMessageLite.mutableCopy(this.points_);
       }
       return;
    }
    public float getAlpha(){
       return this.alpha_;
    }
    public boolean getAlphaEnable(){
       return this.alphaEnable_;
    }
    public float getAnimFrameFps(){
       return this.animFrameFps_;
    }
    public int getBlendMode(){
       return this.blendMode_;
    }
    public String getBlendName(){
       return this.blendName_;
    }
    public ByteString getBlendNameBytes(){
       return ByteString.copyFromUtf8(this.blendName_);
    }
    public boolean getEnableFrameAnim(){
       return this.enableFrameAnim_;
    }
    public boolean getFlipX(){
       return this.flipX_;
    }
    public boolean getFlipY(){
       return this.flipY_;
    }
    public String getFramePaths(int p0){
       return this.framePaths_.get(p0);
    }
    public ByteString getFramePathsBytes(int p0){
       return ByteString.copyFromUtf8(this.framePaths_.get(p0));
    }
    public int getFramePathsCount(){
       return this.framePaths_.size();
    }
    public List getFramePathsList(){
       return this.framePaths_;
    }
    public boolean getLoadImgFromCb(){
       return this.loadImgFromCb_;
    }
    public StickerMaskInfo getMaskInfo(){
       StickerInfo tmaskInfo_ = this.maskInfo_;
       if (tmaskInfo_ == null) {
          tmaskInfo_ = StickerMaskInfo.getDefaultInstance();
       }
       return tmaskInfo_;
    }
    public String getPath(){
       return this.path_;
    }
    public ByteString getPathBytes(){
       return ByteString.copyFromUtf8(this.path_);
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
    public boolean getRequireUpateImg(){
       return this.requireUpateImg_;
    }
    public String getStickerId(){
       return this.stickerId_;
    }
    public ByteString getStickerIdBytes(){
       return ByteString.copyFromUtf8(this.stickerId_);
    }
    public boolean hasMaskInfo(){
       boolean b = (this.maskInfo_ != null)? true: false;
       return b;
    }
    public void mergeMaskInfo(StickerMaskInfo p0){
       Objects.requireNonNull(p0);
       StickerInfo tmaskInfo_ = this.maskInfo_;
       this.maskInfo_ = (tmaskInfo_ != null && tmaskInfo_ != StickerMaskInfo.getDefaultInstance())? StickerMaskInfo.newBuilder(this.maskInfo_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void removePoints(int p0){
       this.ensurePointsIsMutable();
       this.points_.remove(p0);
    }
    public void setAlpha(float p0){
       this.alpha_ = p0;
    }
    public void setAlphaEnable(boolean p0){
       this.alphaEnable_ = p0;
    }
    public void setAnimFrameFps(float p0){
       this.animFrameFps_ = p0;
    }
    public void setBlendMode(int p0){
       this.blendMode_ = p0;
    }
    public void setBlendName(String p0){
       Objects.requireNonNull(p0);
       this.blendName_ = p0;
    }
    public void setBlendNameBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.blendName_ = p0.toStringUtf8();
    }
    public void setEnableFrameAnim(boolean p0){
       this.enableFrameAnim_ = p0;
    }
    public void setFlipX(boolean p0){
       this.flipX_ = p0;
    }
    public void setFlipY(boolean p0){
       this.flipY_ = p0;
    }
    public void setFramePaths(int p0,String p1){
       Objects.requireNonNull(p1);
       this.ensureFramePathsIsMutable();
       this.framePaths_.set(p0, p1);
    }
    public void setLoadImgFromCb(boolean p0){
       this.loadImgFromCb_ = p0;
    }
    public void setMaskInfo(StickerMaskInfo$Builder p0){
       this.maskInfo_ = p0.build();
    }
    public void setMaskInfo(StickerMaskInfo p0){
       Objects.requireNonNull(p0);
       this.maskInfo_ = p0;
    }
    public void setPath(String p0){
       Objects.requireNonNull(p0);
       this.path_ = p0;
    }
    public void setPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.path_ = p0.toStringUtf8();
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
    public void setRequireUpateImg(boolean p0){
       this.requireUpateImg_ = p0;
    }
    public void setStickerId(String p0){
       Objects.requireNonNull(p0);
       this.stickerId_ = p0;
    }
    public void setStickerIdBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.stickerId_ = p0.toStringUtf8();
    }
}
