package ax8.k;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.PostStartUpResponse;
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
import ax8.f;
import ax8.f$c;

public final class k implements o	// class@000339
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public Object apply(Object p0){
       ProducerHelpConfig producerHelp = PatchProxy.applyOneRefs(p0, this, k.class, "1");
       if (producerHelp != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          producerHelp = new ProducerHelpConfig();
          int i = 0;
          if (p0.e() != null) {
             Object[] objArray = new Object[i];
             a.b().w("ShareProducerRepo", "load data from net, have shareBusinessLinkInfo", objArray);
             producerHelp.mShareBusinessLinkInfo = p0.e();
          }
          if (p0.d() != null) {
             Object[] objArray1 = new Object[i];
             a.b().w("ShareProducerRepo", "load data from net have shareLivePredictionConfig", objArray1);
             producerHelp.mShareLivePredictionConfig = p0.d();
          }
          f.f.c(producerHelp);
       }
       return producerHelp;
    }
}
