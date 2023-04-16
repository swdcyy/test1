package auc.a$b;
import t36.f$a;
import java.lang.Object;
import qsc.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$b implements f$a	// class@0002cc
{
    public final boolean a;

    public void a$b(boolean p0){
       this.a = p0;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          p0.a(this.a);
       }
       return;
    }
}
