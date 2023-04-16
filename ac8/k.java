package ac8.k;
import java.lang.Runnable;
import com.mini.js.jsapi.ui.MiniModalInvokeApi;
import ja8.e;
import ja8.c;
import android.app.Activity;
import com.mini.js.jsapi.ui.MiniModalInvokeApi$ModalParameter;
import ga8.j;
import java.lang.Object;
import na8.a;
import ga8.g;
import java.lang.String;
import com.mini.js.commonapitracer.c$b;
import com.mini.js.commonapitracer.b;

public final class k implements Runnable	// class@000069
{
    public final MiniModalInvokeApi b;
    public final e c;
    public final c d;
    public final Activity e;
    public final MiniModalInvokeApi$ModalParameter f;
    public final j g;

    public void k(MiniModalInvokeApi p0,e p1,c p2,Activity p3,MiniModalInvokeApi$ModalParameter p4,j p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void run(){
       k tb = this.b;
       k tg = this.g;
       tb.K(this.c, this.d, this.e, this.f);
       a c = tb.c;
       c.h(c.e(tg, 0, 0, "", true), tg);
    }
}
