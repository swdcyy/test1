package ic9.i;
import erd.o;
import ic9.w;
import ic9.b;
import java.lang.Object;
import java.lang.Float;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Iterator;
import java.util.List;
import ic9.a;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Math;

public final class i implements o	// class@002677
{
    public final w b;
    public final b c;

    public void i(w p0,b p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       p0 = this.c.a;
       Object obj = PatchProxy.applyOneRefs(p0, tb, w.class, "21");
       float f = 0;
       if (obj != PatchProxyResult.class) {
          f = obj.floatValue();
       }else {
          p0 = p0.iterator();
          float f1 = 0;
          float f2 = 0;
          while (p0.hasNext()) {
             a uoa = p0.next();
             f1 = f1 + (float)uoa.d();
             float f3 = (float)uoa.d() * uoa.a();
             f2 = f2 + f3;
          }
          if (f1 - f) {
             f2 = f2 / f1;
             Object[] objArray = new Object[0];
             a.D().y("CompoundProcessor", "calculateProgress£¬currentProgress:"+f2, objArray);
             if (f2 - f >= 0) {
                f = Math.min(f2, a.i);
             }
          }
       }
       return Float.valueOf(f);
    }
}
