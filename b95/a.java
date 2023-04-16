package b95.a;
import v85.a;
import b95.b;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.nasa.NasaSlideParam;

public final class a extends a	// class@000363
{
    public final boolean a;
    public final boolean b;
    public final String c;
    public boolean d;
    public b e;
    public PhotoDetailParam f;
    public NasaBizParam g;

    public void a(boolean p0,b p1,PhotoDetailParam p2,NasaBizParam p3){
       a.p(p1, "builder");
       a.p(p2, "photoDetailParam");
       a.p(p3, "nasaBizParam");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.a = p1.a;
       this.b = p1.b;
       this.c = p1.c;
    }
    public final boolean b(){
       boolean b;
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.d != null) {
          obj = this.a;
       }else {
          NasaSlideParam nasaSlidePar = this.g.getNasaSlideParam();
          a.o(nasaSlidePar, "nasaBizParam.nasaSlideParam");
          if (nasaSlidePar.isDetailPage()) {
             nasaSlidePar = this.g.getNasaSlideParam();
             a.o(nasaSlidePar, "nasaBizParam.nasaSlideParam");
             if (nasaSlidePar.isSerialStyle()) {
                b = true;
             }
          }
          b = false;
       }
       return obj;
    }
}
