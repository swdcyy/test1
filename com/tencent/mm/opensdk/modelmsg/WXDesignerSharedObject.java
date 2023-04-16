package com.tencent.mm.opensdk.modelmsg.WXDesignerSharedObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public class WXDesignerSharedObject implements WXMediaMessage$IMediaObject	// class@000eef
{
    public String designerName;
    public String designerRediretctUrl;
    public int designerUIN;
    public String thumburl;
    public String url;

    public void WXDesignerSharedObject(){
       super();
    }
    public void WXDesignerSharedObject(String p0,int p1,String p2,String p3){
       super();
       this.url = p2;
       this.thumburl = p0;
       this.designerUIN = p1;
       this.designerName = p3;
    }
    public boolean checkArgs(){
       if (this.designerUIN == null || (!TextUtils.isEmpty(this.thumburl) && !TextUtils.isEmpty(this.url))) {
          return true;
       }
       Log.e("MicroMsg.SDK.WXEmojiSharedObject", "checkArgs fail, packageid or thumburl is invalid");
       return false;
    }
    public void serialize(Bundle p0){
       p0.putString("_wxemojisharedobject_thumburl", this.thumburl);
       p0.putInt("_wxemojisharedobject_designer_uin", this.designerUIN);
       p0.putString("_wxemojisharedobject_designer_name", this.designerName);
       p0.putString("_wxemojisharedobject_designer_rediretcturl", this.designerRediretctUrl);
       p0.putString("_wxemojisharedobject_url", this.url);
    }
    public int type(){
       return 25;
    }
    public void unserialize(Bundle p0){
       this.thumburl = p0.getString("_wxwebpageobject_thumburl");
       this.designerUIN = p0.getInt("_wxemojisharedobject_designer_uin");
       this.designerName = p0.getString("_wxemojisharedobject_designer_name");
       this.designerRediretctUrl = p0.getString("_wxemojisharedobject_designer_rediretcturl");
       this.url = p0.getString("_wxwebpageobject_url");
    }
}
