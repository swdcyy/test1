package dm1.h;
import com.kwai.framework.cache.a$a;
import java.lang.Object;
import v56.f;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.io.File;
import dm1.i;
import java.lang.Number;
import qkd.b;

public class h implements a$a	// class@001fc7
{

    public void h(){
       super();
    }
    public boolean a(boolean p0,boolean p1){
       return f.d(this, p0, p1);
    }
    public long b(boolean p0){
       return f.g(this, p0);
    }
    public List c(boolean p0){
       ArrayList obj;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, oh, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       obj.add(new File(i.b));
       return obj;
    }
    public long d(){
       File[] obj = PatchProxy.apply(null, this, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = new File[]{new File(i.b),new File(i.a)};
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
       return f.c(this, p0);
    }
    public int j(boolean p0){
       return f.e(this, p0);
    }
    public List k(boolean p0){
       ArrayList obj;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, oh, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       obj.add(new File(i.a));
       return obj;
    }
    public String name(){
       return "LiveGift_CacheHandler";
    }
}
