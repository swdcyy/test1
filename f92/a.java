package f92.a;
import java.lang.String;
import com.kuaishou.live.core.show.gift.GiftMessage;
import java.util.List;
import lm1.a;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;

public class a	// class@0028f1
{
    public final String a;
    public final GiftMessage b;
    public final List c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final Map h;
    public final a i;

    public void a(String p0,GiftMessage p1,List p2,int p3,int p4,boolean p5,boolean p6,a p7){
       super();
       this.h = new ConcurrentHashMap();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.e = p3;
       this.d = p4;
       this.f = p5;
       this.g = p6;
       this.i = p7;
    }
    public void a(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       this.h.put(p0, p1);
       return;
    }
}
