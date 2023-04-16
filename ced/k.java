package ced.k;
import erd.g;
import com.yxcorp.plugin.search.result.hashtag.presenters.f;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.plugin.search.result.hashtag.presenters.a;

public final class k implements g	// class@000564
{
    public final f b;

    public void k(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       tb.C = p0.booleanValue();
       tb.P8(tb.q);
    }
}
