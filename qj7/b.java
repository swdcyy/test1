package qj7.b;
import qj7.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class b implements c	// class@00227e
{

    public void b(){
       super();
    }
    public void a(String p0,Throwable p1){
       PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "2");
    }
    public void b(String p0){
       PatchProxy.applyVoidOneRefs(p0, this, b.class, "4");
    }
    public void d(String p0){
       PatchProxy.applyVoidOneRefs(p0, this, b.class, "1");
    }
    public void e(String p0){
       PatchProxy.applyVoidOneRefs(p0, this, b.class, "3");
    }
}
