package bq1.b;
import ub.a;
import bq1.a;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class b extends a	// class@0003df
{
    public final a b;

    public void b(a p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       this.b.P3();
       return;
    }
}
