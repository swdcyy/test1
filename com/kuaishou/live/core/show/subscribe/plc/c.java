package com.kuaishou.live.core.show.subscribe.plc.c;
import erd.g;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveSubscribeStatInfo;
import com.kuaishou.live.core.basic.model.LiveSubscribeStatInfo$LiveSubscribeStat;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.String;
import com.kwai.framework.model.user.UserInfo;
import e17.i;
import java.lang.IllegalStateException;

public final class c implements g	// class@00115c
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       if (TextUtils.x(p0.mLiveSubscribeStat.mSubscribeId)) {
          throw new IllegalStateException();
       }
       if (!TextUtils.n(QCurrentUser.me().getId(), p0.mLiveSubscribeStat.mUserInfo.mId)) {
          return;
       }
       i.a(R.style.arg_RES_7f11066a, 0x7f102bc0);
       throw new IllegalStateException();
    }
}
