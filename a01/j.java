package a01.j;
import vg1.m$b;
import a01.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lz0.c;
import mk1.h;
import cl1.c;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import s51.c;
import lp3.c;
import lp3.e;

public class j implements m$b	// class@000012
{
    public final i a;

    public void j(i p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       this.a.v.t.d();
       return;
    }
    public Context b(){
       Object obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getContext();
    }
    public c c(){
       Object obj = PatchProxy.apply(null, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.v.n.a(c.class);
    }
    public void m0(){
       this.a.v.K = null;
    }
}
