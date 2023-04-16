package com.tencent.mm.opensdk.modelbiz.SubscribeMessage$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import android.os.Bundle;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;

public class SubscribeMessage$Req extends BaseReq	// class@000e9f
{
    public String reserved;
    public int scene;
    public String templateID;

    public void SubscribeMessage$Req(){
       super();
    }
    public void SubscribeMessage$Req(Bundle p0){
       super().fromBundle(p0);
    }
    public boolean checkArgs(){
       String str;
       SubscribeMessage$Req ttemplateID = this.templateID;
       if (ttemplateID == null || !ttemplateID.length()) {
          str = "checkArgs fail, templateID is null";
       }else if((this.templateID).length() > 1024){
          str = "checkArgs fail, templateID is too long";
       }else {
          ttemplateID = this.reserved;
          if (ttemplateID != null && ttemplateID.length() > 1024) {
             str = "checkArgs fail, reserved is too long";
          }else {
             return true;
          }
       }
       Log.e("MicroMsg.SDK.SubscribeMessage.Req", str);
       return false;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.scene = p0.getInt("_wxapi_subscribemessage_req_scene");
       this.templateID = p0.getString("_wxapi_subscribemessage_req_templateid");
       this.reserved = p0.getString("_wxapi_subscribemessage_req_reserved");
    }
    public int getType(){
       return 18;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putInt("_wxapi_subscribemessage_req_scene", this.scene);
       p0.putString("_wxapi_subscribemessage_req_templateid", this.templateID);
       p0.putString("_wxapi_subscribemessage_req_reserved", this.reserved);
    }
}
