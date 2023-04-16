package com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFollowingList$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.model.user.User;
import dcc.b;
import android.view.View;
import dcc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import dcc.e;

public final class UserListBubble$showPopupForFollowingList$3 extends Lambda implements l	// class@001a28
{
    public final b $favoriteCallback;
    public final User $user;

    public void UserListBubble$showPopupForFollowingList$3(User p0,b p1){
       this.$user = p0;
       this.$favoriteCallback = p1;
       super(1);
    }
    public final c invoke(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserListBubble$showPopupForFollowingList$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new e(p0, this.$user, this.$favoriteCallback);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
