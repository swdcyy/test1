package d59.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d59.a$a;
import nsd.u;
import android.widget.FrameLayout;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMKPageConfig;
import android.app.Activity;
import android.view.View;
import ekd.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xf6.l;
import lnc.a1;
import android.content.Context;
import com.yxcorp.utility.n;
import d59.b;
import java.lang.Runnable;

public final class a extends PresenterV2	// class@002041
{
    public FrameLayout p;
    public View q;
    public AdMKPageConfig r;
    public static final a$a s;

    static {
       a.s = new a$a(null);
    }
    public void a(){
       super();
    }
    public static final FrameLayout P8(a p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mTkContentView");
       }
       return p0;
    }
    public void E8(){
       a obj;
       int b1;
       int i;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       boolean b = false;
       if (!PatchProxy.applyVoid(objArray, this, uoa, "5")) {
          obj = this.r;
          if (obj == null) {
             a.S("mAdMKPageConfig");
          }
          b1 = obj.d();
          Activity activity1 = this.getActivity();
          if (activity1 != null) {
             if (b1 == 4) {
                obj = this.q;
                if (obj == null) {
                   a.S("mTitleRootView");
                }
                obj.setVisibility(8);
                i.i(activity1, b, b, true);
             }else {
                i.i(activity1, -1, true, b);
             }
          }
       }
       obj = PatchProxy.apply(objArray, this, uoa, "4");
       b1 = (obj != PatchProxyResult.class)? obj.booleanValue(): l.c("KEY_DISABLE_PAGE_SCALE", b);
       if (b1) {
          return;
       }else if(PatchProxy.applyVoid(objArray, this, uoa, "6")){
          Activity activity = this.getActivity();
          if (activity != null) {
             i = a1.e(375.00f);
             int i1 = n.z(activity);
             float f = ((float)i1 * 0x3f800000) / (float)i;
             a tp = this.p;
             if (tp == null) {
                a.S("mTkContentView");
             }
             tp.post(new b(f, i, i1, this));
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       View view = p0.findViewById(R.id.adtk_content_view);
       a.o(view, "rootView.findViewById\(R.id.adtk_content_view\)");
       this.p = view;
       p0 = p0.findViewById(R.id.title_root);
       a.o(p0, "rootView.findViewById\(R.id.title_root\)");
       this.q = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       Object obj = this.q8(AdMKPageConfig.class);
       a.o(obj, "inject\(AdMKPageConfig::class.java\)");
       this.r = obj;
       return;
    }
}
