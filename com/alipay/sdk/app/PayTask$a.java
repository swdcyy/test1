package com.alipay.sdk.app.PayTask$a;
import java.lang.Runnable;
import com.alipay.sdk.app.PayTask;
import java.lang.String;
import com.alipay.sdk.app.H5PayCallback;
import java.lang.Object;
import s6.a;
import android.app.Activity;
import android.content.Context;
import d7.a;
import java.lang.StringBuilder;
import u6.c;

public class PayTask$a implements Runnable	// class@000e94
{
    public final String b;
    public final boolean c;
    public final H5PayCallback d;
    public final PayTask e;

    public void PayTask$a(PayTask p0,String p1,boolean p2,H5PayCallback p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       a uoa = this.e.h5Pay(new a(PayTask.a(this.e), this.b, "payInterceptorWithUrl"), this.b, this.c);
       c.f("mspl", "inc finished: "+uoa.a());
       this.d.onPayResult(uoa);
    }
}
