package tea.a;
import vxb.c;
import java.lang.Object;
import com.kwai.framework.init.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.featured.feedprefetcher.module.PhotoPrefetcherInitModule;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptInitModule;
import java.lang.Boolean;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptManager;

public class a implements c	// class@002530
{

    public void a(){
       super();
    }
    public a Me(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PhotoPrefetcherInitModule();
    }
    public boolean isAvailable(){
       return true;
    }
    public a ny(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new NasaLaunchOptInitModule();
    }
    public boolean tv(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return NasaLaunchOptManager.i();
    }
}
