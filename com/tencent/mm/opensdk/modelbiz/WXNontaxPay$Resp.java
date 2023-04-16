package com.tencent.mm.opensdk.modelbiz.WXNontaxPay$Resp;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import android.os.Bundle;
import java.lang.String;

public final class WXNontaxPay$Resp extends BaseResp	// class@000ec2
{
    public String wxOrderId;

    public void WXNontaxPay$Resp(){
       super();
    }
    public boolean checkArgs(){
       return true;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.wxOrderId = p0.getString("_wxapi_nontax_pay_order_id");
    }
    public int getType(){
       return 21;
    }
    public void toBundle(Bundle p0){
       super.fromBundle(p0);
       p0.putString("_wxapi_nontax_pay_order_id", this.wxOrderId);
    }
}
