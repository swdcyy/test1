package com.yxcorp.gifshow.detail.model.response.CommentLimitResponse;
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

public class CommentLimitResponse implements CursorResponse, Serializable	// class@0015b8
{
    public String mCursor;
    public boolean mFutureFriendsVisible;
    public List mInfos;
    public int mSelectedcount;
    public int mTotalcount;
    public static final long serialVersionUID = 0x74eb2604696c13d3;

    public void CommentLimitResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mInfos;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, CommentLimitResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
