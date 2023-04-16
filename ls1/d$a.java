package ls1.d$a;
import ub.a;
import msd.l;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class d$a extends a	// class@003010
{
    public final l b;

    public void d$a(l p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$a.class, "1")) {
          return;
       }
       this.b.invoke(p1);
       return;
    }
}
