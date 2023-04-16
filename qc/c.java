package qc.c;
import com.facebook.cache.common.CacheKey;
import tc.l;
import java.lang.Object;
import java.util.LinkedHashSet;
import qc.c$a;
import com.facebook.common.references.a;
import qc.c$b;
import tc.l$b;

public class c	// class@0029c1
{
    public final CacheKey a;
    public final l b;
    public final l$b c;
    public final LinkedHashSet d;

    public void c(CacheKey p0,l p1){
       super();
       this.a = p0;
       this.b = p1;
       this.d = new LinkedHashSet();
       this.c = new c$a(this);
    }
    public a a(int p0,a p1){
       return this.b.h(this.b(p0), p1, this.c);
    }
    public final c$b b(int p0){
       return new c$b(this.a, p0);
    }
}
