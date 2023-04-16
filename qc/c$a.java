package qc.c$a;
import tc.l$b;
import qc.c;
import java.lang.Object;
import com.facebook.cache.common.CacheKey;
import java.util.LinkedHashSet;

public class c$a implements l$b	// class@0029bf
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(Object p0,boolean p1){
       c$a ta = this.a;
       _monitor_enter(ta);
       if (p1) {
          ta.d.add(p0);
       }else {
          ta.d.remove(p0);
       }
       _monitor_exit(ta);
       return;
    }
}
