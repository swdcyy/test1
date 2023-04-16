package com.vivo.push.sdk.service.CommandService;
import android.app.Service;
import java.lang.String;
import java.lang.Object;
import android.content.Intent;
import android.os.IBinder;
import com.vivo.push.util.p;
import java.lang.StringBuilder;
import java.lang.Class;
import android.content.Context;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.sdk.a;
import com.vivo.push.q;
import java.lang.Throwable;

public class CommandService extends Service	// class@00109b
{

    public void CommandService(){
       super();
    }
    public boolean a(String p0){
       return ("com.vivo.pushservice.action.RECEIVE").equals(p0);
    }
    public IBinder onBind(Intent p0){
       p.c("CommandService", "onBind initSuc: ");
       return null;
    }
    public void onCreate(){
       p.c("CommandService", this.getClass().getSimpleName()+" -- oncreate "+this.getPackageName());
       super.onCreate();
       a.a().a(ContextDelegate.getContext(this.getApplicationContext()));
    }
    public void onDestroy(){
       super.onDestroy();
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       p.c("CommandService", this.getClass().getSimpleName()+" -- onStartCommand "+this.getPackageName());
       if (p0 == null) {
          this.stopSelf();
          return 2;
       }else if(!this.a(p0.getAction())){
          p.a("CommandService", this.getPackageName()+" receive invalid action "+p0.getAction());
          this.stopSelf();
          return 2;
       }else {
          try{
             a.a().a(this.getClass().getName());
             a.a().a(p0);
          }catch(java.lang.Exception e3){
             p.a("CommandService", "onStartCommand -- error", e3);
          }
          this.stopSelf();
          return 2;
       }
    }
    public boolean onUnbind(Intent p0){
       return super.onUnbind(p0);
    }
}
