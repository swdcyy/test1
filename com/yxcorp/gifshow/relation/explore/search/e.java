package com.yxcorp.gifshow.relation.explore.search.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.relation.explore.search.g;
import com.yxcorp.gifshow.relation.explore.search.ExploreSearchResponse$a;
import java.lang.Object;
import com.kwai.framework.model.user.User;

public class e extends Accessor	// class@00187a
{
    public final ExploreSearchResponse$a c;
    public final g d;

    public void e(g p0,ExploreSearchResponse$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mUser;
    }
    public void set(Object p0){
       this.c.mUser = p0;
    }
}
