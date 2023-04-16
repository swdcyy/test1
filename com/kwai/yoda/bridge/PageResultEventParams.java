package com.kwai.yoda.bridge.PageResultEventParams;
import java.io.Serializable;
import java.lang.Object;

public class PageResultEventParams implements Serializable	// class@00117e
{
    public long mCost;
    public String mErrorTag;
    public boolean mInjected;
    public List mProgressList;
    public boolean mSecurityCheckResult;
    public String mUrl;
    public static final long serialVersionUID = 0x81d314a80c203480;

    public void PageResultEventParams(){
       super();
       this.mSecurityCheckResult = true;
    }
}
