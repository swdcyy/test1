package b8d.a;
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
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ucd.a;
import b8d.b;
import ml8.c;
import y8c.g;
import y8c.f$b;
import ddd.b;

public class a implements c	// class@0003b3
{

    public void a(){
       super();
    }
    public f a(ViewGroup p0,int p1){
       PresenterV2 obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       obj.U7(new a());
       obj.U7(new b());
       return new f(a.i(p0, 0x7f0d1395), obj);
    }
    public f$b b(g p0,f$b p1){
       return b.a(this, p0, p1);
    }
}
