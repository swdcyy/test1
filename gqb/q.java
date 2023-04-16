package gqb.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.Objects;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;
import ekd.m1;

public final class q extends PresenterV2	// class@002b8a
{
    public View p;

    public void q(){
       super();
    }
    public void E8(){
       q oq = q.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oq, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oq, "6")) {
          Context context = this.getContext();
          if (context != null) {
             objArray = Integer.valueOf(n.A(context));
          }
          oq = this.p;
          if (oq == null) {
             a.S("mContentContainer");
          }
          ViewGroup$LayoutParams layoutParams = oq.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
          int i = (objArray != null)? objArray.intValue(): 0;
          layoutParams.topMargin = i + a1.e(80.00f);
          q tp = this.p;
          if (tp == null) {
             a.S("mContentContainer");
          }
          tp.setLayoutParams(layoutParams);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "4")) {
          return;
       }
       p0 = m1.f(p0, R.id.music_radio_content_container);
       a.o(p0, "ViewBindUtils.bindWidget¡­_radio_content_container\)");
       this.p = p0;
       return;
    }
    public void j8(){
       PatchProxy.applyVoid(null, this, q.class, "3");
    }
}
