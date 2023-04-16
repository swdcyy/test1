package d59.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import d59.s;
import android.view.View$OnClickListener;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import d59.t$a;
import erd.g;
import crd.b;
import brd.t;
import d59.t$b;
import android.view.View;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkFragment;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout;
import io.reactivex.subjects.PublishSubject;

public final class t extends PresenterV2	// class@00205c
{
    public AdtkFragment p;
    public AdtkHalfFrameLayout q;
    public PublishSubject r;
    public PublishSubject s;
    public PublishSubject t;
    public PathLoadingView u;
    public KwaiEmptyStateView v;

    public void t(){
       super();
    }
    public void E8(){
       t ot = t.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ot, "3")) {
          return;
       }
       String str = "mErrorEmptyView";
       if (!PatchProxy.applyVoid(objArray, this, ot, "4")) {
          ot = this.v;
          if (ot == null) {
             a.S(str);
          }
          ot.p(new s(this));
       }
       ot = this.v;
       if (ot == null) {
          a.S(str);
       }
       ot.q(2);
       ot = this.r;
       if (ot == null) {
          a.S("mTkPageHalfLoadingState");
       }
       this.X7(ot.subscribe(new t$a(this)));
       ot = this.s;
       if (ot == null) {
          a.S("mTkPageHalfEmptyState");
       }
       this.X7(ot.subscribe(new t$b(this)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       View view = p0.findViewById(R.id.adtk_loading_view);
       a.o(view, "rootView.findViewById\(R.id.adtk_loading_view\)");
       this.u = view;
       p0 = p0.findViewById(R.id.adtk_error_view);
       a.o(p0, "rootView.findViewById\(R.id.adtk_error_view\)");
       this.v = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t.class, "1")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       obj = this.q8(AdtkHalfFrameLayout.class);
       a.o(obj, "inject\(AdtkHalfFrameLayout::class.java\)");
       this.q = obj;
       obj = this.r8("TK_PAGE_HALF_LOADING_STATE");
       a.o(obj, "inject\(AccessIds.TK_PAGE_HALF_LOADING_STATE\)");
       this.r = obj;
       obj = this.r8("TK_PAGE_HALF_EMPTY_STATE");
       a.o(obj, "inject\(AccessIds.TK_PAGE_HALF_EMPTY_STATE\)");
       this.s = obj;
       obj = this.r8("TK_PAGE_HALF_EMPTY_RENDER_STATE");
       a.o(obj, "inject\(AccessIds.TK_PAGE_HALF_EMPTY_RENDER_STATE\)");
       this.t = obj;
       return;
    }
}
