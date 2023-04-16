package com.kuaishou.merchant.live.entry.CrowdResponse;
import java.io.Serializable;
import com.kuaishou.merchant.live.entry.CrowdResponse$a;
import nsd.u;
import java.lang.Object;

public final class CrowdResponse implements Serializable	// class@001a0c
{
    public boolean isCrowdSeller;
    public static final CrowdResponse$a Companion;
    public static final long serialVersionUID;

    static {
       CrowdResponse.Companion = new CrowdResponse$a(null);
    }
    public void CrowdResponse(){
       super();
    }
    public final boolean isCrowdSeller(){
       return this.isCrowdSeller;
    }
    public final void setCrowdSeller(boolean p0){
       this.isCrowdSeller = p0;
    }
}
