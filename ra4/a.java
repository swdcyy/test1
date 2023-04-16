package ra4.a;
import ra4.b;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import com.kuaishou.merchant.preload.view.ViewPreloadManager;
import java.lang.String;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import java.util.Map;
import qa4.e;
import qa4.a;
import java.lang.Throwable;
import com.kuaishou.merchant.preload.PreloadConfig;
import qa4.d;
import com.kuaishou.merchant.preload.PreloadConfig$a;
import com.kuaishou.merchant.preload.net.MethodRequest;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.lang.CharSequence;

public abstract class a implements b	// class@003beb
{

    public void a(){
       try{
          super();
          ArrayList uArrayList = new ArrayList();
          this.e(uArrayList);
          ViewPreloadManager h = ViewPreloadManager.h;
          String str = this.a();
          Objects.requireNonNull(h);
          if (!PatchProxy.applyVoidTwoRefs(str, uArrayList, h, ViewPreloadManager.class, "9")) {
             int i = 1;
             boolean b = (str == null || !str.length())? true: false;
             if (!b && (uArrayList.isEmpty() ^ i) == i) {
                ViewPreloadManager.c.put(str, uArrayList);
             }
          }
       }catch(java.lang.Exception e0){
          e.d.d1().e("BasePreloader", "init error!", e0);
       }
       return;
    }
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       try{
          d uod = PreloadConfig.Companion.d(this.a());
          if (uod != null) {
             if (!uod.c()) {
                return;
             }else {
                ViewPreloadManager.h.c(this.a(), p0);
             }
          }else {
             return;
          }
       }catch(java.lang.Exception e4){
          e.d.d1().e("BasePreloader", "preloadView error!", e4);
       }
       return;
    }
    public final void d(MethodRequest p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       String str = "request";
       try{
          a.p(p0, str);
          d uod = PreloadConfig.Companion.d(this.a());
          if (uod != null) {
             if (!uod.a()) {
                return;
             }else {
                HashMap hashMap = new HashMap();
                hashMap.put("preloadHeaderTag", String.valueOf(true));
                hashMap.put("needCache", String.valueOf(true));
                hashMap.put("cacheTimeout", String.valueOf(uod.cacheTimeout));
                this.c(hashMap, p0);
             }
          }else {
             return;
          }
       }catch(java.lang.Exception e6){
          e.d.d1().e("BasePreloader", "preloadRequest error!", e6);
       }
       return;
    }
    public final void f(MethodRequest p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       String str = "request";
       try{
          a.p(p0, str);
          d uod = PreloadConfig.Companion.d(this.a());
          if (uod != null) {
             if (!uod.b()) {
                return;
             }else {
                HashMap hashMap = new HashMap();
                boolean b = true;
                hashMap.put("isRelay", String.valueOf(b));
                hashMap.put("relayTimeout", String.valueOf(uod.relayTimeout));
                str = p0.getPreloadTraceId();
                if (str != null) {
                   if (str.length() <= 0) {
                      b = false;
                   }
                   if (!b) {
                      str = null;
                   }
                   if (str != null) {
                      hashMap.put("preloadTraceId", str);
                   }
                }
                this.c(hashMap, p0);
             }
          }else {
             return;
          }
       }catch(java.lang.Exception e7){
          e.d.d1().e("BasePreloader", "relayRequest error!", e7);
       }
       return;
    }
    public String g(){
       return null;
    }
}
