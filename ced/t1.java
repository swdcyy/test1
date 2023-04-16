package ced.t1;
import erd.g;
import com.yxcorp.plugin.search.result.hashtag.presenters.g0;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;

public final class t1 implements g	// class@00057f
{
    public final g0 b;

    public void t1(g0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       t1 tb = this.b;
       Objects.requireNonNull(tb);
       tb.R8(p0.intValue(), true);
    }
}
