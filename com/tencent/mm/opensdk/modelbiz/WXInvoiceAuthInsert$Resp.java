package com.tencent.mm.opensdk.modelbiz.WXInvoiceAuthInsert$Resp;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import android.os.Bundle;
import java.lang.String;

public final class WXInvoiceAuthInsert$Resp extends BaseResp	// class@000eb5
{
    public String wxOrderId;

    public void WXInvoiceAuthInsert$Resp(){
       super();
    }
    public boolean checkArgs(){
       return true;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.wxOrderId = p0.getString("_wxapi_invoice_auth_insert_order_id");
    }
    public int getType(){
       return 20;
    }
    public void toBundle(Bundle p0){
       super.fromBundle(p0);
       p0.putString("_wxapi_invoice_auth_insert_order_id", this.wxOrderId);
    }
}
