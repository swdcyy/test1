package com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.MediaObject;
import com.sina.weibo.sdk.api.ImageObject$1;
import android.os.Parcel;
import java.lang.String;
import com.sina.weibo.sdk.b.c;
import java.io.File;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.OutputStream;
import java.lang.StringBuilder;
import java.lang.Exception;

public class ImageObject extends MediaObject	// class@000b9c
{
    public byte[] imageData;
    public String imagePath;
    public static final Parcelable$Creator CREATOR;
    public static final long serialVersionUID;

    static {
       ImageObject.CREATOR = new ImageObject$1();
    }
    public void ImageObject(){
       super();
    }
    public void ImageObject(Parcel p0){
       super();
       this.imageData = p0.createByteArray();
       this.imagePath = p0.readString();
    }
    public boolean checkArgs(){
       ImageObject timageData = this.imageData;
       if (timageData == null || !timageData.length) {
          timageData = this.imagePath;
          if (timageData == null || !timageData.length()) {
             c.b("ImageObject", "checkArgs fail, all arguments are null");
             return false;
          }
       }
       timageData = this.imageData;
       if (timageData != null && timageData.length > 0x100000) {
          c.b("ImageObject", "checkArgs fail, content is too large");
          return false;
       }else {
          timageData = this.imagePath;
          if (timageData != null && timageData.length() > 512) {
             c.b("ImageObject", "checkArgs fail, path is invalid");
             return false;
          }else {
             timageData = this.imagePath;
             if (timageData != null && this.getFileSize(timageData) > 0x100000) {
                c.b("ImageObject", "checkArgs fail, image content is too large");
                return false;
             }else {
                return true;
             }
          }
       }
    }
    public int describeContents(){
       return 0;
    }
    public final int getFileSize(String p0){
       int i = 0;
       if (p0 == null || !p0.length()) {
          return i;
       }
       File uFile = new File(p0);
       if (!uFile.exists()) {
          return i;
       }
       return (int)uFile.length();
    }
    public void setImageData(Bitmap p0){
       try{
          ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
          p0.compress(Bitmap$CompressFormat.JPEG, 85, uByteArrayOu);
          this.imageData = uByteArrayOu.toByteArray();
          uByteArrayOu.close();
          return;
       }catch(java.lang.Exception e4){
          c.b("ImageObject", "ImageObject :"+e4.getMessage());
          return;
       }
    }
    public void setImagePath(String p0){
       this.imagePath = p0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeByteArray(this.imageData);
       p0.writeString(this.imagePath);
    }
}
