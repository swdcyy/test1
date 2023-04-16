package dta.r0;
import vn5.d;
import com.yxcorp.gifshow.homepage.kcube.presenter.e;
import java.lang.Object;
import vn5.c;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Runnable;
import ekd.k1;

public final class r0 implements d	// class@00254b
{
    public final e a;

    public void r0(e p0){
       this.a = p0;
    }
    public void a(boolean p0,boolean p1,boolean p2){
       c.a(this, p0, p1, p2);
    }
    public final void b(boolean p0,boolean p1){
       r0 ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), ta, e.class, "5")) {
          k1.r(ta.y, 100);
       }
       return;
    }
}
