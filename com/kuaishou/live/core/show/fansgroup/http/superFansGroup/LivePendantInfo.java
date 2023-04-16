package com.kuaishou.live.core.show.fansgroup.http.superFansGroup.LivePendantInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LivePendantInfo implements Serializable	// class@000b46
{
    public int mAvailableDrawCnt;
    public String mContent;
    public int mDrawChanceId;
    public int mDrawChanceSecond;
    public boolean mEnable;
    public long mNextFetchTimestampMs;
    public int mPrivilegeId;
    public int mWatchSecond;
    public static final long serialVersionUID = 0xae6559ac173c54db;

    public void LivePendantInfo(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LivePendantInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LivePendantInfo{mPrivilegeId="+this.mPrivilegeId+", mEnable="+this.mEnable+", mContent=\'"+this.mContent+'''+", mDrawChanceId="+this.mDrawChanceId+", mDrawChanceSecond="+this.mDrawChanceSecond+", mWatchSecond="+this.mWatchSecond+", mAvailableDrawCnt="+this.mAvailableDrawCnt+", mNextFetchTime="+this.mNextFetchTimestampMs+'}';
    }
}
