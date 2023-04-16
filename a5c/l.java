package a5c.l;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import im8.f;
import com.kwai.framework.model.user.UserProfile;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import u3c.d$b;
import com.kwai.framework.model.user.User;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import s1c.j1;
import java.util.Set;
import u3c.d;
import k2b.e0;
import com.yxcorp.gifshow.profile.util.o;
import lnc.a1;
import z5c.y1;
import k2b.h;
import lnc.i3;

public final class l extends m	// class@000084
{
    public final UserProfileFollowGuidePresenter c;

    public void l(UserProfileFollowGuidePresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       UserProfileFollowGuidePresenter q;
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       a.p(p0, "v");
       l tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       String str = "mBaseFragment";
       if (!PatchProxy.applyVoid(objArray, tc, UserProfileFollowGuidePresenter.class, "10")) {
          UserProfileFollowGuidePresenter t = tc.t;
          if (t == null) {
             a.S("mUserProfileRef");
          }
          UserProfile userProfile = t.get();
          if (userProfile != null) {
             Activity activity = tc.getActivity();
             if (!activity instanceof GifshowActivity) {
                activity = objArray;
             }
             if (activity != null) {
                UserProfileFollowGuidePresenter q1 = tc.q;
                if (q1 == null) {
                   a.S(str);
                }
                d$b uob = new d$b();
                uob.b(activity);
                UserProfileFollowGuidePresenter r = tc.r;
                if (r == null) {
                   a.S("mUser");
                }
                uob.h(r);
                r = tc.s;
                if (r == null) {
                   a.S("mParam");
                }
                uob.f(r);
                uob.d(true);
                uob.e(userProfile.isFriend);
                t = tc.u;
                if (t == null) {
                   a.S("mCallerContext");
                }
                uob.c(t.b);
                o.h(q1, uob.a());
                q = tc.y;
                if (q != null) {
                   q.setVisibility(8);
                }
             }
          }
       }
    label_008f :
       q = this.c.q;
       if (q == null) {
          a.S(str);
       }
       String str1 = a1.p(R.string.arg_RES_7f100f8f);
       if (!PatchProxy.applyVoidTwoRefs(q, str1, objArray, y1.class, "120")) {
          h oh = h.k("SHOW_FOLLOW_BOTTOM_GUIDE_BAR");
          i3 oi3 = i3.f();
          oi3.d("button_name", str1);
          oh.n(oi3.e());
          oh.i(q);
       }
       return;
    }
}
