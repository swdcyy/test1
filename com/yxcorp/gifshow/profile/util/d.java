package com.yxcorp.gifshow.profile.util.d;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.profile.model.UserInfoResponse;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;

public final class d implements g	// class@0015d5
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void accept(Object p0){
       QCurrentUser.ME.startEdit().setBackground(p0.mProfileBgUrl).setBackgrounds(p0.mProfileBgUrls).commitChanges();
    }
}
