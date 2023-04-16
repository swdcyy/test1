package c03.m;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import c03.l;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Throwable;
import java.lang.Integer;
import zz2.d;
import sz2.b;
import com.kwai.sdk.switchconfig.a;
import io7.c;

public class m	// class@000496
{
    public final Map a;

    public void m(){
       super();
       this.a = new ConcurrentHashMap();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "5")) {
          return;
       }
       CopyOnWriteArrayList uCopyOnWrite = this.a.get(p0);
       if (uCopyOnWrite != null) {
          Iterator iterator = uCopyOnWrite.iterator();
          while (iterator.hasNext()) {
             l ol = iterator.next().get();
             if (ol != null) {
                ol.e(p0);
             }else {
                b.S(LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectResourceDownloadStateManager"), "[notifyResourceDownloadCompleted] observer is null", "key", p0);
             }
          }
       }
       return;
    }
    public void b(String p0,int p1,Throwable p2){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, m.class, "6")) {
          return;
       }
       CopyOnWriteArrayList uCopyOnWrite = this.a.get(p0);
       if (uCopyOnWrite != null) {
          Iterator iterator = uCopyOnWrite.iterator();
          while (iterator.hasNext()) {
             l ol = iterator.next().get();
             if (ol != null) {
                ol.a(p0, p1, p2);
             }else {
                b.S(LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectResourceDownloadStateManager"), "[notifyResourceDownloadFailed] observer is null", "key", p0);
             }
          }
       }
       return;
    }
    public void c(List p0,int p1,Throwable p2){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, m.class, "8")) {
          return;
       }
       if (p0 != null && p0.size() > 0) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             d uod = iterator.next();
             if (uod == null) {
                continue ;
             }
             this.b(uod.a().d(), p1, p2);
          }
       }
       return;
    }
    public void d(String p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "1")) {
          return;
       }
       CopyOnWriteArrayList uCopyOnWrite = this.a.get(p0);
       if (uCopyOnWrite == null) {
          uCopyOnWrite = new CopyOnWriteArrayList();
          this.a.put(p0, uCopyOnWrite);
       }
       int i = 1;
       if (a.t().u("SOURCE_LIVE").d("enableEffectResListenerOpt", false)) {
          CopyOnWriteArrayList uCopyOnWrite1 = this.a.get(p0);
          if (uCopyOnWrite1 != null) {
             Iterator iterator = uCopyOnWrite1.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if (iterator.next().get() == p1) {
                      i = 0;
                   }
                }
             }
          }
       }
       if (i) {
          uCopyOnWrite.add(new WeakReference(p1));
       }
       return;
    }
    public void e(String p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "3")) {
          return;
       }
       CopyOnWriteArrayList uCopyOnWrite = this.a.get(p0);
       if (uCopyOnWrite != null) {
          Iterator iterator = uCopyOnWrite.iterator();
          while (iterator.hasNext()) {
             WeakReference weakReferenc = iterator.next();
             if (weakReferenc.get() == p1) {
                uCopyOnWrite.remove(weakReferenc);
             }
          }
       }
       return;
    }
}
