package cbd.j;
import ddd.c;
import java.lang.Object;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import com.yxcorp.utility.n;
import i8d.l0;
import cbd.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import cbd.l;
import com.yxcorp.plugin.search.kbox.weak.b;
import cbd.h;
import com.yxcorp.plugin.search.kbox.weak.d;
import cbd.i;
import cbd.f;
import cbd.d;
import ml8.c;
import y8c.g;
import y8c.f$b;
import ddd.b;

public class j implements c	// class@00051f
{

    public void j(){
       super();
    }
    public f a(ViewGroup p0,int p1){
       l0 obj;
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oj, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new l0();
       obj.U7(new o());
       obj.U7(new l());
       obj.U7(new b());
       obj.U7(new h());
       obj.U7(new d());
       obj.U7(new i());
       obj.U7(new f());
       obj.U7(new d());
       return new f(n.H(p0, 0x7f0d14a0), obj);
    }
    public f$b b(g p0,f$b p1){
       return b.a(this, p0, p1);
    }
}
