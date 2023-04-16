package com.yxcorp.gifshow.follow.common.data.LiveCoverAnnexResponse;
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

public final class LiveCoverAnnexResponse implements CursorResponse, Serializable	// class@00101f
{
    public String mCursor;
    public List mLiveCoverAnnex;
    public int mMaxContinuousRequestTimes;
    public long mMinRequestIntervalMillis;
    public static final long serialVersionUID = 0x9287cafbcc007b3b;

    public void LiveCoverAnnexResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mLiveCoverAnnex;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LiveCoverAnnexResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
