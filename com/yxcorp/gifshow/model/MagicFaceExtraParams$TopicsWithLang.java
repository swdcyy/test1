package com.yxcorp.gifshow.model.MagicFaceExtraParams$TopicsWithLang;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;

public class MagicFaceExtraParams$TopicsWithLang implements Serializable	// class@001e53
{
    public String enTopic;
    public String zhTopic;
    public static final long serialVersionUID = 0x50452f36116cd925;

    public void MagicFaceExtraParams$TopicsWithLang(){
       super();
    }
    public String getTopic(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MagicFaceExtraParams$TopicsWithLang.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.equals("en", p0)) {
          return this.enTopic;
       }
       if (TextUtils.equals("zh", p0)) {
          return this.zhTopic;
       }
       return "";
    }
}
