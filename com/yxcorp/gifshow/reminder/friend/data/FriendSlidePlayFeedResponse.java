package com.yxcorp.gifshow.reminder.friend.data.FriendSlidePlayFeedResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class FriendSlidePlayFeedResponse implements CursorResponse, Serializable	// class@001a7e
{
    public String mCursor;
    public boolean mEnableShowGlobalRemovedDialog;
    public String mExtraInfo;
    public boolean mHasRemovedUser;
    public String mLlsid;
    public int mLocalRequestSource;
    public List mPhotos;
    public String mPrsid;
    public static final long serialVersionUID = 0x55b9518052080530;

    public void FriendSlidePlayFeedResponse(){
       super();
       this.mLocalRequestSource = 0;
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mPhotos;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, FriendSlidePlayFeedResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
