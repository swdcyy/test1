package vc.c;
import vc.g;
import vc.d;
import java.lang.Object;
import ua.a;
import com.facebook.cache.disk.b;
import java.util.concurrent.Executor;
import com.facebook.cache.disk.c;
import com.facebook.cache.disk.c$c;
import com.facebook.cache.common.CacheErrorLogger;
import ua.b;
import com.facebook.cache.common.CacheEventListener;
import xa.b;
import com.facebook.cache.disk.f;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class c implements g	// class@002686
{
    public d a;

    public void c(d p0){
       super();
       this.a = p0;
    }
    public static c b(a p0,b p1,Executor p2){
       c$c uoc = new c$c(p0.f, p0.e, p0.b());
       c$c uoc1 = v7;
       c uoc2 = new c(p1, p0.g, uoc1, p0.i, p0.a(), p0.j, p2, p0.l);
       return v9;
    }
    public f a(a p0){
       return c.b(p0, this.a.a(p0), Executors.newSingleThreadExecutor());
    }
}
