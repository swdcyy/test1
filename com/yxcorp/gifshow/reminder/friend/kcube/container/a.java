package com.yxcorp.gifshow.reminder.friend.kcube.container.a;
import vn5.j;
import com.yxcorp.gifshow.reminder.friend.kcube.container.c;
import java.lang.Object;
import java.lang.Runnable;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.Context;
import zr6.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import ndc.h;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;

public final class a implements j	// class@001aad
{
    public final c a;

    public void a(c p0){
       this.a = p0;
    }
    public final boolean a(Runnable p0){
       boolean b;
       a ta = this.a;
       Objects.requireNonNull(ta);
       Object obj = PatchProxy.applyOneRefs(p0, ta, c.class, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          Context uContext = ta.b();
          if (QCurrentUser.me().isLogined() || uContext == null) {
             b = false;
          }else {
             d.a(-1712118428).ne(uContext, uContext.getUrl(), "ThanosFriends", 171, "", null, null, null, new h(p0)).h();
             b = true;
          }
       }
       return b;
    }
}
