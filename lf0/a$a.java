package lf0.a$a;
import java.lang.Runnable;
import android.content.Context;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xh7.b;
import lf0.a$a$a;
import qh7.b;
import qh7.a;

public final class a$a implements Runnable	// class@002edb
{
    public final Context b;
    public final Ref$ObjectRef c;

    public void a$a(Context p0,Ref$ObjectRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       a.b(b.j(this.b, this.c.element), a$a$a.a);
       return;
    }
}
