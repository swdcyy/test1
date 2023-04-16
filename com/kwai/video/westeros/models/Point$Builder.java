package com.kwai.video.westeros.models.Point$Builder;
import com.kwai.video.westeros.models.PointOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.Point;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.Point$1;

public final class Point$Builder extends GeneratedMessageLite$Builder implements PointOrBuilder	// class@001007
{

    public void Point$Builder(){
       super(Point.DEFAULT_INSTANCE);
    }
    public void Point$Builder(Point$1 p0){
       super();
    }
    public Point$Builder clearX(){
       this.copyOnWrite();
       this.instance.clearX();
       return this;
    }
    public Point$Builder clearY(){
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
    public Point$Builder setX(float p0){
       this.copyOnWrite();
       this.instance.setX(p0);
       return this;
    }
    public Point$Builder setY(float p0){
       this.copyOnWrite();
       this.instance.setY(p0);
       return this;
    }
}
