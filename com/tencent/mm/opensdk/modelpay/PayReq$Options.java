package com.tencent.mm.opensdk.modelpay.PayReq$Options;
import java.lang.Object;
import android.os.Bundle;
import java.lang.String;
import com.tencent.mm.opensdk.channel.a.a;

public class PayReq$Options	// class@000f0e
{
    public String callbackClassName;
    public int callbackFlags;

    public void PayReq$Options(){
       this.callbackFlags = -1;
    }
    public void fromBundle(Bundle p0){
       this.callbackClassName = a.a(p0, "_wxapi_payoptions_callback_classname");
       this.callbackFlags = a.a(p0, "_wxapi_payoptions_callback_flags", -1);
    }
    public void toBundle(Bundle p0){
       p0.putString("_wxapi_payoptions_callback_classname", this.callbackClassName);
       p0.putInt("_wxapi_payoptions_callback_flags", this.callbackFlags);
    }
}
