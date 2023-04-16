package com.tencent.mm.opensdk.modelbiz.SubscribeMessage$Resp;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import android.os.Bundle;
import java.lang.String;

public class SubscribeMessage$Resp extends BaseResp	// class@000ea0
{
    public String action;
    public String reserved;
    public int scene;
    public String templateID;

    public void SubscribeMessage$Resp(){
       super();
    }
    public void SubscribeMessage$Resp(Bundle p0){
       super().fromBundle(p0);
    }
    public boolean checkArgs(){
       return true;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.templateID = p0.getString("_wxapi_subscribemessage_resp_templateid");
       this.scene = p0.getInt("_wxapi_subscribemessage_resp_scene");
       this.action = p0.getString("_wxapi_subscribemessage_resp_action");
       this.reserved = p0.getString("_wxapi_subscribemessage_resp_reserved");
    }
    public int getType(){
       return 18;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_subscribemessage_resp_templateid", this.templateID);
       p0.putInt("_wxapi_subscribemessage_resp_scene", this.scene);
       p0.putString("_wxapi_subscribemessage_resp_action", this.action);
       p0.putString("_wxapi_subscribemessage_resp_reserved", this.reserved);
    }
}
