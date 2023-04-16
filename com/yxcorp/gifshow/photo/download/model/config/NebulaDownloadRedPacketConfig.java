package com.yxcorp.gifshow.photo.download.model.config.NebulaDownloadRedPacketConfig;
import java.io.Serializable;
import java.lang.Object;

public class NebulaDownloadRedPacketConfig implements Serializable	// class@000ed9
{
    public int mDownloadCountDaily;
    public int mDownloadCountTotal;
    public int mDurationLimit;
    public int mDurationMinLimit;
    public int mOpenCountDaily;
    public int mOpenCountTotal;
    public String mTemplate;
    public String mTemplateUrl;
    public String mTemplateUrlRatio1;
    public String mTemplateUrlRatio2;
    public String mTemplateUrlRatio3;
    public int mViewCountLimit;
    public static final long serialVersionUID = 0xccfef9ef8cb5ebf6;

    public void NebulaDownloadRedPacketConfig(){
       super();
       this.mViewCountLimit = 1000;
       this.mDownloadCountDaily = 3;
       this.mDownloadCountTotal = 60;
       this.mOpenCountDaily = 3;
       this.mOpenCountTotal = 100;
       this.mDurationLimit = 60;
       this.mDurationMinLimit = 4;
    }
}
