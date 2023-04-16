package trd.s0;
import trd.r0;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import urd.c;
import msd.l;
import java.util.concurrent.ConcurrentMap;
import msd.a;
import kotlin.Pair;
import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;
import trd.t0;
import java.util.Properties;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class s0 extends r0	// class@002584
{

    public void s0(){
       super();
    }
    public static final Map d(Map p0){
       a.p(p0, "builder");
       return p0.e();
    }
    public static final Map e(int p0,l p1){
       Map map = s0.h(p0);
       p1.invoke(map);
       return s0.d(map);
    }
    public static final Map f(l p0){
       Map map = s0.g();
       p0.invoke(map);
       return s0.d(map);
    }
    public static final Map g(){
       return new c();
    }
    public static final Map h(int p0){
       return new c(p0);
    }
    public static final Object i(ConcurrentMap p0,Object p1,a p2){
       a.p(p0, "$this$getOrPut");
       a.p(p2, "defaultValue");
       Object obj = p0.get(p1);
       if (obj != null) {
       }else {
          p2 = p2.invoke();
          p0 = p0.putIfAbsent(p1, p2);
          obj = (p0 != null)? p0: p2;
       }
       return obj;
    }
    public static final int j(int p0){
       if (p0 < 0) {
       }else if(p0 < 3){
          p0++;
       }else if(p0 < 0x40000000){
          p0 = (int)(((float)p0 / 0x3f400000) + 0x3f800000);
       }else {
          p0 = Integer.MAX_VALUE;
       }
       return p0;
    }
    public static final Map k(Pair p0){
       a.p(p0, "pair");
       Map map = Collections.singletonMap(p0.getFirst(), p0.getSecond());
       a.o(map, "java.util.Collections.si¡­\(pair.first, pair.second\)");
       return map;
    }
    public static final SortedMap l(Comparator p0,Pair[] p1){
       a.p(p0, "comparator");
       a.p(p1, "pairs");
       TreeMap treeMap = new TreeMap(p0);
       t0.y0(treeMap, p1);
       return treeMap;
    }
    public static final SortedMap m(Pair[] p0){
       a.p(p0, "pairs");
       TreeMap treeMap = new TreeMap();
       t0.y0(treeMap, p0);
       return treeMap;
    }
    public static final Properties n(Map p0){
       Properties properties = new Properties();
       properties.putAll(p0);
       return properties;
    }
    public static final Map o(Map p0){
       a.p(p0, "$this$toSingletonMap");
       Map$Entry uEntry = p0.entrySet().iterator().next();
       Object key = uEntry.getKey();
       uEntry = Collections.singletonMap(key, uEntry.getValue());
       a.o(uEntry, "with\(entries.iterator\(\).¡­ingletonMap\(key, value\) }");
       return uEntry;
    }
    public static final Map p(Map p0){
       return s0.o(p0);
    }
    public static final SortedMap q(Map p0){
       a.p(p0, "$this$toSortedMap");
       return new TreeMap(p0);
    }
    public static final SortedMap r(Map p0,Comparator p1){
       a.p(p0, "$this$toSortedMap");
       a.p(p1, "comparator");
       TreeMap treeMap = new TreeMap(p1);
       treeMap.putAll(p0);
       return treeMap;
    }
}
