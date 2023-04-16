package a1c.b;
import io.reactivex.g;
import a1c.d;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import t16.a;
import java.lang.String;
import a1c.c;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import j16.b;
import com.yxcorp.gifshow.prettify.v4.magic.filter.n;

public final class b implements g	// class@000020
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       n.f(new a("record", "taken_in_resource"), tb.a, new c(tb, p0));
    }
}
