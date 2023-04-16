package com.yxcorp.gifshow.follow.common.model.q;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.follow.common.model.s;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import java.lang.Object;
import jv5.a;

public class q extends Accessor	// class@00107f
{
    public final FollowingUserBannerFeed$UserBannerInfo c;
    public final s d;

    public void q(s p0,FollowingUserBannerFeed$UserBannerInfo p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mExtraModel;
    }
    public void set(Object p0){
       this.c.mExtraModel = p0;
    }
}
