package com.yxcorp.gateway.pay.params.webview.LoggerParams;
import java.io.Serializable;
import java.lang.Object;

public class LoggerParams implements Serializable	// class@00125f
{
    public int mLevel;
    public String mMsg;
    public Map mParams;
    public String mTag;
    public static final long serialVersionUID = 0x6ce1438095379b40;

    public void LoggerParams(){
       super();
       this.mLevel = 1;
       this.mTag = "";
       this.mMsg = "";
    }
}
