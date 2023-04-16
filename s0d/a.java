package s0d.a;
import android.net.Uri;
import java.lang.Object;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import p0d.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.image.request.cdntransform.c;
import com.facebook.imagepipeline.request.ImageRequest$CacheChoice;
import t0d.a;
import uc.b;
import jd.c;
import dd.d;
import com.facebook.imagepipeline.common.Priority;
import java.lang.Integer;
import uc.d;

public abstract class a	// class@0039c3
{
    public final ImageRequestBuilder a;
    public int b;
    public int c;
    public CacheKeyOptions d;
    public k e;
    public a f;
    public c g;
    public static final Uri h;

    static {
       a.h = Uri.EMPTY;
    }
    public void a(){
       super();
       this.e = null;
       this.f = null;
       this.g = null;
       this.a = ImageRequestBuilder.k(a.h);
    }
    public void a(ImageRequestBuilder p0){
       super();
       this.e = null;
       this.f = null;
       this.g = null;
       this.a = p0;
    }
    public void a(a p0){
       super();
       this.e = null;
       this.f = null;
       this.g = null;
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.d = p0.d;
       this.e = p0.d();
    }
    public a a(){
       Object obj = PatchProxy.apply(null, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.b();
       return this;
    }
    public a b(){
       Object obj = PatchProxy.apply(null, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.c();
       return this;
    }
    public c c(){
       return this.g;
    }
    public k d(){
       return this.e;
    }
    public ImageRequestBuilder e(){
       return this.a;
    }
    public a f(ImageRequest$CacheChoice p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.n(p0);
       return this;
    }
    public a g(int p0){
       this.b = p0;
       this.c = p0;
       return this;
    }
    public a h(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.g = p0;
       this.f = new a();
       return this;
    }
    public abstract a i(boolean p0);
    public a j(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.o(p0);
       return this;
    }
    public a k(k p0){
       this.e = p0;
       return this;
    }
    public a l(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.r(p0);
       return this;
    }
    public a m(d p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.t(p0);
       return this;
    }
    public a n(Priority p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.u(p0);
       return this;
    }
    public a o(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 > 0 && p1 > 0) {
          this.a.v(new d(p0, p1));
       }
       return this;
    }
    public a p(d p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.v(p0);
       return this;
    }
}
