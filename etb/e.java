package etb.e;
import y8c.g;
import etb.d;
import y8c.f$b;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import etb.b;
import ml8.c;

public class e extends g	// class@0027f1
{
    public final d w;

    public void e(d p0){
       this.w = p0;
       super();
    }
    public f$b d1(f$b p0){
       p0.f = this.w.q;
       return p0;
    }
    public f h1(ViewGroup p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d10ad), new b());
    }
}
