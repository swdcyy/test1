package com.yxcorp.gifshow.retrofit.degrade.DegradeConfig;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$UrlDegradeConfig;

public class DegradeConfig implements Serializable	// class@00131d
{
    public DegradeConfig$UrlDegradeConfig mConfig;
    public boolean mDelayUpload;
    public boolean mDisableCheckFilter;
    public boolean mDisableFeedStat;
    public static final DegradeConfig EMPTY;
    public static final long serialVersionUID;

    static {
       DegradeConfig.EMPTY = new DegradeConfig();
    }
    public void DegradeConfig(){
       super();
       this.mConfig = DegradeConfig$UrlDegradeConfig.EMPTY;
    }
}
