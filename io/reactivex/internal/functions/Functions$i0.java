package io.reactivex.internal.functions.Functions$i0;
import erd.b;
import erd.o;
import java.lang.Object;
import java.util.Map;
import java.util.Collection;

public final class Functions$i0 implements b	// class@0011be
{
    public final o b;
    public final o c;
    public final o d;

    public void Functions$i0(o p0,o p1,o p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void accept(Object p0,Object p1){
       Object obj = this.d.apply(p1);
       Collection uCollection = p0.get(obj);
       if (uCollection == null) {
          uCollection = this.b.apply(obj);
          p0.put(obj, uCollection);
       }
       uCollection.add(this.c.apply(p1));
       return;
    }
}
