package ej9.g;
import pnc.b;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Map;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import ej9.g$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.cdnresource.CdnResource;
import brd.t;
import ej9.b;
import erd.r;
import ej9.a;
import erd.o;
import com.yxcorp.gifshow.util.cdnresource.k;

public class g implements b	// class@002168
{
    public final Map a;
    public final ConcurrentLinkedQueue b;
    public final Map c;
    public final PublishSubject d;
    public g$a e;

    public void g(){
       super();
       this.a = new ConcurrentHashMap();
       this.b = new ConcurrentLinkedQueue();
       this.c = new ConcurrentHashMap();
       this.d = PublishSubject.g();
       this.e = null;
    }
    public void a(String p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, g.class, "2")) {
          return;
       }
       if (this.c.containsKey(p0)) {
          Log.g("FeedResourceManagerImpl", "fetch fail ,CDN资源已存在 : resourceId = "+p0+"，resourceUrl = "+p0);
          return;
       }else {
          g$a uoa = this.a.get(p0);
          if (uoa != null && uoa.i <= 2) {
             Log.g("FeedResourceManagerImpl", "fetch fail,CDN资源正在下载中 : resourceId = "+p0+"，resourceUrl = "+p0);
             return;
          }else {
             this.a.remove(p0);
             if (uoa != null) {
                this.b.remove(uoa);
             }else {
                g$a uoa1 = new g$a(this, p0, p1, p2, p3, true);
             }
             this.a.put(p0, uoa);
             this.b.offer(uoa);
             this.h();
             Log.d("FeedResourceManagerImpl", "fetch CDN资源 : resourceId = "+p0+"，resourceUrl = "+p0);
             return;
          }
       }
    }
    public void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "5")) {
          return;
       }
       this.c.remove(p0);
       g$a uoa = new g$a(this, p0, p1, null, 2, false);
       v0.h = true;
       v0.b();
       return;
    }
    public void c(String p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, g.class, "3")) {
          return;
       }
       if (this.c.containsKey(p0)) {
          return;
       }
       g$a uoa = this.a.get(p0);
       if (uoa != null && uoa.i <= 2) {
          return;
       }
       if (uoa == null) {
          g$a uoa1 = new g$a(this, p0, p1, p2, p3, false);
       }
       this.a.put(p0, uoa);
       uoa.b();
       return;
    }
    public boolean d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.g(p0) != null)? true: false;
       return b;
    }
    public t e(String p0){
       CdnResource obj = PatchProxy.applyOneRefs(p0, this, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g(p0);
       if (obj != null) {
          return t.just(obj);
       }
       return this.d.hide().filter(new b(p0)).map(new a(this, p0));
    }
    public void f(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "1")) {
          return;
       }
       this.a(p0, p1, null, 1);
       return;
    }
    public CdnResource g(String p0){
       g$a obj = PatchProxy.applyOneRefs(p0, this, g.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.get(p0);
       if (obj != null && !PatchProxy.applyVoid(null, obj, g$a.class, "3")) {
          Log.d("FeedResourceManagerImpl", "touchResumeTask : task = "+obj);
          obj.e.e();
       }
       return this.c.get(p0);
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       if (this.e != null) {
          return;
       }
       g$a uoa = this.b.poll();
       if (uoa == null) {
          return;
       }
       this.e = uoa;
       uoa.b();
       Log.d("FeedResourceManagerImpl", "tryStartTask CDN资源 : task = "+uoa);
       return;
    }
}
