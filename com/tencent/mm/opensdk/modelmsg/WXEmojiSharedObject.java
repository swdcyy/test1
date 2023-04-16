package com.tencent.mm.opensdk.modelmsg.WXEmojiSharedObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public class WXEmojiSharedObject implements WXMediaMessage$IMediaObject	// class@000ef3
{
    public int packageflag;
    public String packageid;
    public String thumburl;
    public String url;

    public void WXEmojiSharedObject(){
       super();
    }
    public void WXEmojiSharedObject(String p0,int p1,String p2,String p3){
       super();
       this.thumburl = p0;
       this.packageflag = p1;
       this.packageid = p2;
       this.url = p3;
    }
    public boolean checkArgs(){
       if (TextUtils.isEmpty(this.packageid) || (TextUtils.isEmpty(this.thumburl) || (!TextUtils.isEmpty(this.url) && this.packageflag != -1))) {
          return true;
       }
       Log.e("MicroMsg.SDK.WXEmojiSharedObject", "checkArgs fail, packageid or thumburl is invalid");
       return false;
    }
    public void serialize(Bundle p0){
       p0.putString("_wxemojisharedobject_thumburl", this.thumburl);
       p0.putInt("_wxemojisharedobject_packageflag", this.packageflag);
       p0.putString("_wxemojisharedobject_packageid", this.packageid);
       p0.putString("_wxemojisharedobject_url", this.url);
    }
    public int type(){
       return 15;
    }
    public void unserialize(Bundle p0){
       this.thumburl = p0.getString("_wxwebpageobject_thumburl");
       this.packageflag = p0.getInt("_wxwebpageobject_packageflag");
       this.packageid = p0.getString("_wxwebpageobject_packageid");
       this.url = p0.getString("_wxwebpageobject_url");
    }
}
