package z1.g;
import androidx.core.util.Pools$SimplePool;
import java.lang.Object;

public class g extends Pools$SimplePool	// class@0028ea
{
    public final Object c;

    public void g(int p0){
       super(p0);
       this.c = new Object();
    }
    public boolean a(Object p0){
       g tc = this.c;
       _monitor_enter(tc);
       _monitor_exit(tc);
       return super.a(p0);
    }
    public Object q(){
       g tc = this.c;
       _monitor_enter(tc);
       _monitor_exit(tc);
       return super.q();
    }
}
