package av4.a;
import java.lang.Runnable;
import com.kuaishou.render.engine.tk.view.TKWrapView;
import java.lang.String;
import tx4.h;
import java.lang.Object;

public final class a implements Runnable	// class@00030c
{
    public final TKWrapView b;
    public final String c;
    public final String d;
    public final h e;

    public void a(TKWrapView p0,String p1,String p2,h p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       TKWrapView.h(this.b, this.c, this.d, this.e);
    }
}
