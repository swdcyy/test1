package ox0.f;
import u07.u;
import ox0.l;
import android.app.Activity;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import rd1.c0;
import crd.b;
import lnc.b9;

public final class f implements u	// class@0035bb
{
    public final l b;
    public final boolean c;
    public final Activity d;
    public final boolean e;

    public void f(l p0,boolean p1,Activity p2,boolean p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void a(t p0,View p1){
       f tb = this.b;
       f tc = this.c;
       f td = this.d;
       f te = this.e;
       int i = 1;
       int i1 = (tc != null)? 2: 1;
       c0.v(i1, i, tb.f);
       b9.a(tb.c);
       tb.b(td, tc, te);
       return;
    }
}
