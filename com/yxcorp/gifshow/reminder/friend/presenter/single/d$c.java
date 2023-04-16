package com.yxcorp.gifshow.reminder.friend.presenter.single.d$c;
import erd.r;
import com.yxcorp.gifshow.reminder.friend.presenter.single.d;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.reminder.friend.presenter.single.FriendSlidePlayPageSelectPresenter$onBind$2$1;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import ydc.g;
import msd.a;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;

public final class d$c implements r	// class@001adc
{
    public final d b;

    public void d$c(d p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FriendSlidePlayPageSelectPresenter$onBind$2$1 obj = PatchProxy.applyOneRefs(p0, this, d$c.class, "1");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          p0 = this.b;
          obj = new FriendSlidePlayPageSelectPresenter$onBind$2$1(this);
          Objects.requireNonNull(p0);
          Object obj1 = PatchProxy.applyOneRefs(obj, p0, d.class, "6");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             p0 = p0.getActivity();
             if (!p0 instanceof GifshowActivity) {
                p0 = null;
             }
             Activity uActivity = p0;
             p0 = QCurrentUser.me();
             a.o(p0, "QCurrentUser.me\(\)");
             if (p0.isLogined() || uActivity == null) {
                b = true;
             }else {
                d.a(-1712118428).ne(uActivity, uActivity.getUrl(), "ThanosFriends", 171, "", null, null, null, new g(obj)).h();
                b = false;
             }
          }
       }
       return b;
    }
}
