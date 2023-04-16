package fva.x$b;
import android.view.View$OnClickListener;
import fva.x;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.hotspot.HotSpotModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;
import fva.k;
import k2b.e0;

public final class x$b implements View$OnClickListener	// class@002a39
{
    public final x b;

    public void x$b(x p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       k a;
       if (PatchProxy.applyVoidOneRefs(p0, this, x$b.class, "1")) {
          return;
       }
       if (!TextUtils.x(x.P8(this.b).mHotBoardLinkUrl) && this.b.getActivity() != null) {
          Activity activity = this.b.getActivity();
          a.m(activity);
          a.b(b.j(activity, x.P8(this.b).mHotBoardLinkUrl), null);
       }
       a = k.a;
       x r = this.b.r;
       if (r == null) {
          a.S("page");
       }
       a.a("OPEN_ALL", r);
       return;
    }
}
