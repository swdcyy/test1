package com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$UrlDegradeConfig;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class DegradeConfig$UrlDegradeConfig implements Serializable	// class@00131c
{
    public Map mActionConfig;
    public List mCdnUrls;
    public Map mUriConfig;
    public String mVersion;
    public static final DegradeConfig$UrlDegradeConfig EMPTY;
    public static final long serialVersionUID;

    static {
       DegradeConfig$UrlDegradeConfig.EMPTY = new DegradeConfig$UrlDegradeConfig();
    }
    public void DegradeConfig$UrlDegradeConfig(){
       super();
       this.mCdnUrls = new ArrayList();
       this.mUriConfig = new HashMap();
       this.mActionConfig = new HashMap();
       this.mVersion = "";
    }
}
