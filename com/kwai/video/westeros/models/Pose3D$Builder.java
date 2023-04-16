package com.kwai.video.westeros.models.Pose3D$Builder;
import com.kwai.video.westeros.models.Pose3DOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.Pose3D;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.Pose3D$1;

public final class Pose3D$Builder extends GeneratedMessageLite$Builder implements Pose3DOrBuilder	// class@00101c
{

    public void Pose3D$Builder(){
       super(Pose3D.DEFAULT_INSTANCE);
    }
    public void Pose3D$Builder(Pose3D$1 p0){
       super();
    }
    public Pose3D$Builder clearPitch(){
       this.copyOnWrite();
       this.instance.clearPitch();
       return this;
    }
    public Pose3D$Builder clearRoll(){
       this.copyOnWrite();
       this.instance.clearRoll();
       return this;
    }
    public Pose3D$Builder clearYaw(){
       this.copyOnWrite();
       this.instance.clearYaw();
       return this;
    }
    public float getPitch(){
       return this.instance.getPitch();
    }
    public float getRoll(){
       return this.instance.getRoll();
    }
    public float getYaw(){
       return this.instance.getYaw();
    }
    public Pose3D$Builder setPitch(float p0){
       this.copyOnWrite();
       this.instance.setPitch(p0);
       return this;
    }
    public Pose3D$Builder setRoll(float p0){
       this.copyOnWrite();
       this.instance.setRoll(p0);
       return this;
    }
    public Pose3D$Builder setYaw(float p0){
       this.copyOnWrite();
       this.instance.setYaw(p0);
       return this;
    }
}
