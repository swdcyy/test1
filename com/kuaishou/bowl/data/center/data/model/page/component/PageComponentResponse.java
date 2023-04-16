package com.kuaishou.bowl.data.center.data.model.page.component.PageComponentResponse;
import java.io.Serializable;
import java.lang.Object;

public class PageComponentResponse implements Serializable	// class@0011f2
{
    public PageComponentInfo data;
    public String errMsg;
    public boolean isFromCache;
    public CacheConfig mCacheConfig;
    public FailBack mFailBack;
    public MerchantLimitRetryRespond mLimitRetryRespond;
    public int result;
    public static final long serialVersionUID = 0x22d101dd318c6475;

    public void PageComponentResponse(){
       super();
    }
}
