package com.kuaishou.nearby_poi.poi.model.LocalLifeJinJingParams;
import java.io.Serializable;
import java.lang.Object;

public class LocalLifeJinJingParams implements Serializable	// class@000a2e
{
    public boolean isReportErrorLog;
    public String mBundleId;
    public String mCustomEventKey;
    public String mMsg;
    public Map mParams;
    public int mReportType;
    public String mTag;
    public static final long serialVersionUID = 0xcf41efabe8bdc99e;

    public void LocalLifeJinJingParams(){
       super();
       this.mCustomEventKey = "";
       this.mBundleId = "";
       this.mTag = "";
       this.mMsg = "";
       this.isReportErrorLog = false;
       this.mReportType = 1;
    }
}
