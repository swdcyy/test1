package ob6.c;
import pb6.m;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.Boolean;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import ob6.b;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Enum;
import fg6.a;
import com.google.gson.Gson;
import k2b.u1;

public class c implements m	// class@001fe6
{
    public final ConcurrentHashMap a;
    public final ConcurrentHashMap b;
    public final ConcurrentHashMap c;
    public final ConcurrentHashMap d;

    public void c(){
       super();
       this.a = new ConcurrentHashMap();
       this.b = new ConcurrentHashMap();
       this.c = new ConcurrentHashMap();
       this.d = new ConcurrentHashMap();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       String str = "path";
       try{
          a.p(p0, str);
          c ta = this.a;
          AtomicInteger uAtomicInteg = ta.get(p0);
          if (uAtomicInteg == null) {
             uAtomicInteg = new AtomicInteger();
             p0 = ta.putIfAbsent(p0, uAtomicInteg);
             if (p0 != null) {
                uAtomicInteg = p0;
             }
          }
          uAtomicInteg.incrementAndGet();
       }catch(java.lang.Exception e3){
          ExceptionHandler.handleCaughtException(e3);
       }
       return;
    }
    public void b(String p0,boolean p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "2")) {
          return;
       }
       try{
          a.p(p0, "path");
          String str = (p1)? "tryApiFirst": "useCdnDirectly";
          uoc = this.b;
          Set obj = uoc.get(p0);
          if (obj == null) {
             obj = Collections.newSetFromMap(new ConcurrentHashMap());
             a.o(obj, "concurrentSet");
             b uob = new b(obj, new AtomicInteger());
             p0 = uoc.putIfAbsent(p0, uob);
             obj = (p0 != null)? p0: uob;
          }
       label_004b :
          obj.a().incrementAndGet();
          obj.b().add(str);
       }catch(java.lang.Exception e5){
          ExceptionHandler.handleCaughtException(e5);
       }
       return;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       String str = "path";
       try{
          a.p(p0, str);
          c td = this.d;
          AtomicInteger uAtomicInteg = td.get(p0);
          if (uAtomicInteg == null) {
             uAtomicInteg = new AtomicInteger();
             p0 = td.putIfAbsent(p0, uAtomicInteg);
             if (p0 != null) {
                uAtomicInteg = p0;
             }
          }
          uAtomicInteg.incrementAndGet();
       }catch(java.lang.Exception e3){
          ExceptionHandler.handleCaughtException(e3);
       }
       return;
    }
    public void d(String p0,RequestTiming p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "3")) {
          return;
       }
       a.p(p0, "path");
       String str = "requestTiming";
       try{
          a.p(p1, str);
          String str1 = p1.name();
          c tc = this.c;
          Set obj = tc.get(p0);
          if (obj == null) {
             obj = Collections.newSetFromMap(new ConcurrentHashMap());
             a.o(obj, "concurrentSet");
             b uob = new b(obj, new AtomicInteger());
             p0 = tc.putIfAbsent(p0, uob);
             obj = (p0 != null)? p0: uob;
          }
       label_0043 :
          obj.a().incrementAndGet();
          obj.b().add(str1);
       }catch(java.lang.Exception e5){
          ExceptionHandler.handleCaughtException(e5);
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       try{
          if (((this.b.size() + this.c.size()) + this.d.size()) > 0) {
             u1.Y("key_config_degrade_state", a.a.q(this), 21);
             this.b.clear();
             this.c.clear();
             this.d.clear();
          }
          this.a.clear();
       }catch(java.lang.Exception e0){
          ExceptionHandler.handleCaughtException(e0);
       }
       return;
    }
}
