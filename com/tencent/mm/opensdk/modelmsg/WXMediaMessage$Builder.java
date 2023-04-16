package com.tencent.mm.opensdk.modelmsg.WXMediaMessage$Builder;
import java.lang.Object;
import android.os.Bundle;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.String;
import java.lang.Class;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.tencent.mm.opensdk.utils.Log;
import java.lang.CharSequence;

public class WXMediaMessage$Builder	// class@000efb
{

    public void WXMediaMessage$Builder(){
       super();
    }
    public static WXMediaMessage fromBundle(Bundle p0){
       WXMediaMessage wXMediaMessa;
       String str;
       try{
          wXMediaMessa = new WXMediaMessage();
          wXMediaMessa.sdkVer = p0.getInt("_wxobject_sdkVer");
          wXMediaMessa.title = p0.getString("_wxobject_title");
          wXMediaMessa.description = p0.getString("_wxobject_description");
          wXMediaMessa.thumbData = p0.getByteArray("_wxobject_thumbdata");
          wXMediaMessa.mediaTagName = p0.getString("_wxobject_mediatagname");
          wXMediaMessa.messageAction = p0.getString("_wxobject_message_action");
          wXMediaMessa.messageExt = p0.getString("_wxobject_message_ext");
          str = WXMediaMessage$Builder.pathOldToNew(p0.getString("_wxobject_identifier_"));
          if (str == null || str.length() <= 0) {
          }else {
             WXMediaMessage$IMediaObject iMediaObject = Class.forName(str).newInstance();
             wXMediaMessa.mediaObject = iMediaObject;
             iMediaObject.unserialize(p0);
             return wXMediaMessa;
          }
       }catch(java.lang.Exception e4){
          Log.e("MicroMsg.SDK.WXMediaMessage", "get media object from bundle failed: unknown ident "+str+", ex = "+e4.getMessage());
       }
       return wXMediaMessa;
    }
    public static String pathNewToOld(String p0){
       if (p0 != null && p0.length()) {
          return p0.replace("com.tencent.mm.opensdk.modelmsg", "com.tencent.mm.sdk.openapi");
       }
       Log.e("MicroMsg.SDK.WXMediaMessage", "pathNewToOld fail, newPath is null");
       return p0;
    }
    public static String pathOldToNew(String p0){
       String str = "MicroMsg.SDK.WXMediaMessage";
       Log.i(str, "pathOldToNew, oldPath = "+p0);
       if (p0 == null || !p0.length()) {
          Log.e(str, "pathOldToNew fail, oldPath is null");
          return p0;
       }else {
          int i = p0.lastIndexOf(46);
          if (i != -1) {
             return "com.tencent.mm.opensdk.modelmsg"+p0.substring(i);
          }
          Log.e(str, "pathOldToNew fail, invalid pos, oldPath = "+p0);
          return p0;
       }
    }
    public static Bundle toBundle(WXMediaMessage p0){
       Bundle uBundle = new Bundle();
       uBundle.putInt("_wxobject_sdkVer", p0.sdkVer);
       uBundle.putString("_wxobject_title", p0.title);
       uBundle.putString("_wxobject_description", p0.description);
       uBundle.putByteArray("_wxobject_thumbdata", p0.thumbData);
       WXMediaMessage mediaObject = p0.mediaObject;
       if (mediaObject != null) {
          uBundle.putString("_wxobject_identifier_", WXMediaMessage$Builder.pathNewToOld(mediaObject.getClass().getName()));
          p0.mediaObject.serialize(uBundle);
       }
       uBundle.putString("_wxobject_mediatagname", p0.mediaTagName);
       uBundle.putString("_wxobject_message_action", p0.messageAction);
       uBundle.putString("_wxobject_message_ext", p0.messageExt);
       return uBundle;
    }
}
