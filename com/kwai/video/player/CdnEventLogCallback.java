package com.kwai.video.player.CdnEventLogCallback;
import com.kwai.video.cache.AwesomeCacheCallback;
import com.kwai.video.hodor.logEvent.CdnStatEvent;
import java.lang.String;

public abstract class CdnEventLogCallback extends AwesomeCacheCallback	// class@000aac
{
    public String mBizExtra;
    public String mBizFt;

    public void CdnEventLogCallback(){
       super();
       this.mBizFt = "";
       this.mBizExtra = "";
    }
    public abstract CdnStatEvent creatCdnStatEvent();
    public String getBizExtra(){
       return this.mBizExtra;
    }
    public String getBizFt(){
       return this.mBizFt;
    }
    public abstract boolean isUnifyCdnLog();
    public void setBizExtra(String p0){
       this.mBizExtra = p0;
    }
    public void setBizFt(String p0){
       this.mBizFt = p0;
    }
}
