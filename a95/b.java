package a95.b;
import v85.b;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import v85.a;
import a95.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class b extends b	// class@00003e
{
    public boolean a;
    public boolean b;
    public boolean c;
    public PhotoDetailParam d;

    public void b(boolean p0,PhotoDetailParam p1){
       a.p(p1, "photoDetailParam");
       super();
       this.c = p0;
       this.d = p1;
    }
    public a a(){
       return this.b();
    }
    public a b(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.c, this, this.d);
    }
}
