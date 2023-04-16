package com.tencent.mm.opensdk.modelbiz.OpenWebview$Resp;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import android.os.Bundle;
import java.lang.String;

public class OpenWebview$Resp extends BaseResp	// class@000e9d
{
    public String result;

    public void OpenWebview$Resp(){
       super();
    }
    public void OpenWebview$Resp(Bundle p0){
       super().fromBundle(p0);
    }
    public boolean checkArgs(){
       return true;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.result = p0.getString("_wxapi_open_webview_result");
    }
    public int getType(){
       return 12;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_open_webview_result", this.result);
    }
}
