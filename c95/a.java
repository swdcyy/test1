package c95.a;
import u85.b;
import v85.a;
import c95.b;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class a extends a implements b	// class@00042d
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final String i;
    public final String j;
    public boolean k;
    public b l;
    public PhotoDetailParam m;
    public NasaBizParam n;

    public void a(boolean p0,b p1,PhotoDetailParam p2,NasaBizParam p3){
       a.p(p1, "builder");
       a.p(p2, "photoDetailParam");
       a.p(p3, "nasaBizParam");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.a = p1.a;
       this.b = p1.b;
       this.c = p1.c;
       this.d = p1.d;
       this.e = p1.e;
       this.f = p1.f;
       this.g = p1.g;
       this.h = p1.h;
       this.i = p1.i;
       this.j = p1.j;
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i+"_"+this.j;
    }
}
