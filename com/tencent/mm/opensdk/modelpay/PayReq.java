package com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;
import com.tencent.mm.opensdk.channel.a.a;
import com.tencent.mm.opensdk.modelpay.PayReq$Options;

public class PayReq extends BaseReq	// class@000f0f
{
    public String appId;
    public String extData;
    public String nonceStr;
    public PayReq$Options options;
    public String packageValue;
    public String partnerId;
    public String prepayId;
    public String sign;
    public String signType;
    public String timeStamp;

    public void PayReq(){
       super();
    }
    public boolean checkArgs(){
       String str;
       PayReq tappId = this.appId;
       if (tappId == null || !tappId.length()) {
          str = "checkArgs fail, invalid appId";
       }else {
          tappId = this.partnerId;
          if (tappId == null || !tappId.length()) {
             str = "checkArgs fail, invalid partnerId";
          }else {
             tappId = this.prepayId;
             if (tappId == null || !tappId.length()) {
                str = "checkArgs fail, invalid prepayId";
             }else {
                tappId = this.nonceStr;
                if (tappId == null || !tappId.length()) {
                   str = "checkArgs fail, invalid nonceStr";
                }else {
                   tappId = this.timeStamp;
                   if (tappId == null || !tappId.length()) {
                      str = "checkArgs fail, invalid timeStamp";
                   }else {
                      tappId = this.packageValue;
                      if (tappId == null || !tappId.length()) {
                         str = "checkArgs fail, invalid packageValue";
                      }else {
                         tappId = this.sign;
                         if (tappId == null || !tappId.length()) {
                            str = "checkArgs fail, invalid sign";
                         }else {
                            tappId = this.extData;
                            if (tappId != null && tappId.length() > 1024) {
                               str = "checkArgs fail, extData length too long";
                            }else {
                               return true;
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       Log.e("MicroMsg.PaySdk.PayReq", str);
       return false;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.appId = a.a(p0, "_wxapi_payreq_appid");
       this.partnerId = a.a(p0, "_wxapi_payreq_partnerid");
       this.prepayId = a.a(p0, "_wxapi_payreq_prepayid");
       this.nonceStr = a.a(p0, "_wxapi_payreq_noncestr");
       this.timeStamp = a.a(p0, "_wxapi_payreq_timestamp");
       this.packageValue = a.a(p0, "_wxapi_payreq_packagevalue");
       this.sign = a.a(p0, "_wxapi_payreq_sign");
       this.extData = a.a(p0, "_wxapi_payreq_extdata");
       this.signType = a.a(p0, "_wxapi_payreq_sign_type");
       PayReq$Options options = new PayReq$Options();
       this.options = options;
       options.fromBundle(p0);
    }
    public int getType(){
       return 5;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_payreq_appid", this.appId);
       p0.putString("_wxapi_payreq_partnerid", this.partnerId);
       p0.putString("_wxapi_payreq_prepayid", this.prepayId);
       p0.putString("_wxapi_payreq_noncestr", this.nonceStr);
       p0.putString("_wxapi_payreq_timestamp", this.timeStamp);
       p0.putString("_wxapi_payreq_packagevalue", this.packageValue);
       p0.putString("_wxapi_payreq_sign", this.sign);
       p0.putString("_wxapi_payreq_extdata", this.extData);
       p0.putString("_wxapi_payreq_sign_type", this.signType);
       PayReq toptions = this.options;
       if (toptions != null) {
          toptions.toBundle(p0);
       }
       return;
    }
}
