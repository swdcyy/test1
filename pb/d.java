package pb.d;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import android.content.Context;
import pb.f;
import com.facebook.imagepipeline.core.ImagePipeline;
import java.util.Set;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder$CacheLevel;
import com.facebook.imagepipeline.request.ImageRequest$RequestLevel;
import pb.d$a;
import java.lang.Enum;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import pb.c;
import kd.b;
import java.util.concurrent.atomic.AtomicLong;
import android.content.res.Resources;
import tb.a;
import zc.a;
import java.util.concurrent.Executor;
import tc.v;
import com.facebook.common.internal.ImmutableList;
import ab.h;
import java.lang.Boolean;
import ac.a;
import com.facebook.imagepipeline.request.ImageRequest;
import tc.h;
import jd.c;
import com.facebook.cache.common.CacheKey;
import rb.c;
import ab.i;
import rb.g;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import uc.e;
import ac.d;
import kb.c;
import dd.d;
import com.facebook.drawee.controller.AbstractDraweeController;

public class d extends AbstractDraweeControllerBuilder	// class@002908
{
    public final ImagePipeline u;
    public final f v;
    public ImmutableList w;
    public c x;
    public g y;

    public void d(Context p0,f p1,ImagePipeline p2,Set p3,Set p4){
       super(p0, p3, p4);
       this.u = p2;
       this.v = p1;
    }
    public static ImageRequest$RequestLevel A(AbstractDraweeControllerBuilder$CacheLevel p0){
       int i = d$a.a[p0.ordinal()];
       if (i == 1) {
          return ImageRequest$RequestLevel.FULL_FETCH;
       }
       if (i == 2) {
          return ImageRequest$RequestLevel.DISK_CACHE;
       }
       if (i == 3) {
          return ImageRequest$RequestLevel.BITMAP_MEMORY_CACHE;
       }
       throw new RuntimeException("Cache level"+p0+"is not supported. ");
    }
    public c B(){
       CacheKey uCacheKey;
       if (b.d()) {
          b.a("PipelineDraweeControllerBuilder#obtainController");
       }
       AbstractDraweeControllerBuilder tq = this.q;
       String str = String.valueOf(AbstractDraweeControllerBuilder.t.getAndIncrement());
       if (tq instanceof c) {
       }else {
          d tv = this.v;
          c uoc = tv.b(tv.a, tv.b, tv.c, tv.d, tv.e, tv.f);
          f g = tv.g;
          if (g != null) {
             uoc.g = g.get().booleanValue();
          }
          tq = uoc;
       }
       h oh = this.o(tq, str);
       ImageRequest imageRequest = this.k();
       h cacheKeyFact = this.u.getCacheKeyFactory();
       if (cacheKeyFact != null && imageRequest != null) {
          uCacheKey = (imageRequest.j() != null)? cacheKeyFact.a(imageRequest, this.f()): cacheKeyFact.c(imageRequest, this.f());
       }else {
          uCacheKey = null;
       }
       tq.e(oh, str, uCacheKey, this.f(), this.w, this.x);
       tq.f(this.y, this, i.b);
       if (b.d()) {
          b.b();
       }
       return tq;
    }
    public d C(g p0){
       this.y = p0;
       return this;
    }
    public d D(Uri p0){
       if (p0 == null) {
          this.w(null);
          return this;
       }else {
          ImageRequestBuilder imageRequest = ImageRequestBuilder.k(p0);
          imageRequest.w(e.e);
          this.w(imageRequest.a());
          return this;
       }
    }
    public d E(String p0){
       if (p0 != null && !p0.isEmpty()) {
          return this.D(Uri.parse(p0));
       }
       this.w(ImageRequest.c(p0));
       return this;
    }
    public d a(String p0){
       return this.E(p0);
    }
    public d c(Uri p0){
       return this.D(p0);
    }
    public c g(a p0,String p1,Object p2,Object p3,AbstractDraweeControllerBuilder$CacheLevel p4){
       ImageRequest imageRequest = p2;
       d tu = this.u;
       ImageRequest$RequestLevel requestLevel = d.A(p4);
       d uod = (p0 instanceof c)? p0.d(): null;
       return tu.fetchDecodedImage(imageRequest, p3, requestLevel, uod, p1);
    }
    public AbstractDraweeController n(){
       return this.B();
    }
}
