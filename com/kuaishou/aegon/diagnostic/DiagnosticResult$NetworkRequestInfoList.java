package com.kuaishou.aegon.diagnostic.DiagnosticResult$NetworkRequestInfoList;
import com.kuaishou.aegon.diagnostic.DiagnosticResult$SingleNetworkRequestInfo;
import java.lang.Object;

public class DiagnosticResult$NetworkRequestInfoList	// class@0007a3
{
    public int dialTestType;
    public DiagnosticResult$SingleNetworkRequestInfo[] networkRequestInfoList;
    public static final int HTTP_REQUEST = 2;
    public static final int TCP_PING = 1;

    public void DiagnosticResult$NetworkRequestInfoList(int p0,DiagnosticResult$SingleNetworkRequestInfo[] p1){
       super();
       this.dialTestType = p0;
       this.networkRequestInfoList = p1;
    }
}
