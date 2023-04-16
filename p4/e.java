package p4.e;
import android.os.Handler;
import p4.c;
import android.os.Looper;
import android.os.Message;
import android.os.Bundle;
import java.lang.String;
import java.lang.Object;
import android.content.ServiceConnection;
import android.content.Context;

public class e extends Handler	// class@0028b5
{
    public final c a;

    public void e(c p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       c b;
       try{
          super.handleMessage(p0);
          String str = p0.getData().getString("IdType");
          p0 = p0.what;
          if (p0 != 1) {
             try{
                if (p0 != 2) {
                   if (p0 == 3) {
                      if (this.a.a == null) {
                      label_001f :
                         b = this.a.b;
                      }else {
                         this.a.f(str);
                         b = this.a.d;
                         _monitor_enter(b);
                         this.a.d.notify();
                         _monitor_exit(b);
                      }
                   }
                }else {
                   e ta = this.a;
                   _monitor_enter(ta);
                   if (ta.a != null) {
                      c h = ta.h;
                      if (h != null) {
                         c e = ta.e;
                         if (e != null) {
                            h.unbindService(e);
                         }
                      }
                      ta.a = null;
                   }
                   _monitor_exit(ta);
                }
             }catch(android.os.RemoteException e0){
             }catch(java.lang.Exception e0){
             }
          }else if(this.a.a == null){
             goto label_001f ;
          }else {
             e ta1 = this.a;
             ta1.b(ta1.h, str, this.a.f(str));
             b = this.a.d;
             _monitor_enter(b);
             this.a.d.notify();
             _monitor_exit(b);
          }
       }catch(android.os.RemoteException e0){
       }
    }
}
