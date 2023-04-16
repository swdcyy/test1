package p0d.i;
import dd.d;
import p0d.i$a;
import nsd.u;
import java.lang.Class;
import java.lang.Object;
import vsd.d;
import nsd.m0;
import java.lang.String;
import e0d.h;
import e0d.d;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Map;
import nsd.s0;
import p0d.h;
import com.yxcorp.image.common.log.Log;
import java.lang.CharSequence;
import android.net.Uri;
import com.yxcorp.image.network.ImageHttpStatistics;
import i0d.g;
import e0d.d$a;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import android.util.Log;
import kotlin.jvm.internal.a;
import android.os.SystemClock;
import java.util.ArrayList;
import java.lang.StringBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.image.callercontext.a;
import uc.b;
import s0d.c;

public final class i implements d	// class@002153
{
    public final ConcurrentHashMap a;
    public static final String b;
    public static final float c;
    public static final float d;
    public static final i$a e;

    static {
       d i;
       float f;
       i$a uoa = new i$a(null);
       i.e = uoa;
       i.b = m0.d(uoa.getClass()).N5();
       d a = h.a;
       i = (a != null)? a.i: 0.01f;
       i.c = i;
       a = (a != null)? a.j: 0x3f800000;
       i.d = a;
    }
    public void i(){
       super();
       this.a = new ConcurrentHashMap();
    }
    public final void a(String p0,String p1,boolean p2){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, i.class, "10")) {
          return;
       }
       i ta = this.a;
       Objects.requireNonNull(ta, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
       h oh = s0.k(ta).remove(p0);
       if (oh == null) {
          Log.a(i.b, "doLog: failed to get request info");
          return;
       }else if(!p2){
          String str = null;
          String str1 = (p1 == null || !p1.length())? 1: null;
          if (!str1) {
             str1 = oh.a();
             if (str1 == null || !str1.length()) {
                str = 1;
             }
             if (str) {
                oh.g(p1);
             }
          }
       }
    label_0059 :
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidTwoRefs(oh, Boolean.valueOf(p2), this, oi, "11")) {
          d a = h.a;
          d$a uoa = (a == null)? null: a.L;
          if (uoa == null || (oh.d() != null && oh.b().mRequestInfo != null)) {
             float c = (p2)? i.c: i.d;
             oh.g = c;
             if (g.a(oh.c())) {
                oh.h = p2;
                uoa.a(oh);
             }
          }
       }
    label_009e :
       return;
    }
    public final String b(Throwable p0){
       int i;
       String obj = PatchProxy.applyOneRefs(p0, this, i.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 != null) {
          obj = Log.getStackTraceString(p0);
          i = (obj == null || !obj.length())? 1: 0;
          if (i) {
             obj = p0.getMessage();
          }
       }
       return obj;
    }
    public final void c(String p0,String p1,Map p2,String p3){
       h oh;
       h oh1;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, i.class, "9")) {
          return;
       }
       if (a.g("NetworkFetchProducer", p1)) {
          if (p2 != null) {
             oh = this.a.get(p0);
             if (oh != null) {
                ImageHttpStatistics imageHttpSta = ImageHttpStatistics.restoreFromMap(p2);
                if (imageHttpSta == null) {
                   imageHttpSta = new ImageHttpStatistics();
                }
                if (!PatchProxy.applyVoidOneRefs(imageHttpSta, oh, h.class, "1")) {
                   a.p(imageHttpSta, "<set-?>");
                   oh.c = imageHttpSta;
                }
             }
          }
          oh = this.a.get(p0);
          if (oh != null) {
             oh.b = SystemClock.elapsedRealtime();
          }
          oh1 = this.a.get(p0);
          if (oh1 != null) {
             oh1.g(p3);
          }
       }else if(a.g("DecodeProducer", p1)){
          oh1 = this.a.get(p0);
          if (oh1 != null) {
             boolean b = (p2 != null && !p2.containsKey("bitmapSize"))? true: false;
             oh1.f = b;
          }
       }
       return;
    }
    public void onProducerEvent(String p0,String p1,String p2){
    }
    public void onProducerFinishWithCancellation(String p0,String p1,Map p2){
    }
    public void onProducerFinishWithFailure(String p0,String p1,Throwable p2,Map p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, i.class, "7")) {
          return;
       }
       this.c(p0, p1, p3, this.b(p2));
       return;
    }
    public void onProducerFinishWithSuccess(String p0,String p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, i.class, "6")) {
          return;
       }
       this.c(p0, p1, p2, null);
       return;
    }
    public void onProducerStart(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "5")) {
          return;
       }
       h oh = this.a.get(p0);
       if (oh != null) {
          StringBuilder str = (p1 == null || !p1.length())? 1: null;
          if (!str) {
             p0 = p1;
             if (!PatchProxy.applyVoidOneRefs(p0, oh, h.class, "2")) {
                a.p(p0, "producer");
                oh.d.add(p0);
             }
             return;
          }
       }
       Log.a(i.b, "onProducerStart: failed to get request info for requestId "+p0+" with producer "+p1);
       return;
    }
    public void onRequestCancellation(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "4")) {
          return;
       }
       i ta = this.a;
       Objects.requireNonNull(ta, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
       s0.k(ta).remove(p0);
       return;
    }
    public void onRequestFailure(ImageRequest p0,String p1,Throwable p2,boolean p3){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, i.class, "3")) {
          return;
       }
       this.a(p1, this.b(p2), false);
       return;
    }
    public void onRequestStart(ImageRequest p0,Object p1,String p2,boolean p3){
       int i;
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, i.class, "1")) {
          return;
       }
       if (p0 != null) {
          i = (p2 == null || !p2.length())? 1: 0;
          if (!i) {
             a uoa = null;
             if (p1 instanceof a) {
                uoa = p1;
             }
             this.a.put(p2, new h(uoa, p0.s()));
          }
       }
       return;
    }
    public void onRequestSuccess(ImageRequest p0,String p1,boolean p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, i.class, "2")) {
          return;
       }
       b uob = (p0 != null)? p0.g(): null;
       if (!uob instanceof c) {
          uob = null;
       }
       c n = (uob != null)? uob.n: null;
       if (n == null) {
          this.a(p1, null, true);
       }
       return;
    }
    public void onUltimateProducerReached(String p0,String p1,boolean p2){
    }
    public boolean requiresExtraMap(String p0){
       return true;
    }
}
