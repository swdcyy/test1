package com.kuaishou.live.core.show.vote.response.LiveAnchorVoteRecordResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class LiveAnchorVoteRecordResponse implements CursorResponse	// class@001249
{
    public String mCursor;
    public List mLiveAnchorVotes;
    public static final long serialVersionUID = 0x9ac6095507c83ab4;

    public void LiveAnchorVoteRecordResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mLiveAnchorVotes;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LiveAnchorVoteRecordResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
