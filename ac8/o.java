package ac8.o;
import java.lang.Runnable;
import com.mini.js.jsapi.ui.s;
import ja8.c;
import ja8.e;
import java.lang.Object;
import na8.a;
import ma8.g;
import ma8.i;
import com.mini.js.jscomponent.navigationbar.NavigationView;
import java.lang.String;
import com.mini.js.helper.a;

public final class o implements Runnable	// class@00006d
{
    public final s b;
    public final c c;
    public final e d;

    public void o(s p0,c p1,e p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       o tc = this.c;
       o td = this.d;
       NavigationView navigationVi = this.b.b.h().t1();
       if (navigationVi != null) {
          navigationVi.setLoadingVisibility(8);
       }
       tc.a(a.c(td, true));
       return;
    }
}
