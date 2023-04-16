package jc1.a;
import java.lang.Object;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.facebook.drawee.generic.RoundingParams;
import lnc.a1;
import android.widget.ImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.widget.TextView;

public final class a	// class@002b31
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final void a(boolean p0,KwaiImageView p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, null, uoa, "2")) {
          return;
       }
       a.p(p1, "iconView");
       RoundingParams roundingPara = new RoundingParams();
       if (p0) {
          roundingPara.q(false);
          roundingPara.n((float)a1.d(R.dimen.arg_RES_7f0705dd));
          p1.setPadding(a1.d(R.dimen.arg_RES_7f0705de), a1.d(R.dimen.arg_RES_7f0705de), a1.d(R.dimen.arg_RES_7f0705de), a1.d(R.dimen.arg_RES_7f0705de));
       }else {
          roundingPara.q(true);
       }
       a hierarchy = p1.getHierarchy();
       a.o(hierarchy, "iconView.hierarchy");
       hierarchy.L(roundingPara);
       return;
    }
    public static final void b(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "1")) {
          return;
       }
       a.p(p0, "textView");
       p0.setShadowLayer((float)a1.e(0x3f800000), (float)a1.e(0), (float)a1.e(0x3f800000), a1.a(R.color.arg_RES_7f060197));
       return;
    }
}
