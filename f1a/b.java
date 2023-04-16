package f1a.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f1a.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import az6.a;
import com.yxcorp.gifshow.detail.slideplay.b;
import qvb.i;
import java.util.Objects;
import f1a.c;
import android.view.View;
import qvb.q;
import qvb.a;
import qvb.d;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Runnable;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class b extends PresenterV2	// class@002271
{
    public c p;
    public View q;
    public PhotoDetailParam r;
    public Runnable s;
    public BaseFragment t;
    public final q u;

    public void b(){
       super();
       this.u = new b$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b tr = this.r;
       if (tr == null) {
          a.S("mPhotoDetailParam");
       }
       tr = b.e(tr.mSlidePlayId);
       if (tr != null) {
          a.o(tr, "SlidePlayDataFetcherImpl\x20\x02m.mSlidePlayId\) ?: return\x00");
          i oi = tr.M7();
          Objects.requireNonNull(oi, "null cannot be cast to non-null type com.yxcorp.gifshow.detail.history.HistoryPageList");
          this.p = oi;
          tr = this.q;
          if (tr != null) {
             tr.setVisibility(0);
          }
          tr = this.p;
          if (tr != null) {
             tr.h(this.u);
          }
          tr = this.p;
          if (tr != null) {
             tr.A1();
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b tp = this.p;
       if (tp != null) {
          tp.f(this.u);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       p0 = (p0 != null)? p0.findViewById(R.id.fragment_loading_progress): null;
       this.q = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       Object obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.r = obj;
       obj = this.r8("DETAIL_FLOW_END_LISTENER");
       a.o(obj, "inject\(AccessIds.DETAIL_FLOW_END_LISTENER\)");
       this.s = obj;
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.t = obj;
       return;
    }
}
