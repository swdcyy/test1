package aegon.chrome.net.impl.k;
import aegon.chrome.net.r;
import java.util.List;
import java.lang.String;
import java.util.Collections;
import aegon.chrome.net.impl.k$a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.lang.System;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Long;

public final class k extends r	// class@0000d0
{
    public final List a;
    public final int b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final AtomicLong g;
    public final k$a h;

    public void k(List p0,int p1,String p2,List p3,boolean p4,String p5,String p6,long p7){
       super();
       this.a = Collections.unmodifiableList(p0);
       this.b = p1;
       this.c = p2;
       this.h = new k$a(Collections.unmodifiableList(p3));
       this.d = p4;
       this.e = p5;
       this.f = p6;
       this.g = new AtomicLong(p7);
    }
    public Map a(){
       k th = this.h;
       k$a b = th.b;
       if (b != null) {
       }else {
          TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
          Iterator iterator = th.a.iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             ArrayList uArrayList = new ArrayList();
             if (treeMap.containsKey(uEntry.getKey())) {
                uArrayList.addAll(treeMap.get(uEntry.getKey()));
             }
             uArrayList.add(uEntry.getValue());
             treeMap.put(uEntry.getKey(), Collections.unmodifiableList(uArrayList));
          }
          b = Collections.unmodifiableMap(treeMap);
          th.b = b;
       }
       return b;
    }
    public List b(){
       return this.h.a;
    }
    public int c(){
       return this.b;
    }
    public String d(){
       return this.c;
    }
    public String e(){
       return this.e;
    }
    public String f(){
       return this.f;
    }
    public long g(){
       return this.g.get();
    }
    public String h(){
       k ta = this.a;
       return ta.get((ta.size() - 1));
    }
    public List i(){
       return this.a;
    }
    public boolean j(){
       return this.d;
    }
    public void k(long p0){
       this.g.set(p0);
    }
    public String toString(){
       Object[] objArray = new Object[10];
       objArray[0] = Integer.toHexString(System.identityHashCode(this));
       k ta = this.a;
       objArray[1] = ta.get((ta.size() - 1));
       objArray[2] = this.a.toString();
       objArray[3] = Integer.valueOf(this.c());
       objArray[4] = this.d();
       objArray[5] = this.b().toString();
       objArray[6] = Boolean.valueOf(this.j());
       objArray[7] = this.e();
       objArray[8] = this.f();
       objArray[9] = Long.valueOf(this.g.get());
       return String.format(Locale.ROOT, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", objArray);
    }
}
