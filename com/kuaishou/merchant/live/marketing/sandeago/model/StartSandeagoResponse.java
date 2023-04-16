package com.kuaishou.merchant.live.marketing.sandeago.model.StartSandeagoResponse;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.merchant.live.marketing.sandeago.o$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class StartSandeagoResponse implements Serializable	// class@001a56
{
    public boolean mAlreadyStarted;
    public long mCurrentStock;
    public String mRestartToast;
    public String mSandeaBizId;
    public static final long serialVersionUID = 0x4edad11dac905cab;

    public void StartSandeagoResponse(){
       super();
    }
    public o$a convertSandeagoModel(){
       o$a obj = PatchProxy.apply(null, this, StartSandeagoResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new o$a();
       obj.a = this.mSandeaBizId;
       obj.b = this.mCurrentStock;
       return obj;
    }
}
