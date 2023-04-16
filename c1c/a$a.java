package c1c.a$a;
import rsd.c;
import java.lang.Object;
import c1c.a;
import vsd.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import xyb.a;
import java.lang.StringBuilder;
import q87.c;

public final class a$a extends c	// class@0004e6
{
    public final Object b;
    public final a c;

    public void a$a(Object p0,Object p1,a p2){
       this.b = p0;
       this.c = p2;
       super(p1);
    }
    public void c(n p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a.class, "1")) {
          return;
       }
       a.p(p0, "property");
       Boolean uBoolean = p2.booleanValue();
       p2 = this.c;
       if (p1.booleanValue() && uBoolean == null) {
          FilterConfig uFilterConfi = p2.c();
          if (uFilterConfi != null) {
             p1 = a.D();
             StringBuilder str = "外部改变滤镜源，恢复原滤镜力度 ";
             FilterConfig uFilterConfi1 = p2.c();
             String str1 = (uFilterConfi1 != null)? uFilterConfi1.toSimpleString(): null;
             Object[] objArray = new Object[0];
             p1.w("EffectBus-Filter_Base", str+str1, objArray);
             p2.i(uFilterConfi);
          }
       }
       return;
    }
}
