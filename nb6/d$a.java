package nb6.d$a;
import d0d.g$b;
import java.lang.Object;
import java.lang.String;
import d0d.h;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$ApiCostDetailStatEvent;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import ta6.a;
import ekd.k1;
import java.util.Random;

public final class d$a implements g$b	// class@001f25
{
    public static final d$a a;

    static {
       d$a.a = new d$a();
    }
    public void d$a(){
       super();
    }
    public void a(String p0,boolean p1,boolean p2){
       h.a(this, p0, p1, p2);
    }
    public final void b(ClientStat$StatPackage p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(d$a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, d$a.class, "1")) {
          return;
       }
       a.p(p0, "statPackage");
       if (!p1) {
          p1.ratio = 0x3f800000;
          b.a(0x4b316083).j(p0);
       }else {
          float f = a.b();
          if (k1.b.nextFloat() - f <= 0) {
             p0.apiCostDetailStatEvent.ratio = f;
             b.a(0x4b316083).j(p0);
          }
       }
       return;
    }
}
