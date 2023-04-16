package com.tencent.mm.opensdk.modelmsg.SendAuth$Options;
import java.lang.Object;
import android.os.Bundle;
import java.lang.String;
import com.tencent.mm.opensdk.channel.a.a;

public class SendAuth$Options	// class@000edf
{
    public String callbackClassName;
    public int callbackFlags;

    public void SendAuth$Options(){
       this.callbackFlags = -1;
    }
    public void fromBundle(Bundle p0){
       this.callbackClassName = a.a(p0, "_wxapi_sendauth_options_callback_classname");
       this.callbackFlags = a.a(p0, "_wxapi_sendauth_options_callback_flags", -1);
    }
    public void toBundle(Bundle p0){
       p0.putString("_wxapi_sendauth_options_callback_classname", this.callbackClassName);
       p0.putInt("_wxapi_sendauth_options_callback_flags", this.callbackFlags);
    }
}
