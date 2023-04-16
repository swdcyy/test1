package bi9.h;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import android.os.Handler;
import android.os.Looper;
import bi9.g;
import android.util.SparseArray;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import bi9.f;
import erd.g;
import bi9.e;
import q16.a$a;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import java.util.List;
import bi9.c;
import j8c.a;
import q87.c;
import bi9.b;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.camera.record.base.d;
import bh9.s;
import oc9.w;
import java.util.Iterator;
import oc9.t;
import bi9.a;
import oc9.q;
import bi9.d;

public class h extends d0	// class@0004b2
{
    public int o;
    public Handler p;
    public Runnable q;
    public SparseArray r;

    public void h(CameraPageType p0,b p1){
       super(p0, p1);
       this.p = new Handler(Looper.getMainLooper());
       this.q = new g(this);
       this.r = new SparseArray();
    }
    public void A0(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oh, "7")) {
          this.p.removeCallbacks(this.q);
          this.h2();
          this.g2(f.b);
       }
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       this.o = 0;
       this.p.postDelayed(this.q, 1000);
       return;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, h.class, "5")) {
          return;
       }
       this.g2(e.b);
       return;
    }
    public void de(a$a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "6")) {
          return;
       }
       if (p1 == null || p1.f.size() <= 0) {
          Object[] objArray = new Object[0];
          a.D().A("RecordSampling", "prepareIntentForPreviewActivityInWorkThread return as no parts", objArray);
          return;
       }else {
          this.g2(new c(p1));
          return;
       }
    }
    public final void g2(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "10")) {
          return;
       }
       int i = 0;
       while (i < this.r.size()) {
          b uob = this.r.valueAt(i);
          if (uob != null) {
             try{
                p0.accept(uob);
             }catch(java.lang.Exception e1){
                PostUtils.D("RecordSampling", "Ö´ÐÐConsumerÊ§°Ü", e1);
             }
          }
          i = i + 1;
       }
       return;
    }
    public final void h2(){
       if (PatchProxy.applyVoid(null, this, h.class, "9")) {
          return;
       }
       int i = (int)(this.d.d(s.c).a * 1000.00f);
       Iterator iterator = this.d.b().za().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof a) {
             ot.F1(this.o, i, this.r);
          }else if(!ot instanceof q){
             continue ;
          }else {
             Iterator iterator1 = ot.getChildren().iterator();
             while (iterator1.hasNext()) {
                t ot1 = iterator1.next();
                if (ot1 instanceof a) {
                   ot1.F1(this.o, i, this.r);
                }else {
                   continue ;
                }
             }
          }
       }
       this.o = this.o + i;
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       super.onDestroyView();
       this.p.removeCallbacksAndMessages(null);
       return;
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       this.g2(d.b);
       return;
    }
}
