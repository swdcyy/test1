package n0.d;
import java.lang.Object;
import java.util.WeakHashMap;
import java.lang.CharSequence;
import android.text.Layout;
import java.util.Map;

public class d	// class@0026a9
{
    public Map a;
    public static d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
       this.a = new WeakHashMap();
    }
    public synchronized Layout a(CharSequence p0){
       return this.a.get(p0);
    }
    public synchronized void b(CharSequence p0,Layout p1){
       this.a.put(p0, p1);
    }
    public synchronized Layout c(CharSequence p0){
       return this.a.remove(p0);
    }
}
