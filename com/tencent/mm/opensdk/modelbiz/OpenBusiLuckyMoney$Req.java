package com.tencent.mm.opensdk.modelbiz.OpenBusiLuckyMoney$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.String;
import android.os.Bundle;

public class OpenBusiLuckyMoney$Req extends BaseReq	// class@000e98
{
    public String appId;
    public String nonceStr;
    public String packageExt;
    public String signType;
    public String signature;
    public String timeStamp;

    public void OpenBusiLuckyMoney$Req(){
       super();
    }
    public boolean checkArgs(){
       OpenBusiLuckyMoney$Req tappId = this.appId;
       if (tappId != null && tappId.length() > 0) {
          tappId = this.timeStamp;
          if (tappId != null && tappId.length() > 0) {
             tappId = this.nonceStr;
             if (tappId != null && tappId.length() > 0) {
                tappId = this.signType;
                if (tappId != null && tappId.length() > 0) {
                   tappId = this.signature;
                   if (tappId != null && tappId.length() > 0) {
                      return true;
                   }
                }
             }
          }
       }
       return false;
    }
    public int getType(){
       return 13;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_open_busi_lucky_money_appid", this.appId);
       p0.putString("_wxapi_open_busi_lucky_money_timeStamp", this.timeStamp);
       p0.putString("_wxapi_open_busi_lucky_money_nonceStr", this.nonceStr);
       p0.putString("_wxapi_open_busi_lucky_money_signType", this.signType);
       p0.putString("_wxapi_open_busi_lucky_money_signature", this.signature);
       p0.putString("_wxapi_open_busi_lucky_money_package", this.packageExt);
    }
}
