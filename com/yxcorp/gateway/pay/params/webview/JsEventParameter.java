package com.yxcorp.gateway.pay.params.webview.JsEventParameter;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class JsEventParameter implements Serializable	// class@001251
{
    public String mCallback;
    public String mHandler;
    public String mType;
    public static final long serialVersionUID = 0x8517d72b41c60a14;

    public void JsEventParameter(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsEventParameter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof JsEventParameter) {
          return super.equals(p0);
       }
       boolean b = (TextUtils.n(this.mType, p0.mType) && TextUtils.n(this.mHandler, p0.mHandler))? true: false;
       return b;
    }
}
