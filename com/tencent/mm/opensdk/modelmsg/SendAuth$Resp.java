package com.tencent.mm.opensdk.modelmsg.SendAuth$Resp;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import android.os.Bundle;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;

public class SendAuth$Resp extends BaseResp	// class@000ee1
{
    public boolean authResult;
    public String code;
    public String country;
    public String lang;
    public String state;
    public String url;

    public void SendAuth$Resp(){
       this.authResult = false;
    }
    public void SendAuth$Resp(Bundle p0){
       super();
       this.authResult = false;
       this.fromBundle(p0);
    }
    public boolean checkArgs(){
       SendAuth$Resp tstate = this.state;
       if (tstate == null || tstate.length() <= 1024) {
          return true;
       }
       Log.e("MicroMsg.SDK.SendAuth.Resp", "checkArgs fail, state is invalid");
       return false;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.code = p0.getString("_wxapi_sendauth_resp_token");
       this.state = p0.getString("_wxapi_sendauth_resp_state");
       this.url = p0.getString("_wxapi_sendauth_resp_url");
       this.lang = p0.getString("_wxapi_sendauth_resp_lang");
       this.country = p0.getString("_wxapi_sendauth_resp_country");
       this.authResult = p0.getBoolean("_wxapi_sendauth_resp_auth_result");
    }
    public int getType(){
       return 1;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_sendauth_resp_token", this.code);
       p0.putString("_wxapi_sendauth_resp_state", this.state);
       p0.putString("_wxapi_sendauth_resp_url", this.url);
       p0.putString("_wxapi_sendauth_resp_lang", this.lang);
       p0.putString("_wxapi_sendauth_resp_country", this.country);
       p0.putBoolean("_wxapi_sendauth_resp_auth_result", this.authResult);
    }
}
