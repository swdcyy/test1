package ao3.c$a;
import eo3.n;
import ao3.c;
import java.lang.Object;
import eo3.g;
import eo3.m;
import android.view.View;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.util.Objects;
import androidx.lifecycle.LiveData;
import java.lang.Boolean;
import po3.c;
import androidx.lifecycle.MutableLiveData;

public class c$a implements n	// class@000285
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(g p0,Object p1){
       m.b(this, p0, p1);
    }
    public void b(g p0){
       m.j(this, p0);
    }
    public void c(g p0){
       m.m(this, p0);
    }
    public void d(g p0,View p1,int p2){
       m.i(this, p0, p1, p2);
    }
    public void e(g p0,View p1){
       m.h(this, p0, p1);
    }
    public void f(g p0,View p1){
       m.g(this, p0, p1);
    }
    public void g(g p0,View p1){
       m.f(this, p0, p1);
    }
    public void h(g p0){
       m.d(this, p0);
    }
    public void i(g p0){
       m.k(this, p0);
    }
    public void j(g p0){
       m.e(this, p0);
    }
    public void k(g p0,String p1,Throwable p2){
       m.a(this, p0, p1, p2);
    }
    public void l(g p0){
       m.l(this, p0);
    }
    public void m(g p0,long p1,long p2){
       if (PatchProxy.isSupport(c$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, c$a.class, "1")) {
          return;
       }
       c$a ta = this.a;
       Objects.requireNonNull(ta);
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || (!PatchProxy.applyVoidOneRefs(Long.valueOf(p1), ta, uoc, "9") && !ta.n.getValue().booleanValue())) {
          ta.m.setValue(c.a((p1 / 1000)));
       }
       return;
    }
}
