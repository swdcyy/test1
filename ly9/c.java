package ly9.c;
import erd.g;
import ly9.f;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import ly9.e;
import java.lang.Runnable;
import ekd.k1;

public final class c implements g	// class@002eb5
{
    public final f b;

    public void c(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       p0 = new e(tb);
       k1.r(p0, 100);
    }
}
