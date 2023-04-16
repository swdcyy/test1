package c7d.g;
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
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import c7d.f;
import c7d.c;
import ucd.a;
import ml8.c;
import y8c.g;
import y8c.f$b;
import c7d.g$a;

public class g implements c	// class@0004f4
{

    public void g(){
       super();
    }
    public f a(ViewGroup p0,int p1){
       PresenterV2 obj;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, og, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       obj.U7(new f());
       obj.U7(new c());
       obj.U7(new a());
       return new f(n.H(p0, 0x7f0d13ae), obj);
    }
    public f$b b(g p0,f$b p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new g$a(p1);
    }
}
