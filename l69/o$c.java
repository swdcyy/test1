package l69.o$c;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import h69.g;
import q87.c;

public final class o$c implements o	// class@002ca4
{
    public static final o$c b;

    static {
       o$c.b = new o$c();
    }
    public void o$c(){
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, o$c.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          g.D().z("KwaiAICutProject", "loadRecoMusicList onErrorReturn", p0);
          uBoolean = Boolean.FALSE;
       }
       return uBoolean;
    }
}
