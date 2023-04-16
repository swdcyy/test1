package p0d.j;
import ed.x;
import java.lang.Object;
import com.facebook.imagepipeline.memory.BasePool;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public class j implements x	// class@002154
{
    public BasePool a;

    public void j(){
       super();
    }
    public void a(int p0){
    }
    public void b(int p0){
    }
    public void c(){
    }
    public void d(int p0){
    }
    public void e(int p0){
    }
    public void f(){
    }
    public void g(BasePool p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       a.p(p0, "basePool");
       this.a = p0;
       return;
    }
}
