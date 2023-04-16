package jh9.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import jh9.e$b;
import jh9.e$a;
import com.yxcorp.gifshow.camera.record.toolbox.widget.ScrollToTopCoordinatorLayout;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.refresh.RefreshLayout;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tyc.h3;
import com.yxcorp.gifshow.widget.NestedListenerCoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$c;
import com.google.android.material.appbar.AppBarLayout;
import jh9.e$c;
import com.kwai.library.widget.refresh.RefreshLayout$g;
import jh9.e$d;
import erd.g;
import crd.b;
import brd.t;
import android.view.View;
import ekd.m1;
import io.reactivex.subjects.PublishSubject;

public final class e extends PresenterV2	// class@002ae4
{
    public PublishSubject p;
    public PublishSubject q;
    public RefreshLayout r;
    public ScrollToTopCoordinatorLayout s;
    public AppBarLayout t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public final e$b y;
    public final AppBarLayout$c z;

    public void e(){
       super();
       this.y = new e$b(this);
       this.z = new e$a(this);
    }
    public static final ScrollToTopCoordinatorLayout P8(e p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("coordinatorLayout");
       }
       return p0;
    }
    public static final RefreshLayout R8(e p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("refreshLayout");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "7")) {
          return;
       }
       this.u = 0;
       this.v = 0;
       this.w = false;
       e ts = this.s;
       if (ts == null) {
          a.S("coordinatorLayout");
       }
       ts.setNestedScrollListener(this.y);
       ts = this.t;
       if (ts == null) {
          a.S("appBarLayout");
       }
       ts.c(this.z);
       ts = this.r;
       if (ts == null) {
          a.S("refreshLayout");
       }
       ts.setOnRefreshListener(new e$c(this));
       ts = this.q;
       if (ts == null) {
          a.S("refreshCompletePublishSubject");
       }
       this.X7(ts.subscribe(new e$d(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "8")) {
          return;
       }
       e ts = this.s;
       if (ts == null) {
          a.S("coordinatorLayout");
       }
       ts.setNestedScrollListener(null);
       ts = this.t;
       if (ts == null) {
          a.S("appBarLayout");
       }
       ts.o(this.z);
       ts = this.r;
       if (ts == null) {
          a.S("refreshLayout");
       }
       ts.setOnRefreshListener(null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "6")) {
          return;
       }
       View view = m1.f(p0, R.id.refresh_layout);
       a.o(view, "ViewBindUtils.bindWidget¡­iew, R.id.refresh_layout\)");
       this.r = view;
       view = m1.f(p0, R.id.coordinator_layout);
       a.o(view, "ViewBindUtils.bindWidget¡­ R.id.coordinator_layout\)");
       this.s = view;
       p0 = m1.f(p0, R.id.app_bar_layout);
       a.o(p0, "ViewBindUtils.bindWidget¡­iew, R.id.app_bar_layout\)");
       this.t = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       Object obj = this.r8("refresh_subject");
       a.o(obj, "inject\(PostToolBoxConst.ACCESS_ID_REFRESH_SUBJECT\)");
       this.p = obj;
       obj = this.r8("refresh_completed_subject");
       a.o(obj, "inject\(PostToolBoxConst.¡­EFRESH_COMPLETED_SUBJECT\)");
       this.q = obj;
       return;
    }
}
