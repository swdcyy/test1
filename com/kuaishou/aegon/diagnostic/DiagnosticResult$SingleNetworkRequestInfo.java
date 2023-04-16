package com.kuaishou.aegon.diagnostic.DiagnosticResult$SingleNetworkRequestInfo;
import java.lang.String;
import java.lang.Object;

public class DiagnosticResult$SingleNetworkRequestInfo	// class@0007a4
{
    public int connectCostMs;
    public int dnsCostMs;
    public String domain;
    public String domainResolvedIp;
    public int errorCode;
    public String errorName;
    public int httpCode;
    public boolean isPreload;
    public String latestUrl;
    public String protocol;
    public int resourceType;
    public int responseSize;
    public int srttMs;
    public long startTimestamp;
    public int totalCostMs;
    public String url;

    public void DiagnosticResult$SingleNetworkRequestInfo(long p0,int p1,boolean p2,String p3,String p4,String p5,String p6,String p7,String p8,int p9,int p10,int p11,int p12,int p13,int p14,int p15){
       int i = this;
       super();
       i.startTimestamp = p0;
       i.resourceType = p1;
       i.isPreload = p2;
       i.domain = p3;
       i.url = p4;
       i.latestUrl = p5;
       i.domainResolvedIp = p6;
       i.protocol = p7;
       i.errorName = p8;
       i.errorCode = p9;
       i.httpCode = p10;
       i.responseSize = p11;
       i.srttMs = p12;
       i.totalCostMs = p13;
       i.dnsCostMs = p14;
       i.connectCostMs = p15;
    }
}
