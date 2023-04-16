package crb.a;
import com.yxcorp.gifshow.homepage.kcube.presenter.a;
import wq6.f;
import ko5.d;
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

public class a extends a	// class@00239b
{

    public void a(f p0,d p1){
       super(p0, p1);
    }
    public j P8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = PatchProxy.apply(null, this, uoa, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a tp = this.p;
       h oh = PatchProxy.apply(null, this, uoa, "3");
       if (oh != patchProxyRe) {
       }else {
          oh = new h();
          oh.c(false);
          oh.a(a1.e(14.00f));
          oh.b(a1.e(4.00f));
       }
       return new HomeActionBarAdapter(tp, oh);
    }
    public Object R8(){
       return null;
    }
    public a S8(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public int V8(){
       return 0x7f0a15c0;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(a.class, null);
       return objectsByTag;
    }
}
