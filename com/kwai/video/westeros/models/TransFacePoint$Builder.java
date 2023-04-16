package com.kwai.video.westeros.models.TransFacePoint$Builder;
import com.kwai.video.westeros.models.TransFacePointOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.TransFacePoint;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.TransFacePoint$1;

public final class TransFacePoint$Builder extends GeneratedMessageLite$Builder implements TransFacePointOrBuilder	// class@00105e
{

    public void TransFacePoint$Builder(){
       super(TransFacePoint.DEFAULT_INSTANCE);
    }
    public void TransFacePoint$Builder(TransFacePoint$1 p0){
       super();
    }
    public TransFacePoint$Builder clearIndex(){
       this.copyOnWrite();
       this.instance.clearIndex();
       return this;
    }
    public TransFacePoint$Builder clearX(){
       this.copyOnWrite();
       this.instance.clearX();
       return this;
    }
    public TransFacePoint$Builder clearY(){
       this.copyOnWrite();
       this.instance.clearY();
       return this;
    }
    public int getIndex(){
       return this.instance.getIndex();
    }
    public float getX(){
       return this.instance.getX();
    }
    public float getY(){
       return this.instance.getY();
    }
    public TransFacePoint$Builder setIndex(int p0){
       this.copyOnWrite();
       this.instance.setIndex(p0);
       return this;
    }
    public TransFacePoint$Builder setX(float p0){
       this.copyOnWrite();
       this.instance.setX(p0);
       return this;
    }
    public TransFacePoint$Builder setY(float p0){
       this.copyOnWrite();
       this.instance.setY(p0);
       return this;
    }
}
