package nfd.v2;
import erd.g;
import com.yxcorp.plugin.search.utils.f0;
import com.yxcorp.plugin.search.utils.f0$c;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import ged.g;

public final class v2 implements g	// class@001e18
{
    public final f0 b;
    public final int c;
    public final f0$c d;

    public void v2(f0 p0,int p1,f0$c p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       v2 tb = this.b;
       Objects.requireNonNull(tb);
       g og = new g();
       og.i = true;
       og.d = this.c;
       tb.f(og, p0, this.d);
    }
}
