package cl9.q2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import cl9.q2$b;
import cl9.q2$a;
import yk9.f;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qvb.q;
import qvb.j;
import qvb.i;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import cl9.q2$c;
import erd.g;
import crd.b;
import cl9.q2$d;
import io.reactivex.internal.functions.Functions;
import cl9.q2$e;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import android.view.ViewTreeObserver$OnDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import ek9.k1;

public final class q2 extends PresenterV2	// class@00065e
{
    public final q2$b A;
    public final ObservableLinearLayoutManager$a B;
    public RecyclerView p;
    public i q;
    public t r;
    public t s;
    public boolean t;
    public k1 u;
    public ViewTreeObserver$OnDrawListener v;
    public boolean w;
    public f x;
    public CommentsFragment y;
    public boolean z;

    public void q2(){
       super();
       this.z = true;
       this.A = new q2$b(this);
       this.B = new q2$a(this);
    }
    public static final f P8(q2 p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("commentShowPerformanceLogger");
       }
       return p0;
    }
    public static final CommentsFragment R8(q2 p0){
       p0 = p0.y;
       if (p0 == null) {
          a.S("mCommentsFragment");
       }
       return p0;
    }
    public void E8(){
       b uob;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, q2.class, "3")) {
          return;
       }
       q2 tq = this.q;
       if (tq != null) {
          tq.h(this.A);
       }
       tq = this.q;
       if (tq != null) {
          objArray = tq.L0();
       }
       boolean b = (objArray != null)? true: false;
       this.w = b;
       tq = this.y;
       if (tq == null) {
          a.S("mCommentsFragment");
       }
       this.X7(tq.m().subscribe(new q2$c(this)));
       tq = this.r;
       if (tq != null) {
          uob = tq.subscribe(new q2$d(this), Functions.d());
          if (uob != null) {
             this.X7(uob);
          }
       }
       tq = this.s;
       if (tq != null) {
          uob = tq.subscribe(new q2$e(this), Functions.d());
          if (uob != null) {
             this.X7(uob);
          }
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, q2.class, "1")) {
          return;
       }
       f uof = new f();
       this.x = uof;
       uof.start();
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, q2.class, "7")) {
          return;
       }
       q2 tx = this.x;
       if (tx == null) {
          a.S("commentShowPerformanceLogger");
       }
       tx.e();
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, q2.class, "4")) {
          return;
       }
       q2 tq = this.q;
       if (tq != null) {
          tq.f(this.A);
       }
       tq = this.p;
       if (tq == null) {
          a.S("recyclerView");
       }
       ViewTreeObserver viewTreeObse = tq.getViewTreeObserver();
       if (viewTreeObse != null) {
          if (viewTreeObse.isAlive()) {
             objArray = viewTreeObse;
          }
          if (objArray != null) {
             objArray.removeOnDrawListener(this.v);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q2.class, "2")) {
          return;
       }
       Object obj = this.q8(RecyclerView.class);
       a.o(obj, "inject\(RecyclerView::class.java\)");
       this.p = obj;
       this.q = this.t8("PAGE_LIST");
       this.r = this.t8("COMMENT_SHOW_PANEL_OBSERVABLE");
       this.s = this.t8("COMMENT_SHOW_PANEL_ANIM_END_OBSERVABLE");
       this.u = this.t8("COMMENT_STAT_PARAM");
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.y = obj;
       return;
    }
}
