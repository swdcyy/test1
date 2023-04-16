package com.ks.ksuploader.KSGateWayInfo;
import java.lang.String;
import java.lang.Object;

public class KSGateWayInfo	// class@00074f
{
    public String ip;
    public short port;
    public int protocol;

    public void KSGateWayInfo(int p0,String p1,short p2){
       super();
       this.protocol = p0;
       this.ip = p1;
       this.port = p2;
    }
}
