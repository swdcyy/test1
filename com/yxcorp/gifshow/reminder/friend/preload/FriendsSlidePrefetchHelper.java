package com.yxcorp.gifshow.reminder.friend.preload.FriendsSlidePrefetchHelper;
import com.yxcorp.gifshow.reminder.friend.preload.FriendsSlidePrefetchHelper$mPageList$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import h0c.c;
import com.yxcorp.gifshow.reminder.friend.data.a;

public final class FriendsSlidePrefetchHelper	// class@001ac7
{
    public static final p a;
    public static final FriendsSlidePrefetchHelper b;

    static {
       FriendsSlidePrefetchHelper.b = new FriendsSlidePrefetchHelper();
       FriendsSlidePrefetchHelper.a = s.c(FriendsSlidePrefetchHelper$mPageList$2.INSTANCE);
    }
    public void FriendsSlidePrefetchHelper(){
       super();
    }
    public final t a(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FriendsSlidePrefetchHelper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "realObservable");
       return c.b("friends_slide", p0, true);
    }
    public final a b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FriendsSlidePrefetchHelper uFriendsSlid = FriendsSlidePrefetchHelper.class;
       Object obj = PatchProxy.apply(null, this, uFriendsSlid, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, uFriendsSlid, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = FriendsSlidePrefetchHelper.a.getValue();
       }
       return obj1;
    }
}
