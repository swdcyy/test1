package com.tencent.mm.opensdk.modelbiz.WXPayInsurance$Resp;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import android.os.Bundle;
import java.lang.String;

public final class WXPayInsurance$Resp extends BaseResp	// class@000ece
{
    public String wxOrderId;

    public void WXPayInsurance$Resp(){
       super();
    }
    public boolean checkArgs(){
       return true;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.wxOrderId = p0.getString("_wxapi_pay_insourance_order_id");
    }
    public int getType(){
       return 22;
    }
    public void toBundle(Bundle p0){
       super.fromBundle(p0);
       p0.putString("_wxapi_pay_insourance_order_id", this.wxOrderId);
    }
}
