package cb4.f;
import us3.g;
import cb4.f$a;
import nsd.u;
import java.lang.Object;
import java.util.LinkedHashSet;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.StringBuilder;
import ab4.g;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Set;
import kotlin.jvm.internal.a;
import java.lang.Exception;
import com.kuaishou.merchant.router.base.RouterRequest;
import cb4.e;
import android.net.Uri;

public final class f implements g	// class@0004ee
{
    public final Set a;
    public static final f$a b;

    static {
       f.b = new f$a(null);
    }
    public void f(){
       super();
       this.a = new LinkedHashSet();
    }
    public void a(boolean p0,String p1,Throwable p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, f.class, "4")) {
          return;
       }
       String str = "ResultListenerWrapper";
       g.b(str, "start router success! url= (p0)?"+p1):"+p1);
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1, p2);
       }
       this.a.clear();
       return;
    }
    public final void b(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.a.add(p0);
       }
       return;
    }
    public final void c(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "3")) {
          return;
       }
       a.p(p1, "msg");
       this.a(false, p0, new Exception(p1));
       return;
    }
    public final void d(RouterRequest p0,e p1,boolean p2){
       String name;
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, f.class, "2")) {
          return;
       }
       a.p(p0, "request");
       String str = p0.d().toString();
       a.o(str, "request.uri.toString\(\)");
       if (p2) {
          this.a(true, str, null);
       }else if(p1 != null){
          name = p1.getName();
          if (name != null) {
          label_003f :
             a.o(name, "handler?.name ?: \"null\"");
             this.c(str, "route failed, routerHandler is "+name);
          }
       }
       name = "null";
       goto label_003f ;
       return;
    }
}
