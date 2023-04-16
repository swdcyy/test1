package com.yxcorp.gifshow.log.stid.b;
import java.lang.Runnable;
import java.lang.Object;
import y2b.c;
import k2b.x1;
import com.yxcorp.gifshow.log.n;
import java.util.List;
import java.util.Map;

public final class b implements Runnable	// class@001b40
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void run(){
       List list = n.A1().w();
       List list1 = n.A1().h();
       if (list != null && list.size() > 0) {
          c.k(list, c.b, c.a, c.c);
       }
       if (list1 != null && list1.size() > 0) {
          c.k(list1, c.e, c.d, c.f);
       }
       c.g = true;
       return;
    }
}
