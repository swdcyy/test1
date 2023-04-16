package p0d.c;
import dd.a;
import e0d.d$c;
import e0d.h;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.concurrent.ConcurrentHashMap;
import id.c0;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import p0d.g;
import p0d.b;
import com.facebook.imagepipeline.request.ImageRequest;
import android.net.Uri;
import p0d.f;
import p0d.b$g;
import i0d.g;
import hb.b;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import java.util.Map;
import java.lang.Number;
import p0d.b$h;
import p0d.b$f;
import rb.k;
import com.yxcorp.image.common.log.Log;
import java.util.List;
import p0d.b$d;
import p0d.b$b;
import com.yxcorp.image.callercontext.a;
import com.facebook.drawee.backends.pipeline.info.internal.ProducerStatus;
import java.util.Objects;
import p0d.b$e;
import android.graphics.Bitmap$Config;
import com.yxcorp.image.network.ImageHttpStatistics;
import com.yxcorp.image.network.NetworkRequestInfo;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Boolean;
import rb.e;

public class c extends a	// class@00214c
{
    public final ConcurrentHashMap a;
    public static final d$c b;
    public static final b c;

    static {
       c.b = h.c();
       c.c = AwakeTimeSinceBootClock.get();
    }
    public void c(){
       super();
       this.a = new ConcurrentHashMap();
    }
    public final void a(c0 p0,int p1,Throwable p2){
       b c;
       long l;
       g f;
       b f1;
       long l1;
       c uoc = this;
       int i = p1;
       c uoc1 = c.class;
       if (PatchProxy.isSupport(uoc1) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, c.class, "11")) {
          return;
       }
       g og = uoc.a.remove(p0.getId());
       if (og == null) {
          return;
       }
       og.h().a.a = (float)f.h(i, p0.b().s(), p0.h());
       int i1 = 3;
       if (i == i1 && !g.a(og.h().a.a)) {
          return;
       }
       og.c = c.c.now();
       f.d(og.h(), i, p2);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object g og1 = g.class;
       if (!PatchProxy.applyVoidTwoRefs(p0, og, uoc, uoc1, "12")) {
          b uob = og.h();
          if (h.h()) {
             uob.i.c0("request_id", p0.getId());
          }
          f.i(uob, p0.getExtras());
          uob.a.b = p0.b().s().toString();
          uob.a.d = false;
          c = uob.c;
          Object[] objArray = null;
          b obj = PatchProxy.apply(objArray, og, og1, "1");
          if (obj != patchProxyRe) {
             l = obj.longValue();
          }else if(!og.j() - -1 || !og.i() - -1){
             l = -1;
          }else {
             l = og.i() - og.j();
          }
          c.e = l;
          if (!PatchProxy.applyVoidOneRefs(og, uoc, uoc1, "14")) {
             c = og.h();
             c.e.d = og.k();
             obj = c.e;
             if (obj.d <= -1) {
                obj.a = k.b(i1);
             }else {
                Object obj2 = PatchProxy.apply(objArray, og, og1, "3");
                if (obj2 != patchProxyRe) {
                   l = obj2.longValue();
                }else if(!og.g() - -1 || !og.f() - -1){
                   l = 0;
                }else {
                   l = og.f() - og.g();
                }
                obj.c = l;
                g l2 = og.l;
                if (l2 == null) {
                   Log.a("ImageMetricsCollectorWithoutDraweeView", "Image download started, but no network info could be reached!!!");
                }else {
                   f.e(l2, c);
                }
             }
          }
          f = og.f;
          if (!og.e() - -1) {
             f1 = uob.f;
             f1.b = 0;
             f1.a = k.a(i1);
             f = 3;
          }else {
             uob.f.a = k.a(f);
             obj = uob.f;
             og1 = PatchProxy.apply(objArray, og, og1, "2");
             if (og1 != patchProxyRe) {
                l1 = og1.longValue();
             }else if(!og.d() - -1 || !og.e() - -1){
                l1 = 0;
             }else {
                l1 = og.d() - og.e();
             }
             obj.b = l1;
          }
          uob.d.a = (!og.c() - -1)? 0: og.c();
          f.b(uob);
          f1 = uob.c;
          f1.c = f.g(og.n, f, f1.a, uob.e.a);
          Object obj1 = p0.h();
          if (obj1 instanceof a) {
             f.c(obj1, uob);
          }
          f.f(uob);
          if ((uob.c.a).equals(k.c(i1))) {
             c.b.a(uob.toString());
          }else if((uob.c.a).equals(k.c(4)) || (uob.c.a).equals(k.c(5))){
             if (g.a(uob.a.a)) {
                c.b.a(uob.toString());
             }
             Log.c("ImageMetricsCollectorWithoutDraweeView", uob.toString());
          }
       }
       return;
    }
    public final void b(c0 p0,String p1,Map p2,ProducerStatus p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, c.class, "10")) {
          return;
       }
       g og = this.a.get(p0.getId());
       if (og == null) {
          return;
       }
       Objects.requireNonNull(p1);
       int i = -1;
       switch (p1.hashCode()){
           case 0x8de99376:
             if (p1.equals("BitmapMemoryCacheGetProducer")) {
                i = 0;
             }
             break;
           case 0xb20f15e5:
             if (p1.equals("EncodedMemoryCacheProducer")) {
                i = 1;
             }
             break;
           case 0xb70564fe:
             if (p1.equals("NetworkFetchProducer")) {
                i = 2;
             }
             break;
           case 0x271e6a77:
             if (p1.equals("DiskCacheProducer")) {
                i = 3;
             }
             break;
           case 0x39158fe4:
             if (p1.equals("BitmapMemoryCacheProducer")) {
                i = 4;
             }
             break;
           case 0x3cfad516:
             if (p1.equals("PostprocessedBitmapMemoryCacheProducer")) {
                i = 5;
             }
             break;
           case 0x552dc3c0:
             if (p1.equals("DecodeProducer")) {
                i = 6;
             }
             break;
           case 0x7dbdd736:
             if (p1.equals("PartialDiskCacheProducer")) {
                i = 7;
             }
             break;
           default:
       }
       switch (i){
           case 0:
           case 3:
           case 4:
           case 5:
           case 7:
           case 1:
             if (og.b() - -1) {
                og.h = c.c.now();
             }
             break;
           case 2:
             og.k = c.c.now();
             og.m = ProducerStatus.convertProducerStatusToDownloadStatus(p3);
             if (p2 != null) {
                ImageHttpStatistics imageHttpSta = ImageHttpStatistics.restoreFromMap(p2);
                if (imageHttpSta != null) {
                   p2.mDownloadStatus = k.b(og.m);
                   if (!PatchProxy.applyVoidOneRefs(imageHttpSta, og, g.class, "4")) {
                      if (og.l == null) {
                         og.l = new CopyOnWriteArrayList();
                      }
                      og.l.add(imageHttpSta);
                   }
                }
             }
             break;
           case 6:
             og.e = c.c.now();
             if (!PatchProxy.applyVoidTwoRefs(og, p2, this, c.class, "13") && p2 != null) {
                b uob = og.h();
                String str = p2.get("bitmapSize");
                if (str != null) {
                   uob.b.e = 1;
                   String[] stringArray = str.split("x", 2);
                   if (stringArray.length == 2) {
                      uob.f.c = f.a(stringArray[0]);
                      uob.d = f.a(stringArray[1]);
                   }
                }else {
                   uob.e = Bitmap$Config.ARGB_8888.name();
                }
             }
             og.f = ProducerStatus.convertProducerStatusToDecodeStatus(p3);
             break;
           default:
       }
    label_0130 :
       return;
    }
    public void onProducerFinishWithCancellation(c0 p0,String p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "9")) {
          return;
       }
       this.b(p0, p1, p2, ProducerStatus.CANCELED);
       return;
    }
    public void onProducerFinishWithFailure(c0 p0,String p1,Throwable p2,Map p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, c.class, "8")) {
          return;
       }
       this.b(p0, p1, p3, ProducerStatus.ERROR);
       return;
    }
    public void onProducerFinishWithSuccess(c0 p0,String p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "7")) {
          return;
       }
       this.b(p0, p1, p2, ProducerStatus.SUCCESS);
       return;
    }
    public void onProducerStart(c0 p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "5")) {
          return;
       }
       g og = this.a.get(p0.getId());
       if (og == null) {
          return;
       }
       Objects.requireNonNull(p1);
       int i = -1;
       long l = 1;
       switch (p1.hashCode()){
           case 0x8de99376:
             if (p1.equals("BitmapMemoryCacheGetProducer")) {
                i = 0;
             }
             break;
           case 0xb70564fe:
             if (p1.equals("NetworkFetchProducer")) {
                i = 1;
             }
             break;
           case 0x39158fe4:
             if (p1.equals("BitmapMemoryCacheProducer")) {
                i = 2;
             }
             break;
           case 0x3cfad516:
             if (p1.equals("PostprocessedBitmapMemoryCacheProducer")) {
                i = 3;
             }
             break;
           case 0x552dc3c0:
             if (p1.equals("DecodeProducer")) {
                i = 4;
             }
             break;
           default:
       }
       switch (i){
           case 0:
           case 2:
           case 3:
             if (!og.b() - -1) {
                og.l(c.c.now());
             }else if(og.k() >= 0){
                og.l((c.c.now() - (og.a() - og.b())));
             }
             break;
           case 1:
             og.i = og.k() + l;
             if (!og.g() - -1) {
                og.j = c.c.now();
             }
             break;
           case 4:
             og.d = c.c.now();
             break;
           default:
       }
    label_00af :
       return;
    }
    public void onRequestCancellation(c0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       this.a(p0, 4, null);
       return;
    }
    public void onRequestFailure(c0 p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "3")) {
          return;
       }
       this.a(p0, 5, p1);
       return;
    }
    public void onRequestStart(c0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       if (p0.g() != null) {
          return;
       }
       String id = p0.getId();
       if (!id.isEmpty()) {
          g og = new g(new b());
          og.b = c.c.now();
          this.a.put(id, og);
       }
       return;
    }
    public void onRequestSuccess(c0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.a(p0, 3, null);
       return;
    }
    public void onUltimateProducerReached(c0 p0,String p1,boolean p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, c.class, "6")) {
          return;
       }
       g og = this.a.get(p0.getId());
       if (og == null) {
          return;
       }
       og.n = e.a(p1);
       return;
    }
}
