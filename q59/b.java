package q59.b;
import q59.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public class b implements c	// class@0034d4
{
    public final String a;

    public void b(String p0){
       super();
       this.a = p0;
    }
    public String getOriginData(){
       b ta = this.a;
       if (ta != null) {
       }else {
          ta = "";
       }
       return ta;
    }
    public void updateData(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "newData");
       return;
    }
}
