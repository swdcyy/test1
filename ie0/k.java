package ie0.k;
import erd.o;
import ie0.o;
import ie0.o$b;
import java.lang.Object;
import com.kuaishou.growth.pendant.core.manager.f$a;
import java.util.Objects;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import ce0.b;
import java.lang.StringBuilder;

public final class k implements o	// class@0028aa
{
    public final o b;
    public final o$b c;
    public final int d;

    public void k(o p0,o$b p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       k tb = this.b;
       k td = this.d;
       Objects.requireNonNull(tb);
       this.c.b(p0.b);
       p0 = p0.a;
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(td), p0, tb, oo, "5");
          if (obj != PatchProxyResult.class) {
             p0 = obj;
          }else {
          label_002e :
             Object[] objArray = new Object[0];
             b.C().w("SkinResourceHelper", "cutBitmaps, cutCount = "+td+", originBitmaps.size = "+p0.size(), objArray);
             if (td < null || (td < p0.size() && !p0.isEmpty())) {
                p0 = p0.subList((p0.size() - td), p0.size());
             }
          }
       }else {
          goto label_002e ;
       }
       return p0;
    }
}
