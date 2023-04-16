package aegon.chrome.base.e;
import java.lang.Iterable;
import java.lang.Object;
import java.util.ArrayList;
import aegon.chrome.base.ThreadUtils$a;
import java.util.Objects;
import java.util.List;
import java.util.Iterator;
import aegon.chrome.base.e$a;

public class e implements Iterable	// class@000065
{
    public final List b;
    public final ThreadUtils$a c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public static final boolean h;

    static {
    }
    public void e(){
       super();
       this.b = new ArrayList();
       this.g = true;
       this.c = new ThreadUtils$a();
    }
    public boolean b(Object p0){
       if (this.g != null) {
          Objects.requireNonNull(this.c);
       }
       if (p0 == null || this.b.contains(p0)) {
          return false;
       }else {
          this.b.add(p0);
          this.e = this.e + 1;
          return 1;
       }
    }
    public int d(){
       return this.b.size();
    }
    public Iterator iterator(){
       if (this.g != null) {
          Objects.requireNonNull(this.c);
       }
       return new e$a(this);
    }
    public void l(){
       this.g = false;
    }
    public Object m(int p0){
       return this.b.get(p0);
    }
    public void n(){
       this.d = this.d + 1;
    }
}
