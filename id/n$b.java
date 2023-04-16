package id.n$b;
import id.k;
import id.i;
import id.c0;
import tc.g;
import tc.h;
import id.n$a;
import java.lang.Object;
import bd.d;
import id.e0;
import java.lang.String;
import id.b;
import com.facebook.imageformat.a;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.ImageRequest$CacheChoice;
import java.util.Map;

public class n$b extends k	// class@0021be
{
    public final c0 c;
    public final g d;
    public final g e;
    public final h f;

    public void n$b(i p0,c0 p1,g p2,g p3,h p4,n$a p5){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public void i(Object p0,int p1){
       this.c.l().onProducerStart(this.c, "DiskCacheWriteProducer");
       if (!b.f(p1) && (p0 != null && (b.l(p1, 10) || p0.j() == a.c))) {
          this.c.l().onProducerFinishWithSuccess(this.c, "DiskCacheWriteProducer", null);
          this.n().d(p0, p1);
       }else {
          ImageRequest imageRequest = this.c.b();
          CacheKey uCacheKey = this.f.b(imageRequest, this.c.h());
          if (imageRequest.e() == ImageRequest$CacheChoice.SMALL) {
             this.e.i(uCacheKey, p0);
          }else {
             this.d.i(uCacheKey, p0);
          }
          this.c.l().onProducerFinishWithSuccess(this.c, "DiskCacheWriteProducer", null);
          this.n().d(p0, p1);
       }
       return;
    }
}
