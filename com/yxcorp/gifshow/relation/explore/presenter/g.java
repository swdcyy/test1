package com.yxcorp.gifshow.relation.explore.presenter.g;
import erd.g;
import com.yxcorp.gifshow.relation.explore.presenter.j;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.util.Objects;
import zbc.d;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import com.kwai.framework.model.user.User$FollowStatus;
import hac.e0;
import android.content.Context;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import ou7.h$b;
import ou7.h;

public final class g implements g	// class@001825
{
    public final j b;
    public final GifshowActivity c;

    public void g(j p0,GifshowActivity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       g tb = this.b;
       g tc = this.c;
       User user = p0;
       Objects.requireNonNull(tb);
       if (user) {
          p0 = tb.x;
          if (p0 != null) {
             p0.a(user);
          }
          if (tb.B != null) {
             tb.W8(tb.u);
          }else {
             tb.V8(tb.u);
          }
          if (tb.B == null && tb.getActivity() != null) {
             String str = tb.getActivity().getString(R.string.arg_RES_7f1002fc);
             if (user.getFollowStatus() == User$FollowStatus.FOLLOWING) {
                h.c(tc, user, str, tb.u.mContactName, null, new e0(user));
             }
          }
       }
    label_004c :
       return;
    }
}
