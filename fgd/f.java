package fgd.f;
import cgd.b$c;
import fgd.k;
import java.lang.Object;
import java.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import bgd.a;
import java.lang.String;
import java.lang.Long;
import v56.g;
import java.util.Map;

public final class f implements b$c	// class@000e25
{
    public final k a;

    public void f(k p0){
       this.a = p0;
    }
    public final void a(){
       f ta = this.a;
       Objects.requireNonNull(ta);
       HashMap hashMap = new HashMap();
       Iterator iterator = ta.x.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          String str = uoa.c();
          hashMap.put(str, Long.valueOf(uoa.d()));
       }
       g.f(((float)ta.P8(true) / 1024.00f));
       g.e(hashMap);
       ta.S8();
       return;
    }
}
