package cra.s;
import io.reactivex.g;
import java.lang.ref.WeakReference;
import java.lang.Object;
import brd.v;
import cra.w;
import java.lang.String;
import q87.c;
import cra.u;
import android.app.Application;
import o56.a;
import android.os.PowerManager;
import android.app.Activity;
import java.lang.Throwable;
import brd.g;

public final class s implements g	// class@00238c
{
    public final WeakReference b;
    public final boolean c;

    public void s(WeakReference p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       s tb = this.b;
       s tc = this.c;
       w ow = w.C();
       Object[] objArray = new Object[0];
       try{
          ow.t("GrowthReferrerHelper", "reportScreenOffLaunch start", objArray);
          if (u.e == null) {
             u.e = a.b().getSystemService("power");
          label_0024 :
             PowerManager e = u.e;
             if (e != null && !e.isScreenOn()) {
                u.a(tb, "app_launch_with_screen_off_referrer_event", u.c(tb.get()), tc);
             }
          }else {
             goto label_0024 ;
          }
       }catch(java.lang.Exception e0){
          Object[] objArray1 = new Object[0];
          w.C().u("GrowthReferrerHelper", e0, objArray1);
       }
       p0.onComplete();
       return;
    }
}
