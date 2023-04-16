package com.kwai.video.westeros.models.YCNNPoint$Builder;
import com.kwai.video.westeros.models.YCNNPointOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.YCNNPoint;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.YCNNPoint$1;

public final class YCNNPoint$Builder extends GeneratedMessageLite$Builder implements YCNNPointOrBuilder	// class@001099
{

    public void YCNNPoint$Builder(){
       super(YCNNPoint.DEFAULT_INSTANCE);
    }
    public void YCNNPoint$Builder(YCNNPoint$1 p0){
       super();
    }
    public YCNNPoint$Builder clearX(){
       this.copyOnWrite();
       this.instance.clearX();
       return this;
    }
    public YCNNPoint$Builder clearY(){
       this.copyOnWrite();
       this.instance.clearY();
       return this;
    }
    public float getX(){
       return this.instance.getX();
    }
    public float getY(){
       return this.instance.getY();
    }
    public YCNNPoint$Builder setX(float p0){
       this.copyOnWrite();
       this.instance.setX(p0);
       return this;
    }
    public YCNNPoint$Builder setY(float p0){
       this.copyOnWrite();
       this.instance.setY(p0);
       return this;
    }
}
