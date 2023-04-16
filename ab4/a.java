package ab4.a;
import cb4.c;
import com.kuaishou.merchant.router.b;
import cb4.f;
import com.kuaishou.merchant.router.base.RouterRequest;
import cb4.e;
import java.util.Map;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import ab4.g;

public final class a implements c	// class@00005a
{
    public final b a;
    public final f b;
    public final RouterRequest c;
    public final e d;
    public final Map e;

    public void a(b p0,f p1,RouterRequest p2,e p3,Map p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final void onResult(boolean p0){
       a ta = this.a;
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       a te = this.e;
       Objects.requireNonNull(ta);
       if (p0) {
          tb.d(tc, td, p0);
       }else {
          g.b("MerchantRouter", "startRouterInternal: fallback start with defaultMap");
          ta.c(tc, te, tb);
       }
       return;
    }
}
