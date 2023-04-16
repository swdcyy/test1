package abd.b$a;
import y8c.g;
import abd.b;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import y8c.f$b;
import im8.c;
import ekd.j;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import abd.h;
import ml8.c;

public class b$a extends g	// class@0000be
{
    public final b w;

    public void b$a(b p0){
       this.w = p0;
       super();
    }
    public ArrayList a1(int p0,f p1){
       Object[] obj;
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       b$a tw = this.w;
       obj.f = tw.x;
       obj = new Object[]{new c("SEARCH_ITEM", tw.y)};
       return j.a(obj);
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       obj.U7(new h());
       return new f(a.i(p0, 0x7f0d1494), obj);
    }
}
