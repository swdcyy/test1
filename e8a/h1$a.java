package e8a.h1$a;
import vy6.a;
import e8a.h1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import brd.y;

public final class h1$a implements a	// class@0020ac
{
    public final h1 b;

    public void h1$a(h1 p0){
       this.b = p0;
       super();
    }
    public void B0(){
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, h1$a.class, "2")) {
          return;
       }
       this.b.S8();
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, h1$a.class, "1")) {
          return;
       }
       h1 u = this.b.u;
       if (u == null) {
          a.S("mSyncPlayerStatusObserver");
       }
       u.onNext(this.b.A);
       return;
    }
    public void k1(){
    }
}
