package cbd.k;
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
import i2b.a;
import i8d.l0;
import com.yxcorp.plugin.search.kbox.weak.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.search.kbox.weak.b;
import com.yxcorp.plugin.search.kbox.weak.a;
import cbd.f;
import ml8.c;
import y8c.g;
import y8c.f$b;
import ddd.b;

public class k implements c	// class@000520
{

    public void k(){
       super();
    }
    public f a(ViewGroup p0,int p1){
       l0 obj;
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ok, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new l0();
       obj.U7(new c());
       obj.U7(new b());
       obj.U7(new a());
       obj.U7(new f());
       return new f(a.i(p0, 0x7f0d1463), obj);
    }
    public f$b b(g p0,f$b p1){
       return b.a(this, p0, p1);
    }
}
