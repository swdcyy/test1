package com.kuaishou.aegon.diagnostic.DiagnosticResult$DomainStatistics;
import java.lang.String;
import java.lang.Object;

public class DiagnosticResult$DomainStatistics	// class@0007a1
{
    public long beginTimestamp;
    public String domain;
    public long endTimestamp;
    public int failCnt;
    public int totalCnt;

    public void DiagnosticResult$DomainStatistics(String p0,int p1,int p2,long p3,long p4){
       super();
       this.domain = p0;
       this.totalCnt = p1;
       this.failCnt = p2;
       this.beginTimestamp = p3;
       this.endTimestamp = p4;
    }
}
