package jmd.b$d$b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import w46.b;

public final class b$d$b implements g	// class@00170c
{
    public static final b$d$b b;

    static {
       b$d$b.b = new b$d$b();
    }
    public void b$d$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d$b.class, "1")) {
       }else {
          a.D().e("ThreeOptionsVote", "voteOption error: ", p0);
       }
       return;
    }
}
