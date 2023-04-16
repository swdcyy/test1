package k1.a;
import java.lang.Object;
import androidx.core.util.Pools$SimplePool;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.RuntimeException;
import z1.f;
import java.util.List;

public final class a	// class@002454
{
    public final f a;
    public final SimpleArrayMap b;
    public final ArrayList c;
    public final HashSet d;

    public void a(){
       super();
       this.a = new Pools$SimplePool(10);
       this.b = new SimpleArrayMap();
       this.c = new ArrayList();
       this.d = new HashSet();
    }
    public void a(Object p0,Object p1){
       if (!this.b.containsKey(p0) || !this.b.containsKey(p1)) {
          throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
       }
       ArrayList uArrayList = this.b.get(p0);
       if (uArrayList == null) {
          uArrayList = this.f();
          this.b.put(p0, uArrayList);
       }
       uArrayList.add(p1);
       return;
    }
    public void b(Object p0){
       if (!this.b.containsKey(p0)) {
          this.b.put(p0, null);
       }
       return;
    }
    public void c(){
       int i = this.b.size();
       int i1 = 0;
       while (i1 < i) {
          ArrayList uArrayList = this.b.valueAt(i1);
          if (uArrayList != null) {
             this.k(uArrayList);
          }
          i1 = i1 + 1;
       }
       this.b.clear();
       return;
    }
    public boolean d(Object p0){
       return this.b.containsKey(p0);
    }
    public final void e(Object p0,ArrayList p1,HashSet p2){
       if (p1.contains(p0)) {
          return;
       }
       if (p2.contains(p0)) {
          throw new RuntimeException("This graph contains cyclic dependencies");
       }
       p2.add(p0);
       ArrayList uArrayList = this.b.get(p0);
       if (uArrayList != null) {
          int i1 = uArrayList.size();
          for (int i = 0; i < i1; i = i + 1) {
             this.e(uArrayList.get(i), p1, p2);
          }
       }
       p2.remove(p0);
       p1.add(p0);
       return;
    }
    public final ArrayList f(){
       ArrayList uArrayList = this.a.q();
       if (uArrayList == null) {
          uArrayList = new ArrayList();
       }
       return uArrayList;
    }
    public List g(Object p0){
       return this.b.get(p0);
    }
    public List h(Object p0){
       int i = this.b.size();
       ArrayList uArrayList = null;
       int i1 = 0;
       while (i1 < i) {
          ArrayList uArrayList1 = this.b.valueAt(i1);
          if (uArrayList1 != null && uArrayList1.contains(p0)) {
             if (uArrayList == null) {
                uArrayList = new ArrayList();
             }
             uArrayList.add(this.b.keyAt(i1));
          }
          i1 = i1 + 1;
       }
       return uArrayList;
    }
    public ArrayList i(){
       this.c.clear();
       this.d.clear();
       int i = this.b.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.e(this.b.keyAt(i1), this.c, this.d);
       }
       return this.c;
    }
    public boolean j(Object p0){
       int i = this.b.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return false;
          }
          ArrayList uArrayList = this.b.valueAt(i1);
          if (uArrayList != null && uArrayList.contains(p0)) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return true;
    }
    public final void k(ArrayList p0){
       p0.clear();
       this.a.a(p0);
    }
}
