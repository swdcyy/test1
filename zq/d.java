package zq.d;
import zq.e;
import zq.a;
import zq.f;
import java.lang.Object;
import zq.d$a;
import zq.d$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import javax.inject.Provider;
import android.content.Context;
import tq.f;
import com.kuaishou.android.vader.persistent.a;
import ar.c;
import zq.h;
import uq.a;
import zq.k;
import upd.a;
import zq.j;
import zq.b;
import zq.g;
import zq.l;
import br.d;
import zq.c;
import ar.d;
import zq.i;
import uq.b;

public final class d implements e	// class@00295f
{
    public final f a;
    public Provider b;
    public Provider c;
    public Provider d;
    public Provider e;
    public Provider f;
    public Provider g;
    public Provider h;
    public Provider i;
    public Provider j;
    public Provider k;
    public Provider l;

    public void d(a p0,f p1){
       super();
       this.a = p1;
       this.d(p0, p1);
    }
    public void d(a p0,f p1,d$a p2){
       super(p0, p1);
    }
    public static d$b c(){
       Object obj = PatchProxy.apply(null, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d$b(null);
    }
    public Map a(){
       Object obj = PatchProxy.apply(null, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.c(this.a, this.d.get(), this.h.get(), this.g.get(), this.i.get());
    }
    public a b(){
       Object obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l.get();
    }
    public final void d(a p0,f p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "2")) {
          return;
       }
       this.b = a.b(k.a(p1));
       this.c = a.b(j.a(p1));
       Provider provider = a.b(b.a(p0));
       this.d = provider;
       this.e = a.b(g.a(p1, provider));
       provider = a.b(l.a(p1));
       this.f = provider;
       this.g = a.b(d.a(this.c, this.e, provider));
       Provider provider1 = a.b(c.a(p0));
       this.h = provider1;
       provider1 = a.b(d.a(this.d, provider1, this.e, this.b, this.c));
       this.i = provider1;
       this.j = h.a(p1, this.d, this.h, this.g, provider1);
       provider1 = a.b(i.a(p1));
       this.k = provider1;
       this.l = a.b(b.a(this.b, this.g, this.i, this.j, provider1));
       return;
    }
}
