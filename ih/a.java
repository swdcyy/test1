package ih.a;
import bh.p;
import java.util.HashSet;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import com.yxcorp.utility.Log;
import bh.a;

public class a implements p	// class@0021e8
{
    public static final Set a;

    static {
       a.a = new HashSet();
    }
    public void a(){
       super();
    }
    public void a(String p0,Throwable p1){
       Set a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "5")) {
          return;
       }
       a = a.a;
       if (a.contains(p0)) {
          return;
       }
       Log.o("K-ANIMATION", p0, p1);
       a.add(p0);
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       this.a(p0, null);
       return;
    }
    public void debug(String p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "2")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, null, this, uoa, "3") && a.a) {
          Log.c("K-ANIMATION", p0, null);
       }
       return;
    }
    public void debug(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       if (a.a) {
          Log.c("K-ANIMATION", p0, p1);
       }
       return;
    }
    public void error(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "6")) {
          return;
       }
       if (a.a) {
          Log.c("K-ANIMATION", p0, p1);
       }
       return;
    }
    public void info(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       Log.g("K-ANIMATION", p0);
       return;
    }
}
