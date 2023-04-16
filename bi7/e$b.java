package bi7.e$b;
import java.lang.String;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import bi7.e;

public class e$b	// class@000419
{
    public final String a;
    public final String b;
    public String c;

    public void e$b(String p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public File a(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(p0, this.a+"_"+this.b+".dat");
    }
    public String b(){
       Object obj = PatchProxy.apply(null, this, e$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.f(this.a, this.b);
    }
    public File c(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(p0, this.a+"_"+this.b+".raw");
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Resource{group=\'"+this.a+'''+", md5=\'"+this.b+'''+", localPath=\'"+this.c+'''+'}';
    }
}
