package av4.b;
import java.lang.Runnable;
import com.kuaishou.render.engine.tk.view.TKWrapView;
import java.lang.Object;

public final class b implements Runnable	// class@00030d
{
    public final TKWrapView b;
    public final Object[] c;

    public void b(TKWrapView p0,Object[] p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       TKWrapView.g(this.b, this.c);
    }
}
