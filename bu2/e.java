package bu2.e;
import erd.g;
import z1.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Boolean;

public final class e implements g	// class@000458
{
    public final a b;

    public void e(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       if (tb != null) {
          tb.accept(Boolean.FALSE);
       }
       return;
    }
}
