package com.kwai.video.westeros.models.StickerInfo$Builder;
import com.kwai.video.westeros.models.StickerInfoOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.StickerInfo;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.StickerInfo$1;
import java.lang.Iterable;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.FMPoint$Builder;
import com.kwai.video.westeros.models.FMPoint;
import java.util.List;
import java.util.Collections;
import com.kwai.video.westeros.models.StickerMaskInfo;
import com.kwai.video.westeros.models.StickerMaskInfo$Builder;

public final class StickerInfo$Builder extends GeneratedMessageLite$Builder implements StickerInfoOrBuilder	// class@001046
{

    public void StickerInfo$Builder(){
       super(StickerInfo.DEFAULT_INSTANCE);
    }
    public void StickerInfo$Builder(StickerInfo$1 p0){
       super();
    }
    public StickerInfo$Builder addAllFramePaths(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllFramePaths(p0);
       return this;
    }
    public StickerInfo$Builder addAllPoints(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllPoints(p0);
       return this;
    }
    public StickerInfo$Builder addFramePaths(String p0){
       this.copyOnWrite();
       this.instance.addFramePaths(p0);
       return this;
    }
    public StickerInfo$Builder addFramePathsBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.addFramePathsBytes(p0);
       return this;
    }
    public StickerInfo$Builder addPoints(int p0,FMPoint$Builder p1){
       this.copyOnWrite();
       this.instance.addPoints(p0, p1);
       return this;
    }
    public StickerInfo$Builder addPoints(int p0,FMPoint p1){
       this.copyOnWrite();
       this.instance.addPoints(p0, p1);
       return this;
    }
    public StickerInfo$Builder addPoints(FMPoint$Builder p0){
       this.copyOnWrite();
       this.instance.addPoints(p0);
       return this;
    }
    public StickerInfo$Builder addPoints(FMPoint p0){
       this.copyOnWrite();
       this.instance.addPoints(p0);
       return this;
    }
    public StickerInfo$Builder clearAlpha(){
       this.copyOnWrite();
       this.instance.clearAlpha();
       return this;
    }
    public StickerInfo$Builder clearAlphaEnable(){
       this.copyOnWrite();
       this.instance.clearAlphaEnable();
       return this;
    }
    public StickerInfo$Builder clearAnimFrameFps(){
       this.copyOnWrite();
       this.instance.clearAnimFrameFps();
       return this;
    }
    public StickerInfo$Builder clearBlendMode(){
       this.copyOnWrite();
       this.instance.clearBlendMode();
       return this;
    }
    public StickerInfo$Builder clearBlendName(){
       this.copyOnWrite();
       this.instance.clearBlendName();
       return this;
    }
    public StickerInfo$Builder clearEnableFrameAnim(){
       this.copyOnWrite();
       this.instance.clearEnableFrameAnim();
       return this;
    }
    public StickerInfo$Builder clearFlipX(){
       this.copyOnWrite();
       this.instance.clearFlipX();
       return this;
    }
    public StickerInfo$Builder clearFlipY(){
       this.copyOnWrite();
       this.instance.clearFlipY();
       return this;
    }
    public StickerInfo$Builder clearFramePaths(){
       this.copyOnWrite();
       this.instance.clearFramePaths();
       return this;
    }
    public StickerInfo$Builder clearLoadImgFromCb(){
       this.copyOnWrite();
       this.instance.clearLoadImgFromCb();
       return this;
    }
    public StickerInfo$Builder clearMaskInfo(){
       this.copyOnWrite();
       this.instance.clearMaskInfo();
       return this;
    }
    public StickerInfo$Builder clearPath(){
       this.copyOnWrite();
       this.instance.clearPath();
       return this;
    }
    public StickerInfo$Builder clearPoints(){
       this.copyOnWrite();
       this.instance.clearPoints();
       return this;
    }
    public StickerInfo$Builder clearRequireUpateImg(){
       this.copyOnWrite();
       this.instance.clearRequireUpateImg();
       return this;
    }
    public StickerInfo$Builder clearStickerId(){
       this.copyOnWrite();
       this.instance.clearStickerId();
       return this;
    }
    public float getAlpha(){
       return this.instance.getAlpha();
    }
    public boolean getAlphaEnable(){
       return this.instance.getAlphaEnable();
    }
    public float getAnimFrameFps(){
       return this.instance.getAnimFrameFps();
    }
    public int getBlendMode(){
       return this.instance.getBlendMode();
    }
    public String getBlendName(){
       return this.instance.getBlendName();
    }
    public ByteString getBlendNameBytes(){
       return this.instance.getBlendNameBytes();
    }
    public boolean getEnableFrameAnim(){
       return this.instance.getEnableFrameAnim();
    }
    public boolean getFlipX(){
       return this.instance.getFlipX();
    }
    public boolean getFlipY(){
       return this.instance.getFlipY();
    }
    public String getFramePaths(int p0){
       return this.instance.getFramePaths(p0);
    }
    public ByteString getFramePathsBytes(int p0){
       return this.instance.getFramePathsBytes(p0);
    }
    public int getFramePathsCount(){
       return this.instance.getFramePathsCount();
    }
    public List getFramePathsList(){
       return Collections.unmodifiableList(this.instance.getFramePathsList());
    }
    public boolean getLoadImgFromCb(){
       return this.instance.getLoadImgFromCb();
    }
    public StickerMaskInfo getMaskInfo(){
       return this.instance.getMaskInfo();
    }
    public String getPath(){
       return this.instance.getPath();
    }
    public ByteString getPathBytes(){
       return this.instance.getPathBytes();
    }
    public FMPoint getPoints(int p0){
       return this.instance.getPoints(p0);
    }
    public int getPointsCount(){
       return this.instance.getPointsCount();
    }
    public List getPointsList(){
       return Collections.unmodifiableList(this.instance.getPointsList());
    }
    public boolean getRequireUpateImg(){
       return this.instance.getRequireUpateImg();
    }
    public String getStickerId(){
       return this.instance.getStickerId();
    }
    public ByteString getStickerIdBytes(){
       return this.instance.getStickerIdBytes();
    }
    public boolean hasMaskInfo(){
       return this.instance.hasMaskInfo();
    }
    public StickerInfo$Builder mergeMaskInfo(StickerMaskInfo p0){
       this.copyOnWrite();
       this.instance.mergeMaskInfo(p0);
       return this;
    }
    public StickerInfo$Builder removePoints(int p0){
       this.copyOnWrite();
       this.instance.removePoints(p0);
       return this;
    }
    public StickerInfo$Builder setAlpha(float p0){
       this.copyOnWrite();
       this.instance.setAlpha(p0);
       return this;
    }
    public StickerInfo$Builder setAlphaEnable(boolean p0){
       this.copyOnWrite();
       this.instance.setAlphaEnable(p0);
       return this;
    }
    public StickerInfo$Builder setAnimFrameFps(float p0){
       this.copyOnWrite();
       this.instance.setAnimFrameFps(p0);
       return this;
    }
    public StickerInfo$Builder setBlendMode(int p0){
       this.copyOnWrite();
       this.instance.setBlendMode(p0);
       return this;
    }
    public StickerInfo$Builder setBlendName(String p0){
       this.copyOnWrite();
       this.instance.setBlendName(p0);
       return this;
    }
    public StickerInfo$Builder setBlendNameBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setBlendNameBytes(p0);
       return this;
    }
    public StickerInfo$Builder setEnableFrameAnim(boolean p0){
       this.copyOnWrite();
       this.instance.setEnableFrameAnim(p0);
       return this;
    }
    public StickerInfo$Builder setFlipX(boolean p0){
       this.copyOnWrite();
       this.instance.setFlipX(p0);
       return this;
    }
    public StickerInfo$Builder setFlipY(boolean p0){
       this.copyOnWrite();
       this.instance.setFlipY(p0);
       return this;
    }
    public StickerInfo$Builder setFramePaths(int p0,String p1){
       this.copyOnWrite();
       this.instance.setFramePaths(p0, p1);
       return this;
    }
    public StickerInfo$Builder setLoadImgFromCb(boolean p0){
       this.copyOnWrite();
       this.instance.setLoadImgFromCb(p0);
       return this;
    }
    public StickerInfo$Builder setMaskInfo(StickerMaskInfo$Builder p0){
       this.copyOnWrite();
       this.instance.setMaskInfo(p0);
       return this;
    }
    public StickerInfo$Builder setMaskInfo(StickerMaskInfo p0){
       this.copyOnWrite();
       this.instance.setMaskInfo(p0);
       return this;
    }
    public StickerInfo$Builder setPath(String p0){
       this.copyOnWrite();
       this.instance.setPath(p0);
       return this;
    }
    public StickerInfo$Builder setPathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setPathBytes(p0);
       return this;
    }
    public StickerInfo$Builder setPoints(int p0,FMPoint$Builder p1){
       this.copyOnWrite();
       this.instance.setPoints(p0, p1);
       return this;
    }
    public StickerInfo$Builder setPoints(int p0,FMPoint p1){
       this.copyOnWrite();
       this.instance.setPoints(p0, p1);
       return this;
    }
    public StickerInfo$Builder setRequireUpateImg(boolean p0){
       this.copyOnWrite();
       this.instance.setRequireUpateImg(p0);
       return this;
    }
    public StickerInfo$Builder setStickerId(String p0){
       this.copyOnWrite();
       this.instance.setStickerId(p0);
       return this;
    }
    public StickerInfo$Builder setStickerIdBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setStickerIdBytes(p0);
       return this;
    }
}
