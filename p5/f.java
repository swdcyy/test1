package p5.f;
import java.lang.Object;
import androidx.collection.LruCache;
import java.lang.String;
import w4.e;

public class f	// class@0028bd
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
    public static f c(){
       return f.b;
    }
    public void a(){
       this.a.evictAll();
    }
    public e b(String p0){
       if (p0 == null) {
          return null;
       }
       return this.a.get(p0);
    }
    public void d(String p0,e p1){
       if (p0 == null) {
          return;
       }
       this.a.put(p0, p1);
       return;
    }
}
