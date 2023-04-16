package com.loc.a$a;
import android.os.Handler;
import com.loc.a;
import android.os.Looper;
import android.os.Message;
import android.os.Bundle;
import com.amap.api.location.AMapLocation;

public final class a$a extends Handler	// class@00135b
{
    public final a a;

    public void a$a(a p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public final void handleMessage(Message p0){
       switch (p0.what){
           case 0:
             this.a.b(p0.getData());
          label_007f :
             return;
             break;
           case 1:
             this.a.c(p0.getData());
             return;
           case 2:
             this.a.e(p0.getData());
             return;
           case 3:
             this.a.d(p0.getData());
             return;
           case 4:
             this.a.f(p0.getData());
             return;
           case 5:
             this.a.e();
             return;
           case 6:
             a$a ta = this.a;
             ta.a(ta.s);
             return;
           case 7:
             this.a.d();
             return;
           case 8:
             this.a.j(p0.getData());
             return;
           case 9:
             this.a.a(p0.getData());
             return;
           case 10:
             this.a.c();
             return;
           case 11:
             this.a.h(p0.getData());
             return;
           case 12:
             this.a.g(p0.getData());
             return;
           case 13:
             this.a.g();
             goto label_007f ;
             break;
           default:
             goto label_007f ;
       }
    }
}
