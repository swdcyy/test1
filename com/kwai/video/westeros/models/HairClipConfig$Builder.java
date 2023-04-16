package com.kwai.video.westeros.models.HairClipConfig$Builder;
import com.kwai.video.westeros.models.HairClipConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.HairClipConfig;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.HairClipConfig$1;

public final class HairClipConfig$Builder extends GeneratedMessageLite$Builder implements HairClipConfigOrBuilder	// class@000f85
{

    public void HairClipConfig$Builder(){
       super(HairClipConfig.DEFAULT_INSTANCE);
    }
    public void HairClipConfig$Builder(HairClipConfig$1 p0){
       super();
    }
    public HairClipConfig$Builder clearIsActive(){
       this.copyOnWrite();
       this.instance.clearIsActive();
       return this;
    }
    public HairClipConfig$Builder clearRunMode(){
       this.copyOnWrite();
       this.instance.clearRunMode();
       return this;
    }
    public HairClipConfig$Builder clearShowOptions(){
       this.copyOnWrite();
       this.instance.clearShowOptions();
       return this;
    }
    public HairClipConfig$Builder clearUsingColorMode(){
       this.copyOnWrite();
       this.instance.clearUsingColorMode();
       return this;
    }
    public boolean getIsActive(){
       return this.instance.getIsActive();
    }
    public int getRunMode(){
       return this.instance.getRunMode();
    }
    public int getShowOptions(){
       return this.instance.getShowOptions();
    }
    public int getUsingColorMode(){
       return this.instance.getUsingColorMode();
    }
    public HairClipConfig$Builder setIsActive(boolean p0){
       this.copyOnWrite();
       this.instance.setIsActive(p0);
       return this;
    }
    public HairClipConfig$Builder setRunMode(int p0){
       this.copyOnWrite();
       this.instance.setRunMode(p0);
       return this;
    }
    public HairClipConfig$Builder setShowOptions(int p0){
       this.copyOnWrite();
       this.instance.setShowOptions(p0);
       return this;
    }
    public HairClipConfig$Builder setUsingColorMode(int p0){
       this.copyOnWrite();
       this.instance.setUsingColorMode(p0);
       return this;
    }
}
