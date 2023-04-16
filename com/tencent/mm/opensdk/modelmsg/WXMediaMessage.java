package com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import java.lang.Object;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.OutputStream;
import java.lang.StringBuilder;
import java.lang.Exception;

public final class WXMediaMessage	// class@000efd
{
    public String description;
    public WXMediaMessage$IMediaObject mediaObject;
    public String mediaTagName;
    public String messageAction;
    public String messageExt;
    public int sdkVer;
    public byte[] thumbData;
    public String title;

    public void WXMediaMessage(){
       super(null);
    }
    public void WXMediaMessage(WXMediaMessage$IMediaObject p0){
       this.mediaObject = p0;
    }
    public boolean checkArgs(){
       String str;
       if (this.getType() == 8) {
          WXMediaMessage tthumbData = this.thumbData;
          if (tthumbData == null || !tthumbData.length) {
             str = "checkArgs fail, thumbData should not be null when send emoji";
          }else if(this.getType() == 76 && b.b(this.title)){
             str = "checkArgs fail, Type = Music Video, but title == null";
          }else if(b.a(this.getType())){
             tthumbData = this.thumbData;
             if (tthumbData == null || tthumbData.length > 0x20000) {
                str = "checkArgs fail, thumbData should not be null or exceed 128kb";
             }
          }
          if (!b.a(this.getType())) {
             tthumbData = this.thumbData;
             if (tthumbData != null && tthumbData.length > 0x10000) {
                str = "checkArgs fail, thumbData is invalid";
             }
          }
          tthumbData = this.title;
          if (tthumbData != null && tthumbData.length() > 512) {
             str = "checkArgs fail, title is invalid";
          }else {
             tthumbData = this.description;
             if (tthumbData != null && tthumbData.length() > 1024) {
                str = "checkArgs fail, description is invalid";
             }else if(this.mediaObject == null){
                str = "checkArgs fail, mediaObject is null";
             }else {
                tthumbData = this.mediaTagName;
                if (tthumbData != null && tthumbData.length() > 64) {
                   str = "checkArgs fail, mediaTagName is too long";
                }else {
                   tthumbData = this.messageAction;
                   if (tthumbData != null && tthumbData.length() > 2048) {
                      str = "checkArgs fail, messageAction is too long";
                   }else {
                      tthumbData = this.messageExt;
                      if (tthumbData != null && tthumbData.length() > 2048) {
                         str = "checkArgs fail, messageExt is too long";
                      }else {
                         return this.mediaObject.checkArgs();
                      }
                   }
                }
             }
          }
       }else {
          goto label_0018 ;
       }
       Log.e("MicroMsg.SDK.WXMediaMessage", str);
       return false;
    }
    public int getType(){
       WXMediaMessage tmediaObject = this.mediaObject;
       if (tmediaObject == null) {
          return 0;
       }
       return tmediaObject.type();
    }
    public void setThumbImage(Bitmap p0){
       try{
          ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
          p0.compress(Bitmap$CompressFormat.JPEG, 85, uByteArrayOu);
          this.thumbData = uByteArrayOu.toByteArray();
          uByteArrayOu.close();
       }catch(java.lang.Exception e4){
          Log.e("MicroMsg.SDK.WXMediaMessage", "setThumbImage exception:"+e4.getMessage());
       }
       return;
    }
}
