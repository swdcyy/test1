package com.kwai.library.push.http.bean.PayloadConf$ConfData;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class PayloadConf$ConfData implements Serializable	// class@0008c8
{
    public int confVer;
    public long interval;
    public InPushConfig mInPushConfig;
    public boolean mIsSyn;
    public static final long serialVersionUID = 0x3cac07862df6a9e2;

    public void PayloadConf$ConfData(){
       super();
    }
    public String toString(){
       return "Data{, interval="+this.interval+", confVer="+this.confVer+", mInPushConfig="+this.mInPushConfig+'}';
    }
}
