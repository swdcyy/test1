package com.kwai.video.westeros.models.MmuPoint$Builder;
import com.kwai.video.westeros.models.MmuPointOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.MmuPoint;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.MmuPoint$1;

public final class MmuPoint$Builder extends GeneratedMessageLite$Builder implements MmuPointOrBuilder	// class@000fd9
{

    public void MmuPoint$Builder(){
       super(MmuPoint.DEFAULT_INSTANCE);
    }
    public void MmuPoint$Builder(MmuPoint$1 p0){
       super();
    }
    public MmuPoint$Builder clearX(){
       this.copyOnWrite();
       this.instance.clearX();
       return this;
    }
    public MmuPoint$Builder clearY(){
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
    public MmuPoint$Builder setX(float p0){
       this.copyOnWrite();
       this.instance.setX(p0);
       return this;
    }
    public MmuPoint$Builder setY(float p0){
       this.copyOnWrite();
       this.instance.setY(p0);
       return this;
    }
}
