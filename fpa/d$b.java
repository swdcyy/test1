package fpa.d$b;
import com.kwai.framework.activitycontext.ActivityContext$b;
import fpa.d;
import java.lang.Object;
import android.app.Activity;
import m56.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vsd.d;
import nsd.m0;
import zsd.u;
import com.kwai.library.widget.popup.common.c;
import android.os.Bundle;

public final class d$b implements ActivityContext$b	// class@0029b2
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void a(Activity p0){
       a.b(this, p0);
    }
    public void d(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "1")) {
          return;
       }
       a.d(this, p0);
       this.b.c = false;
       if (p0 != null) {
          u.J1(m0.d(p0.getClass()).N5(), this.b.f, false, 2, null);
       }
       d e = this.b.e;
       if (e != null) {
          e.o();
       }
       e.c = true;
       return;
    }
    public void e(Activity p0){
       a.c(this, p0);
    }
    public void f(Activity p0,Bundle p1){
       a.a(this, p0, p1);
    }
    public void onBackground(){
       a.e(this);
    }
    public void onForeground(){
       a.f(this);
    }
}
