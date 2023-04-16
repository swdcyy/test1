package com.kuaishou.nearby_poi.poi.model.LocalLifeLoggerParams;
import java.io.Serializable;
import java.lang.Object;

public class LocalLifeLoggerParams implements Serializable	// class@000a2f
{
    public String mLogBiz;
    public int mLogType;
    public String mModule;
    public String mMsg;
    public Map mParams;
    public String mTag;
    public static final long serialVersionUID = 0xa8baa2b335c0c09f;

    public void LocalLifeLoggerParams(){
       super();
       this.mLogType = 2;
       this.mLogBiz = "";
       this.mTag = "";
       this.mMsg = "";
    }
}
