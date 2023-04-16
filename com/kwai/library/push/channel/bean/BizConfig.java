package com.kwai.library.push.channel.bean.BizConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class BizConfig implements Serializable	// class@00089e
{
    public String blackList;
    public int duration;
    public Boolean enableWhiteList;
    public Map freqControl;
    public int freqTimeout;
    public String mBizType;
    public Integer priority;
    public int showInterval;
    public String whiteList;
    public static final long serialVersionUID = 0x1d2a4c1efea02663;

    public void BizConfig(){
       super();
       this.freqTimeout = 10;
    }
    public String toString(){
       return "BizConfig{mBizType=\'"+this.mBizType+'''+", showInterval="+this.showInterval+", duration="+this.duration+", enableWhiteList="+this.enableWhiteList+", priority="+this.priority+", freqTimeout="+this.freqTimeout+", blackList=\'"+this.blackList+'''+", whiteList=\'"+this.whiteList+'''+", freqControl="+this.freqControl+'}';
    }
}
