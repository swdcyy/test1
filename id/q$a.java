package id.q$a;
import id.k;
import id.i;
import id.c0;
import tc.g;
import tc.h;
import tc.d;
import java.lang.Object;
import bd.d;
import kd.b;
import java.lang.String;
import id.b;
import com.facebook.imageformat.a;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.ImageRequest$CacheChoice;

public class q$a extends k	// class@0021c7
{
    public final c0 c;
    public final g d;
    public final g e;
    public final h f;
    public final d g;
    public final d h;

    public void q$a(i p0,c0 p1,g p2,g p3,h p4,d p5,d p6){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public void i(Object p0,int p1){
       String str = "origin";
       if (b.d()) {
          b.a("EncodedProbeProducer#onNewResultImpl");
       }
       if (!b.f(p1) && (p0 != null && (b.l(p1, 10) || p0.j() == a.c))) {
          this.n().d(p0, p1);
          if (b.d()) {
          label_0090 :
             b.b();
          }
       }else {
          ImageRequest imageRequest = this.c.b();
          CacheKey uCacheKey = this.f.b(imageRequest, this.c.h());
          this.g.a(uCacheKey);
          if (this.c.getExtra(str).equals("memory_encoded")) {
             if (!this.h.b(uCacheKey)) {
                q$a uoa = (imageRequest.e() == ImageRequest$CacheChoice.SMALL)? 1: null;
                uoa = (uoa)? this.e: this.d;
                uoa.a(uCacheKey);
                this.h.a(uCacheKey);
             }
          }else if(this.c.getExtra(str).equals("disk")){
             this.h.a(uCacheKey);
          }
          this.n().d(p0, p1);
          if (b.d()) {
             goto label_0090 ;
          }
       }
       return;
    }
}
