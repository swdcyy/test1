package c95.b;
import v85.b;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import v85.a;
import c95.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class b extends b	// class@00042e
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;
    public String i;
    public String j;
    public boolean k;
    public PhotoDetailParam l;
    public NasaBizParam m;

    public void b(boolean p0,PhotoDetailParam p1,NasaBizParam p2){
       a.p(p1, "photoDetailParam");
       a.p(p2, "nasaBizParam");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.a = true;
       this.d = true;
       this.e = true;
    }
    public a a(){
       return this.b();
    }
    public a b(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.k, this, this.l, this.m);
    }
}
