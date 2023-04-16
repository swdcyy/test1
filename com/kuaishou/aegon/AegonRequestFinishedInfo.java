package com.kuaishou.aegon.AegonRequestFinishedInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class AegonRequestFinishedInfo	// class@0005da
{
    public String aegonVersion;
    public long bodyRecvCostMs;
    public boolean cached;
    public int clientHellos;
    public long connectionCostMs;
    public String consumer;
    public String contentEncoding;
    public String debugInfo;
    public long dnsCostMs;
    public int errCode;
    public String extraInfo;
    public long headerRecvCostMs;
    public int httpCode;
    public boolean ipv6Reachable;
    public String method;
    public int netType;
    public String protocol;
    public int quicBroken;
    public int quicBrokenError;
    public long receivedBytes;
    public long redirectCostMs;
    public long requestSendCostMs;
    public long sentBytes;
    public boolean socketReused;
    public long sslCostMs;
    public int sslHandshakeType;
    public long tcpCostMs;
    public long totalCostMs;
    public String url;
    public boolean viaIpv6;
    public boolean viaProxy;
    public long waitingCostMs;

    public void AegonRequestFinishedInfo(int p0,String p1,String p2,int p3,boolean p4,String p5,String p6,boolean p7,int p8,String p9,long p10,long p11,boolean p12,String p13,boolean p14,boolean p15,int p16,int p17,int p18,int p19,long p20,long p21,long p22,long p23,long p24,long p25,long p26,long p27,long p28,long p29,String p30,String p31){
       int i = this;
       super();
       i.errCode = p0;
       i.url = p1;
       i.method = p2;
       i.netType = p3;
       i.ipv6Reachable = p4;
       i.consumer = p5;
       i.aegonVersion = p6;
       i.cached = p7;
       i.httpCode = p8;
       i.protocol = p9;
       i.receivedBytes = p10;
       i.sentBytes = p11;
       i.viaProxy = p12;
       i.contentEncoding = p13;
       i.viaIpv6 = p14;
       i.socketReused = p15;
       i.sslHandshakeType = p16;
       i.quicBroken = p17;
       i.quicBrokenError = p18;
       i.clientHellos = p19;
       i.dnsCostMs = p20;
       i.tcpCostMs = p21;
       i.sslCostMs = p22;
       i.connectionCostMs = p23;
       i.requestSendCostMs = p24;
       i.waitingCostMs = p25;
       i.headerRecvCostMs = p26;
       i.redirectCostMs = p27;
       i.bodyRecvCostMs = p28;
       i.totalCostMs = p29;
       i.extraInfo = p30;
       i.debugInfo = p31;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AegonRequestFinishedInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{\n"+"errCode : "+this.errCode+"\n"+"url : "+this.url+"\n"+"method : "+this.method+"\n"+"netType : "+this.netType+"\n"+"ipv6Reachable : "+this.ipv6Reachable+"\n"+"consumer : "+this.consumer+"\n"+"aegonVersion : "+this.aegonVersion+"\n"+"cached : "+this.cached+"\n"+"httpCode : "+this.httpCode+"\n"+"protocol : "+this.protocol+"\n"+"receivedBytes : "+this.receivedBytes+"\n"+"sentBytes : "+this.sentBytes+"\n"+"viaProxy : "+this.viaProxy+"\n"+"contentEncoding : "+this.contentEncoding+"\n"+"viaIpv6 : "+this.viaIpv6+"\n"+"socketReused : "+this.socketReused+"\n"+"sslHandshakeType : "+this.sslHandshakeType+"\n"+"quicBroken : "+this.quicBroken+"\n"+"quicBrokenError : "+this.quicBrokenError+"\n"+"clientHellos : "+this.clientHellos+"\n"+"dnsCostMs : "+this.dnsCostMs+"\n"+"tcpCostMs : "+this.tcpCostMs+"\n"+"sslCostMs : "+this.sslCostMs+"\n"+"connectionCostMs : "+this.connectionCostMs+"\n"+"requestSendCostMs : "+this.requestSendCostMs+"\n"+"waitingCostMs : "+this.waitingCostMs+"\n"+"headerRecvCostMs : "+this.headerRecvCostMs+"\n"+"redirectCostMs : "+this.redirectCostMs+"\n"+"bodyRecvCostMs : "+this.bodyRecvCostMs+"\n"+"totalCostMs : "+this.totalCostMs+"\n"+"extraInfo : "+this.extraInfo+"}\n";
    }
}
