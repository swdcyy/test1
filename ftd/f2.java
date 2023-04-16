package ftd.f2;
import ftd.c1;
import ftd.t1;
import ftd.b0;
import ftd.z1;
import ftd.k2;
import kotlinx.coroutines.JobSupport;
import kotlin.TypeCastException;
import java.lang.String;

public abstract class f2 extends b0 implements c1, t1	// class@00163f
{
    public final z1 e;

    public void f2(z1 p0){
       super();
       this.e = p0;
    }
    public boolean E(){
       return true;
    }
    public k2 b(){
       return null;
    }
    public void dispose(){
       f2 te = this.e;
       if (te == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
       }
       te.X0(this);
       return;
    }
}
