package com.kuaishou.aegon.netcheck.NetworkQualityEstimator$Metrics;
import java.lang.Object;

public class NetworkQualityEstimator$Metrics	// class@0007b7
{
    public int downstreamThroughputKbps;
    public float gatewayLoss;
    public float gatewayRttMs;
    public float serverRttMs;
    public int signalStrength;

    public void NetworkQualityEstimator$Metrics(){
       super(0, 0xbf800000, 0xbf800000, -1, -1);
    }
    public void NetworkQualityEstimator$Metrics(float p0,float p1,float p2,int p3,int p4){
       super();
       this.gatewayLoss = p0;
       this.gatewayRttMs = p1;
       this.serverRttMs = p2;
       this.downstreamThroughputKbps = p3;
       this.signalStrength = p4;
    }
}
