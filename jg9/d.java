package jg9.d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import j8c.a;
import w46.b;

public final class d implements g	// class@002a8f
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
       }else {
          a.p(p0, "obj");
          a.D().e("BaseMultiTakePictureController", "requestExternalStoragePermission failed", p0);
       }
       return;
    }
}
