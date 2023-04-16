package ax8.g;
import erd.o;
import java.lang.Object;
import com.kwai.feature.post.api.feature.cover.PhotoEditInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.feature.producer.help.ProducerHelpConfig;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo;
import f66.i;
import jq.a;
import q87.c;
import com.kwai.feature.post.api.feature.live.ShareLivePredictionConfig;

public final class g implements o	// class@000335
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public Object apply(Object p0){
       Object[] objArray;
       ProducerHelpConfig producerHelp = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (producerHelp != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          producerHelp = new ProducerHelpConfig();
          int i = 0;
          if (p0.getShareBusinessLinkInfo() != null) {
             objArray = new Object[i];
             a.b().w("ShareProducerRepo", "isReEdit, load data have shareBusinessLinkInfo", objArray);
             producerHelp.mShareBusinessLinkInfo = p0.getShareBusinessLinkInfo();
          }
          if (p0.getShareLivePredictionConfig() != null) {
             objArray = new Object[i];
             a.b().w("ShareProducerRepo", "isReEdit, load data have shareLivePredictionConfig", objArray);
             producerHelp.mShareLivePredictionConfig = p0.getShareLivePredictionConfig();
          }
          Object[] objArray1 = new Object[i];
          a.b().w("ShareProducerRepo", "isReEdit, load producerHelpConfig", objArray1);
       }
       return producerHelp;
    }
}
