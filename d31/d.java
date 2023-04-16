package d31.d;
import erd.g;
import d31.e;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.util.Objects;
import com.kuaishou.live.core.basic.model.LiveAudienceTaskConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e31.h;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import x61.c;
import java.lang.Class;
import lp3.c;
import lp3.e;
import x32.a;
import s51.c;
import f31.b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class d implements g	// class@001eff
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       LiveTimeConsumingUserStatusResponse mUserTaskCon = p0.mUserTaskConfig;
       if (mUserTaskCon == null || TextUtils.x(mUserTaskCon.mTaskCenterUrl)) {
          b.Z(LiveLogTag.LIVE_TASK_CENTER, "taskConfig invalid");
       }else {
          h oh = new h(tb.getContext(), tb.K.a(c.class), tb.K.a(a.class), tb.K.a(c.class), mUserTaskCon, tb.N);
          tb.M = TextUtils.x(mUserTaskCon.mTaskCenterUrl);
       }
       return;
    }
}
