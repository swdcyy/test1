package com.yxcorp.gifshow.reminder.friend.kcube.c;
import vn5.j;
import com.yxcorp.gifshow.reminder.friend.kcube.e;
import java.lang.Object;
import java.lang.Runnable;
import android.content.Context;
import zr6.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import java.lang.String;
import mdc.d;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;

public final class c implements j	// class@001aa5
{
    public final e a;

    public void c(e p0){
       this.a = p0;
    }
    public final boolean a(Runnable p0){
       boolean b;
       Context uContext = this.a.b();
       if (QCurrentUser.me().isLogined() || uContext == null) {
          b = false;
       }else {
          d.a(-1712118428).ne(uContext, uContext.getUrl(), "ThanosFriends", 171, "", null, null, null, new d(p0)).h();
          b = true;
       }
       return b;
    }
}
