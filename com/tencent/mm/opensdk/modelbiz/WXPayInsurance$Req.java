package com.tencent.mm.opensdk.modelbiz.WXPayInsurance$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.String;
import com.tencent.mm.opensdk.utils.b;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public final class WXPayInsurance$Req extends BaseReq	// class@000ecd
{
    public String url;

    public void WXPayInsurance$Req(){
       super();
    }
    public boolean checkArgs(){
       if (b.b(this.url)) {
          Log.i("MicroMsg.SDK.WXPayInsurance.Req", "url should not be empty");
          return false;
       }else if((this.url).length() > 0x2800){
          Log.e("MicroMsg.SDK.WXPayInsurance.Req", "url must be in 10k");
          return false;
       }else {
          return true;
       }
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.url = p0.getString("_wxapi_pay_insourance_req_url");
    }
    public int getType(){
       return 22;
    }
    public void toBundle(Bundle p0){
       super.fromBundle(p0);
       p0.putString("_wxapi_pay_insourance_req_url", this.url);
    }
}
