package d59.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkPageConfig;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import d59.p;
import android.view.View$OnClickListener;
import d59.q;
import d59.o;
import java.lang.Runnable;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkFragment;

public final class r extends PresenterV2	// class@002058
{
    public AdtkFragment p;
    public AdtkHalfFrameLayout q;
    public AdtkPageConfig r;
    public View s;
    public View t;

    public void r(){
       super();
    }
    public static final AdtkPageConfig P8(r p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mAdtkPageConfig");
       }
       return p0;
    }
    public static final View R8(r p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mContentBackgroundView");
       }
       return p0;
    }
    public static final AdtkHalfFrameLayout S8(r p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mHalfContainerView");
       }
       return p0;
    }
    public void E8(){
       r or = r.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, or, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, or, "4")) {
          r ts = this.s;
          if (ts == null) {
             a.S("mContentBackgroundView");
          }
          ts.setOnClickListener(p.b);
          this.m8().setOnClickListener(new q(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, or, "5")) {
          or = this.q;
          if (or == null) {
             a.S("mHalfContainerView");
          }
          or.post(new o(this));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       View view = p0.findViewById(R.id.adtk_background_view);
       a.o(view, "rootView.findViewById\(R.id.adtk_background_view\)");
       this.s = view;
       p0 = p0.findViewById(R.id.adtk_state_view);
       a.o(p0, "rootView.findViewById\(R.id.adtk_state_view\)");
       this.t = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       obj = this.q8(AdtkHalfFrameLayout.class);
       a.o(obj, "inject\(AdtkHalfFrameLayout::class.java\)");
       this.q = obj;
       obj = this.q8(AdtkPageConfig.class);
       a.o(obj, "inject\(AdtkPageConfig::class.java\)");
       this.r = obj;
       return;
    }
}
