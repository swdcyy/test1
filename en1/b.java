package en1.b;
import en1.a;
import p91.m;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k2b.e0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class b implements a	// class@0021ce
{
    public final m a;

    public void b(m p0){
       a.p(p0, "liveBasicContext");
       super();
       this.a = p0;
    }
    public ClientContent$LiveStreamPackage a(){
       ClientContent$LiveStreamPackage obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.a();
       a.o(obj, "liveBasicContext.liveStreamPackage");
       return obj;
    }
    public e0 o(){
       BaseFragment obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.b();
       a.o(obj, "liveBasicContext.fragment");
       return obj;
    }
}
