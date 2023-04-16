package ax8.h;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.feature.producer.help.ProducerHelpConfig;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import ax8.f;
import ax8.f$c;
import java.lang.reflect.Type;

public final class h implements Callable	// class@000336
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public Object call(){
       ProducerHelpConfig producerHelp = PatchProxy.apply(null, this, h.class, "1");
       if (producerHelp != PatchProxyResult.class) {
       }else {
          producerHelp = b.a(0x5f2ddeb4).g(f.f.a(), ProducerHelpConfig.class);
       }
       return producerHelp;
    }
}
