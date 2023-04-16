package com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import java.lang.Object;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;
import android.os.Bundle;

public class WXAppExtendObject implements WXMediaMessage$IMediaObject	// class@000eec
{
    public String extInfo;
    public byte[] fileData;
    public String filePath;

    public void WXAppExtendObject(){
       super();
    }
    public void WXAppExtendObject(String p0,String p1){
       super();
       this.extInfo = p0;
       this.filePath = p1;
    }
    public void WXAppExtendObject(String p0,byte[] p1){
       super();
       this.extInfo = p0;
       this.fileData = p1;
    }
    public boolean checkArgs(){
       String str;
       WXAppExtendObject textInfo = this.extInfo;
       if (textInfo == null || !textInfo.length()) {
          textInfo = this.filePath;
          if (textInfo == null || !textInfo.length()) {
             textInfo = this.fileData;
             if (textInfo == null || !textInfo.length) {
                str = "checkArgs fail, all arguments is null";
             }else {
             label_001f :
                textInfo = this.extInfo;
                if (textInfo != null && textInfo.length() > 2048) {
                   str = "checkArgs fail, extInfo is invalid";
                }else {
                   textInfo = this.filePath;
                   if (textInfo != null && textInfo.length() > 0x2800) {
                      str = "checkArgs fail, filePath is invalid";
                   }else {
                      textInfo = this.filePath;
                      if (textInfo != null && this.getFileSize(textInfo) > 0xa00000) {
                         str = "checkArgs fail, fileSize is too large";
                      }else {
                         textInfo = this.fileData;
                         if (textInfo != null && textInfo.length > 0xa00000) {
                            str = "checkArgs fail, fileData is too large";
                         }else {
                            return true;
                         }
                      }
                   }
                }
             }
          }else {
             goto label_001f ;
          }
       }else {
          goto label_001f ;
       }
       Log.e("MicroMsg.SDK.WXAppExtendObject", str);
       return false;
    }
    public final int getFileSize(String p0){
       return b.a(p0);
    }
    public void serialize(Bundle p0){
       p0.putString("_wxappextendobject_extInfo", this.extInfo);
       p0.putByteArray("_wxappextendobject_fileData", this.fileData);
       p0.putString("_wxappextendobject_filePath", this.filePath);
    }
    public int type(){
       return 7;
    }
    public void unserialize(Bundle p0){
       this.extInfo = p0.getString("_wxappextendobject_extInfo");
       this.fileData = p0.getByteArray("_wxappextendobject_fileData");
       this.filePath = p0.getString("_wxappextendobject_filePath");
    }
}
