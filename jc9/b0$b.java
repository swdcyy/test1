package jc9.b0$b;
import ad9.l;
import jc9.b0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ad9.a;
import java.lang.Boolean;
import hc9.f;
import hc9.e;
import com.yxcorp.gifshow.camera.record.base.b;
import jc9.c0;
import java.lang.Runnable;
import ekd.k1;
import fw8.r;
import fw8.r$a;

public class b0$b implements l	// class@002936
{
    public final b0 a;

    public void b0$b(b0 p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0$b.class, "2")) {
          return;
       }
       b0$b ta = this.a;
       ta.f.m(new a(Boolean.FALSE, ta.e.a().h()));
       k1.r(new c0(this), 1);
       return;
    }
    public void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0$b.class, "1")) {
          return;
       }
       b0$b ta = this.a;
       ta.f.m(new a(Boolean.TRUE, ta.e.a().h()));
       r.c().a(this.a.l);
       return;
    }
}
