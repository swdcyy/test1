package com.tencent.mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import java.lang.Object;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;
import android.os.Bundle;

public class WXEmojiObject implements WXMediaMessage$IMediaObject	// class@000ef1
{
    public byte[] emojiData;
    public String emojiPath;

    public void WXEmojiObject(){
       super();
       this.emojiData = null;
       this.emojiPath = null;
    }
    public void WXEmojiObject(String p0){
       this.emojiPath = p0;
    }
    public void WXEmojiObject(byte[] p0){
       this.emojiData = p0;
    }
    public boolean checkArgs(){
       String str;
       WXEmojiObject temojiData = this.emojiData;
       if (temojiData == null || !temojiData.length) {
          temojiData = this.emojiPath;
          if (temojiData == null || !temojiData.length()) {
             str = "checkArgs fail, both arguments is null";
          }else {
          label_0015 :
             temojiData = this.emojiData;
             if (temojiData != null && temojiData.length > 0xa00000) {
                str = "checkArgs fail, emojiData is too large";
             }else {
                temojiData = this.emojiPath;
                if (temojiData != null && this.getFileSize(temojiData) > 0xa00000) {
                   str = "checkArgs fail, emojiSize is too large";
                }else {
                   return true;
                }
             }
          }
       }else {
          goto label_0015 ;
       }
       Log.e("MicroMsg.SDK.WXEmojiObject", str);
       return false;
    }
    public final int getFileSize(String p0){
       return b.a(p0);
    }
    public void serialize(Bundle p0){
       p0.putByteArray("_wxemojiobject_emojiData", this.emojiData);
       p0.putString("_wxemojiobject_emojiPath", this.emojiPath);
    }
    public void setEmojiData(byte[] p0){
       this.emojiData = p0;
    }
    public void setEmojiPath(String p0){
       this.emojiPath = p0;
    }
    public int type(){
       return 8;
    }
    public void unserialize(Bundle p0){
       this.emojiData = p0.getByteArray("_wxemojiobject_emojiData");
       this.emojiPath = p0.getString("_wxemojiobject_emojiPath");
    }
}
