package bca.a$q;
import bca.a$a;
import bca.a;
import brd.v;
import eca.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import brd.g;
import java.lang.Integer;

public final class a$q implements a$a	// class@00045a
{
    public final a a;
    public final v b;
    public final g c;

    public void a$q(a p0,v p1,g p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$q.class, "2")) {
          return;
       }
       a.p(p0, "error");
       this.a.l(this.c, false);
       this.b.onError(p0);
       return;
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, a$q.class, "3")) {
          return;
       }
       this.a.l(this.c, false);
       if (this.a.h == null) {
          this.b.onNext(Integer.valueOf(100));
       }
       this.b.onComplete();
       return;
    }
    public void onProgress(int p0){
       a$q oq = a$q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oq, "1")) {
          return;
       }
       if (this.a.h == null && p0 < 100) {
          this.b.onNext(Integer.valueOf(p0));
       }
       return;
    }
}
