package com.tencent.connect.auth.a$d;
import java.lang.Runnable;
import com.tencent.connect.auth.a;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import com.tencent.open.log.SLog;
import com.tencent.connect.auth.a$b;
import com.tencent.tauth.UiError;

public class a$d implements Runnable	// class@000e29
{
    public String a;
    public final a b;

    public void a$d(a p0,String p1){
       this.b = p0;
       super();
       this.a = "";
       this.a = p1;
    }
    public void run(){
       SLog.v("openSDK_LOG.AuthDialog", "-->timeoutUrl: "+this.a+" | mRetryUrl: "+a.i(this.b));
       if ((this.a).equals(a.i(this.b))) {
          a.f(this.b).onError(new UiError(9002, "请求页面超时，请稍后重试！", a.i(this.b)));
          this.b.dismiss();
       }
       return;
    }
}
