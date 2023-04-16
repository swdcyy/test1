package fx9.n;
import qk9.h;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cl9.a3;
import cl9.h;
import cl9.e3;
import dl9.m;
import dl9.f2;
import cl9.g3;
import fx9.o;
import cl9.o2;
import java.lang.Number;
import nx9.c;
import android.view.ViewGroup;
import y8c.f;
import qk9.g;
import android.view.View;

public class n implements h	// class@002379
{

    public void n(){
       super();
    }
    public PresenterV2 a(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, n.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new a3());
       obj.U7(new h());
       obj.U7(new e3());
       obj.U7(new m(true));
       obj.U7(new f2());
       obj.U7(new g3());
       obj.U7(new o());
       obj.U7(new o2());
       PatchProxy.onMethodExit(n.class, "1");
       return obj;
    }
    public int b(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n on = n.class;
       Object obj = PatchProxy.apply(null, this, on, "2");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       Object obj1 = PatchProxy.apply(null, null, on, "3");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else if(c.f()){
          i = 0x7f0d0203;
       }else {
          i = 0x7f0d0202;
       }
       return i;
    }
    public f c(ViewGroup p0){
       return g.c(this, p0);
    }
    public View d(ViewGroup p0){
       return g.a(this, p0);
    }
}
