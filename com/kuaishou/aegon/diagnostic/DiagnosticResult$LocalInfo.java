package com.kuaishou.aegon.diagnostic.DiagnosticResult$LocalInfo;
import java.lang.String;
import java.lang.Object;

public class DiagnosticResult$LocalInfo	// class@0007a2
{
    public int connectionType;
    public int downstreamThroughputKbps;
    public int nqeScore;
    public String ssid;

    public void DiagnosticResult$LocalInfo(String p0,int p1,int p2,int p3){
       super();
       this.ssid = p0;
       this.connectionType = p1;
       this.downstreamThroughputKbps = p2;
       this.nqeScore = p3;
    }
}
