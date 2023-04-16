package gk0.b;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import gk0.b$a;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import gk0.a;

public class b	// class@002509
{
    public List a;
    public List b;
    public List c;
    public List d;

    public void b(){
       super();
       this.a = new CopyOnWriteArrayList();
       this.b = new CopyOnWriteArrayList();
       this.c = new CopyOnWriteArrayList();
       this.d = new CopyOnWriteArrayList();
    }
    public static b a(){
       return b$a.a;
    }
    public List b(){
       return this.d;
    }
    public List c(){
       return this.b;
    }
    public List d(){
       return this.a;
    }
    public List e(){
       return this.c;
    }
    public void f(String p0,String p1,String p2,long p3,long p4){
       b uob = this;
       b uob1 = b.class;
       if (PatchProxy.isSupport(uob1)) {
          Object[] objArray = new Object[]{p0,p1,p2,Long.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uob1, "3")) {
             return;
          }
       }
       a uoa = new a(p0, p1, p2, p3, p4);
       uob.c.add(uob1);
       return;
    }
}
