package com.kuaishou.commercial.loggersdk.AdReceivedSuccessManager$ReceiveConfig;
import java.io.Serializable;
import com.kuaishou.commercial.loggersdk.AdReceivedSuccessManager$ReceiveConfig$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.commercial.loggersdk.AdReceivedSuccessManager$ReportAdTypeInfo;
import com.kuaishou.commercial.loggersdk.AdReceivedSuccessManager$ReportInfo;

public final class AdReceivedSuccessManager$ReceiveConfig implements Serializable	// class@001504
{
    public AdReceivedSuccessManager$ReportAdTypeInfo mAdTypeRule;
    public AdReceivedSuccessManager$ReportInfo mCreativeIdRule;
    public final boolean mEnableReport;
    public final float mGeneralRatio;
    public static final AdReceivedSuccessManager$ReceiveConfig$a Companion;
    public static final long serialVersionUID;

    static {
       AdReceivedSuccessManager$ReceiveConfig.Companion = new AdReceivedSuccessManager$ReceiveConfig$a(null);
    }
    public void AdReceivedSuccessManager$ReceiveConfig(){
       super();
    }
    public final AdReceivedSuccessManager$ReportAdTypeInfo getMAdTypeRule(){
       return this.mAdTypeRule;
    }
    public final AdReceivedSuccessManager$ReportInfo getMCreativeIdRule(){
       return this.mCreativeIdRule;
    }
    public final boolean getMEnableReport(){
       return this.mEnableReport;
    }
    public final float getMGeneralRatio(){
       return this.mGeneralRatio;
    }
    public final void setMAdTypeRule(AdReceivedSuccessManager$ReportAdTypeInfo p0){
       this.mAdTypeRule = p0;
    }
    public final void setMCreativeIdRule(AdReceivedSuccessManager$ReportInfo p0){
       this.mCreativeIdRule = p0;
    }
}
