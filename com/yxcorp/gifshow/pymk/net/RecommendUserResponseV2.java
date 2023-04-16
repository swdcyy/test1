package com.yxcorp.gifshow.pymk.net.RecommendUserResponseV2;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kwai.framework.model.user.RecoUser;
import com.kwai.framework.model.user.User;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class RecommendUserResponseV2 implements CursorResponse, Serializable, a	// class@0016ce
{
    public List mAllUserList;
    public int mContactsFriendsCount;
    public boolean mContactsUploaded;
    public String mCursor;
    public List mFriendUserList;
    public String mFriendUserPrsid;
    public String mLlsid;
    public int mPortal;
    public String mPrsid;
    public String mTitle;
    public List mUserList;
    public String mUssid;
    public static final long serialVersionUID = 0x226072615df9a4da;

    public void RecommendUserResponseV2(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, RecommendUserResponseV2.class, "2")) {
          return;
       }
       this.mAllUserList = new ArrayList();
       int i = 0;
       if (!q.f(this.mFriendUserList)) {
          Iterator iterator = this.mFriendUserList.iterator();
          while (iterator.hasNext()) {
             RecoUser mUser = iterator.next().mUser;
             if (mUser != null) {
                mUser.mIsNewFriend = true;
                mUser.mPosition = i;
                i = i + 1;
             }
          }
       }
       if (!q.f(this.mUserList)) {
          this.mAllUserList.addAll(this.mUserList);
       }
       return;
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mAllUserList;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, RecommendUserResponseV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
