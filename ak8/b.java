package ak8.b;
import java.lang.Runnable;
import ak8.a;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentResponse;
import java.lang.String;
import java.lang.Object;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import java.lang.System;
import java.lang.reflect.Type;

public final class b implements Runnable	// class@00009f
{
    public final a b;
    public final PageComponentResponse c;
    public final String d;
    public final long e;

    public void b(a p0,PageComponentResponse p1,String p2,long p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       b tb = this.b;
       if (tb != null) {
          PageComponentResponse pageComponen = tb.a(this.c);
          if (pageComponen != null) {
             b.a(0x5f2ddeb4).c(this.d, pageComponen, PageComponentResponse.class, (this.e + System.currentTimeMillis()));
          }
       }
       return;
    }
}
