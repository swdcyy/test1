package yx2.i;
import java.lang.Object;
import mrd.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Handler;
import android.os.Looper;
import crd.a;
import brd.x;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yx2.i$a;
import qrd.l1;

public abstract class i	// class@004d64
{
    public final a a;
    public final Handler b;
    public final a c;

    public void i(){
       super();
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<Unit>\(\)");
       this.a = uoa;
       this.b = new Handler(Looper.getMainLooper());
       this.c = new a();
    }
    public final x L(){
       Object obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i$a(this);
    }
    public final a M(){
       return this.c;
    }
    public void N(){
    }
    public final void O(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       this.c.dispose();
       this.a.onNext(l1.a);
       this.b.removeCallbacksAndMessages(null);
       this.N();
       return;
    }
}
