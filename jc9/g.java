package jc9.g;
import erd.g;
import jc9.j;
import java.lang.Object;
import j4b.j;
import java.util.Objects;
import jc9.b0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ad9.i;
import hc9.e;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import j8c.a;
import q87.c;
import ic9.b;

public final class g implements g	// class@00293f
{
    public final j b;

    public void g(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Object[] objArray;
       j q = this.b.q;
       Objects.requireNonNull(q);
       if (PatchProxy.applyVoidOneRefs(p0, q, b0.class, "4")) {
       }else if(q.d.l != null){
          p0 = p0.a;
          if (p0 != null) {
             int i = 0;
             if (p0.equals(q.e.f())) {
                objArray = new Object[i];
                a.D().s("AutoDownloadBarHandler", "getCurrentMagicFace equals clickone", objArray);
             }else if(q.e.f() instanceof b && q.e.f().a("sample")){
                objArray = new Object[i];
                a.D().s("AutoDownloadBarHandler", "sample download bar is showing", objArray);
             }else {
                q.d(2);
             }
          }
       }
       return;
    }
}
