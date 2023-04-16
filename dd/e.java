package dd.e;
import dd.d;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Long;
import android.os.SystemClock;
import java.lang.String;
import cb.a;
import android.util.Pair;
import java.util.Map;
import java.lang.Throwable;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Boolean;
import cb.c;

public class e implements d	// class@0014b6
{
    public final Map a;
    public final Map b;

    public void e(){
       super();
       this.a = new HashMap();
       this.b = new HashMap();
    }
    public static long a(Long p0,long p1){
       if (p0 != null) {
          return (p1 - p0.longValue());
       }
       return -1;
    }
    public static long b(){
       return SystemClock.uptimeMillis();
    }
    public synchronized void onProducerEvent(String p0,String p1,String p2){
       if (a.l(2)) {
          Object[] objArray = new Object[]{Long.valueOf(e.b()),p0,p1,p2,Long.valueOf(e.a(this.a.get(Pair.create(p0, p1)), e.b()))};
          a.s("RequestLoggingListener", "time %d: onProducerEvent: {requestId: %s, stage: %s, eventName: %s; elapsedTime: %d ms}", objArray);
       }
       return;
    }
    public synchronized void onProducerFinishWithCancellation(String p0,String p1,Map p2){
       int i = 2;
       if (a.l(i)) {
          long l = e.b();
          Object[] objArray = new Object[]{Long.valueOf(l),p0,p1,Long.valueOf(e.a(this.a.remove(Pair.create(p0, p1)), l)),p2};
          a.s("RequestLoggingListener", "time %d: onProducerFinishWithCancellation: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s}", objArray);
       }
       return;
    }
    public synchronized void onProducerFinishWithFailure(String p0,String p1,Throwable p2,Map p3){
       if (a.l(5)) {
          long l = e.b();
          Object[] objArray = new Object[]{Long.valueOf(l),p0,p1,Long.valueOf(e.a(this.a.remove(Pair.create(p0, p1)), l)),p3,p2.toString()};
          a.A("RequestLoggingListener", p2, "time %d: onProducerFinishWithFailure: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s, throwable: %s}", objArray);
       }
       return;
    }
    public synchronized void onProducerFinishWithSuccess(String p0,String p1,Map p2){
       int i = 2;
       if (a.l(i)) {
          long l = e.b();
          Object[] objArray = new Object[]{Long.valueOf(l),p0,p1,Long.valueOf(e.a(this.a.remove(Pair.create(p0, p1)), l)),p2};
          a.s("RequestLoggingListener", "time %d: onProducerFinishWithSuccess: {requestId: %s, producer: %s, elapsedTime: %d ms, extraMap: %s}", objArray);
       }
       return;
    }
    public synchronized void onProducerStart(String p0,String p1){
       if (a.l(2)) {
          long l = e.b();
          this.a.put(Pair.create(p0, p1), Long.valueOf(l));
          a.r("RequestLoggingListener", "time %d: onProducerStart: {requestId: %s, producer: %s}", Long.valueOf(l), p0, p1);
       }
       return;
    }
    public synchronized void onRequestCancellation(String p0){
       if (a.l(2)) {
          long l = e.b();
          a.r("RequestLoggingListener", "time %d: onRequestCancellation: {requestId: %s, elapsedTime: %d ms}", Long.valueOf(l), p0, Long.valueOf(e.a(this.b.remove(p0), l)));
       }
       return;
    }
    public synchronized void onRequestFailure(ImageRequest p0,String p1,Throwable p2,boolean p3){
       if (a.l(5)) {
          long l = e.b();
          Object[] objArray = new Object[]{Long.valueOf(l),p1,Long.valueOf(e.a(this.b.remove(p1), l)),p2.toString()};
          a.z("RequestLoggingListener", "time %d: onRequestFailure: {requestId: %s, elapsedTime: %d ms, throwable: %s}", objArray);
       }
       return;
    }
    public synchronized void onRequestStart(ImageRequest p0,Object p1,String p2,boolean p3){
       int i = 2;
       if (a.l(i)) {
          String str = "RequestLoggingListener";
          Long longx = Long.valueOf(e.b());
          Boolean uBoolean = Boolean.valueOf(p3);
          if (a.a.d(i)) {
             Object[] objArray = new Object[]{longx,p2,p1,uBoolean};
             a.a.v(str, a.i("time %d: onRequestSubmit: {requestId: %s, callerContext: %s, isPrefetch: %b}", objArray));
          }
          this.b.put(p2, Long.valueOf(e.b()));
       }
       return;
    }
    public synchronized void onRequestSuccess(ImageRequest p0,String p1,boolean p2){
       if (a.l(2)) {
          long l = e.b();
          Long longx = Long.valueOf(l);
          a.r("RequestLoggingListener", "time %d: onRequestSuccess: {requestId: %s, elapsedTime: %d ms}", longx, p1, Long.valueOf(e.a(this.b.remove(p1), l)));
       }
       return;
    }
    public synchronized void onUltimateProducerReached(String p0,String p1,boolean p2){
       int i = 2;
       if (a.l(i)) {
          long l = e.b();
          Object[] objArray = new Object[]{Long.valueOf(l),p0,p1,Long.valueOf(e.a(this.a.remove(Pair.create(p0, p1)), l)),Boolean.valueOf(p2)};
          a.s("RequestLoggingListener", "time %d: onUltimateProducerReached: {requestId: %s, producer: %s, elapsedTime: %d ms, success: %b}", objArray);
       }
       return;
    }
    public boolean requiresExtraMap(String p0){
       return a.l(2);
    }
}
