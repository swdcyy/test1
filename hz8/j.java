package hz8.j;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;

public final class j implements g	// class@0025fe
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else {
          j0.b("AdLandscapePlayed", "listening pageChange error.", p0);
       }
       return;
    }
}
