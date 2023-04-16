package com.facebook.imagepipeline.producers.b$c$a;
import com.facebook.imagepipeline.producers.JobScheduler$d;
import com.facebook.imagepipeline.producers.b$c;
import com.facebook.imagepipeline.producers.b;
import id.c0;
import java.lang.Object;
import bd.d;
import com.facebook.imageformat.a;
import java.lang.String;
import id.b;
import com.facebook.imagepipeline.request.ImageRequest;
import android.net.Uri;
import ib.c;
import uc.e;
import uc.d;
import ld.a;
import vc.h;
import vc.i;
import java.util.Objects;
import nc.a;
import uc.b;
import android.graphics.Bitmap$Config;
import nd.a;
import java.lang.StringBuilder;
import com.facebook.imagepipeline.producers.JobScheduler;
import bd.h;
import bd.g;
import id.e0;
import com.facebook.imagepipeline.image.a;
import java.util.Map;
import com.facebook.imagepipeline.decoder.DecodeException;
import java.lang.RuntimeException;
import java.lang.Integer;
import cb.a;
import java.lang.Throwable;

public class b$c$a implements JobScheduler$d	// class@00112b
{
    public final b a;
    public final c0 b;
    public final int c;
    public final b$c d;

    public void b$c$a(b$c p0,b p1,c0 p2,int p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(d p0,int p1){
       b$c$a d;
       a uoa;
       boolean b;
       Map map;
       b$c$a uoc$a = this;
       d uod = p0;
       int i = p1;
       if (uod) {
          uoc$a.d.d.m("image_format", p0.j().b());
          if (uoc$a.d.i.f != null || !b.m(i, 16)) {
             ImageRequest imageRequest = uoc$a.b.b();
             if (uoc$a.d.i.g != null || !c.k(imageRequest.s())) {
                uod.E(a.a(imageRequest.q(), imageRequest.p(), uod, uoc$a.c));
             }
          }
          if (uoc$a.b.c().h().v != null) {
             d = uoc$a.d;
             Objects.requireNonNull(d);
             if (p0.j() == a.a) {
                uoa = 0x6400000;
                int i3 = p0.o();
                int i4 = (p0.getWidth() * p0.getHeight()) * a.b(d.f.g);
                int i5 = i4 / i3;
                i5 = i5 / i3;
                while (i5 > uoa) {
                   i3 = i3 * 2;
                }
                uod.E(i3);
             }
          }
          d = uoc$a.d;
          Objects.requireNonNull(d);
          if (p0.j() == a.a || !b.f(p1)) {
             _monitor_enter(d);
             _monitor_exit(d);
             if (d.g == null && d.v(p0)) {
                uoa = p0.j();
                String str = (uoa != null)? uoa.b(): "unknown";
                String str1 = str;
                String str2 = p0.getWidth()+"x"+p0.getHeight();
                String str3 = String.valueOf(p0.o());
                b = b.e(p1);
                h oh = (b && !b.m(i, 8))? 1: null;
                boolean b1 = b.m(i, 4);
                d uod1 = d.d.b().p();
                String str4 = (uod1 != null)? uod1.a+"x"+uod1.b: "unknown";
                String str5 = str4;
                long l = d.h.c();
                String str6 = String.valueOf(d.d.b().s());
                int i1 = (oh || b1)? p0.p(): d.p(uod);
                int i2 = i1;
                oh = (oh || b1)? g.d: d.q();
                b$c e = d.e;
                b$c d1 = d.d;
                String str7 = "DecodeProducer";
                try{
                   e.onProducerStart(d1, str7);
                   uoa = d.u(uod, i2, oh);
                   try{
                      if (p0.o() != 1) {
                         i = i | 0x10;
                      }
                      d.e.onProducerFinishWithSuccess(d.d, "DecodeProducer", d.o(uoa, l, oh, b, str1, str2, str5, str3));
                      d.w(uod, uoa);
                      d.t(uoa, i);
                   label_01cd :
                      d.b(p0);
                   }catch(java.lang.Exception e0){
                   }
                   d.e.onProducerFinishWithFailure(d.d, "DecodeProducer", e0, d.o(map, l, oh, b, str1, str2, str5, str3));
                   d.s(e0);
                   goto label_01cd ;
                }catch(com.facebook.imagepipeline.decoder.DecodeException e0){
                   try{
                      DecodeException uDecodeExcep = e0;
                      d encodedImage = uDecodeExcep.getEncodedImage();
                      Object[] objArray = new Object[]{uDecodeExcep.getMessage(),str6,encodedImage.h(10),Integer.valueOf(encodedImage.p())};
                      a.z("ProgressiveDecoder", "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", objArray);
                      throw uDecodeExcep;
                   }catch(java.lang.Exception e0){
                      map = null;
                      goto label_01ba ;
                   }
                }catch(java.lang.Exception e0){
                }
             }
          }
       }
    label_01da :
       return;
    }
}
