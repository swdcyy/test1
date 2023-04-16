package fva.v$e;
import android.view.View$OnClickListener;
import fva.v;
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

public final class v$e implements View$OnClickListener	// class@002a33
{
    public final v b;

    public void v$e(v p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$e.class, "1")) {
          return;
       }
       if (!TextUtils.x(v.R8(this.b).mHotBoardLinkUrl) && this.b.getActivity() != null) {
          Activity activity = this.b.getActivity();
          a.m(activity);
          a.b(b.j(activity, v.R8(this.b).mHotBoardLinkUrl), null);
       }
       k.a.a("OPEN_ALL", v.S8(this.b));
       return;
    }
}
