package ac8.h;
import h88.c;
import bc8.a;
import ja8.c;
import ja8.e;
import java.lang.Object;
import ma8.g;
import cc8.c$a;
import java.lang.String;
import com.mini.js.helper.a;

public final class h implements c	// class@000066
{
    public final a a;
    public final c b;
    public final e c;

    public void h(a p0,c p1,e p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void accept(Object p0){
       h ta = this.a;
       c$a uoa = new c$a(p0);
       uoa.b = ta.title;
       uoa.c = ta.mask;
       p0.g0(uoa);
       this.b.a(a.g(this.c, true));
    }
}
