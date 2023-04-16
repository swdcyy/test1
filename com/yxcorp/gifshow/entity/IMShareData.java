package com.yxcorp.gifshow.entity.IMShareData;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;

public class IMShareData implements Serializable	// class@000d65
{
    public String mActionUri;
    public String mCommentText;
    public BaseFeed mFeed;
    public LinkInfo mLinkInfo;
    public MultiImageLinkInfo mMultiImageLinkInfo;
    public int mPlatformData2InfoType;
    public String mShareId;
    public int mShowFriendList;
    public Boolean mUseParamAction;
    public User mUser;
    public static final long serialVersionUID = 0xe907c58170d73ae8;

    public void IMShareData(){
       super();
       this.mShowFriendList = 0;
       this.mUseParamAction = Boolean.FALSE;
    }
    public String getId(){
       IMShareData obj = PatchProxy.apply(null, this, IMShareData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mFeed;
       if (obj != null) {
          return obj.getId();
       }
       obj = this.mUser;
       if (obj != null) {
          return obj.mId;
       }
       return null;
    }
}
