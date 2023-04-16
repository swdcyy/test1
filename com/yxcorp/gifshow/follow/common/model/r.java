package com.yxcorp.gifshow.follow.common.model.r;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.follow.common.model.s;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import java.lang.Object;

public class r extends Accessor	// class@001080
{
    public final FollowingUserBannerFeed$UserBannerInfo c;
    public final s d;

    public void r(s p0,FollowingUserBannerFeed$UserBannerInfo p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c;
    }
}
