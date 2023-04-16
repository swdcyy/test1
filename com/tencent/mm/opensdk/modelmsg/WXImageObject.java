package com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import java.lang.Object;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.OutputStream;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Exception;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;
import android.os.Bundle;

public class WXImageObject implements WXMediaMessage$IMediaObject	// class@000ef8
{
    public byte[] imageData;
    public String imagePath;

    public void WXImageObject(){
       super();
    }
    public void WXImageObject(Bitmap p0){
       try{
          super();
          ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
          p0.compress(Bitmap$CompressFormat.JPEG, 85, uByteArrayOu);
          this.imageData = uByteArrayOu.toByteArray();
          uByteArrayOu.close();
       }catch(java.lang.Exception e4){
          Log.e("MicroMsg.SDK.WXImageObject", "WXImageObject <init>, exception:"+e4.getMessage());
       }
       return;
    }
    public void WXImageObject(byte[] p0){
       this.imageData = p0;
    }
    public boolean checkArgs(){
       String str;
       WXImageObject timageData = this.imageData;
       if (timageData == null || !timageData.length) {
          timageData = this.imagePath;
          if (timageData == null || !timageData.length()) {
             str = "checkArgs fail, all arguments are null";
          }else {
          label_0015 :
             timageData = this.imageData;
             if (timageData != null && timageData.length > 0x1900000) {
                str = "checkArgs fail, content is too large";
             }else {
                timageData = this.imagePath;
                if (timageData != null && timageData.length() > 0x2800) {
                   str = "checkArgs fail, path is invalid";
                }else {
                   timageData = this.imagePath;
                   if (timageData != null && this.getFileSize(timageData) > 0x1900000) {
                      str = "checkArgs fail, image content is too large";
                   }else {
                      return true;
                   }
                }
             }
          }
       }else {
          goto label_0015 ;
       }
       Log.e("MicroMsg.SDK.WXImageObject", str);
       return false;
    }
    public final int getFileSize(String p0){
       return b.a(p0);
    }
    public void serialize(Bundle p0){
       p0.putByteArray("_wximageobject_imageData", this.imageData);
       p0.putString("_wximageobject_imagePath", this.imagePath);
    }
    public void setImagePath(String p0){
       this.imagePath = p0;
    }
    public int type(){
       return 2;
    }
    public void unserialize(Bundle p0){
       this.imageData = p0.getByteArray("_wximageobject_imageData");
       this.imagePath = p0.getString("_wximageobject_imagePath");
    }
}
