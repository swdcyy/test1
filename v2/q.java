package v2.q;
import v2.q0;
import androidx.room.RoomDatabase;
import a3.f;
import java.lang.Object;
import java.lang.Iterable;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.lang.Long;

public abstract class q extends q0	// class@00265b
{

    public void q(RoomDatabase p0){
       super(p0);
    }
    public abstract void g(f p0,Object p1);
    public final void h(Iterable p0){
       f uof = this.a();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.g(uof, iterator.next());
          uof.executeInsert();
       }
       this.f(uof);
       return;
    }
    public final void i(Object p0){
       f uof = this.a();
       this.g(uof, p0);
       uof.executeInsert();
       this.f(uof);
    }
    public final long j(Object p0){
       f uof = this.a();
       this.g(uof, p0);
       this.f(uof);
       return uof.executeInsert();
    }
    public final long[] k(Collection p0){
       f uof = this.a();
       long[] olongArray = new long[p0.size()];
       int i = 0;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.g(uof, iterator.next());
          olongArray[i] = uof.executeInsert();
          i = i + 1;
       }
       this.f(uof);
       return olongArray;
    }
    public final List l(Collection p0){
       f uof = this.a();
       ArrayList uArrayList = new ArrayList(p0.size());
       int i = 0;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.g(uof, iterator.next());
          uArrayList.add(i, Long.valueOf(uof.executeInsert()));
          i = i + 1;
       }
       this.f(uof);
       return uArrayList;
    }
    public final List m(Object[] p0){
       f uof = this.a();
       ArrayList uArrayList = new ArrayList(p0.length);
       int len = p0.length;
       int i1 = 0;
       for (int i = 0; i < len; i = i + 1) {
          this.g(uof, p0[i]);
          uArrayList.add(i1, Long.valueOf(uof.executeInsert()));
          i1 = i1 + 1;
       }
       this.f(uof);
       return uArrayList;
    }
}
