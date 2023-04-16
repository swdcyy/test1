package com.kuaishou.merchant.bridgecenter.params.MerchantDebugLoggerParams;
import java.io.Serializable;
import java.lang.Object;

public class MerchantDebugLoggerParams implements Serializable	// class@001624
{
    public String mBiz;
    public int mLogType;
    public String mModule;
    public String mMsg;
    public Map mParams;
    public String mProjectName;
    public String mSubBiz;
    public String mTag;
    public static final long serialVersionUID = 0x6ce1438095379b40;

    public void MerchantDebugLoggerParams(){
       super();
       this.mLogType = 2;
       this.mBiz = "";
       this.mSubBiz = "";
       this.mProjectName = "";
       this.mTag = "";
       this.mMsg = "";
    }
}
