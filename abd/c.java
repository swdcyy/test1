package abd.c;
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
import abd.f;
import abd.b;
import fed.h;
import ucd.a;
import ml8.c;
import y8c.g;
import y8c.f$b;
import ddd.b;

public class c implements c	// class@0000c0
{
    public a a;

    public void c(a p0){
       super();
       this.a = p0;
    }
    public f a(ViewGroup p0,int p1){
       PresenterV2 obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       obj.U7(new f());
       obj.U7(new b(this.a));
       obj.U7(new h(R.id.child_auto_play_recycler));
       obj.U7(new a());
       return new f(a.i(p0, 0x7f0d13fc), obj);
    }
    public f$b b(g p0,f$b p1){
       return b.a(this, p0, p1);
    }
}
