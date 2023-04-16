package a5b.g;
import a5b.g$a;
import nsd.u;
import a5b.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import a5b.g$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import a5b.h;
import com.kwai.robust.PatchProxyResult;
import a5b.h$a;
import java.lang.Boolean;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.StringBuilder;
import j8c.b;
import crd.b;
import lnc.b9;
import ekd.k1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import a5b.g$c;
import java.lang.Runnable;

public final class g	// class@000052
{
    public String a;
    public h b;
    public ArrayList c;
    public b d;
    public final a e;
    public static final g$a f;

    static {
       g.f = new g$a(null);
    }
    public void g(a p0){
       a.p(p0, "searchDataProvider");
       super();
       this.e = p0;
       this.a = "";
       this.c = new ArrayList();
    }
    public final void a(g$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "3")) {
          return;
       }
       a.p(p0, "listener");
       if (!this.c.contains(p0)) {
          this.c.add(p0);
       }
       return;
    }
    public final h b(){
       g obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          return h.e.c(this.a);
       }
       a.m(obj);
       return obj;
    }
    public final void c(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "8")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       Iterator iterator = new ArrayList(this.c).iterator();
       while (iterator.hasNext()) {
          g tb = this.b;
          a.m(tb);
          iterator.next().J4(tb, p0);
       }
       return;
    }
    public final void d(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "7")) {
          return;
       }
       Iterator iterator = new ArrayList(this.c).iterator();
       while (iterator.hasNext()) {
          iterator.next().c7(this.a, p0);
       }
       return;
    }
    public final void e(g$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "4")) {
          return;
       }
       a.p(p0, "listener");
       this.c.remove(p0);
       return;
    }
    public final void f(String p0,boolean p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, og, "6")) {
          return;
       }
       a.p(p0, "searchKey");
       b.d("MagicSearchDataManager", "startNewSearchTask "+p0);
       this.a = p0;
       this.b = null;
       this.d(p1);
       b9.a(this.d);
       k1.n("MagicSearchDataManager");
       if (!TextUtils.x(p0)) {
          k1.s(new g$c(this, p0), "MagicSearchDataManager", 200);
       }
       return;
    }
}
