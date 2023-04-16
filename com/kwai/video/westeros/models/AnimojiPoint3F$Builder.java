package com.kwai.video.westeros.models.AnimojiPoint3F$Builder;
import com.kwai.video.westeros.models.AnimojiPoint3FOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.AnimojiPoint3F;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.AnimojiPoint3F$1;

public final class AnimojiPoint3F$Builder extends GeneratedMessageLite$Builder implements AnimojiPoint3FOrBuilder	// class@000ea4
{

    public void AnimojiPoint3F$Builder(){
       super(AnimojiPoint3F.DEFAULT_INSTANCE);
    }
    public void AnimojiPoint3F$Builder(AnimojiPoint3F$1 p0){
       super();
    }
    public AnimojiPoint3F$Builder clearX(){
       this.copyOnWrite();
       this.instance.clearX();
       return this;
    }
    public AnimojiPoint3F$Builder clearY(){
       this.copyOnWrite();
       this.instance.clearY();
       return this;
    }
    public AnimojiPoint3F$Builder clearZ(){
       this.copyOnWrite();
       this.instance.clearZ();
       return this;
    }
    public float getX(){
       return this.instance.getX();
    }
    public float getY(){
       return this.instance.getY();
    }
    public float getZ(){
       return this.instance.getZ();
    }
    public AnimojiPoint3F$Builder setX(float p0){
       this.copyOnWrite();
       this.instance.setX(p0);
       return this;
    }
    public AnimojiPoint3F$Builder setY(float p0){
       this.copyOnWrite();
       this.instance.setY(p0);
       return this;
    }
    public AnimojiPoint3F$Builder setZ(float p0){
       this.copyOnWrite();
       this.instance.setZ(p0);
       return this;
    }
}
