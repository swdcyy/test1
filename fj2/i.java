package fj2.i;
import erd.g;
import fj2.o;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.util.resource.Category;
import boc.b;
import com.yxcorp.gifshow.util.resource.n;
import com.yxcorp.gifshow.util.resource.n$c;

public final class i implements g	// class@002971
{
    public final o b;

    public void i(o p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          n.l(Category.SCREENCAST_PATCH);
          n.a(tb.C);
       }
       return;
    }
}
