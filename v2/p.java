package v2.p;
import v2.q0;
import androidx.room.RoomDatabase;
import java.lang.String;
import a3.f;
import java.lang.Object;
import java.lang.Iterable;
import java.util.Iterator;

public abstract class p extends q0	// class@002659
{

    public void p(RoomDatabase p0){
       super(p0);
    }
    public abstract String d();
    public abstract void g(f p0,Object p1);
    public final int h(Object p0){
       f uof = this.a();
       this.g(uof, p0);
       this.f(uof);
       return uof.executeUpdateDelete();
    }
    public final int i(Iterable p0){
       f uof = this.a();
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          this.g(uof, iterator.next());
          i = i + uof.executeUpdateDelete();
       }
       this.f(uof);
       return i;
    }
}
