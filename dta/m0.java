package dta.m0;
import com.yxcorp.gifshow.homepage.kcube.presenter.a;
import wq6.f;
import ko5.b;
import ko5.d;
import gsa.l;
import gr6.j;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.homepage.kcube.actionbar.HomeActionBarAdapter;
import qsa.h;
import lnc.a1;
import qsa.a;
import java.util.Map;

public class m0 extends a	// class@00253e
{
    public final b J;
    public final l K;

    public void m0(f p0,b p1,d p2,l p3){
       super(p0, p2);
       this.J = p1;
       this.K = p3;
    }
    public j P8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m0 om0 = m0.class;
       Object obj = PatchProxy.apply(null, this, om0, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a tp = this.p;
       h oh = PatchProxy.apply(null, this, om0, "3");
       if (oh != patchProxyRe) {
       }else {
          oh = new h();
          oh.c(this.J.b());
          oh.a(a1.e(12.00f));
          oh.b(a1.e(9.00f));
          if (this.J.b()) {
             oh.g = a1.d(0x7f070454);
          }
       }
       return new HomeActionBarAdapter(tp, oh);
    }
    public Object R8(){
       return this.K;
    }
    public a S8(){
       a obj = PatchProxy.apply(null, this, m0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a();
       obj.a = true;
       return obj;
    }
    public int V8(){
       return 0x7f0a3f6a;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(m0.class, null);
       return objectsByTag;
    }
}
