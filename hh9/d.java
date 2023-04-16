package hh9.d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.IllegalStateException;
import j8c.a;
import q87.c;
import w46.b;

public final class d implements g	// class@00268a
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else if(p0 instanceof IllegalStateException){
          a.D().v("CameraTabTagRepo", "fetch data error", p0);
       }else {
          a.D().e("CameraTabTagRepo", "fetch data error", p0);
       }
       return;
    }
}
