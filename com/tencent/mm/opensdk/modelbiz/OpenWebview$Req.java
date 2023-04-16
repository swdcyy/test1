package com.tencent.mm.opensdk.modelbiz.OpenWebview$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.String;
import android.os.Bundle;
import java.net.URLEncoder;

public class OpenWebview$Req extends BaseReq	// class@000e9c
{
    public String url;

    public void OpenWebview$Req(){
       super();
    }
    public boolean checkArgs(){
       OpenWebview$Req turl = this.url;
       if (turl == null || turl.length() < 0) {
          return false;
       }
       if ((this.url).length() > 0x2800) {
          return false;
       }
       return true;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.url = p0.getString("_wxapi_jump_to_webview_url");
    }
    public int getType(){
       return 12;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_jump_to_webview_url", URLEncoder.encode(this.url));
    }
}
