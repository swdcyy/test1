package com.kwai.video.westeros.models.StickerMaskInfo$Builder;
import com.kwai.video.westeros.models.StickerMaskInfoOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.StickerMaskInfo;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.StickerMaskInfo$1;
import java.lang.Iterable;
import com.kwai.video.westeros.models.FMPoint$Builder;
import com.kwai.video.westeros.models.FMPoint;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.List;
import java.util.Collections;

public final class StickerMaskInfo$Builder extends GeneratedMessageLite$Builder implements StickerMaskInfoOrBuilder	// class@00104a
{

    public void StickerMaskInfo$Builder(){
       super(StickerMaskInfo.DEFAULT_INSTANCE);
    }
    public void StickerMaskInfo$Builder(StickerMaskInfo$1 p0){
       super();
    }
    public StickerMaskInfo$Builder addAllPoints(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllPoints(p0);
       return this;
    }
    public StickerMaskInfo$Builder addPoints(int p0,FMPoint$Builder p1){
       this.copyOnWrite();
       this.instance.addPoints(p0, p1);
       return this;
    }
    public StickerMaskInfo$Builder addPoints(int p0,FMPoint p1){
       this.copyOnWrite();
       this.instance.addPoints(p0, p1);
       return this;
    }
    public StickerMaskInfo$Builder addPoints(FMPoint$Builder p0){
       this.copyOnWrite();
       this.instance.addPoints(p0);
       return this;
    }
    public StickerMaskInfo$Builder addPoints(FMPoint p0){
       this.copyOnWrite();
       this.instance.addPoints(p0);
       return this;
    }
    public StickerMaskInfo$Builder clearDecodeShader(){
       this.copyOnWrite();
       this.instance.clearDecodeShader();
       return this;
    }
    public StickerMaskInfo$Builder clearDisableRender(){
       this.copyOnWrite();
       this.instance.clearDisableRender();
       return this;
    }
    public StickerMaskInfo$Builder clearIsEdit(){
       this.copyOnWrite();
       this.instance.clearIsEdit();
       return this;
    }
    public StickerMaskInfo$Builder clearMaskFeatherRadius(){
       this.copyOnWrite();
       this.instance.clearMaskFeatherRadius();
       return this;
    }
    public StickerMaskInfo$Builder clearMaskPath(){
       this.copyOnWrite();
       this.instance.clearMaskPath();
       return this;
    }
    public StickerMaskInfo$Builder clearMaskShaderPath(){
       this.copyOnWrite();
       this.instance.clearMaskShaderPath();
       return this;
    }
    public StickerMaskInfo$Builder clearPoints(){
       this.copyOnWrite();
       this.instance.clearPoints();
       return this;
    }
    public StickerMaskInfo$Builder clearRequestUpdate(){
       this.copyOnWrite();
       this.instance.clearRequestUpdate();
       return this;
    }
    public StickerMaskInfo$Builder clearReverse(){
       this.copyOnWrite();
       this.instance.clearReverse();
       return this;
    }
    public StickerMaskInfo$Builder clearShaderPathBuiltin(){
       this.copyOnWrite();
       this.instance.clearShaderPathBuiltin();
       return this;
    }
    public boolean getDecodeShader(){
       return this.instance.getDecodeShader();
    }
    public boolean getDisableRender(){
       return this.instance.getDisableRender();
    }
    public boolean getIsEdit(){
       return this.instance.getIsEdit();
    }
    public float getMaskFeatherRadius(){
       return this.instance.getMaskFeatherRadius();
    }
    public String getMaskPath(){
       return this.instance.getMaskPath();
    }
    public ByteString getMaskPathBytes(){
       return this.instance.getMaskPathBytes();
    }
    public String getMaskShaderPath(){
       return this.instance.getMaskShaderPath();
    }
    public ByteString getMaskShaderPathBytes(){
       return this.instance.getMaskShaderPathBytes();
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
    public boolean getRequestUpdate(){
       return this.instance.getRequestUpdate();
    }
    public boolean getReverse(){
       return this.instance.getReverse();
    }
    public boolean getShaderPathBuiltin(){
       return this.instance.getShaderPathBuiltin();
    }
    public StickerMaskInfo$Builder removePoints(int p0){
       this.copyOnWrite();
       this.instance.removePoints(p0);
       return this;
    }
    public StickerMaskInfo$Builder setDecodeShader(boolean p0){
       this.copyOnWrite();
       this.instance.setDecodeShader(p0);
       return this;
    }
    public StickerMaskInfo$Builder setDisableRender(boolean p0){
       this.copyOnWrite();
       this.instance.setDisableRender(p0);
       return this;
    }
    public StickerMaskInfo$Builder setIsEdit(boolean p0){
       this.copyOnWrite();
       this.instance.setIsEdit(p0);
       return this;
    }
    public StickerMaskInfo$Builder setMaskFeatherRadius(float p0){
       this.copyOnWrite();
       this.instance.setMaskFeatherRadius(p0);
       return this;
    }
    public StickerMaskInfo$Builder setMaskPath(String p0){
       this.copyOnWrite();
       this.instance.setMaskPath(p0);
       return this;
    }
    public StickerMaskInfo$Builder setMaskPathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setMaskPathBytes(p0);
       return this;
    }
    public StickerMaskInfo$Builder setMaskShaderPath(String p0){
       this.copyOnWrite();
       this.instance.setMaskShaderPath(p0);
       return this;
    }
    public StickerMaskInfo$Builder setMaskShaderPathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setMaskShaderPathBytes(p0);
       return this;
    }
    public StickerMaskInfo$Builder setPoints(int p0,FMPoint$Builder p1){
       this.copyOnWrite();
       this.instance.setPoints(p0, p1);
       return this;
    }
    public StickerMaskInfo$Builder setPoints(int p0,FMPoint p1){
       this.copyOnWrite();
       this.instance.setPoints(p0, p1);
       return this;
    }
    public StickerMaskInfo$Builder setRequestUpdate(boolean p0){
       this.copyOnWrite();
       this.instance.setRequestUpdate(p0);
       return this;
    }
    public StickerMaskInfo$Builder setReverse(boolean p0){
       this.copyOnWrite();
       this.instance.setReverse(p0);
       return this;
    }
    public StickerMaskInfo$Builder setShaderPathBuiltin(boolean p0){
       this.copyOnWrite();
       this.instance.setShaderPathBuiltin(p0);
       return this;
    }
}
