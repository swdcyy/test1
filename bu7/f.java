package bu7.f;
import erd.g;
import com.kwai.tokenshare.b$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.tokenshare.b;
import com.kwai.tokenshare.b$b;

public final class f implements g	// class@000486
{
    public final b$a b;
    public final String c;

    public void f(b$a p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       f tb = this.b;
       f tc = this.c;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          p0 = tb.a.d;
          if (p0 != null) {
             p0.b(tc);
          }
       }
       return;
    }
}
