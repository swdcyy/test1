package com.alipay.apmobilesecuritysdk.face.APSecuritySdk$1;
import java.lang.Runnable;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import java.util.Map;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk$InitResultListener;
import java.lang.Object;
import com.alipay.apmobilesecuritysdk.a.a;
import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk$TokenResult;

public class APSecuritySdk$1 implements Runnable	// class@000e78
{
    public final Map a;
    public final APSecuritySdk$InitResultListener b;
    public final APSecuritySdk c;

    public void APSecuritySdk$1(APSecuritySdk p0,Map p1,APSecuritySdk$InitResultListener p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       new a(APSecuritySdk.a(this.c)).a(this.a);
       APSecuritySdk$1 tb = this.b;
       if (tb != null) {
          tb.onResult(this.c.getTokenResult());
       }
       return;
    }
}
