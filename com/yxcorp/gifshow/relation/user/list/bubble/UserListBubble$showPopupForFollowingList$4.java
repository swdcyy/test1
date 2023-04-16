package com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFollowingList$4;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.view.View;
import dcc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import dcc.f;

public final class UserListBubble$showPopupForFollowingList$4 extends Lambda implements l	// class@001a29
{
    public static final UserListBubble$showPopupForFollowingList$4 INSTANCE;

    static {
       UserListBubble$showPopupForFollowingList$4.INSTANCE = new UserListBubble$showPopupForFollowingList$4();
    }
    public void UserListBubble$showPopupForFollowingList$4(){
       super(1);
    }
    public final c invoke(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserListBubble$showPopupForFollowingList$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new f(p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
