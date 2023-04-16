package g5.f;
import java.lang.Object;
import androidx.collection.LruCache;
import java.lang.String;
import a5.e;

public class f	// class@002046
{
    public final LruCache a;
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
       this.a = new LruCache(20);
    }
    public static f a(){
       return f.b;
    }
    public void b(String p0,e p1){
       if (p0 == null) {
          return;
       }
       this.a.put(p0, p1);
       return;
    }
}
