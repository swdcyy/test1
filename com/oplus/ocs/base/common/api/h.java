package com.oplus.ocs.base.common.api.h;
import com.oplus.ocs.base.common.api.e;
import android.content.Context;
import com.oplus.ocs.base.common.api.InternalClient;
import com.oplus.ocs.base.IAuthenticationListener;
import java.lang.Object;
import java.lang.String;
import android.content.ServiceConnection;
import com.oplus.ocs.base.common.api.h$a;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.kwai.plugin.dva.feature.core.hook.a;
import com.oplus.ocs.base.utils.a;
import java.lang.Exception;

public class h implements e	// class@000aeb
{
    public final String a;
    public Context b;
    public ServiceConnection c;
    public IAuthenticationListener d;
    public InternalClient e;

    public void h(Context p0,InternalClient p1,IAuthenticationListener p2){
       super();
       this.a = "h";
       this.b = p0;
       this.e = p1;
       this.d = p2;
    }
    public static InternalClient a(h p0){
       return p0.e;
    }
    public static String b(h p0){
       return p0.a;
    }
    public static ServiceConnection c(h p0){
       p0.c = null;
       return null;
    }
    public final boolean a(){
       int i1;
       boolean b1;
       int i = 1;
       int b = 0;
       try{
          if (this.b.getApplicationContext() != null) {
             this.c = new h$a(this, b);
             Context applicationC = this.b.getApplicationContext();
             h td = this.d;
             Intent serviceInten = this.e.getServiceIntent("com.oplus.ocs.openauthenticate", "com.oplus.ocs", "com.oplus.ocs.service.OpenAuthenticateService");
             if (td != null) {
                Bundle uBundle = new Bundle();
                uBundle.putBinder("internal_binder", td.asBinder());
                serviceInten.putExtra("internal_bundle", uBundle);
             }
             b1 = a.a(applicationC, serviceInten, this.c, i);
             try{
                a.d(this.a, ("connect state - ").concat(String.valueOf(b1)));
                if (!b1) {
                   h td1 = this.d;
                   if (td1 != null) {
                      b = 3;
                      try{
                         td1.onFail(b);
                      label_0082 :
                         return b1;
                      }catch(java.lang.Exception e0){
                      }
                   }
                }
                b = b1;
             }catch(java.lang.Exception e3){
                i1 = b1;
                Exception uException = e3;
             }
             Object[] objArray = new Object[i];
             objArray[b] = e2.getMessage();
             a.d(this.a, String.format("in bind get an exception %s", objArray));
             b1 = i1;
             goto label_0082 ;
          }else {
             h td2 = this.d;
             if (td2 != null) {
                td2.onFail(1009);
             }
          }
          b1 = b;
          goto label_0082 ;
       }catch(java.lang.Exception e2){
          i1 = 0;
          goto label_006e ;
       }
    }
    public final boolean b(){
       boolean b1;
       int i = 1;
       byte b = 0;
       try{
          if (this.b.getApplicationContext() != null) {
             this.c = new h$a(this, b);
             b1 = a.a(this.b.getApplicationContext(), this.e.getServiceIntent4Stat("com.oplus.ocs.openauthenticate", "com.oplus.ocs", "com.oplus.ocs.service.OpenAuthenticateService"), this.c, i);
             try{
                a.d(this.a, ("connect stat state - ").concat(String.valueOf(b1)));
                if (!b1) {
                   h td = this.d;
                   if (td != null) {
                      td.onFail(3);
                   label_0067 :
                      return b1;
                   }
                }
                b = b1;
             }catch(java.lang.Exception e3){
             }
             Object[] objArray = new Object[i];
             objArray[b] = e3.getMessage();
             a.d(this.a, String.format("in bind get an exception %s", objArray));
             goto label_0067 ;
          }else {
             h td1 = this.d;
             if (td1 != null) {
                td1.onFail(1009);
             }
          }
          b1 = b;
          goto label_0067 ;
       }catch(java.lang.Exception e3){
          b1 = false;
          goto label_0054 ;
       }
    }
    public final void c(){
       if (this.c == null) {
          a.d(this.a, "mServiceConnectionImpl is null");
          return;
       }else if(this.b.getApplicationContext() != null){
          try{
             this.b.getApplicationContext().unbindService(this.c);
             return;
          }catch(java.lang.Exception e0){
             Object[] objArray = new Object[]{e0.getMessage()};
             a.d(this.a, String.format("in unbind get an exception %s", objArray));
          }
          return;
       }else {
          goto label_0036 ;
       }
    }
    public final void d(){
    }
}
