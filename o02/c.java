package o02.c;
import erd.g;
import h91.a;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public class c implements g	// class@00344a
{
    public final a b;

    public void c(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          p0 = this.b;
          if (p0 != null) {
             p0.onSuccess(Boolean.TRUE);
          }
       }
       return;
    }
}
