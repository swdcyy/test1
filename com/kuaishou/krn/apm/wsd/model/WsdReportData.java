package com.kuaishou.krn.apm.wsd.model.WsdReportData;
import com.kuaishou.krn.log.model.KrnLogCommonParams;
import com.kuaishou.krn.apm.wsd.model.WsdReportData$a;
import nsd.u;
import lj0.c;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Long;

public final class WsdReportData extends KrnLogCommonParams	// class@000800
{
    public Long mCheckCost;
    public Boolean mEnableShotScreen;
    public Boolean mIsT2T3Completed;
    public Long mShotCancelReason;
    public Long mShotCost;
    public Boolean mShotVerifyIsWhite;
    public String mViewsInfos;
    public static final WsdReportData$a a;

    static {
       WsdReportData.a = new WsdReportData$a(null);
    }
    public void WsdReportData(c p0,String p1){
       super(p0, null);
       Boolean fALSE = Boolean.FALSE;
       this.mEnableShotScreen = fALSE;
       this.mShotVerifyIsWhite = fALSE;
       Long longx = Long.valueOf(0);
       this.mShotCost = longx;
       this.mShotCancelReason = longx;
       this.mCheckCost = longx;
       this.mViewsInfos = "";
       this.mIsT2T3Completed = fALSE;
    }
    public final Long h(){
       return this.mShotCancelReason;
    }
    public final void i(Long p0){
       this.mCheckCost = p0;
    }
    public final void j(Long p0){
       this.mShotCancelReason = p0;
    }
}
