package e19.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e19.c$a;
import e19.c$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import p5a.e;
import de5.a;
import p5a.c;
import com.kwai.framework.player.core.b;
import e19.b;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import gz8.b;
import e19.e;
import gz8.b$a;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import e19.c$c;
import tc6.a;
import java.util.Objects;
import com.kwai.framework.player.core.b$b;
import com.kwai.framework.player.multisource.d;
import com.kwai.framework.player.multisource.e;
import gc6.k;
import com.yxcorp.gifshow.detail.view.SlidePlayVideoLoadingProgressBar;
import e19.c$d;
import android.animation.AnimatorListenerAdapter;
import java.lang.Runnable;
import ekd.k1;
import android.widget.ProgressBar;
import g59.j;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import sc6.c;

public class c extends PresenterV2	// class@002121
{
    public Runnable A;
    public IMediaPlayer$OnInfoListener B;
    public b C;
    public IMediaPlayer$OnCompletionListener D;
    public final a E;
    public ProgressBar p;
    public QPhoto q;
    public f r;
    public List s;
    public a t;
    public BaseFragment u;
    public c v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public void c(){
       super();
       this.D = new c$a(this);
       this.E = new c$b(this);
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          return;
       }
       boolean b = false;
       this.w = b;
       this.x = b;
       this.z = b;
       if (!this.r.get().booleanValue() || (this.q.isVideoType() && this.p != null)) {
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.u.getParentFragment());
          if (slidePlayVie != null) {
             slidePlayVie.P(this.u, this.E);
          }else {
             c ts = this.s;
             if (ts != null) {
                ts.add(this.E);
             }
          }
          if (this.t.getPlayer().j()) {
             return;
          }else {
             this.w = b;
             this.z = this.t.getPlayer().isBuffering();
             b uob = new b(this);
             this.B = uob;
             this.t.getPlayer().addOnInfoListener(uob);
             if (!PatchProxy.applyVoid(objArray, this, uoc, "6")) {
                uoc = this.t;
                if (uoc != null && uoc.getPlayer() != null) {
                   this.C = new b(this.t.getPlayer(), new e(this));
                }
             }
             if (this.t.getPlayer() != null) {
                this.t.getPlayer().addOnCompletionListener(this.D);
             }
             this.v.e(new c$c(this));
          }
       }
    label_00b9 :
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.y = false;
       c tt = this.t;
       if (tt != null && this.B != null) {
          tt.getPlayer().removeOnInfoListener(this.B);
          tt = this.C;
          if (tt != null) {
             Objects.requireNonNull(tt);
             b uob = b.class;
             if (!PatchProxy.applyVoid(null, tt, uob, "2")) {
                tt.e.O(tt.b);
                if (!PatchProxy.applyVoid(null, tt, uob, "7")) {
                   uob = tt.e;
                   if (uob instanceof d) {
                      uob.e(tt.c);
                   }else if(uob instanceof c){
                      uob.e(tt.c);
                      uob = tt.e;
                      if (uob instanceof e) {
                         uob.f(tt.d);
                      }
                   }
                }
             }
          }
          this.B = null;
       }
       this.X8();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       if (this.t.getPlayer() != null) {
          this.t.getPlayer().removeOnCompletionListener(this.D);
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, c.class, "10")) {
          return;
       }
       c tp = this.p;
       if (tp != null && tp instanceof SlidePlayVideoLoadingProgressBar) {
          this.x = false;
          tp.setAnimatorListenerAdapter(new c$d(this));
          this.p.b();
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, c.class, "13")) {
          return;
       }
       c tA = this.A;
       if (tA != null) {
          k1.m(tA);
          this.A = null;
       }
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, c.class, "12")) {
          return;
       }
       c tp = this.p;
       if (tp != null) {
          tp.setVisibility(8);
       }
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
          return;
       }
       if (j.a()) {
          this.W8();
       }
       return;
    }
    public void W8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "9")) {
          return;
       }
       c tp = this.p;
       if (tp != null && (tp instanceof SlidePlayVideoLoadingProgressBar && this.x == null)) {
          tp.setAnimatorListenerAdapter(objArray);
          this.x = true;
          this.p.setVisibility(0);
          this.p.e();
       }
    label_002d :
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, c.class, "11")) {
          return;
       }
       this.R8();
       c tp = this.p;
       if (tp != null && tp instanceof SlidePlayVideoLoadingProgressBar) {
          tp.setAnimatorListenerAdapter(null);
          this.x = false;
          this.p.f();
          this.S8();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a39fe);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       this.r = this.x8("DETAIL_ENABLE_SLIDE_PLAY");
       this.s = this.t8("DETAIL_ATTACH_LISTENERS");
       this.t = this.q8(a.class);
       this.u = this.r8("DETAIL_FRAGMENT");
       this.v = this.r8("DETAIL_SURFACE_LISTENERS");
       return;
    }
}
