package a19.a$a;
import d6a.a;
import a19.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import tkd.b;
import tkd.d;
import ju5.g;

public final class a$a extends a	// class@00001a
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void k1(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       a q = this.b.q;
       q = (q == null || !q.length())? 1: 0;
       if (!q) {
          d.a(0x6ea0c3d0).g9(this.b.q, "AdMiniAppPreloadPresenter");
       }
       return;
    }
}
