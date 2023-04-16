package akd.i;
import java.lang.Runnable;
import com.yxcorp.upgrade.impl.a$b;
import java.lang.Object;
import java.util.Objects;
import java.util.ArrayList;
import com.yxcorp.upgrade.impl.a;
import java.util.Collection;
import java.util.Iterator;
import zjd.h$b;
import zjd.g;

public final class i implements Runnable	// class@000054
{
    public final a$b b;
    public final int c;

    public void i(a$b p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       i tb = this.b;
       i tc = this.c;
       Objects.requireNonNull(tb);
       Iterator iterator = new ArrayList(tb.a.i).iterator();
       while (iterator.hasNext()) {
          iterator.next().e(tc);
       }
       a e = tb.a.e;
       if (e != null) {
          e.j(tc);
       }
       return;
    }
}
