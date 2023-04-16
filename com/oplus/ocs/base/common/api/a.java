package com.oplus.ocs.base.common.api.a;
import com.oplus.ocs.base.common.api.e;
import android.content.Context;
import java.lang.String;
import com.oplus.ocs.base.common.api.c;
import com.oplus.ocs.base.common.api.k;
import java.lang.Object;
import com.oplus.ocs.base.common.api.a$4;
import com.coloros.ocs.base.IServiceBroker;
import com.oplus.ocs.base.common.api.InternalClient;
import android.os.Process;
import com.oplus.ocs.base.common.api.a$2;
import com.oplus.ocs.base.IAuthenticationListener;
import com.oplus.ocs.base.common.CapabilityInfo;
import android.os.Message;
import android.os.Handler;
import android.os.IBinder$DeathRecipient;
import com.oplus.ocs.base.common.api.a$a;
import com.oplus.ocs.base.utils.a;
import com.oplus.ocs.base.utils.ServiceCheck;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.oplus.ocs.base.common.api.a$1;
import java.lang.Runnable;
import android.content.Intent;
import android.content.ComponentName;
import android.content.ServiceConnection;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.Exception;
import android.os.IBinder;
import android.os.IInterface;
import com.oplus.ocs.base.common.api.a$3;
import com.coloros.ocs.base.IAuthenticationListener;
import java.lang.StringBuilder;

public class a implements e	// class@000adc
{
    public final String a;
    public a$a b;
    public IServiceBroker c;
    public Context d;
    public String e;
    public c f;
    public k g;
    public IBinder$DeathRecipient h;

    public void a(Context p0,String p1,c p2,k p3){
       super();
       this.a = "a";
       this.b = null;
       this.h = new a$4(this);
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
    }
    public static IServiceBroker a(a p0,IServiceBroker p1){
       p0.c = p1;
       return p1;
    }
    public static void a(a p0){
       a d = p0.d;
       InternalClient internalClie = new InternalClient(d, d.getPackageName(), p0.e, Process.myPid(), true, true, new a$2(p0));
       v8.connect();
    }
    public static void a(a p0,int p1){
       p0.a(p1);
    }
    public static void a(a p0,CapabilityInfo p1){
       Message message = Message.obtain();
       message.what = 1;
       message.obj = p1;
       p0.f.sendMessage(message);
    }
    public static String b(a p0){
       return p0.a;
    }
    public static IBinder$DeathRecipient c(a p0){
       return p0.h;
    }
    public static IServiceBroker d(a p0){
       return p0.c;
    }
    public static c e(a p0){
       return p0.f;
    }
    public static k f(a p0){
       return p0.g;
    }
    public static a$a g(a p0){
       p0.b = null;
       return null;
    }
    public final void a(int p0){
       a.b(this.a, ("errorCode ").concat(String.valueOf(p0)));
       Message message = Message.obtain();
       message.what = 2;
       message.arg1 = p0;
       this.f.sendMessage(message);
    }
    public final boolean a(){
       a tg = this.g;
       boolean i = 2;
       if (tg != null) {
          tg.onStateChange(i);
       }
       if (ServiceCheck.b(this.d)) {
          Executors.newSingleThreadExecutor().execute(new a$1(this));
       }else {
          byte b = 0;
          try{
             if (this.d.getApplicationContext() != null) {
                this.b = new a$a(this, b);
                Intent intent = new Intent("com.coloros.opencapabilityservice");
                intent.setComponent(new ComponentName("com.coloros.ocs.opencapabilityservice", "com.coloros.ocs.opencapabilityservice.service.ColorOcsService"));
                i = a.a(this.d.getApplicationContext(), intent, this.b, true);
                a.b(this.a, ("connect state ").concat(String.valueOf(i)));
                if (!i) {
                   this.a(3);
                }
             }else {
                a tg1 = this.g;
                if (tg1 != null) {
                   tg1.onStateChange(i);
                }
                this.a(1009);
             }
          }catch(java.lang.Exception e1){
             Object[] objArray = new Object[true];
             objArray[b] = e1.getMessage();
             a.d(this.a, String.format("out bind get an exception %s", objArray));
          }
       }
    }
    public final boolean b(){
       return false;
    }
    public final void c(){
       if (this.b != null && this.d.getApplicationContext() != null) {
          try{
             this.d.getApplicationContext().unbindService(this.b);
             this.c = null;
             return;
          }catch(java.lang.Exception e0){
             Object[] objArray = new Object[]{e0.getMessage()};
             a.d(this.a, String.format("out unbind get an exception %s", objArray));
          }
       label_0031 :
          return;
       }else {
          goto label_0031 ;
       }
    }
    public final void d(){
       try{
          a tc = this.c;
          if (tc != null) {
             IBinder iBinder = tc.asBinder();
             if (iBinder != null && iBinder.isBinderAlive()) {
                this.c.handleAuthentication(this.e, "1.0.11", new a$3(this));
             }
          }
          return;
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          a.d(this.a, "the exception that service broker authenticates is"+e0.getMessage());
          this.a(7);
          return;
       }
    }
}
