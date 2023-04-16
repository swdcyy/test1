package com.vivo.push.sdk.PushServiceReceiver$a;
import java.lang.Runnable;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import com.vivo.push.util.ContextDelegate;
import android.net.NetworkInfo;
import com.vivo.push.util.r;
import java.lang.StringBuilder;
import com.vivo.push.util.p;
import com.vivo.push.e;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.PushClient;
import java.lang.Exception;

public final class PushServiceReceiver$a implements Runnable	// class@001097
{
    public Context a;
    public String b;

    public void PushServiceReceiver$a(){
       super();
    }
    public static void a(PushServiceReceiver$a p0,Context p1,String p2){
       p0.a = ContextDelegate.getContext(p1);
       p0.b = p2;
    }
    public final void run(){
       NetworkInfo networkInfo = r.a(this.a);
       boolean b = (networkInfo != null)? networkInfo.isConnectedOrConnecting(): false;
       String str = "\)";
       String str1 = ",";
       String str2 = "PushServiceReceiver";
       if (!b) {
          p.d(str2, this.a.getPackageName()+": 无网络  by "+this.b);
          p.a(this.a, "触发静态广播:无网络\("+this.b+str1+this.a.getPackageName()+str);
          return;
       }else {
          p.d(str2, this.a.getPackageName()+": 执行开始出发动作: "+this.b);
          p.a(this.a, "触发静态广播\("+this.b+str1+this.a.getPackageName()+str);
          e.a().a(this.a);
          if (!ClientConfigManagerImpl.getInstance(this.a).isCancleBroadcastReceiver()) {
             try{
                PushClient.getInstance(this.a).initialize();
                return;
             }catch(com.vivo.push.util.VivoPushException e0){
                e0.printStackTrace();
                p.a(this.a, " 初始化异常 error= "+e0.getMessage());
             }
             return;
          }else {
             goto label_00d7 ;
          }
       }
    }
}
