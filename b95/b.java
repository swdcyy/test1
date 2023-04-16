package b95.b;
import v85.b;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import v85.a;
import b95.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class b extends b	// class@000364
{
    public boolean a;
    public boolean b;
    public String c;
    public boolean d;
    public PhotoDetailParam e;
    public NasaBizParam f;

    public void b(boolean p0,PhotoDetailParam p1,NasaBizParam p2){
       a.p(p1, "photoDetailParam");
       a.p(p2, "nasaBizParam");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
    }
    public a a(){
       return this.b();
    }
    public a b(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.d, this, this.e, this.f);
    }
}
