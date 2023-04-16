package com.kwai.video.westeros.models.TongueInfo$Builder;
import com.kwai.video.westeros.models.TongueInfoOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.TongueInfo;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.TongueInfo$1;
import com.kwai.video.westeros.models.AnimojiPoint3F;
import com.kwai.video.westeros.models.AnimojiPoint3F$Builder;

public final class TongueInfo$Builder extends GeneratedMessageLite$Builder implements TongueInfoOrBuilder	// class@001052
{

    public void TongueInfo$Builder(){
       super(TongueInfo.DEFAULT_INSTANCE);
    }
    public void TongueInfo$Builder(TongueInfo$1 p0){
       super();
    }
    public TongueInfo$Builder clearPos(){
       this.copyOnWrite();
       this.instance.clearPos();
       return this;
    }
    public TongueInfo$Builder clearVisible(){
       this.copyOnWrite();
       this.instance.clearVisible();
       return this;
    }
    public AnimojiPoint3F getPos(){
       return this.instance.getPos();
    }
    public boolean getVisible(){
       return this.instance.getVisible();
    }
    public boolean hasPos(){
       return this.instance.hasPos();
    }
    public TongueInfo$Builder mergePos(AnimojiPoint3F p0){
       this.copyOnWrite();
       this.instance.mergePos(p0);
       return this;
    }
    public TongueInfo$Builder setPos(AnimojiPoint3F$Builder p0){
       this.copyOnWrite();
       this.instance.setPos(p0);
       return this;
    }
    public TongueInfo$Builder setPos(AnimojiPoint3F p0){
       this.copyOnWrite();
       this.instance.setPos(p0);
       return this;
    }
    public TongueInfo$Builder setVisible(boolean p0){
       this.copyOnWrite();
       this.instance.setVisible(p0);
       return this;
    }
}
