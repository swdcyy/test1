package ew8.k$a;
import ew8.a;
import ew8.k;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.content.SharedPreferences;
import vid.b;
import ew8.j;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import ew8.o;
import erd.g;
import crd.b;

public class k$a extends a	// class@002244
{
    public final k b;

    public void k$a(k p0){
       this.b = p0;
       super();
    }
    public void onActivityStopped(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "1")) {
          return;
       }
       k$a tb = this.b;
       Objects.requireNonNull(tb);
       k ok = k.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tb, ok, "21")) {
          if (!PatchProxy.applyVoid(objArray, tb, ok, "20") && tb.c == null) {
             tb.c = b.c(a.b(), "log_real_action_user_signal", 0);
          }
          t.fromCallable(new j(tb)).subscribeOn(d.c).subscribe(o.a, o.c);
       }
       return;
    }
}
