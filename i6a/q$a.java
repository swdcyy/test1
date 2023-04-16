package i6a.q$a;
import com.yxcorp.gifshow.widget.m;
import i6a.q;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i6a.k;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import k2b.e0;
import java.lang.Integer;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import ekd.r0;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementFeed;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementMeta;
import xh7.b;
import qh7.b;
import qh7.a;
import e17.i;

public final class q$a extends m	// class@0027a9
{
    public final q c;

    public void q$a(q p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, q$a.class, "1")) {
          return;
       }
       k b = k.b;
       q v = this.c.v;
       if (v == null) {
          a.S("mDetailParam");
       }
       BaseFeed baseFeed = v.getBaseFeed();
       a.o(baseFeed, "mDetailParam.baseFeed");
       q w = this.c.w;
       if (w == null) {
          a.S("mFragment");
       }
       b.b(baseFeed, w, "MORE_ADJUSTMENT", null);
       if (r0.d(this.c.getActivity())) {
          q u = this.c.u;
          if (u == null) {
             a.S("mInterestFeed");
          }
          InterestManagementFeed mInterestMan = u.mInterestManagementMeta;
          if (mInterestMan != null) {
             InterestManagementMeta mJumpButtonU = mInterestMan.mJumpButtonUrl;
             if (mJumpButtonU != null) {
                Activity activity = this.c.getActivity();
                a.m(activity);
                a.b(b.j(activity, mJumpButtonU), null);
             }
          }
       }else {
          i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
       }
       PatchProxy.onMethodExit(q$a.class, "1");
       return;
    }
}
