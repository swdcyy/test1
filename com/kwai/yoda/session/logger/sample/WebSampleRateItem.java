package com.kwai.yoda.session.logger.sample.WebSampleRateItem;
import com.kwai.yoda.session.logger.sample.SampleRateItem;
import java.lang.Float;

public class WebSampleRateItem extends SampleRateItem	// class@0012db
{
    public Float api;
    public boolean bridgeHit;
    public Float custom;
    public Float error;
    public Float event;
    public boolean isHit;
    public Float load;
    public Float resource;
    public Float webLog;
    public Float webLogInter;
    public Float webLogPerCount;
    public Float webLogSize;

    public void WebSampleRateItem(){
       super();
       this.isHit = true;
       this.webLog = Float.valueOf(0x3f800000);
    }
}
