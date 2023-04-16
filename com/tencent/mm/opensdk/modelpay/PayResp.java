package com.tencent.mm.opensdk.modelpay.PayResp;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import android.os.Bundle;
import java.lang.String;

public class PayResp extends BaseResp	// class@000f10
{
    public String extData;
    public String prepayId;
    public String returnKey;

    public void PayResp(){
       super();
    }
    public void PayResp(Bundle p0){
       super().fromBundle(p0);
    }
    public boolean checkArgs(){
       return true;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.prepayId = p0.getString("_wxapi_payresp_prepayid");
       this.returnKey = p0.getString("_wxapi_payresp_returnkey");
       this.extData = p0.getString("_wxapi_payresp_extdata");
    }
    public int getType(){
       return 5;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_payresp_prepayid", this.prepayId);
       p0.putString("_wxapi_payresp_returnkey", this.returnKey);
       p0.putString("_wxapi_payresp_extdata", this.extData);
    }
}
