package com.tencent.mm.opensdk.modelbiz.WXInvoiceAuthInsert$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.String;
import com.tencent.mm.opensdk.utils.b;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public final class WXInvoiceAuthInsert$Req extends BaseReq	// class@000eb4
{
    public String url;

    public void WXInvoiceAuthInsert$Req(){
       super();
    }
    public boolean checkArgs(){
       if (b.b(this.url)) {
          Log.i("MicroMsg.SDK.WXInvoiceAuthInsert.Req", "url should not be empty");
          return false;
       }else if((this.url).length() > 0x2800){
          Log.e("MicroMsg.SDK.WXInvoiceAuthInsert.Req", "url must be in 10k");
          return false;
       }else {
          return true;
       }
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.url = p0.getString("_wxapi_invoice_auth_insert_req_url");
    }
    public int getType(){
       return 20;
    }
    public void toBundle(Bundle p0){
       super.fromBundle(p0);
       p0.putString("_wxapi_invoice_auth_insert_req_url", this.url);
    }
}
