package com.kuaishou.merchant.web.bridge.RequestMerchantAddressLocationInfoFunction;
import ay7.a;
import android.app.Activity;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.kuaishou.merchant.web.bridge.RequestMerchantAddressLocationInfoFunction$a;
import io.reactivex.g;
import t45.d;
import brd.z;

public class RequestMerchantAddressLocationInfoFunction extends a	// class@0009d8
{
    public WeakReference d;
    public static final int e;

    public void RequestMerchantAddressLocationInfoFunction(Activity p0){
       super();
       this.d = new WeakReference(p0);
    }
    public String c(){
       return "requestMerchantAddressLocationInfo";
    }
    public String d(){
       return "merchant";
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, RequestMerchantAddressLocationInfoFunction.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new FunctionResultParams();
    }
    public t l(YodaBaseWebView p0,String p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, RequestMerchantAddressLocationInfoFunction.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       RequestMerchantAddressLocationInfoFunction td = this.d;
       if (td != null) {
          Activity uActivity = td.get();
          if (uActivity != null && !uActivity.isFinishing()) {
             return t.create(new RequestMerchantAddressLocationInfoFunction$a(this, uActivity)).subscribeOn(d.a);
          }
       }
       return t.just(FunctionResultParams.createErrorResult(0x1e84a, "activity is null"));
    }
}
