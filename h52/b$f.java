package h52.b$f;
import y8c.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import java.lang.Math;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Integer;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h52.b$e;
import ml8.c;

public class b$f extends g	// class@002c4d
{

    public void b$f(){
       super();
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, b$f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Math.min(4, super.getItemCount());
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       b$f uof = b$f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uof, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       obj.U7(new b$e());
       return new f(a.i(p0, 0x7f0d0d0f), obj);
    }
}
