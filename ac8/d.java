package ac8.d;
import java.lang.Runnable;
import com.mini.js.jsapi.ui.e;
import java.lang.String;
import ja8.e;
import ja8.c;
import java.lang.Object;
import na8.a;
import ma8.g;
import ma8.i;
import com.mini.js.helper.a;

public final class d implements Runnable	// class@000062
{
    public final e b;
    public final int c;
    public final int d;
    public final String e;
    public final e f;
    public final c g;

    public void d(e p0,int p1,int p2,String p3,e p4,c p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void run(){
       this.b.b.h().u(this.c, this.d, this.e);
       this.g.a(a.c(this.f, true));
    }
}
