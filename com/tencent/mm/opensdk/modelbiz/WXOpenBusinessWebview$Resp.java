package com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview$Resp;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import android.os.Bundle;
import java.lang.String;

public class WXOpenBusinessWebview$Resp extends BaseResp	// class@000ec8
{
    public int businessType;
    public String resultInfo;

    public void WXOpenBusinessWebview$Resp(){
       super();
    }
    public void WXOpenBusinessWebview$Resp(Bundle p0){
       super().fromBundle(p0);
    }
    public boolean checkArgs(){
       return true;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.resultInfo = p0.getString("_wxapi_open_business_webview_result");
       this.businessType = p0.getInt("_wxapi_open_business_webview_query_type", 0);
    }
    public int getType(){
       return 25;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_open_business_webview_result", this.resultInfo);
       p0.putInt("_wxapi_open_business_webview_query_type", this.businessType);
    }
}
