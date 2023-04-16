package com.yxcorp.gifshow.webview.jsmodel.ui.JsPageButtonParams$IconImageUrl;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class JsPageButtonParams$IconImageUrl implements Serializable	// class@001796
{
    public String mNormal;
    public String mPressed;
    public static final long serialVersionUID = 0xf1a28fc474433a01;

    public void JsPageButtonParams$IconImageUrl(){
       super();
    }
    public static boolean isValid(JsPageButtonParams$IconImageUrl p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JsPageButtonParams$IconImageUrl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && !TextUtils.x(p0.mNormal))? true: false;
       return b;
    }
}
