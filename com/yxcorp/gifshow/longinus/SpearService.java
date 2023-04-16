package com.yxcorp.gifshow.longinus.SpearService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import kotlin.jvm.internal.a;
import com.kwai.android.longinus.Longinus;
import com.yxcorp.gifshow.longinus.LonginusLog;
import lnc.i3;
import k2b.u1;
import com.yxcorp.gifshow.longinus.SpearService$a;
import java.lang.Runnable;
import f97.d;
import com.yxcorp.gifshow.longinus.LonginusWorkManager;
import com.yxcorp.gifshow.longinus.LonginusInitModule;
import com.yxcorp.gifshow.longinus.LonginusInitModule$a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class SpearService extends Service	// class@001b80
{

    public void SpearService(){
       super();
    }
    public IBinder onBind(Intent p0){
       return null;
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, SpearService.class, "1")) {
          return;
       }
       super.onCreate();
       Context applicationC = this.getApplicationContext();
       a.o(applicationC, "this.applicationContext");
       String str = "longinus";
       if (Longinus.isFromLonginus(applicationC)) {
          LonginusLog.d(str, "push is from reviver");
          i3 oi3 = i3.f();
          oi3.d("class", "SpearService");
          u1.H0(18, oi3.e());
          d.b(new SpearService$a(this));
          Context applicationC1 = this.getApplicationContext();
          a.o(applicationC1, "this.applicationContext");
          LonginusWorkManager.a.c(applicationC1);
       }else {
          LonginusLog.d(str, "push not from reviver");
       }
       if (!LonginusInitModule.q.b()) {
          applicationC = this.getApplicationContext();
          a.o(applicationC, "this.applicationContext");
          Longinus.release(applicationC);
       }
       return;
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       if (PatchProxy.isSupport(SpearService.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, SpearService.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       super.onStartCommand(p0, p1, p2);
       return 2;
    }
}
