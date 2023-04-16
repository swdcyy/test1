package com.kuaishou.live.core.show.subscribe.model.LiveSubscribePendantInfo$LiveSubscribePendantDetail;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Arrays;

public class LiveSubscribePendantInfo$LiveSubscribePendantDetail implements Serializable	// class@001138
{
    public String mAuthorId;
    public CDNUrl[] mBackgroundUrl;
    public CDNUrl[] mButtonIcon;
    public boolean mDisableCancel;
    public String mDisplayDate;
    public String mDisplayDay;
    public String mDisplayReservedUserCount;
    public String mDisplayReservedUserCountSuffix;
    public String mDisplayTime;
    public int mReservationActivityType;
    public String mReservationId;
    public long mReservedUserCount;
    public static final long serialVersionUID = 0x511eeb8bcb241739;

    public void LiveSubscribePendantInfo$LiveSubscribePendantDetail(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveSubscribePendantInfo$LiveSubscribePendantDetail.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveSubscribePendantDetail{mReservationId=\'"+this.mReservationId+'''+", mDisplayTime=\'"+this.mDisplayTime+'''+", mDisplayDay=\'"+this.mDisplayDay+'''+", mReservedUserCount="+this.mReservedUserCount+", mDisplayReservedUserCount=\'"+this.mDisplayReservedUserCount+'''+", mDisplayReservedUserCountSuffix=\'"+this.mDisplayReservedUserCountSuffix+'''+", mDisplayDate=\'"+this.mDisplayDate+'''+", mReservationActivityType=\'"+this.mReservationActivityType+'''+", mButtonIcon=\'"+Arrays.toString(this.mButtonIcon)+'''+", mBackgroundUrl=\'"+Arrays.toString(this.mBackgroundUrl)+'''+", mDisableCancel="+this.mDisableCancel+", mAuthorId=\'"+this.mAuthorId+'''+'}';
    }
}
