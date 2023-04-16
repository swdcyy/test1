package j21.d;
import ok.x;
import j21.k;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import j21.c;
import com.google.common.base.Optional;
import v91.n;

public final class d implements x	// class@002a3b
{
    public final k b;
    public final String c;

    public void d(k p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object get(){
       d tb = this.b;
       Objects.requireNonNull(tb);
       return n.e(this.c, new c(tb));
    }
}
