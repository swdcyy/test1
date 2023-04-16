package g33.l;
import erd.g;
import ps5.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Boolean;

public final class l implements g	// class@002a56
{
    public final b b;

    public void l(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       if (tb != null) {
          tb.accept(Boolean.FALSE);
       }
       return;
    }
}
