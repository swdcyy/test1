package nd9.e;
import erd.g;
import nd9.l;
import java.lang.Object;
import ad9.a;
import java.util.Objects;
import java.lang.String;

public final class e implements g	// class@00313a
{
    public final l b;

    public void e(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (("magicface").equals(p0.b)) {
          tb.K = false;
          tb.h2();
       }
       return;
    }
}
