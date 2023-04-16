package com.tencent.mm.opensdk.modelbiz.WXOpenCustomerServiceChat$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import android.os.Bundle;
import java.lang.String;

public final class WXOpenCustomerServiceChat$Req extends BaseReq	// class@000eca
{
    public String corpId;
    public String url;

    public void WXOpenCustomerServiceChat$Req(){
       super();
       this.corpId = "";
       this.url = "";
    }
    public boolean checkArgs(){
       return true;
    }
    public int getType(){
       return 37;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_open_customer_service_chat_corpId", this.corpId);
       p0.putString("_open_customer_service_chat_url", this.url);
    }
}
