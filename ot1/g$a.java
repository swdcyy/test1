package ot1.g$a;
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

public final class g$a implements a	// class@003582
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       k obj = PatchProxy.applyOneRefs(p0, this, g$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.h(p0, this.a.k.d(), true);
       g$a uoa = null;
       if (obj != null) {
          uoa = this.a;
          uoa.r0(uoa.w0()).setValue(Long.valueOf(obj.g()));
          uoa = this.a.u0(obj, p0);
       }
       return uoa;
    }
}
