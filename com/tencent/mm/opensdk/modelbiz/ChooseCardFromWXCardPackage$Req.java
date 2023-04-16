package com.tencent.mm.opensdk.modelbiz.ChooseCardFromWXCardPackage$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.String;
import android.os.Bundle;

public class ChooseCardFromWXCardPackage$Req extends BaseReq	// class@000e8b
{
    public String appId;
    public String canMultiSelect;
    public String cardId;
    public String cardSign;
    public String cardType;
    public String locationId;
    public String nonceStr;
    public String signType;
    public String timeStamp;

    public void ChooseCardFromWXCardPackage$Req(){
       super();
    }
    public boolean checkArgs(){
       ChooseCardFromWXCardPackage$Req tappId = this.appId;
       if (tappId != null && tappId.length() > 0) {
          tappId = this.signType;
          if (tappId != null && tappId.length() > 0) {
             tappId = this.cardSign;
             if (tappId != null && tappId.length() > 0) {
                return true;
             }
          }
       }
       return false;
    }
    public int getType(){
       return 16;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_choose_card_from_wx_card_app_id", this.appId);
       p0.putString("_wxapi_choose_card_from_wx_card_location_id", this.locationId);
       p0.putString("_wxapi_choose_card_from_wx_card_sign_type", this.signType);
       p0.putString("_wxapi_choose_card_from_wx_card_card_sign", this.cardSign);
       p0.putString("_wxapi_choose_card_from_wx_card_time_stamp", this.timeStamp);
       p0.putString("_wxapi_choose_card_from_wx_card_nonce_str", this.nonceStr);
       p0.putString("_wxapi_choose_card_from_wx_card_card_id", this.cardId);
       p0.putString("_wxapi_choose_card_from_wx_card_card_type", this.cardType);
       p0.putString("_wxapi_choose_card_from_wx_card_can_multi_select", this.canMultiSelect);
    }
}
