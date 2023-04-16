package k2b.b;
import java.lang.Object;
import java.util.LinkedHashMap;
import com.google.common.collect.ImmutableList;
import android.util.LruCache;
import com.yxcorp.gifshow.log.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Collection;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import f3b.b;
import java.lang.Iterable;
import qk.y;
import java.util.List;

public class b	// class@001b8d
{
    public final int a;
    public LinkedHashMap b;
    public ImmutableList c;
    public LruCache d;

    public void b(int p0){
       super();
       this.b = new LinkedHashMap();
       this.c = ImmutableList.of();
       this.d = new LruCache(30);
       this.a = p0;
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.b.put(Integer.valueOf(p0.F()), p0);
       this.d.put(Integer.valueOf(p0.F()), p0);
       if (!PatchProxy.applyVoidOneRefs(this, p0, b.class, "2")) {
          b a0 = p0.a0;
          if (a0 != this) {
             if (a0 != null) {
                a0.g(p0.Y);
             }
             p0.a0 = this;
          }
       }
       this.c = ImmutableList.copyOf(this.b.values());
       return;
    }
    public boolean b(Activity p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uob, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean i = b.a(p0);
       if (PatchProxy.isSupport(uob)) {
          Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i), this, uob, "7");
          if (obj1 != patchProxyRe) {
             i = obj1.booleanValue();
          label_003a :
             return i;
          }
       }
       i = this.b.containsKey(Integer.valueOf(i));
       goto label_003a ;
    }
    public b c(){
       Object obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return y.l(this.c, null);
    }
    public b d(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.get(Integer.valueOf(b.a(p0)));
    }
    public List e(){
       return this.c;
    }
    public int f(){
       return this.a;
    }
    public void g(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "3")) {
          return;
       }
       this.b.remove(Integer.valueOf(p0));
       this.c = ImmutableList.copyOf(this.b.values());
       return;
    }
    public void h(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.g(b.a(p0));
       return;
    }
}
