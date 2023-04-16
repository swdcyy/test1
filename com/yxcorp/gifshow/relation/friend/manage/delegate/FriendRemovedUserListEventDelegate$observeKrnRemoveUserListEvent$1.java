package com.yxcorp.gifshow.relation.friend.manage.delegate.FriendRemovedUserListEventDelegate$observeKrnRemoveUserListEvent$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.relation.friend.manage.delegate.FriendRemovedUserListEventDelegate;
import com.kwai.framework.model.user.User;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import z1.a;
import rac.d;
import crd.c;

public final class FriendRemovedUserListEventDelegate$observeKrnRemoveUserListEvent$1 extends Lambda implements p	// class@0018b6
{
    public final FriendRemovedUserListEventDelegate this$0;

    public void FriendRemovedUserListEventDelegate$observeKrnRemoveUserListEvent$1(FriendRemovedUserListEventDelegate p0){
       this.this$0 = p0;
       super(2);
    }
    public final b invoke(User p0,boolean p1){
       b obj;
       FriendRemovedUserListEventDelegate a;
       b uob;
       if (PatchProxy.isSupport(FriendRemovedUserListEventDelegate$observeKrnRemoveUserListEvent$1.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, FriendRemovedUserListEventDelegate$observeKrnRemoveUserListEvent$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "user");
       a = this.this$0.a;
       obj = null;
       if (a != null) {
          ActivityContext uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          Activity uActivity = uActivityCon.e();
          if (uActivity != null) {
             if (uActivity instanceof GifshowActivity) {
                Activity uActivity1 = uActivity;
             }
             uActivity = obj;
             if (uActivity != null) {
                uob = a.b(uActivity, p0, null, (p1 ^ 0x01), true, true, true, null);
                if (uob != null) {
                label_0054 :
                   obj = uob;
                }
             }
          }
       label_0050 :
          uob = c.b();
          goto label_0054 ;
       }
       return obj;
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1.booleanValue());
    }
}
