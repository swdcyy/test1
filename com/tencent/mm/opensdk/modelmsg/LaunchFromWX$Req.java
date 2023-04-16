package com.tencent.mm.opensdk.modelmsg.LaunchFromWX$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import android.os.Bundle;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;

public class LaunchFromWX$Req extends BaseReq	// class@000edc
{
    public String country;
    public String lang;
    public String messageAction;
    public String messageExt;

    public void LaunchFromWX$Req(){
       super();
    }
    public void LaunchFromWX$Req(Bundle p0){
       super().fromBundle(p0);
    }
    public boolean checkArgs(){
       String str;
       LaunchFromWX$Req tmessageActi = this.messageAction;
       if (tmessageActi != null && tmessageActi.length() > 2048) {
          str = "checkArgs fail, messageAction is too long";
       }else {
          tmessageActi = this.messageExt;
          if (tmessageActi != null && tmessageActi.length() > 2048) {
             str = "checkArgs fail, messageExt is too long";
          }else {
             return true;
          }
       }
       Log.e("MicroMsg.SDK.LaunchFromWX.Req", str);
       return false;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.messageAction = p0.getString("_wxobject_message_action");
       this.messageExt = p0.getString("_wxobject_message_ext");
       this.lang = p0.getString("_wxapi_launch_req_lang");
       this.country = p0.getString("_wxapi_launch_req_country");
    }
    public int getType(){
       return 6;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxobject_message_action", this.messageAction);
       p0.putString("_wxobject_message_ext", this.messageExt);
       p0.putString("_wxapi_launch_req_lang", this.lang);
       p0.putString("_wxapi_launch_req_country", this.country);
    }
}
