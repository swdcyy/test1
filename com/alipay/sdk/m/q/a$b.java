package com.alipay.sdk.m.q.a$b;
import android.content.ServiceConnection;
import com.alipay.sdk.m.q.a;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import s6.a;
import java.lang.String;
import k6.a;
import com.alipay.android.app.IAlixPay;
import com.alipay.android.app.IAlixPay$Stub;

public class a$b implements ServiceConnection	// class@000e9a
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void onServiceConnected(ComponentName p0,IBinder p1){
       a.b(a.e(this.b), "biz", "srvCon");
       p0 = a.h(this.b);
       _monitor_enter(p0);
       a.b(this.b, IAlixPay$Stub.asInterface(p1));
       a.h(this.b).notify();
       _monitor_exit(p0);
    }
    public void onServiceDisconnected(ComponentName p0){
       a.b(a.e(this.b), "biz", "srvDis");
       a.b(this.b, null);
    }
}
