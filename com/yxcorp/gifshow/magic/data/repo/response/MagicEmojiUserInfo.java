package com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiUserInfo;
import java.io.Serializable;
import java.lang.Object;
import java.io.ObjectInputStream;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import fg6.a;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonElement;
import java.io.ObjectOutputStream;

public class MagicEmojiUserInfo implements Serializable	// class@001b91
{
    public JsonObject mRecordInfo;
    public static final long serialVersionUID = 0x97943a69f15df0c8;

    public void MagicEmojiUserInfo(){
       super();
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEmojiUserInfo.class, "3")) {
          return;
       }
       String str = p0.readObject();
       if (!TextUtils.isEmpty(str)) {
          this.mRecordInfo = a.a.h(str, JsonObject.class);
       }
       Object[] objArray = new Object[0];
       b.D().A("MagicEmojiUserInfo", "readObject "+this.toString(), objArray);
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MagicEmojiUserInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mRecordInfo != null) {
          return "MagicEmojiUserInfo{mRecordInfo="+this.mRecordInfo.toString()+'}';
       }
       return "";
    }
    public final void writeObject(ObjectOutputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEmojiUserInfo.class, "2")) {
          return;
       }
       MagicEmojiUserInfo tmRecordInfo = this.mRecordInfo;
       String str = (tmRecordInfo != null)? tmRecordInfo.toString(): "";
       p0.writeObject(str);
       Object[] objArray = new Object[0];
       b.D().A("MagicEmojiUserInfo", "writeObject "+this.toString(), objArray);
       return;
    }
}
