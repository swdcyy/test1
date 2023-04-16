package com.yxcorp.gifshow.model.response.CommentResponse;
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

public class CommentResponse implements CursorResponse, Serializable	// class@001f29
{
    public int mCommentCount;
    public CommentExtraInfo mCommentExtraInfo;
    public List mComments;
    public String mCursor;
    public String mFeaturedCommentsTips;
    public List mFoldedCommentIds;
    public ForceInsertComments mForceInsertComments;
    public int mGodCommentCount;
    public List mHotComments;
    public String mHotCursor;
    public int mMaxRecommendComments;
    public List mSinkCommentIds;
    public Map mSubCommentMap;
    public List mSubComments;
    public static final long serialVersionUID = 0xcea4b3b02d768208;

    public void CommentResponse(){
       super();
       this.mMaxRecommendComments = 0;
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mComments;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, CommentResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
