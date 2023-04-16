package p75.l;
import android.content.ServiceConnection;
import android.content.Context;
import o75.y;
import o75.z;
import java.lang.Object;
import com.kwai.chat.kwailink.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v75.d;
import com.kwai.chat.kwailink.base.b;
import com.kwai.chat.kwailink.log.a;
import java.lang.StringBuilder;
import java.lang.Thread;
import android.content.Intent;
import android.content.ComponentName;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.Boolean;
import android.os.SystemClock;
import android.os.IBinder;
import android.os.IInterface;
import com.kwai.chat.kwailink.i$a;
import com.kwai.chat.kwailink.i$a$a;
import java.util.concurrent.ScheduledExecutorService;
import p75.b;
import p75.k;
import java.lang.Runnable;

public class l implements ServiceConnection	// class@002179
{
    public final Context b;
    public i c;
    public final Object d;
    public final y e;
    public final z f;

    public void l(Context p0,y p1,z p2){
       super();
       this.d = new Object();
       this.b = p0.getApplicationContext();
       this.e = p1;
       this.f = p2;
    }
    public i a(){
       boolean b;
       long l;
       String str;
       Intent intent;
       ComponentName uComponentNa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, l.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       d.a();
       if (!b.g()) {
          a.b("KwaiLinkServiceConnector", "getRemoteService, KwaiLinkGlobal not inited!!!");
          return null;
       }else {
          int i = 0;
          while (!this.b() && i < b.k) {
             i = i + 1;
             if (!PatchProxy.applyVoid(null, this, l.class, "2")) {
                String str1 = "startService start, tid="+Thread.currentThread().getId();
                str = "KwaiLinkServiceConnector";
                try{
                   a.e(str, str1);
                   intent = new Intent();
                   intent.setComponent(new ComponentName(this.b, "com.kwai.chat.kwailink.service.NewKwaiLinkService"));
                   intent.setPackage(this.b.getPackageName());
                   uComponentNa = a.e(this.b, intent);
                }catch(java.lang.Exception e4){
                   a.b(str, "startService exception!! e="+e4);
                   uComponentNa = null;
                }
                if (uComponentNa != null) {
                   a.e(str, "startService success!!");
                }else {
                   a.e(str, "startService failed!!");
                }
             }
             l obj1 = PatchProxy.apply(null, this, l.class, "3");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else {
                str = "KwaiLinkServiceConnector";
                a.e(str, "bindService start, tid="+Thread.currentThread().getId());
                intent = new Intent();
                intent.setComponent(new ComponentName(this.b, "com.kwai.chat.kwailink.service.NewKwaiLinkService"));
                intent.setPackage(this.b.getPackageName());
                b = a.a(this.b, intent, this, 1);
                if (b) {
                   a.e(str, "bindService success!!");
                }else {
                   a.e(str, "bindService failed!!");
                }
             }
             l = 1000;
             if (b) {
                obj1 = this.d;
                _monitor_enter(obj1);
                try{
                   if (!this.b()) {
                      this.d.wait(l);
                   }
                   _monitor_exit(obj1);
                }catch(java.lang.InterruptedException e0){
                }
             }else if(!this.b()){
                SystemClock.sleep(l);
             }
          }
          if (this.b()) {
             return this.c;
          }
          a.g("KwaiLinkServiceConnector", "getRemoteService failed, bindService count="+i);
          return null;
       }
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.c != null && (this.c.asBinder() != null && this.c.asBinder().isBinderAlive()))? true: false;
       return b;
    }
    public void onServiceConnected(ComponentName p0,IBinder p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "4")) {
          return;
       }
       try{
          if (!this.b()) {
             Object obj = null;
             p0 = PatchProxy.applyOneRefs(p1, obj, i$a.class, "1");
             if (p0 != PatchProxyResult.class) {
                obj = p0;
             }else if(p1 == null){
                IInterface iInterface = p1.queryLocalInterface("com.kwai.chat.kwailink.IService");
                obj = (iInterface != null && iInterface instanceof i)? iInterface: new i$a$a(p1);
             }
             this.c = obj;
          label_0040 :
             if (this.b()) {
                l td = this.d;
                _monitor_enter(td);
                this.d.notifyAll();
                _monitor_exit(td);
             }
          }else {
             goto label_0040 ;
          }
       }catch(java.lang.Exception e0){
       }
       if (this.b()) {
          b.M1().execute(new k(this));
       }
       return;
    }
    public void onServiceDisconnected(ComponentName p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "5")) {
          return;
       }
       a.e("KwaiLinkServiceConnector", "onServiceDisconnected");
       return;
    }
}
