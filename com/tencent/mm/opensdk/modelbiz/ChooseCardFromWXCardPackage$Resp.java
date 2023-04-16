package com.tencent.mm.opensdk.modelbiz.ChooseCardFromWXCardPackage$Resp;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import android.os.Bundle;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;

public class ChooseCardFromWXCardPackage$Resp extends BaseResp	// class@000e8c
{
    public String cardItemList;

    public void ChooseCardFromWXCardPackage$Resp(){
       super();
    }
    public void ChooseCardFromWXCardPackage$Resp(Bundle p0){
       super().fromBundle(p0);
    }
    public boolean checkArgs(){
       ChooseCardFromWXCardPackage$Resp tcardItemLis = this.cardItemList;
       if (tcardItemLis == null || !tcardItemLis.length()) {
          return false;
       }
       return true;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       String str = p0.getString("_wxapi_choose_card_from_wx_card_list");
       if (str != null && str.length() > 0) {
          this.cardItemList = str;
       }else {
          Log.i("MicroMsg.ChooseCardFromWXCardPackage", "cardItemList is empty!");
       }
       return;
    }
    public int getType(){
       return 16;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_choose_card_from_wx_card_list", this.cardItemList);
    }
}
