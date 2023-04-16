package com.kuaishou.android.live.doublelist.danmaku.LiveCommentBulletsResponse;
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

public final class LiveCommentBulletsResponse implements CursorResponse, Serializable	// class@0007c4
{
    public List mComments;
    public String mCursor;
    public int mMaxContinuousRequestTimes;
    public long mMinRequestIntervalMillis;
    public static final long serialVersionUID = 0xfa3bb6964f855dc4;

    public void LiveCommentBulletsResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mComments;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LiveCommentBulletsResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
