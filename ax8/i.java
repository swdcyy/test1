package ax8.i;
import erd.g;
import java.lang.Object;
import com.kwai.feature.post.api.feature.producer.help.ProducerHelpConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f66.i;
import jq.a;
import q87.c;

public final class i implements g	// class@000337
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.b().w("ShareProducerRepo", "loadProducerHelpConfig from cache info", objArray);
       }
       return;
    }
}
