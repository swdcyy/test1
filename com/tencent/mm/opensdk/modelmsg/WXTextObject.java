package com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import java.lang.String;
import java.lang.Object;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public class WXTextObject implements WXMediaMessage$IMediaObject	// class@000f06
{
    public String text;

    public void WXTextObject(){
       super(null);
    }
    public void WXTextObject(String p0){
       this.text = p0;
    }
    public boolean checkArgs(){
       WXTextObject ttext = this.text;
       if (ttext == null || (ttext.length() && (this.text).length() <= 0x2800)) {
          return true;
       }
       Log.e("MicroMsg.SDK.WXTextObject", "checkArgs fail, text is invalid");
       return false;
    }
    public void serialize(Bundle p0){
       p0.putString("_wxtextobject_text", this.text);
    }
    public int type(){
       return 1;
    }
    public void unserialize(Bundle p0){
       this.text = p0.getString("_wxtextobject_text");
    }
}
