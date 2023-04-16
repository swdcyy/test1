package c9c.e;
import y8c.q;
import c9c.d;
import lkd.b;
import java.lang.Object;
import b9c.e;
import y8c.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.fragment.f;
import g9c.d;
import qvb.i;
import hka.l;
import com.yxcorp.gifshow.fragment.e;

public class e	// class@000564
{
    public final t a;
    public final q b;
    public final d c;

    public void e(q p0,d p1,b p2){
       super();
       this.b = p0;
       this.c = p1;
       t ot = p2.get();
       if (ot == null) {
          ot = PatchProxy.apply(null, this, e.class, "1");
          if (ot != PatchProxyResult.class) {
          }else if(p1.a() != null){
             f uof = new f(p1.a(), p0.ia(), p0.q(), p0.S1(), 0x7f110210);
          }else {
             ot = new e(p0);
          }
       }
       this.a = ot;
       return;
    }
}
