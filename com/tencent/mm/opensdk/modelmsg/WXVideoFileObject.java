package com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import java.lang.Object;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;
import android.os.Bundle;

public class WXVideoFileObject implements WXMediaMessage$IMediaObject	// class@000f07
{
    public String filePath;
    public int shareScene;
    public String shareTicket;

    public void WXVideoFileObject(){
       super();
       this.shareScene = 0;
       this.filePath = null;
    }
    public void WXVideoFileObject(String p0){
       super();
       this.shareScene = 0;
       this.filePath = p0;
    }
    public boolean checkArgs(){
       String str;
       WXVideoFileObject tfilePath = this.filePath;
       if (tfilePath == null || !tfilePath.length()) {
          str = "checkArgs fail, filePath is null";
       }else if(this.getFileSize(this.filePath) > 0x40000000){
          str = "checkArgs fail, video file size is too large";
       }else {
          return true;
       }
       Log.e("MicroMsg.SDK.WXVideoFileObject", str);
       return false;
    }
    public final int getFileSize(String p0){
       return b.a(p0);
    }
    public void serialize(Bundle p0){
       p0.putString("_wxvideofileobject_filePath", this.filePath);
       p0.putInt("_wxvideofileobject_shareScene", this.shareScene);
       p0.putString("_wxvideofileobject_shareTicketh", this.shareTicket);
    }
    public int type(){
       return 38;
    }
    public void unserialize(Bundle p0){
       this.filePath = p0.getString("_wxvideofileobject_filePath");
       this.shareScene = p0.getInt("_wxvideofileobject_shareScene", 0);
       this.shareTicket = p0.getString("_wxvideofileobject_shareTicketh");
    }
}
