package av6.a$a;
import ht6.a;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qkd.b;
import com.kwai.robust.PatchProxyResult;

public final class a$a implements a	// class@00037b
{

    public void a$a(){
       super();
    }
    public void a(File p0,File p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "1")) {
          return;
       }
       a.p(p0, "srcDir");
       a.p(p1, "destDir");
       b.c(p0, p1);
       return;
    }
    public void b(File p0,File p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "6")) {
          return;
       }
       a.p(p0, "srcFile");
       a.p(p1, "destFile");
       b.W(p0, p1);
       return;
    }
    public void c(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "3")) {
          return;
       }
       a.p(p0, "file");
       b.q(p0);
       return;
    }
    public void d(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "4")) {
          return;
       }
       a.p(p0, "directory");
       b.y(p0);
       return;
    }
    public String e(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "file");
       String str = b.f0(p0);
       a.o(str, "FileUtils.readFileToString\(file\)");
       return str;
    }
    public File f(){
       File obj = PatchProxy.apply(null, this, a$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.E();
       a.o(obj, "FileUtils.getTempDirectory\(\)");
       return obj;
    }
    public void g(File p0,File p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "2")) {
          return;
       }
       a.p(p0, "srcFile");
       a.p(p1, "destFile");
       b.g(p0, p1);
       return;
    }
}
