package hl2.p;
import erd.g;
import com.kuaishou.live.core.show.template.j$a;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import java.lang.Object;
import com.kuaishou.live.core.show.template.i;
import y41.i$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.live.core.show.template.j;
import t02.a0;
import java.lang.String;
import p91.m;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.core.basic.utils.e;
import y41.i;

public final class p implements g	// class@002dca
{
    public final j$a b;
    public final UserInfo c;

    public void p(j$a p0,UserInfo p1,FollowHelper$a p2){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       p0 = this.b;
       i$a uoa = new i$a(p0.a.getActivity(), p0.a.K.Z2.getLiveStreamId());
       uoa.o(UserInfo.convertToQUser(this.c));
       uoa.m(e.j(p0.a.K.c));
       uoa.n(112);
       uoa.r(false);
       uoa.e(i.a);
       uoa.a().c();
    }
}
