package com.kwai.video.westeros.models.FaceRect$Builder;
import com.kwai.video.westeros.models.FaceRectOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.FaceRect;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.FaceRect$1;

public final class FaceRect$Builder extends GeneratedMessageLite$Builder implements FaceRectOrBuilder	// class@000f69
{

    public void FaceRect$Builder(){
       super(FaceRect.DEFAULT_INSTANCE);
    }
    public void FaceRect$Builder(FaceRect$1 p0){
       super();
    }
    public FaceRect$Builder clearBottom(){
       this.copyOnWrite();
       this.instance.clearBottom();
       return this;
    }
    public FaceRect$Builder clearLeft(){
       this.copyOnWrite();
       this.instance.clearLeft();
       return this;
    }
    public FaceRect$Builder clearRight(){
       this.copyOnWrite();
       this.instance.clearRight();
       return this;
    }
    public FaceRect$Builder clearTop(){
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
    public FaceRect$Builder setBottom(float p0){
       this.copyOnWrite();
       this.instance.setBottom(p0);
       return this;
    }
    public FaceRect$Builder setLeft(float p0){
       this.copyOnWrite();
       this.instance.setLeft(p0);
       return this;
    }
    public FaceRect$Builder setRight(float p0){
       this.copyOnWrite();
       this.instance.setRight(p0);
       return this;
    }
    public FaceRect$Builder setTop(float p0){
       this.copyOnWrite();
       this.instance.setTop(p0);
       return this;
    }
}
