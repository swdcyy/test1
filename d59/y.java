package d59.y;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d59.y$a;
import nsd.u;
import java.lang.String;
import android.graphics.Color;
import ekd.r$a;
import d59.y$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import c59.n;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout;
import d59.z;
import android.view.View$OnClickListener;
import android.view.View;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkFragment;

public final class y extends PresenterV2	// class@002069
{
    public View p;
    public View q;
    public AdtkFragment r;
    public AdtkHalfFrameLayout s;
    public final int t;
    public final int u;
    public final r$a v;
    public final y$b w;
    public static final y$a x;

    static {
       y.x = new y$a(null);
    }
    public void y(){
       super();
       this.t = Color.parseColor("#00EFEFEF");
       this.u = Color.parseColor("#FFEFEFEF");
       this.v = r$a.a();
       this.w = new y$b(this);
    }
    public void E8(){
       y oy = y.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oy, "4")) {
          return;
       }
       y ts = this.s;
       if (ts == null) {
          a.S("mHalfContainerView");
       }
       ts.a(this.w);
       if (!PatchProxy.applyVoid(objArray, this, oy, "2")) {
          oy = this.q;
          if (oy == null) {
             a.S("mContainerCloseView");
          }
          oy.setOnClickListener(new z(this));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, y.class, "5")) {
          return;
       }
       y ts = this.s;
       if (ts == null) {
          a.S("mHalfContainerView");
       }
       ts.i(this.w);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       View view = p0.findViewById(R.id.adtk_shadow_placeholder);
       a.o(view, "rootView.findViewById\(R.бн.adtk_shadow_placeholder\)");
       this.p = view;
       p0 = p0.findViewById(R.id.adtk_container_close);
       a.o(p0, "rootView.findViewById\(R.id.adtk_container_close\)");
       this.q = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, y.class, "3")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.r = obj;
       obj = this.q8(AdtkHalfFrameLayout.class);
       a.o(obj, "inject\(AdtkHalfFrameLayout::class.java\)");
       this.s = obj;
       return;
    }
}
