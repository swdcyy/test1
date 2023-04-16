package com.kwai.video.westeros.models.FMPoint$Builder;
import com.kwai.video.westeros.models.FMPointOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.FMPoint;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.FMPoint$1;

public final class FMPoint$Builder extends GeneratedMessageLite$Builder implements FMPointOrBuilder	// class@000f51
{

    public void FMPoint$Builder(){
       super(FMPoint.DEFAULT_INSTANCE);
    }
    public void FMPoint$Builder(FMPoint$1 p0){
       super();
    }
    public FMPoint$Builder clearX(){
       this.copyOnWrite();
       this.instance.clearX();
       return this;
    }
    public FMPoint$Builder clearY(){
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
    public FMPoint$Builder setX(float p0){
       this.copyOnWrite();
       this.instance.setX(p0);
       return this;
    }
    public FMPoint$Builder setY(float p0){
       this.copyOnWrite();
       this.instance.setY(p0);
       return this;
    }
}
