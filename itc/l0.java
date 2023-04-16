package itc.l0;
import im8.g;
import java.lang.Object;
import java.util.HashSet;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import mrd.a;
import io.reactivex.subjects.PublishSubject;
import uld.g;
import rwc.j;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import itc.h1;
import java.util.Map;
import java.util.HashMap;

public class l0 implements g	// class@00294d
{
    public int b;
    public String c;
    public String d;
    public i e;
    public Set f;
    public List g;
    public a h;
    public PublishSubject i;
    public a j;
    public PublishSubject k;
    public PublishSubject l;
    public a m;
    public g n;
    public int o;
    public z p;
    public PublishSubject q;
    public boolean r;
    public j s;
    public EditDecorationContainerView t;
    public boolean u;

    public void l0(){
       super();
       this.b = 7;
       this.f = new HashSet();
       this.g = Lists.b();
       this.h = a.g();
       this.i = PublishSubject.g();
       this.j = a.g();
       this.k = PublishSubject.g();
       this.l = PublishSubject.g();
       this.n = new g(false);
       this.o = 0;
       this.r = false;
       this.s = new j(null);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, l0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(l0.class, new h1());
       }else {
          obj.put(l0.class, null);
       }
       return obj;
    }
}
