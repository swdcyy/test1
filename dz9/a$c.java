package dz9.a$c;
import java.lang.Runnable;
import dz9.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Activity;
import dz9.a$b;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.app.Dialog;
import dz9.b;
import android.content.DialogInterface$OnDismissListener;
import qrd.l1;

public final class a$c implements Runnable	// class@002001
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
       if (!PatchProxy.applyVoid(objArray, tb, a.class, "9")) {
          a d = tb.D;
          if (d != null && !d.isFinishing()) {
             d = tb.F;
             if (d == null) {
                a d1 = tb.D;
                a.m(d1);
                a$b uob = new a$b(d1);
                uob.setCanceledOnTouchOutside(false);
                uob.setOnDismissListener(b.b);
                a = l1.a;
             }
             tb.F = d;
             d.show();
          }
       }
       return;
    }
}
