package com.kwai.video.westeros.models.EffectHint$Builder;
import com.kwai.video.westeros.models.EffectHintOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.EffectHint;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.EffectHint$1;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.EffectHintType;

public final class EffectHint$Builder extends GeneratedMessageLite$Builder implements EffectHintOrBuilder	// class@000f20
{

    public void EffectHint$Builder(){
       super(EffectHint.DEFAULT_INSTANCE);
    }
    public void EffectHint$Builder(EffectHint$1 p0){
       super();
    }
    public EffectHint$Builder clearCoverImage(){
       this.copyOnWrite();
       this.instance.clearCoverImage();
       return this;
    }
    public EffectHint$Builder clearErrorMessage(){
       this.copyOnWrite();
       this.instance.clearErrorMessage();
       return this;
    }
    public EffectHint$Builder clearFaceImageFaceDetected(){
       this.copyOnWrite();
       this.instance.clearFaceImageFaceDetected();
       return this;
    }
    public EffectHint$Builder clearFaceImagePath(){
       this.copyOnWrite();
       this.instance.clearFaceImagePath();
       return this;
    }
    public EffectHint$Builder clearPickMediaPath(){
       this.copyOnWrite();
       this.instance.clearPickMediaPath();
       return this;
    }
    public EffectHint$Builder clearPickMediaResult(){
       this.copyOnWrite();
       this.instance.clearPickMediaResult();
       return this;
    }
    public EffectHint$Builder clearType(){
       this.copyOnWrite();
       this.instance.clearType();
       return this;
    }
    public String getCoverImage(){
       return this.instance.getCoverImage();
    }
    public ByteString getCoverImageBytes(){
       return this.instance.getCoverImageBytes();
    }
    public String getErrorMessage(){
       return this.instance.getErrorMessage();
    }
    public ByteString getErrorMessageBytes(){
       return this.instance.getErrorMessageBytes();
    }
    public boolean getFaceImageFaceDetected(){
       return this.instance.getFaceImageFaceDetected();
    }
    public String getFaceImagePath(){
       return this.instance.getFaceImagePath();
    }
    public ByteString getFaceImagePathBytes(){
       return this.instance.getFaceImagePathBytes();
    }
    public String getPickMediaPath(){
       return this.instance.getPickMediaPath();
    }
    public ByteString getPickMediaPathBytes(){
       return this.instance.getPickMediaPathBytes();
    }
    public boolean getPickMediaResult(){
       return this.instance.getPickMediaResult();
    }
    public EffectHintType getType(){
       return this.instance.getType();
    }
    public int getTypeValue(){
       return this.instance.getTypeValue();
    }
    public EffectHint$Builder setCoverImage(String p0){
       this.copyOnWrite();
       this.instance.setCoverImage(p0);
       return this;
    }
    public EffectHint$Builder setCoverImageBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setCoverImageBytes(p0);
       return this;
    }
    public EffectHint$Builder setErrorMessage(String p0){
       this.copyOnWrite();
       this.instance.setErrorMessage(p0);
       return this;
    }
    public EffectHint$Builder setErrorMessageBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setErrorMessageBytes(p0);
       return this;
    }
    public EffectHint$Builder setFaceImageFaceDetected(boolean p0){
       this.copyOnWrite();
       this.instance.setFaceImageFaceDetected(p0);
       return this;
    }
    public EffectHint$Builder setFaceImagePath(String p0){
       this.copyOnWrite();
       this.instance.setFaceImagePath(p0);
       return this;
    }
    public EffectHint$Builder setFaceImagePathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setFaceImagePathBytes(p0);
       return this;
    }
    public EffectHint$Builder setPickMediaPath(String p0){
       this.copyOnWrite();
       this.instance.setPickMediaPath(p0);
       return this;
    }
    public EffectHint$Builder setPickMediaPathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setPickMediaPathBytes(p0);
       return this;
    }
    public EffectHint$Builder setPickMediaResult(boolean p0){
       this.copyOnWrite();
       this.instance.setPickMediaResult(p0);
       return this;
    }
    public EffectHint$Builder setType(EffectHintType p0){
       this.copyOnWrite();
       this.instance.setType(p0);
       return this;
    }
    public EffectHint$Builder setTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setTypeValue(p0);
       return this;
    }
}
