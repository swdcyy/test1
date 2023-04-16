package i6a.o$e;
import com.yxcorp.gifshow.widget.m;
import i6a.o;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i6a.k;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.framework.model.feed.BaseFeed;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Integer;
import k2b.e0;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import ekd.r0;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementV3Meta;
import xh7.b;
import qh7.b;
import qh7.a;
import e17.i;

public final class o$e extends m	// class@0027a4
{
    public final o c;

    public void o$e(o p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, o$e.class, "1")) {
          return;
       }
       BaseFeed baseFeed = o.P8(this.c).getBaseFeed();
       a.o(baseFeed, "mDetailParam.baseFeed");
       k.b.b(baseFeed, o.R8(this.c), "MORE_ADJUSTMENT", Integer.valueOf(2));
       if (r0.d(this.c.getActivity())) {
          o x = this.c.x;
          if (x == null) {
             a.S("mInterestMeta");
          }
          InterestManagementV3Meta mJumpButtonU = x.mJumpButtonUrl;
          if (mJumpButtonU != null) {
             Activity activity = this.c.getActivity();
             a.m(activity);
             b uob = b.j(activity, mJumpButtonU);
             a.b(uob, null);
          }
       }else {
          i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
       }
       PatchProxy.onMethodExit(o$e.class, "1");
       return;
    }
}
