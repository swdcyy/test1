package b03.b;
import java.util.Map;
import nsd.u;
import java.lang.System;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import b03.d;
import java.lang.StringBuilder;

public final class b	// class@0002e2
{
    public final long a;
    public long b;
    public Map c;
    public long d;

    public void b(){
       super(0, 0, null, 0, 15, null);
    }
    public void b(long p0,long p1,Map p2,long p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = System.currentTimeMillis();
       }
       if (p4 & 0x02) {
          p1 = 0;
       }
       ConcurrentHashMap uConcurrentH = (p4 & 0x04)? new ConcurrentHashMap(): null;
       if (p4 & 0x08) {
          p3 = 0;
       }
       a.p(uConcurrentH, "recordMap");
       super();
       this.a = p0;
       this.b = p1;
       this.c = uConcurrentH;
       this.d = p3;
       return;
    }
    public final Map a(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b && (!this.a - p0.a && (!this.b - p0.b && (a.g(this.c, p0.c) && !this.d - p0.d))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       b obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       long l = 32;
       b tb = this.b;
       int i = (((int)(obj ^ (obj >> l)) * 31) + (int)(tb ^ (tb >> l))) * 31;
       obj = this.c;
       int i1 = (obj != null)? obj.hashCode(): 0;
       tb = this.d;
       return (((i + i1) * 31) + (int)(tb ^ (tb >> l)));
    }
    public String toString(){
       Iterator obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       obj = this.c.entrySet().iterator();
       Object obj1 = 1;
       while (obj.hasNext()) {
          Map$Entry uEntry = obj.next();
          if (uEntry.getValue().a() != 4) {
             obj1 = null;
          }
          if (obj1) {
             linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
          }
       }
       LinkedHashMap linkedHashMa1 = new LinkedHashMap();
       obj = this.c.entrySet().iterator();
       while (obj.hasNext()) {
          Map$Entry uEntry1 = obj.next();
          Object obj2 = (uEntry1.getValue().a() == 2)? 1: null;
          if (obj2) {
             linkedHashMa1.put(uEntry1.getKey(), uEntry1.getValue());
          }
       }
       return "createAt: "+this.a+"; "+"lastFetchMagicListAt: "+this.b+"; "+"enableCleanPreload: "+this.d+"; "+"recordMap.size: "+this.c.size()+"; "+"preloadSize.size: "+linkedHashMa1.size()+"; "+"sendByMe: "+linkedHashMa;
    }
}
