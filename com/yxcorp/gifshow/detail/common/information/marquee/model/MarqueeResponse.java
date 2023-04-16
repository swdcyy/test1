package com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public final class MarqueeResponse implements CursorResponse, Serializable	// class@00142c
{
    public int mCommentCount;
    public String mCursor;
    public boolean mDisableLoop;
    public List mItems;
    public int mLikeCount;
    public static final long serialVersionUID = 0xd1ed354d9f5c7dce;

    public void MarqueeResponse(){
       super();
       this.mItems = Collections.emptyList();
       this.mLikeCount = -1;
       this.mCommentCount = -1;
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mItems;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, MarqueeResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
