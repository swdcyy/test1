package f92.b;
import java.lang.String;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import lm1.d;

public class b	// class@0028f2
{
    public final String a;
    public final GiftMessage b;
    public final int c;
    public final Gift d;
    public final boolean e;
    public final boolean f;
    public UserInfo g;
    public Map h;
    public Object i;
    public String j;
    public String k;
    public String l;
    public boolean m;
    public boolean n;
    public final Map o;
    public int p;
    public d q;

    public void b(String p0,GiftMessage p1,Gift p2,int p3,boolean p4,boolean p5,int p6){
       super();
       this.o = new ConcurrentHashMap();
       this.a = p0;
       this.b = p1;
       this.d = p2;
       this.c = p3;
       this.e = p4;
       this.f = p5;
       this.p = p6;
    }
    public Object a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.o.get(p0);
    }
    public void b(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       this.o.put(p0, p1);
       return;
    }
    public void c(d p0){
       this.q = p0;
    }
}
