package com.kwai.component.payment.KwaiCoinPayResult;
import com.yxcorp.gateway.pay.params.result.BaseResult;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;

public final class KwaiCoinPayResult extends BaseResult	// class@0009ee
{
    public int mErrorCode;
    public String mErrorMsg;
    public long mKsCoin;
    public static final long serialVersionUID = 0x70f5ea7793b1320a;

    public void KwaiCoinPayResult(){
       super();
    }
    public static KwaiCoinPayResult cancel(int p0,String p1){
       KwaiCoinPayResult obj;
       if (PatchProxy.isSupport(KwaiCoinPayResult.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, KwaiCoinPayResult.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new KwaiCoinPayResult();
       obj.mResult = 0;
       obj.mErrorCode = p0;
       obj.mErrorMsg = p1;
       return obj;
    }
    public static KwaiCoinPayResult fail(int p0,String p1){
       KwaiCoinPayResult obj;
       if (PatchProxy.isSupport(KwaiCoinPayResult.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, KwaiCoinPayResult.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new KwaiCoinPayResult();
       obj.mResult = -1;
       obj.mErrorCode = p0;
       obj.mErrorMsg = p1;
       return obj;
    }
    public static KwaiCoinPayResult success(int p0,long p1){
       KwaiCoinPayResult obj;
       if (PatchProxy.isSupport(KwaiCoinPayResult.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), null, KwaiCoinPayResult.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new KwaiCoinPayResult();
       obj.mResult = 1;
       obj.mErrorCode = p0;
       obj.mKsCoin = p1;
       return obj;
    }
}
