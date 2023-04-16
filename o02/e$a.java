package o02.e$a;
import erd.g;
import h91.a;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class e$a implements g	// class@00344c
{
    public final a b;

    public void e$a(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
       }else {
          e$a tb = this.b;
          if (tb != null) {
             tb.onSuccess(p0);
          }
       }
       return;
    }
}
