package com.yxcorp.gifshow.tuna.plc.StartTunaDownloadEvent;
import java.io.Serializable;
import java.lang.Object;

public class StartTunaDownloadEvent implements Serializable	// class@001e2a
{
    public String mAppId;
    public String mDownloadUrl;
    public String mPackageName;
    public int mSource;
    public static final long serialVersionUID = 0x68bdc85939f0d49e;

    public void StartTunaDownloadEvent(){
       super();
    }
}
