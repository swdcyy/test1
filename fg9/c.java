package fg9.c;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.base.d;
import qc9.a;
import com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.AbsRecordBottomBarViewBinder;
import fg9.e;
import fg9.a;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wd9.a;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import android.view.View;
import com.yxcorp.utility.n;
import a2.i0;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import qxc.b;
import j8c.a;
import q87.c;
import android.view.ViewTreeObserver;
import fg9.c$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import fg9.b;
import erd.g;
import crd.b;
import eoc.f;

public class c extends d0	// class@002314
{
    public View o;
    public TextView p;
    public View q;
    public AbsRecordBottomBarViewBinder r;
    public int s;

    public void c(CameraPageType p0,b p1){
       super(p0, p1);
       this.s = Integer.MIN_VALUE;
       d tf = this.f;
       if (tf instanceof a) {
          this.r = tf.zb();
       }
       this.d.n(e.class, new a(this));
       return;
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       d tc = this.c;
       if (tc != CameraPageType.TIE_TIE && tc != CameraPageType.WHATS_UP) {
          this.g2();
       }
       return;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.g2();
       return;
    }
    public final void g2(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       if (this.n == 5) {
          d tc = this.c;
          if (tc == CameraPageType.TIE_TIE || tc == CameraPageType.WHATS_UP) {
          label_001b :
             if (this.d.d(a.i).a == null && !CameraLogger.d(this.d)) {
                c to = this.o;
                if (to != null) {
                   n.Y(to, 0, 0);
                   to = this.s;
                   if (to != Integer.MIN_VALUE) {
                      this.o.setTranslationY((float)to);
                   }else if(i0.Y(this.o)){
                      this.s = (int)this.o.getTranslationY();
                   }
                   this.o.setAlpha(0x3f800000);
                }
                to = this.p;
                if (to != null) {
                   to.setAlpha(0x3f800000);
                }
             }
          }
       }else {
          goto label_001b ;
       }
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       super.k(p0);
       this.q = p0.findViewById(0x7f0a34a7);
       this.p = p0.findViewById(0x7f0a34b8);
       c tr = this.r;
       View view = (tr == null)? null: tr.y();
       p0 = b.a(view, p0, R.id.action_bar_layout);
       this.o = p0;
       if (p0 != null && !i0.Y(p0)) {
          Object[] objArray = new Object[0];
          a.D().w("PanelShowController", "@resetView mActionBarLayout not layout success, init OriginTranslateY", objArray);
          this.o.getViewTreeObserver().addOnGlobalLayoutListener(new c$a(this));
       }
       this.Y1(f.a(PanelShowEvent.class, new b(this)));
       return;
    }
}
