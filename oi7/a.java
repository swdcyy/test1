package oi7.a;
import java.lang.Runnable;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.ComponentName;
import java.lang.Throwable;
import qj7.d;

public final class a implements Runnable	// class@002024
{
    public final Context b;
    public final Intent c;

    public void a(Context p0,Intent p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       a tb = this.b;
       a tc = this.c;
       if (PatchProxy.applyTwoRefs(tb, tc, null, a.class, "6") != PatchProxyResult.class) {
       }else {
          try{
             tb.startService(tc);
          }catch(java.lang.Exception e0){
             d.b("ServiceLauncherHook: can\'t realStartServiceSafely", e0);
          }
       }
    }
}
