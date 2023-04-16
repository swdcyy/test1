package oi7.c;
import java.lang.Runnable;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.lang.Object;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Throwable;
import qj7.d;

public final class c implements Runnable	// class@002026
{
    public final Context b;
    public final Intent c;
    public final ServiceConnection d;
    public final int e;

    public void c(Context p0,Intent p1,ServiceConnection p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       c te = this.e;
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(tb, tc, td, Integer.valueOf(te), null, a.class, "10");
          if (obj != PatchProxyResult.class) {
             obj.booleanValue();
          }else {
             try{
             label_002a :
                tb.bindService(tc, td, te);
             }catch(java.lang.Exception e0){
                d.b("ServiceLauncherHook: can\'t realBindServiceSafely", e0);
             }
          }
       }else {
          goto label_002a ;
       }
    }
}
