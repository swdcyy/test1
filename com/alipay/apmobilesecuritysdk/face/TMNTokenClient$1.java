package com.alipay.apmobilesecuritysdk.face.TMNTokenClient$1;
import java.lang.Runnable;
import com.alipay.apmobilesecuritysdk.face.TMNTokenClient;
import java.util.Map;
import com.alipay.apmobilesecuritysdk.face.TMNTokenClient$InitResultListener;
import java.lang.String;
import java.lang.Object;
import com.alipay.apmobilesecuritysdk.a.a;
import android.content.Context;

public class TMNTokenClient$1 implements Runnable	// class@000e7d
{
    public final Map a;
    public final TMNTokenClient$InitResultListener b;
    public final String c;
    public final TMNTokenClient d;

    public void TMNTokenClient$1(TMNTokenClient p0,Map p1,TMNTokenClient$InitResultListener p2,String p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void run(){
       int i = new a(TMNTokenClient.a(this.d)).a(this.a);
       TMNTokenClient$1 tb = this.b;
       if (tb == null) {
          return;
       }
       if (!i) {
          this.b.onResult(a.a(TMNTokenClient.a(this.d), this.c), 0);
          return;
       }else {
          tb.onResult("", i);
          return;
       }
    }
}
