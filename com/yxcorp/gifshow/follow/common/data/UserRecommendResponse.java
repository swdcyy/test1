package com.yxcorp.gifshow.follow.common.data.UserRecommendResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.Collections;
import java.lang.Boolean;
import la6.a;

public final class UserRecommendResponse implements CursorResponse	// class@00102e
{
    public String mCursor;
    public String mPrsid;
    public List mUsers;

    public void UserRecommendResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       UserRecommendResponse tmUsers;
       List obj = PatchProxy.apply(null, this, UserRecommendResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (q.f(this.mUsers))? Collections.emptyList(): this.mUsers;
       return obj;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, UserRecommendResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
