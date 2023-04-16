package l69.j;
import erd.g;
import java.lang.Object;
import pr3.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h69.g;
import q87.c;

public final class j implements g	// class@002c9d
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
          Object[] objArray = new Object[0];
          g.D().w("KwaiAICutModule", "downloadYcnnSceneIfNeeded: ok", objArray);
       }
       return;
    }
}
