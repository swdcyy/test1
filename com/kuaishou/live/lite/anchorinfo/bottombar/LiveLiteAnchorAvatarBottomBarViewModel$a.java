package com.kuaishou.live.lite.anchorinfo.bottombar.LiveLiteAnchorAvatarBottomBarViewModel$a;
import erd.g;
import com.kwai.framework.model.user.User;
import com.kuaishou.live.lite.anchorinfo.bottombar.LiveLiteAnchorAvatarBottomBarViewModel;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.Boolean;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;
import t83.a;
import androidx.lifecycle.MutableLiveData;

public final class LiveLiteAnchorAvatarBottomBarViewModel$a implements g	// class@001e46
{
    public final User b;
    public final LiveLiteAnchorAvatarBottomBarViewModel c;

    public void LiveLiteAnchorAvatarBottomBarViewModel$a(User p0,LiveLiteAnchorAvatarBottomBarViewModel p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       LiveLiteAnchorAvatarBottomBarViewModel a;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveLiteAnchorAvatarBottomBarViewModel$a.class, "1")) {
       }else {
          a.p(p0, "event");
          if (p0.d != null || !TextUtils.n(p0.b, this.b.getId())) {
             PatchProxy.onMethodExit(LiveLiteAnchorAvatarBottomBarViewModel$a.class, "1");
          }else {
             b.d0(LiveLiteLogTag.LITE_ANCHOR_AVATAR, "FollowUpdateEvent", "mIsFollowing", Boolean.valueOf(p0.c), "isFollowOperate", Boolean.valueOf(p0.g));
             if (p0.c != null) {
                f.m(this.b, User$FollowStatus.FOLLOWING);
             }else {
                f.m(this.b, User$FollowStatus.UNFOLLOW);
             }
             a = this.c.a;
             p0 = (p0.c != null)? new a(true, true): new a(false, false);
             a.setValue(p0);
             PatchProxy.onMethodExit(LiveLiteAnchorAvatarBottomBarViewModel$a.class, "1");
          }
       }
       return;
    }
}
