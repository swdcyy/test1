package ot1.g$b;
import z0.a;
import ot1.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ut1.f;
import du1.d;
import ut1.k;
import cu1.d;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import java.lang.Long;

public final class g$b implements a	// class@003583
{
    public final g a;

    public void g$b(g p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       k obj = PatchProxy.applyOneRefs(p0, this, g$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.h(p0, this.a.k.d(), false);
       g$b uob = null;
       if (obj != null) {
          uob = this.a;
          uob.r0(uob.x0()).setValue(Long.valueOf(obj.g()));
          uob = this.a.u0(obj, p0);
       }
       return uob;
    }
}
