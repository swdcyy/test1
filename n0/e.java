package n0.e;
import java.lang.Object;
import android.graphics.Canvas;
import java.util.WeakHashMap;
import java.util.Map;
import java.util.Collections;
import n0.e$a;
import java.util.LinkedHashSet;
import java.util.Set;
import n0.e$b;

public class e	// class@0026af
{
    public Canvas a;
    public e$b b;
    public Map c;
    public e$c d;
    public final Set e;

    public void e(){
       super();
       this.a = new Canvas();
       this.c = Collections.synchronizedMap(new WeakHashMap());
       this.d = new e$a(this);
       this.e = Collections.synchronizedSet(new LinkedHashSet());
    }
    public Set a(){
       return this.e;
    }
    public e$b b(){
       return this.b;
    }
}
