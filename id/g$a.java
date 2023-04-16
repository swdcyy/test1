package id.g$a;
import id.k;
import id.i;
import id.c0;
import tc.v;
import tc.g;
import tc.h;
import tc.d;
import java.lang.Object;
import com.facebook.common.references.a;
import kd.b;
import java.lang.String;
import id.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.cache.common.CacheKey;
import vc.h;
import vc.i;
import com.facebook.imagepipeline.request.ImageRequest$CacheChoice;

public class g$a extends k	// class@0021a6
{
    public final c0 c;
    public final v d;
    public final g e;
    public final g f;
    public final h g;
    public final d h;
    public final d i;

    public void g$a(i p0,c0 p1,v p2,g p3,g p4,h p5,d p6,d p7){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
    }
    public void i(Object p0,int p1){
       if (b.d()) {
          b.a("BitmapProbeProducer#onNewResultImpl");
       }
       if (!b.f(p1) && (p0 == null || b.l(p1, 8))) {
          this.n().d(p0, p1);
          if (b.d()) {
          label_00a2 :
             b.b();
          }
       }else {
          ImageRequest imageRequest = this.c.b();
          CacheKey uCacheKey = this.g.b(imageRequest, this.c.h());
          if (this.c.getExtra("origin").equals("memory_bitmap")) {
             if (this.c.c().h().f() && !this.h.b(uCacheKey)) {
                this.d.i(uCacheKey);
                this.h.a(uCacheKey);
             }
             if (this.c.c().h().e() && !this.i.b(uCacheKey)) {
                g$a uoa = (imageRequest.e() == ImageRequest$CacheChoice.SMALL)? 1: null;
                uoa = (uoa)? this.f: this.e;
                uoa.a(uCacheKey);
                this.i.a(uCacheKey);
             }
          }
       label_0095 :
          this.n().d(p0, p1);
          if (b.d()) {
             goto label_00a2 ;
          }
       }
       return;
    }
}
