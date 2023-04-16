package il9.e$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public class e$b	// class@00286c
{
    public int a;
    public int b;

    public void e$b(int p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static e$b a(int p0,int p1){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new e$b(p0, p1);
    }
}
