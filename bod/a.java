package bod.a;
import mn9.a;
import d0c.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;

public final class a implements a	// class@000293
{
    public final a a;
    public String b;
    public boolean c;

    public void a(a p0,String p1,boolean p2){
       a.p(p0, "fontConfig");
       a.p(p1, "fontPath");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public final a b(){
       return this.a;
    }
    public final boolean c(){
       return this.c;
    }
    public boolean d(){
       return true;
    }
    public final String e(){
       return this.b;
    }
    public final void f(boolean p0){
       this.c = p0;
    }
    public final void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
    public String getId(){
       String obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.c();
       a.m(obj);
       return obj;
    }
    public int h(){
       return 0;
    }
    public boolean i(){
       return false;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FontItem\(fontConfig="+this.a+", fontPath=\'"+this.b+"\', fontDownloaded="+this.c+')';
    }
}
