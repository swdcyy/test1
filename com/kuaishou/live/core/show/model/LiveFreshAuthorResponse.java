package com.kuaishou.live.core.show.model.LiveFreshAuthorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveFreshAuthorResponse implements Serializable	// class@000d13
{
    public boolean mFreshAuthor;
    public boolean mIsAudienceEnterRoomNotify;
    public boolean mIsKoi;
    public int mResult;
    public static final long serialVersionUID = 0xd3c2e060c272f878;

    public void LiveFreshAuthorResponse(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveFreshAuthorResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveFreshAuthorResponse{mResult="+this.mResult+", mFreshAuthor="+this.mFreshAuthor+", mIsKoi="+this.mIsKoi+", mIsAudienceEnterRoomNotify="+this.mIsAudienceEnterRoomNotify+'}';
    }
}
