package com.kwai.video.westeros.models.YCNNRect$Builder;
import com.kwai.video.westeros.models.YCNNRectOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.YCNNRect;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.YCNNRect$1;

public final class YCNNRect$Builder extends GeneratedMessageLite$Builder implements YCNNRectOrBuilder	// class@00109d
{

    public void YCNNRect$Builder(){
       super(YCNNRect.DEFAULT_INSTANCE);
    }
    public void YCNNRect$Builder(YCNNRect$1 p0){
       super();
    }
    public YCNNRect$Builder clearBottom(){
       this.copyOnWrite();
       this.instance.clearBottom();
       return this;
    }
    public YCNNRect$Builder clearLeft(){
       this.copyOnWrite();
       this.instance.clearLeft();
       return this;
    }
    public YCNNRect$Builder clearRight(){
       this.copyOnWrite();
       this.instance.clearRight();
       return this;
    }
    public YCNNRect$Builder clearTop(){
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
    public YCNNRect$Builder setBottom(float p0){
       this.copyOnWrite();
       this.instance.setBottom(p0);
       return this;
    }
    public YCNNRect$Builder setLeft(float p0){
       this.copyOnWrite();
       this.instance.setLeft(p0);
       return this;
    }
    public YCNNRect$Builder setRight(float p0){
       this.copyOnWrite();
       this.instance.setRight(p0);
       return this;
    }
    public YCNNRect$Builder setTop(float p0){
       this.copyOnWrite();
       this.instance.setTop(p0);
       return this;
    }
}
