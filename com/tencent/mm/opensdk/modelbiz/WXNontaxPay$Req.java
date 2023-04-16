package com.tencent.mm.opensdk.modelbiz.WXNontaxPay$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.String;
import com.tencent.mm.opensdk.utils.b;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public final class WXNontaxPay$Req extends BaseReq	// class@000ec1
{
    public String url;

    public void WXNontaxPay$Req(){
       super();
    }
    public boolean checkArgs(){
       if (b.b(this.url)) {
          Log.i("MicroMsg.SDK.WXNontaxPay.Req", "url should not be empty");
          return false;
       }else if((this.url).length() > 0x2800){
          Log.e("MicroMsg.SDK.WXNontaxPay.Req", "url must be in 10k");
          return false;
       }else {
          return true;
       }
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.url = p0.getString("_wxapi_nontax_pay_req_url");
    }
    public int getType(){
       return 21;
    }
    public void toBundle(Bundle p0){
       super.fromBundle(p0);
       p0.putString("_wxapi_nontax_pay_req_url", this.url);
    }
}
