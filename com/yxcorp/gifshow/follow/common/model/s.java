package com.yxcorp.gifshow.follow.common.model.s;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import jv5.a;
import com.yxcorp.gifshow.follow.common.model.q;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import com.yxcorp.gifshow.follow.common.model.r;
import mm8.a;

public final class s implements b	// class@001081
{

    public void s(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(a.class, new q(this, p1));
       if (p1.mExtraModel != null) {
          Accessors.d().b(p1.mExtraModel).a(p0, p1.mExtraModel);
       }
       try{
          p0.h(FollowingUserBannerFeed$UserBannerInfo.class, new r(this, p1));
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
