package com.kuaishou.aegon.httpdns.ResolveFinishedInfo;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class ResolveFinishedInfo	// class@0007ac
{
    public String clientIp;
    public String errorMessage;
    public String extraInfo;
    public List finalResults;
    public String host;
    public long localCostMs;
    public List localResults;
    public long networkCostMs;
    public List networkResults;
    public long pingCostMs;
    public long retryCount;
    public long totalCostMs;

    public void ResolveFinishedInfo(String p0,long p1,String p2,long p3,long p4,long p5,List p6,List p7,List p8,String p9,long p10,String p11){
       int i = this;
       super();
       i.totalCostMs = 0;
       i.errorMessage = null;
       i.host = p0;
       i.totalCostMs = p1;
       i.errorMessage = p2;
       i.networkCostMs = p3;
       i.localCostMs = p4;
       i.pingCostMs = p5;
       i.networkResults = p6;
       i.localResults = p7;
       i.finalResults = p8;
       i.clientIp = p9;
       i.retryCount = p10;
       i.extraInfo = p11;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ResolveFinishedInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{\n"+"host : "+this.host+"\n"+"error message : "+this.errorMessage+"\n"+"total cost : "+this.totalCostMs+"\n"+"network cost : "+this.networkCostMs+"\n"+"local cost : "+this.localCostMs+"\n"+"ping cost : "+this.pingCostMs+"\n"+"network results : "+this.networkResults+"\n"+"local results : "+this.localResults+"\n"+"final results : "+this.finalResults+"\n"+"client ip : "+this.clientIp+"\n"+"retry count : "+this.retryCount+"\n"+"extra info : "+this.extraInfo+"\n"+"}";
    }
}
