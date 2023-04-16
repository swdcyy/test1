package akd.h;
import java.lang.Runnable;
import com.yxcorp.upgrade.impl.a$b;
import java.lang.Object;
import com.yxcorp.upgrade.impl.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import zjd.h$b;
import zjd.g;
import bkd.b;

public final class h implements Runnable	// class@000053
{
    public final a$b b;

    public void h(a$b p0){
       this.b = p0;
    }
    public final void run(){
       h tb = this.b;
       tb.a.b = 0;
       Iterator iterator = new ArrayList(tb.a.i).iterator();
       while (iterator.hasNext()) {
          iterator.next().a(0);
       }
       a e = tb.a.e;
       if (e != null) {
          e.g();
       }
       a$b a = tb.a;
       if (a.c.b == null) {
          a.j(6);
       }
       return;
    }
}
