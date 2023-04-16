package com.kwai.video.westeros.models.FMSize$Builder;
import com.kwai.video.westeros.models.FMSizeOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.FMSize;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.FMSize$1;

public final class FMSize$Builder extends GeneratedMessageLite$Builder implements FMSizeOrBuilder	// class@000f55
{

    public void FMSize$Builder(){
       super(FMSize.DEFAULT_INSTANCE);
    }
    public void FMSize$Builder(FMSize$1 p0){
       super();
    }
    public FMSize$Builder clearHeight(){
       this.copyOnWrite();
       this.instance.clearHeight();
       return this;
    }
    public FMSize$Builder clearWidth(){
       this.copyOnWrite();
       this.instance.clearWidth();
       return this;
    }
    public float getHeight(){
       return this.instance.getHeight();
    }
    public float getWidth(){
       return this.instance.getWidth();
    }
    public FMSize$Builder setHeight(float p0){
       this.copyOnWrite();
       this.instance.setHeight(p0);
       return this;
    }
    public FMSize$Builder setWidth(float p0){
       this.copyOnWrite();
       this.instance.setWidth(p0);
       return this;
    }
}
