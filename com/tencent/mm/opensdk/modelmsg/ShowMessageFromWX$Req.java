package com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import android.os.Bundle;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.String;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$Builder;

public class ShowMessageFromWX$Req extends BaseReq	// class@000ee9
{
    public String country;
    public String lang;
    public WXMediaMessage message;

    public void ShowMessageFromWX$Req(){
       super();
    }
    public void ShowMessageFromWX$Req(Bundle p0){
       super().fromBundle(p0);
    }
    public boolean checkArgs(){
       ShowMessageFromWX$Req tmessage = this.message;
       if (tmessage == null) {
          return false;
       }
       return tmessage.checkArgs();
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.lang = p0.getString("_wxapi_showmessage_req_lang");
       this.country = p0.getString("_wxapi_showmessage_req_country");
       this.message = WXMediaMessage$Builder.fromBundle(p0);
    }
    public int getType(){
       return 4;
    }
    public void toBundle(Bundle p0){
       Bundle uBundle = WXMediaMessage$Builder.toBundle(this.message);
       super.toBundle(uBundle);
       p0.putString("_wxapi_showmessage_req_lang", this.lang);
       p0.putString("_wxapi_showmessage_req_country", this.country);
       p0.putAll(uBundle);
    }
}
