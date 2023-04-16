package eq8.a$c;
import z1.f;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.IllegalStateException;

public class a$c implements f	// class@00222b
{
    public final Object[] a;
    public int b;

    public void a$c(int p0){
       super();
       if (p0 <= 0) {
          throw new IllegalArgumentException("The max pool size must be > 0");
       }
       Object[] objArray = new Object[p0];
       this.a = objArray;
       return;
    }
    public boolean a(Object p0){
       a$c tb;
       a$c uoc;
       Object obj = PatchProxy.applyOneRefs(p0, this, a$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       int i = 0;
       while (true) {
          tb = this.b;
          if (i < tb) {
             if (this.a[i] == p0) {
                uoc = 1;
             label_0026 :
                if (uoc) {
                   throw new IllegalStateException("Already in the pool!");
                }
                uoc = this.a;
                if (tb >= uoc.length) {
                   return b;
                }
                break ;
             }else {
                i = i + 1;
             }
          }else {
             uoc = null;
             goto label_0026 ;
          }
       }
       uoc[tb] = p0;
       this.b = tb + 1;
       return 1;
    }
    public int b(){
       return this.b;
    }
    public Object q(){
       a$c tb = this.b;
       if (tb <= null) {
          return null;
       }
       int i = tb - 1;
       a$c ta = this.a;
       object oobject = ta[i];
       ta[i] = null;
       this.b = tb - 1;
       return oobject;
    }
}
