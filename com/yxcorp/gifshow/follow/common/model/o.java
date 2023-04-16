package com.yxcorp.gifshow.follow.common.model.o;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.follow.common.model.p;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed;
import java.lang.Object;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfoList;

public class o extends Accessor	// class@00107d
{
    public final FollowingUserBannerFeed c;
    public final p d;

    public void o(p p0,FollowingUserBannerFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mUserBannerInfoList;
    }
    public void set(Object p0){
       this.c.mUserBannerInfoList = p0;
    }
}
