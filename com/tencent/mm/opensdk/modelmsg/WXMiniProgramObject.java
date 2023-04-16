package com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import java.lang.Object;
import java.lang.String;
import com.tencent.mm.opensdk.utils.b;
import com.tencent.mm.opensdk.utils.Log;
import java.util.HashMap;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public class WXMiniProgramObject implements WXMediaMessage$IMediaObject	// class@000efe
{
    public int disableforward;
    public HashMap extraInfoMap;
    public boolean isSecretMessage;
    public boolean isUpdatableMessage;
    public int miniprogramType;
    public String path;
    public String userName;
    public String webpageUrl;
    public boolean withShareTicket;

    public void WXMiniProgramObject(){
       super();
       this.miniprogramType = 0;
       this.disableforward = 0;
       this.isUpdatableMessage = false;
       this.isSecretMessage = false;
       this.extraInfoMap = null;
    }
    public boolean checkArgs(){
       String str;
       if (b.b(this.webpageUrl)) {
          str = "webPageUrl is null";
       }else if(b.b(this.userName)){
          str = "userName is null";
       }else {
          WXMiniProgramObject tminiprogram = this.miniprogramType;
          if (tminiprogram < null || tminiprogram > 2) {
             str = "miniprogram type should between MINIPTOGRAM_TYPE_RELEASE and MINIPROGRAM_TYPE_PREVIEW";
          }else {
             return true;
          }
       }
       Log.e("MicroMsg.SDK.WXMiniProgramObject", str);
       return false;
    }
    public String getExtra(String p0,String p1){
       WXMiniProgramObject textraInfoMa = this.extraInfoMap;
       if (textraInfoMa == null) {
          return null;
       }
       p0 = textraInfoMa.get(p0);
       if (p0 != null) {
          p1 = p0;
       }
       return p1;
    }
    public void putExtra(String p0,String p1){
       if (this.extraInfoMap == null) {
          this.extraInfoMap = new HashMap();
       }
       if (!b.b(p0)) {
          this.extraInfoMap.put(p0, p1);
       }
       return;
    }
    public void serialize(Bundle p0){
       p0.putString("_wxminiprogram_webpageurl", this.webpageUrl);
       p0.putString("_wxminiprogram_username", this.userName);
       p0.putString("_wxminiprogram_path", this.path);
       p0.putBoolean("_wxminiprogram_withsharetiket", this.withShareTicket);
       p0.putInt("_wxminiprogram_type", this.miniprogramType);
       p0.putInt("_wxminiprogram_disableforward", this.disableforward);
       p0.putBoolean("_wxminiprogram_isupdatablemsg", this.isUpdatableMessage);
       p0.putBoolean("_wxminiprogram_issecretmsg", this.isSecretMessage);
       WXMiniProgramObject textraInfoMa = this.extraInfoMap;
       if (textraInfoMa != null) {
          SerializableHook.putSerializable(p0, "_wxminiprogram_extrainfo", textraInfoMa);
       }
       return;
    }
    public int type(){
       return 36;
    }
    public void unserialize(Bundle p0){
       this.webpageUrl = p0.getString("_wxminiprogram_webpageurl");
       this.userName = p0.getString("_wxminiprogram_username");
       this.path = p0.getString("_wxminiprogram_path");
       this.withShareTicket = p0.getBoolean("_wxminiprogram_withsharetiket");
       this.miniprogramType = p0.getInt("_wxminiprogram_type");
       this.disableforward = p0.getInt("_wxminiprogram_disableforward");
       this.isUpdatableMessage = p0.getBoolean("_wxminiprogram_isupdatablemsg");
       this.isSecretMessage = p0.getBoolean("_wxminiprogram_issecretmsg");
       this.extraInfoMap = SerializableHook.getSerializable(p0, "_wxminiprogram_extrainfo");
    }
}
