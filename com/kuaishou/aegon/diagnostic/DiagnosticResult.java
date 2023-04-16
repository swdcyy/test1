package com.kuaishou.aegon.diagnostic.DiagnosticResult;
import com.kuaishou.aegon.diagnostic.DiagnosticResult$LocalInfo;
import com.kuaishou.aegon.diagnostic.DiagnosticResult$SingleNetworkRequestInfo;
import com.kuaishou.aegon.diagnostic.DiagnosticResult$NetworkRequestInfoList;
import com.kuaishou.aegon.diagnostic.DiagnosticResult$DomainStatistics;
import java.lang.Object;

public class DiagnosticResult	// class@0007a5
{
    public DiagnosticResult$NetworkRequestInfoList[] dialTestRequestInfoList;
    public DiagnosticResult$DomainStatistics domainStatistics;
    public DiagnosticResult$SingleNetworkRequestInfo failureRequestInfo;
    public DiagnosticResult$LocalInfo localInfo;

    public void DiagnosticResult(DiagnosticResult$LocalInfo p0,DiagnosticResult$SingleNetworkRequestInfo p1,DiagnosticResult$NetworkRequestInfoList[] p2,DiagnosticResult$DomainStatistics p3){
       super();
       this.localInfo = p0;
       this.failureRequestInfo = p1;
       this.dialTestRequestInfoList = p2;
       this.domainStatistics = p3;
    }
}
