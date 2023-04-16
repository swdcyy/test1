package com.kwai.video.westeros.models.MmuFace$Builder;
import com.kwai.video.westeros.models.MmuFaceOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.MmuFace;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.MmuFace$1;
import java.lang.Iterable;
import com.kwai.video.westeros.models.MmuPoint$Builder;
import com.kwai.video.westeros.models.MmuPoint;
import java.util.List;
import java.util.Collections;
import com.kwai.video.westeros.models.MmuRect;
import com.kwai.video.westeros.models.MmuRect$Builder;

public final class MmuFace$Builder extends GeneratedMessageLite$Builder implements MmuFaceOrBuilder	// class@000fbe
{

    public void MmuFace$Builder(){
       super(MmuFace.DEFAULT_INSTANCE);
    }
    public void MmuFace$Builder(MmuFace$1 p0){
       super();
    }
    public MmuFace$Builder addAllPoints(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllPoints(p0);
       return this;
    }
    public MmuFace$Builder addPoints(int p0,MmuPoint$Builder p1){
       this.copyOnWrite();
       this.instance.addPoints(p0, p1);
       return this;
    }
    public MmuFace$Builder addPoints(int p0,MmuPoint p1){
       this.copyOnWrite();
       this.instance.addPoints(p0, p1);
       return this;
    }
    public MmuFace$Builder addPoints(MmuPoint$Builder p0){
       this.copyOnWrite();
       this.instance.addPoints(p0);
       return this;
    }
    public MmuFace$Builder addPoints(MmuPoint p0){
       this.copyOnWrite();
       this.instance.addPoints(p0);
       return this;
    }
    public MmuFace$Builder clearPitch(){
       this.copyOnWrite();
       this.instance.clearPitch();
       return this;
    }
    public MmuFace$Builder clearPoints(){
       this.copyOnWrite();
       this.instance.clearPoints();
       return this;
    }
    public MmuFace$Builder clearRect(){
       this.copyOnWrite();
       this.instance.clearRect();
       return this;
    }
    public MmuFace$Builder clearRoll(){
       this.copyOnWrite();
       this.instance.clearRoll();
       return this;
    }
    public MmuFace$Builder clearYaw(){
       this.copyOnWrite();
       this.instance.clearYaw();
       return this;
    }
    public float getPitch(){
       return this.instance.getPitch();
    }
    public MmuPoint getPoints(int p0){
       return this.instance.getPoints(p0);
    }
    public int getPointsCount(){
       return this.instance.getPointsCount();
    }
    public List getPointsList(){
       return Collections.unmodifiableList(this.instance.getPointsList());
    }
    public MmuRect getRect(){
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
    public MmuFace$Builder mergeRect(MmuRect p0){
       this.copyOnWrite();
       this.instance.mergeRect(p0);
       return this;
    }
    public MmuFace$Builder removePoints(int p0){
       this.copyOnWrite();
       this.instance.removePoints(p0);
       return this;
    }
    public MmuFace$Builder setPitch(float p0){
       this.copyOnWrite();
       this.instance.setPitch(p0);
       return this;
    }
    public MmuFace$Builder setPoints(int p0,MmuPoint$Builder p1){
       this.copyOnWrite();
       this.instance.setPoints(p0, p1);
       return this;
    }
    public MmuFace$Builder setPoints(int p0,MmuPoint p1){
       this.copyOnWrite();
       this.instance.setPoints(p0, p1);
       return this;
    }
    public MmuFace$Builder setRect(MmuRect$Builder p0){
       this.copyOnWrite();
       this.instance.setRect(p0);
       return this;
    }
    public MmuFace$Builder setRect(MmuRect p0){
       this.copyOnWrite();
       this.instance.setRect(p0);
       return this;
    }
    public MmuFace$Builder setRoll(float p0){
       this.copyOnWrite();
       this.instance.setRoll(p0);
       return this;
    }
    public MmuFace$Builder setYaw(float p0){
       this.copyOnWrite();
       this.instance.setYaw(p0);
       return this;
    }
}
