package fka.d;
import com.kwai.framework.activitycontext.ActivityContext$b;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.s5;
import fka.e;
import java.util.Objects;
import fka.f;
import fka.a;
import java.util.concurrent.atomic.AtomicInteger;
import m56.a;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class d implements ActivityContext$b	// class@001619
{

    public void d(){
       super();
    }
    public void a(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       if (p0 instanceof s5) {
          s5 os5 = e.a();
          Objects.requireNonNull(os5);
          e uoe = e.class;
          if (!PatchProxy.applyVoidOneRefs(p0, os5, uoe, "5") && (e.g(os5.c) && os5.c.e() == p0)) {
             os5.a.decrementAndGet();
             if (!PatchProxy.applyVoid(null, os5, uoe, "21")) {
                uoe = os5.c;
                while (true) {
                   f f = uoe.f;
                   if (f == null) {
                      os5.c = null;
                      os5.b = null;
                   label_0053 :
                      if (!e.h(f)) {
                         os5.c = f;
                         break ;
                      }else {
                         f uof = f;
                      }
                   }else {
                      f.g = null;
                      uoe.f = null;
                      goto label_0053 ;
                   }
                }
             }
          }
       }
       return;
    }
    public void d(Activity p0){
       a.d(this, p0);
    }
    public void e(Activity p0){
       a.c(this, p0);
    }
    public void f(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "1")) {
          return;
       }
       if (p0 instanceof s5) {
          s5 os5 = e.a();
          Objects.requireNonNull(os5);
          e uoe = e.class;
          if (!PatchProxy.applyVoidOneRefs(p0, os5, uoe, "4")) {
             os5.a.incrementAndGet();
             Object obj = PatchProxy.apply(null, os5, uoe, "22");
             int i = (obj != PatchProxyResult.class)? obj.intValue(): os5.a.get();
             os5.k(new a(p0, i));
          }
       }
       return;
    }
    public void onBackground(){
       a.e(this);
    }
    public void onForeground(){
       a.f(this);
    }
}
