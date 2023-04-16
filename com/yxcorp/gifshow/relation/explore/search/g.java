package com.yxcorp.gifshow.relation.explore.search.g;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.relation.explore.search.ExploreSearchResponse$a;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.relation.explore.search.e;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.relation.explore.search.f;
import mm8.a;

public final class g implements b	// class@00187c
{

    public void g(){
       super();
    }
    public void a(a p0,Object p1){
       User user = User.class;
       e uoe = new e(this, p1);
       try{
          p0.h(user, uoe);
          p0.h(ExploreSearchResponse$a.class, new f(this, p1));
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
