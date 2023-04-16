package jg9.b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import j8c.a;
import w46.b;

public final class b implements g	// class@002a85
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          a.p(p0, "obj");
          a.D().e("BaseMultiTakePictureController", "requestAlbumPermission failed", p0);
       }
       return;
    }
}
