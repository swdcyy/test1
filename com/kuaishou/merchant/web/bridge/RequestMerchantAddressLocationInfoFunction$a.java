package com.kuaishou.merchant.web.bridge.RequestMerchantAddressLocationInfoFunction$a;
import io.reactivex.g;
import com.kuaishou.merchant.web.bridge.RequestMerchantAddressLocationInfoFunction;
import android.app.Activity;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zm4.f;
import com.kuaishou.merchant.web.bridge.RequestMerchantAddressLocationInfoFunction$a$a;
import msd.p;
import la4.b;
import crd.b;
import la4.l;

public class RequestMerchantAddressLocationInfoFunction$a implements g	// class@0009d7
{
    public final Activity b;
    public final RequestMerchantAddressLocationInfoFunction c;

    public void RequestMerchantAddressLocationInfoFunction$a(RequestMerchantAddressLocationInfoFunction p0,Activity p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RequestMerchantAddressLocationInfoFunction$a.class, "1")) {
          return;
       }
       l.e(this.b, new RequestMerchantAddressLocationInfoFunction$a$a(this, new f(p0)), true);
       return;
    }
}
