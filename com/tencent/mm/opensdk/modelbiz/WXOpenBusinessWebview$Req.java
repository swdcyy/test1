package com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import android.os.Bundle;
import java.lang.String;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.HashMap;

public class WXOpenBusinessWebview$Req extends BaseReq	// class@000ec7
{
    public int businessType;
    public HashMap queryInfo;

    public void WXOpenBusinessWebview$Req(){
       super();
    }
    public boolean checkArgs(){
       return true;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.queryInfo = SerializableHook.getSerializable(p0, "_wxapi_open_business_webview_query_info");
       this.businessType = p0.getInt("_wxapi_open_business_webview_query_type", 0);
    }
    public int getType(){
       return 25;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       SerializableHook.putSerializable(p0, "_wxapi_open_business_webview_query_info", this.queryInfo);
       p0.putInt("_wxapi_open_business_webview_query_type", this.businessType);
    }
}
