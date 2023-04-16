package com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import java.io.Serializable;
import java.lang.Object;

public class DataReportRequest implements Serializable	// class@000eb6
{
    public Map bizData;
    public String bizType;
    public Map deviceData;
    public String os;
    public String rpcVersion;

    public void DataReportRequest(){
       super();
    }
}
