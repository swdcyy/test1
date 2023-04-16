package com.yxcorp.gifshow.social.bridge.im.JsIMResult;
import java.io.Serializable;
import java.lang.String;
import com.yxcorp.gifshow.social.bridge.im.JsIMResult$ExtraData;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public final class JsIMResult implements Serializable	// class@001d5d
{
    public final JsIMResult$ExtraData mData;
    public final String mErrorMsg;
    public final int mResult;
    public static final long serialVersionUID = 0x40c0af11222c242;

    public void JsIMResult(int p0,String p1,JsIMResult$ExtraData p2){
       super();
       this.mResult = p0;
       this.mErrorMsg = p1;
       this.mData = p2;
    }
    public static JsIMResult cancel(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JsIMResult.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new JsIMResult(0, "", new JsIMResult$ExtraData(p0));
    }
    public static JsIMResult error(int p0,String p1,String p2){
       if (PatchProxy.isSupport(JsIMResult.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, null, JsIMResult.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new JsIMResult(p0, p1, new JsIMResult$ExtraData(p2));
    }
    public static JsIMResult success(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JsIMResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new JsIMResult(1, "", new JsIMResult$ExtraData(p0));
    }
}
