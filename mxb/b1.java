package mxb.b1;
import mxb.c1;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import mxb.c1$a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.i3;
import java.lang.Number;
import k2b.u1;

public class b1 implements c1	// class@001eed
{
    public final ConcurrentHashMap a;
    public final Object b;

    public void b1(){
       super();
       this.a = new ConcurrentHashMap();
       this.b = new Object();
    }
    public void a(String p0,long p1,long p2,int p3){
       if (PatchProxy.isSupport(b1.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), Long.valueOf(p2), Integer.valueOf(p3), this, b1.class, "3")) {
          return;
       }
       ConcurrentHashMap uConcurrentH = this.a.get(p0);
       if (uConcurrentH == null) {
          b1 tb = this.b;
          _monitor_enter(tb);
          uConcurrentH = this.a.get(p0);
          if (uConcurrentH == null) {
             uConcurrentH = new ConcurrentHashMap();
             this.a.put(p0, uConcurrentH);
          }
          _monitor_exit(tb);
       }
       c1$a uoa = uConcurrentH.get("tvc_showed_key");
       if (uoa == null) {
          uoa = new c1$a();
       }
       uoa.d = p1;
       uoa.e = p2;
       uoa.f = p3;
       uConcurrentH.put("tvc_showed_key", uoa);
       return;
    }
    public c1$a b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ConcurrentHashMap uConcurrentH = this.a.get(p0);
       if (uConcurrentH == null) {
          return null;
       }
       uConcurrentH = uConcurrentH.remove("tvc_showed_key");
       if (uConcurrentH instanceof c1$a) {
          return uConcurrentH;
       }
       return null;
    }
    public c1$a c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b1.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ConcurrentHashMap uConcurrentH = this.a.get(p0);
       if (uConcurrentH == null) {
          return null;
       }
       uConcurrentH = uConcurrentH.remove("tvc_showed_key");
       if (uConcurrentH instanceof c1$a) {
          return uConcurrentH;
       }
       return null;
    }
    public void d(LiveStreamFeed p0,long p1){
       b1 uob1 = b1.class;
       if (PatchProxy.isSupport(uob1) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uob1, "5")) {
          return;
       }
       String str = this.k(p0);
       ConcurrentHashMap uConcurrentH = this.a.get(str);
       if (uConcurrentH == null) {
          b1 tb = this.b;
          _monitor_enter(tb);
          uConcurrentH = this.a.get(str);
          if (uConcurrentH == null) {
             uConcurrentH = new ConcurrentHashMap();
             this.a.put(str, uConcurrentH);
          }
          _monitor_exit(tb);
       }
       c1$a uoa = uConcurrentH.get("tvc_showed_key");
       if (uoa == null) {
          uoa = new c1$a();
       }
       uoa.b = p1;
       uConcurrentH.put("tvc_showed_key", uoa);
       return;
    }
    public c1$a e(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b1 uob1 = b1.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uob1, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       c1$a uoa = null;
       if (TextUtils.x(p0)) {
          return uoa;
       }
       Object obj1 = PatchProxy.applyOneRefs(p0, this, uob1, "9");
       if (obj1 != patchProxyRe) {
          uoa = obj1;
       }else {
          ConcurrentHashMap uConcurrentH = this.a.get(p0);
          if (uConcurrentH != null) {
             uConcurrentH = uConcurrentH.remove("tvc_showed_key");
             if (uConcurrentH instanceof c1$a) {
                uoa = uConcurrentH;
             }
          }
       }
       return uoa;
    }
    public c1$a f(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b1.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ConcurrentHashMap uConcurrentH = this.a.get(p0);
       if (uConcurrentH == null) {
          return null;
       }
       uConcurrentH = uConcurrentH.get("tvc_showed_key");
       if (uConcurrentH instanceof c1$a) {
          return uConcurrentH;
       }
       return null;
    }
    public void g(long p0,String p1){
       b1 uob1 = b1.class;
       if (PatchProxy.isSupport(uob1) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, uob1, "11")) {
          return;
       }
       c1$a uoa = this.e(p1);
       if (uoa != null) {
          i3 oi3 = i3.f();
          oi3.c("startLiveTimeMs", Long.valueOf(p0));
          oi3.c("startTvcTimeMs", Long.valueOf(uoa.a));
          oi3.c("endTvcTimeMs", Long.valueOf(uoa.b));
          oi3.c("requestTvcStartTimeMs", Long.valueOf(uoa.d));
          oi3.c("requestTvcEndTimeMs", Long.valueOf(uoa.e));
          oi3.c("requestTvcType", Integer.valueOf(uoa.f));
          u1.R("LIVE_PLAY_CLICK_TO_RENDER_EVENT", oi3.e(), 3);
       }
       return;
    }
    public void h(LiveStreamFeed p0,long p1,long p2){
       if (PatchProxy.isSupport(b1.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, b1.class, "4")) {
          return;
       }
       String str = this.k(p0);
       ConcurrentHashMap uConcurrentH = this.a.get(str);
       if (uConcurrentH == null) {
          b1 tb = this.b;
          _monitor_enter(tb);
          uConcurrentH = this.a.get(str);
          if (uConcurrentH == null) {
             uConcurrentH = new ConcurrentHashMap();
             this.a.put(str, uConcurrentH);
          }
          _monitor_exit(tb);
       }
       c1$a uoa = uConcurrentH.get("tvc_showed_key");
       if (uoa == null) {
          uoa = new c1$a();
       }
       uoa.a = p1;
       uoa.c = p2;
       uConcurrentH.put("tvc_showed_key", uoa);
       return;
    }
    public void i(String p0,long p1,int p2){
       if (PatchProxy.isSupport(b1.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), this, b1.class, "1")) {
          return;
       }
       ConcurrentHashMap uConcurrentH = this.a.get(p0);
       if (uConcurrentH == null) {
          b1 tb = this.b;
          _monitor_enter(tb);
          uConcurrentH = this.a.get(p0);
          if (uConcurrentH == null) {
             uConcurrentH = new ConcurrentHashMap();
             this.a.put(p0, uConcurrentH);
          }
          _monitor_exit(tb);
       }
       c1$a uoa = uConcurrentH.get("tvc_showed_key");
       if (uoa == null) {
          uoa = new c1$a();
       }
       uoa.d = p1;
       uoa.f = p2;
       uConcurrentH.put("tvc_showed_key", uoa);
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, b1.class, "7")) {
          return;
       }
       this.a.clear();
       return;
    }
    public final String k(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b1.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return p0.getId();
    }
}
