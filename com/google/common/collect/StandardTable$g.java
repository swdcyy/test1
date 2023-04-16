package com.google.common.collect.StandardTable$g;
import com.google.common.collect.Maps$l;
import com.google.common.collect.StandardTable;
import java.lang.Object;
import ok.n;
import java.util.Iterator;
import java.util.Map;
import com.google.common.collect.Iterators;
import java.util.Set;
import com.google.common.collect.StandardTable$g$a;
import com.google.common.collect.Maps;

public class StandardTable$g extends Maps$l	// class@00188d
{
    public final Object b;
    public Map c;
    public final StandardTable d;

    public void StandardTable$g(StandardTable p0,Object p1){
       this.d = p0;
       super();
       n.j(p1);
       this.b = p1;
    }
    public Iterator a(){
       Map map = this.c();
       if (map == null) {
          return Iterators.j();
       }
       return new StandardTable$g$a(this, map.entrySet().iterator());
    }
    public Map c(){
       Map map;
       StandardTable$g tc = this.c;
       if (tc == null || (tc.isEmpty() && this.d.backingMap.containsKey(this.b))) {
          map = this.d.backingMap.get(this.b);
          this.c = map;
       }else {
          map = this.c;
       }
       return map;
    }
    public void clear(){
       Map map = this.c();
       if (map != null) {
          map.clear();
       }
       this.e();
       return;
    }
    public boolean containsKey(Object p0){
       Map map = this.c();
       boolean b = (p0 != null && (map != null && Maps.x(map, p0)))? true: false;
       return b;
    }
    public void e(){
       if (this.c() != null && this.c.isEmpty()) {
          this.d.backingMap.remove(this.b);
          this.c = null;
       }
       return;
    }
    public Object get(Object p0){
       Map map = this.c();
       p0 = (p0 != null && map != null)? Maps.y(map, p0): null;
       return p0;
    }
    public Object put(Object p0,Object p1){
       n.j(p0);
       n.j(p1);
       StandardTable$g tc = this.c;
       if (tc != null && !tc.isEmpty()) {
          return this.c.put(p0, p1);
       }
       return this.d.put(this.b, p0, p1);
    }
    public Object remove(Object p0){
       Map map = this.c();
       if (map == null) {
          return null;
       }
       this.e();
       return Maps.z(map, p0);
    }
    public int size(){
       Map map = this.c();
       int i = (map == null)? 0: map.size();
       return i;
    }
}
