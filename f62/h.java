package f62.h;
import y8c.g;
import u52.t;
import j62.a;
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
import f62.i;
import ml8.c;

public class h extends g	// class@0028b4
{
    public t w;
    public a x;

    public void h(t p0,a p1){
       super();
       this.w = p0;
       this.x = p1;
    }
    public f h1(ViewGroup p0,int p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oh, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.n1("ShareRecyclerContext", this.w);
       this.n1("ShareRecyclerRedPacketKey", this.x);
       return new f(a.k(p0, 0x7f0d0acb, false), new i());
    }
}
