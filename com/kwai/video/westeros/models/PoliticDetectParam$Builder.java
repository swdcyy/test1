package com.kwai.video.westeros.models.PoliticDetectParam$Builder;
import com.kwai.video.westeros.models.PoliticDetectParamOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.PoliticDetectParam;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.PoliticDetectParam$1;

public final class PoliticDetectParam$Builder extends GeneratedMessageLite$Builder implements PoliticDetectParamOrBuilder	// class@00100f
{

    public void PoliticDetectParam$Builder(){
       super(PoliticDetectParam.DEFAULT_INSTANCE);
    }
    public void PoliticDetectParam$Builder(PoliticDetectParam$1 p0){
       super();
    }
    public PoliticDetectParam$Builder clearEnable(){
       this.copyOnWrite();
       this.instance.clearEnable();
       return this;
    }
    public boolean getEnable(){
       return this.instance.getEnable();
    }
    public PoliticDetectParam$Builder setEnable(boolean p0){
       this.copyOnWrite();
       this.instance.setEnable(p0);
       return this;
    }
}
