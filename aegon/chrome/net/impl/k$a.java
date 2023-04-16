package aegon.chrome.net.impl.k$a;
import aegon.chrome.net.r$a;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.lang.String;
import java.util.Comparator;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public final class k$a extends r$a	// class@0000cf
{
    public final List a;
    public Map b;

    public void k$a(List p0){
       super();
       this.a = p0;
    }
    public List a(){
       return this.a;
    }
    public Map b(){
       k$a tb = this.b;
       if (tb != null) {
          return tb;
       }
       TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          ArrayList uArrayList = new ArrayList();
          if (treeMap.containsKey(uEntry.getKey())) {
             uArrayList.addAll(treeMap.get(uEntry.getKey()));
          }
          uArrayList.add(uEntry.getValue());
          treeMap.put(uEntry.getKey(), Collections.unmodifiableList(uArrayList));
       }
       Map map = Collections.unmodifiableMap(treeMap);
       this.b = map;
       return map;
    }
}
