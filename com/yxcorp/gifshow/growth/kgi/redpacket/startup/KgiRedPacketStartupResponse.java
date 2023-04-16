package com.yxcorp.gifshow.growth.kgi.redpacket.startup.KgiRedPacketStartupResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.kgi.redpacket.startup.KgiRedPacketStartupResponse$a;
import nsd.u;
import java.lang.Object;

public final class KgiRedPacketStartupResponse implements Serializable	// class@0013f8
{
    public String errorMsg;
    public int result;
    public KgiRedPacketToastResponse toast;
    public static final KgiRedPacketStartupResponse$a Companion;
    public static final long serialVersionUID;

    static {
       KgiRedPacketStartupResponse.Companion = new KgiRedPacketStartupResponse$a(null);
    }
    public void KgiRedPacketStartupResponse(){
       super();
       this.result = -1;
    }
}
