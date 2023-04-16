package com.tencent.mm.opensdk.modelmsg.GetMessageFromWX$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import android.os.Bundle;
import java.lang.String;

public class GetMessageFromWX$Req extends BaseReq	// class@000ed9
{
    public String country;
    public String lang;
    public String username;

    public void GetMessageFromWX$Req(){
       super();
    }
    public void GetMessageFromWX$Req(Bundle p0){
       super().fromBundle(p0);
    }
    public boolean checkArgs(){
       return true;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.lang = p0.getString("_wxapi_getmessage_req_lang");
       this.country = p0.getString("_wxapi_getmessage_req_country");
    }
    public int getType(){
       return 3;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_getmessage_req_lang", this.lang);
       p0.putString("_wxapi_getmessage_req_country", this.country);
    }
}
