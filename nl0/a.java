package nl0.a;
import nl0.d;
import nl0.a$a;
import nsd.u;
import nl0.c$c;
import java.lang.Object;
import java.util.concurrent.ConcurrentLinkedQueue;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import yx.j0;
import com.yxcorp.gifshow.commercial.adsdk.model.AdLogAltData;
import com.kuaishou.android.model.feed.k;
import crd.b;
import java.lang.Integer;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import nl0.a$b;
import nl0.a$c;
import erd.g;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import com.yxcorp.retrofit.a;
import nl0.e;
import com.yxcorp.retrofit.e;
import kp.r1;
import nl0.a$d;
import nl0.a$e;

public final class a implements d	// class@003354
{
    public int a;
    public b b;
    public boolean c;
    public int d;
    public final ConcurrentLinkedQueue e;
    public c$c f;
    public static final a$a g;

    static {
       a.g = new a$a(null);
    }
    public void a(c$c p0){
       super();
       this.f = p0;
       this.e = new ConcurrentLinkedQueue();
    }
    public synchronized void a(BaseFeed p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a.p(p0, "feed");
       this.e.add(p1);
       int i = 0;
       Object[] objArray = new Object[i];
       j0.f("AdLogTrackHelper", "trackEventRandomDelay "+this.a, objArray);
       if (k.x(p0) != null) {
          this.c(3);
       }else if(this.a != 3){
          this.c(i);
       }
       Object[] objArray1 = new Object[i];
       j0.f("AdLogTrackHelper", "trackEventRandomDelay after check "+this.a, objArray1);
       a ta = this.a;
       if (ta != null) {
          if (ta == 3) {
             this.d();
          }
       }else {
          this.e(p0);
       }
       return;
    }
    public void b(BaseFeed p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       a.p(p0, "feed");
       this.e.add(p1);
       int i = 0;
       Object[] objArray = new Object[i];
       j0.f("AdLogTrackHelper", "trackEventImmediately", objArray);
       if (k.x(p0) != null) {
          this.c(3);
       }else if(this.a != 3){
          this.c(i);
       }
       a ta = this.a;
       if (ta != null) {
          if (ta != 1) {
             if (ta == 3) {
                this.d();
             }
          }else {
             Object[] objArray1 = new Object[i];
             j0.f("AdLogTrackHelper", "cancel request delay", objArray1);
             a tb = this.b;
             if (tb != null) {
                tb.dispose();
             }
             this.f(p0);
          }
       }else {
          this.f(p0);
       }
       return;
    }
    public final void c(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("AdLogTrackHelper", "changeState to "+p0, objArray);
       this.a = p0;
       return;
    }
    public synchronized final void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("AdLogTrackHelper", "consumeAllActions", objArray);
       Iterator iterator = this.e.iterator();
       while (iterator.hasNext()) {
          iterator.next().run();
       }
       this.e.clear();
       if (this.c != null) {
          a tf = this.f;
          if (tf != null) {
             tf.a();
          }
       }
       return;
    }
    public final void e(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       this.c(1);
       long l = (long)new Random().nextInt(0x2710);
       Object[] objArray = new Object[0];
       j0.f("AdLogTrackHelper", "fetchTrackDataForDelay "+l, objArray);
       this.b = t.timer(l, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new a$b(this, p0), a$c.b);
       return;
    }
    public final void f(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       String str = "AdLogTrackHelper";
       int i = 0;
       if (this.d >= 3) {
          this.c(i);
          Object[] objArray = new Object[i];
          j0.f(str, "mRetryTimes has over MAX_RETRY_TIMES", objArray);
          this.d();
          return;
       }else {
          Object[] objArray1 = new Object[i];
          j0.f(str, "request adTrackData", objArray1);
          this.c(2);
          String str1 = "";
          if (p0 instanceof LiveStreamFeed) {
             LiveStreamFeed mLiveStreamM = p0.mLiveStreamModel;
             if (mLiveStreamM != null) {
                LiveStreamModel mLiveStreamI = mLiveStreamM.mLiveStreamId;
                if (mLiveStreamI != null) {
                   str1 = mLiveStreamI;
                }
             }
          }
          PhotoAdvertisement photoAdverti = k.B(new QPhoto(p0));
          z b = d.b;
          e uoe = e.b(b.a(-1961311520).a(RouteType.AD, b), e.class);
          if (photoAdverti != null) {
             i = photoAdverti.mSourceType;
          }
          uoe.a(i, str1, r1.h1(p0)).subscribeOn(b).subscribe(new a$d(this, p0), new a$e(this));
          return;
       }
    }
}
