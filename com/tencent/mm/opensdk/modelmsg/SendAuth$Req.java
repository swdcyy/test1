package com.tencent.mm.opensdk.modelmsg.SendAuth$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import android.os.Bundle;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.modelmsg.SendAuth$Options;

public class SendAuth$Req extends BaseReq	// class@000ee0
{
    public String extData;
    public SendAuth$Options options;
    public String scope;
    public String state;

    public void SendAuth$Req(){
       super();
    }
    public void SendAuth$Req(Bundle p0){
       super().fromBundle(p0);
    }
    public boolean checkArgs(){
       String str;
       SendAuth$Req tscope = this.scope;
       if (tscope != null && (!tscope.length() || (this.scope).length() > 1024)) {
          str = "checkArgs fail, scope is invalid";
       }else {
          tscope = this.state;
          if (tscope != null && tscope.length() > 1024) {
             str = "checkArgs fail, state is invalid";
          }else {
             return true;
          }
       }
       Log.e("MicroMsg.SDK.SendAuth.Req", str);
       return false;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.scope = p0.getString("_wxapi_sendauth_req_scope");
       this.state = p0.getString("_wxapi_sendauth_req_state");
       this.extData = p0.getString("_wxapi_sendauth_req_ext_data");
       SendAuth$Options options = new SendAuth$Options();
       this.options = options;
       options.fromBundle(p0);
    }
    public int getType(){
       return 1;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_sendauth_req_scope", this.scope);
       p0.putString("_wxapi_sendauth_req_state", this.state);
       p0.putString("_wxapi_sendauth_req_ext_data", this.extData);
       SendAuth$Req toptions = this.options;
       if (toptions != null) {
          toptions.toBundle(p0);
       }
       return;
    }
}
