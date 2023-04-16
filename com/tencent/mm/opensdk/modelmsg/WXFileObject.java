package com.tencent.mm.opensdk.modelmsg.WXFileObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import java.lang.Object;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;
import android.os.Bundle;

public class WXFileObject implements WXMediaMessage$IMediaObject	// class@000ef5
{
    public int contentLengthLimit;
    public byte[] fileData;
    public String filePath;

    public void WXFileObject(){
       super();
       this.contentLengthLimit = 0x72800000;
       this.fileData = null;
       this.filePath = null;
    }
    public void WXFileObject(String p0){
       super();
       this.contentLengthLimit = 0x72800000;
       this.filePath = p0;
    }
    public void WXFileObject(byte[] p0){
       super();
       this.contentLengthLimit = 0x72800000;
       this.fileData = p0;
    }
    public boolean checkArgs(){
       String str;
       WXFileObject tfileData = this.fileData;
       if (tfileData == null || !tfileData.length) {
          tfileData = this.filePath;
          if (tfileData == null || !tfileData.length()) {
             str = "checkArgs fail, both arguments is null";
          }else {
          label_0015 :
             tfileData = this.fileData;
             if (tfileData != null && tfileData.length > this.contentLengthLimit) {
                str = "checkArgs fail, fileData is too large";
             }else {
                tfileData = this.filePath;
                if (tfileData != null && this.getFileSize(tfileData) > this.contentLengthLimit) {
                   str = "checkArgs fail, fileSize is too large";
                }else {
                   return true;
                }
             }
          }
       }else {
          goto label_0015 ;
       }
       Log.e("MicroMsg.SDK.WXFileObject", str);
       return false;
    }
    public final int getFileSize(String p0){
       return b.a(p0);
    }
    public void serialize(Bundle p0){
       p0.putByteArray("_wxfileobject_fileData", this.fileData);
       p0.putString("_wxfileobject_filePath", this.filePath);
    }
    public void setContentLengthLimit(int p0){
       this.contentLengthLimit = p0;
    }
    public void setFileData(byte[] p0){
       this.fileData = p0;
    }
    public void setFilePath(String p0){
       this.filePath = p0;
    }
    public int type(){
       return 6;
    }
    public void unserialize(Bundle p0){
       this.fileData = p0.getByteArray("_wxfileobject_fileData");
       this.filePath = p0.getString("_wxfileobject_filePath");
    }
}
