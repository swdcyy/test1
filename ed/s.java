package ed.s;
import ed.f;
import java.util.LinkedList;
import java.lang.Object;
import fb.b;
import java.lang.ref.SoftReference;
import java.util.Queue;

public class s extends f	// class@001f32
{
    public LinkedList f;

    public void s(int p0,int p1,int p2){
       super(p0, p1, p2, false);
       this.f = new LinkedList();
    }
    public void a(Object p0){
       b uob = this.f.poll();
       if (uob == null) {
          uob = new b();
       }
       uob.a = new SoftReference(p0);
       uob.b = new SoftReference(p0);
       uob.c = new SoftReference(p0);
       this.c.add(uob);
       return;
    }
    public Object e(){
       b uob = this.c.poll();
       b a = uob.a;
       Object obj = (a == null)? null: a.get();
       uob.a();
       this.f.add(uob);
       return obj;
    }
}
