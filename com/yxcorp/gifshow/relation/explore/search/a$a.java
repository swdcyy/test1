package com.yxcorp.gifshow.relation.explore.search.a$a;
import com.yxcorp.gifshow.relation.explore.search.ExploreSearchResponse$a;
import java.lang.String;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;

public class a$a	// class@001873
{
    public String id;
    public Map params;
    public int pos;
    public int rank;
    public String type;

    public void a$a(ExploreSearchResponse$a p0,String p1,boolean p2){
       super();
       this.type = "USER";
       ExploreSearchResponse$a mUser = p0.mUser;
       this.id = mUser.mId;
       this.pos = mUser.mPosition + 1;
       this.rank = p0.mRank;
       ImmutableMap$b uob = ImmutableMap.builder().c("search_session_id", TextUtils.I(p1));
       if (p2 && p0.mUser.isFollowingOrFollowRequesting()) {
          uob.c("is_follow", Boolean.TRUE);
       }
       this.params = uob.a();
       return;
    }
}
