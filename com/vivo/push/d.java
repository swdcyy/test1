package com.vivo.push.d;
import com.vivo.push.IPushClientFactory;
import java.lang.Object;
import com.vivo.push.d.ag;
import com.vivo.push.o;
import com.vivo.push.d.z;
import android.content.Intent;
import java.lang.String;
import com.vivo.push.b.j;
import com.vivo.push.b.i;
import com.vivo.push.b.k;
import com.vivo.push.b.m;
import com.vivo.push.b.n;
import com.vivo.push.b.r;
import com.vivo.push.b.p;
import com.vivo.push.b.q;
import com.vivo.push.b.o;
import com.vivo.push.b.t;
import com.vivo.push.b.l;
import com.vivo.push.b.u;
import com.vivo.push.a;
import com.vivo.push.util.p;
import com.vivo.push.l;

public final class d implements IPushClientFactory	// class@00107b
{
    public ag a;

    public void d(){
       super();
       this.a = new ag();
    }
    public final z createReceiveTask(o p0){
       return ag.b(p0);
    }
    public final o createReceiverCommand(Intent p0){
       t ot;
       i oi;
       int i = -1;
       int intExtra = p0.getIntExtra("command", i);
       if (intExtra < 0) {
          intExtra = p0.getIntExtra("method", i);
       }
       if (intExtra != 20) {
          if (intExtra != 2016) {
             switch (intExtra){
                 case 1:
                 case 2:
                   ot = new t(intExtra);
                label_0057 :
                   oi = ot;
                   break;
                 case 3:
                   oi = new o();
                   break;
                 case 4:
                   oi = new q();
                   break;
                 case 5:
                   oi = new p();
                   break;
                 case 6:
                   oi = new r();
                   break;
                 case 7:
                   oi = new n();
                   break;
                 case 8:
                   oi = new m();
                   break;
                 case 9:
                   oi = new k();
                   break;
                 case 10:
                 case 11:
                   ot = new i(intExtra);
                   goto label_0057 ;
                   break;
                 case 12:
                   oi = new j();
                   break;
                 default:
                   oi = null;
             }
          }else {
             oi = new l();
          }
       }else {
          oi = new u();
       }
       if (oi != null) {
          a uoa = a.a(p0);
          if (uoa == null) {
             p.b("PushCommand", "bundleWapper is null");
          }else {
             oi.b(uoa);
          }
       }
       return oi;
    }
    public final l createTask(o p0){
       return ag.a(p0);
    }
}
