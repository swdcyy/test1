package e99.a$c;
import java.lang.Runnable;
import e99.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Activity;
import e99.a$b;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.app.Dialog;
import e99.b;
import android.content.DialogInterface$OnDismissListener;
import qrd.l1;

public final class a$c implements Runnable	// class@002150
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       l1 a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$c.class, "1")) {
          return;
       }
       a$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, a.class, "15")) {
          a w = tb.w;
          if (w != null && !w.isFinishing()) {
             w = tb.u;
             if (w == null) {
                a w1 = tb.w;
                a.m(w1);
                a$b uob = new a$b(w1);
                uob.setCanceledOnTouchOutside(false);
                uob.setOnDismissListener(b.b);
                a = l1.a;
             }
             tb.u = w;
             w.show();
          }
       }
       return;
    }
}
