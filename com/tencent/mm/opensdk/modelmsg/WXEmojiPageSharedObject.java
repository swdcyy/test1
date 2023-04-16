package com.tencent.mm.opensdk.modelmsg.WXEmojiPageSharedObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import java.lang.Object;
import java.lang.String;
import com.tencent.mm.opensdk.utils.b;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public class WXEmojiPageSharedObject implements WXMediaMessage$IMediaObject	// class@000ef2
{
    public String desc;
    public String iconUrl;
    public int pageType;
    public String secondUrl;
    public int tid;
    public String title;
    public int type;
    public String url;

    public void WXEmojiPageSharedObject(){
       super();
    }
    public void WXEmojiPageSharedObject(int p0,int p1,String p2,String p3,String p4,String p5,int p6,String p7){
       super();
       this.tid = p1;
       this.title = p2;
       this.desc = p3;
       this.iconUrl = p4;
       this.secondUrl = p5;
       this.pageType = p6;
       this.url = p7;
       this.type = p0;
    }
    public boolean checkArgs(){
       if (!b.b(this.title) && !b.b(this.iconUrl)) {
          return true;
       }
       Log.e("MicroMsg.SDK.WXEmojiSharedObject", "checkArgs fail, title or iconUrl is invalid");
       return false;
    }
    public void serialize(Bundle p0){
       p0.putInt("_wxemojisharedobject_tid", this.tid);
       p0.putString("_wxemojisharedobject_title", this.title);
       p0.putString("_wxemojisharedobject_desc", this.desc);
       p0.putString("_wxemojisharedobject_iconurl", this.iconUrl);
       p0.putString("_wxemojisharedobject_secondurl", this.secondUrl);
       p0.putInt("_wxemojisharedobject_pagetype", this.pageType);
       p0.putString("_wxwebpageobject_url", this.url);
    }
    public int type(){
       return this.type;
    }
    public void unserialize(Bundle p0){
       this.tid = p0.getInt("_wxemojisharedobject_tid");
       this.title = p0.getString("_wxemojisharedobject_title");
       this.desc = p0.getString("_wxemojisharedobject_desc");
       this.iconUrl = p0.getString("_wxemojisharedobject_iconurl");
       this.secondUrl = p0.getString("_wxemojisharedobject_secondurl");
       this.pageType = p0.getInt("_wxemojisharedobject_pagetype");
       this.url = p0.getString("_wxwebpageobject_url");
    }
}
