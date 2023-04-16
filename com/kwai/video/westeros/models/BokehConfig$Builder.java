package com.kwai.video.westeros.models.BokehConfig$Builder;
import com.kwai.video.westeros.models.BokehConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.BokehConfig;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.BokehConfig$1;

public final class BokehConfig$Builder extends GeneratedMessageLite$Builder implements BokehConfigOrBuilder	// class@000ec2
{

    public void BokehConfig$Builder(){
       super(BokehConfig.DEFAULT_INSTANCE);
    }
    public void BokehConfig$Builder(BokehConfig$1 p0){
       super();
    }
    public BokehConfig$Builder clearUseGray(){
       this.copyOnWrite();
       this.instance.clearUseGray();
       return this;
    }
    public boolean getUseGray(){
       return this.instance.getUseGray();
    }
    public BokehConfig$Builder setUseGray(boolean p0){
       this.copyOnWrite();
       this.instance.setUseGray(p0);
       return this;
    }
}
