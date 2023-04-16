package com.yxcorp.gifshow.follow.common.model.p;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import zga.b;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.android.model.mix.ExtMeta;
import zga.c;
import com.kwai.framework.model.user.User;
import zga.d;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfoList;
import com.yxcorp.gifshow.follow.common.model.o;
import zga.e;
import mm8.a;

public final class p implements b	// class@00107e
{

    public void p(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(CommonMeta.class, new b(this, p1));
       p0.h(ExtMeta.class, new c(this, p1));
       p0.h(User.class, new d(this, p1));
       FollowingUserBannerFeed$UserBannerInfoList userBannerIn = FollowingUserBannerFeed$UserBannerInfoList.class;
       o oo = new o(this, p1);
       try{
          p0.h(userBannerIn, oo);
          p0.h(FollowingUserBannerFeed.class, new e(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
