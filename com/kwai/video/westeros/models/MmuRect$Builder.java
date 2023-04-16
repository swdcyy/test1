package com.kwai.video.westeros.models.MmuRect$Builder;
import com.kwai.video.westeros.models.MmuRectOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.MmuRect;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.MmuRect$1;

public final class MmuRect$Builder extends GeneratedMessageLite$Builder implements MmuRectOrBuilder	// class@000fdd
{

    public void MmuRect$Builder(){
       super(MmuRect.DEFAULT_INSTANCE);
    }
    public void MmuRect$Builder(MmuRect$1 p0){
       super();
    }
    public MmuRect$Builder clearBottom(){
       this.copyOnWrite();
       this.instance.clearBottom();
       return this;
    }
    public MmuRect$Builder clearLeft(){
       this.copyOnWrite();
       this.instance.clearLeft();
       return this;
    }
    public MmuRect$Builder clearRight(){
       this.copyOnWrite();
       this.instance.clearRight();
       return this;
    }
    public MmuRect$Builder clearTop(){
       this.copyOnWrite();
       this.instance.clearTop();
       return this;
    }
    public float getBottom(){
       return this.instance.getBottom();
    }
    public float getLeft(){
       return this.instance.getLeft();
    }
    public float getRight(){
       return this.instance.getRight();
    }
    public float getTop(){
       return this.instance.getTop();
    }
    public MmuRect$Builder setBottom(float p0){
       this.copyOnWrite();
       this.instance.setBottom(p0);
       return this;
    }
    public MmuRect$Builder setLeft(float p0){
       this.copyOnWrite();
       this.instance.setLeft(p0);
       return this;
    }
    public MmuRect$Builder setRight(float p0){
       this.copyOnWrite();
       this.instance.setRight(p0);
       return this;
    }
    public MmuRect$Builder setTop(float p0){
       this.copyOnWrite();
       this.instance.setTop(p0);
       return this;
    }
}
