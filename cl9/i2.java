package cl9.i2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import cl9.i2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.CommentConfig;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import cl9.i2$b;
import qvb.q;
import qvb.j;
import y8c.g;
import fk9.b;
import cl9.i2$c;
import xk9.d;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import cl9.i2$d;
import androidx.recyclerview.widget.RecyclerView$i;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.util.rx.RxBus;
import nk9.d;
import brd.t;
import cl9.h2;
import erd.g;
import crd.b;
import androidx.recyclerview.widget.RecyclerView;
import cl9.g2;
import android.view.View$OnLayoutChangeListener;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.ObservableLinearLayoutManager;
import cl9.i2$e;
import androidx.recyclerview.widget.ObservableLinearLayoutManager$a;
import cl9.i2$f;
import com.yxcorp.gifshow.comment.e$b;
import com.yxcorp.gifshow.comment.e;
import cl9.i2$g;
import androidx.recyclerview.widget.RecyclerView$r;
import android.view.ViewParent;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.lang.Runnable;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import cl9.i2$h;
import android.animation.Animator$AnimatorListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.comment.CommentParams;

public class i2 extends PresenterV2	// class@000636
{
    public boolean A;
    public View$OnLayoutChangeListener B;
    public b C;
    public RecyclerView$i D;
    public d E;
    public q F;
    public QComment G;
    public e$b H;
    public Runnable I;
    public CommentsFragment p;
    public RecyclerView$r q;
    public View r;
    public int s;
    public int t;
    public e u;
    public boolean v;
    public ObservableLinearLayoutManager w;
    public CommentConfig x;
    public CommentParams y;
    public KwaiShadowLayout z;
    public static final int J;
    public static final int K;

    static {
       i2.J = a1.e(85.00f);
       i2.K = a1.e(36.00f);
    }
    public void i2(){
       super();
       this.I = new i2$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i2.class, "3")) {
          return;
       }
       if (this.x.mEnableLastViewedButton == null) {
          return;
       }
       i2$b uob = new i2$b(this);
       this.F = uob;
       this.p.q().h(uob);
       this.C = this.p.g7();
       i2$c uoc = new i2$c(this);
       this.E = uoc;
       this.p.Gh(uoc);
       i2$d uod = new i2$d(this);
       this.D = uod;
       this.C.F0(uod);
       this.X7(RxBus.f.f(d.class).subscribe(new h2(this)));
       g2 og2 = new g2(this);
       this.B = og2;
       this.p.h0().addOnLayoutChangeListener(og2);
       ObservableLinearLayoutManager layoutManage = this.p.h0().getLayoutManager();
       this.w = layoutManage;
       layoutManage.W0(new i2$e(this));
       i2$f uof = new i2$f(this);
       this.H = uof;
       this.u.b(uof);
       i2$g og = new i2$g(this);
       this.q = og;
       this.p.h0().addOnScrollListener(og);
       return;
    }
    public void J8(){
       i2 oi2 = i2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi2, "14")) {
          return;
       }
       if (this.x.mEnableLastViewedButton == null) {
          return;
       }
       this.p.h0().removeOnScrollListener(this.q);
       if (!PatchProxy.applyVoid(objArray, this, oi2, "10")) {
          oi2 = this.r;
          if (oi2 != null && oi2.getParent() != null) {
             this.r.getParent().removeView(this.r);
          }
       }
       this.u.j(this.H);
       this.p.getView().removeCallbacks(this.I);
       this.p.Rh(this.E);
       this.p.g7().I0(this.D);
       this.p.h0().removeOnLayoutChangeListener(this.B);
       this.p.q().f(this.F);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, i2.class, "6")) {
          return;
       }
       boolean b = false;
       this.v = b;
       if (this.R8()) {
          this.A = b;
          this.z.animate().alpha(0).scaleX(0x3f4ccccd).scaleY(0x3f4ccccd).setDuration(240).setInterpolator(new DecelerateInterpolator(0x3fc00000)).setListener(new i2$h(this)).start();
       }
       return;
    }
    public boolean R8(){
       i2 obj = PatchProxy.apply(null, this, i2.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.r;
       boolean b = (obj != null && (obj.getParent() != null && this.A != null))? true: false;
       return b;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, i2.class, "2")) {
          return;
       }
       if (this.v == null) {
          return;
       }
       this.p.getView().removeCallbacks(this.I);
       this.p.getView().postDelayed(this.I, 40);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i2.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.u = this.r8("COMMENT_HELPER");
       this.x = this.q8(CommentConfig.class);
       this.y = this.q8(CommentParams.class);
       return;
    }
}
