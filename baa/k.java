package baa.k;
import erd.o;
import android.content.Context;
import java.lang.Object;
import daa.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import baa.g;
import brd.t;

public final class k implements o	// class@00043a
{
    public final Context b;

    public void k(Context p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, k.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ot = g.a.b(this.b, p0);
       }
       return ot;
    }
}
