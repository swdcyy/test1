package com.kwai.video.westeros.models.YCNNFace$Builder;
import com.kwai.video.westeros.models.YCNNFaceOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.YCNNFace;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.YCNNFace$1;
import java.lang.Iterable;
import com.kwai.video.westeros.models.YCNNPoint$Builder;
import com.kwai.video.westeros.models.YCNNPoint;
import java.util.List;
import java.util.Collections;
import com.kwai.video.westeros.models.YCNNRect;
import com.kwai.video.westeros.models.YCNNRect$Builder;

public final class YCNNFace$Builder extends GeneratedMessageLite$Builder implements YCNNFaceOrBuilder	// class@00108d
{

    public void YCNNFace$Builder(){
       super(YCNNFace.DEFAULT_INSTANCE);
    }
    public void YCNNFace$Builder(YCNNFace$1 p0){
       super();
    }
    public YCNNFace$Builder addAllPoints(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllPoints(p0);
       return this;
    }
    public YCNNFace$Builder addPoints(int p0,YCNNPoint$Builder p1){
       this.copyOnWrite();
       this.instance.addPoints(p0, p1);
       return this;
    }
    public YCNNFace$Builder addPoints(int p0,YCNNPoint p1){
       this.copyOnWrite();
       this.instance.addPoints(p0, p1);
       return this;
    }
    public YCNNFace$Builder addPoints(YCNNPoint$Builder p0){
       this.copyOnWrite();
       this.instance.addPoints(p0);
       return this;
    }
    public YCNNFace$Builder addPoints(YCNNPoint p0){
       this.copyOnWrite();
       this.instance.addPoints(p0);
       return this;
    }
    public YCNNFace$Builder clearPitch(){
       this.copyOnWrite();
       this.instance.clearPitch();
       return this;
    }
    public YCNNFace$Builder clearPoints(){
       this.copyOnWrite();
       this.instance.clearPoints();
       return this;
    }
    public YCNNFace$Builder clearRect(){
       this.copyOnWrite();
       this.instance.clearRect();
       return this;
    }
    public YCNNFace$Builder clearRoll(){
       this.copyOnWrite();
       this.instance.clearRoll();
       return this;
    }
    public YCNNFace$Builder clearYaw(){
       this.copyOnWrite();
       this.instance.clearYaw();
       return this;
    }
    public float getPitch(){
       return this.instance.getPitch();
    }
    public YCNNPoint getPoints(int p0){
       return this.instance.getPoints(p0);
    }
    public int getPointsCount(){
       return this.instance.getPointsCount();
    }
    public List getPointsList(){
       return Collections.unmodifiableList(this.instance.getPointsList());
    }
    public YCNNRect getRect(){
       return this.instance.getRect();
    }
    public float getRoll(){
       return this.instance.getRoll();
    }
    public float getYaw(){
       return this.instance.getYaw();
    }
    public boolean hasRect(){
       return this.instance.hasRect();
    }
    public YCNNFace$Builder mergeRect(YCNNRect p0){
       this.copyOnWrite();
       this.instance.mergeRect(p0);
       return this;
    }
    public YCNNFace$Builder removePoints(int p0){
       this.copyOnWrite();
       this.instance.removePoints(p0);
       return this;
    }
    public YCNNFace$Builder setPitch(float p0){
       this.copyOnWrite();
       this.instance.setPitch(p0);
       return this;
    }
    public YCNNFace$Builder setPoints(int p0,YCNNPoint$Builder p1){
       this.copyOnWrite();
       this.instance.setPoints(p0, p1);
       return this;
    }
    public YCNNFace$Builder setPoints(int p0,YCNNPoint p1){
       this.copyOnWrite();
       this.instance.setPoints(p0, p1);
       return this;
    }
    public YCNNFace$Builder setRect(YCNNRect$Builder p0){
       this.copyOnWrite();
       this.instance.setRect(p0);
       return this;
    }
    public YCNNFace$Builder setRect(YCNNRect p0){
       this.copyOnWrite();
       this.instance.setRect(p0);
       return this;
    }
    public YCNNFace$Builder setRoll(float p0){
       this.copyOnWrite();
       this.instance.setRoll(p0);
       return this;
    }
    public YCNNFace$Builder setYaw(float p0){
       this.copyOnWrite();
       this.instance.setYaw(p0);
       return this;
    }
}
