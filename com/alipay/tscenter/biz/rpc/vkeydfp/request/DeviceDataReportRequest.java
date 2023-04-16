package com.alipay.tscenter.biz.rpc.vkeydfp.request.DeviceDataReportRequest;
import java.io.Serializable;
import java.lang.Object;

public class DeviceDataReportRequest implements Serializable	// class@000eb9
{
    public String apdid;
    public Map dataMap;
    public String lastTime;
    public String os;
    public String priApdid;
    public String pubApdid;
    public String token;
    public String umidToken;
    public String version;

    public void DeviceDataReportRequest(){
       super();
    }
}
