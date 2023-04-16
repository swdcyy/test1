package com.yxcorp.gifshow.camera.record.video.StandardCameraFragment$a;
import java.util.List;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ConcurrentLinkedQueue;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment$a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Queue;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.ArrayList;
import ekd.k1;
import oc9.t;
import va9.a;
import java.util.Collection;
import java.lang.InterruptedException;
import java.lang.Throwable;
import w46.b;

public class StandardCameraFragment$a	// class@000f74
{
    public final AtomicInteger a;
    public final Queue b;
    public final List c;

    public void StandardCameraFragment$a(List p0){
       super();
       this.a = new AtomicInteger();
       this.b = new ConcurrentLinkedQueue();
       this.c = p0;
    }
    public void a(StandardCameraFragment$a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StandardCameraFragment$a.class, "1")) {
          return;
       }
       this.b.add(p0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, StandardCameraFragment$a.class, "2")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("CameraBaseFragment", this.toString()+" begin execute", objArray);
       this.a.addAndGet(1);
       ArrayList uArrayList = new ArrayList(40);
       StandardCameraFragment$a$a uoa$a = this.b.poll();
       while (uoa$a != null) {
          long l = k1.i();
          t ot = uoa$a.build();
          if (ot != null) {
             uArrayList.add(ot);
             a.d("new "+ot, l);
          }
       }
       if (!uArrayList.isEmpty()) {
          StandardCameraFragment$a tc = this.c;
          _monitor_enter(tc);
          this.c.addAll(uArrayList);
          _monitor_exit(tc);
       }
       this.a.decrementAndGet();
       StandardCameraFragment$a ta = this.a;
       _monitor_enter(ta);
       Object[] objArray1 = new Object[i];
       a.D().w("CameraBaseFragment", "notify thread finish", objArray1);
       this.a.notifyAll();
       _monitor_exit(ta);
       if (k1.g()) {
          while (this.a.get() > 0) {
             ta = this.a;
             _monitor_enter(ta);
             long l1 = k1.i();
             try{
                Object[] objArray2 = new Object[i];
                a.D().w("CameraBaseFragment", "wait thread finish", objArray2);
                this.a.wait(1000);
             }catch(java.lang.InterruptedException e4){
                e4.printStackTrace();
                a.D().e("CameraBaseFragment", "wait time "+k1.t(l1), e4);
             }
             _monitor_exit(ta);
          }
       }
       Object[] objArray3 = new Object[i];
       a.D().w("CameraBaseFragment", this.toString()+" execute finish", objArray3);
       return;
    }
}
