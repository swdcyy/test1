package c36.a;
import com.kwai.framework.cache.a$a;
import java.lang.Object;
import v56.f;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.io.File;
import c36.b;
import qkd.b;
import java.lang.Boolean;
import java.util.ArrayList;

public class a implements a$a	// class@000643
{

    public void a(){
       super();
    }
    public boolean a(boolean p0,boolean p1){
       return f.d(this, p0, p1);
    }
    public long b(boolean p0){
       return f.g(this, p0);
    }
    public List c(boolean p0){
       return f.b(this, p0);
    }
    public long d(){
       File[] obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = new File[]{b.a()};
       return b.p0(obj);
    }
    public long e(boolean p0){
       return f.h(this, p0);
    }
    public List f(boolean p0){
       return f.f(this, p0);
    }
    public void g(boolean p0){
       f.a(this, p0);
    }
    public void h(boolean p0){
       f.j(this, p0);
    }
    public List i(boolean p0){
       ArrayList obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       obj.add(b.a());
       return obj;
    }
    public int j(boolean p0){
       return f.e(this, p0);
    }
    public List k(boolean p0){
       return f.i(this, p0);
    }
    public String name(){
       return "TTS_CacheHandler";
    }
}
