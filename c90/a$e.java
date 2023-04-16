package c90.a$e;
import erd.o;
import kotlin.jvm.internal.Ref$IntRef;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Number;
import java.lang.Math;

public final class a$e implements o	// class@000ce9
{
    public final Ref$IntRef b;
    public final Ref$IntRef c;
    public final HashMap d;
    public final HashMap e;

    public void a$e(Ref$IntRef p0,Ref$IntRef p1,HashMap p2,HashMap p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public Object apply(Object p0){
       float f4;
       Iterator iterator;
       Integer integer = PatchProxy.applyOneRefs(p0, this, a$e.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          float f = (float)this.b.element * 0x3f000000;
          float f1 = (float)this.c.element * 0.20f;
          float f2 = 0;
          float f3 = 15.00f;
          if (this.d.isEmpty()) {
             f4 = 15.00f;
          }else {
             iterator = this.d.entrySet().iterator();
             f4 = 0;
             while (iterator.hasNext()) {
                f4 = f4 + iterator.next().getValue().floatValue();
             }
             f4 = (f4 / (float)this.d.size()) * 0.15f;
          }
          if (!this.e.isEmpty()) {
             iterator = this.e.entrySet().iterator();
             while (iterator.hasNext()) {
                f2 = f2 + iterator.next().getValue().floatValue();
             }
             f3 = (f2 / (float)this.e.size()) * 0.15f;
          }
          integer = Integer.valueOf(Math.min(100, (int)(((f + f1) + f4) + f3)));
       }
       return integer;
    }
}
