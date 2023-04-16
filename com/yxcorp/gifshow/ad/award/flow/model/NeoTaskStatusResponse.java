package com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$a;
import nsd.u;
import com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$Data;
import java.lang.Object;

public final class NeoTaskStatusResponse implements Serializable	// class@001515
{
    public final NeoTaskStatusResponse$Data data;
    public static final NeoTaskStatusResponse$a Companion;
    public static final long serialVersionUID;

    static {
       NeoTaskStatusResponse.Companion = new NeoTaskStatusResponse$a(null);
    }
    public void NeoTaskStatusResponse(NeoTaskStatusResponse$Data p0){
       super();
       this.data = p0;
    }
    public final NeoTaskStatusResponse$Data getData(){
       return this.data;
    }
}
