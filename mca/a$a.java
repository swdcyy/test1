package mca.a$a;
import com.kwai.video.editorsdk2.logger.EditorSdkDebugLogger;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import java.lang.StringBuilder;

public class a$a implements EditorSdkDebugLogger	// class@002fd1
{

    public void a$a(){
       super();
    }
    public void d(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a.class, "2")) {
          return;
       }
       Log.b("editorsdk", p1);
       return;
    }
    public void e(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a.class, "5")) {
          return;
       }
       Log.d(p0, p1+" "+Log.f(p2));
       return;
    }
    public void i(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a.class, "3")) {
          return;
       }
       Log.g("editorsdk", p1);
       return;
    }
    public void v(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a.class, "1")) {
          return;
       }
       Log.l("editorsdk", p1);
       return;
    }
    public void w(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a.class, "4")) {
          return;
       }
       Log.n("editorsdk", p1);
       return;
    }
}
