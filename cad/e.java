package cad.e;
import ddd.c;
import com.yxcorp.plugin.search.result.a;
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
import fed.h;
import y9d.f;
import cad.d;
import cad.a;
import ucd.a;
import ml8.c;
import y8c.g;
import y8c.f$b;
import ddd.b;

public class e implements c	// class@000514
{
    public a a;

    public void e(a p0){
       super();
       this.a = p0;
    }
    public f a(ViewGroup p0,int p1){
       PresenterV2 obj;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       obj.U7(new h(R.id.child_auto_play_recycler));
       obj.U7(new f());
       obj.U7(new d());
       obj.U7(new a(this.a));
       obj.U7(new a());
       return new f(a.i(p0, 0x7f0d1361), obj);
    }
    public f$b b(g p0,f$b p1){
       return b.a(this, p0, p1);
    }
}
