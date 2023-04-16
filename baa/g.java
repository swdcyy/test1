package baa.g;
import baa.j;
import java.lang.Object;
import android.content.Context;
import daa.f;
import brd.t;
import daa.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import baa.g$a;
import io.reactivex.g;
import t45.d;
import brd.z;
import baa.p;
import brd.w;

public final class g implements j	// class@000434
{
    public static final g a;

    static {
       g.a = new g();
    }
    public void g(){
       super();
    }
    public t a(Context p0,f p1){
       return this.b(p0, p1);
    }
    public t b(Context p0,i p1){
       w[] obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "app");
       a.p(p1, "poke");
       t ot = t.create(new g$a(p1, p0)).subscribeOn(d.c);
       String str = p1.a();
       t ot1 = (str != null)? p.b(str): null;
       obj = new w[]{ot,ot1};
       ot = t.concatArrayEager(obj).takeLast(1);
       a.o(ot, "Observable.concatArrayEa¡­\(lottie, img\).takeLast\(1\)");
       return ot;
    }
}
