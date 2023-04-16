package com.kwai.video.westeros.models.YCNNModelInConfig$Builder;
import com.kwai.video.westeros.models.YCNNModelInConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.YCNNModelInConfig;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.YCNNModelInConfig$1;

public final class YCNNModelInConfig$Builder extends GeneratedMessageLite$Builder implements YCNNModelInConfigOrBuilder	// class@001095
{

    public void YCNNModelInConfig$Builder(){
       super(YCNNModelInConfig.DEFAULT_INSTANCE);
    }
    public void YCNNModelInConfig$Builder(YCNNModelInConfig$1 p0){
       super();
    }
    public YCNNModelInConfig$Builder clearRotate(){
       this.copyOnWrite();
       this.instance.clearRotate();
       return this;
    }
    public YCNNModelInConfig$Builder clearUseRobust3D(){
       this.copyOnWrite();
       this.instance.clearUseRobust3D();
       return this;
    }
    public int getRotate(){
       return this.instance.getRotate();
    }
    public int getUseRobust3D(){
       return this.instance.getUseRobust3D();
    }
    public YCNNModelInConfig$Builder setRotate(int p0){
       this.copyOnWrite();
       this.instance.setRotate(p0);
       return this;
    }
    public YCNNModelInConfig$Builder setUseRobust3D(int p0){
       this.copyOnWrite();
       this.instance.setUseRobust3D(p0);
       return this;
    }
}
