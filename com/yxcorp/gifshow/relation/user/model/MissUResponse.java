package com.yxcorp.gifshow.relation.user.model.MissUResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.relation.user.model.MissUInfo;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$FollowStatus;
import java.lang.Boolean;
import la6.a;

public class MissUResponse implements CursorResponse, Serializable	// class@001a40
{
    public String mCursor;
    public List mMaterialList;
    public MissUResponse$MissUHeadInfo mMissUHeadInfo;
    public List mMissUInfos;
    public int mTotalCount;
    public static final long serialVersionUID = 0x5832e3a87fa5c975;

    public void MissUResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       Object obj = PatchProxy.apply(null, this, MissUResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getUsers();
    }
    public final List getUsers(){
       ArrayList obj = PatchProxy.apply(null, this, MissUResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.mMissUInfos.iterator();
       while (iterator.hasNext()) {
          MissUInfo missUInfo = iterator.next();
          User user = UserInfo.convertToQUser(missUInfo.mUserInfo);
          user.mMissURelation = missUInfo.mRelation;
          user.mMissUTime = missUInfo.mTimestamp;
          user.mMissURecoText = missUInfo.mRecoRelationText;
          user.mFollowStatus = User$FollowStatus.FOLLOWING;
          obj.add(user);
       }
       return obj;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, MissUResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
