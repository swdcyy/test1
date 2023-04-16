package com.kuaishou.tuna.plc.dynamic_container.logger.model.PlcDynamicPerformanceInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.tuna.plc.dynamic_container.logger.model.PlcDynamicPerformanceInfo$ExtraInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class PlcDynamicPerformanceInfo implements Serializable	// class@000feb
{
    public long mBizContainerCreateStartTimestamp;
    public long mBizContainerLoadFinishTimestamp;
    public long mContainerCreateStartTimestamp;
    public PlcDynamicPerformanceInfo$ExtraInfo mExtra;
    public long mHandleRouteFinishTimestamp;
    public long mHandleRouteStartTimestamp;
    public int mLoadStatus;
    public String mSessionId;
    public String mSourceUri;
    public String mUsingParams;
    public static final long serialVersionUID = 0xbeb6e13f72870a8d;

    public void PlcDynamicPerformanceInfo(){
       super();
       this.mExtra = new PlcDynamicPerformanceInfo$ExtraInfo();
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, PlcDynamicPerformanceInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(this.mSourceUri) && (!TextUtils.x(this.mUsingParams) && (!TextUtils.x(this.mSessionId) && (this.mHandleRouteStartTimestamp > 0 && (this.mHandleRouteFinishTimestamp > 0 && (this.mContainerCreateStartTimestamp > 0 && (this.mBizContainerCreateStartTimestamp > 0 && this.mBizContainerLoadFinishTimestamp > 0)))))))? true: false;
       return b;
    }
    public void setRNT1Cost(long p0){
       this.mExtra.mRnT1Cost = p0;
    }
    public void setRNT2Cost(long p0){
       this.mExtra.mRnT2Cost = p0;
    }
    public void setRNT3Cost(long p0){
       this.mExtra.mRnT3Cost = p0;
    }
}
