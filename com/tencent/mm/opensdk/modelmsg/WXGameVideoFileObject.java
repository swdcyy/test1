package com.tencent.mm.opensdk.modelmsg.WXGameVideoFileObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import java.lang.Object;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;
import android.os.Bundle;

public class WXGameVideoFileObject implements WXMediaMessage$IMediaObject	// class@000ef7
{
    public String filePath;
    public String thumbUrl;
    public String videoUrl;

    public void WXGameVideoFileObject(){
       super();
       this.filePath = null;
       this.videoUrl = null;
       this.thumbUrl = null;
    }
    public void WXGameVideoFileObject(String p0,String p1,String p2){
       super();
       this.filePath = p0;
       this.videoUrl = p1;
       this.thumbUrl = p2;
    }
    public boolean checkArgs(){
       String str;
       WXGameVideoFileObject tfilePath = this.filePath;
       if (tfilePath == null || !tfilePath.length()) {
          str = "checkArgs fail, filePath is null";
       }else if(this.getFileSize(this.filePath) > 0x6400000){
          str = "checkArgs fail, video file size is too large";
       }else {
          tfilePath = this.videoUrl;
          if (tfilePath != null && tfilePath.length() > 0x2800) {
             str = "checkArgs fail, videoUrl is too long";
          }else {
             tfilePath = this.thumbUrl;
             if (tfilePath != null && tfilePath.length() > 0x2800) {
                str = "checkArgs fail, thumbUrl is too long";
             }else {
                return true;
             }
          }
       }
       Log.e("MicroMsg.SDK.WXGameVideoFileObject", str);
       return false;
    }
    public final int getFileSize(String p0){
       return b.a(p0);
    }
    public void serialize(Bundle p0){
       p0.putString("_wxvideofileobject_filePath", this.filePath);
       p0.putString("_wxvideofileobject_cdnUrl", this.videoUrl);
       p0.putString("_wxvideofileobject_thumbUrl", this.thumbUrl);
    }
    public int type(){
       return 39;
    }
    public void unserialize(Bundle p0){
       this.filePath = p0.getString("_wxvideofileobject_filePath");
       this.videoUrl = p0.getString("_wxvideofileobject_cdnUrl");
       this.thumbUrl = p0.getString("_wxvideofileobject_thumbUrl");
    }
}
