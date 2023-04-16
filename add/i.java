package add.i;
import ok.h;
import com.yxcorp.plugin.search.result.a;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import g9c.a;
import com.yxcorp.plugin.search.entity.SearchItem;

public final class i implements h	// class@0000eb
{
    public final a b;

    public void i(a p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       SearchItem searchItem = null;
       if (p0 == null) {
       }else {
          a u = tb.u;
          if (u != null) {
             p0 = u.N0(p0.intValue());
             if (p0 != null) {
                searchItem = p0.mUser;
             }
          }
       }
       return searchItem;
    }
}
