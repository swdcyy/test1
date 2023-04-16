package com.kwai.video.westeros.models.Point2d$Builder;
import com.kwai.video.westeros.models.Point2dOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.Point2d;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.Point2d$1;

public final class Point2d$Builder extends GeneratedMessageLite$Builder implements Point2dOrBuilder	// class@001009
{

    public void Point2d$Builder(){
       super(Point2d.DEFAULT_INSTANCE);
    }
    public void Point2d$Builder(Point2d$1 p0){
       super();
    }
    public Point2d$Builder clearX(){
       this.copyOnWrite();
       this.instance.clearX();
       return this;
    }
    public Point2d$Builder clearY(){
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
    public Point2d$Builder setX(float p0){
       this.copyOnWrite();
       this.instance.setX(p0);
       return this;
    }
    public Point2d$Builder setY(float p0){
       this.copyOnWrite();
       this.instance.setY(p0);
       return this;
    }
}
