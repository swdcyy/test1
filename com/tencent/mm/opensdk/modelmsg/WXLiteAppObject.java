package com.tencent.mm.opensdk.modelmsg.WXLiteAppObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import java.lang.Object;
import java.lang.String;
import com.tencent.mm.opensdk.utils.b;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public class WXLiteAppObject implements WXMediaMessage$IMediaObject	// class@000ef9
{
    public String path;
    public String query;
    public String userName;
    public String webpageUrl;

    public void WXLiteAppObject(){
       super();
    }
    public boolean checkArgs(){
       if (!b.b(this.userName)) {
          return true;
       }
       Log.e("MicroMsg.SDK.WXLiteAppObject", "userName is null");
       return false;
    }
    public void serialize(Bundle p0){
       p0.putString("_wxliteapp_webpageurl", this.webpageUrl);
       p0.putString("_wxliteapp_username", this.userName);
       p0.putString("_wxliteapp_path", this.path);
       p0.putString("_wxliteapp_query", this.query);
    }
    public int type(){
       return 68;
    }
    public void unserialize(Bundle p0){
       this.webpageUrl = p0.getString("_wxliteapp_webpageurl");
       this.userName = p0.getString("_wxliteapp_username");
       this.path = p0.getString("_wxliteapp_path");
       this.query = p0.getString("_wxliteapp_query");
    }
}
