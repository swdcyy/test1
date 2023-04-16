package v27.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import kotlin.jvm.internal.a;

public abstract class d	// class@003a0a
{

    public void d(){
       super();
    }
    public void a(String p0,String p1,Throwable p2){
       a.p(p0, "tag");
       a.p(p1, "content");
       a.p(p2, "throwable");
    }
    public void b(Throwable p0){
       a.p(p0, "throwable");
    }
    public void c(String p0,String p1){
       a.p(p0, "tag");
       a.p(p1, "content");
    }
    public void d(String p0,String p1){
       a.p(p0, "key");
       a.p(p1, "value");
    }
}
