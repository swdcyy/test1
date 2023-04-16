package com.yxcorp.gifshow.relation.util.h;
import ok.h;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import java.lang.String;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.User$FollowStatus;
import lnc.i3;

public final class h implements h	// class@001a5b
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final Object apply(Object p0){
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       userPackage.identity = TextUtils.k(p0.getId());
       User$FollowStatus fOLLOWING = User$FollowStatus.FOLLOWING;
       String str = (p0.getFollowStatus() == fOLLOWING && p0.mVisitorBeFollowed != null)? 1: null;
       i3 oi3 = i3.f();
       str = (str)? "bidirefollow": "return";
       oi3.d("BUTTON_TYPE", str);
       userPackage.params = oi3.e();
       userPackage.index = p0.mPosition + 1;
       p0 = (p0.getFollowStatus() == fOLLOWING)? "1": "0";
       userPackage.avatarStatus = p0;
       return userPackage;
    }
}
