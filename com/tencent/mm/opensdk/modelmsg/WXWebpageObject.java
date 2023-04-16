package com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import java.lang.Object;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import java.util.HashMap;
import com.tencent.mm.opensdk.utils.b;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public class WXWebpageObject implements WXMediaMessage$IMediaObject	// class@000f0a
{
    public String canvasPageXml;
    public String extInfo;
    public HashMap extraInfoMap;
    public boolean isSecretMessage;
    public String webpageUrl;

    public void WXWebpageObject(){
       super();
       this.isSecretMessage = false;
       this.extraInfoMap = null;
    }
    public void WXWebpageObject(String p0){
       super();
       this.isSecretMessage = false;
       this.extraInfoMap = null;
       this.webpageUrl = p0;
    }
    public boolean checkArgs(){
       WXWebpageObject twebpageUrl = this.webpageUrl;
       if (twebpageUrl == null || (twebpageUrl.length() && (this.webpageUrl).length() <= 0x2800)) {
          return true;
       }
       Log.e("MicroMsg.SDK.WXWebpageObject", "checkArgs fail, webpageUrl is invalid");
       return false;
    }
    public String getExtra(String p0,String p1){
       WXWebpageObject textraInfoMa = this.extraInfoMap;
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
       p0.putString("_wxwebpageobject_extInfo", this.extInfo);
       p0.putString("_wxwebpageobject_webpageUrl", this.webpageUrl);
       p0.putString("_wxwebpageobject_canvaspagexml", this.canvasPageXml);
       p0.putBoolean("_wxwebpageobject_issecretmsg", this.isSecretMessage);
       WXWebpageObject textraInfoMa = this.extraInfoMap;
       if (textraInfoMa != null) {
          SerializableHook.putSerializable(p0, "_wxwebpageobject_extrainfo", textraInfoMa);
       }
       return;
    }
    public int type(){
       return 5;
    }
    public void unserialize(Bundle p0){
       this.extInfo = p0.getString("_wxwebpageobject_extInfo");
       this.webpageUrl = p0.getString("_wxwebpageobject_webpageUrl");
       this.canvasPageXml = p0.getString("_wxwebpageobject_canvaspagexml");
       this.isSecretMessage = p0.getBoolean("_wxwebpageobject_issecretmsg");
       Serializable serializable = SerializableHook.getSerializable(p0, "_wxwebpageobject_extrainfo");
       if (serializable != null) {
          this.extraInfoMap = serializable;
       }
       return;
    }
}
