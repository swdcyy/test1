package abc.o;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.intimate.dialog.i;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import k2b.e0;
import cbc.b;
import java.util.Objects;
import com.yxcorp.gifshow.widget.banner.LoopBannerView$a;
import com.yxcorp.gifshow.widget.banner.LoopBannerView;
import android.view.ViewGroup;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import abc.p;

public class o extends m	// class@0000da
{
    public final i c;

    public void o(i p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       boolean b;
       e i;
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       o tc = this.c;
       if (tc.z != null) {
          tc.G();
       }else {
          b.j(tc.g, "BUILD");
          tc = this.c;
          Objects.requireNonNull(tc);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, tc, i.class, "10")) {
             tc.B.setListener(objArray);
             tc.u.setVisibility(4);
             b = false;
             tc.x = b;
             i = tc.i;
             b.k(tc.g, b, i.mCanRebuild, i.mTargetId);
             e b1 = tc.b;
             IntimateRelationDialogParams mTitle = (!TextUtils.x(tc.i.mTitle))? tc.i.mTitle: a1.p(R.string.arg_RES_7f104611);
             tc.o(b1, mTitle);
             tc.E(b);
             tc.k(tc.b, b);
             tc.v.setVisibility(b);
             if (!TextUtils.x(tc.i.mSubTitle)) {
                tc.n(tc.b, tc.i.mSubTitle);
             }
             tc.i(tc.b, new p(tc));
          }
       }
       return;
    }
}
