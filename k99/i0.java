package k99.i0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k99.i0$a;
import nsd.u;
import im8.f;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import k99.i0$b;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;
import android.view.View;
import jl5.w;
import com.yxcorp.gifshow.widget.KwaiActionBar;

public final class i0 extends PresenterV2	// class@002b81
{
    public f p;
    public f q;
    public KwaiActionBar r;
    public static final i0$a s;

    static {
       i0.s = new i0$a(null);
    }
    public void i0(){
       super();
    }
    public static final f P8(i0 p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mRecyclerView");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "3")) {
          return;
       }
       i0 tr = this.r;
       if (tr == null) {
          a.S("mActionBar");
       }
       tr.setOnClickListener(new i0$b(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "2")) {
          return;
       }
       p0 = w.a(p0, R.id.title_root);
       a.o(p0, "ViewBindUtils.bindWidget¡­ootView, R.id.title_root\)");
       this.r = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "1")) {
          return;
       }
       f uof = this.x8("DETAIL_COMMENT_RECYCLER_VIEW");
       a.o(uof, "injectRef\(AccessIds.DETAIL_COMMENT_RECYCLER_VIEW\)");
       this.p = uof;
       uof = this.x8("DETAIL_ATLAS_SCROLL_DISTANCE");
       a.o(uof, "injectRef\(AccessIds.DETAIL_ATLAS_SCROLL_DISTANCE\)");
       this.q = uof;
       return;
    }
}
