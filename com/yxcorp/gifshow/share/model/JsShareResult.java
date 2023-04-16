package com.yxcorp.gifshow.share.model.JsShareResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;

public class JsShareResult implements Serializable	// class@001bd5
{
    public final String mErrorMsg;
    public String mPlatform;
    public final int mResult;

    public void JsShareResult(String p0,int p1,String p2){
       super();
       this.mPlatform = p0;
       this.mResult = p1;
       this.mErrorMsg = p2;
    }
    public static JsShareResult ofCancel(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JsShareResult.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new JsShareResult(p0, 0, a1.p(0x7f104fc9));
    }
    public static JsShareResult ofFail(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, JsShareResult.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new JsShareResult(p0, 412, p1);
    }
    public static JsShareResult ofSuccess(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JsShareResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new JsShareResult(p0, 1, null);
    }
}
